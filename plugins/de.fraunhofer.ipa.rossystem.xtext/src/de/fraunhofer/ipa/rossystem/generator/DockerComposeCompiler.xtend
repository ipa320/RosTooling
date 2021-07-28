package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem
import rossystem.ComponentStack

class DockerComposeCompiler {
		
	@Inject extension GeneratorHelpers
		
 def compile_toDockerCompose(RosSystem system) '''«init_pkg()»
version: "3.3"
networks:
  ros:
    driver: bridge
    
services:
  ros-master:
    image: ros:melodic-ros-core
    command: stdbuf -o L roscore
    networks:
      - ros

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

'''
}