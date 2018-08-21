/**
 */
package de.fraunhofer.ipa.ros.seronetgw.rosgw;

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
 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwFactory
 * @model kind="package"
 * @generated
 */
public interface RosgwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rosgw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rosgw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rosgw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosgwPackage eINSTANCE = de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosgwPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl <em>Ros Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosgwPackageImpl#getRosGateway()
	 * @generated
	 */
	int ROS_GATEWAY = 0;

	/**
	 * The feature id for the '<em><b>Ros Topic Publisher</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_GATEWAY__ROS_TOPIC_PUBLISHER = 0;

	/**
	 * The feature id for the '<em><b>Ros Topic Subscriber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER = 1;

	/**
	 * The feature id for the '<em><b>Ros Service Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_GATEWAY__ROS_SERVICE_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Ros Service Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_GATEWAY__ROS_SERVICE_CLIENT = 3;

	/**
	 * The number of structural features of the '<em>Ros Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_GATEWAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ros Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_GATEWAY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway <em>Ros Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Gateway</em>'.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway
	 * @generated
	 */
	EClass getRosGateway();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosTopicPublisher <em>Ros Topic Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Topic Publisher</em>'.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosTopicPublisher()
	 * @see #getRosGateway()
	 * @generated
	 */
	EReference getRosGateway_RosTopicPublisher();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Topic Subscriber</em>'.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosTopicSubscriber()
	 * @see #getRosGateway()
	 * @generated
	 */
	EReference getRosGateway_RosTopicSubscriber();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosServiceServer <em>Ros Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Service Server</em>'.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosServiceServer()
	 * @see #getRosGateway()
	 * @generated
	 */
	EReference getRosGateway_RosServiceServer();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosServiceClient <em>Ros Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Service Client</em>'.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway#getRosServiceClient()
	 * @see #getRosGateway()
	 * @generated
	 */
	EReference getRosGateway_RosServiceClient();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RosgwFactory getRosgwFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl <em>Ros Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl
		 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosgwPackageImpl#getRosGateway()
		 * @generated
		 */
		EClass ROS_GATEWAY = eINSTANCE.getRosGateway();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Publisher</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_GATEWAY__ROS_TOPIC_PUBLISHER = eINSTANCE.getRosGateway_RosTopicPublisher();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Subscriber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER = eINSTANCE.getRosGateway_RosTopicSubscriber();

		/**
		 * The meta object literal for the '<em><b>Ros Service Server</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_GATEWAY__ROS_SERVICE_SERVER = eINSTANCE.getRosGateway_RosServiceServer();

		/**
		 * The meta object literal for the '<em><b>Ros Service Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_GATEWAY__ROS_SERVICE_CLIENT = eINSTANCE.getRosGateway_RosServiceClient();

	}

} //RosgwPackage
