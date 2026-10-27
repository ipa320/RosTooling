package de.fraunhofer.ipa.ros2.generator

import com.google.inject.Inject
import ros.Node
import ros.Package
import java.util.List
import java.util.Set
import java.util.HashSet

class Ros2BuildArtifactsCompiler {

    @Inject extension Ros2GeneratorHelpers

    def Set<String> getAllDependencies(List<Node> nodes) {
        val set = new HashSet<String>()
        for (node : nodes) {
            set.addAll(node.dependencies)
        }
        return set
    }

    def boolean hasAnyActions(List<Node> nodes) {
        for (node : nodes) {
            if (node.hasActions) return true
        }
        return false
    }

    def String compilePackageXml(Package pkg, List<Node> cppNodes, List<Node> pythonNodes, String distro) {
        val isHybrid = !cppNodes.empty && !pythonNodes.empty
        val isPurePython = cppNodes.empty && !pythonNodes.empty
        val allNodes = new java.util.ArrayList<Node>()
        allNodes.addAll(cppNodes)
        allNodes.addAll(pythonNodes)
        val deps = getAllDependencies(allNodes)
        val hasActions = hasAnyActions(allNodes)
        val hasLifecycle = hasLifecycle(cppNodes)

        return '''
<?xml version="1.0"?>
<?xml-model href="http://download.ros.org/schema/package_format3.xsd" schematypens="http://www.w3.org/2001/XMLSchema"?>
<package format="3">
  <name>«pkg.name.toLowerCase»</name>
  <version>0.0.1</version>
  <description>ROS 2 package «pkg.name» with generated node wrappers</description>
  <maintainer email="user@todo.todo">ROS Developer</maintainer>
  <license>Apache-2.0</license>

  «IF isHybrid»
  <buildtool_depend>ament_cmake</buildtool_depend>
  <buildtool_depend>ament_cmake_python</buildtool_depend>

  <depend>rclcpp</depend>
  <depend>rclcpp_components</depend>
  «IF hasLifecycle»<depend>rclcpp_lifecycle</depend>«ENDIF»
  «IF hasActions»<depend>rclcpp_action</depend>«ENDIF»
  <depend>rclpy</depend>
  «ELSEIF isPurePython»
  <buildtool_depend>ament_python</buildtool_depend>
  <depend>rclpy</depend>
  «ELSE»
  <buildtool_depend>ament_cmake</buildtool_depend>
  <depend>rclcpp</depend>
  <depend>rclcpp_components</depend>
  «IF hasLifecycle»<depend>rclcpp_lifecycle</depend>«ENDIF»
  «IF hasActions»<depend>rclcpp_action</depend>«ENDIF»
  «ENDIF»

  «FOR dep : deps»
  <depend>«dep»</depend>
  «ENDFOR»

  <exec_depend>launch</exec_depend>
  <exec_depend>launch_ros</exec_depend>

  <test_depend>ament_lint_auto</test_depend>
  <test_depend>ament_lint_common</test_depend>

  <export>
    «IF isPurePython»
    <build_type>ament_python</build_type>
    «ELSE»
    <build_type>ament_cmake</build_type>
    «ENDIF»
  </export>
</package>
'''
    }

    def String compileCMakeLists(Package pkg, List<Node> cppNodes, List<Node> pythonNodes, String distro) {
        val isHybrid = !cppNodes.empty && !pythonNodes.empty
        val allNodes = new java.util.ArrayList<Node>()
        allNodes.addAll(cppNodes)
        allNodes.addAll(pythonNodes)
        val deps = getAllDependencies(allNodes)
        val hasActions = hasAnyActions(allNodes)
        val hasLifecycle = hasLifecycle(cppNodes)
        val isJazzyOrRolling = "jazzy".equalsIgnoreCase(distro) || "rolling".equalsIgnoreCase(distro)

        return '''
cmake_minimum_required(VERSION 3.8)
project(«pkg.name.toLowerCase»)

«IF isJazzyOrRolling»
set(CMAKE_CXX_STANDARD 20)
«ELSE»
set(CMAKE_CXX_STANDARD 17)
«ENDIF»
set(CMAKE_CXX_STANDARD_REQUIRED ON)

if(CMAKE_COMPILER_IS_GNUCXX OR CMAKE_CXX_COMPILER_ID MATCHES "Clang")
  add_compile_options(-Wall -Wextra -Wpedantic)
endif()

find_package(ament_cmake REQUIRED)
«IF isHybrid»
find_package(ament_cmake_python REQUIRED)
«ENDIF»
find_package(rclcpp REQUIRED)
find_package(rclcpp_components REQUIRED)
«IF hasLifecycle»
find_package(rclcpp_lifecycle REQUIRED)
«ENDIF»
«IF hasActions»
find_package(rclcpp_action REQUIRED)
«ENDIF»
«FOR dep : deps»
find_package(«dep» REQUIRED)
«ENDFOR»

«FOR node : cppNodes»
«val artCamel = toCamelCase(node.artifactName)»
# -----------------------------------------------------------------------------
# C++ Component Library: «artCamel»_component
# -----------------------------------------------------------------------------
add_library(«artCamel»_component SHARED
  src/«artCamel»Wrapper.cpp
  src/«artCamel»Node.cpp
)
target_include_directories(«artCamel»_component PUBLIC
  $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}/include>
  $<INSTALL_INTERFACE:include>
)
ament_target_dependencies(«artCamel»_component
  rclcpp
  rclcpp_components
  «IF node.isLifecycle»rclcpp_lifecycle«ENDIF»
  «IF node.hasActions»rclcpp_action«ENDIF»
  «FOR dep : node.dependencies»
  «dep»
  «ENDFOR»
)
rclcpp_components_register_nodes(«artCamel»_component "«pkg.name.toLowerCase»::«artCamel»Node")

# -----------------------------------------------------------------------------
# Standalone Executable: «node.artifactName»
# -----------------------------------------------------------------------------
add_executable(«node.artifactName»
  src/«artCamel»Runner.cpp
)
target_link_libraries(«node.artifactName»
  «artCamel»_component
)
ament_target_dependencies(«node.artifactName»
  rclcpp
  «IF node.isLifecycle»rclcpp_lifecycle«ENDIF»
)
«ENDFOR»

«IF isHybrid»
# -----------------------------------------------------------------------------
# Python Package Installation (Hybrid ament_cmake_python)
# -----------------------------------------------------------------------------
ament_python_install_package(${PROJECT_NAME})

«FOR node : pythonNodes»
install(PROGRAMS
  «pkg.name.toLowerCase»/«node.name»_runner.py
  DESTINATION lib/${PROJECT_NAME}
  RENAME «node.artifactName»
)
«ENDFOR»
«ENDIF»

# -----------------------------------------------------------------------------
# Installation Rules
# -----------------------------------------------------------------------------
«IF !cppNodes.empty»
install(TARGETS
  «FOR node : cppNodes»
  «val artCamel = toCamelCase(node.artifactName)»
  «artCamel»_component
  «node.artifactName»
  «ENDFOR»
  ARCHIVE DESTINATION lib
  LIBRARY DESTINATION lib
  RUNTIME DESTINATION lib/${PROJECT_NAME}
)

install(DIRECTORY include/
  DESTINATION include
)
«ENDIF»

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

    def String compileSetupPy(Package pkg, List<Node> pythonNodes) '''
import os
from glob import glob
from setuptools import find_packages, setup

package_name = '«pkg.name.toLowerCase»'

setup(
    name=package_name,
    version='0.0.1',
    packages=find_packages(exclude=['test']),
    data_files=[
        ('share/ament_index/resource_index/packages', ['resource/' + package_name]),
        ('share/' + package_name, ['package.xml']),
        (os.path.join('share', package_name, 'launch'), glob(os.path.join('launch', '*.[pxy][yma]*'))),
        (os.path.join('share', package_name, 'config'), glob(os.path.join('config', '*.*'))),
    ],
    install_requires=['setuptools'],
    zip_safe=True,
    maintainer='ROS Developer',
    maintainer_email='user@todo.todo',
    description='ROS 2 package «pkg.name» with generated Python node wrappers',
    license='Apache-2.0',
    tests_require=['pytest'],
    entry_points={
        'console_scripts': [
            «FOR node : pythonNodes»
            '«node.artifactName» = «pkg.name.toLowerCase».«node.name»_runner:main',
            «ENDFOR»
        ],
    },
)
'''

    def String compileSetupCfg(Package pkg) '''
[develop]
script_dir=$base/lib/«pkg.name.toLowerCase»
[install]
install_scripts=$base/lib/«pkg.name.toLowerCase»
'''

}

