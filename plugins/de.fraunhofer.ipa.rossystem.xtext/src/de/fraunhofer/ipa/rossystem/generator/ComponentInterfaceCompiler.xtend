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
import ros.impl.ArtifactImpl
import org.eclipse.emf.ecore.EObject
import ros.impl.NodeImpl

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
	
	ArtifactImpl artifact_impl
	NodeImpl node_impl
	
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
	RosPublisher "«pub.name»" { RefPublisher "«pub.publisher.package_pub.name».«pub.publisher.getArtifact».«pub.publisher.getNode».«pub.publisher.name»"}«IF count_pub > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !subs.empty»
RosSubscribers{
	«FOR sub:subs»
	«val count_sub=count_sub--»
	RosSubscriber "«sub.name»" { RefSubscriber "«sub.subscriber.package_sub.name».«sub.subscriber.getArtifact».«sub.subscriber.getNode».«sub.subscriber.name»"}«IF count_sub > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !svrs.empty»
RosSrvServers{
	«FOR svrs:svrs»
	«val count_srvs=count_srvs--»
	RosServiceServer "«svrs.name»" { RefServer "«svrs.srvserver.package_srvserv.name».«svrs.srvserver.getArtifact».«svrs.srvserver.getNode».«svrs.srvserver.name»"}«IF count_srvs > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !svrc.empty»
RosSrvClients{
	«FOR svrc:svrc»
	«val count_srvc=count_srvc--»
	RosServiceClient "«svrc.name»" { RefClient "«svrc.srvclient.package_srvcli.name».«svrc.srvclient.getArtifact».«svrc.srvclient.getNode».«svrc.srvclient.name»"}«IF count_srvc > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !acts.empty»
RosActionServers{
	«FOR acts:acts»
	«val count_acts=count_acts--»
	RosActionServer "«acts.name»" { RefServer "«acts.actserver.package_actserver.name».«acts.actserver.getArtifact».«acts.actserver.getNode».«acts.actserver.name»"}«IF count_acts > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !actc.empty»
RosActionClients{
	«FOR actc:actc»
	«val count_actc=count_actc--»
	RosActionClient "«actc.name»" { RefClient "«actc.actclient.package_actclient.name».«actc.actclient.getArtifact».«actc.actclient.getNode».«actc.actclient.name»"}«IF count_actc > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF count_param>0»
RosParameters{
	«FOR param:rosparams»
	«val count_param=count_param--»
	RosParameter "«compile_param_name(param.parameter,"")»" { RefParameter "«param.parameter.package_rosparam.name».«param.parameter.getArtifact».«param.parameter.getNode».«param.parameter.name»"«IF param.value!==null » value «compile_rosparam_value(param.value)»«ENDIF» }«IF count_param > 1»,«ENDIF»
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
'''«IF ! (component.fromRosNode===null)»«component.fromRosNode.getArtifactFromNode»«ELSEIF !ArtifactSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !ArtifactSet»«Rospublisher.publisher.getArtifact()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !ArtifactSet»«Rossubscriber.subscriber.getArtifact()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !ArtifactSet»«Rosserviceserver.srvserver.getArtifact()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !ArtifactSet»«Rosserviceclient.srvclient.getArtifact()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosparameter.empty»«FOR RosParameter:component.rosparameter»«IF !ArtifactSet»«RosParameter.parameter.getArtifact()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosactionserver.empty»«FOR Rosactionserver:component.rosactionserver»«IF !ArtifactSet»«Rosactionserver.actserver.getArtifact()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosactionclient.empty»«FOR Rosactionclient:component.rosactionclient»«IF !ArtifactSet»«Rosactionclient.actclient.getArtifact()»«ENDIF»«ENDFOR»«ENDIF»'''
	
	def getArtifact(EObject interfaz){
		artifact_impl = interfaz.eContainer.eContainer as ArtifactImpl;
		ArtifactSet=true;
		return artifact_impl.name
	}
	
	def getArtifactFromNode(Node node){
		artifact_impl = node.eContainer as ArtifactImpl;
		ArtifactSet=true;
		return artifact_impl.name
	}

	def getNode(EObject interfaz){
		node_impl = interfaz.eContainer as NodeImpl;
		return node_impl.name;
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
