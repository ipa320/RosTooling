/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ParameterBooleanType;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterBooleanTypeTest extends ParameterTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ParameterBooleanTypeTest.class);
    }

    /**
     * Constructs a new Parameter Boolean Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterBooleanTypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Parameter Boolean Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ParameterBooleanType getFixture() {
        return (ParameterBooleanType)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createParameterBooleanType());
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

} //ParameterBooleanTypeTest
