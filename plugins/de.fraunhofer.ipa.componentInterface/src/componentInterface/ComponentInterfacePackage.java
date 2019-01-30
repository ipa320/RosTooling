/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	String eNS_URI = "http://www.ipa.fraunhofer.de/componentInterface";

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
	 * The feature id for the '<em><b>Rospublisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROSPUBLISHER = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rossubscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROSSUBSCRIBER = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rosserviceserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROSSERVICESERVER = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rosserviceclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ROSSERVICECLIENT = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__PUBLISHER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__NS = 2;

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
	 * The feature id for the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__SUBSCRIBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__NS = 2;

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
	 * The feature id for the '<em><b>Srvserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__SRVSERVER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__NS = 2;

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
	 * The feature id for the '<em><b>Srvclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__SRVCLIENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__NS = 2;

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
	 * The meta object id for the '<em>NS</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getNS()
	 * @generated
	 */
	int NS = 5;


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
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRospublisher <em>Rospublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rospublisher</em>'.
	 * @see componentInterface.ComponentInterface#getRospublisher()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Rospublisher();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRossubscriber <em>Rossubscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rossubscriber</em>'.
	 * @see componentInterface.ComponentInterface#getRossubscriber()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Rossubscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRosserviceserver <em>Rosserviceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosserviceserver</em>'.
	 * @see componentInterface.ComponentInterface#getRosserviceserver()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Rosserviceserver();

	/**
	 * Returns the meta object for the containment reference list '{@link componentInterface.ComponentInterface#getRosserviceclient <em>Rosserviceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosserviceclient</em>'.
	 * @see componentInterface.ComponentInterface#getRosserviceclient()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Rosserviceclient();

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
	 * Returns the meta object for the reference '{@link componentInterface.RosPublisher#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see componentInterface.RosPublisher#getPublisher()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EReference getRosPublisher_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosPublisher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentInterface.RosPublisher#getName()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EAttribute getRosPublisher_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosPublisher#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see componentInterface.RosPublisher#getNs()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EAttribute getRosPublisher_Ns();

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
	 * Returns the meta object for the reference '{@link componentInterface.RosSubscriber#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscriber</em>'.
	 * @see componentInterface.RosSubscriber#getSubscriber()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EReference getRosSubscriber_Subscriber();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosSubscriber#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentInterface.RosSubscriber#getName()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EAttribute getRosSubscriber_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosSubscriber#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see componentInterface.RosSubscriber#getNs()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EAttribute getRosSubscriber_Ns();

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
	 * Returns the meta object for the reference '{@link componentInterface.RosServiceServer#getSrvserver <em>Srvserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srvserver</em>'.
	 * @see componentInterface.RosServiceServer#getSrvserver()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EReference getRosServiceServer_Srvserver();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosServiceServer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentInterface.RosServiceServer#getName()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EAttribute getRosServiceServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosServiceServer#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see componentInterface.RosServiceServer#getNs()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EAttribute getRosServiceServer_Ns();

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
	 * Returns the meta object for the reference '{@link componentInterface.RosServiceClient#getSrvclient <em>Srvclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srvclient</em>'.
	 * @see componentInterface.RosServiceClient#getSrvclient()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EReference getRosServiceClient_Srvclient();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosServiceClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see componentInterface.RosServiceClient#getName()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EAttribute getRosServiceClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RosServiceClient#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see componentInterface.RosServiceClient#getNs()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EAttribute getRosServiceClient_Ns();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NS</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNS();

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
		 * The meta object literal for the '<em><b>Rospublisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROSPUBLISHER = eINSTANCE.getComponentInterface_Rospublisher();

		/**
		 * The meta object literal for the '<em><b>Rossubscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROSSUBSCRIBER = eINSTANCE.getComponentInterface_Rossubscriber();

		/**
		 * The meta object literal for the '<em><b>Rosserviceserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROSSERVICESERVER = eINSTANCE.getComponentInterface_Rosserviceserver();

		/**
		 * The meta object literal for the '<em><b>Rosserviceclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__ROSSERVICECLIENT = eINSTANCE.getComponentInterface_Rosserviceclient();

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
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER__PUBLISHER = eINSTANCE.getRosPublisher_Publisher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__NAME = eINSTANCE.getRosPublisher_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PUBLISHER__NS = eINSTANCE.getRosPublisher_Ns();

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
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SUBSCRIBER__SUBSCRIBER = eINSTANCE.getRosSubscriber_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SUBSCRIBER__NAME = eINSTANCE.getRosSubscriber_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SUBSCRIBER__NS = eINSTANCE.getRosSubscriber_Ns();

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
		 * The meta object literal for the '<em><b>Srvserver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_SERVER__SRVSERVER = eINSTANCE.getRosServiceServer_Srvserver();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_SERVER__NAME = eINSTANCE.getRosServiceServer_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_SERVER__NS = eINSTANCE.getRosServiceServer_Ns();

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
		 * The meta object literal for the '<em><b>Srvclient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CLIENT__SRVCLIENT = eINSTANCE.getRosServiceClient_Srvclient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_CLIENT__NAME = eINSTANCE.getRosServiceClient_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SERVICE_CLIENT__NS = eINSTANCE.getRosServiceClient_Ns();

		/**
		 * The meta object literal for the '<em>NS</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getNS()
		 * @generated
		 */
		EDataType NS = eINSTANCE.getNS();

	}

} //ComponentInterfacePackage
