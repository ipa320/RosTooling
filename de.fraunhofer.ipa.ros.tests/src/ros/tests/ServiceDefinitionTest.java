/**
 */
package ros.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ros.RosFactory;
import ros.ServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDefinitionTest extends TestCase {

	/**
	 * The fixture for this Service Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceDefinitionTest.class);
	}

	/**
	 * Constructs a new Service Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceDefinition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinition getFixture() {
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
		setFixture(RosFactory.eINSTANCE.createServiceDefinition());
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

} //ServiceDefinitionTest
