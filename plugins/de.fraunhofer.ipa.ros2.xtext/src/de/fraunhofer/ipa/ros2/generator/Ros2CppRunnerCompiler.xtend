package de.fraunhofer.ipa.ros2.generator

import com.google.inject.Inject
import ros.Node
import ros.Package

class Ros2CppRunnerCompiler {

    @Inject extension Ros2GeneratorHelpers

    def String compileCppNodeHeader(Package pkg, Node node) {
        compileCppNodeHeader(pkg, node, toCamelCase(node.artifactName))
    }

    def String compileCppNodeHeader(Package pkg, Node node, String artCamel) '''
#pragma once

#include <chrono>
#include <memory>
#include <thread>
#include "rclcpp/rclcpp.hpp"
#include "rclcpp/rate.hpp"
#include "«pkg.name.toLowerCase»/«artCamel»Wrapper.hpp"
#include "«pkg.name.toLowerCase»/«artCamel»Algorithm.hpp"

namespace «pkg.name.toLowerCase» {

/**
 * @brief Adapter wrapping rclcpp::Rate with the node's ROS clock
 */
class Ros2RateAdapter : public «pkg.name.toLowerCase»::Rate {
public:
    Ros2RateAdapter(double hz, rclcpp::Clock::SharedPtr clock)
    : rate_(hz, clock)
    {}

    bool sleep() override {
        return rate_.sleep();
    }

    void reset() override {
        rate_.reset();
    }

private:
    rclcpp::Rate rate_;
};

/**
 * @brief Default Derived Implementation coupling the pure algorithm with the ROS 2 wrapper
 */
class «artCamel»Node : public «pkg.name.toLowerCase»::«artCamel»Wrapper {
public:
    explicit «artCamel»Node(const rclcpp::NodeOptions & options = rclcpp::NodeOptions())
    : «artCamel»Wrapper(options), algorithm_(std::make_shared<«pkg.name.toLowerCase»::«artCamel»Algorithm>())
    {
        // Inject simulation-synchronized timer factory
        algorithm_->set_timer_factory([this](auto period, auto callback) -> std::shared_ptr<void> {
            return this->create_wall_timer(period, callback);
        });

        // Inject simulation-synchronized rate factory using the Node's clock
        algorithm_->set_rate_factory([this](double hz) -> std::shared_ptr<«pkg.name.toLowerCase»::Rate> {
            return std::make_shared<Ros2RateAdapter>(hz, this->get_clock());
        });
        
        // Inject the ROS2 logger
        algorithm_->set_logger([this](auto log_level, const std::string & msg) {
            switch (log_level) {
                case «pkg.name.toLowerCase»::«artCamel»Algorithm::LogLevel::DEBUG:
                {
                    RCLCPP_DEBUG(this->get_logger(), "%s", msg.c_str());
                    break;
                };
                case «pkg.name.toLowerCase»::«artCamel»Algorithm::LogLevel::INFO:
                {
                    RCLCPP_INFO(this->get_logger(), "%s", msg.c_str());
                    break;
                };
                case «pkg.name.toLowerCase»::«artCamel»Algorithm::LogLevel::WARN:
                {
                    RCLCPP_WARN(this->get_logger(), "%s", msg.c_str());
                    break;
                };
                case «pkg.name.toLowerCase»::«artCamel»Algorithm::LogLevel::ERROR:
                {
                    RCLCPP_ERROR(this->get_logger(), "%s", msg.c_str());
                    break;
                };
            }
        });

        // Inject runtime liveness check
        algorithm_->set_ok_handler([]() {
            return rclcpp::ok();
        });

        // Inject runtime shutdown handler
        algorithm_->set_shutdown_handler([this](const std::string & reason) {
            if (!reason.empty()) {
                RCLCPP_INFO(this->get_logger(), "Shutdown requested by algorithm: %s", reason.c_str());
            }
            rclcpp::shutdown();
        });

        // Inject simulation-synchronized clock
        algorithm_->set_clock_handler([this]() -> std::chrono::nanoseconds {
            return std::chrono::nanoseconds(this->now().nanoseconds());
        });

        // Inject simulation-synchronized sleep
        algorithm_->set_sleep_handler([this](std::chrono::nanoseconds duration) -> bool {
            return this->get_clock()->sleep_for(rclcpp::Duration(duration));
        });
        
        // Inject params via setter
        «FOR param : node.parameter»
        algorithm_->set_parameter("«param.name»", this->get_param_«param.name»());
        «ENDFOR»

        // Inject publisher delegates
        «FOR pub : node.publisher»
        algorithm_->set_«sanitizeName(pub.name)»_publisher([this](const auto & msg) {
            this->publish_«sanitizeName(pub.name)»(msg);
        });
        «ENDFOR»

        // Inject service client callers
        «FOR client : node.serviceclient»
        algorithm_->set_«sanitizeName(client.name)»_client(
            [this](const auto & req, const auto & timeout) {
                return this->call_«sanitizeName(client.name)»_sync(req, timeout);
            },
            [this](const auto & req, auto cb) {
                auto req_ptr = std::make_shared<«client.service.specName»::Request>(req);
                this->call_«sanitizeName(client.name)»_async(req_ptr, [cb](auto future) {
                    if (cb) cb(*future.get());
                });
            }
        );
        «ENDFOR»

        // Inject action client callers
        «FOR actClient : node.actionclient»
        algorithm_->set_«sanitizeName(actClient.name)»_client(
            [this](const auto & goal, auto resp_cb, auto fb_cb, auto res_cb, auto ... timeout_opt) {
                std::chrono::nanoseconds timeout = std::chrono::seconds(10);
                if constexpr (sizeof...(timeout_opt) > 0) {
                    timeout = std::chrono::duration_cast<std::chrono::nanoseconds>(
                        std::get<0>(std::forward_as_tuple(timeout_opt...)));
                }
                auto resp_adapter = [resp_cb](auto goal_handle) {
                    if (resp_cb) resp_cb(goal_handle != nullptr);
                };
                auto fb_adapter = [fb_cb](auto, auto fb_ptr) {
                    if (fb_cb && fb_ptr) fb_cb(*fb_ptr);
                };
                auto res_adapter = [res_cb](const auto & wrapped_result) {
                    if (!res_cb) return;
                    «pkg.name.toLowerCase»::GoalStatus status = «pkg.name.toLowerCase»::GoalStatus::UNKNOWN;
                    switch (wrapped_result.code) {
                        case rclcpp_action::ResultCode::SUCCEEDED:
                            status = «pkg.name.toLowerCase»::GoalStatus::SUCCEEDED;
                            break;
                        case rclcpp_action::ResultCode::ABORTED:
                            status = «pkg.name.toLowerCase»::GoalStatus::ABORTED;
                            break;
                        case rclcpp_action::ResultCode::CANCELED:
                            status = «pkg.name.toLowerCase»::GoalStatus::CANCELED;
                            break;
                        default:
                            status = «pkg.name.toLowerCase»::GoalStatus::UNKNOWN;
                            break;
                    }
                    using ResultT = std::decay_t<decltype(*wrapped_result.result)>;
                    if (wrapped_result.result) {
                        res_cb(status, *wrapped_result.result);
                    } else {
                        ResultT empty_result{};
                        res_cb(status, empty_result);
                    }
                };
                this->send_«sanitizeName(actClient.name)»_goal_async(goal, resp_adapter, fb_adapter, res_adapter, timeout);
            },
            [this]() {
                this->cancel_all_«sanitizeName(actClient.name)»_goals_async();
            }
        );
        «ENDFOR»
    }

protected:
    «IF node.isLifecycle»
    using CallbackReturn = «pkg.name.toLowerCase»::«artCamel»Wrapper::CallbackReturn;

    CallbackReturn on_configure(const rclcpp_lifecycle::State & state) override {
        (void)state;
        if («pkg.name.toLowerCase»::«artCamel»Wrapper::on_configure(state) != CallbackReturn::SUCCESS) {
            return CallbackReturn::FAILURE;
        }
        return algorithm_->on_configure() ? CallbackReturn::SUCCESS : CallbackReturn::FAILURE;
    }

    CallbackReturn on_activate(const rclcpp_lifecycle::State & state) override {
        (void)state;
        if («pkg.name.toLowerCase»::«artCamel»Wrapper::on_activate(state) != CallbackReturn::SUCCESS) {
            return CallbackReturn::FAILURE;
        }
        return algorithm_->on_activate() ? CallbackReturn::SUCCESS : CallbackReturn::FAILURE;
    }

    CallbackReturn on_deactivate(const rclcpp_lifecycle::State & state) override {
        (void)state;
        if («pkg.name.toLowerCase»::«artCamel»Wrapper::on_deactivate(state) != CallbackReturn::SUCCESS) {
            return CallbackReturn::FAILURE;
        }
        return algorithm_->on_deactivate() ? CallbackReturn::SUCCESS : CallbackReturn::FAILURE;
    }

    CallbackReturn on_cleanup(const rclcpp_lifecycle::State & state) override {
        (void)state;
        if («pkg.name.toLowerCase»::«artCamel»Wrapper::on_cleanup(state) != CallbackReturn::SUCCESS) {
            return CallbackReturn::FAILURE;
        }
        return algorithm_->on_cleanup() ? CallbackReturn::SUCCESS : CallbackReturn::FAILURE;
    }

    CallbackReturn on_shutdown(const rclcpp_lifecycle::State & state) override {
        (void)state;
        if («pkg.name.toLowerCase»::«artCamel»Wrapper::on_shutdown(state) != CallbackReturn::SUCCESS) {
            return CallbackReturn::FAILURE;
        }
        return algorithm_->on_shutdown() ? CallbackReturn::SUCCESS : CallbackReturn::FAILURE;
    }

    CallbackReturn on_error(const rclcpp_lifecycle::State & state) override {
        (void)state;
        return algorithm_->on_error() ? CallbackReturn::SUCCESS : CallbackReturn::FAILURE;
    }
    «ENDIF»

    «FOR sub : node.subscriber»
    void on_«sanitizeName(sub.name)»_msg(
        const «sub.message.specPackage»::msg::«sub.message.specName»::SharedPtr msg) override
    {
        algorithm_->on_«sanitizeName(sub.name)»_received(*msg);
    }
    «ENDFOR»

    «FOR srv : node.serviceserver»
    void handle_«sanitizeName(srv.name)»(
        const std::shared_ptr<«srv.service.specPackage»::srv::«srv.service.specName»::Request> req,
        std::shared_ptr<«srv.service.specPackage»::srv::«srv.service.specName»::Response> res) override
    {
        algorithm_->handle_«sanitizeName(srv.name)»(*req, *res);
    }
    «ENDFOR»

    «FOR act : node.actionserver»
    rclcpp_action::GoalResponse on_«sanitizeName(act.name)»_goal(
        const rclcpp_action::GoalUUID & uuid,
        std::shared_ptr<const «act.action.specName»::Goal> goal) override
    {
        (void)uuid;
        bool accept = algorithm_->handle_goal_«sanitizeName(act.name)»(*goal);
        return accept ? rclcpp_action::GoalResponse::ACCEPT_AND_EXECUTE
                      : rclcpp_action::GoalResponse::REJECT;
    }

    rclcpp_action::CancelResponse on_«sanitizeName(act.name)»_cancel(
        const std::shared_ptr<GoalHandle«act.action.specName»> goal_handle) override
    {
        (void)goal_handle;
        bool accept = algorithm_->handle_cancel_«sanitizeName(act.name)»();
        return accept ? rclcpp_action::CancelResponse::ACCEPT
                      : rclcpp_action::CancelResponse::REJECT;
    }

    void execute_«sanitizeName(act.name)»(
        const std::shared_ptr<GoalHandle«act.action.specName»> goal_handle) override
    {
        auto publish_fb = [goal_handle](const «act.action.specName»::Feedback & fb) {
            goal_handle->publish_feedback(std::make_shared<«act.action.specName»::Feedback>(fb));
        };
        auto is_canceling = [goal_handle]() {
            return goal_handle->is_canceling();
        };
        «act.action.specName»::Result result;
        bool success = algorithm_->execute_«sanitizeName(act.name)»(
            *goal_handle->get_goal(),
            publish_fb,
            is_canceling,
            result);
        auto res_ptr = std::make_shared<«act.action.specName»::Result>(result);
        if (goal_handle->is_canceling()) {
            goal_handle->canceled(res_ptr);
        } else if (success) {
            goal_handle->succeed(res_ptr);
        } else {
            goal_handle->abort(res_ptr);
        }
    }
    «ENDFOR»
    «IF !node.parameter.empty»
    rcl_interfaces::msg::SetParametersResult on_parameters_changed(
        const std::vector<rclcpp::Parameter> & parameters) override
    {
        rcl_interfaces::msg::SetParametersResult result = 
            «pkg.name.toLowerCase»::«artCamel»Wrapper::on_parameters_changed(parameters);
        for (const auto & param : parameters) {
            «pkg.name.toLowerCase»::«artCamel»Algorithm::ParameterValue val = to_parameter_value(param);
            «pkg.name.toLowerCase»::ValidationResult validation = algorithm_->validate_parameter(param.get_name(), val);
            if (!validation.successful) {
                result.successful = false;
                result.reason = validation.reason.empty() ?
                    ("Validation failed for parameter '" + param.get_name() + "'") :
                    validation.reason;
                return result;
            }
        }
        return result;        
    }
    «ENDIF»

private:
    std::shared_ptr<«pkg.name.toLowerCase»::«artCamel»Algorithm> algorithm_;
    «pkg.name.toLowerCase»::«artCamel»Algorithm::ParameterValue
        to_parameter_value(const rclcpp::Parameter & param)
    {
        switch (param.get_type()) {
            case rclcpp::ParameterType::PARAMETER_BOOL:
                return param.as_bool();
                case rclcpp::ParameterType::PARAMETER_INTEGER:
                return param.as_int();
            case rclcpp::ParameterType::PARAMETER_DOUBLE:
                return param.as_double();
            case rclcpp::ParameterType::PARAMETER_STRING:
                return param.as_string();
            case rclcpp::ParameterType::PARAMETER_BYTE_ARRAY:
                return param.as_byte_array();
            case rclcpp::ParameterType::PARAMETER_BOOL_ARRAY:
                return param.as_bool_array();
            case rclcpp::ParameterType::PARAMETER_INTEGER_ARRAY:
                return param.as_integer_array();
            case rclcpp::ParameterType::PARAMETER_DOUBLE_ARRAY:
                return param.as_double_array();
            case rclcpp::ParameterType::PARAMETER_STRING_ARRAY:
                return param.as_string_array();
            case rclcpp::ParameterType::PARAMETER_NOT_SET:
            default:
                return std::monostate{}; // or default fallback
        }        
    }
};

} // namespace «pkg.name.toLowerCase»
'''

    def String compileCppNodeSource(Package pkg, Node node) {
        compileCppNodeSource(pkg, node, toCamelCase(node.artifactName))
    }

    def String compileCppNodeSource(Package pkg, Node node, String artCamel) '''
#include "«pkg.name.toLowerCase»/«artCamel»Node.hpp"
#include "rclcpp_components/register_node_macro.hpp"

// Composable Component Registration for zero-copy ROS 2 container loading
RCLCPP_COMPONENTS_REGISTER_NODE(«pkg.name.toLowerCase»::«artCamel»Node)
'''

    def String compileCppRunner(Package pkg, Node node) {
        compileCppRunner(pkg, node, toCamelCase(node.artifactName))
    }

    def String compileCppRunner(Package pkg, Node node, String artCamel) '''
#include <memory>
#include <thread>
#include "rclcpp/rclcpp.hpp"
#include "«pkg.name.toLowerCase»/«artCamel»Node.hpp"

int main(int argc, char * argv[])
{
    rclcpp::init(argc, argv);
    auto node = std::make_shared<«pkg.name.toLowerCase»::«artCamel»Node>();

    «IF node.hasActionServer || node.hasServiceClients»
    // Automated Executor Selection: MultiThreadedExecutor selected for concurrency
    rclcpp::executors::MultiThreadedExecutor executor(
        rclcpp::ExecutorOptions(),
        std::max(2u, std::thread::hardware_concurrency()));
    «IF node.isLifecycle»
    executor.add_node(node->get_node_base_interface());
    «ELSE»
    executor.add_node(node);
    «ENDIF»
    executor.spin();
    «ELSE»
    // Automated Executor Selection: SingleThreadedExecutor selected
    «IF node.isLifecycle»
    rclcpp::spin(node->get_node_base_interface());
    «ELSE»
    rclcpp::spin(node);
    «ENDIF»
    «ENDIF»

    rclcpp::shutdown();
    return 0;
}
'''

}

