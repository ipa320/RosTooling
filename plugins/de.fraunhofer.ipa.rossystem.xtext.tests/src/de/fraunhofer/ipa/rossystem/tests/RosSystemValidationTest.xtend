package de.fraunhofer.ipa.rossystem.tests

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
import java.nio.file.Files
import java.nio.file.Paths
import rossystem.RosSystem
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.emf.common.util.URI
import com.google.inject.Provider
import org.eclipse.xtext.resource.XtextResourceSet
import rossystem.RossystemPackage
import de.fraunhofer.ipa.rossystem.validation.RosSystemValidator

@RunWith(XtextRunner)
@InjectWith(CustomInjectorProviderRosSystem)

class RosSystemValidationTest {
	
	@Inject
	ParseHelper<RosSystem> parseHelper
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Inject 
	ValidationTestHelper validationTester
	
	String RESOURCES_BASE_DIR = 'resources'
	
	@Test
	def void successfulValidationTest(){
		val resourceSet = resourceSetProvider.get
		val ros_model = resourceSet.createResource(URI.createURI("resources.ros"))

		ros_model.load(new StringInputStream( '''
		PackageSet {
			CatkinPackage test_pkg {
				Artifact test_node { Node { name test_node 
					ServiceServers {
						ServiceServer {name setBool service "std_srvs.SetBool"}}
					Publishers { 
						Publisher { name scan message "sensor_msgs.LaserScan" }}
					Subscribers {
						Subscriber { name power_state message "sensor_msgs.BatteryState"}}
					ServiceClients {
						ServiceClient { name init service "std_srvs.Trigger"}}
					Parameters { 
						Parameter { name string_test type String default test},
						Parameter { name bool_tets type Boolean },
						Parameter { name array_tets type Array {type String}},
						Parameter { name base64_test type Base64},
						Parameter { name double_test type Double},
						Parameter {name int_test type Integer},
						Parameter {name list_test type List {Integer,Integer,String}},
						Parameter {name struc_test type Struct 
							{first_element Integer ,
							second_element List { Integer, String},
							third_element String ,
							last_element Struct { hola Integer, what String}}
						}
					}}},
					Artifact test_node { Node { name test_node 
						ServiceServers {
							ServiceServer {name init service "std_srvs.Trigger"}}
						Publishers { 
							Publisher { name power_state message  "sensor_msgs.BatteryState"}}
						Subscribers {
							Subscriber { name scan message "sensor_msgs.LaserScan" }}
						ServiceClients {
							ServiceClient { name SetBool service "std_srvs.SetBool"}}
					}}},
			CatkinPackage sensor_msgs{ Specs { 
			      TopicSpec LaserScan{ message { Header header float32 angle_min float32 angle_max float32 angle_increment float32 time_increment float32 scan_time float32 range_min float32 range_max float32[] ranges float32[] intensities }},
			      TopicSpec BatteryState{ message { uint8 POWER_SUPPLY_STATUS_UNKNOWN=0 uint8 POWER_SUPPLY_STATUS_CHARGING=1 uint8 POWER_SUPPLY_STATUS_DISCHARGING=2 uint8 POWER_SUPPLY_STATUS_NOT_CHARGING=3 uint8 POWER_SUPPLY_STATUS_FULL=4 uint8 POWER_SUPPLY_HEALTH_UNKNOWN=0 uint8 POWER_SUPPLY_HEALTH_GOOD=1 uint8 POWER_SUPPLY_HEALTH_OVERHEAT=2 uint8 POWER_SUPPLY_HEALTH_DEAD=3 uint8 POWER_SUPPLY_HEALTH_OVERVOLTAGE=4 uint8 POWER_SUPPLY_HEALTH_UNSPEC_FAILURE=5 uint8 POWER_SUPPLY_HEALTH_COLD=6 uint8 POWER_SUPPLY_HEALTH_WATCHDOG_TIMER_EXPIRE=7 uint8 POWER_SUPPLY_HEALTH_SAFETY_TIMER_EXPIRE=8 uint8 POWER_SUPPLY_TECHNOLOGY_UNKNOWN=0 uint8 POWER_SUPPLY_TECHNOLOGY_NIMH=1 uint8 POWER_SUPPLY_TECHNOLOGY_LION=2 uint8 POWER_SUPPLY_TECHNOLOGY_LIPO=3 uint8 POWER_SUPPLY_TECHNOLOGY_LIFE=4 uint8 POWER_SUPPLY_TECHNOLOGY_NICD=5 uint8 POWER_SUPPLY_TECHNOLOGY_LIMN=6 Header header float32 voltage float32 current float32 charge float32 capacity float32 design_capacity float32 percentage uint8 power_supply_status uint8 power_supply_health uint8 power_supply_technology bool present float32[] cell_voltage string location string serial_number}}}},
			CatkinPackage std_srvs{ Specs {
				  ServiceSpec SetBool{ request { bool data } response { bool success string message } },
				  ServiceSpec Trigger{ request {  } response { bool success string message }}}}
		}
		
		'''), emptyMap)
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.rossystem')))
		val model = parseHelper.parse(fileContent, resourceSet)
		Assert.assertNotNull(model) 
		validationTester.assertNoErrors(model)
	}
	
	 	@Test
	def void validationErrorsTest(){
		val resourceSet = resourceSetProvider.get
		val ros_model = resourceSet.createResource(URI.createURI("resources.ros"))

		ros_model.load(new StringInputStream( '''
		PackageSet {
			CatkinPackage test_pkg {
				Artifact test_node { Node { name test_node 
					ServiceServers {
						ServiceServer {name setBool service "std_srvs.SetBool"}}
					Publishers { 
						Publisher { name scan message "sensor_msgs.LaserScan" }}
					Subscribers {
						Subscriber { name power_state message "sensor_msgs.BatteryState"}}
					ServiceClients {
						ServiceClient { name init service "std_srvs.Trigger"}}
					Parameters { 
						Parameter { name string_test type String default test},
						Parameter { name bool_tets type Boolean },
						Parameter { name array_tets type Array {type String}},
						Parameter { name base64_test type Base64},
						Parameter { name double_test type Double},
						Parameter {name int_test type Integer},
						Parameter {name list_test type List {Integer,Integer,String}},
						Parameter {name struc_test type Struct 
							{first_element Integer ,
							second_element List { Integer, String},
							third_element String ,
							last_element Struct { hola Integer, what String}}
						}
					}}}},
				CatkinPackage test_pkg {
					Artifact test_node { Node { name test_node 
						ServiceServers {
							ServiceServer {name init service "std_srvs.Trigger"}}
						Publishers { 
							Publisher { name power_state message  "sensor_msgs.BatteryState"}}
						Subscribers {
							Subscriber { name scan message "sensor_msgs.LaserScan" }}
						ServiceClients {
							ServiceClient { name SetBool service "std_srvs.SetBool"}}
					}}},
			CatkinPackage sensor_msgs{ Specs { 
			      TopicSpec LaserScan{ message { Header header float32 angle_min float32 angle_max float32 angle_increment float32 time_increment float32 scan_time float32 range_min float32 range_max float32[] ranges float32[] intensities }},
			      TopicSpec BatteryState{ message { uint8 POWER_SUPPLY_STATUS_UNKNOWN=0 uint8 POWER_SUPPLY_STATUS_CHARGING=1 uint8 POWER_SUPPLY_STATUS_DISCHARGING=2 uint8 POWER_SUPPLY_STATUS_NOT_CHARGING=3 uint8 POWER_SUPPLY_STATUS_FULL=4 uint8 POWER_SUPPLY_HEALTH_UNKNOWN=0 uint8 POWER_SUPPLY_HEALTH_GOOD=1 uint8 POWER_SUPPLY_HEALTH_OVERHEAT=2 uint8 POWER_SUPPLY_HEALTH_DEAD=3 uint8 POWER_SUPPLY_HEALTH_OVERVOLTAGE=4 uint8 POWER_SUPPLY_HEALTH_UNSPEC_FAILURE=5 uint8 POWER_SUPPLY_HEALTH_COLD=6 uint8 POWER_SUPPLY_HEALTH_WATCHDOG_TIMER_EXPIRE=7 uint8 POWER_SUPPLY_HEALTH_SAFETY_TIMER_EXPIRE=8 uint8 POWER_SUPPLY_TECHNOLOGY_UNKNOWN=0 uint8 POWER_SUPPLY_TECHNOLOGY_NIMH=1 uint8 POWER_SUPPLY_TECHNOLOGY_LION=2 uint8 POWER_SUPPLY_TECHNOLOGY_LIPO=3 uint8 POWER_SUPPLY_TECHNOLOGY_LIFE=4 uint8 POWER_SUPPLY_TECHNOLOGY_NICD=5 uint8 POWER_SUPPLY_TECHNOLOGY_LIMN=6 Header header float32 voltage float32 current float32 charge float32 capacity float32 design_capacity float32 percentage uint8 power_supply_status uint8 power_supply_health uint8 power_supply_technology bool present float32[] cell_voltage string location string serial_number }}}},
			CatkinPackage std_srvs{ Specs {
				  ServiceSpec SetBool{ request { bool data } response { bool success string message } },
				  ServiceSpec Trigger{ request {  } response { bool success string message }}}
		}}
		'''), emptyMap)
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test_error.rossystem')))
		val model = parseHelper.parse(fileContent, resourceSet)

		Assert.assertNotNull(model)

		// Assert that the custom validation rules are applied
		validationTester.assertError(model, RossystemPackage.Literals.TOPIC_CONNECTION, RosSystemValidator.NOT_MATCHED_TYPE)
		validationTester.assertError(model, RossystemPackage.Literals.SERVICE_CONNECTION, RosSystemValidator.NOT_MATCHED_TYPE)
	}
	
}
