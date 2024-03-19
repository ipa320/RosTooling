package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import system.RosNode

class YamlFileCompiler_ROS2 {
    
    @Inject extension GeneratorHelpers

    def compile_toROS2yaml(RosNode component)'''
    «component.name»:
      ros__parameters:
        «FOR param:component.rosparameters»
        «param.name»: «get_param_value(param.value,param.name)»
        «ENDFOR»
    
    '''
    
}
