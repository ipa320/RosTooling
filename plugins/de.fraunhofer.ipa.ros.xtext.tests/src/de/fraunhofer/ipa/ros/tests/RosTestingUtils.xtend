package de.fraunhofer.ipa.ros.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.Provider
import org.eclipse.xtext.resource.XtextResourceSet

@InjectWith(RosInjectorProvider)
class RosTestingUtils {
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	def ResourceSet getMessagesResourceSet() {
		val resourceSet = resourceSetProvider.get

		val messages = resourceSet.createResource(URI.createURI("msgs.ros"))
		messages.load(new StringInputStream('''PackageSet{package{
		    Package diagnostic_msgs{ spec { 
		      TopicSpec DiagnosticArray{ message { Header header DiagnosticStatus[] status }}  
		    }},
		    Package sensor_msgs{ spec { 
		      TopicSpec LaserScan{ message { Header header float32 angle_min float32 angle_max float32 angle_increment float32 time_increment float32 scan_time float32 range_min float32 range_max float32[] ranges float32[] intensities }}
		    }},
		    Package std_msgs{ spec { 
		    	TopicSpec Bool{ message { bool data }}, 		      
		    }}
		  }
		}'''), emptyMap)

		return resourceSet
	}
	
}