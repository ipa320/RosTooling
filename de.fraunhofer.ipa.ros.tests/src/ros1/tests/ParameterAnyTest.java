/**
 */
package ros1.tests;

import junit.textui.TestRunner;

import ros1.ParameterAny;
import ros1.Ros1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Any</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterAnyTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterAnyTest.class);
	}

	/**
	 * Constructs a new Parameter Any test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAnyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParameterAny getFixture() {
		return (ParameterAny)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ros1Factory.eINSTANCE.createParameterAny());
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

} //ParameterAnyTest
