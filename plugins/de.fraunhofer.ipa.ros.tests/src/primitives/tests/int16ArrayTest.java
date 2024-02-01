/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.PrimitivesFactory;
import primitives.int16Array;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>int16 Array</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class int16ArrayTest extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(int16ArrayTest.class);
    }

    /**
     * Constructs a new int16 Array test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int16ArrayTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this int16 Array test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int16Array getFixture() {
        return (int16Array)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createint16Array());
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

} //int16ArrayTest
