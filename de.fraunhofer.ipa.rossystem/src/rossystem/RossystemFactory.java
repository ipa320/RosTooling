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
	 * Returns a new object of class '<em>Ros Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Component</em>'.
	 * @generated
	 */
	RosComponent createRosComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RossystemPackage getRossystemPackage();

} //RossystemFactory
