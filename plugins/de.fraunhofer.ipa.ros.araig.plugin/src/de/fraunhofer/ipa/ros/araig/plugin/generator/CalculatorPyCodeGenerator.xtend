package de.fraunhofer.ipa.ros.araig.plugin.generator;

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import java.util.Set
import ros.Node

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String CALCULATOR_OUTPUT = "CALCULATOR_OUTPUT"
	
	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration observer_config = new OutputConfiguration(CALCULATOR_OUTPUT)
		observer_config.setDescription("CALCULATOR_OUTPUT");
		observer_config.setOutputDirectory("./src-gen/calculators/");
		observer_config.setOverrideExistingResources(true);
		observer_config.setCreateOutputDirectory(true);
		observer_config.setCleanUpDerivedResources(true);
		observer_config.setSetDerivedProperty(true);
		return newHashSet(observer_config)
	}
}


class CalculatorPyCodeGenerator extends AbstractGenerator {

	int count_sub
	
	def void createXtextGenerationFolder (IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("lock",CustomOutputProvider::CALCULATOR_OUTPUT,'''''');
		fsa.deleteFile("lock",CustomOutputProvider::CALCULATOR_OUTPUT);
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
			for (node : resource.allContents.toIterable.filter(Node)){
				fsa.generateFile(node.getName()+".py",CustomOutputProvider::CALCULATOR_OUTPUT,node.compile)
				}
			}

def compile(Node node) {
	count_sub = node.subscriber.size
'''

Node name: «node.name»

«FOR sub:node.subscriber»
Subscriber:
  name: «sub.name»
  type: «sub.message.fullname»
«ENDFOR»


«FOR pub:node.publisher»
Publisher:
  name: «pub.name»
  type: «pub.message.fullname»
«ENDFOR»
'''
}

}