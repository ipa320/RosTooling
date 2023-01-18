/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.PrimitivesFactory;
import primitives.uint8Array;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>uint8 Array</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class uint8ArrayTest extends AbstractTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(uint8ArrayTest.class);
	}

	/**
	 * Constructs a new uint8 Array test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uint8ArrayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this uint8 Array test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected uint8Array getFixture() {
		return (uint8Array)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PrimitivesFactory.eINSTANCE.createuint8Array());
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

} //uint8ArrayTest
