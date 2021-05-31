package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import componentInterface.ComponentInterface
import java.util.ArrayList
import java.util.List
import rossystem.RosSystem

class LaunchFileCompiler_ROS2 {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler

	List<String> ListInterfaceDef

	def compile_toROS2launch(RosSystem system) '''«init_comp()»
from launch import LaunchDescription
from launch_ros.actions import Node

def generate_launch_description():
	ld = LaunchDescription()

	«FOR component:system.rosComponent»
	«component.name» = Node(
		package="«component.compile_pkg»«init_pkg»",
		executable="«component.compile_art»«init_comp()»",
		name="«component.name»"«IF component.hasNS»,
		namespace="«component.get_ns»"«ENDIF»
	)
	«ENDFOR»

	«FOR component:system.rosComponent»
	ld.add_action(«component.name»)
	«ENDFOR»

	return ld
	'''

	def check_ns(ComponentInterface component){
		if (component.hasNS){
			return component.get_ns();
		}else {
			return "";
		}
	}

	def List<String> InterfaceDef(String name, String type){
		ListInterfaceDef = new ArrayList()
		ListInterfaceDef.add(name.replace("/","_"))
		ListInterfaceDef.add(name)
		ListInterfaceDef.add(type)
		return ListInterfaceDef
	}

	def boolean hasNS(ComponentInterface component){
		if(!component.nameSpace.nullOrEmpty){
			return true;
		}else{
			return false
		}
	}
	def String get_ns(ComponentInterface component){
		return component.nameSpace.replaceFirst("/","");
	}

}
