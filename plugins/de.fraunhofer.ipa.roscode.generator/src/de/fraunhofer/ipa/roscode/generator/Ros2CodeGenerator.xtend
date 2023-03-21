package de.fraunhofer.ipa.roscode.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ros.Node
import ros.Package
import ros.impl.ParameterStructTypeImpl

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Ros2CodeGenerator extends AbstractGenerator {

    String resourcepath
    String import_msgs
    int char_i
    Node node
    List<String> PkgsList
    Set<String> set
    ParameterGeneratorHelpers parameter_helper = new ParameterGeneratorHelpers() {

        override get_param_declaration_str(String param_type, String param_name, String delim, Boolean has_value) {
            var struct_str = "";
            struct_str += "this->declare_parameter";
            if (has_value) {
                struct_str += "<" + param_type + ">";
            }
            struct_str += "(\"" + param_name + "\");\n";
            struct_str += "this->get_parameter(\"" + param_name + "\", " + param_name.replace(delim, "_") + "_);\n\n";

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

  <buildtool_depend>ament_cmake</buildtool_depend>

  <depend>boost</depend>
  <depend>rclcpp</depend>
  «FOR depend_pkg:pkg.getPkgDependencies»
  <depend>«depend_pkg»</depend>
  «ENDFOR»

  <test_depend>ament_lint_auto</test_depend>
  <test_depend>ament_lint_common</test_depend>

  <export>
    <build_type>ament_cmake</build_type>
  </export>
</package>
'''

def compile_CMakeLists(Package pkg)'''
cmake_minimum_required(VERSION 3.5)
project(«pkg.name»)

# Default to C++14
if(NOT CMAKE_CXX_STANDARD)
  set(CMAKE_CXX_STANDARD 14)
endif()

if(CMAKE_COMPILER_IS_GNUCXX OR CMAKE_CXX_COMPILER_ID MATCHES "Clang")
  add_compile_options(-Wall -Wextra -Wpedantic)
endif()

find_package(ament_cmake REQUIRED)
find_package(Boost REQUIRED)
find_package(rclcpp REQUIRED)
  «FOR depend_pkg:pkg.getPkgDependencies»
find_package(«depend_pkg» REQUIRED)
  «ENDFOR»

«FOR art:pkg.artifact»
add_executable(«art.name» src/«art.node.name».cpp)
ament_target_dependencies(«art.name» rclcpp «FOR depend_pkg:pkg.getPkgDependencies»«depend_pkg» «ENDFOR»)

install(TARGETS
  «art.name»
  DESTINATION lib/${PROJECT_NAME})
«ENDFOR»

ament_package()
'''

def compile_node(Node node) '''
#include <chrono>
#include <cstdio>
#include <memory>
#include <string>
#include <utility>

#include "rclcpp/rclcpp.hpp"
#include "rcutils/cmdline_parser.h"
            «FOR pub : node.publisher»
#include <«pub.message.package.name»/msg/«check_message_include(pub.message.name)».hpp>
            «ENDFOR»
            «FOR sub : node.subscriber»
#include <«sub.message.package.name»/msg/«check_message_include(sub.message.name)».hpp>
            «ENDFOR»
            «FOR srvserver : node.serviceserver»
#include <«srvserver.service.package.name»/srv/«check_message_include(srvserver.service.name)».hpp>
            «ENDFOR»
            «FOR srvclient : node.serviceclient»
#include <«srvclient.service.package.name»/srv/«check_message_include(srvclient.service.name)».hpp>
            «ENDFOR»

using namespace std::chrono_literals;
using std::placeholders::_1;
using std::placeholders::_2;
using std::placeholders::_3;

void print_usage()
{
    printf("Usage for «node.name» app:\n");
    printf("..... \n");
    printf("..... \n");
    printf("..... \n");
}

class «node.name» : public rclcpp::Node {
    public:
      «node.name»() : Node("«node.name»") {
        «FOR param : node.parameter»
        «IF (param.type instanceof ParameterStructTypeImpl)»
        «parameter_helper.compile_struct(param.type as ParameterStructTypeImpl, param.name).getKey()»
        «ELSE»
«var param_pair = parameter_helper.get_param_type(param.type)»
        «IF !(param_pair.getKey().empty)»
        this->declare_parameter«IF !param_pair.getValue().empty»<«param_pair.getKey()»>«ENDIF»("«param.name»"«param_pair.getValue()»);
        this->get_parameter("«param.name»", «param.name»_);
        «ENDIF»
        «ENDIF»
        «ENDFOR»
        «FOR pub : node.publisher»
        «check_name(pub.name)»_ = this->create_publisher<«pub.message.package.name»::msg::«pub.message.name»>("«pub.name»",10);
        «ENDFOR»
        «FOR sub : node.subscriber»
        «check_name(sub.name)»_ = this->create_subscription<«sub.message.package.name»::msg::«sub.message.name»>("«sub.name»", 10, std::bind(&«node.name»::«check_name(sub.name)»_callback, this, _1));
        «ENDFOR»
        «FOR client : node.serviceclient»
        «check_name(client.name)»_ = this->create_client<«client.service.package.name»::srv::«client.service.name»>("«client.name»");
        «ENDFOR»
        «FOR service : node.serviceserver»
        «check_name(service.name)»_ = this->create_service<«service.service.package.name»::srv::«service.service.name»>("«service.name»", std::bind(&«node.name»::«check_name(service.name)»_handle, this, _1, _2, _3));
        «ENDFOR»

        «IF node.publisher.length > 0»
        timer_ = this->create_wall_timer(500ms, std::bind(&«node.name»::timer_callback, this));
        «ENDIF»

        «FOR client : node.serviceclient»
        // Service client
        while (!«check_name(client.name)»_->wait_for_service(std::chrono::seconds(10))){
            RCLCPP_ERROR(this->get_logger(), "Client interrupted while waiting for service '%s' to appear.", "«client.name»");
        }
        auto request = std::make_shared<«client.service.package.name»::srv::«client.service.name»::Request>();
        // request-> ... = ....;
        auto result_future = «check_name(client.name)»_->async_send_request(request);
        auto result = result_future.get();
        RCLCPP_INFO(this->get_logger(), "Service called, service: '%s'", "«client.name»");
        «ENDFOR»
      }

    private:
        «FOR param : node.parameter»
        «IF (param.type instanceof ParameterStructTypeImpl)»
        «parameter_helper.compile_struct(param.type as ParameterStructTypeImpl, param.name).getValue()»
        «ELSE»
        «var param_pair = parameter_helper.get_param_type(param.type)»
        «IF !(param_pair.getKey().empty)»
        «param_pair.getKey()» «param.name»_;
        «ENDIF»
        «ENDIF»
        «ENDFOR»

        «FOR sub : node.subscriber»
        // Subscriber callback
        void «check_name(sub.name)»_callback(const «sub.message.package.name»::msg::«sub.message.name»::SharedPtr msg) const {
        RCLCPP_INFO(this->get_logger(), "«sub.name» topic got a message", msg);
        }

        rclcpp::Subscription<«sub.message.package.name»::msg::«sub.message.name»>::SharedPtr «check_name(sub.name)»_ ;
        «ENDFOR»
        «FOR pub : node.publisher»
        rclcpp::Publisher<«pub.message.package.name»::msg::«pub.message.name»>::SharedPtr «check_name(pub.name)»_;
        «ENDFOR»
        «IF node.publisher.length > 0»
        // Timer Callback
        void timer_callback(){
            «FOR pub : node.publisher»
            auto «check_name(pub.name)»_msg = «pub.message.package.name»::msg::«pub.message.name»();
            //«check_name(pub.name)»_msg = ...
            «check_name(pub.name)»_->publish(«check_name(pub.name)»_msg);
            RCLCPP_INFO(this->get_logger(), "«pub.name» publisher active");
            «ENDFOR»
        }
        rclcpp::TimerBase::SharedPtr timer_;
        «ENDIF»

        «FOR client : node.serviceclient»rclcpp::Client<«client.service.package.name»::srv::«client.service.name»>::SharedPtr «check_name(client.name)»_;
        «ENDFOR»

        «FOR service : node.serviceserver»
        // Service Handler
        void «check_name(service.name)»_handle( const std::shared_ptr<rmw_request_id_t> request_header,
            const std::shared_ptr<«service.service.package.name»::srv::«service.service.name»::Request> request_,
            const std::shared_ptr<«service.service.package.name»::srv::«service.service.name»::Response> response_){
            (void)request_header;
            (void)request_;
            (void)response_;
            RCLCPP_INFO( this->get_logger(), "trigger service '%s'","«service.name»");
        }
        rclcpp::Service<«service.service.package.name»::srv::«service.service.name»>::SharedPtr «check_name(service.name)»_;
        «ENDFOR»
};

int main(int argc, char * argv[])
{
    rclcpp::init(argc, argv);
    rclcpp::spin(std::make_shared<«node.name»>());
    rclcpp::shutdown();
    return 0;
}
 '''

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

 def String check_message_include(String message_name){
    import_msgs = message_name.toFirstLower;
    for (char_i =0; char_i < import_msgs.length; char_i++ ){
        if (Character.isUpperCase(import_msgs.charAt(char_i))){
            import_msgs = import_msgs.substring(0,char_i)+"_"+Character.toLowerCase(import_msgs.charAt(char_i))+import_msgs.substring(char_i+1);
        }
    }
    return import_msgs;
 }

 def String check_name(String interface_name){
    return interface_name.replace("/","");
 }

}
