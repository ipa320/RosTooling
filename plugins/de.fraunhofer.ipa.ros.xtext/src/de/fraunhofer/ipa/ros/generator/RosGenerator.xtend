/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.generator

import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import ros.Node
import ros.Package
import org.eclipse.xtext.generator.IContextualOutputConfigurationProvider

class CICustomOutputProvider implements IOutputConfigurationProvider, IContextualOutputConfigurationProvider {
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
	
	override Set<OutputConfiguration> getOutputConfigurations(Resource context) {
		return getOutputConfigurations()
	}
	
}

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RosGenerator extends AbstractGenerator {

	int count_pub
	int count_sub
	int count_srvs
	int count_srvc
	int count_acts
	int count_actc
	int count_param
		
	String artifact_name
	String package_name
	
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (pkg : resource.allContents.toIterable.filter(Package)){
			package_name=pkg.name
			if (!pkg.artifact.empty) {
				artifact_name=pkg.artifact.get(0).name 
			}
		}
		for (node : resource.allContents.toIterable.filter(Node)){
			fsa.generateFile(node.getName()+".componentinterface",CICustomOutputProvider::CM_CONFIGURATION,compile(node,package_name,artifact_name))
			
		}
	}

def compile (Node node, String package_name, String artifact_name){

	count_pub = node.publisher.length
	count_sub = node.subscriber.length
	count_srvs = node.serviceserver.length
	count_srvc = node.serviceclient.length
	count_acts = node.actionserver.length
	count_actc = node.actionclient.length
	count_param = node.parameter.length

	
'''
ComponentInterface { name «node.name»
	FromRosNode "«package_name».«artifact_name».«node.name»"
	«IF !node.publisher.empty»
	RosPublishers{
«FOR pub:node.publisher»
«val count_pub=count_pub--»
		RosPublisher "«pub.name»" { RefPublisher "«package_name».«artifact_name».«node.name».«pub.name»"}«IF count_pub > 1 »,«ENDIF»
«ENDFOR»
	}
	«ENDIF»
	«IF !node.subscriber.empty»
	RosSubscribers{
«FOR sub:node.subscriber»
«val count_sub=count_sub--»
		RosSubscriber "«sub.name»" { RefSubscriber "«package_name».«artifact_name».«node.name».«sub.name»"}«IF count_sub > 1 »,«ENDIF»
«ENDFOR»
	}
	«ENDIF»
	«IF !node.serviceserver.empty»
	RosSrvServers{
«FOR svrs:node.serviceserver»
«val count_srvs=count_srvs--»
		RosServiceServer "«svrs.name»" { RefServer "«package_name».«artifact_name».«node.name».«svrs.name»"}«IF count_srvs > 1 »,«ENDIF»
«ENDFOR»
	}
	«ENDIF»
	«IF !node.serviceclient.empty»
	RosSrvClients{
«FOR svrc:node.serviceclient»
«val count_srvc=count_srvc--»
		RosServiceClient "«svrc.name»" { RefClient "«package_name».«artifact_name».«node.name».«svrc.name»"}«IF count_srvc > 1 »,«ENDIF»
«ENDFOR»
	}
	«ENDIF»
	«IF !node.actionserver.empty»
	RosActionServers{
«FOR acts:node.actionserver»
«val count_acts=count_acts--»
		RosActionServer "«acts.name»" { RefServer "«package_name».«artifact_name».«node.name».«acts.name»"}«IF count_acts > 1 »,«ENDIF»
«ENDFOR»
	}
	«ENDIF»
	«IF !node.actionclient.empty»
	RosActionClients{
«FOR actc:node.actionclient»
«val count_actc=count_actc--»
		RosActionClient "«actc.name»" { RefClient "«package_name».«artifact_name».«node.name».«actc.name»"}«IF count_actc > 1 »,«ENDIF»
«ENDFOR»
	}
	«ENDIF»
	
	«IF !node.parameter.empty»
		RosParameters{
	«FOR param:node.parameter»
	«val count_param=count_param--»
			RosParameter "«param.name»" { RefParameter "«package_name».«artifact_name».«node.name».«param.name»"}«IF count_param > 1 »,«ENDIF»
	«ENDFOR»
		}
	«ENDIF»
}
 '''
}

}
