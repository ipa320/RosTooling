/**
 */
package de.fraunhofer.ipa.rossystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.rossystem.RossystemPackage
 * @generated
 */
public interface RossystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RossystemFactory eINSTANCE = de.fraunhofer.ipa.rossystem.impl.RossystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ROS System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS System</em>'.
	 * @generated
	 */
	ROSSystem createROSSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RossystemPackage getRossystemPackage();

} //RossystemFactory
