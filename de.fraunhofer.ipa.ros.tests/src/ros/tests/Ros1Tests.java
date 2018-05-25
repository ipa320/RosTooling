/**
 */
package ros.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ros1</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ros1Tests extends TestSuite {

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
		TestSuite suite = new Ros1Tests("ros Tests");
		suite.addTestSuite(ServiceSpecTest.class);
		suite.addTestSuite(TopicSpecTest.class);
		suite.addTestSuite(ActionSpecTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ros1Tests(String name) {
		super(name);
	}

} //Ros1Tests
