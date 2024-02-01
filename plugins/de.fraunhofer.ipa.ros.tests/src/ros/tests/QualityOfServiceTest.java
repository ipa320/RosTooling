/**
 */
package ros.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import ros.QualityOfService;
import ros.RosFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quality Of Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityOfServiceTest extends TestCase {

    /**
     * The fixture for this Quality Of Service test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualityOfService fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(QualityOfServiceTest.class);
    }

    /**
     * Constructs a new Quality Of Service test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfServiceTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Quality Of Service test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(QualityOfService fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Quality Of Service test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualityOfService getFixture() {
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
        setFixture(RosFactory.eINSTANCE.createQualityOfService());
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

} //QualityOfServiceTest
