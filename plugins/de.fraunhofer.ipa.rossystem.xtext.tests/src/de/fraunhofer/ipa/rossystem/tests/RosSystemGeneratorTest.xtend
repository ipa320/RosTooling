package de.fraunhofer.ipa.rossystem.tests

import com.google.inject.Inject
import com.google.inject.Provider
import de.fraunhofer.ipa.rossystem.generator.CustomOutputProvider
import de.fraunhofer.ipa.rossystem.generator.RosSystemGenerator
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.util.StringInputStream
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import rossystem.RosSystem

@RunWith(XtextRunner)
@InjectWith(CustomInjectorProviderRosSystem)
class RosSystemGeneratorTest {

	@Inject
	ParseHelper<RosSystem> parseHelper

	@Inject
	Provider<XtextResourceSet> resourceSetProvider

	@Inject
	RosSystemGenerator generator

	String RESOURCES_BASE_DIR = 'resources'

	@Test
	def void testGeneratedCode() {

		val resourceSet = resourceSetProvider.get
		val ros_model = resourceSet.createResource(URI.createURI("resources.ros"))

		ros_model.load(new StringInputStream( '''
		PackageSet {
			CatkinPackage test_pkg {
				FromGitRepo "https://github.com/myTest/myrepo" 
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
				  ServiceSpec Trigger{ request {  } response { bool success string message }}}}
		}
		'''), emptyMap)
		val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.rossystem')))

		val model = parseHelper.parse(fileContent, resourceSet)

		val fsa = new InMemoryFileSystemAccess

		generator.doGenerate(model.eResource, fsa, new GeneratorContext)

		// Assert that all necessary files exist
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_system/launch/test_system.launch"))
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_system/package.xml"))
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_system/CMakeLists.txt"))
		Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::CM_CONFIGURATION + "test_system.componentinterface"))

		// Test the generated launch file
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR+'/test_system/launch/', 'test_system.launch'))).trim,
		fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT+'test_system/launch/test_system.launch').toString.trim)

		// Test the generated package.xml file
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR+'/test_system/', 'package.xml'))).trim,
		fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT+'test_system/package.xml').toString.trim)

		// Test the generated CMakeLists.txt file
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR+'/test_system/', 'CMakeLists.txt'))).trim,
		fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT+'test_system/CMakeLists.txt').toString.trim)
		
		// Test the generated Dockerfile file
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR+'/test_system/', 'Dockerfile'))).trim,
		fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT+'test_system/Dockerfile').toString.trim)
		
		// Test the generated .rosinstall file
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR+'/test_system/', '.rosinstall'))).trim,
		fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT+'test_system/.rosinstall').toString.trim)

		// Test the generated component interface
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR+'/test_system.componentinterface'))).trim,
		fsa.textFiles.get(CustomOutputProvider::CM_CONFIGURATION + "test_system.componentinterface").toString.trim)
		
		//STACKS
		val system_name = new String('test_stacks')
		val stacks_names = newArrayList('stack1', 'stack2')
		val gen_system_prefix =  new String(String.format("%s%s", CustomOutputProvider::DEFAULT_OUTPUT,system_name))
		val system_prefix =  new String(String.format("%s/%s",RESOURCES_BASE_DIR, system_name))

		val fileContent_stack = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, String.format("%s.rossystem",system_name ))))
		val model_stack = parseHelper.parse(fileContent_stack, resourceSet)

		generator.doGenerate(model_stack.eResource, fsa, new GeneratorContext)

		for (String name : stacks_names) {
			val gen_stack_prefix =  new String(String.format("%s/%s_%s", gen_system_prefix, system_name, name))
			val stack_prefix = new String(String.format("%s/%s_%s", system_prefix, system_name, name))
			
			// Assert that all necessary files exist
			Assert.assertTrue(fsa.textFiles.containsKey(String.format("%s/launch/%s.launch", gen_stack_prefix, name)))
			Assert.assertTrue(fsa.textFiles.containsKey(String.format("%s/package.xml", gen_stack_prefix)))
			Assert.assertTrue(fsa.textFiles.containsKey(String.format("%s/CMakeLists.txt", gen_stack_prefix)))
			Assert.assertTrue(fsa.textFiles.containsKey(String.format("%s/Dockerfile", gen_stack_prefix)))
			
			// Test the generated launch file
			Assert.assertEquals(new String(Files.readAllBytes(Paths.get(String.format("%s/launch/%s.launch", stack_prefix, name)))).trim,
			fsa.textFiles.get(String.format("%s/launch/%s.launch", gen_stack_prefix, name)).toString.trim)
			
			// Test the generated package.xml file
			Assert.assertEquals(new String(Files.readAllBytes(Paths.get(stack_prefix, 'package.xml'))).trim,
			fsa.textFiles.get(String.format("%s/package.xml", gen_stack_prefix)).toString.trim)

			// Test the generated CMakeLists.txt file
			Assert.assertEquals(new String(Files.readAllBytes(Paths.get(stack_prefix, 'CMakeLists.txt'))).trim,
			fsa.textFiles.get(String.format("%s/CMakeLists.txt", gen_stack_prefix)).toString.trim)

			// Test the generated component interface
			Assert.assertEquals(new String(Files.readAllBytes(Paths.get(stack_prefix, 'Dockerfile'))).trim,
			fsa.textFiles.get(String.format("%s/Dockerfile", gen_stack_prefix)).toString.trim)
			
			// Test the generated component interface
			Assert.assertEquals(new String(Files.readAllBytes(Paths.get(stack_prefix, '.rosinstall'))).trim,
			fsa.textFiles.get(String.format("%s/.rosinstall", gen_stack_prefix)).toString.trim)

		}
		Assert.assertTrue(fsa.textFiles.containsKey(String.format("%s/docker-compose.yml", gen_system_prefix)))
		Assert.assertEquals(new String(Files.readAllBytes(Paths.get(system_prefix, 'docker-compose.yml'))).trim,
		fsa.textFiles.get(String.format("%s/docker-compose.yml", gen_system_prefix)).toString.trim)
	}
}
