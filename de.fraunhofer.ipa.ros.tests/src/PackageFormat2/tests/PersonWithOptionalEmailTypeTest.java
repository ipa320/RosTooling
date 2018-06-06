/**
 */
package PackageFormat2.tests;

import PackageFormat2.PackageFormat2Factory;
import PackageFormat2.PersonWithOptionalEmailType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person With Optional Email Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonWithOptionalEmailTypeTest extends TestCase {

	/**
	 * The fixture for this Person With Optional Email Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonWithOptionalEmailType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonWithOptionalEmailTypeTest.class);
	}

	/**
	 * Constructs a new Person With Optional Email Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonWithOptionalEmailTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Person With Optional Email Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersonWithOptionalEmailType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Person With Optional Email Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonWithOptionalEmailType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PackageFormat2Factory.eINSTANCE.createPersonWithOptionalEmailType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PersonWithOptionalEmailTypeTest
