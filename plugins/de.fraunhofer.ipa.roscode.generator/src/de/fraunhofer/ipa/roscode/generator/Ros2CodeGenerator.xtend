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
	String import_msgs
	int char_i
		
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
      «FOR pub : node.publisher»  «pub.name»_ = this->create_publisher<«pub.message.package.name»::msg::«pub.message.name»>("«pub.name»",10);«ENDFOR»
      «FOR sub : node.subscriber»  «sub.name»_ = this->create_subscription<«sub.message.package.name»::msg::«sub.message.name»>("«sub.name»", 10, std::bind(&«node.name»::«sub.name»_callback, this, _1));«ENDFOR»
      «FOR client : node.serviceclient»  «client.name»_ = this->create_client<«client.service.package.name»::srv::«client.service.name»>("«client.name»");«ENDFOR»
      «FOR service : node.serviceserver»  «service.name»_ = this->create_service<«service.service.package.name»::srv::«service.service.name»>("«service.name»", std::bind(&«node.name»::«service.name»_handle, this, _1, _2, _3));«ENDFOR»
        «IF node.publisher.length > 0»
        timer_ = this->create_wall_timer(500ms, std::bind(&«node.name»::timer_callback, this));
        «ENDIF»

      	«FOR client : node.serviceclient»    
      	// Service client
        while (!«client.name»_->wait_for_service(std::chrono::seconds(10))){
          RCLCPP_ERROR(this->get_logger(), "Client interrupted while waiting for service '%s' to appear.", "«client.name»");
        }
        auto request = std::make_shared<«client.service.package.name»::srv::«client.service.name»::Request>();
        // request-> ... = ....;
        auto result_future = «client.name»_->async_send_request(request);
        auto result = result_future.get();
        RCLCPP_INFO(this->get_logger(), "Service called, service: '%s'", "«client.name»");
        «ENDFOR»
      }

    private:
      «FOR sub : node.subscriber»
      // Subscriber callback
      void «sub.name»_callback(const «sub.message.package.name»::msg::«sub.message.name»::SharedPtr msg) const {
        RCLCPP_INFO(this->get_logger(), "«sub.name» topic got a message");
      }

      rclcpp::Subscription<«sub.message.package.name»::msg::«sub.message.name»>::SharedPtr «sub.name»_ ;
      «ENDFOR»
      «FOR pub : node.publisher»rclcpp::Publisher<«pub.message.package.name»::msg::«pub.message.name»>::SharedPtr «pub.name»_;«ENDFOR»
      «IF node.publisher.length > 0»
      // Timer Callback
      void timer_callback(){
        «FOR pub : node.publisher»
        auto «pub.name»_msg = «pub.message.package.name»::msg::«pub.message.name»();
        //«pub.name»_msg = ...
        «pub.name»_->publish(«pub.name»_msg);
        RCLCPP_INFO(this->get_logger(), "«pub.name» publisher active");«ENDFOR»
      }
      rclcpp::TimerBase::SharedPtr timer_;
	«ENDIF»

      «FOR client : node.serviceclient»rclcpp::Client<«client.service.package.name»::srv::«client.service.name»>::SharedPtr «client.name»_;«ENDFOR»

      «FOR service : node.serviceserver»
      // Service Handler
      void «service.name»_handle( const std::shared_ptr<rmw_request_id_t> request_header,
        const std::shared_ptr<«service.service.package.name»::srv::«service.service.name»::Request> request_,
        const std::shared_ptr<«service.service.package.name»::srv::«service.service.name»::Response> response_){
        (void)request_header;
        RCLCPP_INFO( this->get_logger(), "trigger service '%s'","«service.name»");
      }
      rclcpp::Service<«service.service.package.name»::srv::«service.service.name»>::SharedPtr «service.name»_;
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
 
 def String check_message_include(String message_name){
 	import_msgs = message_name.toFirstLower;
 	for (char_i =0; char_i < import_msgs.length; char_i++ ){
		if (Character.isUpperCase(import_msgs.charAt(char_i))){
			import_msgs = import_msgs.substring(0,char_i)+"_"+Character.toLowerCase(import_msgs.charAt(char_i))+import_msgs.substring(char_i+1);
		}
 	}
 	return import_msgs;
 }
}