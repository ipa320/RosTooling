/**
 */
package de.fraunhofer.ipa.componentInterface;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentInterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentInterface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/componentInterface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentInterface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInterfacePackage eINSTANCE = de.fraunhofer.ipa.componentInterface.impl.ComponentInterfacePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl
	 * @see de.fraunhofer.ipa.componentInterface.impl.ComponentInterfacePackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Ros Topic Publisher</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER = 0;

	/**
	 * The feature id for the '<em><b>Ros Topic Subscriber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER = 1;

	/**
	 * The feature id for the '<em><b>Ros Service Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_SERVICE_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Ros Service Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_SERVICE_CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosTopicPublisher <em>Ros Topic Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Topic Publisher</em>'.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosTopicPublisher()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosTopicPublisher();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Topic Subscriber</em>'.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosTopicSubscriber()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosTopicSubscriber();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosServiceServer <em>Ros Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Service Server</em>'.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosServiceServer()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosServiceServer();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosServiceClient <em>Ros Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Service Client</em>'.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosServiceClient()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosServiceClient();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterface#getName()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EAttribute getComponentInterface_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentInterfaceFactory getComponentInterfaceFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl
		 * @see de.fraunhofer.ipa.componentInterface.impl.ComponentInterfacePackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Publisher</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER = eINSTANCE.getComponentInterface_RosTopicPublisher();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Subscriber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER = eINSTANCE.getComponentInterface_RosTopicSubscriber();

		/**
		 * The meta object literal for the '<em><b>Ros Service Server</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_SERVICE_SERVER = eINSTANCE.getComponentInterface_RosServiceServer();

		/**
		 * The meta object literal for the '<em><b>Ros Service Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_SERVICE_CLIENT = eINSTANCE.getComponentInterface_RosServiceClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INTERFACE__NAME = eINSTANCE.getComponentInterface_Name();

	}

} //ComponentInterfacePackage
