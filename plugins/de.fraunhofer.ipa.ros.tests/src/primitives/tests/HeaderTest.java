/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.Header;
import primitives.PrimitivesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HeaderTest extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(HeaderTest.class);
    }

    /**
     * Constructs a new Header test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HeaderTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Header test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Header getFixture() {
        return (Header)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createHeader());
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

} //HeaderTest
