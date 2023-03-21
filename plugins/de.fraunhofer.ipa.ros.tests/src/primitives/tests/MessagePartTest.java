/**
 */
package primitives.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import primitives.MessagePart;
import primitives.PrimitivesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagePartTest extends TestCase {

    /**
     * The fixture for this Message Part test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessagePart fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MessagePartTest.class);
    }

    /**
     * Constructs a new Message Part test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessagePartTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Message Part test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(MessagePart fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Message Part test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessagePart getFixture() {
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
        setFixture(PrimitivesFactory.eINSTANCE.createMessagePart());
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

} //MessagePartTest
