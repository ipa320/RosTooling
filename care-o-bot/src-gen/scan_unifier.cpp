#include <ros/ros.h>
#include <sensor_msgs/LaserScan.h>
#include <sensor_msgs/LaserScan.h>
#include <sensor_msgs/LaserScan.h>
#include <sensor_msgs/LaserScan.h>

void  _base_laser_front_scan_cb (const sensor_msgs::LaserScan msg){}
void  _base_laser_right_scan_cb (const sensor_msgs::LaserScan msg){}
void  _base_laser_left_scan_cb (const sensor_msgs::LaserScan msg){}


int main(int argc, char **argv)
{
  ros::init(argc, argv, "scan_unifier");
  ros::NodeHandle n;
  
  ros::Publisher _scan_unified_pub = n.advertise<sensor_msgs::LaserScan>("/scan_unified", 10);
  ros::Subscriber _base_laser_front_scan = n.subscribe("/base_laser_front/scan", 10, /base_laser_front/scan_cb);
  ros::Subscriber _base_laser_right_scan = n.subscribe("/base_laser_right/scan", 10, /base_laser_right/scan_cb);
  ros::Subscriber _base_laser_left_scan = n.subscribe("/base_laser_left/scan", 10, /base_laser_left/scan_cb);

  ros::spin();

  return 0;
}
