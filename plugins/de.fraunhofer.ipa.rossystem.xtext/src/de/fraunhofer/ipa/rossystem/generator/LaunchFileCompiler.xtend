package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import componentInterface.ComponentInterface
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import ros.ParameterValue
import rossystem.RosSystem

class LaunchFileCompiler {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler

	List<String> ListInterfaceDef
	ParameterValue ParamValue
	String str_output=""
	String tab_tmp=""	
	List<Integer> sizes_list = new ArrayList<Integer>();
	List<EObject> param_list = new ArrayList<EObject>();
	
	int i=0;
	int k=0;

	def compile_tolaunch(RosSystem system) '''«init_comp()»
<?xml version="1.0"?>
<launch>
  «FOR ROSParameter:system.parameter»
  	«IF ROSParameter.type.toString.contains("ParameterStructType")»
  	<rosparam>
		  «IF ROSParameter.value!==null»
			  «FOR ParamMember:ROSParameter.value.eContents»
			«getParamName(ParamMember.eContents.get(0).toString)»:«compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))»
			  «ENDFOR»
		  «ELSE»
			  «FOR ParamMember:ROSParameter.eContents.get(0).eContents»
				  «IF !(ParamMember.eContents.get(0).eContents.empty)»
				«getParamName(ParamMember.toString)»:«compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))»
				  «ENDIF»
			  «ENDFOR»
		  «ENDIF»
  	</rosparam>
  	«ELSEIF ROSParameter.type.toString.contains("ParameterListType") || ROSParameter.type.toString.contains("ParameterArrayType")»
  	<rosparam param="list">«IF ROSParameter.value!==null»«compile_param_value(ROSParameter.value)»«ENDIF»</rosparam>
  	«ELSE»
  		<param name="«ROSParameter.name»" value="«compile_param_value(ROSParameter.value)»"/>
  	«ENDIF»
  «ENDFOR»
	«FOR component:system.rosComponent»
		«FOR rosPublisher:component.rospublisher»
				«IF component.hasNS»«IF !rosPublisher.name.equals(compile_topic_name(rosPublisher.publisher,component.get_ns()))»
				<remap from=«compile_topic_name(rosPublisher.publisher,component.get_ns())» to=«rosPublisher.name» />
				«ENDIF»«ENDIF»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
				«IF component.hasNS»«IF !rosSubscriber.name.equals(compile_topic_name(rosSubscriber.subscriber,component.get_ns()))»
				<remap from=«compile_topic_name(rosSubscriber.subscriber,component.get_ns())» to=«rosSubscriber.name» />
				«ENDIF»«ENDIF»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
				«IF component.hasNS»«IF !rosServiceServer.name.equals(compile_service_name(rosServiceServer.srvserver,component.get_ns()))»
				<remap from=«compile_service_name(rosServiceServer.srvserver,component.get_ns())» to=«rosServiceServer.name» />
				«ENDIF»«ENDIF»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
				«IF component.hasNS»«IF !rosServiceClient.name.equals(compile_service_name(rosServiceClient.srvclient,component.get_ns()))»
				<remap from=«compile_service_name(rosServiceClient.srvclient,component.get_ns())» to=«rosServiceClient.name» />
				«ENDIF»«ENDIF»
		«ENDFOR»
		«FOR rosActionServer:component.rosactionserver»
				«IF component.hasNS»«IF !rosActionServer.name.equals(compile_action_name(rosActionServer.actserver,component.get_ns()))»
				<remap from=«compile_action_name(rosActionServer.actserver,component.get_ns())» to=«rosActionServer.name» />
				«ENDIF»«ENDIF»
		«ENDFOR»
		«FOR rosActionClient:component.rosactionclient»
				«IF component.hasNS»«IF !rosActionClient.name.equals(compile_action_name(rosActionClient.actclient,component.get_ns()))»
				<remap from=«compile_action_name(rosActionClient.actclient,component.get_ns())» to=«rosActionClient.name» />
				«ENDIF»«ENDIF»
		«ENDFOR»
	«ENDFOR»

	«FOR component:system.rosComponent»
	<node pkg="«component.compile_pkg»«init_pkg»" type="«component.compile_art»«init_comp()»" name="«component.name»"«IF component.hasNS» ns="«component.get_ns»"«ENDIF» cwd="node" respawn="false" output="screen">«init_comp()»«init_pkg»
		«FOR rosPublisher:component.rospublisher»
			«IF !rosPublisher.name.equals(compile_topic_name(rosPublisher.publisher,component.check_ns))»
				<remap from="«rosPublisher.publisher.name»" to="«rosPublisher.name»" />
			«ENDIF»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosPublisher)»
					«IF !topicConnection.topicName.equals(rosPublisher.name)»
					<remap from="«rosPublisher.name»" to="«topicConnection.topicName»" />
					«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
			«IF !rosSubscriber.name.equals(compile_topic_name(rosSubscriber.subscriber,component.check_ns))»
				<remap from="«rosSubscriber.subscriber.name»" to="«rosSubscriber.name»" />
			«ENDIF»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosSubscriber)»
					«IF !topicConnection.topicName.equals(rosSubscriber.name)»
					<remap from="«rosSubscriber.name»" to="«topicConnection.topicName»" />
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
			«IF !rosServiceServer.name.equals(compile_service_name(rosServiceServer.srvserver,component.check_ns))»
				<remap from="«rosServiceServer.srvserver.name»" to="«rosServiceServer.name»" />
			«ENDIF»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosServiceServer)»
					«IF !topicConnection.topicName.equals(rosServiceServer.name)»
					<remap from="«rosServiceServer.name»" to="«topicConnection.topicName»" />
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
			«IF !rosServiceClient.name.equals(compile_service_name(rosServiceClient.srvclient,component.check_ns))»
				<remap from="«rosServiceClient.srvclient.name»" to="«rosServiceClient.name»" />
			«ENDIF»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosServiceClient)»
					«IF !topicConnection.topicName.equals(rosServiceClient.name)»
					<remap from="«rosServiceClient.name»" to="«topicConnection.topicName»" />
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR rosActionServer:component.rosactionserver»
			«IF !rosActionServer.name.equals(compile_action_name(rosActionServer.actserver,component.check_ns))»
				<remap from="«rosActionServer.actserver.name»" to="«rosActionServer.name»" />
			«ENDIF»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosActionServer)»
					«IF !topicConnection.topicName.equals(rosActionServer.name)»
					<remap from="«rosActionServer.name»" to="«topicConnection.topicName»" />
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDFOR»
		«FOR rosActionClient:component.rosactionclient»
			«IF !rosActionClient.name.equals(compile_action_name(rosActionClient.actclient,component.check_ns))»
				<remap from="«rosActionClient.actclient.name»" to="«rosActionClient.name»" />
			«ENDIF»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosActionClient)»
					«IF !topicConnection.topicName.equals(rosActionClient.name)»
					<remap from="«rosActionClient.name»" to="«topicConnection.topicName»" />
					«ENDIF»
				«ENDIF»
			«ENDFOR»
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
					str_output+=tab_tmp+getParamName(SubParamMember.toString)+": \n";
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

 	def getParamName (String paramdef){
 		return paramdef.substring(paramdef.indexOf("name:")+6,paramdef.indexOf(")"))
 	}
 	
	def convertParamValue (Object ParamMember){
		ParamValue=ParamMember as ParameterValue
		return ParamValue
	}
}
