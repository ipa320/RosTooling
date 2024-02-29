package de.fraunhofer.ipa.rossystem.generator

import system.RosNode
import ros.Artifact
import system.System
import ros.impl.AmentPackageImpl
import system.Connection
import org.eclipse.emf.common.util.EList
import system.impl.RosSystemConnectionImpl
import system.impl.RosPublisherReferenceImpl
import system.impl.RosInterfaceImpl
import system.impl.RosSubscriberReferenceImpl
import system.impl.RosServiceServerReferenceImpl
import system.impl.RosServiceClientReferenceImpl
import system.impl.RosActionServerReferenceImpl
import system.impl.RosActionClientReferenceImpl
import com.google.inject.Inject
import ros.ParameterValue
import ros.impl.ParameterStringImpl
import ros.impl.ParameterIntegerImpl
import ros.impl.ParameterDoubleImpl
import ros.impl.ParameterBooleanImpl
import ros.impl.ParameterSequenceImpl
import ros.impl.ParameterStructImpl
import ros.impl.ParameterStructMemberImpl

class LaunchFileCompiler_ROS2 {

    @Inject extension GeneratorHelpers


    def compile_toROS2launch(System system) '''
from launch import LaunchDescription
from launch_ros.actions import Node
«IF !getSubsystems(system).empty»from ament_index_python.packages import get_package_share_directory«ENDIF»
from launch.actions import IncludeLaunchDescription, DeclareLaunchArgument
from launch.launch_description_sources import PythonLaunchDescriptionSource
from launch.substitutions import LaunchConfiguration, PythonExpression, PathJoinSubstitution, TextSubstitution

def generate_launch_description():
    ld = LaunchDescription()
    
    «FOR component:getNodes(system)»«FOR parameter:component.rosparameters»
        «parameter.name»_arg = DeclareLaunchArgument(
            "«parameter.name»", default_value=TextSubstitution(text="«get_param_value(parameter.value,parameter.name)»")
        )
        ld.add_action(«parameter.name»_arg)
    «ENDFOR»«ENDFOR»

    «FOR component:getNodes(system)»
    «(component as RosNode).name» = Node(
        package="«((component as RosNode).from.eContainer.eContainer as AmentPackageImpl).name»",«IF !component.namespace.nullOrEmpty»
        namespace="«component.namespace»",«ENDIF»
        executable="«((component as RosNode).from.eContainer as Artifact).name»",
        prefix = 'xterm -e',
        output='screen',
        name="«(component as RosNode).name»"«compile_remappings_str(component as RosNode, system.connections)»«IF !component.rosparameters.nullOrEmpty»,
        parameters=[{«FOR param:component.rosparameters»
            "«param.from.name»": LaunchConfiguration("«param.name»"),«ENDFOR»}]«ENDIF»
    )
    «ENDFOR»
    «FOR subsystem:getSubsystems(system)»
    «IF subsystem.fromFile.nullOrEmpty»
        include_«subsystem.name»= IncludeLaunchDescription(
            PythonLaunchDescriptionSource([ get_package_share_directory('«subsystem.name»') + '/launch/«subsystem.name».launch.py'])
        )
    «ELSE»
        include_«subsystem.name»= IncludeLaunchDescription(
            PythonLaunchDescriptionSource([get_package_share_directory('«subsystem.fromFile.split("/",2).get(0)»') + '/«subsystem.fromFile.split("/",2).get(1)»'])
        )
    «ENDIF»
    «ENDFOR»

    «FOR component:getNodes(system)»
    ld.add_action(«(component as RosNode).name»)
    «ENDFOR»«FOR subsystem:getSubsystems(system)»
    ld.add_action(include_«subsystem.name»)
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
    def String compile_remappings_str(RosNode node, EList<Connection> connections ) {
        var remap_str = ""
        var from_pub = new Object
        var from_srv = new Object
        var from_action = new Object
        var to_sub = new Object
        var to_srv = new Object
        var to_action = new Object

        var rename = ""

        for (connection : connections){
            var rosconnection = connection as RosSystemConnectionImpl
            if (rosconnection.from.reference.eClass.toString.contains("RosPublisherReference")){
                from_pub = rosconnection.from.reference
                rename= rosconnection.from.name

                if (rosconnection.to.reference.eClass.toString.contains("RosSubscriberReference")){
                    to_sub = rosconnection.to.reference
                }

                for ( interface : node.rosinterfaces ){
                    if ( (interface as RosInterfaceImpl).reference.toString.contains("RosPublisherReferenceImpl")){
                           if ((interface as RosInterfaceImpl).reference == from_pub){
                               if ((from_pub as RosPublisherReferenceImpl).from.name != interface.name) {
                                    remap_str += "\t(\"" + (from_pub as RosPublisherReferenceImpl).from.name + "\", \"" + rename + "\"),\n";
                               }
                           }
                        }
                    if ( (interface as RosInterfaceImpl).reference.toString.contains("RosSubscriberReferenceImpl")){
                           if ((interface as RosInterfaceImpl).reference == to_sub){
                               if ((to_sub as RosSubscriberReferenceImpl).from.name  != from_pub) {
                                    remap_str += "\t(\"" + (to_sub as RosSubscriberReferenceImpl).from.name + "\", \"" + rename + "\"),\n";
                               }
                           }
                        }
                }
            }
            if (rosconnection.from.reference.eClass.toString.contains("RosServiceServerReference")){
                from_srv = rosconnection.from.reference
                rename= rosconnection.from.name

                if (rosconnection.to.reference.eClass.toString.contains("RosServiceClientReference")){
                    to_srv = rosconnection.to.reference
                }

                for ( interface : node.rosinterfaces ){
                    if ( (interface as RosInterfaceImpl).reference.toString.contains("RosServiceServerReferenceImpl")){
                           if ((interface as RosInterfaceImpl).reference == from_srv){
                               if ((from_srv as RosServiceServerReferenceImpl).from.name != interface.name) {
                                    remap_str += "\t(\"" + (from_srv as RosServiceServerReferenceImpl).from.name + "\", \"" + rename + "\"),\n";
                               }
                           }
                        }
                    if ( (interface as RosInterfaceImpl).reference.toString.contains("RosServiceClientReferenceImpl")){
                           if ((interface as RosInterfaceImpl).reference == to_srv){
                               if ((to_srv as RosServiceClientReferenceImpl).from.name  != from_srv) {
                                    remap_str += "\t(\"" + (to_srv as RosServiceClientReferenceImpl).from.name + "\", \"" + rename + "\"),\n";
                               }
                           }
                        }
                }
        }
        if (rosconnection.from.reference.eClass.toString.contains("RosActionServerReference")){
                from_action = rosconnection.from.reference
                rename= rosconnection.from.name

                if (rosconnection.to.reference.eClass.toString.contains("RosActionClientReference")){
                    to_action = rosconnection.to.reference
                }

                for ( interface : node.rosinterfaces ){
                    if ( (interface as RosInterfaceImpl).reference.toString.contains("RosActionServerReferenceImpl")){
                           if ((interface as RosInterfaceImpl).reference == from_action){
                               if ((from_action as RosActionServerReferenceImpl).from.name != interface.name) {
                                    remap_str += "\t(\"" + (from_action as RosActionServerReferenceImpl).from.name + "\", \"" + rename + "\"),\n";
                               }
                           }
                        }
                    if ( (interface as RosInterfaceImpl).reference.toString.contains("RosActionClientReferenceImpl")){
                           if ((interface as RosInterfaceImpl).reference == to_action){
                               if ((to_action as RosActionClientReferenceImpl).from.name  != from_action) {
                                    remap_str += "\t(\"" + (to_action as RosActionClientReferenceImpl).from.name + "\", \"" + rename + "\"),\n";
                               }
                           }
                        }
                }
        }
//            if ( con_publishers.contains(interface) ){
//            }
        }
//        for (rosPublisher : interfaces.toList) {
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
        if (!remap_str.empty) {
            remap_str = ",\nremappings=[\n" + remap_str.substring(0,remap_str.length-2) + "]\n";
        }
        return remap_str;
    }
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

}
