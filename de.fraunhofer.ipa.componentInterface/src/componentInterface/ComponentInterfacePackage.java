/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ros.RosPackage;

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
 * @see componentInterface.ComponentInterfaceFactory
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
	ComponentInterfacePackage eINSTANCE = componentInterface.impl.ComponentInterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link componentInterface.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.ComponentInterfaceImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAMESPACE = RosPackage.NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = RosPackage.NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ros Topic Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ros Topic Subscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ros Service Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_SERVICE_SERVER = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ros Service Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROS_SERVICE_CLIENT = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_OPERATION_COUNT = RosPackage.NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RosPublisherImpl <em>Ros Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RosPublisherImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosPublisher()
	 * @generated
	 */
	int ROS_PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__TOPIC_REF = 0;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__TOPIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Ros Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ros Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RosSubscriberImpl <em>Ros Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RosSubscriberImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosSubscriber()
	 * @generated
	 */
	int ROS_SUBSCRIBER = 2;

	/**
	 * The feature id for the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__TOPIC_REF = 0;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__TOPIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Ros Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ros Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RosServiceServerImpl <em>Ros Service Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RosServiceServerImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosServiceServer()
	 * @generated
	 */
	int ROS_SERVICE_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__SRV_REF = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Ros Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ros Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RosServiceClientImpl <em>Ros Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RosServiceClientImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosServiceClient()
	 * @generated
	 */
	int ROS_SERVICE_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__SRV_REF = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Ros Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ros Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link componentInterface.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see componentInterface.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRosTopicPublisher <em>Ros Topic Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Topic Publisher</em>'.
	 * @see componentInterface.ComponentInterface#getRosTopicPublisher()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosTopicPublisher();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Topic Subscriber</em>'.
	 * @see componentInterface.ComponentInterface#getRosTopicSubscriber()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosTopicSubscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRosServiceServer <em>Ros Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Service Server</em>'.
	 * @see componentInterface.ComponentInterface#getRosServiceServer()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosServiceServer();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRosServiceClient <em>Ros Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Service Client</em>'.
	 * @see componentInterface.ComponentInterface#getRosServiceClient()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_RosServiceClient();

	/**
	 * Returns the meta object for class '{@link componentInterface.RosPublisher <em>Ros Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Publisher</em>'.
	 * @see componentInterface.RosPublisher
	 * @generated
	 */
	EClass getRosPublisher();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosPublisher#getTopicRef <em>Topic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Ref</em>'.
	 * @see componentInterface.RosPublisher#getTopicRef()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EReference getRosPublisher_TopicRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosPublisher#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see componentInterface.RosPublisher#getTopicName()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EAttribute getRosPublisher_TopicName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosPublisher#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RosPublisher#getNameSpace()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EReference getRosPublisher_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.RosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Subscriber</em>'.
	 * @see componentInterface.RosSubscriber
	 * @generated
	 */
	EClass getRosSubscriber();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosSubscriber#getTopicRef <em>Topic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Ref</em>'.
	 * @see componentInterface.RosSubscriber#getTopicRef()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EReference getRosSubscriber_TopicRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosSubscriber#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see componentInterface.RosSubscriber#getTopicName()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EAttribute getRosSubscriber_TopicName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosSubscriber#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RosSubscriber#getNameSpace()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EReference getRosSubscriber_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.RosServiceServer <em>Ros Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Service Server</em>'.
	 * @see componentInterface.RosServiceServer
	 * @generated
	 */
	EClass getRosServiceServer();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosServiceServer#getSrvRef <em>Srv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Ref</em>'.
	 * @see componentInterface.RosServiceServer#getSrvRef()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EReference getRosServiceServer_SrvRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosServiceServer#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see componentInterface.RosServiceServer#getServiceName()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EAttribute getRosServiceServer_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosServiceServer#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RosServiceServer#getNameSpace()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EReference getRosServiceServer_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.RosServiceClient <em>Ros Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Service Client</em>'.
	 * @see componentInterface.RosServiceClient
	 * @generated
	 */
	EClass getRosServiceClient();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosServiceClient#getSrvRef <em>Srv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Ref</em>'.
	 * @see componentInterface.RosServiceClient#getSrvRef()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EReference getRosServiceClient_SrvRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosServiceClient#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see componentInterface.RosServiceClient#getServiceName()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EAttribute getRosServiceClient_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RosServiceClient#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RosServiceClient#getNameSpace()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EReference getRosServiceClient_NameSpace();

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
		 * The meta object literal for the '{@link componentInterface.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.ComponentInterfaceImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Publisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER = eINSTANCE.getComponentInterface_RosTopicPublisher();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Subscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER = eINSTANCE.getComponentInterface_RosTopicSubscriber();

		/**
		 * The meta object literal for the '<em><b>Ros Service Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_SERVICE_SERVER = eINSTANCE.getComponentInterface_RosServiceServer();

		/**
		 * The meta object literal for the '<em><b>Ros Service Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROS_SERVICE_CLIENT = eINSTANCE.getComponentInterface_RosServiceClient();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RosPublisherImpl <em>Ros Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RosPublisherImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosPublisher()
		 * @generated
		 */
		EClass ROS_PUBLISHER = eINSTANCE.getRosPublisher();

		/**
		 * The meta object literal for the '<em><b>Topic Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER__TOPIC_REF = eINSTANCE.getRosPublisher_TopicRef();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__TOPIC_NAME = eINSTANCE.getRosPublisher_TopicName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER__NAME_SPACE = eINSTANCE.getRosPublisher_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RosSubscriberImpl <em>Ros Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RosSubscriberImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosSubscriber()
		 * @generated
		 */
		EClass ROS_SUBSCRIBER = eINSTANCE.getRosSubscriber();

		/**
		 * The meta object literal for the '<em><b>Topic Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SUBSCRIBER__TOPIC_REF = eINSTANCE.getRosSubscriber_TopicRef();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SUBSCRIBER__TOPIC_NAME = eINSTANCE.getRosSubscriber_TopicName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SUBSCRIBER__NAME_SPACE = eINSTANCE.getRosSubscriber_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RosServiceServerImpl <em>Ros Service Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RosServiceServerImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosServiceServer()
		 * @generated
		 */
		EClass ROS_SERVICE_SERVER = eINSTANCE.getRosServiceServer();

		/**
		 * The meta object literal for the '<em><b>Srv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_SERVER__SRV_REF = eINSTANCE.getRosServiceServer_SrvRef();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_SERVER__SERVICE_NAME = eINSTANCE.getRosServiceServer_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_SERVER__NAME_SPACE = eINSTANCE.getRosServiceServer_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RosServiceClientImpl <em>Ros Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RosServiceClientImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRosServiceClient()
		 * @generated
		 */
		EClass ROS_SERVICE_CLIENT = eINSTANCE.getRosServiceClient();

		/**
		 * The meta object literal for the '<em><b>Srv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CLIENT__SRV_REF = eINSTANCE.getRosServiceClient_SrvRef();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_CLIENT__SERVICE_NAME = eINSTANCE.getRosServiceClient_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CLIENT__NAME_SPACE = eINSTANCE.getRosServiceClient_NameSpace();

	}

} //ComponentInterfacePackage
