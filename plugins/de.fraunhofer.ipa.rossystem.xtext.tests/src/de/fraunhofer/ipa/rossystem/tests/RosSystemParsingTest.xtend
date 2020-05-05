/*
 * generated by Xtext 2.17.0
 */
package de.fraunhofer.ipa.rossystem.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import rossystem.RosSystem
import java.nio.file.Files
import java.nio.file.Paths

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(RosSystemInjectorProvider))
class RosSystemParsingTest {

	@Inject
	ParseHelper<RosSystem> parseHelper
	String RESOURCES_BASE_DIR = 'resources'

	@Test
	def void loadModel() {
	    val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.rossystem')))
	    val model = parseHelper.parse(fileContent)

		Assert.assertNotNull(model)
		val errors = model.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}

	
	@Test 
    def void parseDomainmodel() {
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.rossystem')))
		val model = parseHelper.parse(fileContent)
    	
        val ComponentName = model.rosComponent.get(0).name
       	Assert.assertEquals("test_node", ComponentName)
        
        val TopicConnectionName = model.topicConnections.get(0).topicName
        Assert.assertEquals("scan", TopicConnectionName)
        
        val FromTopic = model.topicConnections.get(0).from.get(0).name
        val Publisher = model.rosComponent.get(0).rospublisher.get(0).name
        Assert.assertEquals(FromTopic, Publisher)
        
        val ToTopic = model.topicConnections.get(0).to.get(0).name
        val Subscriber = model.rosComponent.get(2).rossubscriber.get(0).name
        Assert.assertEquals(ToTopic, Subscriber)

    }
}
