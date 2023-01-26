/**
 */
package rossystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rossystem.RossystemPackage
 * @generated
 */
public interface RossystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RossystemFactory eINSTANCE = rossystem.impl.RossystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ros System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros System</em>'.
	 * @generated
	 */
	RosSystem createRosSystem();

	/**
	 * Returns a new object of class '<em>Ros Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Node</em>'.
	 * @generated
	 */
	RosNode createRosNode();

	/**
	 * Returns a new object of class '<em>Ros Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Interfaces</em>'.
	 * @generated
	 */
	RosInterfaces createRosInterfaces();

	/**
	 * Returns a new object of class '<em>Ros Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Publisher</em>'.
	 * @generated
	 */
	RosPublisher createRosPublisher();

	/**
	 * Returns a new object of class '<em>Ros Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Subscriber</em>'.
	 * @generated
	 */
	RosSubscriber createRosSubscriber();

	/**
	 * Returns a new object of class '<em>Ros Service Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Service Server</em>'.
	 * @generated
	 */
	RosServiceServer createRosServiceServer();

	/**
	 * Returns a new object of class '<em>Ros Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Service Client</em>'.
	 * @generated
	 */
	RosServiceClient createRosServiceClient();

	/**
	 * Returns a new object of class '<em>Ros Action Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Action Server</em>'.
	 * @generated
	 */
	RosActionServer createRosActionServer();

	/**
	 * Returns a new object of class '<em>Ros Action Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Action Client</em>'.
	 * @generated
	 */
	RosActionClient createRosActionClient();

	/**
	 * Returns a new object of class '<em>Ros Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Parameter</em>'.
	 * @generated
	 */
	RosParameter createRosParameter();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Connection</em>'.
	 * @generated
	 */
	TopicConnection createTopicConnection();

	/**
	 * Returns a new object of class '<em>Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Connection</em>'.
	 * @generated
	 */
	ServiceConnection createServiceConnection();

	/**
	 * Returns a new object of class '<em>Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Connection</em>'.
	 * @generated
	 */
	ActionConnection createActionConnection();

	/**
	 * Returns a new object of class '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connections</em>'.
	 * @generated
	 */
	Connections createConnections();

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
	 * Returns a new object of class '<em>Ros Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Connection</em>'.
	 * @generated
	 */
	RosConnection createRosConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RossystemPackage getRossystemPackage();

} //RossystemFactory
