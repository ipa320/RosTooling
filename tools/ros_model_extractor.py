#!/usr/bin/env python
#
# Copyright 2019 Fraunhofer Institute for Manufacturing Engineering and Automation (IPA)
#
# Nadia Hammoudeh Garcia
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#	http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import os
import argparse
import rospkg
from haros.extractor import NodeExtractor
from haros.metamodel import Node, Package, RosName, SourceFile
from haros.cmake_parser import RosCMakeParser
from bonsai.analysis import CodeQuery
try:
    from bonsai.cpp.clang_parser import CppAstParser
except ImportError:
    CppAstParser = None


class RosExtractor():
  def launch(self):
    self.parse_arg()
    if self.args.node:
        #FIND WORKSPACE: 
        #Fixme: the env variable ROS_PACKAGE_PATH is not the best way to extract the workspace path
        ros_pkg_path = os.environ.get("ROS_PACKAGE_PATH")
        ws = ros_pkg_path[:ros_pkg_path.find("/src:")]
        #FIND PACKAGE PATH
        pkg = Package(self.args.package_name)
        rospack = rospkg.RosPack()
        pkg.path = rospack.get_path(self.args.package_name)

        #BONSAI PARSER
        parser = CppAstParser(workspace = ws)
        parser.set_library_path("/usr/lib/llvm-3.8/lib")
        parser.set_standard_includes("/usr/lib/llvm-3.8/lib/clang/3.8.0/include")
        db_dir = os.path.join(ws, "build")
        if os.path.isfile(os.path.join(db_dir, "compile_commands.json")):
            parser.set_database(db_dir)
        #HAROS NODE EXTRACTOR
        analysis = NodeExtractor(pkg, env=dict(os.environ), ws=ws ,node_cache=False, parse_nodes=True)
        node = Node(self.args.name, pkg, rosname=RosName(self.args.name))
        srcdir = pkg.path[len(ws):]
        srcdir = os.path.join(ws, srcdir.split(os.sep, 1)[0])
        bindir = os.path.join(ws, "build")
        #HAROS CMAKE PARSER
        parser = RosCMakeParser(srcdir, bindir, pkgs = [pkg])
        parser.parse(os.path.join(pkg.path, "CMakeLists.txt"))
        for target in parser.executables.itervalues():
            if target.output_name == self.args.name:
                for file_in in target.files:
                    full_path = file_in
                    relative_path = full_path.replace(pkg.path+"/","").rpartition("/")[0]
                    file_name = full_path.rsplit('/', 1)[-1]
                    source_file = SourceFile(file_name, relative_path , pkg)
                    node.source_files.append(source_file)
        parser = CppAstParser(workspace = ws)
        node.source_tree = parser.global_scope
        model_str = ""
        for sf in node.source_files:
            if parser.parse(sf.path) is None:
                print "File not found"
            else:
                # ROS MODEL EXTRACT PRIMITIVES
                rosmodel = ros_model(self.args.package_name, self.args.name, self.args.name)
                self.extract_primitives(node, parser.global_scope, analysis, rosmodel)
                # SAVE ROS MODEL
                model_str = rosmodel.save_model()
        if self.args.output:
            print model_str
        else:
            text_file = open(self.args.name+".ros", "w")
            text_file.write(model_str)
            text_file.close()


  def extract_primitives(self, node, gs, analysis, rosmodel):
        for call in (CodeQuery(gs).all_calls.where_name("advertise").where_result("ros::Publisher").get()):
            name = analysis._extract_topic(call)
            msg_type = analysis._extract_message_type(call)
            queue_size = analysis._extract_queue_size(call)
            pub = publisher(name, msg_type)
            rosmodel.pubs.append(pub)
        for call in (CodeQuery(gs).all_calls.where_name("subscribe").where_result("ros::Subscriber").get()):
            name = analysis._extract_topic(call)
            msg_type = analysis._extract_message_type(call)
            queue_size = analysis._extract_queue_size(call)
            sub = subscriber(name, msg_type)
            rosmodel.subs.append(sub)
        for call in (CodeQuery(gs).all_calls.where_name("advertiseService").where_result("ros::ServiceServer").get()):
            name = analysis._extract_topic(call)
            srv_type = analysis._extract_message_type(call)
            srv_server = service_server(name, srv_type)
            rosmodel.srvsrvs.append(srv_server)
        for call in (CodeQuery(gs).all_calls.where_name("serviceClient").where_result("ros::ServiceClient").get()):
            name = analysis._extract_topic(call)
            srv_type = analysis._extract_message_type(call)
            srv_client = service_client(name, srv_type)
            rosmodel.srvcls.append(srv_client)
  def parse_arg(self):
    parser = argparse.ArgumentParser()
    mutually_exclusive = parser.add_mutually_exclusive_group()
    mutually_exclusive.add_argument('--node', '-n', help="node analyse", action='store_true')
    mutually_exclusive.add_argument('--launch', '-l', help="launch analyse", action='store_true')
    parser.add_argument('--output', help='print the model output')
    parser.add_argument('--package', required=True, dest='package_name')
    parser.add_argument('--name', required=True, dest='name')
    self.args = parser.parse_args()

class ros_model:
  def __init__(self, pkg_name, name, node_name):
    self.package = pkg_name
    self.artifact = name
    self.node = node_name
    self.pubs = []
    self.subs = []
    self.srvsrvs = []
    self.srvcls = []
  def save_model(self):
    model_str = "PackageSet { package { \n"
    model_str = model_str+"  CatkinPackage "+self.package+" { "
    model_str = model_str+"artifact {\n    Artifact "+self.artifact+" {\n"
    model_str = model_str+"      node Node { name "+ self.node+"\n"
    if len(self.srvsrvs) > 0:
        model_str = model_str+"        serviceserver {\n"
        count = len(self.srvsrvs)
        for srv in self.srvsrvs:
            model_str = model_str+"          ServiceServer { name '"+srv.name+"' service '"+srv.srv_type+"'}"
            count = count -1
            if count > 0:
                model_str = model_str+",\n"
            else:
                model_str = model_str+"}\n"
    if len(self.pubs) > 0:
        model_str = model_str+"        publisher {\n"
        count = len(self.pubs)
        for pub in self.pubs:
            model_str = model_str+"          Publisher { name '"+pub.name+"' message '"+pub.msg_type+"'}"
            count = count -1
            if count > 0:
                model_str = model_str+",\n"
            else:
                model_str = model_str+"}\n"
    if len(self.subs) > 0:
        model_str = model_str+"        subscriber {\n"
        count = len(self.subs)
        for sub in self.subs:
            model_str = model_str+"          Subscriber { name '"+sub.name+"' message '"+sub.msg_type+"'}"
            count = count -1
            if count > 0:
                model_str = model_str+",\n"
            else:
                model_str = model_str+"}\n"
    if len(self.srvcls) > 0:
        model_str = model_str+"        serviceclient {\n"
        count = len(self.srvcls)
        for srv in self.srvcls:
            model_str = model_str+"          ServiceClient { name '"+srv.name+"' service '"+srv.srv_type+"'}"
            count = count -1
            if count > 0:
                model_str = model_str+",\n"
            else:
                model_str = model_str+"}\n"
    model_str = model_str + "}}}}}}"
    return model_str

class publisher:
  def __init__(self, name, msg_type):
    self.name = name
    self.msg_type = msg_type.replace("/",".")

class subscriber:
  def __init__(self, name, msg_type):
    self.name = name
    self.msg_type = msg_type.replace("/",".")

class service_server:
  def __init__(self, name, srv_type):
    self.name = name
    self.srv_type = srv_type.replace("/",".")

class service_client:
  def __init__(self, name, srv_type):
    self.name = name
    self.srv_type = srv_type.replace("/",".")


def main(argv = None):
    extractor = RosExtractor()
    if extractor.launch():
        return 0
    return 1

if __name__== "__main__":
  main()
