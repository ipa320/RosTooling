/**
 */
package ros.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ros.ActionDefinition;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionDefinitionTest extends TestCase {

	/**
	 * The fixture for this Action Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDefinition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionDefinitionTest.class);
	}

	/**
	 * Constructs a new Action Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Action Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ActionDefinition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Action Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDefinition getFixture() {
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
		setFixture(RosFactory.eINSTANCE.createActionDefinition());
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

} //ActionDefinitionTest
