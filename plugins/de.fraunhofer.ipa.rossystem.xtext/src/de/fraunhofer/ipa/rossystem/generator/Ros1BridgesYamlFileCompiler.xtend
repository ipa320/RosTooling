package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import system.System
import system.RosSystemConnection

class Ros1BridgesYamlFileCompiler {
    
    @Inject extension GeneratorHelpers

    def compile_ROS1bridges_config(System system)'''«IF TopicBridgeGenerated(system)»
bridge_«system.name»_topics/topics:«FOR connection:system.connections»«IF !getTopicBridgeInterfaces(connection as RosSystemConnection).get(0).empty»
  - topic: «getTopicBridgeInterfaces(connection as RosSystemConnection).get(0)»
    type: «getTopicBridgeInterfaces(connection as RosSystemConnection).get(1)»
«ENDIF»«ENDFOR»«ENDIF»«IF ServiceFromBridgeGenerated(system)»
bridge_«system.name»_from_services/services_2_to_1:«FOR connection:system.connections»«IF !getServiceFromBridgeInterfaces(connection as RosSystemConnection).get(0).empty»
  - service: «getServiceFromBridgeInterfaces(connection as RosSystemConnection).get(0)»
    type: «getServiceFromBridgeInterfaces(connection as RosSystemConnection).get(1)»
«ENDIF»«ENDFOR»«ENDIF»«IF ServiceToBridgeGenerated(system)»
bridge_«system.name»_to_services/services_2_to_1:«FOR connection:system.connections»«IF !getServiceToBridgeInterfaces(connection as RosSystemConnection).get(0).empty»
  - service: «getServiceToBridgeInterfaces(connection as RosSystemConnection).get(0)»
    type: «getServiceToBridgeInterfaces(connection as RosSystemConnection).get(1)»
«ENDIF»«ENDFOR»«ENDIF»
    '''
    
}
