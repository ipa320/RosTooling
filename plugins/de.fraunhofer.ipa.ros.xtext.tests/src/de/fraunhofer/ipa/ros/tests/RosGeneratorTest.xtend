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
		val model = parseHelper.parse('''
			PackageSet { package { 
			  CatkinPackage cob_sick_s300 { artifact {
			    Artifact cob_sick_s300 {
			      node Node { name cob_sick_s300
			        publisher {
			          Publisher { name 'scan' message 'sensor_msgs.LaserScan'},
			          Publisher { name 'scan_standby' message 'std_msgs.Bool'},
			          Publisher { name '/diagnostics' message 'diagnostic_msgs.DiagnosticArray'}}
			}}}}}}
		''', resourceSet)

		val fsa = new InMemoryFileSystemAccess
		rosGenerator.doGenerate(model.eResource, fsa, new GeneratorContext)

		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp"))
		Assert.assertEquals(
			new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'rosgenerator', 'cob_sick_s300.cpp'))).trim,
			fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp").toString.trim)
	}

	@Test
	def void testGeneratedRos2Code() {
		val resourceSet = rosTestingUtils.getMessagesResourceSet

		val model = parseHelper.parse('''
			PackageSet { package { 
			  CatkinPackage cob_sick_s300 { artifact {
			    Artifact cob_sick_s300 {
			      node Node { name cob_sick_s300
			        publisher {
			          Publisher { name 'scan' message 'sensor_msgs.LaserScan'},
			          Publisher { name 'scan_standby' message 'std_msgs.Bool'},
			          Publisher { name '/diagnostics' message 'diagnostic_msgs.DiagnosticArray'}}
			}}}}}}
		''', resourceSet)

		val fsa = new InMemoryFileSystemAccess
		ros2Generator.doGenerate(model.eResource, fsa, new GeneratorContext)
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp"))
		Assert.assertEquals(
			new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'ros2generator', 'cob_sick_s300.cpp'))).trim,
			fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "cob_sick_s300.cpp").toString.trim)
	}

}
