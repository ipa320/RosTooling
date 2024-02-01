/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ParameterStruct;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Struct</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterStructTest extends ParameterValueTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ParameterStructTest.class);
    }

    /**
     * Constructs a new Parameter Struct test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterStructTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Parameter Struct test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ParameterStruct getFixture() {
        return (ParameterStruct)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createParameterStruct());
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

} //ParameterStructTest
