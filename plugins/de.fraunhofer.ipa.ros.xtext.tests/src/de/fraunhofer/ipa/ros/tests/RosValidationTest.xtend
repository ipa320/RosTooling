//package de.fraunhofer.ipa.ros.tests
//
//import com.google.inject.Inject
//import org.eclipse.xtext.testing.InjectWith
//import org.eclipse.xtext.testing.XtextRunner
//import org.eclipse.xtext.testing.util.ParseHelper
//import org.junit.Assert
//import org.junit.Test
//import org.junit.runner.RunWith
//import ros.PackageSet
//import org.eclipse.xtext.testing.validation.ValidationTestHelper
//import org.eclipse.xtext.diagnostics.Diagnostic
//import ros.RosPackage
//import de.fraunhofer.ipa.ros.validation.RosValidator
//import java.nio.file.Files
//import java.nio.file.Paths
//
//@RunWith(XtextRunner)
//@InjectWith(RosInjectorProvider)
//class RosValidationTest {
//
//  @Inject
//  ParseHelper<PackageSet> parseHelper
//
//  @Inject
//  ValidationTestHelper validationTester
//
//  @Inject
//  RosTestingUtils rosTestingUtils
//
//  String RESOURCES_BASE_DIR = 'resources'
//
////    @Test
////    def void successfulValidationTest(){
////        val resourceSet = rosTestingUtils.getMessagesResourceSet
////        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test.ros')))
////        val model = parseHelper.parse(fileContent, resourceSet)
////        Assert.assertNotNull(model)
////        validationTester.assertNoErrors(model)
////    }
////
////    @Test
////    def void validationErrorsTest(){
////        //val resourceSet = rosTestingUtils.getMessagesResourceSet
////        val fileContent = new String(Files.readAllBytes(Paths.get(RESOURCES_BASE_DIR, 'test_error.ros')))
////        val model = parseHelper.parse(fileContent)//, resourceSet)
////
////        Assert.assertNotNull(model)
////
////        // Assert that the validation fails if the needed messages are not present
////        validationTester.assertWarning(model, RosPackage.Literals.ARTIFACT, RosValidator::INVALID_NAME)
////        validationTester.assertWarning(model, RosPackage.Literals.NODE, RosValidator::INVALID_NAME)
////
////        // Assert that the custom validation rules are applied
////        validationTester.assertError(model, RosPackage.Literals.PUBLISHER, Diagnostic.LINKING_DIAGNOSTIC)
////        validationTester.assertError(model, RosPackage.Literals.SERVICE_SERVER, Diagnostic.LINKING_DIAGNOSTIC)
////    }
//
//
//
//}
