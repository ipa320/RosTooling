/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.RosFactory;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Server</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceServerTest extends InterfaceTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ServiceServerTest.class);
    }

    /**
     * Constructs a new Service Server test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceServerTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Service Server test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ServiceServer getFixture() {
        return (ServiceServer)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createServiceServer());
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

} //ServiceServerTest
