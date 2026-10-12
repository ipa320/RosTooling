package de.fraunhofer.ipa.ros2.generator

import com.google.inject.Inject
import ros.Node
import ros.Package

class Ros2CppWrapperCompiler {

    @Inject extension Ros2GeneratorHelpers

    def String compileHeader(Package pkg, Node node) {
        compileHeader(pkg, node, toCamelCase(node.artifactName))
    }

    def String compileHeader(Package pkg, Node node, String artCamel) '''
#pragma once

#include <chrono>
#include <functional>
#include <future>
#include <memory>
#include <mutex>
#include <optional>
#include <string>
#include <vector>

#include "rclcpp/rclcpp.hpp"
«IF node.isLifecycle»
#include "rclcpp_lifecycle/lifecycle_node.hpp"
«ENDIF»
«IF node.hasActions»
#include "rclcpp_action/rclcpp_action.hpp"
«ENDIF»

// ROS 2 Interface Message / Service / Action headers
«FOR pub : node.publisher»
#include "«pub.message.specPackage»/msg/«toSnakeCase(pub.message.specName)».hpp"
«ENDFOR»
«FOR sub : node.subscriber»
#include "«sub.message.specPackage»/msg/«toSnakeCase(sub.message.specName)».hpp"
«ENDFOR»
«FOR srv : node.serviceserver»
#include "«srv.service.specPackage»/srv/«toSnakeCase(srv.service.specName)».hpp"
«ENDFOR»
«FOR client : node.serviceclient»
#include "«client.service.specPackage»/srv/«toSnakeCase(client.service.specName)».hpp"
«ENDFOR»
«FOR act : node.actionserver»
#include "«act.action.specPackage»/action/«toSnakeCase(act.action.specName)».hpp"
«ENDFOR»
«FOR actClient : node.actionclient»
#include "«actClient.action.specPackage»/action/«toSnakeCase(actClient.action.specName)».hpp"
«ENDFOR»

namespace «pkg.name.toLowerCase» {

/**
 * @brief Generated ROS 2 Node wrapper for '«node.name»' (Artifact: '«node.artifactName»').
 * DO NOT DIRECTLY EDIT THIS FILE - it will be overwritten on generation.
 * Domain logic should inherit from this class or implement the pure virtual callbacks.
 */
class «artCamel»Wrapper : public «IF node.isLifecycle»rclcpp_lifecycle::LifecycleNode«ELSE»rclcpp::Node«ENDIF» {
public:
    explicit «artCamel»Wrapper(const rclcpp::NodeOptions & options = rclcpp::NodeOptions());
    virtual ~«artCamel»Wrapper() = default;

    «IF node.isLifecycle»
    using CallbackReturn = rclcpp_lifecycle::node_interfaces::LifecycleNodeInterface::CallbackReturn;

    // ==========================================
    // LIFECYCLE TRANSITION CALLBACKS
    // ==========================================
    virtual CallbackReturn on_configure(const rclcpp_lifecycle::State & state);
    virtual CallbackReturn on_activate(const rclcpp_lifecycle::State & state);
    virtual CallbackReturn on_deactivate(const rclcpp_lifecycle::State & state);
    virtual CallbackReturn on_cleanup(const rclcpp_lifecycle::State & state);
    virtual CallbackReturn on_shutdown(const rclcpp_lifecycle::State & state);
    virtual CallbackReturn on_error(const rclcpp_lifecycle::State & state);
    «ENDIF»

    // ==========================================
    // SUBSCRIBER CACHED DATA ACCESSORS
    // ==========================================
    «FOR sub : node.subscriber»
    /**
     * @brief Get the latest cached message received on topic '«sub.name»'
     */
    std::optional<«sub.message.specPackage»::msg::«sub.message.specName»> get_latest_«sanitizeName(sub.name)»_msg() const {
        std::lock_guard<std::mutex> lock(sub_«sanitizeName(sub.name)»_mutex_);
        return latest_sub_«sanitizeName(sub.name)»_msg_;
    }

    /**
     * @brief Check if a new unread message has arrived on topic '«sub.name»'
     */
    bool has_new_«sanitizeName(sub.name)»_msg() const {
        std::lock_guard<std::mutex> lock(sub_«sanitizeName(sub.name)»_mutex_);
        return has_new_sub_«sanitizeName(sub.name)»_msg_;
    }

    /**
     * @brief Retrieve and clear the new message flag for topic '«sub.name»'
     */
    std::optional<«sub.message.specPackage»::msg::«sub.message.specName»> take_latest_«sanitizeName(sub.name)»_msg() {
        std::lock_guard<std::mutex> lock(sub_«sanitizeName(sub.name)»_mutex_);
        has_new_sub_«sanitizeName(sub.name)»_msg_ = false;
        return latest_sub_«sanitizeName(sub.name)»_msg_;
    }

    «ENDFOR»
protected:
    // ==========================================
    // INCOMING INTERFACE HOOKS (Implemented by Core Logic)
    // ==========================================

    «FOR sub : node.subscriber»
    /**
     * @brief Inbound subscriber callback hook for topic '«sub.name»'
     */
    virtual void on_«sanitizeName(sub.name)»_msg(
        const «sub.message.specPackage»::msg::«sub.message.specName»::SharedPtr msg) {
        	(void)msg;
        	RCLCPP_ERROR(this->get_logger(), "The abstract method on_«sanitizeName(sub.name)» needs to be overriden!");
        };

    «ENDFOR»
    «FOR srv : node.serviceserver»
    /**
     * @brief Inbound service handler hook for service '«srv.name»'
     */
    virtual void handle_«sanitizeName(srv.name)»(
        const std::shared_ptr<«srv.service.specPackage»::srv::«srv.service.specName»::Request> request,
        std::shared_ptr<«srv.service.specPackage»::srv::«srv.service.specName»::Response> response) {
        	(void)request;
        	(void)response;
        	RCLCPP_ERROR(this->get_logger(), "The abstract method handle_«sanitizeName(srv.name)» needs to be overriden!");
        };

    «ENDFOR»
    «FOR act : node.actionserver»
    using «act.action.specName» = «act.action.specPackage»::action::«act.action.specName»;
    using GoalHandle«act.action.specName» = rclcpp_action::ServerGoalHandle<«act.action.specName»>;

    /**
     * @brief Goal callback hook for Action '«act.name»' (Defaults to ACCEPT_AND_EXECUTE)
     */
    virtual rclcpp_action::GoalResponse on_«sanitizeName(act.name)»_goal(
        const rclcpp_action::GoalUUID & uuid,
        std::shared_ptr<const «act.action.specName»::Goal> goal)
    {
        (void)uuid;
        (void)goal;
        return rclcpp_action::GoalResponse::ACCEPT_AND_EXECUTE;
    }

    /**
     * @brief Cancel callback hook for Action '«act.name»' (Defaults to ACCEPT)
     */
    virtual rclcpp_action::CancelResponse on_«sanitizeName(act.name)»_cancel(
        const std::shared_ptr<GoalHandle«act.action.specName»> goal_handle)
    {
        (void)goal_handle;
        return rclcpp_action::CancelResponse::ACCEPT;
    }

    /**
     * @brief Execute callback for Action '«act.name»' - Pure virtual (Domain execution logic)
     */
    virtual void execute_«sanitizeName(act.name)»(
        const std::shared_ptr<GoalHandle«act.action.specName»> goal_handle) {
        	(void)goal_handle;
        	RCLCPP_ERROR(this->get_logger(), "The abstract method execute_«sanitizeName(act.name)» needs to be overriden!");
        };

    «ENDFOR»
    «IF !node.parameter.empty»
    /**
     * @brief Dynamic parameter validation callback hook
     */
    virtual rcl_interfaces::msg::SetParametersResult on_parameters_changed(
        const std::vector<rclcpp::Parameter> & parameters)
    {
        rcl_interfaces::msg::SetParametersResult result;
        result.successful = true;
        (void)parameters;
        return result;
    }
    «ENDIF»
    // ==========================================
    // OUTGOING INTERFACE METHODS (Invoked by Core Logic)
    // ==========================================

    «FOR pub : node.publisher»
    /**
     * @brief Publish message to topic '«pub.name»'
     */
    void publish_«sanitizeName(pub.name)»(const «pub.message.specPackage»::msg::«pub.message.specName» & msg);

    «ENDFOR»
    «FOR client : node.serviceclient»
    using «client.service.specName» = «client.service.specPackage»::srv::«client.service.specName»;

    /**
     * @brief Check if service '«client.name»' is available
     */
    bool is_«sanitizeName(client.name)»_ready(std::chrono::nanoseconds timeout = std::chrono::nanoseconds(1000));

    /**
     * @brief Asynchronous call to service '«client.name»' returning a SharedFuture
     */
    rclcpp::Client<«client.service.specName»>::SharedFuture call_«sanitizeName(client.name)»_async(
        std::shared_ptr<«client.service.specName»::Request> request);

    /**
     * @brief Asynchronous call to service '«client.name»' with completion callback
     */
    void call_«sanitizeName(client.name)»_async(
        std::shared_ptr<«client.service.specName»::Request> request,
        std::function<void(rclcpp::Client<«client.service.specName»>::SharedFuture)> callback);

    /**
     * @brief Thread-safe Synchronous call to service '«client.name»' with timeout
     */
    std::optional<«client.service.specName»::Response> call_«sanitizeName(client.name)»_sync(
        const «client.service.specName»::Request & request,
        std::chrono::nanoseconds timeout = std::chrono::seconds(5));

    «ENDFOR»
    «FOR actClient : node.actionclient»
    using «actClient.action.specName»Client = «actClient.action.specPackage»::action::«actClient.action.specName»;
    using ClientGoalHandle«actClient.action.specName» = rclcpp_action::ClientGoalHandle<«actClient.action.specName»Client>;

    /**
     * @brief Asynchronously send goal to Action '«actClient.name»'
     */
    std::shared_future<ClientGoalHandle«actClient.action.specName»::SharedPtr> send_«sanitizeName(actClient.name)»_goal_async(
        const «actClient.action.specName»Client::Goal & goal,
        std::function<void(ClientGoalHandle«actClient.action.specName»::SharedPtr)> goal_response_cb = nullptr,
        std::function<void(ClientGoalHandle«actClient.action.specName»::SharedPtr, const std::shared_ptr<const «actClient.action.specName»Client::Feedback>)> feedback_cb = nullptr,
        std::function<void(const ClientGoalHandle«actClient.action.specName»::WrappedResult &)> result_cb = nullptr,
        std::chrono::nanoseconds timeout = std::chrono::seconds(10));

    /**
     * @brief Cancel active goal for Action '«actClient.name»'
     */
    void cancel_«sanitizeName(actClient.name)»_goal_async(
        std::shared_ptr<ClientGoalHandle«actClient.action.specName»> goal_handle);

    /**
     * @brief Cancel all active goals for Action '«actClient.name»'
     */
    void cancel_all_«sanitizeName(actClient.name)»_goals_async();

    /**
     * @brief Wait for action server '«actClient.name»' to be available
     */
    bool wait_for_«sanitizeName(actClient.name)»_server(
        std::chrono::nanoseconds timeout = std::chrono::nanoseconds(-1));

    /**
     * @brief Check if action server '«actClient.name»' is ready
     */
    bool is_«sanitizeName(actClient.name)»_server_ready() const;

    «ENDFOR»
    «FOR act : node.actionserver»
    /**
     * @brief Publish feedback for Action server '«act.name»'
     */
    void publish_«sanitizeName(act.name)»_feedback(
        std::shared_ptr<GoalHandle«act.action.specName»> goal_handle,
        std::shared_ptr<«act.action.specName»::Feedback> feedback);

    «ENDFOR»
    // ==========================================
    // PARAMETER ACCESSORS
    // ==========================================

    «FOR param : node.parameter»
    «val cppType = getCppType(param.type)»
    «val defaultVal = getParamDefaultValueCpp(param)»
    «IF defaultVal !== null»
    «cppType» get_param_«sanitizeName(param.name)»() const { return param_«sanitizeName(param.name)»_; }
    «ELSE»
    std::optional<«cppType»> get_param_«sanitizeName(param.name)»() const { return param_«sanitizeName(param.name)»_; }
    bool has_param_«sanitizeName(param.name)»() const { return param_«sanitizeName(param.name)»_.has_value(); }
    «ENDIF»
    «ENDFOR»

private:
    rclcpp::CallbackGroup::SharedPtr client_cb_group_;
    OnSetParametersCallbackHandle::SharedPtr param_cb_handle_;

    // ROS 2 interface handles
    «FOR pub : node.publisher»
    «IF node.isLifecycle»
    rclcpp_lifecycle::LifecyclePublisher<«pub.message.specPackage»::msg::«pub.message.specName»>::SharedPtr pub_«sanitizeName(pub.name)»_;
    «ELSE»
    rclcpp::Publisher<«pub.message.specPackage»::msg::«pub.message.specName»>::SharedPtr pub_«sanitizeName(pub.name)»_;
    «ENDIF»
    «ENDFOR»
    «FOR sub : node.subscriber»
    rclcpp::Subscription<«sub.message.specPackage»::msg::«sub.message.specName»>::SharedPtr sub_«sanitizeName(sub.name)»_;
    mutable std::mutex sub_«sanitizeName(sub.name)»_mutex_;
    std::optional<«sub.message.specPackage»::msg::«sub.message.specName»> latest_sub_«sanitizeName(sub.name)»_msg_;
    bool has_new_sub_«sanitizeName(sub.name)»_msg_{false};
    «ENDFOR»
    «FOR srv : node.serviceserver»
    rclcpp::Service<«srv.service.specPackage»::srv::«srv.service.specName»>::SharedPtr srv_«sanitizeName(srv.name)»_;
    «ENDFOR»
    «FOR client : node.serviceclient»
    rclcpp::Client<«client.service.specPackage»::srv::«client.service.specName»>::SharedPtr client_«sanitizeName(client.name)»_;
    «ENDFOR»
    «FOR act : node.actionserver»
    rclcpp_action::Server<«act.action.specPackage»::action::«act.action.specName»>::SharedPtr action_server_«sanitizeName(act.name)»_;
    «ENDFOR»
    «FOR actClient : node.actionclient»
    rclcpp_action::Client<«actClient.action.specPackage»::action::«actClient.action.specName»>::SharedPtr action_client_«sanitizeName(actClient.name)»_;
    «ENDFOR»

    // Internal parameter values
    «FOR param : node.parameter»
    «val cppType = getCppType(param.type)»
    «val defaultVal = getParamDefaultValueCpp(param)»
    «IF defaultVal !== null»
    «cppType» param_«sanitizeName(param.name)»_{«defaultVal»};
    «ELSE»
    std::optional<«cppType»> param_«sanitizeName(param.name)»_;
    «ENDIF»
    «ENDFOR»
    «IF !node.parameter.empty»
    rcl_interfaces::msg::SetParametersResult internal_on_set_parameters(
        const std::vector<rclcpp::Parameter> & parameters);
    «ENDIF»
};

} // namespace «pkg.name.toLowerCase»
'''

    def String compileSource(Package pkg, Node node) {
        compileSource(pkg, node, toCamelCase(node.artifactName))
    }

    def String compileSource(Package pkg, Node node, String artCamel) '''
#include "«pkg.name.toLowerCase»/«artCamel»Wrapper.hpp"

namespace «pkg.name.toLowerCase» {

«artCamel»Wrapper::«artCamel»Wrapper(const rclcpp::NodeOptions & options)
: «IF node.isLifecycle»rclcpp_lifecycle::LifecycleNode«ELSE»rclcpp::Node«ENDIF»("«node.name»", options)
{
    client_cb_group_ = this->create_callback_group(rclcpp::CallbackGroupType::Reentrant);

    // ----------------------------------------------------
    // 1. Parameter Declarations (with and without defaults)
    // ----------------------------------------------------
    «FOR param : node.parameter»
    «val cppType = getCppType(param.type)»
    «val defaultVal = getParamDefaultValueCpp(param)»
    {
        rcl_interfaces::msg::ParameterDescriptor desc;
        desc.description = "Parameter '«param.name»' modelled in RosTooling";
        desc.read_only = false;
        «IF defaultVal !== null»
        this->declare_parameter<«cppType»>("«param.name»", «defaultVal», desc);
        this->get_parameter("«param.name»", param_«sanitizeName(param.name)»_);
        «ELSE»
        // Typed declaration without default value (supplied via launch file / .rossystem at runtime)
        this->declare_parameter<«cppType»>("«param.name»", desc);
        «cppType» loaded_val;
        if (this->get_parameter("«param.name»", loaded_val)) {
            param_«sanitizeName(param.name)»_ = loaded_val;
        } else {
            RCLCPP_WARN(this->get_logger(), "Parameter '«param.name»' not provided at startup; remains uninitialized.");
        }
        «ENDIF»
    }
    «ENDFOR»
    «IF !node.parameter.empty»
    param_cb_handle_ = this->add_on_set_parameters_callback(
        std::bind(&«artCamel»Wrapper::internal_on_set_parameters, this, std::placeholders::_1));
    «ENDIF»
    // ----------------------------------------------------
    // 2. Publishers Initialization
    // ----------------------------------------------------
    «FOR pub : node.publisher»
    pub_«sanitizeName(pub.name)»_ = this->create_publisher<«pub.message.specPackage»::msg::«pub.message.specName»>(
        "«pub.name»", «getQosCpp(pub.qos)»);
    «ENDFOR»

    // ----------------------------------------------------
    // 3. Subscribers Initialization
    // ----------------------------------------------------
    «FOR sub : node.subscriber»
    sub_«sanitizeName(sub.name)»_ = this->create_subscription<«sub.message.specPackage»::msg::«sub.message.specName»>(
        "«sub.name»", «getQosCpp(sub.qos)»,
        [this](const «sub.message.specPackage»::msg::«sub.message.specName»::SharedPtr msg) {
            {
                std::lock_guard<std::mutex> lock(sub_«sanitizeName(sub.name)»_mutex_);
                latest_sub_«sanitizeName(sub.name)»_msg_ = *msg;
                has_new_sub_«sanitizeName(sub.name)»_msg_ = true;
            }
            this->on_«sanitizeName(sub.name)»_msg(msg);
        });
    «ENDFOR»

    // ----------------------------------------------------
    // 4. Service Servers Initialization
    // ----------------------------------------------------
    «FOR srv : node.serviceserver»
    srv_«sanitizeName(srv.name)»_ = this->create_service<«srv.service.specPackage»::srv::«srv.service.specName»>(
        "«srv.name»",
        [this](const std::shared_ptr<«srv.service.specPackage»::srv::«srv.service.specName»::Request> req,
               std::shared_ptr<«srv.service.specPackage»::srv::«srv.service.specName»::Response> res) {
            this->handle_«sanitizeName(srv.name)»(req, res);
        },
        rclcpp::ServicesQoS(),
        client_cb_group_);
    «ENDFOR»

    // ----------------------------------------------------
    // 5. Service Clients Initialization
    // ----------------------------------------------------
    «FOR client : node.serviceclient»
    client_«sanitizeName(client.name)»_ = this->create_client<«client.service.specPackage»::srv::«client.service.specName»>(
        "«client.name»", rclcpp::ServicesQoS(), client_cb_group_);
    «ENDFOR»

    // ----------------------------------------------------
    // 6. Action Servers Initialization
    // ----------------------------------------------------
    «FOR act : node.actionserver»
    action_server_«sanitizeName(act.name)»_ = rclcpp_action::create_server<«act.action.specName»>(
        this,
        "«act.name»",
        std::bind(&«artCamel»Wrapper::on_«sanitizeName(act.name)»_goal, this, std::placeholders::_1, std::placeholders::_2),
        std::bind(&«artCamel»Wrapper::on_«sanitizeName(act.name)»_cancel, this, std::placeholders::_1),
        [this](const std::shared_ptr<GoalHandle«act.action.specName»> handle) {
            std::thread([this, handle]() {
                this->execute_«sanitizeName(act.name)»(handle);
            }).detach();
        });
    «ENDFOR»

    // ----------------------------------------------------
    // 7. Action Clients Initialization
    // ----------------------------------------------------
    «FOR actClient : node.actionclient»
    action_client_«sanitizeName(actClient.name)»_ = rclcpp_action::create_client<«actClient.action.specName»Client>(
        this, "«actClient.name»");
    «ENDFOR»
}

// Outgoing Publisher implementations
«FOR pub : node.publisher»
void «artCamel»Wrapper::publish_«sanitizeName(pub.name)»(const «pub.message.specPackage»::msg::«pub.message.specName» & msg) {
    if (pub_«sanitizeName(pub.name)»_) {
        pub_«sanitizeName(pub.name)»_->publish(msg);
    }
}
«ENDFOR»

// Outgoing Service Client implementations
«FOR client : node.serviceclient»
bool «artCamel»Wrapper::is_«sanitizeName(client.name)»_ready(std::chrono::nanoseconds timeout) {
    return client_«sanitizeName(client.name)»_->wait_for_service(timeout);
}

rclcpp::Client<«artCamel»Wrapper::«client.service.specName»>::SharedFuture 
«artCamel»Wrapper::call_«sanitizeName(client.name)»_async(std::shared_ptr<«client.service.specName»::Request> request) {
    return client_«sanitizeName(client.name)»_->async_send_request(request).future.share();
}

void «artCamel»Wrapper::call_«sanitizeName(client.name)»_async(
    std::shared_ptr<«client.service.specName»::Request> request,
    std::function<void(rclcpp::Client<«client.service.specName»>::SharedFuture)> callback)
{
    if (!is_«sanitizeName(client.name)»_ready(std::chrono::seconds(10))) {
        RCLCPP_ERROR(this->get_logger(), "Service '«client.name»' not available after waiting");
        return;
    }
    client_«sanitizeName(client.name)»_->async_send_request(request, std::move(callback));
}

std::optional<«artCamel»Wrapper::«client.service.specName»::Response> 
«artCamel»Wrapper::call_«sanitizeName(client.name)»_sync(
    const «client.service.specName»::Request & request,
    std::chrono::nanoseconds timeout)
{
    if (!is_«sanitizeName(client.name)»_ready(timeout)) {
        RCLCPP_ERROR(this->get_logger(), "Service '«client.name»' is not available for sync call.");
        return std::nullopt;
    }
    auto req = std::make_shared<«client.service.specName»::Request>(request);
    auto future = client_«sanitizeName(client.name)»_->async_send_request(req);
    if (future.wait_for(timeout) == std::future_status::ready) {
        return *future.get();
    }
    RCLCPP_ERROR(this->get_logger(), "Sync call to service '«client.name»' timed out.");
    return std::nullopt;
}
«ENDFOR»

// Outgoing Action Client implementations
«FOR actClient : node.actionclient»
std::shared_future<«artCamel»Wrapper::ClientGoalHandle«actClient.action.specName»::SharedPtr> 
«artCamel»Wrapper::send_«sanitizeName(actClient.name)»_goal_async(
    const «actClient.action.specName»Client::Goal & goal,
    std::function<void(ClientGoalHandle«actClient.action.specName»::SharedPtr)> goal_response_cb,
    std::function<void(ClientGoalHandle«actClient.action.specName»::SharedPtr, const std::shared_ptr<const «actClient.action.specName»Client::Feedback>)> feedback_cb,
    std::function<void(const ClientGoalHandle«actClient.action.specName»::WrappedResult &)> result_cb,
    std::chrono::nanoseconds timeout)
{
    if (!action_client_«sanitizeName(actClient.name)»_->wait_for_action_server(timeout)) {
        RCLCPP_ERROR(this->get_logger(), "Action server '«actClient.name»' not available after waiting");
        if (goal_response_cb) {
            goal_response_cb(nullptr);
        }
        return {};
    }
    auto send_goal_options = rclcpp_action::Client<«actClient.action.specName»Client>::SendGoalOptions();
    if (goal_response_cb) send_goal_options.goal_response_callback = goal_response_cb;
    if (feedback_cb) send_goal_options.feedback_callback = feedback_cb;
    if (result_cb) send_goal_options.result_callback = result_cb;
    return action_client_«sanitizeName(actClient.name)»_->async_send_goal(goal, send_goal_options);
}

void «artCamel»Wrapper::cancel_«sanitizeName(actClient.name)»_goal_async(
    std::shared_ptr<ClientGoalHandle«actClient.action.specName»> goal_handle)
{
    if (action_client_«sanitizeName(actClient.name)»_ && goal_handle) {
        action_client_«sanitizeName(actClient.name)»_->async_cancel_goal(goal_handle);
    }
}

void «artCamel»Wrapper::cancel_all_«sanitizeName(actClient.name)»_goals_async()
{
    if (action_client_«sanitizeName(actClient.name)»_) {
        action_client_«sanitizeName(actClient.name)»_->async_cancel_all_goals();
    }
}

bool «artCamel»Wrapper::wait_for_«sanitizeName(actClient.name)»_server(
    std::chrono::nanoseconds timeout)
{
    if (!action_client_«sanitizeName(actClient.name)»_) return false;
    return action_client_«sanitizeName(actClient.name)»_->wait_for_action_server(timeout);
}

bool «artCamel»Wrapper::is_«sanitizeName(actClient.name)»_server_ready() const
{
    if (!action_client_«sanitizeName(actClient.name)»_) return false;
    return action_client_«sanitizeName(actClient.name)»_->action_server_is_ready();
}
«ENDFOR»

// Action Server Feedback helper
«FOR act : node.actionserver»
void «artCamel»Wrapper::publish_«sanitizeName(act.name)»_feedback(
    std::shared_ptr<GoalHandle«act.action.specName»> goal_handle,
    std::shared_ptr<«act.action.specName»::Feedback> feedback)
{
    if (goal_handle && feedback) {
        goal_handle->publish_feedback(feedback);
    }
}
«ENDFOR»

// Dynamic parameter update handling
«IF !node.parameter.empty»
rcl_interfaces::msg::SetParametersResult «artCamel»Wrapper::internal_on_set_parameters(
    const std::vector<rclcpp::Parameter> & parameters)
{
    auto validation_res = this->on_parameters_changed(parameters);
    if (!validation_res.successful) {
        return validation_res;
    }
    for (const auto & param : parameters) {
        «FOR param : node.parameter»
        «val cppType = getCppType(param.type)»
        if (param.get_name() == "«param.name»") {
            param_«sanitizeName(param.name)»_ = param.get_value<«cppType»>();
            RCLCPP_INFO(this->get_logger(), "Parameter '«param.name»' dynamically updated.");
        }
        «ENDFOR»
    }
    rcl_interfaces::msg::SetParametersResult res;
    res.successful = true;
    return res;
}
«ENDIF»

«IF node.isLifecycle»
«artCamel»Wrapper::CallbackReturn «artCamel»Wrapper::on_configure(const rclcpp_lifecycle::State & state)
{
    (void)state;
    RCLCPP_INFO(this->get_logger(), "Configuring node '%s'", this->get_name());
    return CallbackReturn::SUCCESS;
}

«artCamel»Wrapper::CallbackReturn «artCamel»Wrapper::on_activate(const rclcpp_lifecycle::State & state)
{
    (void)state;
    RCLCPP_INFO(this->get_logger(), "Activating node '%s'", this->get_name());
    «FOR pub : node.publisher»
    «IF isPubActiveIn(pub, "ACTIVE")»
    if (pub_«sanitizeName(pub.name)»_) {
        pub_«sanitizeName(pub.name)»_->on_activate();
    }
    «ENDIF»
    «ENDFOR»
    return CallbackReturn::SUCCESS;
}

«artCamel»Wrapper::CallbackReturn «artCamel»Wrapper::on_deactivate(const rclcpp_lifecycle::State & state)
{
    (void)state;
    RCLCPP_INFO(this->get_logger(), "Deactivating node '%s'", this->get_name());
    «FOR pub : node.publisher»
    «IF isPubActiveIn(pub, "ACTIVE")»
    if (pub_«sanitizeName(pub.name)»_) {
        pub_«sanitizeName(pub.name)»_->on_deactivate();
    }
    «ENDIF»
    «ENDFOR»
    return CallbackReturn::SUCCESS;
}

«artCamel»Wrapper::CallbackReturn «artCamel»Wrapper::on_cleanup(const rclcpp_lifecycle::State & state)
{
    (void)state;
    RCLCPP_INFO(this->get_logger(), "Cleaning up node '%s'", this->get_name());
    return CallbackReturn::SUCCESS;
}

«artCamel»Wrapper::CallbackReturn «artCamel»Wrapper::on_shutdown(const rclcpp_lifecycle::State & state)
{
    (void)state;
    RCLCPP_INFO(this->get_logger(), "Shutting down node '%s'", this->get_name());
    return CallbackReturn::SUCCESS;
}

«artCamel»Wrapper::CallbackReturn «artCamel»Wrapper::on_error(const rclcpp_lifecycle::State & state)
{
    (void)state;
    RCLCPP_ERROR(this->get_logger(), "Error in lifecycle node '%s'", this->get_name());
    return CallbackReturn::SUCCESS;
}
«ENDIF»

} // namespace «pkg.name.toLowerCase»
'''

    def String compileCoreLogicStub(Package pkg, Node node) {
        compileCoreLogicStub(pkg, node, toCamelCase(node.artifactName))
    }

    def String compileCoreLogicStub(Package pkg, Node node, String artCamel) '''
#pragma once

#include <iostream>
#include <memory>
#include <string>
#include <vector>
#include <optional>
#include <functional>
#include <chrono>
#include <thread>
#include <stdexcept>

// Interface message/service/action headers for pure data structs
«FOR pub : node.publisher»
#include "«pub.message.specPackage»/msg/«toSnakeCase(pub.message.specName)».hpp"
«ENDFOR»
«FOR sub : node.subscriber»
#include "«sub.message.specPackage»/msg/«toSnakeCase(sub.message.specName)».hpp"
«ENDFOR»
«FOR srv : node.serviceserver»
#include "«srv.service.specPackage»/srv/«toSnakeCase(srv.service.specName)».hpp"
«ENDFOR»
«FOR client : node.serviceclient»
#include "«client.service.specPackage»/srv/«toSnakeCase(client.service.specName)».hpp"
«ENDFOR»
«FOR act : node.actionserver»
#include "«act.action.specPackage»/action/«toSnakeCase(act.action.specName)».hpp"
«ENDFOR»
«FOR actClient : node.actionclient»
#include "«actClient.action.specPackage»/action/«toSnakeCase(actClient.action.specName)».hpp"
«ENDFOR»

namespace «pkg.name.toLowerCase» {

/**
 * @brief Pure C++ validation result (no rcl_interfaces dependencies)
 */
struct ValidationResult {
    bool successful{true};
    std::string reason{""};
    static ValidationResult ok() {
        return {true, ""};
    }
    static ValidationResult reject(const std::string & reason) {
        return {false, reason};
    }
};

/**
 * @brief Pure C++ action goal terminal status (no rclcpp_action or action_msgs dependencies)
 */
enum class GoalStatus {
    UNKNOWN = 0,
    SUCCEEDED = 1,
    CANCELED = 2,
    ABORTED = 3
};

/**
 * @brief Abstract Rate interface with zero ROS 2 dependencies
 */
class Rate {
public:
    virtual ~Rate() = default;
    virtual bool sleep() = 0;
    virtual void reset() = 0;
};

using RatePtr = std::shared_ptr<Rate>;
using RateFactory = std::function<RatePtr(double hz)>;

/**
 * @brief Default fallback rate using standard C++ steady_clock (used in unit tests / standalone)
 */
class DefaultSteadyRate : public Rate {
public:
    explicit DefaultSteadyRate(double hz)
    : period_(std::chrono::duration_cast<std::chrono::nanoseconds>(
          std::chrono::duration<double>(1.0 / hz))),
      last_time_(std::chrono::steady_clock::now())
    {}

    bool sleep() override {
        auto now = std::chrono::steady_clock::now();
        auto next = last_time_ + period_;
        if (now < next) {
            std::this_thread::sleep_for(next - now);
        }
        last_time_ = std::chrono::steady_clock::now();
        return true;
    }

    void reset() override {
        last_time_ = std::chrono::steady_clock::now();
    }

private:
    std::chrono::nanoseconds period_;
    std::chrono::steady_clock::time_point last_time_;
};

/**
 * @brief Pure Core Logic class for '«node.name»' (Artifact: '«node.artifactName»').
 * Contains ZERO ROS 2 runtime node / executor dependencies!
 * Implement your business logic, algorithms, and signal handling here.
 * This file is generated once and will NEVER be overwritten.
 */
class «artCamel»Algorithm {
public:
    «artCamel»Algorithm() = default;
    virtual ~«artCamel»Algorithm() = default;

    «IF node.isLifecycle»
    // ==========================================
    // LIFECYCLE TRANSITION HOOKS (Pure C++ / Zero ROS 2 dependencies)
    // ==========================================
    virtual bool on_configure() {
        return true;
    }

    virtual bool on_activate() {
        return true;
    }

    virtual bool on_deactivate() {
        return true;
    }

    virtual bool on_cleanup() {
        return true;
    }

    virtual bool on_shutdown() {
        return true;
    }

    virtual bool on_error() {
        return true;
    }
    «ENDIF»

    // ==========================================
    // 1. INBOUND SUBSCRIBER MESSAGE HANDLERS
    // ==========================================
    «FOR sub : node.subscriber»
    /**
     * @brief Callback invoked when a new message is received on topic '«sub.name»'
     */
    virtual void on_«sanitizeName(sub.name)»_received(const «sub.message.specPackage»::msg::«sub.message.specName» & msg) {
        (void)msg;
        // TODO: Process incoming message data
    }

    «ENDFOR»
    // ==========================================
    // 2. INBOUND SERVICE REQUEST HANDLERS
    // ==========================================
    «FOR srv : node.serviceserver»
    /**
     * @brief Handler for service '«srv.name»'
     * @return true if successfully processed, false to indicate failure
     */
    virtual bool handle_«sanitizeName(srv.name)»(
        const «srv.service.specPackage»::srv::«srv.service.specName»::Request & req,
        «srv.service.specPackage»::srv::«srv.service.specName»::Response & res)
    {
        (void)req;
        (void)res;
        // TODO: Process request fields and populate response fields
        return true;
    }

    «ENDFOR»
    // ==========================================
    // 3. INBOUND ACTION SERVER HANDLERS
    // ==========================================
    «FOR act : node.actionserver»
    using «act.action.specName»Goal = «act.action.specPackage»::action::«act.action.specName»::Goal;
    using «act.action.specName»Feedback = «act.action.specPackage»::action::«act.action.specName»::Feedback;
    using «act.action.specName»Result = «act.action.specPackage»::action::«act.action.specName»::Result;

    /**
     * @brief Decides whether to accept or reject a goal request for action '«act.name»'
     * @return true to accept and execute, false to reject
     */
    virtual bool handle_goal_«sanitizeName(act.name)»(const «act.action.specName»Goal & goal) {
        (void)goal;
        return true; // Default: accept all valid goals
    }

    /**
     * @brief Decides whether to accept or reject a cancellation request for action '«act.name»'
     * @return true to accept cancellation, false to reject
     */
    virtual bool handle_cancel_«sanitizeName(act.name)»() {
        return true; // Default: accept cancellation
    }

    /**
     * @brief Executes the accepted goal for action '«act.name»'
     * @param goal The accepted goal parameters
     * @param publish_feedback Stream intermediate progress updates
     * @param is_canceling Check if the action client requested cancellation
     * @param result Output result to populate
     * @return true if goal succeeded, false if aborted
     */
    virtual bool execute_«sanitizeName(act.name)»(
        const «act.action.specName»Goal & goal,
        std::function<void(const «act.action.specName»Feedback &)> publish_feedback,
        std::function<bool()> is_canceling,
        «act.action.specName»Result & result)
    {
        (void)goal;
        (void)publish_feedback;
        (void)is_canceling;
        (void)result;
        // TODO: Implement long-running execution logic
        return true;
    }

    «ENDFOR»
    // ==========================================
    // 4. OUTBOUND PUBLISHER METHODS
    // ==========================================
    «FOR pub : node.publisher»
    using «pub.name»PubFn = std::function<void(const «pub.message.specPackage»::msg::«pub.message.specName» &)>;
    void set_«sanitizeName(pub.name)»_publisher(«pub.name»PubFn fn) { publish_«sanitizeName(pub.name)»_fn_ = fn; }
    void publish_«sanitizeName(pub.name)»(const «pub.message.specPackage»::msg::«pub.message.specName» & msg) {
        if (publish_«sanitizeName(pub.name)»_fn_) publish_«sanitizeName(pub.name)»_fn_(msg);
    }

    «ENDFOR»
    // ==========================================
    // 5. OUTBOUND SERVICE CLIENT CALLERS
    // ==========================================
    «FOR client : node.serviceclient»
    using «client.name»SyncCaller = std::function<std::optional<«client.service.specPackage»::srv::«client.service.specName»::Response>(const «client.service.specPackage»::srv::«client.service.specName»::Request &, const std::chrono::nanoseconds &)>;
    using «client.name»AsyncCaller = std::function<void(const «client.service.specPackage»::srv::«client.service.specName»::Request &, std::function<void(const «client.service.specPackage»::srv::«client.service.specName»::Response &)>)>;

    void set_«sanitizeName(client.name)»_client(«client.name»SyncCaller sync_fn, «client.name»AsyncCaller async_fn) {
        call_«sanitizeName(client.name)»_sync_fn_ = sync_fn;
        call_«sanitizeName(client.name)»_async_fn_ = async_fn;
    }

    std::optional<«client.service.specPackage»::srv::«client.service.specName»::Response> call_«sanitizeName(client.name)»_sync(
        const «client.service.specPackage»::srv::«client.service.specName»::Request & req,
        const std::chrono::milliseconds & timeout) // Can be changed to any other duration form.
    {
        if (call_«sanitizeName(client.name)»_sync_fn_) return call_«sanitizeName(client.name)»_sync_fn_(req, timeout);
        return std::nullopt;
    }

    void call_«sanitizeName(client.name)»_async(
        const «client.service.specPackage»::srv::«client.service.specName»::Request & req,
        std::function<void(const «client.service.specPackage»::srv::«client.service.specName»::Response &)> cb)
    {
        if (call_«sanitizeName(client.name)»_async_fn_) call_«sanitizeName(client.name)»_async_fn_(req, cb);
    }

    «ENDFOR»
    // ==========================================
    // 6. OUTBOUND ACTION CLIENT CALLERS
    // ==========================================
    «FOR actClient : node.actionclient»
    using «actClient.name»GoalCaller = std::function<void(
        const «actClient.action.specPackage»::action::«actClient.action.specName»::Goal &,
        std::function<void(bool)>,
        std::function<void(const «actClient.action.specPackage»::action::«actClient.action.specName»::Feedback &)>,
        std::function<void(GoalStatus, const «actClient.action.specPackage»::action::«actClient.action.specName»::Result &)>,
        std::chrono::nanoseconds)>;
    using «actClient.name»CancelCaller = std::function<void()>;
    using «actClient.name»WaitServerCaller = std::function<bool(std::chrono::nanoseconds)>;
    using «actClient.name»IsServerReadyCaller = std::function<bool()>;

    void set_«sanitizeName(actClient.name)»_client(
        «actClient.name»GoalCaller goal_fn,
        «actClient.name»CancelCaller cancel_fn,
        «actClient.name»WaitServerCaller wait_server_fn = nullptr,
        «actClient.name»IsServerReadyCaller is_ready_fn = nullptr)
    {
        send_«sanitizeName(actClient.name)»_goal_fn_ = goal_fn;
        cancel_«sanitizeName(actClient.name)»_goal_fn_ = cancel_fn;
        wait_«sanitizeName(actClient.name)»_server_fn_ = wait_server_fn;
        is_«sanitizeName(actClient.name)»_server_ready_fn_ = is_ready_fn;
    }

    void set_«sanitizeName(actClient.name)»_server_timeout(std::chrono::nanoseconds timeout) {
        «sanitizeName(actClient.name)»_server_timeout_ = timeout;
    }

    template <typename Rep, typename Period>
    void set_«sanitizeName(actClient.name)»_server_timeout(std::chrono::duration<Rep, Period> timeout) {
        «sanitizeName(actClient.name)»_server_timeout_ = std::chrono::duration_cast<std::chrono::nanoseconds>(timeout);
    }

    std::chrono::nanoseconds get_«sanitizeName(actClient.name)»_server_timeout() const {
        return «sanitizeName(actClient.name)»_server_timeout_;
    }

    void send_«sanitizeName(actClient.name)»_goal_async(
        const «actClient.action.specPackage»::action::«actClient.action.specName»::Goal & goal,
        std::function<void(bool)> response_cb = nullptr,
        std::function<void(const «actClient.action.specPackage»::action::«actClient.action.specName»::Feedback &)> feedback_cb = nullptr,
        std::function<void(GoalStatus, const «actClient.action.specPackage»::action::«actClient.action.specName»::Result &)> result_cb = nullptr,
        std::optional<std::chrono::nanoseconds> timeout = std::nullopt)
    {
        auto effective_timeout = timeout.value_or(«sanitizeName(actClient.name)»_server_timeout_);
        if (send_«sanitizeName(actClient.name)»_goal_fn_) {
            send_«sanitizeName(actClient.name)»_goal_fn_(goal, response_cb, feedback_cb, result_cb, effective_timeout);
        }
    }

    void cancel_«sanitizeName(actClient.name)»_goal_async() {
        if (cancel_«sanitizeName(actClient.name)»_goal_fn_) cancel_«sanitizeName(actClient.name)»_goal_fn_();
    }

    bool wait_for_«sanitizeName(actClient.name)»_server(std::chrono::nanoseconds timeout = std::chrono::seconds(5)) {
        if (wait_«sanitizeName(actClient.name)»_server_fn_) return wait_«sanitizeName(actClient.name)»_server_fn_(timeout);
        return false;
    }

    bool is_«sanitizeName(actClient.name)»_server_ready() const {
        if (is_«sanitizeName(actClient.name)»_server_ready_fn_) return is_«sanitizeName(actClient.name)»_server_ready_fn_();
        return false;
    }

    «ENDFOR»
    // ==========================================
    // 7. TIMER FACTORY INTERFACE
    // ==========================================
    using TimerHandle = std::shared_ptr<void>;
    using TimerFactory = std::function<TimerHandle(std::chrono::nanoseconds, std::function<void()>)>;

    /**
     * @brief Injects the platform/ROS timer creation factory.
     */
    void set_timer_factory(TimerFactory factory) {
        timer_factory_ = factory;
    }

    /**
     * @brief Spawns a periodic timer driven by the node executor (respects simulation time /clock).
     * @tparam Rep Duration representation
     * @tparam Period Duration ratio
     * @param period Timer interval duration (e.g. std::chrono::milliseconds(100))
     * @param callback Callback executed on every tick
     * @return TimerHandle RAII handle keeping the timer alive
     */
    template <typename Rep, typename Period>
    TimerHandle create_timer(std::chrono::duration<Rep, Period> period, std::function<void()> callback) {
        if (timer_factory_) {
            return timer_factory_(std::chrono::duration_cast<std::chrono::nanoseconds>(period), callback);
        }
        return nullptr;
    }

    /**
     * @brief Spawns a periodic timer specified in fractional seconds (e.g. 0.5 for 500ms).
     * @param period_seconds Timer interval in seconds
     * @param callback Callback executed on every tick
     * @return TimerHandle RAII handle keeping the timer alive
     */
    TimerHandle create_timer(double period_seconds, std::function<void()> callback) {
        if (timer_factory_) {
            auto nanos = std::chrono::duration_cast<std::chrono::nanoseconds>(
                std::chrono::duration<double>(period_seconds)
            );
            return timer_factory_(nanos, callback);
        }
        return nullptr;
    }

    // ==========================================
    // 8. RATE FACTORY INTERFACE
    // ==========================================
    /**
     * @brief Injects the platform/ROS rate creation factory.
     */
    void set_rate_factory(RateFactory factory) {
        rate_factory_ = factory;
    }

    /**
     * @brief Creates a rate object. In ROS 2, respects simulation clock (/clock).
     * In unit tests / standalone, falls back to steady wall clock.
     * @param frequency_hz Desired execution frequency in Hertz
     * @return RatePtr RAII handle providing sleep() and reset()
     */
    RatePtr create_rate(double frequency_hz) {
        if (rate_factory_) {
            return rate_factory_(frequency_hz);
        }
        return std::make_shared<DefaultSteadyRate>(frequency_hz);
    }

    // ==========================================
    // 9. LOGGER FACTORY INTERFACE
    // ==========================================
    enum class LogLevel {
        DEBUG,
        INFO,
        WARN,
        ERROR
    };
     
    using LogFunction = std::function<void(LogLevel level, const std::string & message)>;

    /**
     *@brief Injects the ROS/platform logger macro.
     */
    void set_logger(LogFunction logger_func) {
        logger_ = logger_func;
    }

    /**
    * @brief Logs a debug level message via platform logger
    * @param message the std::string to be logged
    */
    void log_debug(const std::string & message) {
        logger_(LogLevel::DEBUG, message);
    }
    /**
    * @brief Logs an info level message via platform logger
    * @param message the std::string to be logged
    */
    void log_info(const std::string & message) {
        logger_(LogLevel::INFO, message);
    }
    /**
    * @brief Logs a warn level message via platform logger
    * @param message the std::string to be logged
    */
    void log_warn(const std::string & message) {
        logger_(LogLevel::WARN, message);
    }
    /**
    * @brief Logs an error level message via platform logger
    * @param message the std::string to be logged
    */
    void log_error(const std::string & message) {
        logger_(LogLevel::ERROR, message);
    }
    
    // ==========================================
    // 9. PARAMETER HOOKS
    // ==========================================
    
    using ParameterValue = std::variant<
    std::monostate,
    bool,
    int64_t,
    double,
    std::string,
    std::vector<uint8_t>,
    std::vector<bool>,
    std::vector<int64_t>,
    std::vector<double>,
    std::vector<std::string>
    >;
    
    /**
     * @brief Parameter setter used by the runner
     * @param name Name of the parameter
     * @param value Value of the paramter
     */
    void set_parameter(const std::string & name, const ParameterValue & value) {
        parameters_[name] = value;
    }

    /**
     * @brief  Parameter getter based on parameter name
     * @param name Name of the parameter
     * @param default_val Default value to return in paramter nonexistant
     * @return Parameter value or default value
     */
    template<typename T>
    T get_param(const std::string & name, const T & default_val) const {
        auto it = parameters_.find(name);
        if (it != parameters_.cend()) {
            if (auto val_ptr = std::get_if<T>(&it->second))
            return *val_ptr;
        }
        return default_val;
    }

    /**
     * @brief Validation Hook to inspect proposed parameter values and reject invalid ones.
     * @param name Name of parameter being validated
     * @param proposed_value The new value requested
     * @return ValidationResult::ok() to accept, or ValidationResult::reject("reason") to reject
     */
    virtual ValidationResult validate_parameter(const std::string & name, const ParameterValue & proposed_value) {
        (void)name;
        (void)proposed_value;
        return ValidationResult::ok();
    }
    
    /**
    * @brief Method to carry out reactive changes based on parameter changes
    * @param name Name of changed parameter
    * @param value Value of the changed parameter
    */
    virtual void on_parameter_changed(const std::string & name, const ParameterValue & value) {
        (void)name;
        (void)value;
    }

    // ==========================================
    // 10. RUNTIME & PLATFORM SERVICES (ok, shutdown, now, sleep_for)
    // ==========================================
    using OkHandler = std::function<bool()>;
    using ShutdownHandler = std::function<void(const std::string &)>;
    using ClockHandler = std::function<std::chrono::nanoseconds()>;
    using SleepHandler = std::function<bool(std::chrono::nanoseconds)>;

    /**
     * @brief Injects the runtime liveness check handler.
     */
    void set_ok_handler(OkHandler handler) {
        ok_handler_ = std::move(handler);
    }

    /**
     * @brief Check if the runtime platform is still healthy/running.
     * @throws std::logic_error if no mock or runner has injected the predicate.
     */
    bool ok() const {
        if (!ok_handler_) {
            throw std::logic_error(
                "Liveness predicate not injected. In unit tests, configure a mock via set_ok_handler()."
            );
        }
        return ok_handler_();
    }

    /**
     * @brief Injects the runtime shutdown handler.
     */
    void set_shutdown_handler(ShutdownHandler handler) {
        shutdown_handler_ = std::move(handler);
    }

    /**
     * @brief Request graceful shutdown of the node/system.
     * @param reason Optional human-readable reason for shutdown.
     * @throws std::logic_error if no mock or runner has injected the handler.
     */
    void shutdown(const std::string & reason = "") {
        if (!shutdown_handler_) {
            throw std::logic_error(
                "Shutdown handler not injected. In unit tests, configure a mock via set_shutdown_handler()."
            );
        }
        shutdown_handler_(reason);
    }

    /**
     * @brief Injects the simulation-aware clock query handler.
     */
    void set_clock_handler(ClockHandler handler) {
        clock_handler_ = std::move(handler);
    }

    /**
     * @brief Current time respecting simulation clock (/clock).
     * @return Nanoseconds since epoch.
     * @throws std::logic_error if no mock or runner has injected the handler.
     */
    std::chrono::nanoseconds now() const {
        if (!clock_handler_) {
            throw std::logic_error(
                "Clock handler not injected. In unit tests, configure a mock via set_clock_handler()."
            );
        }
        return clock_handler_();
    }

    /**
     * @brief Current time in fractional seconds respecting simulation clock.
     */
    double now_seconds() const {
        return std::chrono::duration<double>(now()).count();
    }

    /**
     * @brief Injects the simulation-aware sleep handler.
     */
    void set_sleep_handler(SleepHandler handler) {
        sleep_handler_ = std::move(handler);
    }

    /**
     * @brief Sleep for a duration respecting simulation clock (/clock).
     * @param duration Duration to sleep (e.g. std::chrono::milliseconds(500))
     * @return true if full duration slept, false if interrupted/shutdown.
     * @throws std::logic_error if no mock or runner has injected the handler.
     */
    bool sleep_for(std::chrono::nanoseconds duration) {
        if (!sleep_handler_) {
            throw std::logic_error(
                "Sleep handler not injected. In unit tests, configure a mock via set_sleep_handler()."
            );
        }
        return sleep_handler_(duration);
    }

    /**
     * @brief Sleep for a duration in seconds respecting simulation clock.
     * @param seconds Duration in seconds (e.g. 0.5)
     * @return true if full duration slept, false if interrupted/shutdown.
     */
    bool sleep_for_seconds(double seconds) {
        return sleep_for(std::chrono::duration_cast<std::chrono::nanoseconds>(
            std::chrono::duration<double>(seconds)));
    }
        
private:
    TimerFactory timer_factory_;
    RateFactory rate_factory_;
    LogFunction logger_;
    OkHandler ok_handler_;
    ShutdownHandler shutdown_handler_;
    ClockHandler clock_handler_;
    SleepHandler sleep_handler_;
    std::unordered_map<std::string, ParameterValue> parameters_;
    «FOR pub : node.publisher»
    «pub.name»PubFn publish_«sanitizeName(pub.name)»_fn_;
    «ENDFOR»
    «FOR client : node.serviceclient»
    «client.name»SyncCaller call_«sanitizeName(client.name)»_sync_fn_;
    «client.name»AsyncCaller call_«sanitizeName(client.name)»_async_fn_;
    «ENDFOR»
    «FOR actClient : node.actionclient»
    «actClient.name»GoalCaller send_«sanitizeName(actClient.name)»_goal_fn_;
    «actClient.name»CancelCaller cancel_«sanitizeName(actClient.name)»_goal_fn_;
    «actClient.name»WaitServerCaller wait_«sanitizeName(actClient.name)»_server_fn_;
    «actClient.name»IsServerReadyCaller is_«sanitizeName(actClient.name)»_server_ready_fn_;
    std::chrono::nanoseconds «sanitizeName(actClient.name)»_server_timeout_{std::chrono::seconds(10)};
    «ENDFOR»
};

} // namespace «pkg.name.toLowerCase»
'''

}
