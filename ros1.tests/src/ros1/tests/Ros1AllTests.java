/**
 */
package ros1.tests;

import PackageFormat2.tests.PackageFormat2Tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Ros1</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ros1AllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Ros1AllTests("Ros1 Tests");
		suite.addTest(Ros1Tests.suite());
		suite.addTest(PackageFormat2Tests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ros1AllTests(String name) {
		super(name);
	}

} //Ros1AllTests
