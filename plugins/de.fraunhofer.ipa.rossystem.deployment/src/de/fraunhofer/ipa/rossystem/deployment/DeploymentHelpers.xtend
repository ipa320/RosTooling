package de.fraunhofer.ipa.rossystem.deployment
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers


class DeploymentHelpers extends GeneratorHelpers {

 	def get_uniqe_name(String prefix, String ros_distro) {
	 	return prefix + "_" + ros_distro
	 }	
	
	def get_folder_name(String prefix, String ros_distro) {
	 	if(ros_distro=="foxy") {
	 		return prefix + "_ros2"
	 	}
	 	else{
	 		return prefix
	 	}
	 }
}
