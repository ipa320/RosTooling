#include <ros/ros.h>
#include <diagnostic_msgs/DiagnosticStatus.h>
#include <diagnostic_msgs/DiagnosticArray.h>

void  _diagnostics_cb (const diagnostic_msgs::DiagnosticArray msg){}


int main(int argc, char **argv)
{
  ros::init(argc, argv, "diagnostics_aggregator");
  ros::NodeHandle n;
  
  ros::Publisher _diagnostics_toplevel_state_pub = n.advertise<diagnostic_msgs::DiagnosticStatus>("/diagnostics_toplevel_state", 10);
  ros::Subscriber _diagnostics = n.subscribe("/diagnostics", 10, /diagnostics_cb);

  ros::spin();

  return 0;
}
