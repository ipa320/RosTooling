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

from haros.analysis_manager import AnalysisManager
from haros.extractor import NodeExtractor
from haros.metamodel import Node, Package, RosName, Project

from bonsai.model import CodeGlobalScope, pretty_str
try:
    from bonsai.cpp.clang_parser import CppAstParser
except ImportError:
    CppAstParser = None
import os
import argparse


class RosExtractor():

  def launch(self):
    self.parse_arg()
    if self.args.node:
        ws = '/home/nhg/haros/catkin_ws'
        analysis = NodeExtractor(self.args.package_name, env=dict(os.environ), ws=ws ,node_cache=False, parse_nodes=True);
        node = Node(self.args.name, Package(self.args.package_name), rosname=RosName(self.args.name))
        CppAstParser.set_library_path()
        parser = CppAstParser(workspace = ws)
        node.source_tree = parser.global_scope
        analysis._roscpp_analysis(node)
        analysis._query_comm_primitives(node,parser.global_scope)
    

  def parse_arg(self):
    parser = argparse.ArgumentParser()
    mutually_exclusive = parser.add_mutually_exclusive_group()
    mutually_exclusive.add_argument('--node', '-n', help="node analyse", action='store_true')
    mutually_exclusive.add_argument('--launch', '-l', help="launch analyse", action='store_true')
    parser.add_argument('--package', required=True, dest='package_name')
    parser.add_argument('--name', required=True, dest='name')
    self.args = parser.parse_args()


def main(argv = None):
    extractor = RosExtractor()
    if extractor.launch():
        return 0
    return 1


if __name__== "__main__":
  main()
