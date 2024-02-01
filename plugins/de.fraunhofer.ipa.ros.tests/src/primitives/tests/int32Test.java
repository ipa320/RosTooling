/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.PrimitivesFactory;
import primitives.int32;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>int32</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class int32Test extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(int32Test.class);
    }

    /**
     * Constructs a new int32 test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int32Test(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this int32 test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int32 getFixture() {
        return (int32)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createint32());
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

} //int32Test
