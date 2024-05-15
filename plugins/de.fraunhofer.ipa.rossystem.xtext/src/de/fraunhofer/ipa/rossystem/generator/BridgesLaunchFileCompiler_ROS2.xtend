package de.fraunhofer.ipa.rossystem.generator

import system.System
import com.google.inject.Inject

class BridgesLaunchFileCompiler_ROS2 {

    @Inject extension GeneratorHelpers


    def compile_toROS2launchbridges(System system) '''
import os
from launch import LaunchDescription
from launch_ros.actions import Node
from launch.actions import IncludeLaunchDescription, DeclareLaunchArgument
from launch.launch_description_sources import PythonLaunchDescriptionSource
from launch.substitutions import LaunchConfiguration, PythonExpression, PathJoinSubstitution, TextSubstitution

def generate_launch_description():
  ld = LaunchDescription()
  
  # *** ROS 1 to ROS 2 bridges ***
  «IF TopicBridgeGenerated(system) || ServiceFromBridgeGenerated(system)|| ServiceToBridgeGenerated(system) »
  «system.name»_ros1_bridge_config = os.path.join(
    get_package_share_directory('«system.getName().toLowerCase»'),
    'config',
    'ros1_bridges.yaml'
  )«ENDIF»«IF TopicBridgeGenerated(system)»
  ros1_topic_bridge_parameter_bridge = Node(
    package='ros1_bridge',
    executable='parameter_bridge',
    name='ros1_topic_bridge_parameter_bridge',
    namespace='bridge_«system.name»_topics',
    output='screen',
    parameters=[
      {'__ns': 'bridge_«system.name»_topics'},
      {'__name': 'bridge_«system.name»_topics'}
    ],
    arguments=[
      '--ros-args', '-r', '__name:=bridge_«system.name»_topics'
    ]
  )«ENDIF»«IF ServiceFromBridgeGenerated(system)»
  ros1_service_from_bridge_parameter_bridge = Node(
    package='ros1_bridge',
    executable='parameter_bridge',
    name='ros1_service_from_bridge_parameter_bridge',
    namespace='bridge_«system.name»_from_services',
    output='screen',
    parameters=[
      {'__ns': 'bridge_«system.name»_from_services'},
      {'__name': 'bridge_«system.name»_from_services'}
    ],
    arguments=[
      '--ros-args', '-r', '__name:=bridge_«system.name»_from_services'
    ]
  )«ENDIF»«IF ServiceToBridgeGenerated(system)»
  ros1_service_to_bridge_parameter_bridge = Node(
    package='ros1_bridge',
    executable='parameter_bridge',
    name='ros1_service_to_bridge_parameter_bridge',
    namespace='bridge_«system.name»_to_services',
    output='screen',
    parameters=[
      {'__ns': 'bridge_«system.name»_to_services'},
      {'__name': 'bridge_«system.name»_to_services'}
    ],
    arguments=[
      '--ros-args', '-r', '__name:=bridge_«system.name»_to_services'
    ]
  )«ENDIF»

  # *** Add actions ***
  «IF TopicBridgeGenerated(system)»
  ld.add_action(ros1_topic_bridge_parameter_bridge)
  «ENDIF»«IF ServiceFromBridgeGenerated(system)»
  ld.add_action(ros1_service_from_bridge_parameter_bridge)
  «ENDIF»«IF ServiceToBridgeGenerated(system)»
  ld.add_action(ros1_service_to_bridge_parameter_bridge)
  «ENDIF»

  return ld
    '''
}
