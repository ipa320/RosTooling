package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import system.System

class CMakeListsCompiler {

    @Inject extension GeneratorHelpers


//  def compile_CMakeLists_ROS1(RosSystem system, ComponentStack stack) '''«init_pkg()»
//cmake_minimum_required(VERSION 2.8.3)
//project(«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»)
//
//find_package(catkin REQUIRED)
//
//catkin_package()
//
//
//### INSTALL ###
//install(DIRECTORY launch
//  DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}
//)'''

    def compile_CMakeLists_ROS2(System system, boolean gen_yaml) '''«init_pkg()»
cmake_minimum_required(VERSION 3.8)
project(«system.name.toLowerCase»)

if(CMAKE_COMPILER_IS_GNUCXX OR CMAKE_CXX_COMPILER_ID MATCHES "Clang")
  add_compile_options(-Wall -Wextra -Wpedantic)
endif()

find_package(ament_cmake REQUIRED)

install(DIRECTORY launch
  DESTINATION share/${PROJECT_NAME}
  OPTIONAL
)

install(DIRECTORY config
  DESTINATION share/${PROJECT_NAME}
  OPTIONAL
)

ament_package()
'''



}
