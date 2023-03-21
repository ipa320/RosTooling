package de.fraunhofer.ipa.ros.observer.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import java.util.Set
import ros.Node

class CustomOutputProvider implements IOutputConfigurationProvider {
    public final static String OBSERVER_OUTPUT = "OBSERVER_OUTPUT"

    override Set<OutputConfiguration> getOutputConfigurations() {
        var OutputConfiguration observer_config = new OutputConfiguration(OBSERVER_OUTPUT)
        observer_config.setDescription("OBSERVER_OUTPUT");
        observer_config.setOutputDirectory("./src-gen/observers/");
        observer_config.setOverrideExistingResources(true);
        observer_config.setCreateOutputDirectory(true);
        observer_config.setCleanUpDerivedResources(true);
        observer_config.setSetDerivedProperty(true);
        return newHashSet(observer_config)
    }
}


class ObserverPyCodeGenerator extends AbstractGenerator {

    int count_sub

    def void createXtextGenerationFolder (IFileSystemAccess2 fsa, IGeneratorContext context) {
        fsa.generateFile("lock",CustomOutputProvider::OBSERVER_OUTPUT,'''''');
        fsa.deleteFile("lock",CustomOutputProvider::OBSERVER_OUTPUT);
    }

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
            for (node : resource.allContents.toIterable.filter(Node)){
                fsa.generateFile(node.getName()+".py",CustomOutputProvider::OBSERVER_OUTPUT,node.compile)
                }
            }

def compile(Node node) {
    count_sub = node.subscriber.size
'''
from rosgraph_monitor.observer import TopicObserver
«FOR sub:node.subscriber»
from «sub.message.package.name».msg import «sub.message.name»
«ENDFOR»
from diagnostic_msgs.msg import DiagnosticStatus, KeyValue


class «node.name.replace("_","").replace("/","").toFirstUpper»(TopicObserver):
    def __init__(self, name):

        topics = [
«FOR sub:node.subscriber»«val count_sub=count_sub--»
        ("«sub.name»", «sub.message.name»)«IF count_sub > 1 »,«ENDIF»«ENDFOR»
        ]

        super(«node.name.replace("_","").replace("/","").toFirstUpper», self).__init__(
            name, 10, topics)

    def calculate_attr(self, msgs):
        status_msg = DiagnosticStatus()

        #Write here your code (or uncomment the following lines)
        #if len(msgs) < 2:
        #    print("Incorrect number of messages")
        #    return status_msg

        #...

        #attr = msgs[0].data + msgs[1].data
        #print("{0} + {1}".format(msgs[0].data, msgs[1].data))

        status_msg = DiagnosticStatus()
        status_msg.level = DiagnosticStatus.OK
        status_msg.name = self._id
        # Set here your name attribute
        status_msg.values.append(
            KeyValue("KeyName", attr))
        status_msg.message = "QA status"

        return status_msg
'''
}

}
