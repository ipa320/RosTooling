/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.generator

import componentInterface.ComponentInterface
import componentInterface.RosPublisher
import componentInterface.RosServiceClient
import componentInterface.RosServiceServer
import componentInterface.RosSubscriber
import java.util.ArrayList
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import rossystem.RosSystem
import ros.ActionServer
import ros.ActionClient
import componentInterface.RosActionServer
import componentInterface.RosActionClient
import ros.ParameterValue
import componentInterface.RosParameter
import ros.Parameter
import ros.impl.ParameterStructMemberImpl

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String CM_CONFIGURATION = "CM_CONFIGURATION"
	public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"
	

	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration cm_config = new OutputConfiguration(CM_CONFIGURATION)
		cm_config.setDescription("CM_CONFIGURATION");
		cm_config.setOutputDirectory("./components/");
		cm_config.setOverrideExistingResources(true);
		cm_config.setCreateOutputDirectory(true);
		cm_config.setCleanUpDerivedResources(false);
		cm_config.setSetDerivedProperty(false);
		var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
		default_config.setDescription("DEFAULT_OUTPUT");
		default_config.setOutputDirectory("./src-gen/");
		default_config.setOverrideExistingResources(true);
		default_config.setCreateOutputDirectory(true);
		default_config.setCleanUpDerivedResources(false);
		default_config.setSetDerivedProperty(false);
		return newHashSet(cm_config, default_config)
	}
}

class RosSystemGenerator extends AbstractGenerator {

	String package_name	
	String package_impl
	Object artifact_name
	String artifact_impl
	String Pkg
	
	boolean PackageSet
	
	boolean ArtifactSet

	List<String> ListInterfaceDef
	List<CharSequence> PkgsList
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
	
	String node_impl
	
	String node_name
	
	String param_value
	String value_return
	ParameterValue ParamValue
	
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName()+".launch",system.compile_tolaunch)
				}
	
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName()+".componentinterface",CustomOutputProvider::CM_CONFIGURATION,system.compile_toComponentInterface)
				}
				
	
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName()+"install.sh",system.compile_toIntallScript)
				}
			}
	
	
	def compile_tolaunch(RosSystem system) '''«init()»
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

	<node pkg="«component.compile_pkg»" type="«component.compile_art»«init()»" name="«component.name»"«IF component.hasNS» ns="«component.get_ns»"«ENDIF» cwd="node" respawn="false" output="screen">«init()»
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
			«IF rosParameter.parameter.type.toString.contains("ParameterStructType")»
				«FOR ParamMember:rosParameter.value.eContents»
						<param name=«getParamName(ParamMember.eContents.get(0).toString)» value=«compile_param_value(convertParamValue(ParamMember.eContents.get(0).eContents.get(0)))» />
				«ENDFOR»
			«ELSE»
						«IF rosParameter.value!==null»<param name=«rosParameter.parameter.name» value=«compile_param_value(rosParameter.value)» />«ENDIF»
			«ENDIF»
		«ENDFOR»
	</node>
	«ENDFOR»

</launch>
	'''

def List InterfaceDef(String name, String type){
	ListInterfaceDef = new ArrayList()
	ListInterfaceDef.add(name.replace("/","_"))
	ListInterfaceDef.add(name)
	ListInterfaceDef.add(type)
	return ListInterfaceDef
}
	
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

	
	'''
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

def compile_pkg(ComponentInterface component) 
'''«IF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackage_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackage_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackage_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackage_srvcli()»«ENDIF»«ENDFOR»«ENDIF»'''
	
	def void init(){
		PackageSet=false
		ArtifactSet=false
	}
	def getPackage_pub(Publisher publisher){
		package_impl = publisher.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_sub(Subscriber subscriber){
		package_impl = subscriber.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_srvserv(ServiceServer serviceserver){
		package_impl = serviceserver.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_srvcli(ServiceClient serviceclient){
		package_impl = serviceclient.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_actserver(ActionServer actionserver){
		package_impl = actionserver.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_actclient(ActionClient actionclient){
		package_impl = actionclient.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_rosparam (Parameter param){
		package_impl = param.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}

	def getPackage(String package_impl){
			package_name = package_impl.substring(package_impl.indexOf("name")+6,package_impl.length-1)
			PackageSet=true;
			return package_name;
	}
	
	def compile_art(ComponentInterface component) 	
'''«IF !ArtifactSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !ArtifactSet»«Rospublisher.publisher.getArtifact_pub()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !ArtifactSet»«Rossubscriber.subscriber.getArtifact_sub()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !ArtifactSet»«Rosserviceserver.srvserver.getArtifact_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !ArtifactSet»«Rosserviceclient.srvclient.getArtifact_srvcli()»«ENDIF»«ENDFOR»«ENDIF»'''
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
	
	def compile_topic_name(Publisher publisher, String NS){
		return NS+"/"+publisher.name;
	}
	def compile_topic_name(Subscriber subscriber, String NS){
		return NS+"/"+subscriber.name;
	}
	def compile_service_name(ServiceServer serviceserver, String NS){
		return NS+"/"+serviceserver.name;
	}
	def compile_service_name(ServiceClient serviceclient, String NS){
		return NS+"/"+serviceclient.name;
	}
	def compile_action_name(ActionServer actionserver, String NS){
		return NS+"/"+actionserver.name;
	}
	def compile_action_name(ActionClient actionclient, String NS){
		return NS+"/"+actionclient.name;
	}
	def compile_param_name(Parameter param, String NS){
		return NS+"/"+param.name;
	}
	
	def compile_rosparam_value(ParameterValue paramValue){
		 value_return =""
		 param_value = paramValue.toString
		 if (param_value.contains("(value:")){
		 	value_return= param_value.substring(param_value.indexOf("value:")+6,param_value.indexOf(")"))
		 } else if(param_value.contains("ParameterSequenceImpl")){
		 	value_return+="{"
		 	for(param: paramValue.eContents){
		 		if (param.toString.contains("(value:")){
		 			value_return+=param.toString.substring(param.toString.indexOf("value:")+6,param.toString.indexOf(")"))
			 	} else {
			 		for(subparam: param.eContents){
				 		if (subparam.toString.contains("ParameterStructMemberImpl")){
				 			value_return+=getStructValue(subparam as ParameterStructMemberImpl)
			 	}}
		 }
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
		 	value_return= param_value.substring(param_value.indexOf("value:")+6,param_value.indexOf(")"))
		 } else if(param_value.contains("ParameterSequenceImpl")){
		 		value_return+="["
		 	for(param: paramValue.eContents){
		 		if (param.toString.contains("(value:")){
		 			value_return+=param.toString.substring(param.toString.indexOf("value:")+6,param.toString.indexOf(")"))
		 			value_return+=","
		 			
		 	}}
		 	value_return = value_return.substring(0, value_return.length() - 1);
		 	value_return+="]"
		 	}
		 return value_return
 	}
 	
 	def getParamName (String paramdef){
 		return paramdef.substring(paramdef.indexOf("name:")+6,paramdef.indexOf(")"))
 	}
 	
	def convertParamValue (Object ParamMember){
		ParamValue=ParamMember as ParameterValue
		return ParamValue
	}
	
	def compile_toIntallScript(RosSystem system) '''«init()»
#!/bin/bash

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

for pkg in «FOR pkg:system.getPkgsDependencies»«pkg» «ENDFOR»
do
    sudo apt install ros-$distro-$pkg
done'''
		
	def <String> getPkgsDependencies(RosSystem rossystem){
		PkgsList = new ArrayList()
		for (component:rossystem.rosComponent){
			init()
			Pkg = component.compile_pkg.toString()
			if (!PkgsList.contains(Pkg)){
				PkgsList.add(Pkg.replace("_","-"))
			}
		}
		return PkgsList;
	}
}
