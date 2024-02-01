/**
 */
package ros.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ros.PackageSet;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageSetTest extends TestCase {

    /**
     * The fixture for this Package Set test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageSet fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PackageSetTest.class);
    }

    /**
     * Constructs a new Package Set test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageSetTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Package Set test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(PackageSet fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Package Set test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageSet getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createPackageSet());
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

} //PackageSetTest
