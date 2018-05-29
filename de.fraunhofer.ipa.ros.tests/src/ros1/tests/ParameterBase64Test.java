/**
 */
package ros1.tests;

import junit.textui.TestRunner;

import ros1.ParameterBase64;
import ros1.Ros1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Base64</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterBase64Test extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterBase64Test.class);
	}

	/**
	 * Constructs a new Parameter Base64 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBase64Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Base64 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParameterBase64 getFixture() {
		return (ParameterBase64)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ros1Factory.eINSTANCE.createParameterBase64());
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

} //ParameterBase64Test
