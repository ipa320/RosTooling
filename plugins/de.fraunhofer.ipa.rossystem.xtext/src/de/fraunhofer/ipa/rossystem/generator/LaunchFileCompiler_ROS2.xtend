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
import ros.impl.ParameterStructTypeImpl
import rossystem.ComponentStack

class LaunchFileCompiler_ROS2 {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler

	List<String> ListInterfaceDef
	int param_count
	List<ComponentInterface> components = new ArrayList<ComponentInterface>();
	List<ComponentInterface> Ros2components = new ArrayList<ComponentInterface>();
	

	def compile_toROS2launch(RosSystem system, ComponentStack stack) '''«init_comp()»
from launch import LaunchDescription
from launch_ros.actions import Node

def generate_launch_description():
	ld = LaunchDescription()

	«FOR component:compile_list_of_components(system,stack)»
	«component.name» = Node(
		package="«component.compile_pkg»«init_pkg»",
		executable="«component.compile_art»«init_comp()»",
		name="«component.name»"«IF component.hasNS»,
		namespace="«component.get_ns»"«ENDIF»«IF !component.rosparameter.empty»,
		parameters=[
			«component.rosparameter.compile_parameters_str»
		]«ENDIF»«component.compile_remappings_str»
	)
	«ENDFOR»

	«FOR component:compile_list_of_components(system,stack)»
	ld.add_action(«component.name»)
	«ENDFOR»

	return ld
	'''

	def List<ComponentInterface> compile_list_of_components(RosSystem system, ComponentStack stack) {
		components.clear;
		Ros2components.clear;		
		if (stack === null){
			components = system.rosComponent;
		} else {
			components =  stack.rosComponent;
		}
		for(ComponentInterface component:components){
			if (component.compile_pkg_type.toString.contains("AmentPackage")){
				Ros2components.add(component);
			}
		}
		return Ros2components;
	}

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

	def String compile_remappings_str(ComponentInterface component) {
		var remap_str = "";
		val NS = component.check_ns();
		for (rosPublisher : component.rospublisher) {
			if (!((prefix(NS)+rosPublisher.name).equals(compile_topic_name(rosPublisher.publisher, NS)))) {
				remap_str += "\t(\"" + rosPublisher.publisher.name + "\", \"" + rosPublisher.name + "\"),\n";
			}
		}
		for (rosSubscriber : component.rossubscriber) {
			if (!((prefix(NS)+rosSubscriber.name).equals(compile_topic_name(rosSubscriber.subscriber, NS)))) {
				remap_str += "\t(\"" + rosSubscriber.subscriber.name + "\", \"" + rosSubscriber.name + "\"),\n";
			}
		}
		for (rosServiceServer : component.rosserviceserver) {
			if (!((prefix(NS)+rosServiceServer.name).equals(compile_service_name(rosServiceServer.srvserver, NS)))) {
				remap_str += "\t(\"" + rosServiceServer.srvserver.name + "\", \"" + rosServiceServer.name + "\"),\n";
			}
		}
		for (rosServiceClient : component.rosserviceclient) {
			if (!((prefix(NS)+rosServiceClient.name).equals(compile_service_name(rosServiceClient.srvclient, NS)))) {
				remap_str += "\t(\"" + rosServiceClient.srvclient.name + "\", \"" + rosServiceClient.name + "\"),\n";
			}
		}
		for (rosActionServer : component.rosactionserver) {
			if (!((prefix(NS)+rosActionServer.name).equals(compile_action_name(rosActionServer.actserver, NS)))) {
				remap_str += "\t(\"" + rosActionServer.actserver.name + "\", \"" + rosActionServer.name + "\"),\n";
			}
		}
		for (rosActionClient : component.rosactionclient) {
			if (!((prefix(NS)+rosActionClient.name).equals(compile_action_name(rosActionClient.actclient, NS)))) {
				remap_str += "\t(\"" + rosActionClient.actclient.name + "\", \"" + rosActionClient.name + "\"),\n";
			}
		}
		if (!remap_str.empty) {
			remap_str = ",\nremappings=[\n" + remap_str.substring(0,remap_str.length-2) + "]\n";
		}
		return remap_str;
	}

	def String compile_parameters_str(EList<RosParameter> rosParameters) {
		param_count = rosParameters.length;
		var param_str = "";
		for (rosParameter : rosParameters) {
			val param_count=param_count--;
			if (rosParameter.parameter.type instanceof ParameterStructTypeImpl) {
				param_str += compile_struct_str(rosParameter.value, rosParameter.parameter.name);
			} else {
				param_str += "{ \"" + rosParameter.parameter.name + "\" : " + get_param_value(rosParameter.value, rosParameter.parameter.name);
			}
			if (param_count > 1){ 
				param_str +=" },\n"
			} else {
				param_str +=" }\n";
			}
		}
		return param_str;
	}

	def String compile_struct_str(ParameterValue value, String name) {
		var param_str = "";
		var elem_count = (value as ParameterSequenceImpl).eContents.length;

		for (elem : ((value as ParameterSequenceImpl).eContents)) {
			var member = ((elem as ParameterStructImpl).eContents.get(0) as ParameterStructMemberImpl);
			val param_val = get_param_value(member.getValue(), name + "/" + member.getName());
			if (param_val.startsWith("{")) {
				param_str += param_val;
			} else {
				param_str += "{ \"" + name + "/" + member.getName() + "\" : " + param_val;
			}
			elem_count--;
			if (elem_count > 0){ 
				param_str +=" },\n"
			}
		}
		return param_str;
	}

	def String get_param_value(ParameterValue value, String name) {
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
			var elem_count = (value as ParameterSequenceImpl).eContents.length;
			if ((value as ParameterSequenceImpl).eContents.get(0) instanceof ParameterStructImpl) {
				param_val = compile_struct_str(value, name);
			} else {
				param_val += "[";
				for (elem : (value as ParameterSequenceImpl).eContents) {
					param_val += get_param_value(elem as ParameterValue, name);
					elem_count--;
					if (elem_count > 0){
						param_val +=", "
					}
				}
				param_val += "]";
			}
		}
		return param_val;
	 }
}
