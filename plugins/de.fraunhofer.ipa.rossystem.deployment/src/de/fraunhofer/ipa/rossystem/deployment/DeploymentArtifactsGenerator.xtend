package de.fraunhofer.ipa.rossystem.deployment

import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import de.fraunhofer.ipa.rossystem.deployment.RosInstallCompiler
import de.fraunhofer.ipa.rossystem.deployment.DockerComposeCompiler
import de.fraunhofer.ipa.rossystem.deployment.DockerContainerCompiler
import de.fraunhofer.ipa.rossystem.deployment.GitActionCompiler
import rossystem.RosSystem;
import java.util.HashMap
import java.util.Map

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"


	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
		default_config.setDescription("DEFAULT_OUTPUT");
		default_config.setOutputDirectory("./src-gen/");
		default_config.setOverrideExistingResources(true);
		default_config.setCreateOutputDirectory(true);
		default_config.setCleanUpDerivedResources(true);
		default_config.setSetDerivedProperty(true);
		return newHashSet(default_config)
	}
}

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DeploymentArtifactsGenerator extends AbstractGenerator {

	DockerContainerCompiler docker_compiler = new DockerContainerCompiler()
	RosInstallCompiler rosintall_compiler = new RosInstallCompiler()
	DockerComposeCompiler dockercompose_compiler = new DockerComposeCompiler()
	GitActionCompiler gitaction_compiler = new GitActionCompiler()
	

	String ros_distro
	Integer ros_version
	String system_prefix 
	String stack_prefix
	def get_ros_distro(String distro) {
		ros_distro = distro
	}	
	def get_ros_version(Integer version){
		ros_version = version
	}
	
	def create_system_prefix(RosSystem system){
		if (ros_version == 2) {
			return system.getName().toLowerCase + "_ros2"
		}else{
			return system.getName().toLowerCase
		}
	}
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// ROS1 package
		for (system : resource.allContents.toIterable.filter(RosSystem)){
			system_prefix = create_system_prefix(system)
			if (system.componentStack.size==0){
				fsa.generateFile(system_prefix +"/Dockerfile",docker_compiler.compile_toDockerContainer(system, null, ros_distro, ros_version))
 				fsa.generateFile(system_prefix +"/extra_layer/" + system.getName().toLowerCase + ".rosinstall",rosintall_compiler.compile_toRosInstall(system,null))
				fsa.generateFile(system_prefix +"/extra_layer/Dockerfile",docker_compiler.compile_toDockerImageExtraLayer(system, null,ros_distro, ros_version))
			} else {
				for (stack : system.componentStack){
					stack_prefix = String.join("/", system_prefix, system.name.toLowerCase+'_'+stack.name.toLowerCase)
					fsa.generateFile(String.join("/", stack_prefix, "Dockerfile"),docker_compiler.compile_toDockerContainer(system, stack, ros_distro, ros_version))
			 		fsa.generateFile(String.join("/", stack_prefix, "extra_layer", stack.name.toLowerCase+".rosinstall"),rosintall_compiler.compile_toRosInstall(system,stack))
			 		fsa.generateFile(String.join("/", stack_prefix, "extra_layer", "Dockerfile"),docker_compiler.compile_toDockerImageExtraLayer(system,stack, ros_distro, ros_version))
			}
			}
			fsa.generateFile(String.join("/", system_prefix, "docker-compose.yml"),dockercompose_compiler.compile_toDockerCompose(system, ros_distro, ros_version))
		}

		// git action workflow
 		for (system : resource.allContents.toIterable.filter(RosSystem)){
			fsa.generateFile(String.join("/", system_prefix, system.getName().toLowerCase + "_workflow.yml") ,gitaction_compiler.compile_toGitAction(system, ros_version))
			}

		}

}
