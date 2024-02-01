/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.ByteArray;
import primitives.PrimitivesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Byte Array</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ByteArrayTest extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ByteArrayTest.class);
    }

    /**
     * Constructs a new Byte Array test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ByteArrayTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Byte Array test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ByteArray getFixture() {
        return (ByteArray)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createByteArray());
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

} //ByteArrayTest
