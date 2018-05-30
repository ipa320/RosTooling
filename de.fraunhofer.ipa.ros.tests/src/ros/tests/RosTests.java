/**
 */
package ros.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ros</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosTests extends TestSuite {

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
		TestSuite suite = new RosTests("ros Tests");
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
	public RosTests(String name) {
		super(name);
	}

} //RosTests
