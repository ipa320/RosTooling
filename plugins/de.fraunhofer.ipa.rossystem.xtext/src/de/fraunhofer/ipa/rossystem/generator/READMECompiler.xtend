package de.fraunhofer.ipa.rossystem.generator

import system.RosInterface
import system.RosNode
import system.System
import system.impl.RosActionClientReferenceImpl
import system.impl.RosActionServerReferenceImpl
import system.impl.RosPublisherReferenceImpl
import system.impl.RosServiceClientReferenceImpl
import system.impl.RosServiceServerReferenceImpl
import system.impl.RosSubscriberReferenceImpl
import com.google.inject.Inject

class READMECompiler {

    @Inject extension GeneratorHelpers

        def compile_toREADME(System system) '''
# «system.name»

This package has be created automatically using the [RosTooling](https://github.com/ipa320/RosTooling).


It holds the launch file to run the following nodes:
«FOR node:getNodes(system)»
- «(node as RosNode).name»
«ENDFOR»

The listed nodes offer the following connections:
«FOR node:getNodes(system)»«FOR port:(node as RosNode).rosinterfaces»
«getPortInfo(port)»
«ENDFOR»«ENDFOR»

## Usage

«IF system.fromFile.nullOrEmpty»

This package can be copied to a valid ROS 2 workspace. Then the worksapce must be compiled using the common ROS 2 build command:

```
colcon build
```

To execute the launch file, the following command can be called:

```
ros2 launch «system.name» «system.name».launch.py
```
«ELSE»
To launch this system there is already an existing package that contains the launch file.

The package can be easily installed with the following command:

```
sudo apt install ros-ROSDISTRO-«system.fromFile.split("/",2).get(0).replace("_","-")»
```

And the system started by executing:

```
ros2 launch «system.fromFile.split("/",2).get(0)» «system.fromFile.substring(system.fromFile.lastIndexOf('-') + 1)»
```
«ENDIF»


     '''
     
     
     def getPortInfo(RosInterface port ){
         if(port.reference.eClass.toString.contains("RosPublisherReference")){
             return "- Publisher: "+ port.name+" ["+(port.reference as RosPublisherReferenceImpl).basicGetFrom.message.fullname+"]"
         }
         if(port.reference.eClass.toString.contains("RosSubscriberReference")){
             return "- Subscriber: "+ port.name+" ["+(port.reference as RosSubscriberReferenceImpl).basicGetFrom.message.fullname+"]"
         }
         if(port.reference.eClass.toString.contains("RosServiceServerReference")){
             return "- ServiceServer: "+ port.name+" ["+(port.reference as RosServiceServerReferenceImpl).basicGetFrom.service.fullname+"]"
         }
         if(port.reference.eClass.toString.contains("RosServiceClientReference")){
             return "- ServiceClient: "+ port.name+" ["+(port.reference as RosServiceClientReferenceImpl).basicGetFrom.service.fullname+"]"
         }
         if(port.reference.eClass.toString.contains("RosActionServerReference")){
             return "- ActionServer: "+ port.name+" ["+(port.reference as RosActionServerReferenceImpl).basicGetFrom.action.fullname+"]"
         }
         if(port.reference.eClass.toString.contains("RosActionClientReference")){
             return "- ActionClient: "+ port.name+" ["+(port.reference as RosActionClientReferenceImpl).basicGetFrom.action.fullname+"]"
         }
     }
    }
    
    