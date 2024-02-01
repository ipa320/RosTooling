package de.fraunhofer.ipa.rossystem.generator

import java.util.ArrayList
import ros.ActionClient
import ros.ActionServer
import ros.Parameter
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import system.System
import java.util.List
import ros.Node
import ros.impl.PackageImpl
import org.eclipse.emf.ecore.EObject
import java.util.Set
import java.util.HashSet
import ros.Dependency
import ros.Package
import system.Component
import system.RosNode
import ros.impl.AmentPackageImpl
import system.impl.RosNodeImpl
import system.SubSystem

class GeneratorHelpers {
	
	boolean PackageSet
	
	AmentPackageImpl package_impl
	List<CharSequence> PkgsList
	ArrayList<String> RepoList
	
	String Pkg
	RosNode node
	String[] FromFileInfo


	def void init_pkg(){
		PackageSet=false
	}
	
	def <Components> getNodes (System rossystem) {
	    val nodeList = new ArrayList<RosNode>
	    if (!rossystem.components.nullOrEmpty){
    	    for (component: rossystem.components) {
    	        if (component.class.toString.contains("RosNode")){
    	            nodeList.add(component as RosNode)
    	        }
	    }}
	    return nodeList
	}
	
	def <Systems> getSubsystems (System rossystem) {
            val subSystemsList = new ArrayList<System>
            for (component: rossystem.components) {
            if (component.class.toString.contains("SubSystem")){
                subSystemsList.add((component as SubSystem).system)
            }
        }
        return subSystemsList
    }
    
    def  ArrayList<String> getAllRepos(System system) {
        RepoList = new ArrayList<String>()
        for (node : getNodes(system)){
            if (!((node.from.eContainer.eContainer as Package).fromGitRepo.nullOrEmpty)) {
                val repo=(node.from.eContainer.eContainer as Package).fromGitRepo
                if (repo.contains(":")){
                    if (repo.split(":",2).get(1).contains(":")){
                        RepoList.add(repo.split(":",3).get(0)+":"+repo.split(":",3).get(1)+" -b "+repo.split(":",3).get(2))
                    } else {
                        RepoList.add(repo)
                    }
                }
            }
        }
        if (!system.subsystems.nullOrEmpty){
           for (subsystem:system.subsystems) {
               RepoList.addAll(getAllRepos(subsystem))
               }
            }
        return RepoList;
    }
	
	def <String> getPkgsDependencies (System rossystem){
		PkgsList = new ArrayList()
		if (rossystem.fromFile.isNullOrEmpty) {
            for (component: getNodes(rossystem)){
                init_pkg()
                node = component as RosNode 
                Pkg = node.compile_pkg.toString()
                if (!PkgsList.contains(Pkg)){
                    PkgsList.add(Pkg)
                }
           }
           for (component: getSubsystems(rossystem)){
               if (component.fromFile.isNullOrEmpty){
                  PkgsList.add(component.name)
               } else {
                   PkgsList.add(component.fromFile.split("/",2).get(0))
               }
           }
		} 
		else {
		    FromFileInfo = rossystem.fromFile.split("/",2);
		    PkgsList.add(FromFileInfo.get(0))
		}

	   return PkgsList;
	}
	
	def compile_pkg(RosNode component)
'''«IF !(component.from===null)»«component.from.getPackage_node.name»«ENDIF»'''

//	def PackageImpl get_pkg(ComponentInterface component) {
//		if (component.fromRosNode!==null){
//			return getPackage_node(component.fromRosNode)
//		} else if(!component.rospublisher.empty){
//			return getPacakge_fromObject(component.rospublisher.get(0).publisher)
//		} else if (!component.rossubscriber.empty){
//			return getPacakge_fromObject(component.rossubscriber.get(0).subscriber)
//		} else if (!component.rosserviceclient.empty){
//			return getPacakge_fromObject(component.rosserviceclient.get(0).srvclient)
//		} else if (!component.rosserviceserver.empty){
//			return getPacakge_fromObject(component.rosserviceserver.get(0).srvserver)
//		} else if (!component.rosactionclient.empty){
//			return getPacakge_fromObject(component.rosactionclient.get(0).actclient)
//		} else if (!component.rosactionserver.empty){
//			return getPacakge_fromObject(component.rosactionserver.get(0).actserver)
//		} else if (!component.rosparameter.empty){
//			return getPacakge_fromObject(component.rosparameter.get(0).parameter)
//		}
//	}
//	
//	def getPacakge_fromObject (EObject object){
//		package_impl = object.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//
//	def getPackage_pub(Publisher publisher){
//		package_impl = publisher.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//	def getPackage_sub(Subscriber subscriber){
//		package_impl = subscriber.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//	def getPackage_srvserv(ServiceServer serviceserver){
//		package_impl = serviceserver.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//	def getPackage_srvcli(ServiceClient serviceclient){
//		package_impl = serviceclient.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//	def getPackage_actserver(ActionServer actionserver){
//		package_impl = actionserver.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//	def getPackage_actclient(ActionClient actionclient){
//		package_impl = actionclient.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
//	def getPackage_rosparam (Parameter param){
//		package_impl = param.eContainer.eContainer.eContainer as PackageImpl;
//		return package_impl;
//	}
	def getPackage_node (Node node){
		package_impl = node.eContainer.eContainer as AmentPackageImpl;
		return package_impl;
	}

	//Launch files generators
//	def check_ns(ComponentInterface component){
//		if (component.hasNS){
//			return component.get_ns();
//		}else {
//			return "";
//		}
//	}
//	def boolean hasNS(ComponentInterface component){
//		if(!component.nameSpace.nullOrEmpty){
//			return true;
//		}else{
//			return false
//		}
//	}
//	def String get_ns(ComponentInterface component){
//		return component.nameSpace.replaceFirst("/","");
//	}
//	
//	def compile_pkg_type(ComponentInterface component)
//'''«IF !(component.fromRosNode===null) »«component.fromRosNode.getPackageType_node»«ELSEIF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackageType_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackageType_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackageType_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackageType_srvcli()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosparameter.empty»«FOR Rosparameter:component.rosparameter»«IF !PackageSet»«Rosparameter.parameter.getPackageType_rosparam()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionserver.empty»«FOR RosActionSever:component.rosactionserver»«IF !PackageSet»«RosActionSever.actserver.getPackageType_actserver()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionclient.empty»«FOR RosActionClient:component.rosactionclient»«IF !PackageSet»«RosActionClient.actclient.getPackageType_actclient()»«ENDIF»«ENDFOR»«ENDIF»'''
//	
//	def getPackageType_pub(Publisher publisher){
//		return publisher.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_sub(Subscriber subscriber){
//		return subscriber.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_srvserv(ServiceServer serviceserver){
//		return serviceserver.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_srvcli(ServiceClient serviceclient){
//		return serviceclient.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_actserver(ActionServer actionserver){
//		return actionserver.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_actclient(ActionClient actionclient){
//		return actionclient.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_rosparam (Parameter param){
//		return param.eContainer.eContainer.eContainer as PackageImpl;
//	}
//	def getPackageType_node (Node node){
//		return node.eContainer.eContainer as PackageImpl;
//	}


}
