package de.fraunhofer.ipa.roscode.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import java.util.Set
import ros.*



/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Ros2CodeGenerator extends AbstractGenerator {

 
	String resourcepath
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resourcepath = resource.URI.toString();
		if (! resourcepath.contains("/ros-input")) {
			for (node : resource.allContents.toIterable.filter(Node)){
				fsa.generateFile(node.getName()+".cpp",node.compile)
				}
			}
		}

def compile(Node node) '''
#include <chrono>
#include <cstdio>
#include <memory>
#include <string>
#include <utility>

#include "rclcpp/rclcpp.hpp"
#include "rcutils/cmdline_parser.h"
            «FOR pub : node.publisher»
#include <«pub.message.package.name»/msg/«pub.message.name».hpp>
            «ENDFOR»
            «FOR sub : node.subscriber»
#include <«sub.message.package.name»/msg/«sub.message.name».hpp>
            «ENDFOR»
            «FOR srvserver : node.serviceserver»
#include <«srvserver.service.package.name»/srv/«srvserver.service.name».hpp>
            «ENDFOR»
            «FOR srvclient : node.serviceclient»
#include <«srvclient.service.package.name»/srv/«srvclient.service.name».hpp>
            «ENDFOR»

void print_usage()
{
  printf("Usage for «node.name» app:\n");
  printf("..... \n");
  printf("..... \n");
  printf("..... \n");

}

  class «node.name» : public rclcpp::Node {
  	public:
«IF node.publisher.length > 0»
  	  explicit «node.name»(const std::string & «FOR pub : node.publisher»«pub.name» «ENDFOR») : Node("«node.name»")
  	  auto publish_message = [this]() -> void {
      	«FOR pub : node.publisher»
      	msg_«pub.name»_ = std::make_unique<«pub.message.package.name»::msg::«pub.message.name»>();
      	«pub.name»_->publish(std::move(msg_«pub.name»_));
        «ENDFOR»
  	  };

  	  rclcpp::QoS qos(rclcpp::KeepLast(7));
    «FOR pub : node.publisher»
  	  «pub.name»_ = this->create_publisher<«pub.message.package.name»::msg::«pub.message.name»>(«pub.name», qos);
	«ENDFOR»
  }
«ENDIF»       

private:
  size_t count_ = 1;
  «FOR pub : node.publisher»
  std::unique_ptr<«pub.message.package.name»::msg::«pub.message.name»> msg_«pub.name»_;
  rclcpp::Publisher<«pub.message.package.name»::msg::«pub.message.name»>::SharedPtr «pub.name»_;
   «ENDFOR»
  rclcpp::TimerBase::SharedPtr timer_;
};

int main(int argc, char * argv[])
{
  setvbuf(stdout, NULL, _IONBF, BUFSIZ);

  if (rcutils_cli_option_exist(argv, argv + argc, "-h")) {
    print_usage();
    return 0;
  }

  rclcpp::init(argc, argv);
  «FOR pub : node.publisher»
  auto «pub.name» = std::string("«pub.name»");
  «ENDFOR»
  char * cli_option = rcutils_cli_get_option(argv, argv + argc, "-t");
  if (nullptr != cli_option) {
  «FOR pub : node.publisher»
    «pub.name» = std::string(cli_option);
    «ENDFOR»
  }
   «FOR pub : node.publisher»
   auto node = std::make_shared<«node.name»>(«pub.name»)
   «ENDFOR»

  rclcpp::spin(«node.name»);

  rclcpp::shutdown();
  return 0;
}
 '''
}