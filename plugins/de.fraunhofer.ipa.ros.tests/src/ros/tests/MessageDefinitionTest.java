/**
 */
package ros.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ros.MessageDefinition;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageDefinitionTest extends TestCase {

    /**
     * The fixture for this Message Definition test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageDefinition fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MessageDefinitionTest.class);
    }

    /**
     * Constructs a new Message Definition test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageDefinitionTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Message Definition test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(MessageDefinition fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Message Definition test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageDefinition getFixture() {
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
        setFixture(RosFactory.eINSTANCE.createMessageDefinition());
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

} //MessageDefinitionTest
