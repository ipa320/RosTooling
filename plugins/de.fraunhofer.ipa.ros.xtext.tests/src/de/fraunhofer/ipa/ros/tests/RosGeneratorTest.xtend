package de.fraunhofer.ipa.ros.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import de.fraunhofer.ipa.roscode.generator.RosCodeGenerator
import org.eclipse.xtext.testing.util.ParseHelper
import ros.PackageSet
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.GeneratorContext
import de.fraunhofer.ipa.roscode.generator.CustomOutputProvider

import de.fraunhofer.ipa.roscode.generator.Ros2CodeGenerator
import java.nio.file.Files
import java.nio.file.Paths

@RunWith(XtextRunner)
@InjectWith(RosInjectorProvider)
class RosGeneratorTest {
	@Inject
	RosCodeGenerator rosGenerator

	@Inject
	Ros2CodeGenerator ros2Generator

	@Inject
	ParseHelper<PackageSet> parseHelper

	@Inject
	RosTestingUtils rosTestingUtils

	String RESOURCES_BASE_DIR = 'resources'

	@Test
	def void testGeneratedRosCode() {

		val resourceSet = rosTestingUtils.getMessagesResourceSet
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros')))
		
		val model = parseHelper.parse(fileContent, resourceSet)

		val fsa = new InMemoryFileSystemAccess
		rosGenerator.doGenerate(model.eResource, fsa, new GeneratorContext)

		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_node.cpp"))
		Assert.assertEquals(
			new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'rosgenerator', 'test_node.cpp'))).trim,
			fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_node.cpp").toString.trim)
	}

	@Test
	def void testGeneratedRos2Code() {
		val resourceSet = rosTestingUtils.getMessagesResourceSet
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros')))
		val model = parseHelper.parse(fileContent, resourceSet)

		val fsa = new InMemoryFileSystemAccess
		ros2Generator.doGenerate(model.eResource, fsa, new GeneratorContext)
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_node.cpp"))
		Assert.assertEquals(
			new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'ros2generator', 'test_node.cpp'))).trim,
			fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_node.cpp").toString.trim)
	}

}
