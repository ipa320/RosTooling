/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.RosFactory;
import ros.ServiceSpec;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Spec</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceSpecTest extends SpecBaseTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ServiceSpecTest.class);
    }

    /**
     * Constructs a new Service Spec test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSpecTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Service Spec test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ServiceSpec getFixture() {
        return (ServiceSpec)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createServiceSpec());
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

} //ServiceSpecTest
