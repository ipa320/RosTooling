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

class GeneratorHelpers {
	
	boolean PackageSet
	
	PackageImpl package_impl
	List<CharSequence> PkgsList
	String Pkg
	List<ComponentInterface> ComponentsList

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
'''«IF !(component.fromRosNode===null) »«component.fromRosNode.getPackage_node»«ELSEIF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackage_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackage_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackage_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackage_srvcli()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosparameter.empty»«FOR Rosparameter:component.rosparameter»«IF !PackageSet»«Rosparameter.parameter.getPackage_rosparam()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionserver.empty»«FOR RosActionSever:component.rosactionserver»«IF !PackageSet»«RosActionSever.actserver.getPackage_actserver()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionclient.empty»«FOR RosActionClient:component.rosactionclient»«IF !PackageSet»«RosActionClient.actclient.getPackage_actclient()»«ENDIF»«ENDFOR»«ENDIF»'''

	def getPackage_pub(Publisher publisher){
		package_impl = publisher.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_sub(Subscriber subscriber){
		package_impl = subscriber.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_srvserv(ServiceServer serviceserver){
		package_impl = serviceserver.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_srvcli(ServiceClient serviceclient){
		package_impl = serviceclient.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_actserver(ActionServer actionserver){
		package_impl = actionserver.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_actclient(ActionClient actionclient){
		package_impl = actionclient.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_rosparam (Parameter param){
		package_impl = param.eContainer.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}
	def getPackage_node (Node node){
		package_impl = node.eContainer.eContainer as PackageImpl;
		return package_impl.name;
	}

}
