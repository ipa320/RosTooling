package de.fraunhofer.ipa.rossystem.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import rossystem.RosSystem
import de.fraunhofer.ipa.rossystem.generator.CustomOutputProvider
import de.fraunhofer.ipa.rossystem.generator.RosSystemGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.XtextResourceSet
import com.google.inject.Provider
import org.eclipse.xtext.util.StringInputStream

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CustomInjectorProvider))
class RosSystemGeneratorTest {

	@Inject
	ParseHelper<RosSystem> parseHelper
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Inject 
	RosSystemGenerator generator

	@Test
	def void testGeneratedCode() {

		val resourceSet = resourceSetProvider.get
		val sickS300Example = resourceSet.createResource(URI.createURI("sick_s300.ros"))
		sickS300Example.load(new StringInputStream('''
			PackageSet { package {
				CatkinPackage cob_sick_s300 { artifact {
					Artifact cob_sick_s300 { node Node { name cob_sick_s300 
						publisher { 
						Publisher { name scan message "sensor_msgs.LaserScan" } , 
						Publisher { name diagnostics message "diagnostic_msgs.DiagnosticArray" 
						}}}}
			}}}}
		'''), emptyMap)

		val model = parseHelper.parse('''
			RosSystem { Name 'scan_system' 
			RosComponents ( ComponentInterface 
				{ name base_laser_front NameSpace base_laser_front 
					RosPublishers { 
						RosPublisher "base_laser_front/scan" 
							{ ns base_laser_front RefPublisher "cob_sick_s300.cob_sick_s300.cob_sick_s300.scan" } , 
						RosPublisher "base_laser_front/diagnostics" 
							{ ns base_laser_front RefPublisher "cob_sick_s300.cob_sick_s300.cob_sick_s300.diagnostics" } 
							} }
							) 
					}
				 ''', resourceSet)

		val fsa = new InMemoryFileSystemAccess
		
		generator.doGenerate(model.eResource, fsa, new GeneratorContext)
		
		// Assert that all necessary files exist 
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "scan_system.launch"))
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "scan_systeminstall.sh"))
		Assert.assertTrue(
			fsa.textFiles.containsKey(CustomOutputProvider::CM_CONFIGURATION + "scan_system.componentinterface"))
		
		// Test the generated launch file
		Assert.assertEquals(
            '''<?xml version="1.0"?>
<launch>

	<node pkg="cob_sick_s300" type="cob_sick_s300" name="base_laser_front" ns="base_laser_front" cwd="node" respawn="false" output="screen">

	</node>
</launch>'''.toString, fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT+"scan_system.launch").toString.trim)
		
		
		// Test the generated install script
		Assert.assertEquals('''#!/bin/bash

distro=$(echo $ROS_DISTRO)

if [ -z "$distro" ]; then 
    echo "Ros distro variable not found"
    read -p "Do you want to install ROS? [Y/N]" choice
    if [[ "$choice" == "Y" ]]; then
            read -p "Distro version (e.g. kinetic, melodic): " distro
            sudo sh -c 'echo "deb http://packages.ros.org/ros/ubuntu $(lsb_release -sc) main" > /etc/apt/sources.list.d/ros-latest.list'
            sudo apt-key adv --keyserver 'hkp://keyserver.ubuntu.com:80' --recv-key C1CF6E31E6BADE8868B172B4F42ED6FBAB17C654
            sudo apt update
            sudo apt install ros-$distro-desktop
    else
        exit
    fi
else
    echo "Found a ROS installation for the $distro distro"
    sudo apt update
fi

for pkg in cob-sick-s300 
do
    sudo apt install ros-$distro-$pkg
done'''.toString, fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "scan_systeminstall.sh").toString.trim)
	
	// Test the generated component interface		
	Assert.assertEquals('''ComponentInterface { name scan_system
RosPublishers{
	RosPublisher "base_laser_front/scan" { RefPublisher "cob_sick_s300.cob_sick_s300.cob_sick_s300.scan"},
	RosPublisher "base_laser_front/diagnostics" { RefPublisher "cob_sick_s300.cob_sick_s300.cob_sick_s300.diagnostics"}
	}
}'''.toString, fsa.textFiles.get(CustomOutputProvider::CM_CONFIGURATION + "scan_system.componentinterface").toString.trim)	
	}
}
