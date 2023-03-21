/**
 */
package primitives.tests;

import junit.textui.TestRunner;

import primitives.PrimitivesFactory;
import primitives.TopicSpecRef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Topic Spec Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopicSpecRefTest extends AbstractTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TopicSpecRefTest.class);
    }

    /**
     * Constructs a new Topic Spec Ref test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopicSpecRefTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Topic Spec Ref test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected TopicSpecRef getFixture() {
        return (TopicSpecRef)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(PrimitivesFactory.eINSTANCE.createTopicSpecRef());
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

} //TopicSpecRefTest
