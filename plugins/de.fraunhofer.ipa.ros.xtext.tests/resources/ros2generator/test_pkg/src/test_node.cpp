#include <chrono>
#include <cstdio>
#include <memory>
#include <string>
#include <utility>

#include "rclcpp/rclcpp.hpp"
#include "rcutils/cmdline_parser.h"
#include <sensor_msgs/msg/laser_scan.hpp>
#include <sensor_msgs/msg/battery_state.hpp>
#include <std_srvs/srv/set_bool.hpp>
#include <std_srvs/srv/trigger.hpp>

using namespace std::chrono_literals;
using std::placeholders::_1;
using std::placeholders::_2;
using std::placeholders::_3;

void print_usage()
{
  printf("Usage for test_node app:\n");
  printf("..... \n");
  printf("..... \n");
  printf("..... \n");
}

  class test_node : public rclcpp::Node {
    public:
      test_node() : Node("test_node") {
        scan_ = this->create_publisher<sensor_msgs::msg::LaserScan>("scan",10);
        power_state_ = this->create_subscription<sensor_msgs::msg::BatteryState>("power_state", 10, std::bind(&test_node::power_state_callback, this, _1));
        init_ = this->create_client<std_srvs::srv::Trigger>("init");
        setBool_ = this->create_service<std_srvs::srv::SetBool>("setBool", std::bind(&test_node::setBool_handle, this, _1, _2, _3));

        timer_ = this->create_wall_timer(500ms, std::bind(&test_node::timer_callback, this));

      	// Service client
        while (!init_->wait_for_service(std::chrono::seconds(10))){
          RCLCPP_ERROR(this->get_logger(), "Client interrupted while waiting for service '%s' to appear.", "init");
        }
        auto request = std::make_shared<std_srvs::srv::Trigger::Request>();
        // request-> ... = ....;
        auto result_future = init_->async_send_request(request);
        auto result = result_future.get();
        RCLCPP_INFO(this->get_logger(), "Service called, service: '%s'", "init");
      }

    private:
      // Subscriber callback
      void power_state_callback(const sensor_msgs::msg::BatteryState::SharedPtr msg) const {
        RCLCPP_INFO(this->get_logger(), "power_state topic got a message");
      }

      rclcpp::Subscription<sensor_msgs::msg::BatteryState>::SharedPtr power_state_ ;
      rclcpp::Publisher<sensor_msgs::msg::LaserScan>::SharedPtr scan_;
      // Timer Callback
      void timer_callback(){
        auto scan_msg = sensor_msgs::msg::LaserScan();
        //scan_msg = ...
        scan_->publish(scan_msg);
        RCLCPP_INFO(this->get_logger(), "scan publisher active");
      }
      rclcpp::TimerBase::SharedPtr timer_;

      rclcpp::Client<std_srvs::srv::Trigger>::SharedPtr init_;

      // Service Handler
      void setBool_handle( const std::shared_ptr<rmw_request_id_t> request_header,
        const std::shared_ptr<std_srvs::srv::SetBool::Request> request_,
        const std::shared_ptr<std_srvs::srv::SetBool::Response> response_){
        (void)request_header;
        RCLCPP_INFO( this->get_logger(), "trigger service '%s'","setBool");
      }
      rclcpp::Service<std_srvs::srv::SetBool>::SharedPtr setBool_;
};

int main(int argc, char * argv[])
{
  rclcpp::init(argc, argv);
  rclcpp::spin(std::make_shared<test_node>());
  rclcpp::shutdown();
  return 0;
}
