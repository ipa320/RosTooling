/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ParameterBase64Type;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Base64 Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterBase64TypeTest extends ParameterTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ParameterBase64TypeTest.class);
    }

    /**
     * Constructs a new Parameter Base64 Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterBase64TypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Parameter Base64 Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ParameterBase64Type getFixture() {
        return (ParameterBase64Type)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createParameterBase64Type());
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

} //ParameterBase64TypeTest
