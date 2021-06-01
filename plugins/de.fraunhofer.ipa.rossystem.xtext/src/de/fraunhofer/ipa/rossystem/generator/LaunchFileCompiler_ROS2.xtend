package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import componentInterface.ComponentInterface
import java.util.ArrayList
import java.util.List
import rossystem.RosSystem
import org.eclipse.emf.common.util.EList
import componentInterface.RosParameter
import ros.ParameterValue
import ros.impl.ParameterStringImpl
import ros.impl.ParameterIntegerImpl
import ros.impl.ParameterDoubleImpl
import ros.impl.ParameterBooleanImpl
import ros.impl.ParameterSequenceImpl
import ros.impl.ParameterStructImpl
import ros.impl.ParameterStructMemberImpl

class LaunchFileCompiler_ROS2 {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler

	List<String> ListInterfaceDef
	int param_count

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
		namespace="«component.get_ns»"«ENDIF»«IF !component.rosparameter.empty»,
		parameters=[
			«component.rosparameter.compile_parameters_str»
		]
		«ENDIF»
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

	def String compile_parameters_str(EList<RosParameter> rosParameters) {
		param_count = rosParameters.length;
		var param_str = "";
		for (rosParameter : rosParameters) {
			val param_count=param_count--;
			param_str += "{ \"" + rosParameter.parameter.name + "\" : " + get_param_value(rosParameter.value);
			param_str += (param_count > 1) ? "},\n" : "}\n";
		}
		return param_str;
	}

	def String get_param_value(ParameterValue value) {
		var param_val = "";
		if (value instanceof ParameterStringImpl) {
			param_val = "\"" + (value as ParameterStringImpl).getValue() + "\"";
		} else if (value instanceof ParameterIntegerImpl) {
			param_val = (value as ParameterIntegerImpl).getValue().toString;
		} else if (value instanceof ParameterDoubleImpl) {
			param_val = (value as ParameterDoubleImpl).getValue().toString;
		} else if (value instanceof ParameterBooleanImpl) {
			param_val = (value as ParameterBooleanImpl).isValue().toString;
		} else if (value instanceof ParameterSequenceImpl) {
			param_val += "[";
			var elem_count = (value as ParameterSequenceImpl).eContents.length;
			for (elem : (value as ParameterSequenceImpl).eContents) {
				param_val += get_param_value(elem as ParameterValue);
				elem_count--;
				param_val += (elem_count > 0) ? ", " : "";
			}
			param_val += "]";
		} else if (value instanceof ParameterStructImpl) {
			var elem_count = (value as ParameterStructImpl).eContents.length;
			param_val = "\n\t{ ";
			for (elem : ((value as ParameterStructImpl).eContents)) {
				var member = (elem as ParameterStructMemberImpl);
				param_val += "\"" + member.getName() + "\" : " + get_param_value(member.getValue());
				elem_count--;
				param_val += (elem_count > 0) ? ",\n" : "";
			}
			param_val += " }";
		}
		return param_val;
	 }
}
