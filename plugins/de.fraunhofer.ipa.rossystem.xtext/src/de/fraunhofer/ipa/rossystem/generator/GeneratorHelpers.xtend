package de.fraunhofer.ipa.rossystem.generator

import componentInterface.ComponentInterface
import java.util.ArrayList
import ros.ActionClient
import ros.ActionServer
import ros.Parameter
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import rossystem.RosSystem
import java.util.List
import ros.Node
import ros.impl.PackageImpl
import rossystem.ComponentStack
import org.eclipse.emf.ecore.EObject
import java.util.Set
import java.util.HashSet
import ros.Dependency
import ros.PackageDependency

class GeneratorHelpers {
	
	boolean PackageSet
	
	PackageImpl package_impl
	List<CharSequence> PkgsList
	String Pkg
	List<ComponentInterface> ComponentsList
	PackageImpl component_package
	Set<String> Repos

	def void init_pkg(){
		PackageSet=false
	}
	
	def <String> getPkgsDependencies (RosSystem rossystem, ComponentStack stack){
		if (stack===null){
			return getPkgsDependencies(rossystem)
		} else {
			return getPkgsDependencies(stack)
		}
	}

	def <String> getPkgsDependencies(Object subsystem){
		PkgsList = new ArrayList()
		ComponentsList = new ArrayList<ComponentInterface>();
		
		if (subsystem.class.toString.contains("RosSystemImpl")){
			ComponentsList = (subsystem as RosSystem).rosComponent
		} else if (subsystem.class.toString.contains("ComponentStackImpl")) {
			ComponentsList = (subsystem as ComponentStack).rosComponent
		}
		for (component:ComponentsList){
			init_pkg()
			Pkg = component.compile_pkg.toString()
			if (!PkgsList.contains(Pkg)){
				PkgsList.add(Pkg)
			}
		}
		return PkgsList;
	}
	
	def compile_pkg(ComponentInterface component)
'''«IF !(component.fromRosNode===null) »«component.fromRosNode.getPackage_node.name»«ELSEIF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackage_pub().name»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackage_sub().name»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackage_srvserv().name»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackage_srvcli().name»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosparameter.empty»«FOR Rosparameter:component.rosparameter»«IF !PackageSet»«Rosparameter.parameter.getPackage_rosparam().name»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionserver.empty»«FOR RosActionSever:component.rosactionserver»«IF !PackageSet»«RosActionSever.actserver.getPackage_actserver().name»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionclient.empty»«FOR RosActionClient:component.rosactionclient»«IF !PackageSet»«RosActionClient.actclient.getPackage_actclient().name»«ENDIF»«ENDFOR»«ENDIF»'''

	def PackageImpl get_pkg(ComponentInterface component) {
		if (component.fromRosNode!==null){
			return getPackage_node(component.fromRosNode)
		} else if(!component.rospublisher.empty){
			return getPacakge_fromObject(component.rospublisher.get(0).publisher)
		} else if (!component.rossubscriber.empty){
			return getPacakge_fromObject(component.rossubscriber.get(0).subscriber)
		} else if (!component.rosserviceclient.empty){
			return getPacakge_fromObject(component.rosserviceclient.get(0).srvclient)
		} else if (!component.rosserviceserver.empty){
			return getPacakge_fromObject(component.rosserviceserver.get(0).srvserver)
		} else if (!component.rosactionclient.empty){
			return getPacakge_fromObject(component.rosactionclient.get(0).actclient)
		} else if (!component.rosactionserver.empty){
			return getPacakge_fromObject(component.rosactionserver.get(0).actserver)
		} else if (!component.rosparameter.empty){
			return getPacakge_fromObject(component.rosparameter.get(0).parameter)
		}
	}
	
	def getPacakge_fromObject (EObject object){
		package_impl = object.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}

	def getPackage_pub(Publisher publisher){
		package_impl = publisher.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_sub(Subscriber subscriber){
		package_impl = subscriber.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_srvserv(ServiceServer serviceserver){
		package_impl = serviceserver.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_srvcli(ServiceClient serviceclient){
		package_impl = serviceclient.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_actserver(ActionServer actionserver){
		package_impl = actionserver.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_actclient(ActionClient actionclient){
		package_impl = actionclient.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_rosparam (Parameter param){
		package_impl = param.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	def getPackage_node (Node node){
		package_impl = node.eContainer.eContainer as PackageImpl;
		return package_impl;
	}
	
	
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
		component_package = get_pkg(component);
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

	//Launch files generators
	def check_ns(ComponentInterface component){
		if (component.hasNS){
			return component.get_ns();
		}else {
			return "";
		}
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
	
	def compile_pkg_type(ComponentInterface component)
'''«IF !(component.fromRosNode===null) »«component.fromRosNode.getPackageType_node»«ELSEIF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackageType_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackageType_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackageType_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackageType_srvcli()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosparameter.empty»«FOR Rosparameter:component.rosparameter»«IF !PackageSet»«Rosparameter.parameter.getPackageType_rosparam()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionserver.empty»«FOR RosActionSever:component.rosactionserver»«IF !PackageSet»«RosActionSever.actserver.getPackageType_actserver()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionclient.empty»«FOR RosActionClient:component.rosactionclient»«IF !PackageSet»«RosActionClient.actclient.getPackageType_actclient()»«ENDIF»«ENDFOR»«ENDIF»'''
	
	def getPackageType_pub(Publisher publisher){
		return publisher.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_sub(Subscriber subscriber){
		return subscriber.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_srvserv(ServiceServer serviceserver){
		return serviceserver.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_srvcli(ServiceClient serviceclient){
		return serviceclient.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_actserver(ActionServer actionserver){
		return actionserver.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_actclient(ActionClient actionclient){
		return actionclient.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_rosparam (Parameter param){
		return param.eContainer.eContainer.eContainer as PackageImpl;
	}
	def getPackageType_node (Node node){
		return node.eContainer.eContainer as PackageImpl;
	}


}
