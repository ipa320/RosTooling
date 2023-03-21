/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.PackageDependency;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageDependencyTest extends DependencyTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PackageDependencyTest.class);
    }

    /**
     * Constructs a new Package Dependency test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageDependencyTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Package Dependency test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PackageDependency getFixture() {
        return (PackageDependency)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createPackageDependency());
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

} //PackageDependencyTest
