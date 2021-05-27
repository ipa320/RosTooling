#include <ros/ros.h>
#include <sensor_msgs/LaserScan.h>
#include <sensor_msgs/BatteryState.h>
#include <std_srvs/SetBool.h>
#include <std_srvs/Trigger.h>

bool  setBool_cb (std_srvs::SetBool::Request &req, std_srvs::SetBool::Response &res){
  return true;
}
void  power_state_cb (const sensor_msgs::BatteryState msg){}


int main(int argc, char **argv)
{
	ros::init(argc, argv, "test_node");
	ros::NodeHandle n;
	std::string string_test_;
	n.param<std::string>("string_test", string_test_, "test");
	bool bool_tets_;
	n.param("bool_tets", bool_tets_);
	std::vector<std::string> array_tets_;
	n.param("array_tets", array_tets_);
	double double_test_;
	n.param("double_test", double_test_);
	int int_test_;
	n.param("int_test", int_test_);
	int struc_test_first_element_;
	n.param("struc_test/first_element", struc_test_first_element_);
	
	std::vector<std::string> struc_test_second_element_;
	n.param("struc_test/second_element", struc_test_second_element_);
	
	std::string struc_test_third_element_;
	n.param("struc_test/third_element", struc_test_third_element_);
	
	int struc_test_last_element_hola_;
	n.param("struc_test/last_element/hola", struc_test_last_element_hola_);
	
	std::string struc_test_last_element_what_;
	n.param("struc_test/last_element/what", struc_test_last_element_what_);
	
	ros::Publisher scan_pub = n.advertise<sensor_msgs::LaserScan>("scan", 10);
	ros::Subscriber power_state = n.subscribe("power_state", 10, power_state_cb);
	ros::ServiceServer setBool = n.advertiseService("setBool", setBool_cb);
	ros::ServiceClient init = n.serviceClient<std_srvs::Trigger>("init");

	ros::spin();

  	return 0;
}
