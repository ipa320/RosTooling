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
	 * Returns a new object of class '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher</em>'.
	 * @generated
	 */
	Publisher createPublisher();

	/**
	 * Returns a new object of class '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscriber</em>'.
	 * @generated
	 */
	Subscriber createSubscriber();

	/**
	 * Returns a new object of class '<em>Service Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Server</em>'.
	 * @generated
	 */
	ServiceServer createServiceServer();

	/**
	 * Returns a new object of class '<em>Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Client</em>'.
	 * @generated
	 */
	ServiceClient createServiceClient();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInterfacePackage getComponentInterfacePackage();

} //ComponentInterfaceFactory
