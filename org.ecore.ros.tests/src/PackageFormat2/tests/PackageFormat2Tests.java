/**
 */
package PackageFormat2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>PackageFormat2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageFormat2Tests extends TestSuite {

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
		TestSuite suite = new PackageFormat2Tests("PackageFormat2 Tests");
		suite.addTestSuite(DescriptionTypeTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(PackageTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFormat2Tests(String name) {
		super(name);
	}

} //PackageFormat2Tests
