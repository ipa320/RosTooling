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
	 * Returns a new object of class '<em>Component Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Stack</em>'.
	 * @generated
	 */
	ComponentStack createComponentStack();

	/**
	 * Returns a new object of class '<em>Quality Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Attribute</em>'.
	 * @generated
	 */
	QualityAttribute createQualityAttribute();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RossystemPackage getRossystemPackage();

} //RossystemFactory
