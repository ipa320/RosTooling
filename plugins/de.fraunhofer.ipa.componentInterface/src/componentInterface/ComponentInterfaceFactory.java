/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentInterface.ComponentInterfacePackage
 * @generated
 */
public interface ComponentInterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInterfaceFactory eINSTANCE = componentInterface.impl.ComponentInterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Interface</em>'.
	 * @generated
	 */
	ComponentInterface createComponentInterface();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInterfacePackage getComponentInterfacePackage();

} //ComponentInterfaceFactory
