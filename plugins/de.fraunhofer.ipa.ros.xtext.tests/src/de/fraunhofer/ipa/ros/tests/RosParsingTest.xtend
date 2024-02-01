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
import ros.PackageSet

@RunWith(XtextRunner)
@InjectWith(RosInjectorProvider)
class RosParsingTest {
    @Inject
    ParseHelper<PackageSet> parseHelper
    String RESOURCES_BASE_DIR = 'resources/basic_msgs'

    @Test
    def void loadModel() {
        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'common_msgs.ros')))
        val result = parseHelper.parse(fileContent)
        Assert.assertNotNull(result)
        val errors = result.eResource.errors
        Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
    }

    @Test
    def void parseDomainmodel() {
        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'ros_core.ros')))
        val model = parseHelper.parse(fileContent)
        val packageName1 = model.package.get(0).name
        Assert.assertEquals(packageName1, "std_msgs")
    }

}
