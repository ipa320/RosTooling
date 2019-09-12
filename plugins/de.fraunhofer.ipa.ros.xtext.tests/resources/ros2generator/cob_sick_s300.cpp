#include <chrono>
#include <cstdio>
#include <memory>
#include <string>
#include <utility>

#include "rclcpp/rclcpp.hpp"
#include "rcutils/cmdline_parser.h"
#include <sensor_msgs/msg/laser_scan.hpp>
#include <std_msgs/msg/bool.hpp>
#include <diagnostic_msgs/msg/diagnostic_array.hpp>

using namespace std::chrono_literals;
using std::placeholders::_1;
using std::placeholders::_2;
using std::placeholders::_3;

void print_usage()
{
  printf("Usage for cob_sick_s300 app:\n");
  printf("..... \n");
  printf("..... \n");
  printf("..... \n");
}

  class cob_sick_s300 : public rclcpp::Node {
    public:
      cob_sick_s300() : Node("cob_sick_s300") {
        scan_ = this->create_publisher<sensor_msgs::msg::LaserScan>("scan",10);
        scan_standby_ = this->create_publisher<std_msgs::msg::Bool>("scan_standby",10);
        diagnostics_ = this->create_publisher<diagnostic_msgs::msg::DiagnosticArray>("/diagnostics",10);

        timer_ = this->create_wall_timer(500ms, std::bind(&cob_sick_s300::timer_callback, this));

      }

    private:
      rclcpp::Publisher<sensor_msgs::msg::LaserScan>::SharedPtr scan_;
      rclcpp::Publisher<std_msgs::msg::Bool>::SharedPtr scan_standby_;
      rclcpp::Publisher<diagnostic_msgs::msg::DiagnosticArray>::SharedPtr diagnostics_;
      // Timer Callback
      void timer_callback(){
        auto scan_msg = sensor_msgs::msg::LaserScan();
        //scan_msg = ...
        scan_->publish(scan_msg);
        RCLCPP_INFO(this->get_logger(), "scan publisher active");
        auto scan_standby_msg = std_msgs::msg::Bool();
        //scan_standby_msg = ...
        scan_standby_->publish(scan_standby_msg);
        RCLCPP_INFO(this->get_logger(), "scan_standby publisher active");
        auto diagnostics_msg = diagnostic_msgs::msg::DiagnosticArray();
        //diagnostics_msg = ...
        diagnostics_->publish(diagnostics_msg);
        RCLCPP_INFO(this->get_logger(), "/diagnostics publisher active");
      }
      rclcpp::TimerBase::SharedPtr timer_;

      
};

int main(int argc, char * argv[])
{
  rclcpp::init(argc, argv);
  rclcpp::spin(std::make_shared<cob_sick_s300>());
  rclcpp::shutdown();
  return 0;
}

