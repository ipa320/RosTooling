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
	 * The meta object id for the '{@link componentInterface.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.PublisherImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__TOPIC_REF = 0;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__TOPIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.SubscriberImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 2;

	/**
	 * The feature id for the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__TOPIC_REF = 0;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__TOPIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.ServiceServerImpl <em>Service Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.ServiceServerImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getServiceServer()
	 * @generated
	 */
	int SERVICE_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__SRV_REF = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.ServiceClientImpl <em>Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.ServiceClientImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getServiceClient()
	 * @generated
	 */
	int SERVICE_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__SRV_REF = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__SERVICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link componentInterface.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see componentInterface.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.Publisher#getTopicRef <em>Topic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Ref</em>'.
	 * @see componentInterface.Publisher#getTopicRef()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_TopicRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.Publisher#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see componentInterface.Publisher#getTopicName()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_TopicName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.Publisher#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.Publisher#getNameSpace()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see componentInterface.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.Subscriber#getTopicRef <em>Topic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Ref</em>'.
	 * @see componentInterface.Subscriber#getTopicRef()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_TopicRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.Subscriber#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see componentInterface.Subscriber#getTopicName()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_TopicName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.Subscriber#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.Subscriber#getNameSpace()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Server</em>'.
	 * @see componentInterface.ServiceServer
	 * @generated
	 */
	EClass getServiceServer();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.ServiceServer#getSrvRef <em>Srv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Ref</em>'.
	 * @see componentInterface.ServiceServer#getSrvRef()
	 * @see #getServiceServer()
	 * @generated
	 */
	EReference getServiceServer_SrvRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.ServiceServer#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see componentInterface.ServiceServer#getServiceName()
	 * @see #getServiceServer()
	 * @generated
	 */
	EAttribute getServiceServer_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.ServiceServer#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.ServiceServer#getNameSpace()
	 * @see #getServiceServer()
	 * @generated
	 */
	EReference getServiceServer_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Client</em>'.
	 * @see componentInterface.ServiceClient
	 * @generated
	 */
	EClass getServiceClient();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.ServiceClient#getSrvRef <em>Srv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Ref</em>'.
	 * @see componentInterface.ServiceClient#getSrvRef()
	 * @see #getServiceClient()
	 * @generated
	 */
	EReference getServiceClient_SrvRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.ServiceClient#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see componentInterface.ServiceClient#getServiceName()
	 * @see #getServiceClient()
	 * @generated
	 */
	EAttribute getServiceClient_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.ServiceClient#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.ServiceClient#getNameSpace()
	 * @see #getServiceClient()
	 * @generated
	 */
	EReference getServiceClient_NameSpace();

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
		 * The meta object literal for the '{@link componentInterface.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.PublisherImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Topic Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__TOPIC_REF = eINSTANCE.getPublisher_TopicRef();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__TOPIC_NAME = eINSTANCE.getPublisher_TopicName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__NAME_SPACE = eINSTANCE.getPublisher_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.SubscriberImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Topic Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__TOPIC_REF = eINSTANCE.getSubscriber_TopicRef();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__TOPIC_NAME = eINSTANCE.getSubscriber_TopicName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__NAME_SPACE = eINSTANCE.getSubscriber_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.ServiceServerImpl <em>Service Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.ServiceServerImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getServiceServer()
		 * @generated
		 */
		EClass SERVICE_SERVER = eINSTANCE.getServiceServer();

		/**
		 * The meta object literal for the '<em><b>Srv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SERVER__SRV_REF = eINSTANCE.getServiceServer_SrvRef();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SERVER__SERVICE_NAME = eINSTANCE.getServiceServer_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SERVER__NAME_SPACE = eINSTANCE.getServiceServer_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.ServiceClientImpl <em>Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.ServiceClientImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getServiceClient()
		 * @generated
		 */
		EClass SERVICE_CLIENT = eINSTANCE.getServiceClient();

		/**
		 * The meta object literal for the '<em><b>Srv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLIENT__SRV_REF = eINSTANCE.getServiceClient_SrvRef();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLIENT__SERVICE_NAME = eINSTANCE.getServiceClient_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLIENT__NAME_SPACE = eINSTANCE.getServiceClient_NameSpace();

	}

} //ComponentInterfacePackage
