/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.AmentPackage;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ament Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmentPackageTest extends PackageTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AmentPackageTest.class);
    }

    /**
     * Constructs a new Ament Package test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AmentPackageTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Ament Package test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AmentPackage getFixture() {
        return (AmentPackage)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createAmentPackage());
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

} //AmentPackageTest
