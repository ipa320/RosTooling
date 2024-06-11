package de.fraunhofer.ipa.rossystem.generator

import system.System
import com.google.inject.Inject

class BridgesLaunchFileCompiler_ROS2 {

    @Inject extension GeneratorHelpers


    def compile_toROS2launchbridges(System system) '''
import os
from ament_index_python.packages import get_package_share_directory
from launch import LaunchDescription
from launch_ros.actions import Node
from launch.actions import IncludeLaunchDescription, DeclareLaunchArgument, ExecuteProcess, RegisterEventHandler, LogInfo
from launch.launch_description_sources import PythonLaunchDescriptionSource
from launch.substitutions import LaunchConfiguration, PythonExpression, PathJoinSubstitution, TextSubstitution
from launch.event_handlers import OnProcessExit, OnExecutionComplete

def generate_launch_description():
  ld = LaunchDescription()
  
  # *** ROS 1 to ROS 2 bridges ***
  «IF TopicBridgeGenerated(system) || ServiceFromBridgeGenerated(system)|| ServiceToBridgeGenerated(system) »
  «system.name»_ros1_bridge_config = os.path.join(
    get_package_share_directory('«system.getName().toLowerCase»'),
    'config',
    'ros1_bridges.yaml'
  )

  load_bridge_params = ExecuteProcess(
      cmd=['rosparam', 'load', «system.name»_ros1_bridge_config]
  )
  «ENDIF»

  «IF TopicBridgeGenerated(system)»
  ros1_topic_bridge_parameter_bridge = ExecuteProcess(
      cmd=['ros2', 'run', 'ros1_bridge', 'parameter_bridge', '__ns:=bridge_«system.name»_topics', '__name:=ros1_topic_bridge_parameter_bridge']
  «ENDIF»«IF ServiceFromBridgeGenerated(system)»
  ros1_service_from_bridge_parameter_bridge = ExecuteProcess(
      cmd=['ros2', 'run', 'ros1_bridge', 'parameter_bridge', '__ns:=bridge_«system.name»_from_services', '__name:=ros1_service_from_bridge_parameter_bridge']
«ENDIF»«IF ServiceToBridgeGenerated(system)»
  ros1_service_to_bridge_parameter_bridge = ExecuteProcess(
      cmd=['ros2', 'run', 'ros1_bridge', 'parameter_bridge', '__ns:=bridge_«system.name»_to_services', '__name:=ros1_service_to_bridge_parameter_bridge']
«ENDIF»


  return LaunchDescription([
    «IF TopicBridgeGenerated(system)»
    RegisterEventHandler(
      event_handler=OnExecutionComplete(
        target_action=load_bridge_params,
        on_completion=[
          LogInfo(msg='Load bridge parameter finished'),
          LogInfo(msg='launching bridge for topics'),
          ros1_topic_bridge_parameter_bridge,
          LogInfo(msg='Start loading bridge parameters')]
      )
    ),«ENDIF»«IF ServiceFromBridgeGenerated(system)»
    RegisterEventHandler(
      event_handler=OnExecutionComplete(
        target_action=load_bridge_params,
        on_completion=[
          LogInfo(msg='Load bridge parameter finished'),
          LogInfo(msg='Launching bridge for FROM services'),
          ros1_service_from_bridge_parameter_bridge,
          LogInfo(msg='Start loading bridge parameters')]
      )
    ),«ENDIF»«IF ServiceFromBridgeGenerated(system)»
    RegisterEventHandler(
      event_handler=OnExecutionComplete(
        target_action=load_bridge_params,
        on_completion=[
          LogInfo(msg='Load bridge parameter finished'),
          LogInfo(msg='Launching bridge for TO services'),
          ros1_service_to_bridge_parameter_bridge,
          LogInfo(msg='Start loading bridge parameters')]
      )
    ),«ENDIF»
    load_bridge_params
  ])
    '''
}