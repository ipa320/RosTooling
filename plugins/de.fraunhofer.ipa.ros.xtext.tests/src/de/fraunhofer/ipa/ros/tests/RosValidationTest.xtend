package de.fraunhofer.ipa.ros.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import ros.PackageSet
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.diagnostics.Diagnostic
import ros.RosPackage
import de.fraunhofer.ipa.ros.validation.RosValidator

@RunWith(XtextRunner)
@InjectWith(RosInjectorProvider)
class RosValidationTest {
	
	@Inject
	ParseHelper<PackageSet> parseHelper
	
	@Inject 
	ValidationTestHelper validationTester
	
	@Inject
	RosTestingUtils rosTestingUtils
	
	@Test
	def void successfulValidationTest(){
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
		Assert.assertNotNull(model) 
		validationTester.assertNoIssues(model)	
	}
	
	@Test
	def void validationErrorsTest(){
		val model = parseHelper.parse('''
		PackageSet { package { 
		  CatkinPackage rplidar_ros { artifact {
		    Artifact rplidarNode {
		      node Node { name rplidarNode
		        serviceserver {
		          ServiceServer { name 'stop_motor' service 'std_srvs.Empty'},
		          ServiceServer { name 'start_motor' service 'std_srvs.Empty'}}
		        publisher {
		          Publisher { name 'scan' message 'sensor_msgs.LaserScan'}}
		}}}}}}
	''')
		Assert.assertNotNull(model)
		
		// Assert that the validation fails if the needed messages are not present
		validationTester.assertWarning(model, RosPackage.Literals.ARTIFACT, RosValidator::INVALID_NAME)
		validationTester.assertWarning(model, RosPackage.Literals.NODE, RosValidator::INVALID_NAME)
		
		// Assert that the custom validation rules are applied
		validationTester.assertError(model, RosPackage.Literals.PUBLISHER, Diagnostic.LINKING_DIAGNOSTIC)
		validationTester.assertError(model, RosPackage.Literals.SERVICE_SERVER, Diagnostic.LINKING_DIAGNOSTIC)
	}
	
	
	
}