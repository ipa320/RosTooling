package de.fraunhofer.ipa.componentInterface.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.diagnostics.Diagnostic

import java.nio.file.Files
import java.nio.file.Paths

import componentInterface.ComponentInterface
import componentInterface.ComponentInterfacePackage

@RunWith(XtextRunner)
@InjectWith(CustomInjectorProvider)
class ComponentInterfaceValidationTest {
	
	@Inject
	ParseHelper<ComponentInterface> parseHelper
	
	@Inject 
	ValidationTestHelper validationTester
	
	@Inject
	ComponentInterfaceTestingUtils ComponentInterfaceTestingUtils
	
	String RESOURCES_BASE_DIR = 'resources'
	
	@Test
	def void successfulValidationTest(){
		val resourceSet = ComponentInterfaceTestingUtils.getROSModelResourceSet
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.componentinterface')))
		val model = parseHelper.parse(fileContent, resourceSet)
		Assert.assertNotNull(model) 
		validationTester.assertNoErrors(model)
	}
	
 	@Test
	def void validationErrorsTest(){
		//val resourceSet = ComponentInterfaceTestingUtils.getROSModelResourceSet
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.componentinterface')))
		val model = parseHelper.parse(fileContent)//, resourceSet)

		Assert.assertNotNull(model)
		
		// Assert that the custom validation rules are applied
		validationTester.assertError(model, ComponentInterfacePackage.Literals.ROS_PUBLISHER, Diagnostic.LINKING_DIAGNOSTIC)
		validationTester.assertError(model, ComponentInterfacePackage.Literals.ROS_SERVICE_SERVER, Diagnostic.LINKING_DIAGNOSTIC)
	}
	
	
	
}