/**
 */
package ros.tests;

import junit.textui.TestRunner;

import ros.RosFactory;
import ros.TopicSpec;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Topic Spec</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopicSpecTest extends SpecBaseTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TopicSpecTest.class);
    }

    /**
     * Constructs a new Topic Spec test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopicSpecTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Topic Spec test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected TopicSpec getFixture() {
        return (TopicSpec)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RosFactory.eINSTANCE.createTopicSpec());
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

} //TopicSpecTest
