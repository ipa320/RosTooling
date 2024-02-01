/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.PrimitivesFactory;
import primitives.float64Array;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>float64 Array</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class float64ArrayTest extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(float64ArrayTest.class);
    }

    /**
     * Constructs a new float64 Array test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float64ArrayTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this float64 Array test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected float64Array getFixture() {
        return (float64Array)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createfloat64Array());
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

} //float64ArrayTest
