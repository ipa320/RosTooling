package de.fraunhofer.ipa.rossystem.generator

import rossystem.RosSystem
import com.google.inject.Inject
import rossystem.ComponentStack
import java.util.List
import java.util.ArrayList

class PackageXmlCompiler{
	
	@Inject extension GeneratorHelpers
	List<CharSequence> depends_list
	
	
		def compile_package_xml_format2(RosSystem system,ComponentStack stack) '''«init_pkg()»
<package format="2">
  <name>«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»</name>
  <version>0.0.1</version>
  <description>This package provides launch file for operating «IF stack===null»«system.name»«ELSE»«system.name.toLowerCase»_«stack.name»«ENDIF»</description>

  <license>Apache 2.0</license>

  <url type="website">http://wiki.ros.org/</url>


  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
  <author email="jane.doe@example.com">Jane Doe</author>

  <buildtool_depend>catkin</buildtool_depend>
  «FOR pkg:getPkgsDependencies(system, stack)»
  <exec_depend>«pkg»</exec_depend>
  «ENDFOR»
  <!--test_depend>roslaunch</test_depend-->

</package>'''


		def compile_package_xml_format3(RosSystem system) '''«init_pkg()»
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
  <license>Apache 2.0</license>

  <buildtool_depend>ament_cmake</buildtool_depend>
  
  <exec_depend>ament_index_python</exec_depend>
  <exec_depend>launch</exec_depend>
  «FOR pkg:system.getPkgsDependencies»
  <exec_depend>«pkg»</exec_depend>
  «ENDFOR»

  <!--test_depend>ament_copyright</test_depend>
  <test_depend>ament_flake8</test_depend>
  <test_depend>ament_pep257</test_depend>
  <test_depend>launch</test_depend>
  <test_depend>python3-pytest</test_depend-->

  <export>
  	<build_type>ament_python</build_type>
  </export>
</package>
		'''


		}
