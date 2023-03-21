package de.fraunhofer.ipa.roscode.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import ros.Node
import ros.Package
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import ros.impl.ParameterStructTypeImpl

class CustomOutputProvider implements IOutputConfigurationProvider {
    public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"


    override Set<OutputConfiguration> getOutputConfigurations() {
        var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
        default_config.setDescription("DEFAULT_OUTPUT");
        default_config.setOutputDirectory("./src-gen/");
        default_config.setOverrideExistingResources(true);
        default_config.setCreateOutputDirectory(true);
        default_config.setCleanUpDerivedResources(true);
        default_config.setSetDerivedProperty(true);
        return newHashSet(default_config)
    }
}

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RosCodeGenerator extends AbstractGenerator {


    String resourcepath
    Node node
    List<String> PkgsList
    Set<String> set
    ParameterGeneratorHelpers parameter_helper = new ParameterGeneratorHelpers() {

        override get_param_declaration_str(String param_type, String param_name, String delim, Boolean has_value) {
            var struct_str = "";
            struct_str += param_type + " " + param_name.replace(delim, "_") + "_;\n";
            struct_str += "n.param(\"" + param_name.replace(delim, "/") + "\", " + param_name.replace(delim, "_") + "_);\n\n";

            return struct_str;
        }

    };

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        resourcepath = resource.URI.toString();
        if (! resourcepath.contains("/ros-input")) {
            for (pkg : resource.allContents.toIterable.filter(Package)){
                fsa.generateFile(pkg.getName().toLowerCase+"/package.xml",pkg.compile_package_xml)
                fsa.generateFile(pkg.getName().toLowerCase+"/CMakeLists.txt",pkg.compile_CMakeLists)
                 for (art : pkg.artifact){
                    node = art.node
                    fsa.generateFile(pkg.getName().toLowerCase+"/src/"+node.name+".cpp",node.compile_node)

                    }
                 }
                }
        }

def compile_package_xml(Package pkg)'''
<?xml version="1.0"?>
<?xml-model
   href="http://download.ros.org/schema/package_format3.xsd"
   schematypens="http://www.w3.org/2001/XMLSchema"?>
<package format="3">
 <name>«pkg.name»</name>
 <version>0.0.0</version>
 <description>This package contains the implementation of the node «pkg.artifact.get(0).node.name»</description>
  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
  <author email="jane.doe@example.com">Jane Doe</author>
  <license>Apache 2.0</license>

  <buildtool_depend>catkin</buildtool_depend>

  <depend>boost</depend>
  <depend>roscpp</depend>
  «FOR depend_pkg:pkg.getPkgDependencies»
  <depend>«depend_pkg»</depend>
  «ENDFOR»

</package>
'''

def compile_CMakeLists(Package pkg)'''
cmake_minimum_required(VERSION 3.0.2)
project(«pkg.name»)

find_package(catkin REQUIRED COMPONENTS roscpp «FOR depend_pkg:pkg.getPkgDependencies»«depend_pkg» «ENDFOR»)

catkin_package(
  CATKIN_DEPENDS roscpp «FOR depend_pkg:pkg.getPkgDependencies»«depend_pkg» «ENDFOR»
)

### Build ###

include_directories(${catkin_INCLUDE_DIRS})

«FOR art:pkg.artifact»
add_executable(«art.name» src/«art.node.name».cpp)
add_dependencies(«art.name» ${catkin_EXPORTED_TARGETS})
target_link_libraries(«art.name» ${catkin_LIBRARIES})

«ENDFOR»
### Install ###
install(TARGETS «FOR art:pkg.artifact»«art.name»«ENDFOR»
  ARCHIVE DESTINATION ${CATKIN_PACKAGE_LIB_DESTINATION}
  LIBRARY DESTINATION ${CATKIN_PACKAGE_LIB_DESTINATION}
  RUNTIME DESTINATION ${CATKIN_PACKAGE_BIN_DESTINATION}
)
'''

def compile_node(Node node) '''
#include <ros/ros.h>
            «FOR pub : node.publisher»
#include <«pub.message.package.name»/«pub.message.name».h>
            «ENDFOR»
            «FOR sub : node.subscriber»
#include <«sub.message.package.name»/«sub.message.name».h>
            «ENDFOR»
            «FOR srvserver : node.serviceserver»
#include <«srvserver.service.package.name»/«srvserver.service.name».h>
            «ENDFOR»
            «FOR srvclient : node.serviceclient»
#include <«srvclient.service.package.name»/«srvclient.service.name».h>
            «ENDFOR»

            «FOR srvserver : node.serviceserver»
bool  «srvserver.name»_cb («srvserver.service.package.name»::«srvserver.service.name»::Request &req, «srvserver.service.package.name»::«srvserver.service.name»::Response &res){
  return true;
}
            «ENDFOR»
            «FOR sub : node.subscriber»
void  «sub.name»_cb (const «sub.message.package.name»::«sub.message.name» msg){}
            «ENDFOR»


int main(int argc, char **argv)
{
    ros::init(argc, argv, "«node.name»");
    ros::NodeHandle n;
    «FOR param : node.parameter»
    «IF (param.type instanceof ParameterStructTypeImpl)»
    «parameter_helper.compile_struct(param.type as ParameterStructTypeImpl, param.name).getKey()»
    «ELSE»
    «var param_pair = parameter_helper.get_param_type(param.type)»
    «IF !(param_pair.getKey().empty)»
    «param_pair.getKey()» «param.name»_;
    n.param«IF!(param_pair.getValue().empty)»<«param_pair.getKey()»>«ENDIF»("«param.name»", «param.name»_«param_pair.getValue()»);
    «ENDIF»
    «ENDIF»
«ENDFOR»
«FOR pub : node.publisher»
«pub.compile»
«ENDFOR»
«FOR sub : node.subscriber»
«sub.compile»
«ENDFOR»
«FOR srvserver : node.serviceserver»
«srvserver.compile»
«ENDFOR»
«FOR srvclient : node.serviceclient»
«srvclient.compile»
«ENDFOR»

    ros::spin();

    return 0;
}
            '''

def compile(Publisher pub)
''' ros::Publisher «pub.name»_pub = n.advertise<«pub.message.package.name»::«pub.message.name»>("«pub.name»", 10);'''
def compile(Subscriber sub)
''' ros::Subscriber «sub.name» = n.subscribe("«sub.name»", 10, «sub.name»_cb);'''
def compile(ServiceServer srvserver)
''' ros::ServiceServer «srvserver.name» = n.advertiseService("«srvserver.name»", «srvserver.name»_cb);'''
def compile(ServiceClient srvclient)
''' ros::ServiceClient «srvclient.name» = n.serviceClient<«srvclient.service.package.name»::«srvclient.service.name»>("«srvclient.name»");'''


 def List<String> getPkgDependencies(Package pkg){
    set=new HashSet<String>()
    PkgsList = new ArrayList()
    for (art:pkg.artifact){
        node=art.node
        for (pub:node.publisher){set.add(pub.message.package.name)}
        for (sub:node.subscriber){set.add(sub.message.package.name)}
        for (srvserver:node.serviceserver){set.add(srvserver.service.package.name)}
        for (srvclient:node.serviceclient){set.add(srvclient.service.package.name)}
    }
    PkgsList.addAll(set)
    return PkgsList
 }

}
