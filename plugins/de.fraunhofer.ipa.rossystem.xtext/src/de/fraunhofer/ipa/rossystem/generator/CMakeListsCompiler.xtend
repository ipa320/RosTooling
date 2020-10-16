package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem

class CMakeListsCompiler {
	
	@Inject extension GeneratorHelpers
	
	
	def compile_CMakeLists(RosSystem system) '''«init()»
cmake_minimum_required(VERSION 2.8.3)
project(«system.name.toLowerCase»)

find_package(catkin REQUIRED)

catkin_package()


### INSTALL ###
install(DIRECTORY launch
  DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}
)'''

}