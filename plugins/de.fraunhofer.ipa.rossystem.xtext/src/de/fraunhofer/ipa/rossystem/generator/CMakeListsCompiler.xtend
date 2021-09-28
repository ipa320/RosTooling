package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem
import rossystem.ComponentStack

class CMakeListsCompiler {
	
	@Inject extension GeneratorHelpers
	
	
	def compile_CMakeLists_ROS1(RosSystem system, ComponentStack stack) '''«init_pkg()»
cmake_minimum_required(VERSION 2.8.3)
project(«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»)

find_package(catkin REQUIRED)

catkin_package()


### INSTALL ###
install(DIRECTORY launch
  DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}
)'''

	def compile_CMakeLists_ROS2(RosSystem system, ComponentStack stack) '''«init_pkg()»
cmake_minimum_required(VERSION 3.5)
project(«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»)

# Default to C++14
if(NOT CMAKE_CXX_STANDARD)
  set(CMAKE_CXX_STANDARD 14)
endif()

if(CMAKE_COMPILER_IS_GNUCXX OR CMAKE_CXX_COMPILER_ID MATCHES "Clang")
  add_compile_options(-Wall -Wextra -Wpedantic)
endif()

find_package(ament_cmake REQUIRED)

### INSTALL ###
install(DIRECTORY launch
  DESTINATION share/${PROJECT_NAME}
)

ament_package()
'''


}