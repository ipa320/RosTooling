package de.fraunhofer.ipa.rossystem.generator

import java.util.ArrayList
import java.util.List
import ros.Node
import ros.Package
import ros.ParameterValue
import ros.impl.AmentPackageImpl
import ros.impl.ParameterBooleanImpl
import ros.impl.ParameterDoubleImpl
import ros.impl.ParameterIntegerImpl
import ros.impl.ParameterSequenceImpl
import ros.impl.ParameterStringImpl
import ros.impl.ParameterStructImpl
import ros.impl.ParameterStructMemberImpl
import system.RosNode
import system.SubSystem
import system.System
import system.RosInterface
import system.RosSystemConnection
import system.RosPublisherReference
import system.RosServiceServerReference
import system.RosActionServerReference
import system.RosSubscriberReference
import system.RosServiceClientReference
import system.RosActionClientReference
import org.eclipse.emf.ecore.EObject
import java.util.Arrays

class GeneratorHelpers {

    boolean PackageSet

    AmentPackageImpl package_impl
    List<CharSequence> PkgsList
    ArrayList<String> RepoList

    String Pkg
    RosNode node
    String[] FromFileInfo
    Boolean os_import
    
    String ros1_bridge_name
    String ros1_bridge_type
    List<EObject> Ros1Ports
        

    def void init_pkg(){
        PackageSet=false
    }
    
    def boolean generate_yaml(RosNode component){
        var yaml_gen=false
        for(param:component.rosparameters){
            if(param.eContents.get(0).eClass.name.contains("ParameterStruct")){
                yaml_gen=true
            }
        }
        if(component.rosparameters.length>5){
            yaml_gen=true
        }
        return  yaml_gen
    }
    
    def boolean YamlFileGenerated(System rossystem) {
        os_import=false
        for (component: getRos2Nodes(rossystem)){
            os_import=generate_yaml(component)
        }
        if (TopicBridgeGenerated(rossystem) || ServiceFromBridgeGenerated(rossystem) || ServiceToBridgeGenerated(rossystem)){
            os_import=true
        }
        return os_import
    }

    def <Components> getRos2Nodes (System rossystem) {
        val nodeList = new ArrayList<RosNode>
        if (!rossystem.components.nullOrEmpty){
            for (component: rossystem.components) {
                if (component.class.toString.contains("RosNode")){
                    if((component as RosNode).from.eContainer.eContainer.class.toString.contains("Ament")){
                        nodeList.add(component as RosNode)
                    }
                }
        }}
        return nodeList
    }
    
    def <Components> getRos1Nodes (System rossystem) {
        val nodeList = new ArrayList<RosNode>
        if (!rossystem.components.nullOrEmpty){
            for (component: rossystem.components) {
                if (component.class.toString.contains("RosNode")){
                    if((component as RosNode).from.eContainer.eContainer.class.toString.contains("Catkin")){
                        nodeList.add(component as RosNode)
                    }
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
    
    def boolean TopicBridgeGenerated(System rossystem){
        for (connection: rossystem.connections){
            if (!getTopicBridgeInterfaces(connection as RosSystemConnection).get(0).empty){
                return true
            }
        }
        return false
    }
    
    def boolean ServiceFromBridgeGenerated(System rossystem){
        for (connection: rossystem.connections){
            if (!getServiceFromBridgeInterfaces(connection as RosSystemConnection).get(0).empty){
                return true
            } 
        }
        return false
    }
    
    def boolean ServiceToBridgeGenerated(System rossystem){
        for (connection: rossystem.connections){
            if (!getServiceToBridgeInterfaces(connection as RosSystemConnection).get(0).empty){
                return true
            } 
        }
        return false
    }

    def List<String> getTopicBridgeInterfaces(RosSystemConnection connection){
        val from_connection=(connection as RosSystemConnection).from
        val to_connection=(connection as RosSystemConnection).to
        ros1_bridge_name=""
        ros1_bridge_type=""
        if (from_connection.reference.eClass.name=='RosPublisherReference'){
            var bridge_interface = (from_connection.reference as RosPublisherReference).from
            if (bridge_interface.eContainer.eContainer.eContainer.eClass.toString.contains("CatkinPackage")){
                ros1_bridge_name=bridge_interface.name
                ros1_bridge_type=bridge_interface.message.fullname.replace("/","/msg/")
            }
        }
        if (to_connection.reference.eClass.name=='RosSubscriberReference'){
            val bridge_interface = (to_connection.reference as RosSubscriberReference).from
            if (bridge_interface.eContainer.eContainer.eContainer.eClass.toString.contains("CatkinPackage")){
                ros1_bridge_name=bridge_interface.name
                ros1_bridge_type=bridge_interface.message.fullname.replace("/","/msg/")
            }
        }
        return Arrays.asList(ros1_bridge_name, ros1_bridge_type);
    }
    
    def List<String> getServiceFromBridgeInterfaces(RosSystemConnection connection){
        val from_connection=(connection as RosSystemConnection).from
        ros1_bridge_name=""
        ros1_bridge_type=""
        if (from_connection.reference.eClass.name=='RosServiceServerReference'){
            val bridge_interface = (from_connection.reference as RosServiceServerReference).from
            if (bridge_interface.eContainer.eContainer.eContainer.eClass.toString.contains("CatkinPackage")){
                ros1_bridge_name=bridge_interface.name
                ros1_bridge_type=bridge_interface.service.fullname
            }
        }
        return Arrays.asList(ros1_bridge_name, ros1_bridge_type);
    }
    
    def List<String> getServiceToBridgeInterfaces(RosSystemConnection connection){
        val to_connection=(connection as RosSystemConnection).to
        ros1_bridge_name=""
        ros1_bridge_type=""
        if (to_connection.reference.eClass.name=='RosServiceClientReference'){
            val bridge_interface = (to_connection.reference as RosServiceClientReference).from
            if (bridge_interface.eContainer.eContainer.eContainer.eClass.toString.contains("CatkinPackage")){
                ros1_bridge_name=bridge_interface.name
                ros1_bridge_type=bridge_interface.service.fullname
            }
        }
        return Arrays.asList(ros1_bridge_name, ros1_bridge_type);
    }
    
    
    def boolean fromRos1Node(EObject bridge_interface){
        if (bridge_interface.eContainer.eContainer.eContainer.eClass.toString.contains("CatkinPackage")){
            Ros1Ports.add(bridge_interface)
            return true
        }
        return false
    }

    def  ArrayList<String> getAllRepos(System system) {
        RepoList = new ArrayList<String>()
        for (node : getRos2Nodes(system)){
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
            for (component: getRos2Nodes(rossystem)){
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

    def String compile_struct_str(ParameterValue value, String name) {
        var param_str = "";

        for (elem : (value.eContents)) {
            param_str+="\n  "
            param_str+=(elem as ParameterStructMemberImpl).name
            param_str+=": "
            param_str+=get_param_value((elem as ParameterStructMemberImpl).value,(elem as ParameterStructMemberImpl).name)
//            if ((elem as ParameterStructImpl).eContents.length > 0){
//                var member = ((elem as ParameterStructImpl).eContents.get(0) as ParameterStructMemberImpl);
//                val param_val = get_param_value(member.getValue(), name + "/" + member.getName());
//                if (param_val.startsWith("{")) {
//                    param_str += param_val;
//                } else {
//                    param_str += "{ \"" + name + "/" + member.getName() + "\" : " + param_val;
//                }}
//            elem_count--;
//            if (elem_count > 0){
//                param_str +=" },\n"
//            }
        }
        return param_str;
    }

    def String get_param_value(ParameterValue value, String name) {
        var param_val = "";
        if (value instanceof ParameterStringImpl) {
            param_val = (value as ParameterStringImpl).getValue();
        } else if (value instanceof ParameterIntegerImpl) {
            param_val = (value as ParameterIntegerImpl).getValue().toString;
        } else if (value instanceof ParameterDoubleImpl) {
            param_val = (value as ParameterDoubleImpl).getValue().toString;
        } else if (value instanceof ParameterBooleanImpl) {
            param_val = (value as ParameterBooleanImpl).isValue().toString;
        } else if (value instanceof ParameterSequenceImpl) {
            var elem_count = (value as ParameterSequenceImpl).eContents.length;
            if ((value as ParameterSequenceImpl).eContents.get(0) instanceof ParameterStructImpl) {
                param_val = compile_struct_str(value, name);
            } else {
                param_val += "[";
                for (elem : (value as ParameterSequenceImpl).eContents) {
                    param_val += get_param_value(elem as ParameterValue, name);
                    elem_count--;
                    if (elem_count > 0){
                        param_val +=", "
                    }
                }
                param_val += "]";
            }
        } else if (value instanceof ParameterStructImpl) {
            param_val+=compile_struct_str(value,name)
        }
        return param_val;
     }

    def compile_pkg(RosNode component)
'''«IF !(component.from===null)»«component.from.getPackage_node.name»«ENDIF»'''

//  def PackageImpl get_pkg(ComponentInterface component) {
//      if (component.fromRosNode!==null){
//          return getPackage_node(component.fromRosNode)
//      } else if(!component.rospublisher.empty){
//          return getPacakge_fromObject(component.rospublisher.get(0).publisher)
//      } else if (!component.rossubscriber.empty){
//          return getPacakge_fromObject(component.rossubscriber.get(0).subscriber)
//      } else if (!component.rosserviceclient.empty){
//          return getPacakge_fromObject(component.rosserviceclient.get(0).srvclient)
//      } else if (!component.rosserviceserver.empty){
//          return getPacakge_fromObject(component.rosserviceserver.get(0).srvserver)
//      } else if (!component.rosactionclient.empty){
//          return getPacakge_fromObject(component.rosactionclient.get(0).actclient)
//      } else if (!component.rosactionserver.empty){
//          return getPacakge_fromObject(component.rosactionserver.get(0).actserver)
//      } else if (!component.rosparameter.empty){
//          return getPacakge_fromObject(component.rosparameter.get(0).parameter)
//      }
//  }
//
//  def getPacakge_fromObject (EObject object){
//      package_impl = object.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//
//  def getPackage_pub(Publisher publisher){
//      package_impl = publisher.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//  def getPackage_sub(Subscriber subscriber){
//      package_impl = subscriber.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//  def getPackage_srvserv(ServiceServer serviceserver){
//      package_impl = serviceserver.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//  def getPackage_srvcli(ServiceClient serviceclient){
//      package_impl = serviceclient.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//  def getPackage_actserver(ActionServer actionserver){
//      package_impl = actionserver.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//  def getPackage_actclient(ActionClient actionclient){
//      package_impl = actionclient.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
//  def getPackage_rosparam (Parameter param){
//      package_impl = param.eContainer.eContainer.eContainer as PackageImpl;
//      return package_impl;
//  }
    def getPackage_node (Node node){
        package_impl = node.eContainer.eContainer as AmentPackageImpl;
        return package_impl;
    }

    //Launch files generators
//  def check_ns(ComponentInterface component){
//      if (component.hasNS){
//          return component.get_ns();
//      }else {
//          return "";
//      }
//  }
//  def boolean hasNS(ComponentInterface component){
//      if(!component.nameSpace.nullOrEmpty){
//          return true;
//      }else{
//          return false
//      }
//  }
//  def String get_ns(ComponentInterface component){
//      return component.nameSpace.replaceFirst("/","");
//  }
//
//  def compile_pkg_type(ComponentInterface component)
//'''«IF !(component.fromRosNode===null) »«component.fromRosNode.getPackageType_node»«ELSEIF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackageType_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackageType_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackageType_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackageType_srvcli()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosparameter.empty»«FOR Rosparameter:component.rosparameter»«IF !PackageSet»«Rosparameter.parameter.getPackageType_rosparam()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionserver.empty»«FOR RosActionSever:component.rosactionserver»«IF !PackageSet»«RosActionSever.actserver.getPackageType_actserver()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosactionclient.empty»«FOR RosActionClient:component.rosactionclient»«IF !PackageSet»«RosActionClient.actclient.getPackageType_actclient()»«ENDIF»«ENDFOR»«ENDIF»'''
//
//  def getPackageType_pub(Publisher publisher){
//      return publisher.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_sub(Subscriber subscriber){
//      return subscriber.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_srvserv(ServiceServer serviceserver){
//      return serviceserver.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_srvcli(ServiceClient serviceclient){
//      return serviceclient.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_actserver(ActionServer actionserver){
//      return actionserver.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_actclient(ActionClient actionclient){
//      return actionclient.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_rosparam (Parameter param){
//      return param.eContainer.eContainer.eContainer as PackageImpl;
//  }
//  def getPackageType_node (Node node){
//      return node.eContainer.eContainer as PackageImpl;
//  }


}
