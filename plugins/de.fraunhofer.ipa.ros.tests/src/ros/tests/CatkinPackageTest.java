/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.CatkinPackage;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Catkin Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatkinPackageTest extends PackageTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CatkinPackageTest.class);
    }

    /**
     * Constructs a new Catkin Package test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CatkinPackageTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Catkin Package test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected CatkinPackage getFixture() {
        return (CatkinPackage)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createCatkinPackage());
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

} //CatkinPackageTest
