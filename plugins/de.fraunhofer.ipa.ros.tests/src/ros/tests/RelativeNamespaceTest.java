/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.RelativeNamespace;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relative Namespace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelativeNamespaceTest extends NamespaceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RelativeNamespaceTest.class);
    }

    /**
     * Constructs a new Relative Namespace test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelativeNamespaceTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Relative Namespace test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RelativeNamespace getFixture() {
        return (RelativeNamespace)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createRelativeNamespace());
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

} //RelativeNamespaceTest
