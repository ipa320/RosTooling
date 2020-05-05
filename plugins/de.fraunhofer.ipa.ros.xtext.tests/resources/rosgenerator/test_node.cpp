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
  
  ros::Publisher scan_pub = n.advertise<sensor_msgs::LaserScan>("scan", 10);
  ros::Subscriber power_state = n.subscribe("power_state", 10, power_state_cb);
  ros::ServiceServer setBool = n.advertiseService("setBool", setBool_cb);
  ros::ServiceClient init = n.serviceClient<std_srvs::Trigger>("init");

  ros::spin();

  return 0;
}
