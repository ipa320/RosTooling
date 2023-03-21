/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.RosFactory;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubscriberTest extends InterfaceTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SubscriberTest.class);
    }

    /**
     * Constructs a new Subscriber test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubscriberTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Subscriber test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Subscriber getFixture() {
        return (Subscriber)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createSubscriber());
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

} //SubscriberTest
