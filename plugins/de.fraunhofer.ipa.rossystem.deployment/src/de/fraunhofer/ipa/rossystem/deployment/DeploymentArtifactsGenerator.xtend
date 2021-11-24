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
import de.fraunhofer.ipa.rossystem.deployment.DeploymentHelpers
import rossystem.RosSystem;
import java.util.HashMap
import java.util.Map
import java.util.List
import componentInterface.RosParameter

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
	
	DeploymentHelpers generator_helper = new DeploymentHelpers()

	String ros_distro
	String system_folder_prefix
	Integer ros_version
	Map<String, List<String>> device_map = new HashMap<String, List<String>>

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
	def get_portt_list(Map<String, Map<RosParameter, String>> ports_map){
		for (key: ports_map.keySet()){
			val values = newArrayList()
			for (k: ports_map.get(key).keySet()){
				val v = ports_map.get(key).get(k);
				values.add(ports_map.get(key).get(k))
			}
			device_map.put(key, values);
		}
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// ROS1 package
		device_map.keySet().forEach[String key|
	    	if (device_map.get(key).contains(null)) {
	    			throw new IllegalArgumentException("Values of some device ports are not defined.")
	        	}
		]
		for (system : resource.allContents.toIterable.filter(RosSystem)){
			system_folder_prefix = create_system_prefix(system)
			if (system.componentStack.size==0){
				fsa.generateFile(system_folder_prefix +"/Dockerfile",docker_compiler.compile_toDockerContainer(system, null, ros_distro, ros_version))
 				fsa.generateFile(system_folder_prefix +"/extra_layer/" + system.getName().toLowerCase + ".rosinstall",rosintall_compiler.compile_toRosInstall(system,null))
				fsa.generateFile(system_folder_prefix +"/extra_layer/Dockerfile",docker_compiler.compile_toDockerImageExtraLayer(system, null,ros_distro, ros_version))
			} else {
				for (stack : system.componentStack){
					val stack_folder_prefix = String.join("/", system_folder_prefix, system.name.toLowerCase+'_'+stack.name.toLowerCase)
					fsa.generateFile(String.join("/", stack_folder_prefix, "Dockerfile"),docker_compiler.compile_toDockerContainer(system, stack, ros_distro, ros_version))
			 		fsa.generateFile(String.join("/", stack_folder_prefix, "extra_layer", stack.name.toLowerCase+".rosinstall"),rosintall_compiler.compile_toRosInstall(system,stack))
			 		fsa.generateFile(String.join("/", stack_folder_prefix, "extra_layer", "Dockerfile"),docker_compiler.compile_toDockerImageExtraLayer(system,stack, ros_distro, ros_version))
				}
			}

			fsa.generateFile(String.join("/", system_folder_prefix, "docker-compose.yml"),dockercompose_compiler.compile_toDockerCompose(system, ros_distro, ros_version, device_map))
		}

		// git action workflow
 		for (system : resource.allContents.toIterable.filter(RosSystem)){
			fsa.generateFile(String.join("/", system_folder_prefix, generator_helper.get_uniqe_name(system.name.toLowerCase, ros_distro) + "_workflow.yml") ,gitaction_compiler.compile_toGitAction(system, ros_version, ros_distro))
			}
		}

}
