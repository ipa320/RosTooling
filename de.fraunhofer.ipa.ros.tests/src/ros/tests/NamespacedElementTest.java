/**
 */
package ros.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import ros.NamespacedElement;
import ros.Ros1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespaced Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespacedElementTest extends TestCase {

	/**
	 * The fixture for this Namespaced Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespacedElement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamespacedElementTest.class);
	}

	/**
	 * Constructs a new Namespaced Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedElementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Namespaced Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NamespacedElement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Namespaced Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespacedElement getFixture() {
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
		setFixture(Ros1Factory.eINSTANCE.createNamespacedElement());
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

} //NamespacedElementTest
