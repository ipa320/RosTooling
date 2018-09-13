/**
 */
package de.fraunhofer.ipa.ros.seronetgw.rosgw;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage
 * @generated
 */
public interface RosgwFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosgwFactory eINSTANCE = de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosgwFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ros Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Gateway</em>'.
	 * @generated
	 */
	RosGateway createRosGateway();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RosgwPackage getRosgwPackage();

} //RosgwFactory
