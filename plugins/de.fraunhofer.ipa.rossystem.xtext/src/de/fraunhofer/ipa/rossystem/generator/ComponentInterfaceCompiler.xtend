package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import componentInterface.ComponentInterface
import componentInterface.RosActionClient
import componentInterface.RosActionServer
import componentInterface.RosParameter
import componentInterface.RosPublisher
import componentInterface.RosServiceClient
import componentInterface.RosServiceServer
import componentInterface.RosSubscriber
import java.util.ArrayList
import java.util.List
import ros.ActionClient
import ros.ActionServer
import ros.Parameter
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import rossystem.RosSystem
import ros.ParameterValue
import ros.impl.ParameterStructMemberImpl
import ros.Node

class ComponentInterfaceCompiler {
	@Inject extension GeneratorHelpers
	
	List<RosPublisher> pubs
	List<RosSubscriber> subs
	List<RosServiceServer> svrs
	List<RosServiceClient> svrc
	List<RosActionServer> acts
	List<RosActionClient> actc
	List<RosParameter> rosparams
	
	List<String> pubs_names
	List<String> subs_names
	List<String> svrs_names
	List<String> svrc_names
	List<String> acts_names
	List<String> actc_names
	
	int count_pub
	int count_sub
	int count_srvc
	int count_srvs
	int count_acts
	int count_actc
	int count_param
	boolean ArtifactSet
	boolean PackageSet
	
	String artifact_impl
	Object artifact_name
	String node_impl
	String node_name
	
	String param_value
	String value_return
	
	def compile_toComponentInterface(RosSystem system){

	pubs = new ArrayList()
	subs = new ArrayList()
	svrs = new ArrayList()
	svrc = new ArrayList()
	acts = new ArrayList()
	actc = new ArrayList()
	rosparams = new ArrayList()
	
	pubs_names = new ArrayList()
	subs_names = new ArrayList()
	svrs_names = new ArrayList()
	svrc_names = new ArrayList()
	acts_names = new ArrayList()
	actc_names = new ArrayList()
	
		
	for (component: system.rosComponent){
		for ( pub:component.rospublisher){if (!pubs_names.contains(pub.name)) pubs.add(pub); pubs_names.add(pub.name)}
		for ( sub:component.rossubscriber){if (!subs_names.contains(sub.name)) subs.add(sub); subs_names.add(sub.name)}
		for ( srv:component.rosserviceserver){if (!svrs_names.contains(srv.name)) svrs.add(srv); svrs_names.add(srv.name)}
		for ( cl: component.rosserviceclient){if (!svrc_names.contains(cl.name)) svrc.add(cl); svrc_names.add(cl.name)}
		for ( act:component.rosactionserver){if (!acts_names.contains(act.name)) acts.add(act); acts_names.add(act.name)}
		for ( acl: component.rosactionclient){if (!actc_names.contains(acl.name)) actc.add(acl); actc_names.add(acl.name)}
		for ( param: component.rosparameter){ rosparams.add(param)}
	}

	count_pub = pubs.length
	count_sub = subs.length
	count_srvs = svrs.length
	count_srvc = svrc.length
	count_acts = acts.length
	count_actc = actc.length
	count_param = rosparams.length+system.parameter.length

	
	'''«init_comp()»
ComponentInterface { name «system.name»
«IF !pubs.empty»
RosPublishers{
	«FOR pub:pubs»
	«val count_pub=count_pub--»
	RosPublisher "«pub.name»" { RefPublisher "«pub.publisher.package_pub».«pub.publisher.artifact_pub».«pub.publisher.node_pub».«pub.publisher.name»"}«IF count_pub > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !subs.empty»
RosSubscribers{
	«FOR sub:subs»
	«val count_sub=count_sub--»
	RosSubscriber "«sub.name»" { RefSubscriber "«sub.subscriber.package_sub».«sub.subscriber.artifact_sub».«sub.subscriber.node_sub».«sub.subscriber.name»"}«IF count_sub > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !svrs.empty»
RosSrvServers{
	«FOR svrs:svrs»
	«val count_srvs=count_srvs--»
	RosServiceServer "«svrs.name»" { RefServer "«svrs.srvserver.package_srvserv».«svrs.srvserver.artifact_srvserv».«svrs.srvserver.node_srvserv».«svrs.srvserver.name»"}«IF count_srvs > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !svrc.empty»
RosSrvClients{
	«FOR svrc:svrc»
	«val count_srvc=count_srvc--»
	RosServiceClient "«svrc.name»" { RefClient "«svrc.srvclient.package_srvcli».«svrc.srvclient.artifact_srvcli».«svrc.srvclient.node_srvcli».«svrc.srvclient.name»"}«IF count_srvc > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !acts.empty»
RosActionServers{
	«FOR acts:acts»
	«val count_acts=count_acts--»
	RosActionServer "«acts.name»" { RefServer "«acts.actserver.package_actserver».«acts.actserver.artifact_actserver».«acts.actserver.node_actserver».«acts.actserver.name»"}«IF count_acts > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !actc.empty»
RosActionClients{
	«FOR actc:actc»
	«val count_actc=count_actc--»
	RosActionClient "«actc.name»" { RefClient "«actc.actclient.package_actclient».«actc.actclient.artifact_actclient».«actc.actclient.node_actclient».«actc.actclient.name»"}«IF count_actc > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF count_param>0»
RosParameters{
	«FOR param:rosparams»
	«val count_param=count_param--»
	RosParameter "«compile_param_name(param.parameter,"")»" { RefParameter "«param.parameter.package_rosparam».«param.parameter.artifact_rosparam».«param.parameter.node_rosparam».«param.parameter.name»"«IF param.value!==null » value «compile_rosparam_value(param.value)»«ENDIF» }«IF count_param > 1»,«ENDIF»
	«ENDFOR»«FOR param:system.parameter»
	«val count_param=count_param--»
	RosParameter "«param.name»" { RefParameter "«param.name»"«IF param.value!==null » value «compile_rosparam_value(param.value)»«ENDIF» }«IF count_param > 1»,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
}
'''
}

	def void init_comp(){
		ArtifactSet=false
		PackageSet=false
	}
	
	def compile_art(ComponentInterface component)
'''«IF ! (component.fromRosNode===null)»«component.fromRosNode.getArtifact_rosnode»«ELSEIF !ArtifactSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !ArtifactSet»«Rospublisher.publisher.getArtifact_pub()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !ArtifactSet»«Rossubscriber.subscriber.getArtifact_sub()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !ArtifactSet»«Rosserviceserver.srvserver.getArtifact_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !ArtifactSet»«Rosserviceclient.srvclient.getArtifact_srvcli()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosparameter.empty»«FOR RosParameter:component.rosparameter»«IF !ArtifactSet»«RosParameter.parameter.getArtifact_rosparam()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosactionserver.empty»«FOR Rosactionserver:component.rosactionserver»«IF !ArtifactSet»«Rosactionserver.actserver.getArtifact_actserver()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosactionclient.empty»«FOR Rosactionclient:component.rosactionclient»«IF !ArtifactSet»«Rosactionclient.actclient.getArtifact_actclient()»«ENDIF»«ENDFOR»«ENDIF»'''
	def getArtifact_pub(Publisher publisher){
		artifact_impl = publisher.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_sub(Subscriber subscriber){
		artifact_impl = subscriber.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_srvserv(ServiceServer serviceserver){
		artifact_impl = serviceserver.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_srvcli(ServiceClient serviceclient){
		artifact_impl = serviceclient.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_actserver(ActionServer actionserver){
		artifact_impl = actionserver.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_actclient(ActionClient actionclient){
		artifact_impl = actionclient.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_rosparam(Parameter param){
		artifact_impl = param.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_rosnode(Node node){
		artifact_impl = node.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact(String artifact_impl){
		artifact_name = artifact_impl.substring(artifact_impl.indexOf("name")+6,artifact_impl.length-1)
		ArtifactSet=true;
		return artifact_name;
	}
	
	def getNode_pub(Publisher publisher){
		node_impl = publisher.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_sub(Subscriber subscriber){
		node_impl = subscriber.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_srvserv(ServiceServer serviceserver){
		node_impl = serviceserver.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_srvcli(ServiceClient serviceclient){
		node_impl = serviceclient.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_actserver(ActionServer actionserver){
		node_impl = actionserver.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_actclient(ActionClient actionclient){
		node_impl = actionclient.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_rosparam(Parameter param){
		node_impl = param.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode(String node_impl){
		node_name = node_impl.substring(node_impl.indexOf("name")+6,node_impl.length-1)
		return node_name;
	}
	
	def prefix(String NS){
		if(NS===""){
			return NS
		} else {
			return NS+"/"
		}
	}
	
	def compile_topic_name(Publisher publisher, String NS){
		return prefix(NS)+publisher.name;
	}
	def compile_topic_name(Subscriber subscriber, String NS){
		return prefix(NS)+subscriber.name;
	}
	def compile_service_name(ServiceServer serviceserver, String NS){
		return prefix(NS)+serviceserver.name;
	}
	def compile_service_name(ServiceClient serviceclient, String NS){
		return prefix(NS)+serviceclient.name;
	}
	def compile_action_name(ActionServer actionserver, String NS){
		return prefix(NS)+actionserver.name;
	}
	def compile_action_name(ActionClient actionclient, String NS){
		return prefix(NS)+actionclient.name;
	}
	def compile_param_name(Parameter param, String NS){
		return prefix(NS)+param.name;
	}

	def compile_rosparam_value(ParameterValue paramValue){
		 value_return =""
		 param_value = paramValue.toString
		 if (param_value.contains("(value:")){
		 	value_return= param_value.substring(param_value.indexOf("value:")+7,param_value.indexOf(")"))
		 } else if(param_value.contains("ParameterSequenceImpl")){
		 	value_return+="{"
		 	for(param: paramValue.eContents){
		 		if (param.toString.contains("(value:")){
		 			value_return+=param.toString.substring(param.toString.indexOf("value:")+7,param.toString.indexOf(")"))
			 	} else {
			 		for(subparam: param.eContents){
				 		if (subparam.toString.contains("ParameterStructMemberImpl")){
				 			value_return+=getStructValue(subparam as ParameterStructMemberImpl)
		 }}}
		 value_return+=","
		 }
		 value_return = value_return.substring(0, value_return.length() - 1);
		 value_return+="}"
		 return value_return
 	}}
 	 	
 	def getStructValue(ParameterStructMemberImpl Param_member){
 		return "\n          { "+ Param_member.name + " { value " + compile_rosparam_value(Param_member.value) + " }}"
 		
 	}
 	
 	def compile_param_value(ParameterValue paramValue){
		 value_return =""
		 param_value = paramValue.toString
		 if (param_value.contains("(value:")){
		 	value_return= param_value.substring(param_value.indexOf("value:")+7,param_value.indexOf(")"))
		 } else if(param_value.contains("ParameterSequenceImpl")){
		 		value_return+="["
		 	for(param: paramValue.eContents){
		 		if (param.toString.contains("(value:")){
		 			value_return+=param.toString.substring(param.toString.indexOf("value:")+7,param.toString.indexOf(")"))
		 			value_return+=","
		 			
		 	}}
		 	value_return = value_return.substring(0, value_return.length() - 1);
		 	value_return+="]"
		 	}
		 return value_return
 	}
	
}
