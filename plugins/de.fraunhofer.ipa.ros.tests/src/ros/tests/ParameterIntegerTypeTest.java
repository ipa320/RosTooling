/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ParameterIntegerType;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterIntegerTypeTest extends ParameterTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ParameterIntegerTypeTest.class);
    }

    /**
     * Constructs a new Parameter Integer Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterIntegerTypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Parameter Integer Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ParameterIntegerType getFixture() {
        return (ParameterIntegerType)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createParameterIntegerType());
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

} //ParameterIntegerTypeTest
