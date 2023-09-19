package de.fraunhofer.ipa.rossystem.generator

import system.RosNode
import ros.RosPackage
import ros.Artifact
import system.System
import ros.AmentPackage
import ros.impl.AmentPackageImpl

class LaunchFileCompiler_ROS2 {


    def compile_toROS2launch(System system) '''
from launch import LaunchDescription
from launch_ros.actions import Node

def generate_launch_description():
    ld = LaunchDescription()

    «FOR component:system.components»
    «(component as RosNode).name» = Node(
        package="«((component as RosNode).from.eContainer.eContainer as AmentPackageImpl).name»",
        executable="«((component as RosNode).from.eContainer as Artifact).name»",
        name="«(component as RosNode).name»"
    )

    «ENDFOR»

    «FOR component:system.components»
    ld.add_action(«(component as RosNode).name»)
    «ENDFOR»

    return ld
    '''

//    def void compile_list_of_ROS2components(RosSystem system, ComponentStack stack) {
//        components_tmp_.clear;
//        Ros2components.clear;
//        if (stack === null){
//            components_tmp_ = system.rosComponent;
//        } else {
//            components_tmp_ =  stack.rosComponent;
//        }
//        for(ComponentInterface component:components_tmp_){
//            if (component.compile_pkg_type.toString.contains("AmentPackage")){
//                Ros2components.add(component);
//            }
//        }
//    }
//
//    def check_ns(ComponentInterface component){
//        if (component.hasNS){
//            return component.get_ns();
//        }else {
//            return "";
//        }
//    }
//
//    def List<String> InterfaceDef(String name, String type){
//        ListInterfaceDef = new ArrayList()
//        ListInterfaceDef.add(name.replace("/","_"))
//        ListInterfaceDef.add(name)
//        ListInterfaceDef.add(type)
//        return ListInterfaceDef
//    }
//
//    def boolean hasNS(ComponentInterface component){
//        if(!component.nameSpace.nullOrEmpty){
//            return true;
//        }else{
//            return false
//        }
//    }
//    def String get_ns(ComponentInterface component){
//        return component.nameSpace.replaceFirst("/","");
//    }
//
//    def String compile_remappings_str(ComponentInterface component) {
//        var remap_str = "";
//        val NS = component.check_ns();
//        for (rosPublisher : component.rospublisher) {
//            if (!((prefix(NS)+rosPublisher.name).equals(compile_topic_name(rosPublisher.publisher, NS)))) {
//                remap_str += "\t(\"" + rosPublisher.publisher.name + "\", \"" + rosPublisher.name + "\"),\n";
//            }
//        }
//        for (rosSubscriber : component.rossubscriber) {
//            if (!((prefix(NS)+rosSubscriber.name).equals(compile_topic_name(rosSubscriber.subscriber, NS)))) {
//                remap_str += "\t(\"" + rosSubscriber.subscriber.name + "\", \"" + rosSubscriber.name + "\"),\n";
//            }
//        }
//        for (rosServiceServer : component.rosserviceserver) {
//            if (!((prefix(NS)+rosServiceServer.name).equals(compile_service_name(rosServiceServer.srvserver, NS)))) {
//                remap_str += "\t(\"" + rosServiceServer.srvserver.name + "\", \"" + rosServiceServer.name + "\"),\n";
//            }
//        }
//        for (rosServiceClient : component.rosserviceclient) {
//            if (!((prefix(NS)+rosServiceClient.name).equals(compile_service_name(rosServiceClient.srvclient, NS)))) {
//                remap_str += "\t(\"" + rosServiceClient.srvclient.name + "\", \"" + rosServiceClient.name + "\"),\n";
//            }
//        }
//        for (rosActionServer : component.rosactionserver) {
//            if (!((prefix(NS)+rosActionServer.name).equals(compile_action_name(rosActionServer.actserver, NS)))) {
//                remap_str += "\t(\"" + rosActionServer.actserver.name + "\", \"" + rosActionServer.name + "\"),\n";
//            }
//        }
//        for (rosActionClient : component.rosactionclient) {
//            if (!((prefix(NS)+rosActionClient.name).equals(compile_action_name(rosActionClient.actclient, NS)))) {
//                remap_str += "\t(\"" + rosActionClient.actclient.name + "\", \"" + rosActionClient.name + "\"),\n";
//            }
//        }
//        if (!remap_str.empty) {
//            remap_str = ",\nremappings=[\n" + remap_str.substring(0,remap_str.length-2) + "]\n";
//        }
//        return remap_str;
//    }
//
//    def String compile_parameters_str(EList<RosParameter> rosParameters) {
//        param_count = rosParameters.length;
//        var param_str = "";
//        for (rosParameter : rosParameters) {
//            val param_count=param_count--;
//            if (rosParameter.parameter.type instanceof ParameterStructTypeImpl) {
//                param_str += compile_struct_str(rosParameter.value, rosParameter.parameter.name);
//            } else {
//                param_str += "{ \"" + rosParameter.parameter.name + "\" : " + get_param_value(rosParameter.value, rosParameter.parameter.name);
//            }
//            if (param_count > 1){
//                param_str +=" },\n"
//            } else {
//                param_str +=" }\n";
//            }
//        }
//        return param_str;
//    }
//
//    def String compile_struct_str(ParameterValue value, String name) {
//        var param_str = "";
//        var elem_count = (value as ParameterSequenceImpl).eContents.length;
//
//        for (elem : ((value as ParameterSequenceImpl).eContents)) {
//            var member = ((elem as ParameterStructImpl).eContents.get(0) as ParameterStructMemberImpl);
//            val param_val = get_param_value(member.getValue(), name + "/" + member.getName());
//            if (param_val.startsWith("{")) {
//                param_str += param_val;
//            } else {
//                param_str += "{ \"" + name + "/" + member.getName() + "\" : " + param_val;
//            }
//            elem_count--;
//            if (elem_count > 0){
//                param_str +=" },\n"
//            }
//        }
//        return param_str;
//    }
//
//    def String get_param_value(ParameterValue value, String name) {
//        var param_val = "";
//        if (value instanceof ParameterStringImpl) {
//            param_val = "\"" + (value as ParameterStringImpl).getValue() + "\"";
//        } else if (value instanceof ParameterIntegerImpl) {
//            param_val = (value as ParameterIntegerImpl).getValue().toString;
//        } else if (value instanceof ParameterDoubleImpl) {
//            param_val = (value as ParameterDoubleImpl).getValue().toString;
//        } else if (value instanceof ParameterBooleanImpl) {
//            param_val = (value as ParameterBooleanImpl).isValue().toString;
//        } else if (value instanceof ParameterSequenceImpl) {
//            var elem_count = (value as ParameterSequenceImpl).eContents.length;
//            if ((value as ParameterSequenceImpl).eContents.get(0) instanceof ParameterStructImpl) {
//                param_val = compile_struct_str(value, name);
//            } else {
//                param_val += "[";
//                for (elem : (value as ParameterSequenceImpl).eContents) {
//                    param_val += get_param_value(elem as ParameterValue, name);
//                    elem_count--;
//                    if (elem_count > 0){
//                        param_val +=", "
//                    }
//                }
//                param_val += "]";
//            }
//        }
//        return param_val;
//     }
}
