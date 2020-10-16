package de.fraunhofer.ipa.rossystem.generator

import rossystem.RosSystem
import com.google.inject.Inject

class PackageXmlCompiler{
	
	@Inject extension GeneratorHelpers
	
	
		def compile_package_xml(RosSystem system) '''«init()»
<package format="2">
  <name>«system.name.toLowerCase»</name>
  <version>0.0.1</version>
  <description>This package provides launch file for operating «system.name»</description>

  <license>Apache 2.0</license>

  <url type="website">http://wiki.ros.org/</url>


  <maintainer email="jane.doe@example.com">Jane Doe</maintainer>
  <author email="jane.doe@example.com">Jane Doe</author>


  <buildtool_depend>catkin</buildtool_depend>
  «FOR pkg:system.getPkgsDependencies»
  <exec_depend>«pkg»</exec_depend>
  «ENDFOR»
  <!--test_depend>roslaunch</test_depend-->

</package>'''

		}