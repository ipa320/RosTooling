package de.fraunhofer.ipa.ros.tests

import com.google.inject.Inject
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import ros.CatkinPackage

@RunWith(XtextRunner)
@InjectWith(Ros1InjectorProvider)
class Ros1ParsingTest {
    @Inject
    ParseHelper<CatkinPackage> parseHelper
    String RESOURCES_BASE_DIR = 'resources/rosnodes'

    @Test
    def void loadModel() {
        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros1')))
        val result = parseHelper.parse(fileContent)
        Assert.assertNotNull(result)
        val errors = result.eResource.errors
        Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
    }

    @Test
    def void parseDomainmodel() {
        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros1')))
        val model = parseHelper.parse(fileContent)

        val artifacts = model.artifact
        Assert.assertEquals("image_filter", model.artifact.get(0).name)
        Assert.assertEquals("consumer", model.artifact.get(1).name)

        //From artifact image_filter
        val node_name = artifacts.get(0).node.name
        Assert.assertEquals("image_filter", node_name)
        val publishers = artifacts.get(0).node.publisher
        Assert.assertEquals("image_out", publishers.get(0).name)
        Assert.assertEquals("description_out", publishers.get(1).name)
    }

}
