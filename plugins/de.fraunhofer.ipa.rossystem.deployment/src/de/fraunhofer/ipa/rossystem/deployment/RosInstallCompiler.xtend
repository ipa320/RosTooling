package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import java.util.List
import componentInterface.ComponentInterface
import ros.impl.PackageImpl
import ros.Dependency
import ros.PackageDependency
import java.util.ArrayList
import java.util.Set
import java.util.HashSet
import rossystem.ComponentStack
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers

class RosInstallCompiler {
		
	PackageImpl component_package;
	Set<String> Repos;
	List<CharSequence> PkgsList
	List<ComponentInterface> ComponentsList
	GeneratorHelpers generator_helper = new GeneratorHelpers()
	
 def compile_toRosInstall (RosSystem system,ComponentStack stack) '''«generator_helper.init_pkg()»
«IF stack===null»«FOR repo:system.listOfRepos»
- git: {local-name: «repo.substring(repo.lastIndexOf("/") + 1).replace(".git","")», uri: '«repo»'}
«ENDFOR»
«ELSE»«FOR repo:stack.listOfRepos»
- git: {local-name: «repo.substring(repo.lastIndexOf("/") + 1).replace(".git","")», uri: '«repo»'}
«ENDFOR»
«ENDIF»
'''

	def Set<String> listOfRepos(Object subsystem) {
		PkgsList = new ArrayList()
		ComponentsList = new ArrayList<ComponentInterface>();
		if (subsystem.class.toString.contains("RosSystemImpl")){
			ComponentsList = (subsystem as RosSystem).rosComponent
		} else if (subsystem.class.toString.contains("ComponentStackImpl")) {
			ComponentsList = (subsystem as ComponentStack).rosComponent
		}
		
		
		Repos = new HashSet<String>();
		for (ComponentInterface component: ComponentsList){
			component_package = null;
			component_package = generator_helper.get_pkg(component);
			if (component_package !== null){
				if (component_package.fromGitRepo !== null){
					Repos.add(component_package.fromGitRepo);
				}
				if (!component_package.dependency.empty){
					for (Dependency depend: component_package.dependency){
						if ((depend as PackageDependency).package !== null){
							if ((depend as PackageDependency).package.fromGitRepo !== null){
								Repos.add((depend as PackageDependency).package.fromGitRepo);					
					}
				}
			}
		}}}
		return Repos;
	}

}
