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

class GeneratorHelpers {
	
	boolean PackageSet
	boolean ArtifactSet
	
	String package_impl
	List<CharSequence> PkgsList
	String package_name
	String Pkg
	
	def void init(){
		PackageSet=false
		ArtifactSet=false
	}
	
	def <String> getPkgsDependencies(RosSystem rossystem){
		PkgsList = new ArrayList()
		for (component:rossystem.rosComponent){
			init()
			Pkg = component.compile_pkg.toString()
			if (!PkgsList.contains(Pkg)){
				PkgsList.add(Pkg)
			}
		}
		return PkgsList;
	}
	
	def compile_pkg(ComponentInterface component) 
'''«IF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackage_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackage_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackage_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackage_srvcli()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosparameter.empty»«FOR Rosparameter:component.rosparameter»«IF !PackageSet»«Rosparameter.parameter.getPackage_rosparam()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionserver.empty»«FOR RosActionSever:component.rosactionserver»«IF !PackageSet»«RosActionSever.actserver.getPackage_actserver()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionclient.empty»«FOR RosActionClient:component.rosactionclient»«IF !PackageSet»«RosActionClient.actclient.getPackage_actclient()»«ENDIF»«ENDFOR»«ENDIF»'''
	

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
}