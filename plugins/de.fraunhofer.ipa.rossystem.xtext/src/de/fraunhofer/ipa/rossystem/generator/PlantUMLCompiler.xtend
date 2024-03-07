package de.fraunhofer.ipa.rossystem.generator

import system.System
import com.google.inject.Inject
import system.RosNode
import system.impl.RosInterfaceImpl
import system.RosInterface
import system.impl.RosSystemConnectionImpl

class PlantUMLCompiler{
	
	@Inject extension GeneratorHelpers

		def compile_plantuml(System system) '''«init_pkg()»
@startuml

/'SUBSYSTEMS'/
«FOR subsystem:system.subsystems»
component «subsystem.name» {
«FOR component:getNodes(subsystem)»
«compile_ports(component)»
«ENDFOR»
«ENDFOR» }

«FOR component:getNodes(system)»
«compile_ports(component)»
«ENDFOR»
«FOR connection:system.connections»  «get_connection_port((connection as RosSystemConnectionImpl).from)» --> «get_connection_port((connection as RosSystemConnectionImpl).to)»
«ENDFOR»

@enduml'''


    def compile_ports(RosNode component)'''
      component «(component as RosNode).name» {
    
    /' PORTS DEFINED AS AVAILABLE IN THE ROSSYSTEM FILE '/
    «FOR port:(component as RosNode).rosinterfaces»
    «IF port_type(port)=="INPUT"»    portin «get_valid_name(component.name, port.name)» as "«port.name»"«
        IF (port as RosInterfaceImpl).reference.toString.contains("RosSubscriberReference")» #blue«ENDIF»«
        IF (port as RosInterfaceImpl).reference.toString.contains("RosServiceServerReference")» #orange«ENDIF»«
        IF (port as RosInterfaceImpl).reference.toString.contains("RosActionServerReference")» #green«ENDIF»«ENDIF»
    «IF port_type(port)=="OUTPUT"»    portout «get_valid_name(component.name, port.name)» as "«port.name»"«
        IF (port as RosInterfaceImpl).reference.toString.contains("RosPublisherReference")» #blue«ENDIF»«
        IF (port as RosInterfaceImpl).reference.toString.contains("RosServiceClientReference")» #orange«ENDIF»«
        IF (port as RosInterfaceImpl).reference.toString.contains("RosActionClientReference")» #green«ENDIF»«ENDIF»
    «ENDFOR»
    
    /' PORTS FROM THE ORIGINAL NODE '/
    «FOR sub:(component as RosNode).from.subscriber»    portin «get_valid_name(component.name, sub.name)» as "«sub.name»" #line:blue
    «ENDFOR»
    «FOR ss:(component as RosNode).from.serviceserver»    portin «get_valid_name(component.name, ss.name)» as "«ss.name»" #line:orange
    «ENDFOR»
    «FOR acts:(component as RosNode).from.actionserver»    portin «get_valid_name(component.name, acts.name)» as "«acts.name»" #line:green
    «ENDFOR»
    «FOR pub:(component as RosNode).from.publisher»    portout «get_valid_name(component.name, pub.name)» as "«pub.name»" #line:blue
    «ENDFOR»
    «FOR sc:(component as RosNode).from.serviceclient»    portout «get_valid_name(component.name, sc.name)» as "«sc.name»" #line:orange
    «ENDFOR»
    «FOR actc:(component as RosNode).from.actionclient»    portout «get_valid_name(component.name, actc.name)» as "«actc.name»" #line:green«ENDFOR»
      }

    '''

    def String port_type (RosInterface rosinterface){
     if ((rosinterface as RosInterfaceImpl).reference.toString.matches
         (".*RosSubscriberReferenceImpl.*|.*RosServiceServerReference.*|.*RosActionServerReference.*")){
         return "INPUT"
     }else {
         return "OUTPUT"
        }
    }
    
    def get_valid_name (String componentName, String PortName){
        val identifier = (componentName+"."+PortName).replace("/","_").replace("~","_")
        return identifier        
    }
    
    def get_connection_port (RosInterface port){
        val componentName=(port.eContainer as RosNode).name
        return get_valid_name (componentName, port.name)       
    }
}

		
		
