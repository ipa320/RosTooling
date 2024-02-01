/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.PrimitivesFactory;
import primitives.int8;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>int8</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class int8Test extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(int8Test.class);
    }

    /**
     * Constructs a new int8 test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int8Test(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this int8 test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int8 getFixture() {
        return (int8)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createint8());
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

} //int8Test
