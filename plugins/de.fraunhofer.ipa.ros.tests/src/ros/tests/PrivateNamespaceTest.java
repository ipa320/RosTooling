/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.PrivateNamespace;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Private Namespace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivateNamespaceTest extends RelativeNamespaceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PrivateNamespaceTest.class);
    }

    /**
     * Constructs a new Private Namespace test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrivateNamespaceTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Private Namespace test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PrivateNamespace getFixture() {
        return (PrivateNamespace)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createPrivateNamespace());
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

} //PrivateNamespaceTest
