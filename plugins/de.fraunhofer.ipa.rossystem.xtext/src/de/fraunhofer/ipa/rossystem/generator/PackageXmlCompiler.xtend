package de.fraunhofer.ipa.rossystem.generator

import system.System
import com.google.inject.Inject

class PackageXmlCompiler{

    @Inject extension GeneratorHelpers

//      def compile_package_xml_format2(System system) '''«init_pkg()»
//<package format="2">
//  <name>«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»</name>
//  <version>0.0.1</version>
//  <description>This package provides launch file for operating «IF stack===null»«system.name»«ELSE»«system.name.toLowerCase»_«stack.name»«ENDIF»</description>
//
//  <license>Apache 2.0</license>
//
//  <url type="website">http://wiki.ros.org/</url>
//
//
//  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
//  <author email="jane.doe@example.com">Jane Doe</author>
//
//  <buildtool_depend>catkin</buildtool_depend>
//  «FOR pkg:getPkgsDependencies(system, stack)»
//  <exec_depend>«pkg»</exec_depend>
//  «ENDFOR»
//  <!--test_depend>roslaunch</test_depend-->
//
//</package>'''


        def compile_package_xml_format3(System system) '''«init_pkg()»
<?xml version="1.0"?>
<?xml-model
   href="http://download.ros.org/schema/package_format3.xsd"
   schematypens="http://www.w3.org/2001/XMLSchema"?>
<package format="3">
  <name>«system.name.toLowerCase»</name>
  <version>0.0.1</version>
  <description>This package provides launch file for operating «system.name»</description>
  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
  <author email="jane.doe@example.com">Jane Doe</author>
  <license>Apache-2.0</license>

  <buildtool_depend>ament_cmake</buildtool_depend>

  <exec_depend>ament_index_python</exec_depend>
  <exec_depend>launch</exec_depend>
  <exec_depend>launch_ros</exec_depend>
  «IF hasComponentContainers(system)»<exec_depend>rclcpp_components</exec_depend>«ENDIF»
  «FOR pkg:system.getPkgsDependencies»
  «IF !pkg.toString.equalsIgnoreCase(system.name)»
  <exec_depend>«pkg»</exec_depend>
  «ENDIF»
  «ENDFOR»«IF TopicBridgeGenerated(system) || ServiceFromBridgeGenerated(system) || ServiceToBridgeGenerated(system)»<exec_depend>ros1_bridge</exec_depend>«ENDIF»

  <export>
    <build_type>ament_cmake</build_type>
  </export>
</package>
        '''

        def compile_package_xml_python(System system) '''«init_pkg()»
<?xml version="1.0"?>
<?xml-model
   href="http://download.ros.org/schema/package_format3.xsd"
   schematypens="http://www.w3.org/2001/XMLSchema"?>
<package format="3">
  <name>«system.name.toLowerCase»</name>
  <version>0.0.1</version>
  <description>This package provides launch file for operating «system.name»</description>
  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
  <author email="jane.doe@example.com">Jane Doe</author>
  <license>Apache-2.0</license>

  <buildtool_depend>ament_python</buildtool_depend>

  <exec_depend>ament_index_python</exec_depend>
  <exec_depend>launch</exec_depend>
  <exec_depend>launch_ros</exec_depend>
  «FOR pkg:system.getPkgsDependencies»
  «IF !pkg.toString.equalsIgnoreCase(system.name)»
  <exec_depend>«pkg»</exec_depend>
  «ENDIF»
  «ENDFOR»«IF TopicBridgeGenerated(system) || ServiceFromBridgeGenerated(system) || ServiceToBridgeGenerated(system)»<exec_depend>ros1_bridge</exec_depend>«ENDIF»

  <export>
    <build_type>ament_python</build_type>
  </export>
</package>
        '''

}
