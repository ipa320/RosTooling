/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.RosFactory;
import ros.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceClientTest extends InterfaceTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ServiceClientTest.class);
    }

    /**
     * Constructs a new Service Client test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceClientTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Service Client test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ServiceClient getFixture() {
        return (ServiceClient)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createServiceClient());
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

} //ServiceClientTest
