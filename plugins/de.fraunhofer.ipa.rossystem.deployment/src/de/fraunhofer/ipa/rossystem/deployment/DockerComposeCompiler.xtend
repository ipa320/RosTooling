package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers

class DockerComposeCompiler {
		
 GeneratorHelpers generator_helper = new GeneratorHelpers() 
		
 def compile_toDockerCompose(RosSystem system, String ros_distro, Integer ros_version) '''«generator_helper.init_pkg()»
«IF ros_version == 1»
version: "3.3"
networks:
  ros:
    driver: bridge
    
services:
  ros-master:
    image: ros:«ros_distro»-ros-core
    command: stdbuf -o L roscore
    networks:
      - ros

«IF system.getComponentStack().isEmpty()»
«"  "»«system.name.toLowerCase»:
    image: "«system.name.toLowerCase»:latest"
    depends_on:
      - ros-master
    environment:
      - "ROS_MASTER_URI=http://ros-master:11311"
      - "ROS_HOSTNAME=«system.name.toLowerCase»"
    networks:
      - ros
    command: stdbuf -o L roslaunch «system.name.toLowerCase» «system.name.toLowerCase».launch --wait
«ELSE»
«FOR stack:system.componentStack»
«"  "»«system.name.toLowerCase»_«stack.name.toLowerCase»:
    image: "«system.name.toLowerCase»_«stack.name.toLowerCase»:latest"
    depends_on:
      - ros-master
    environment:
      - "ROS_MASTER_URI=http://ros-master:11311"
      - "ROS_HOSTNAME=«stack.name.toLowerCase»"
    networks:
      - ros
    command: stdbuf -o L roslaunch «system.name.toLowerCase»_«stack.name.toLowerCase» «stack.name.toLowerCase».launch --wait
    
«ENDFOR»
«ENDIF»
«ELSE»
Todo: complete docker compose file for ros2
«ENDIF»

'''
}