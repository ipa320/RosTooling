/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ParameterArrayType;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Array Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterArrayTypeTest extends ParameterTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ParameterArrayTypeTest.class);
    }

    /**
     * Constructs a new Parameter Array Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterArrayTypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Parameter Array Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ParameterArrayType getFixture() {
        return (ParameterArrayType)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createParameterArrayType());
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

} //ParameterArrayTypeTest
