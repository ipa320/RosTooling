/**
 */
package de.fraunhofer.ipa.rossystem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.rossystem.RossystemFactory
 * @model kind="package"
 * @generated
 */
public interface RossystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rossystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rossystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rossystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RossystemPackage eINSTANCE = de.fraunhofer.ipa.rossystem.impl.RossystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.rossystem.impl.ROSSystemImpl <em>ROS System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.rossystem.impl.ROSSystemImpl
	 * @see de.fraunhofer.ipa.rossystem.impl.RossystemPackageImpl#getROSSystem()
	 * @generated
	 */
	int ROS_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Ros Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ROS_NODE = 0;

	/**
	 * The number of structural features of the '<em>ROS System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ROS System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.rossystem.ROSSystem <em>ROS System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS System</em>'.
	 * @see de.fraunhofer.ipa.rossystem.ROSSystem
	 * @generated
	 */
	EClass getROSSystem();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.rossystem.ROSSystem#getRosNode <em>Ros Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Node</em>'.
	 * @see de.fraunhofer.ipa.rossystem.ROSSystem#getRosNode()
	 * @see #getROSSystem()
	 * @generated
	 */
	EReference getROSSystem_RosNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RossystemFactory getRossystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fraunhofer.ipa.rossystem.impl.ROSSystemImpl <em>ROS System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.rossystem.impl.ROSSystemImpl
		 * @see de.fraunhofer.ipa.rossystem.impl.RossystemPackageImpl#getROSSystem()
		 * @generated
		 */
		EClass ROS_SYSTEM = eINSTANCE.getROSSystem();

		/**
		 * The meta object literal for the '<em><b>Ros Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ROS_NODE = eINSTANCE.getROSSystem_RosNode();

	}

} //RossystemPackage
