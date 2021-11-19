package de.fraunhofer.ipa.rossystem.deployment

import rossystem.ComponentStack
import rossystem.RosSystem
import de.fraunhofer.ipa.rossystem.deployment.DeploymentHelpers

class RosInstallCompiler {
	DeploymentHelpers generator_helper = new DeploymentHelpers()
	val repo_info = newLinkedHashMap('local_name' -> null, 'branch' -> null, 'uri' -> null)

def get_repo_info(String repo){
	repo_info.put('branch', null)
	repo_info.put('local_name', null)
	repo_info.put('uri', null)
	if(repo.indexOf(":", repo.indexOf(":") + 1) > 1) {
		repo_info.put('branch', repo.substring(repo.lastIndexOf(':')+ 1))
		val uri = repo.substring(0,repo.lastIndexOf(':'))
		repo_info.put('uri', uri)
		repo_info.put('local_name',  uri.substring(uri.lastIndexOf("/") + 1).replace(".git",""))
	}
	else {
		repo_info.put('branch', null)
		repo_info.put('uri', repo)
		repo_info.put('local_name', repo.substring(repo.lastIndexOf("/") + 1).replace(".git",""))
	}
}

 def create_repo_link (String repo)
 '''«get_repo_info(repo)»
- git: {local-name: «repo_info.get('local_name')», uri: «repo_info.get('uri')»«IF repo_info.get('branch')!==null», version: «repo_info.get('branch')»«ENDIF»}
 '''
 
 def compile_toRosInstall (RosSystem system,ComponentStack stack) '''«generator_helper.init_pkg()»
«IF stack===null»«FOR repo: generator_helper.listOfRepos(system)»
«create_repo_link(repo)»
«ENDFOR»
«ELSE»«FOR repo: generator_helper.listOfRepos(stack)»
«create_repo_link(repo)»
«ENDFOR»
«ENDIF»
'''
}
