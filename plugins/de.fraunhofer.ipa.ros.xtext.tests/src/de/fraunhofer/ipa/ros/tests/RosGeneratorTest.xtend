package de.fraunhofer.ipa.ros.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import de.fraunhofer.ipa.roscode.generator.RosCodeGenerator
import org.eclipse.xtext.testing.util.ParseHelper
import ros.PackageSet
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.GeneratorContext
import de.fraunhofer.ipa.roscode.generator.CustomOutputProvider


import de.fraunhofer.ipa.roscode.generator.Ros2CodeGenerator

@RunWith(XtextRunner)
@InjectWith(RosInjectorProvider)
class RosGeneratorTest {
	@Inject
	RosCodeGenerator rosGenerator
	
	@Inject
	Ros2CodeGenerator ros2Generator

	@Inject
	ParseHelper<PackageSet> parseHelper

	@Inject
	RosTestingUtils rosTestingUtils

	@Test
	def void testGeneratedRosCode() {
		val resourceSet = rosTestingUtils.getMessagesResourceSet
		val model = parseHelper.parse('''
			PackageSet { package { 
			  CatkinPackage cob_sick_s300 { artifact {
			    Artifact cob_sick_s300 {
			      node Node { name cob_sick_s300
			        publisher {
			          Publisher { name 'scan' message 'sensor_msgs.LaserScan'},
			          Publisher { name 'scan_standby' message 'std_msgs.Bool'},
			          Publisher { name '/diagnostics' message 'diagnostic_msgs.DiagnosticArray'}}
			}}}}}}
		''', resourceSet)

		val fsa = new InMemoryFileSystemAccess
		rosGenerator.doGenerate(model.eResource, fsa, new GeneratorContext)

		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp"))
		Assert.assertEquals('''#include <ros/ros.h>
#include <sensor_msgs/LaserScan.h>
#include <std_msgs/Bool.h>
#include <diagnostic_msgs/DiagnosticArray.h>



int main(int argc, char **argv)
{
  ros::init(argc, argv, "cob_sick_s300");
  ros::NodeHandle n;
  
  ros::Publisher scan_pub = n.advertise<sensor_msgs::LaserScan>("scan", 10);
  ros::Publisher scan_standby_pub = n.advertise<std_msgs::Bool>("scan_standby", 10);
  ros::Publisher /diagnostics_pub = n.advertise<diagnostic_msgs::DiagnosticArray>("/diagnostics", 10);

  ros::spin();

  return 0;
}'''.toString, fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp").toString.trim)
	}
	
	@Test
	def void testGeneratedRos2Code() {
		val resourceSet = rosTestingUtils.getMessagesResourceSet
		
		val model = parseHelper.parse('''
			PackageSet { package { 
			  CatkinPackage cob_sick_s300 { artifact {
			    Artifact cob_sick_s300 {
			      node Node { name cob_sick_s300
			        publisher {
			          Publisher { name 'scan' message 'sensor_msgs.LaserScan'},
			          Publisher { name 'scan_standby' message 'std_msgs.Bool'},
			          Publisher { name '/diagnostics' message 'diagnostic_msgs.DiagnosticArray'}}
			}}}}}}
		''', resourceSet)
		
		val fsa = new InMemoryFileSystemAccess
		ros2Generator.doGenerate(model.eResource, fsa, new GeneratorContext)
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp"))
		Assert.assertEquals('''#include <chrono>
#include <cstdio>
#include <memory>
#include <string>
#include <utility>

#include "rclcpp/rclcpp.hpp"
#include "rcutils/cmdline_parser.h"
#include <sensor_msgs/msg/LaserScan.hpp>
#include <std_msgs/msg/Bool.hpp>
#include <diagnostic_msgs/msg/DiagnosticArray.hpp>

void print_usage()
{
  printf("Usage for cob_sick_s300 app:\n");
  printf("..... \n");
  printf("..... \n");
  printf("..... \n");

}

  class cob_sick_s300 : public rclcpp::Node {
  	public:
	  explicit cob_sick_s300(const std::string & scan scan_standby /diagnostics ) : Node("cob_sick_s300")
	  auto publish_message = [this]() -> void {
    	msg_scan_ = std::make_unique<sensor_msgs::msg::LaserScan>();
    	scan_->publish(std::move(msg_scan_));
    	msg_scan_standby_ = std::make_unique<std_msgs::msg::Bool>();
    	scan_standby_->publish(std::move(msg_scan_standby_));
    	msg_/diagnostics_ = std::make_unique<diagnostic_msgs::msg::DiagnosticArray>();
    	/diagnostics_->publish(std::move(msg_/diagnostics_));
	  };

	  rclcpp::QoS qos(rclcpp::KeepLast(7));
scan_ = this->create_publisher<sensor_msgs::msg::LaserScan>(scan, qos);
scan_standby_ = this->create_publisher<std_msgs::msg::Bool>(scan_standby, qos);
/diagnostics_ = this->create_publisher<diagnostic_msgs::msg::DiagnosticArray>(/diagnostics, qos);
}

private:
  size_t count_ = 1;
  std::unique_ptr<sensor_msgs::msg::LaserScan> msg_scan_;
  rclcpp::Publisher<sensor_msgs::msg::LaserScan>::SharedPtr scan_;
  std::unique_ptr<std_msgs::msg::Bool> msg_scan_standby_;
  rclcpp::Publisher<std_msgs::msg::Bool>::SharedPtr scan_standby_;
  std::unique_ptr<diagnostic_msgs::msg::DiagnosticArray> msg_/diagnostics_;
  rclcpp::Publisher<diagnostic_msgs::msg::DiagnosticArray>::SharedPtr /diagnostics_;
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
  auto scan = std::string("scan");
  auto scan_standby = std::string("scan_standby");
  auto /diagnostics = std::string("/diagnostics");
  char * cli_option = rcutils_cli_get_option(argv, argv + argc, "-t");
  if (nullptr != cli_option) {
  scan = std::string(cli_option);
  scan_standby = std::string(cli_option);
  /diagnostics = std::string(cli_option);
  }
   auto node = std::make_shared<cob_sick_s300>(scan)
   auto node = std::make_shared<cob_sick_s300>(scan_standby)
   auto node = std::make_shared<cob_sick_s300>(/diagnostics)

  rclcpp::spin(cob_sick_s300);

  rclcpp::shutdown();
  return 0;
}'''.toString, fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp").toString.trim)
	}
	
	

}
