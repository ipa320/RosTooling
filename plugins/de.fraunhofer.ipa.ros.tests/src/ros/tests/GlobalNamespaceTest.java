/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.GlobalNamespace;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Global Namespace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalNamespaceTest extends NamespaceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GlobalNamespaceTest.class);
    }

    /**
     * Constructs a new Global Namespace test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalNamespaceTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Global Namespace test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected GlobalNamespace getFixture() {
        return (GlobalNamespace)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createGlobalNamespace());
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

} //GlobalNamespaceTest
