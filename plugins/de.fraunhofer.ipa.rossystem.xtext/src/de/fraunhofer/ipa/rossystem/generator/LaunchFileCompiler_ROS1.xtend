package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import componentInterface.ComponentInterface
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import ros.ParameterValue
import rossystem.RosSystem
import ros.impl.ParameterStructMemberImpl
import componentInterface.RosPublisher
import org.eclipse.emf.common.util.EList
import rossystem.TopicConnection
import componentInterface.RosSubscriber
import componentInterface.RosServiceServer
import rossystem.ServiceConnection
import componentInterface.RosServiceClient
import componentInterface.RosActionClient
import rossystem.ActionConnection
import componentInterface.RosActionServer
import rossystem.ComponentStack

class LaunchFileCompiler_ROS1 {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler

	List<String> ListInterfaceDef
	ParameterValue ParamValue
	String str_output=""
	String tab_tmp=""	
	List<Integer> sizes_list = new ArrayList<Integer>();
	List<EObject> param_list = new ArrayList<EObject>();
	List<ComponentInterface> components = new ArrayList<ComponentInterface>();
	
	
	int i=0;
	int k=0;
	
	def compile_toROS1launch(RosSystem system, ComponentStack stack) '''«init_comp()»
<?xml version="1.0"?>
<launch>
«IF stack===null»
  «FOR ROSParameter:system.parameter»
  	«IF ROSParameter.type.toString.contains("ParameterStructType")»
  	<rosparam>
		  «IF ROSParameter.value!==null»
			  «FOR ParamMember:ROSParameter.value.eContents»
			«getParamName(ParamMember.eContents.get(0))»: «compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))»
			  «ENDFOR»
		  «ELSE»
			  «FOR ParamMember:ROSParameter.eContents.get(0).eContents»
				  «IF !(ParamMember.eContents.get(0).eContents.empty)»
				«getParamName(ParamMember)»: «compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))»
				  «ENDIF»
			  «ENDFOR»
		  «ENDIF»
  	</rosparam>
  	«ELSEIF ROSParameter.type.toString.contains("ParameterListType") || ROSParameter.type.toString.contains("ParameterArrayType")»
  	<rosparam param="list">«IF ROSParameter.value!==null»«compile_param_value(ROSParameter.value)»«ENDIF»</rosparam>
  	«ELSE»
  		<param name="«ROSParameter.name»" value="«compile_param_value(ROSParameter.value)»"/>
  	«ENDIF»
  «ENDFOR»«ELSE»«FOR qa:stack.qualityAttribute»
		<param name="«qa.name»" value="«compile_param_value(qa.value)»"/>
«ENDFOR»«ENDIF»

	«FOR component:compile_list_of_components(system,stack)»
	<node pkg="«component.compile_pkg»«init_pkg»" type="«component.compile_art»«init_comp()»" name="«component.name»"«IF component.hasNS» ns="«component.get_ns»"«ENDIF» cwd="node" respawn="false" output="screen">«init_comp()»«init_pkg»
		«FOR rosPublisher:component.rospublisher»
			«remapping_function_pub(rosPublisher, component.hasNS, inTopicFromConnection(rosPublisher, system.topicConnections),component.check_ns)»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
			«remapping_function_sub(rosSubscriber, component.hasNS, inTopicToConnection(rosSubscriber, system.topicConnections),component.check_ns)»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
			«remapping_function_srv(rosServiceServer, component.hasNS, inServiceFromConnection(rosServiceServer, system.serviceConnections),component.check_ns)»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
			«remapping_function_client(rosServiceClient, component.hasNS, inServiceToConnection(rosServiceClient, system.serviceConnections),component.check_ns)»
		«ENDFOR»
		«FOR rosActionServer:component.rosactionserver»
			«remapping_function_acts(rosActionServer, component.hasNS, inActionFromConnection(rosActionServer, system.actionConnections),component.check_ns)»
		«ENDFOR»
		«FOR rosActionClient:component.rosactionclient»
			«remapping_function_actc(rosActionClient, component.hasNS, inActionToConnection(rosActionClient, system.actionConnections),component.check_ns)»
		«ENDFOR»
		«FOR rosParameter:component.rosparameter»
			«IF rosParameter.parameter.type.toString.contains("ParameterStructType")»«str_output=""»
			<rosparam>
«rosParameter.name»:
        «IF rosParameter.value.eContents !== null»
		«compile_struct_param(rosParameter.value.eContents,false)»
		«ENDIF»
			</rosparam>
			«ELSE»
		«IF rosParameter.value!==null»<param name="«rosParameter.parameter.name»" value="«compile_param_value(rosParameter.value)»" />«ENDIF»
			«ENDIF»
		«ENDFOR»
	</node>
	«ENDFOR»

</launch>
	'''
	
	def List<ComponentInterface> compile_list_of_components(RosSystem system, ComponentStack stack) {
		components=null;
		if (stack === null){
			components = system.rosComponent;
		} else {
			components =  stack.rosComponent;
		}
		return components;
	}
		
	// TOPICS REMAP
	def String remapping_function_pub(RosPublisher rosPublisher, boolean HasNS, String inConnection, String NS) {
		if(inConnection!==null){
			if (!(prefix(NS)+rosPublisher.publisher.name).equals(inConnection)){
				if(HasNS){
					return "<remap from='"+rosPublisher.publisher.name+"' to='/"+inConnection+"' />"
				} else {
					return "<remap from='"+rosPublisher.publisher.name+"' to='"+inConnection+"' />"
				}
		}}else if (!((prefix(NS)+rosPublisher.name).equals(compile_topic_name(rosPublisher.publisher, NS)))){
				return "<remap from='"+rosPublisher.publisher.name+"' to='"+rosPublisher.name+"' />";
		}
	}
	def String remapping_function_sub(RosSubscriber rosSubscriber, boolean HasNS, String inConnection, String NS) {
		if(inConnection!==null){
			if (! (prefix(NS)+rosSubscriber.subscriber.name).equals(inConnection)){
				if(HasNS){
					return "<remap from='"+rosSubscriber.subscriber.name+"' to='/"+inConnection+"' />"
				} else {
					return "<remap from='"+rosSubscriber.subscriber.name+"' to='"+inConnection+"' />"
				}
		}} else if (!((prefix(NS)+rosSubscriber.name).equals(compile_topic_name(rosSubscriber.subscriber, NS)))){
				return "<remap from='"+rosSubscriber.subscriber.name+"' to='"+rosSubscriber.name+"' />";
		}
	}
	def String inTopicFromConnection(RosPublisher publisher, EList<TopicConnection> list) {
		for (topicConnection:list){
			if (topicConnection.from.contains(publisher)){
				return topicConnection.topicName
			} 
		}
		return null ;
	}
	def String inTopicToConnection(RosSubscriber subscriber, EList<TopicConnection> list) {
		for (topicConnection:list){
			if (topicConnection.to.contains(subscriber)){
				return topicConnection.topicName
			} 
		}
		return null ;
	}
	
	// SERVICES REMAP
	def String remapping_function_srv(RosServiceServer rosServiceServer, boolean HasNS, String inConnection, String NS) {
		if(inConnection!==null){
			if (! (prefix(NS)+rosServiceServer.srvserver.name).equals(inConnection)){
				if(HasNS){
					return "<remap from='"+rosServiceServer.srvserver.name+"' to='/"+inConnection+"' />"
				} else {
					return "<remap from='"+rosServiceServer.srvserver.name+"' to='"+inConnection+"' />"
				}
		}} else if (!((prefix(NS)+rosServiceServer.name).equals(compile_service_name(rosServiceServer.srvserver, NS)))){
				return "<remap from='"+rosServiceServer.srvserver.name+"' to='"+rosServiceServer.name+"' />";
		}
	}
	def String remapping_function_client(RosServiceClient rosServiceClient, boolean HasNS, String inConnection, String NS) {
		if(inConnection!==null){
			if (! (prefix(NS)+rosServiceClient.srvclient.name).equals(inConnection)){
				if(HasNS){
					return "<remap from='"+rosServiceClient.srvclient.name+"' to='/"+inConnection+"' />"
				} else {
					return "<remap from='"+rosServiceClient.srvclient.name+"' to='"+inConnection+"' />"
				}
		}} else if (!((prefix(NS)+rosServiceClient.name).equals(compile_service_name(rosServiceClient.srvclient, NS)))){
				return "<remap from='"+rosServiceClient.srvclient.name+"' to='"+rosServiceClient.name+"' />";
		}
	}
	def String inServiceFromConnection(RosServiceServer service, EList<ServiceConnection> list) {
		for (serviceConnection:list){
			if (serviceConnection.from.contains(service)){
				return serviceConnection.serviceName
			}
		}
		return null ;
	}
	def String inServiceToConnection(RosServiceClient client, EList<ServiceConnection> list) {
		for (serviceConnection:list){
			if (serviceConnection.to.equals(client)){
				return serviceConnection.serviceName
			}
		}
		return null ;
	}
	
	// ACTIONS REMAP
	def String remapping_function_acts(RosActionServer rosActionService, boolean HasNS, String inConnection, String NS) {
		if(inConnection!==null){
			if (! (prefix(NS)+rosActionService.actserver.name).equals(inConnection)){
				if(HasNS){
					return "<remap from='"+rosActionService.actserver.name+"' to='/"+inConnection+"' />"
				} else {
					return "<remap from='"+rosActionService.actserver.name+"' to='"+inConnection+"' />"
				}
		}} else if (!((prefix(NS)+rosActionService.name).equals(compile_action_name(rosActionService.actserver, NS)))){
				return "<remap from='"+rosActionService.actserver.name+"' to='"+rosActionService.name+"' />";
		}
	}
	def String remapping_function_actc(RosActionClient rosActionClient, boolean HasNS, String inConnection, String NS) {
		if(inConnection!==null){
			if (! (prefix(NS)+rosActionClient.actclient.name).equals(inConnection)){
				if(HasNS){
					return "<remap from='"+rosActionClient.actclient.name+"' to='/"+inConnection+"' />"
				} else {
					return "<remap from='"+rosActionClient.actclient.name+"' to='"+inConnection+"' />"
				}
		}} else if (!((prefix(NS)+rosActionClient.name).equals(compile_action_name(rosActionClient.actclient, NS)))){
				return "<remap from='"+rosActionClient.actclient.name+"' to='"+rosActionClient.name+"' />";
		}
	}
	def String inActionFromConnection(RosActionServer service, EList<ActionConnection> list) {
		for (actionConnection:list){
			if (actionConnection.from.equals(service)){
				return actionConnection.actionName
			}
		}
		return null ;
	}
	def String inActionToConnection(RosActionClient client, EList<ActionConnection> list) {
		for (actionConnection:list){
			if (actionConnection.to.equals(client)){
				return actionConnection.actionName
			}
		}
		return null ;
	}
	//

	def check_ns(ComponentInterface component){
		if (component.hasNS){
			return component.get_ns();
		}else {
			return "";
		}
	}

	def String compile_struct_param(List<EObject> paramMembers,Boolean sub){
		if (!sub){
			sizes_list.add(paramMembers.size);
		} 
		for (paramMember: paramMembers ){
			if (paramMember.eClass.name=='ParameterStruct'){
				for (SubParamMember:paramMember.eContents){				
					tab_tmp="  ";//rosparam has to start with a first indentation as offset - fix
					for(i=1;i<sizes_list.size;i++){
						tab_tmp+="  ";
					}
					str_output+=tab_tmp+getParamName(SubParamMember)+": \n";
					param_list.clear;
					param_list.add(SubParamMember);
					compile_struct_param(param_list,true);
	    		}
			} else {
				// FOR LIST
				if (paramMember.eContents.get(0).eClass.name=="ParameterSequence"){
					if(paramMember.eContents.get(0).eContents.get(0).eClass.name!=="ParameterStruct"){
						str_output=str_output.substring(0, str_output.length() - 1);
						str_output+="[";
						for (seq_member:paramMember.eContents.get(0).eContents){
							str_output+=compile_param_value(convertParamValue(seq_member))+",";
						}
						str_output = str_output.substring(0, str_output.length() - 1)+"]"+"\n";							
					} else {
						sizes_list.add(paramMember.eContents.get(0).eContents.size);
						for (seq_member:paramMember.eContents.get(0).eContents){
							param_list.clear;
							param_list.add(seq_member);
							compile_struct_param(param_list,true);
							k=sizes_list.get(sizes_list.size-1);
							k--;
							sizes_list.remove(sizes_list.size() - 1);
							if (k>0){
								sizes_list.add(k);
							}
						}
					}
				//FOR PRIMITIVES: STRING, INT, ...
				} else {
					str_output=str_output.substring(0, str_output.length() - 1);
					str_output+=compile_param_value(convertParamValue(paramMember.eContents.get(0)))+"\n";
				}
			}
			if (!sub){
				k=sizes_list.get(sizes_list.size-1);
				k--;				
				sizes_list.remove(sizes_list.size() - 1);
				if (k>0){
					sizes_list.add(k);
				}
			}
		}
		if (sizes_list.isEmpty){
			return str_output.replace("null","");
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

 	def getParamName (EObject paramdef){
 		return (paramdef as ParameterStructMemberImpl).name;
 	}
 	
	def convertParamValue (Object ParamMember){
		ParamValue=ParamMember as ParameterValue
		return ParamValue
	}
}
