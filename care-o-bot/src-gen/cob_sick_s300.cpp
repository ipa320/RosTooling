#include <ros/ros.h>
#include <sensor_msgs/LaserScan.h>
#include <diagnostic_msgs/DiagnosticArray.h>



int main(int argc, char **argv)
{
  ros::init(argc, argv, "cob_sick_s300");
  ros::NodeHandle n;
  
  ros::Publisher scan_pub = n.advertise<sensor_msgs::LaserScan>("scan", 10);
  ros::Publisher _diagnostics_pub = n.advertise<diagnostic_msgs::DiagnosticArray>("/diagnostics", 10);

  ros::spin();

  return 0;
}
