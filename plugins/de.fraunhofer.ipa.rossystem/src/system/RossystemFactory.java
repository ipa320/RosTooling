/**
 */
package system;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see system.RossystemPackage
 * @generated
 */
public interface RossystemFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RossystemFactory eINSTANCE = system.impl.RossystemFactoryImpl.init();

    /**
     * Returns a new object of class '<em>System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System</em>'.
     * @generated
     */
    System createSystem();

    /**
     * Returns a new object of class '<em>Rossystem</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rossystem</em>'.
     * @generated
     */
    Rossystem createRossystem();

                /**
     * Returns a new object of class '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process</em>'.
     * @generated
     */
    Process createProcess();

    /**
     * Returns a new object of class '<em>Ros Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Node</em>'.
     * @generated
     */
    RosNode createRosNode();

    /**
     * Returns a new object of class '<em>Ros Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Interface</em>'.
     * @generated
     */
    RosInterface createRosInterface();

    /**
     * Returns a new object of class '<em>Interface Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Reference</em>'.
     * @generated
     */
    InterfaceReference createInterfaceReference();

    /**
     * Returns a new object of class '<em>Ros Publisher Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Publisher Reference</em>'.
     * @generated
     */
    RosPublisherReference createRosPublisherReference();

    /**
     * Returns a new object of class '<em>Ros Subscriber Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Subscriber Reference</em>'.
     * @generated
     */
    RosSubscriberReference createRosSubscriberReference();

    /**
     * Returns a new object of class '<em>Ros Service Server Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Service Server Reference</em>'.
     * @generated
     */
    RosServiceServerReference createRosServiceServerReference();

    /**
     * Returns a new object of class '<em>Ros Service Client Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Service Client Reference</em>'.
     * @generated
     */
    RosServiceClientReference createRosServiceClientReference();

    /**
     * Returns a new object of class '<em>Ros Action Server Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Action Server Reference</em>'.
     * @generated
     */
    RosActionServerReference createRosActionServerReference();

    /**
     * Returns a new object of class '<em>Ros Action Client Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Action Client Reference</em>'.
     * @generated
     */
    RosActionClientReference createRosActionClientReference();

    /**
     * Returns a new object of class '<em>Ros Parameter Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Parameter Reference</em>'.
     * @generated
     */
    RosParameterReference createRosParameterReference();

    /**
     * Returns a new object of class '<em>Ros Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Parameter</em>'.
     * @generated
     */
    RosParameter createRosParameter();

    /**
     * Returns a new object of class '<em>Ros System Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros System Connection</em>'.
     * @generated
     */
    RosSystemConnection createRosSystemConnection();

                /**
     * Returns a new object of class '<em>Ros Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Connection</em>'.
     * @generated
     */
    RosConnection createRosConnection();

    /**
     * Returns a new object of class '<em>Ros Topic Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Topic Connection</em>'.
     * @generated
     */
    RosTopicConnection createRosTopicConnection();

                /**
     * Returns a new object of class '<em>Ros Service Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Service Connection</em>'.
     * @generated
     */
    RosServiceConnection createRosServiceConnection();

                /**
     * Returns a new object of class '<em>Ros Action Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ros Action Connection</em>'.
     * @generated
     */
    RosActionConnection createRosActionConnection();

                /**
     * Returns a new object of class '<em>Sub System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub System</em>'.
     * @generated
     */
    SubSystem createSubSystem();

                                                                /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RossystemPackage getRossystemPackage();

} //RossystemFactory
