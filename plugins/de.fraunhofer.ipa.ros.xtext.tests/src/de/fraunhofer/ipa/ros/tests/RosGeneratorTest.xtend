//package de.fraunhofer.ipa.ros.tests
//
//import com.google.inject.Inject
//import org.eclipse.xtext.testing.InjectWith
//import org.eclipse.xtext.testing.XtextRunner
//import org.junit.Assert
//import org.junit.Test
//import org.junit.runner.RunWith
//import de.fraunhofer.ipa.roscode.generator.RosCodeGenerator
//import org.eclipse.xtext.testing.util.ParseHelper
//import ros.PackageSet
//import org.eclipse.xtext.generator.InMemoryFileSystemAccess
//import org.eclipse.xtext.generator.GeneratorContext
//import de.fraunhofer.ipa.roscode.generator.CustomOutputProvider
//import de.fraunhofer.ipa.roscode.generator.Ros2CodeGenerator
//import java.nio.file.Files
//import java.nio.file.Paths
//import de.fraunhofer.ipa.ros.generator.RosGenerator
//import de.fraunhofer.ipa.ros.generator.CICustomOutputProvider
//
//@RunWith(XtextRunner)
//@InjectWith(RosInjectorProvider)
//class RosGeneratorTest {
//  @Inject
//  RosCodeGenerator rosGenerator
//
//  @Inject
//  Ros2CodeGenerator ros2Generator
//
//  @Inject
//  RosGenerator CIGenerator
//
//  @Inject
//  ParseHelper<PackageSet> parseHelper
//
//  @Inject
//  RosTestingUtils rosTestingUtils
//
//  String RESOURCES_BASE_DIR = 'resources'
//
////    @Test
////    def void testGeneratedRosCode() {
////
////        val resourceSet = rosTestingUtils.getMessagesResourceSet
////        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros')))
////        val model = parseHelper.parse(fileContent, resourceSet)
////
////        val fsa = new InMemoryFileSystemAccess
////        rosGenerator.doGenerate(model.eResource, fsa, new GeneratorContext)
////        Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/package.xml"))
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'rosgenerator/test_pkg/src/','test_node.cpp'))).trim,
////            fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/src/test_node.cpp").toString.trim)
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'rosgenerator/test_pkg/','CMakeLists.txt'))).trim,
////            fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/CMakeLists.txt").toString.trim)
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'rosgenerator/test_pkg/','package.xml'))).trim,
////            fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/package.xml").toString.trim)
////    }
////
////    @Test
////    def void testGeneratedRos2Code() {
////        val resourceSet = rosTestingUtils.getMessagesResourceSet
////        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros')))
////        val model = parseHelper.parse(fileContent, resourceSet)
////
////        val fsa = new InMemoryFileSystemAccess
////        ros2Generator.doGenerate(model.eResource, fsa, new GeneratorContext)
////        Assert.assertTrue(fsa.textFiles.containsKey(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/package.xml"))
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'ros2generator/test_pkg/src/','test_node.cpp'))).trim,
////            fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/src/test_node.cpp").toString.trim)
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'ros2generator/test_pkg/','CMakeLists.txt'))).trim,
////            fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/CMakeLists.txt").toString.trim)
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'ros2generator/test_pkg/','package.xml'))).trim,
////            fsa.textFiles.get(CustomOutputProvider::DEFAULT_OUTPUT + "test_pkg/package.xml").toString.trim)
////    }
////
////    @Test
////    def void testGeneratedCI() {
////        val resourceSet = rosTestingUtils.getMessagesResourceSet
////        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros')))
////        val model = parseHelper.parse(fileContent, resourceSet)
////
////        val fsa = new InMemoryFileSystemAccess
////        CIGenerator.doGenerate(model.eResource, fsa, new GeneratorContext)
////        Assert.assertTrue(fsa.textFiles.containsKey(CICustomOutputProvider::COM_OUTPUT + "test_node.componentinterface"))
////        Assert.assertEquals(
////            new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'components', 'test_node.componentinterface'))).trim,
////            fsa.textFiles.get(CICustomOutputProvider::COM_OUTPUT + "test_node.componentinterface").toString.trim)
////    }
//
//}
