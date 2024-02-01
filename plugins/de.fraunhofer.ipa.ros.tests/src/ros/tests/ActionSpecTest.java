/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ActionSpec;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Spec</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionSpecTest extends SpecBaseTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ActionSpecTest.class);
    }

    /**
     * Constructs a new Action Spec test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionSpecTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Action Spec test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ActionSpec getFixture() {
        return (ActionSpec)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createActionSpec());
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

} //ActionSpecTest
