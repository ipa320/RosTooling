/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.ExternalDependency;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Dependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalDependencyTest extends DependencyTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ExternalDependencyTest.class);
    }

    /**
     * Constructs a new External Dependency test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalDependencyTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this External Dependency test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ExternalDependency getFixture() {
        return (ExternalDependency)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createExternalDependency());
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

} //ExternalDependencyTest
