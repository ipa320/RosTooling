package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem
import java.util.List
import java.util.ArrayList
import componentInterface.ComponentInterface
import ros.ParameterValue
import org.eclipse.emf.ecore.EObject

class LaunchFileCompiler {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler
		
		
	List<String> ListInterfaceDef
	ParameterValue ParamValue
	String str_output=""
	String tab_tmp=""
	Boolean is_seq=false
	
	
	
	def compile_tolaunch(RosSystem system) '''«init_comp()»
<?xml version="1.0"?>
<launch>
		«FOR ROSParameter:system.parameter»«IF ROSParameter.type.toString.contains("ParameterStructType")»
		<rosparam>
			«IF ROSParameter.value!==null»«FOR ParamMember:ROSParameter.value.eContents»
			«getParamName(ParamMember.eContents.get(0).toString)»:«compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))»
			«ENDFOR»«ELSE»
			«FOR ParamMember:ROSParameter.eContents.get(0).eContents»«IF !(ParamMember.eContents.get(0).eContents.empty)»
			«getParamName(ParamMember.toString)»:«compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))»«ENDIF»
			«ENDFOR»«ENDIF»
		</rosparam>
		«ELSEIF ROSParameter.type.toString.contains("ParameterListType") || ROSParameter.type.toString.contains("ParameterArrayType")»
		<rosparam param="list">«IF ROSParameter.value!==null»«compile_param_value(ROSParameter.value)»«ENDIF»</rosparam>
		«ELSE»
		<param name="«ROSParameter.name»" value="«compile_param_value(ROSParameter.value)»"/>
		«ENDIF»
	«ENDFOR»
	«FOR component:system.rosComponent»
		«FOR rosPublisher:component.rospublisher»
				«IF component.hasNS»
				«IF !rosPublisher.name.equals(compile_topic_name(rosPublisher.publisher,component.get_ns))»
				<remap from=«compile_topic_name(rosPublisher.publisher,component.get_ns)» to=«rosPublisher.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
				«IF component.hasNS»
				«IF !rosSubscriber.name.equals(compile_topic_name(rosSubscriber.subscriber,component.get_ns))»
				<remap from=«compile_topic_name(rosSubscriber.subscriber,component.get_ns)» to=«rosSubscriber.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
				«IF component.hasNS»
				«IF !rosServiceServer.name.equals(compile_service_name(rosServiceServer.srvserver,component.get_ns))»
				<remap from=«compile_service_name(rosServiceServer.srvserver,component.get_ns)» to=«rosServiceServer.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
				«IF component.hasNS»
				«IF !rosServiceClient.name.equals(compile_service_name(rosServiceClient.srvclient,component.get_ns))»
				<remap from=«compile_service_name(rosServiceClient.srvclient,component.get_ns)» to=«rosServiceClient.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosActionServer:component.rosactionserver»
				«IF component.hasNS»
				«IF !rosActionServer.name.equals(compile_action_name(rosActionServer.actserver,component.get_ns))»
				<remap from=«compile_action_name(rosActionServer.actserver,component.get_ns)» to=«rosActionServer.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosActionClient:component.rosactionclient»
				«IF component.hasNS»
				«IF !rosActionClient.name.equals(compile_action_name(rosActionClient.actclient,component.get_ns))»
				<remap from=«compile_action_name(rosActionClient.actclient,component.get_ns)» to=«rosActionClient.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
	«ENDFOR»
	«FOR component:system.rosComponent»

	<node pkg="«component.compile_pkg»«init_pkg»" type="«component.compile_art»«init_comp()»" name="«component.name»"«IF component.hasNS» ns="«component.get_ns»"«ENDIF» cwd="node" respawn="false" output="screen">«init_comp()»«init_pkg»
		«FOR rosPublisher:component.rospublisher»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosPublisher)»
					«IF component.hasNS»
						«IF !topicConnection.topicName.equals(compile_topic_name(rosPublisher.publisher,component.get_ns))»
						<remap from="«rosPublisher.publisher.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
					«ELSE»					
						«IF !topicConnection.topicName.equals(rosPublisher.publisher.name)»
						<remap from="«rosPublisher.publisher.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.to.contains(rosSubscriber)»
					«IF component.hasNS»					
						«IF !topicConnection.topicName.equals(compile_topic_name(rosSubscriber.subscriber,component.get_ns))»
						<remap from="«rosSubscriber.subscriber.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
					«ELSE»
						«IF !topicConnection.topicName.equals(rosSubscriber.subscriber.name)»
						<remap from="«rosSubscriber.subscriber.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
			«FOR serviceConnection:system.serviceConnections»
				«IF serviceConnection.from.contains(rosServiceServer)»
					«IF component.hasNS»					
						«IF !serviceConnection.serviceName.equals(compile_service_name(rosServiceServer.srvserver,component.get_ns))»
						<remap from="«rosServiceServer.srvserver.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
					«ELSE»
						«IF !serviceConnection.serviceName.equals(rosServiceServer.srvserver.name)»
						<remap from="«rosServiceServer.srvserver.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
			«FOR serviceConnection:system.serviceConnections»
				«IF serviceConnection.to.equals(rosServiceClient)»
					«IF component.hasNS»					
						«IF !serviceConnection.serviceName.equals(compile_service_name(rosServiceClient.srvclient,component.get_ns))»
						<remap from="«rosServiceClient.srvclient.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
					«ELSE»
						«IF !serviceConnection.serviceName.equals(rosServiceClient.srvclient.name)»
						<remap from="«rosServiceClient.srvclient.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosActionServer:component.rosactionserver»
			«FOR actionConnection:system.actionConnections»
				«IF actionConnection.from.equals(rosActionServer)»
					«IF component.hasNS»					
						«IF !actionConnection.actionName.equals(compile_action_name(rosActionServer.actserver,component.get_ns))»
						<remap from="«rosActionServer.actserver.name»" to="«actionConnection.actionName»" />
						«ENDIF»	
					«ELSE»
						«IF !actionConnection.actionName.equals(rosActionServer.actserver.name)»
						<remap from="«rosActionServer.actserver.name»" to="«actionConnection.actionName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosActionClient:component.rosactionclient»
			«FOR actionConnection:system.actionConnections»
				«IF actionConnection.to.equals(rosActionClient)»
					«IF component.hasNS»					
						«IF !actionConnection.actionName.equals(compile_action_name(rosActionClient.actclient,component.get_ns))»
						<remap from="«rosActionClient.actclient.name»" to="«actionConnection.actionName»" />
						«ENDIF»	
					«ELSE»
						«IF !actionConnection.actionName.equals(rosActionClient.actclient.name)»
						<remap from="«rosActionClient.actclient.name»" to="«actionConnection.actionName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosParameter:component.rosparameter»
			«IF rosParameter.parameter.type.toString.contains("ParameterStructType")»«str_output=""»
			<rosparam>
        «rosParameter.name»:
        «IF rosParameter.value.eContents !== null»
		«FOR ParamMember:rosParameter.value.eContents»
        «compile_struc_param(ParamMember,"          ")»
		«ENDFOR»
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

	def compile_struc_param(EObject paramMember, String tab){
		tab_tmp=tab
		//if sequence:
		if(is_seq){
			str_output+=tab+getParamName(paramMember.toString)+":"+compile_param_value(convertParamValue(paramMember.eContents.get(0)))
			str_output+="\n"
			tab_tmp=tab
			is_seq=false
			return str_output.replace("null","")
		}
		else if(paramMember.eContents.get(0).eContents.toString.contains("value")){
			is_seq=false
			//tab+="  "
			str_output+=tab+getParamName(paramMember.eContents.get(0).toString)+":"+compile_param_value(convertParamValue(paramMember.eContents.get(0).eContents.get(0)))
			str_output+="\n"
			tab_tmp=tab
			return str_output.replace("null","")
		}else{
			if(paramMember.eContents.get(0).toString.contains("name")){
			    tab_tmp+="  "
				str_output+=tab_tmp+getParamName(paramMember.eContents.get(0).toString)+":"+"\n"
			    tab_tmp+="  "
			}
			for (paramSubMember: paramMember.eContents){
				if (paramSubMember.eContents.toString.contains("ParameterSequenceImpl")){
					if(!paramSubMember.eContents.get(0).eContents.toString.contains("ParameterStructImpl")){
						is_seq=true
					}
				}
				compile_struc_param(paramSubMember,tab_tmp)
			}
		}
	}

	def List InterfaceDef(String name, String type){
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

 	def getParamName (String paramdef){
 		return paramdef.substring(paramdef.indexOf("name:")+6,paramdef.indexOf(")"))
 	}
 	
	def convertParamValue (Object ParamMember){
		ParamValue=ParamMember as ParameterValue
		return ParamValue
	}
}
