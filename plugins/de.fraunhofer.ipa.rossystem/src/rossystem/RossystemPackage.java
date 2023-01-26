/**
 */
package rossystem;

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
 * @see rossystem.RossystemFactory
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
	String eNS_URI = "http://www.ipa.fraunhofer.de/rossystem";

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
	RossystemPackage eINSTANCE = rossystem.impl.RossystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link rossystem.impl.RosSystemImpl <em>Ros System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosSystemImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosSystem()
	 * @generated
	 */
	int ROS_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Rosnode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ROSNODE = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__PROCESS = 4;

	/**
	 * The number of structural features of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosNodeImpl <em>Ros Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosNodeImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosNode()
	 * @generated
	 */
	int ROS_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Rosinterfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE__ROSINTERFACES = 2;

	/**
	 * The number of structural features of the '<em>Ros Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ros Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosInterfacesImpl <em>Ros Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosInterfacesImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosInterfaces()
	 * @generated
	 */
	int ROS_INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>Rosactionclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSACTIONCLIENT = 0;

	/**
	 * The feature id for the '<em><b>Rospublisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSPUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Rosserviceserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSSERVICESERVER = 2;

	/**
	 * The feature id for the '<em><b>Rossubscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSSUBSCRIBER = 3;

	/**
	 * The feature id for the '<em><b>Rosserviceclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSSERVICECLIENT = 4;

	/**
	 * The feature id for the '<em><b>Rosactionserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSACTIONSERVER = 5;

	/**
	 * The feature id for the '<em><b>Rosparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES__ROSPARAMETER = 6;

	/**
	 * The number of structural features of the '<em>Ros Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Ros Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.NamedInterfaceImpl <em>Named Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.NamedInterfaceImpl
	 * @see rossystem.impl.RossystemPackageImpl#getNamedInterface()
	 * @generated
	 */
	int NAMED_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INTERFACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosPublisherImpl <em>Ros Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosPublisherImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosPublisher()
	 * @generated
	 */
	int ROS_PUBLISHER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosSubscriberImpl <em>Ros Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosSubscriberImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosSubscriber()
	 * @generated
	 */
	int ROS_SUBSCRIBER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosServiceServerImpl <em>Ros Service Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosServiceServerImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosServiceServer()
	 * @generated
	 */
	int ROS_SERVICE_SERVER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_SERVER_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosServiceClientImpl <em>Ros Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosServiceClientImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosServiceClient()
	 * @generated
	 */
	int ROS_SERVICE_CLIENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SERVICE_CLIENT_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosActionServerImpl <em>Ros Action Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosActionServerImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosActionServer()
	 * @generated
	 */
	int ROS_ACTION_SERVER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_SERVER_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosActionClientImpl <em>Ros Action Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosActionClientImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosActionClient()
	 * @generated
	 */
	int ROS_ACTION_CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_ACTION_CLIENT_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosParameterImpl <em>Ros Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosParameterImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosParameter()
	 * @generated
	 */
	int ROS_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PARAMETER__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PARAMETER__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PARAMETER__VALUE = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ros Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PARAMETER_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ros Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PARAMETER_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ProcessImpl
	 * @see rossystem.impl.RossystemPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__THREADS = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NODES = 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.TopicConnectionImpl <em>Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.TopicConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getTopicConnection()
	 * @generated
	 */
	int TOPIC_CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__TO = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.ServiceConnectionImpl <em>Service Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ServiceConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getServiceConnection()
	 * @generated
	 */
	int SERVICE_CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__TO = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.ActionConnectionImpl <em>Action Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ActionConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getActionConnection()
	 * @generated
	 */
	int ACTION_CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION__NAME = NAMED_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION__FROM = NAMED_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION__TO = NAMED_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION_FEATURE_COUNT = NAMED_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION_OPERATION_COUNT = NAMED_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.ConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ConnectionsImpl
	 * @see rossystem.impl.RossystemPackageImpl#getConnections()
	 * @generated
	 */
	int CONNECTIONS = 15;

	/**
	 * The feature id for the '<em><b>Ros Topic Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__ROS_TOPIC_CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ros Service Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__ROS_SERVICE_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Ros Action Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__ROS_ACTION_CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosInterfaceImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosInterface()
	 * @generated
	 */
	int ROS_INTERFACE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Ros Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ros Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.InterfaceReferenceImpl <em>Interface Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.InterfaceReferenceImpl
	 * @see rossystem.impl.RossystemPackageImpl#getInterfaceReference()
	 * @generated
	 */
	int INTERFACE_REFERENCE = 17;

	/**
	 * The number of structural features of the '<em>Interface Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosPublisherReferenceImpl <em>Ros Publisher Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosPublisherReferenceImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosPublisherReference()
	 * @generated
	 */
	int ROS_PUBLISHER_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Publisher Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Publisher Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PUBLISHER_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosSubscriberReferenceImpl <em>Ros Subscriber Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosSubscriberReferenceImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosSubscriberReference()
	 * @generated
	 */
	int ROS_SUBSCRIBER_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Subscriber Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Subscriber Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SUBSCRIBER_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosConnection()
	 * @generated
	 */
	int ROS_CONNECTION = 20;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONNECTION__TO = 1;

	/**
	 * The number of structural features of the '<em>Ros Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ros Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link rossystem.RosSystem <em>Ros System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros System</em>'.
	 * @see rossystem.RosSystem
	 * @generated
	 */
	EClass getRosSystem();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.RosSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.RosSystem#getName()
	 * @see #getRosSystem()
	 * @generated
	 */
	EAttribute getRosSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see rossystem.RosSystem#getParameter()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getRosnode <em>Rosnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosnode</em>'.
	 * @see rossystem.RosSystem#getRosnode()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_Rosnode();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see rossystem.RosSystem#getConnections()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see rossystem.RosSystem#getProcess()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_Process();

	/**
	 * Returns the meta object for class '{@link rossystem.RosNode <em>Ros Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Node</em>'.
	 * @see rossystem.RosNode
	 * @generated
	 */
	EClass getRosNode();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.RosNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.RosNode#getName()
	 * @see #getRosNode()
	 * @generated
	 */
	EAttribute getRosNode_Name();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosNode#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosNode#getFrom()
	 * @see #getRosNode()
	 * @generated
	 */
	EReference getRosNode_From();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosNode#getRosinterfaces <em>Rosinterfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosinterfaces</em>'.
	 * @see rossystem.RosNode#getRosinterfaces()
	 * @see #getRosNode()
	 * @generated
	 */
	EReference getRosNode_Rosinterfaces();

	/**
	 * Returns the meta object for class '{@link rossystem.RosInterfaces <em>Ros Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Interfaces</em>'.
	 * @see rossystem.RosInterfaces
	 * @generated
	 */
	EClass getRosInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRosactionclient <em>Rosactionclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosactionclient</em>'.
	 * @see rossystem.RosInterfaces#getRosactionclient()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rosactionclient();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRospublisher <em>Rospublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rospublisher</em>'.
	 * @see rossystem.RosInterfaces#getRospublisher()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rospublisher();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRosserviceserver <em>Rosserviceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosserviceserver</em>'.
	 * @see rossystem.RosInterfaces#getRosserviceserver()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rosserviceserver();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRossubscriber <em>Rossubscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rossubscriber</em>'.
	 * @see rossystem.RosInterfaces#getRossubscriber()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rossubscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRosserviceclient <em>Rosserviceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosserviceclient</em>'.
	 * @see rossystem.RosInterfaces#getRosserviceclient()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rosserviceclient();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRosactionserver <em>Rosactionserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosactionserver</em>'.
	 * @see rossystem.RosInterfaces#getRosactionserver()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rosactionserver();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosInterfaces#getRosparameter <em>Rosparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rosparameter</em>'.
	 * @see rossystem.RosInterfaces#getRosparameter()
	 * @see #getRosInterfaces()
	 * @generated
	 */
	EReference getRosInterfaces_Rosparameter();

	/**
	 * Returns the meta object for class '{@link rossystem.NamedInterface <em>Named Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Interface</em>'.
	 * @see rossystem.NamedInterface
	 * @generated
	 */
	EClass getNamedInterface();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.NamedInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.NamedInterface#getName()
	 * @see #getNamedInterface()
	 * @generated
	 */
	EAttribute getNamedInterface_Name();

	/**
	 * Returns the meta object for class '{@link rossystem.RosPublisher <em>Ros Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Publisher</em>'.
	 * @see rossystem.RosPublisher
	 * @generated
	 */
	EClass getRosPublisher();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosPublisher#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosPublisher#getFrom()
	 * @see #getRosPublisher()
	 * @generated
	 */
	EReference getRosPublisher_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Subscriber</em>'.
	 * @see rossystem.RosSubscriber
	 * @generated
	 */
	EClass getRosSubscriber();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosSubscriber#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosSubscriber#getFrom()
	 * @see #getRosSubscriber()
	 * @generated
	 */
	EReference getRosSubscriber_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosServiceServer <em>Ros Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Service Server</em>'.
	 * @see rossystem.RosServiceServer
	 * @generated
	 */
	EClass getRosServiceServer();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosServiceServer#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosServiceServer#getFrom()
	 * @see #getRosServiceServer()
	 * @generated
	 */
	EReference getRosServiceServer_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosServiceClient <em>Ros Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Service Client</em>'.
	 * @see rossystem.RosServiceClient
	 * @generated
	 */
	EClass getRosServiceClient();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosServiceClient#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosServiceClient#getFrom()
	 * @see #getRosServiceClient()
	 * @generated
	 */
	EReference getRosServiceClient_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosActionServer <em>Ros Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Action Server</em>'.
	 * @see rossystem.RosActionServer
	 * @generated
	 */
	EClass getRosActionServer();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosActionServer#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosActionServer#getFrom()
	 * @see #getRosActionServer()
	 * @generated
	 */
	EReference getRosActionServer_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosActionClient <em>Ros Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Action Client</em>'.
	 * @see rossystem.RosActionClient
	 * @generated
	 */
	EClass getRosActionClient();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosActionClient#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosActionClient#getFrom()
	 * @see #getRosActionClient()
	 * @generated
	 */
	EReference getRosActionClient_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosParameter <em>Ros Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Parameter</em>'.
	 * @see rossystem.RosParameter
	 * @generated
	 */
	EClass getRosParameter();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosParameter#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosParameter#getFrom()
	 * @see #getRosParameter()
	 * @generated
	 */
	EReference getRosParameter_From();

	/**
	 * Returns the meta object for the containment reference '{@link rossystem.RosParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rossystem.RosParameter#getValue()
	 * @see #getRosParameter()
	 * @generated
	 */
	EReference getRosParameter_Value();

	/**
	 * Returns the meta object for class '{@link rossystem.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see rossystem.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.Process#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threads</em>'.
	 * @see rossystem.Process#getThreads()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Threads();

	/**
	 * Returns the meta object for the reference list '{@link rossystem.Process#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see rossystem.Process#getNodes()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Nodes();

	/**
	 * Returns the meta object for class '{@link rossystem.TopicConnection <em>Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Connection</em>'.
	 * @see rossystem.TopicConnection
	 * @generated
	 */
	EClass getTopicConnection();

	/**
	 * Returns the meta object for the reference '{@link rossystem.TopicConnection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.TopicConnection#getFrom()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EReference getTopicConnection_From();

	/**
	 * Returns the meta object for the reference '{@link rossystem.TopicConnection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see rossystem.TopicConnection#getTo()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EReference getTopicConnection_To();

	/**
	 * Returns the meta object for class '{@link rossystem.ServiceConnection <em>Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Connection</em>'.
	 * @see rossystem.ServiceConnection
	 * @generated
	 */
	EClass getServiceConnection();

	/**
	 * Returns the meta object for the reference '{@link rossystem.ServiceConnection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.ServiceConnection#getFrom()
	 * @see #getServiceConnection()
	 * @generated
	 */
	EReference getServiceConnection_From();

	/**
	 * Returns the meta object for the reference '{@link rossystem.ServiceConnection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see rossystem.ServiceConnection#getTo()
	 * @see #getServiceConnection()
	 * @generated
	 */
	EReference getServiceConnection_To();

	/**
	 * Returns the meta object for class '{@link rossystem.ActionConnection <em>Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Connection</em>'.
	 * @see rossystem.ActionConnection
	 * @generated
	 */
	EClass getActionConnection();

	/**
	 * Returns the meta object for the reference '{@link rossystem.ActionConnection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.ActionConnection#getFrom()
	 * @see #getActionConnection()
	 * @generated
	 */
	EReference getActionConnection_From();

	/**
	 * Returns the meta object for the reference '{@link rossystem.ActionConnection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see rossystem.ActionConnection#getTo()
	 * @see #getActionConnection()
	 * @generated
	 */
	EReference getActionConnection_To();

	/**
	 * Returns the meta object for class '{@link rossystem.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see rossystem.Connections
	 * @generated
	 */
	EClass getConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.Connections#getRosTopicConnections <em>Ros Topic Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Topic Connections</em>'.
	 * @see rossystem.Connections#getRosTopicConnections()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_RosTopicConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.Connections#getRosServiceConnections <em>Ros Service Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Service Connections</em>'.
	 * @see rossystem.Connections#getRosServiceConnections()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_RosServiceConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.Connections#getRosActionConnections <em>Ros Action Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Action Connections</em>'.
	 * @see rossystem.Connections#getRosActionConnections()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_RosActionConnections();

	/**
	 * Returns the meta object for class '{@link rossystem.RosInterface <em>Ros Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Interface</em>'.
	 * @see rossystem.RosInterface
	 * @generated
	 */
	EClass getRosInterface();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.RosInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.RosInterface#getName()
	 * @see #getRosInterface()
	 * @generated
	 */
	EAttribute getRosInterface_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rossystem.RosInterface#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see rossystem.RosInterface#getReference()
	 * @see #getRosInterface()
	 * @generated
	 */
	EReference getRosInterface_Reference();

	/**
	 * Returns the meta object for class '{@link rossystem.InterfaceReference <em>Interface Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Reference</em>'.
	 * @see rossystem.InterfaceReference
	 * @generated
	 */
	EClass getInterfaceReference();

	/**
	 * Returns the meta object for class '{@link rossystem.RosPublisherReference <em>Ros Publisher Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Publisher Reference</em>'.
	 * @see rossystem.RosPublisherReference
	 * @generated
	 */
	EClass getRosPublisherReference();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosPublisherReference#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosPublisherReference#getFrom()
	 * @see #getRosPublisherReference()
	 * @generated
	 */
	EReference getRosPublisherReference_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosSubscriberReference <em>Ros Subscriber Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Subscriber Reference</em>'.
	 * @see rossystem.RosSubscriberReference
	 * @generated
	 */
	EClass getRosSubscriberReference();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosSubscriberReference#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosSubscriberReference#getFrom()
	 * @see #getRosSubscriberReference()
	 * @generated
	 */
	EReference getRosSubscriberReference_From();

	/**
	 * Returns the meta object for class '{@link rossystem.RosConnection <em>Ros Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Connection</em>'.
	 * @see rossystem.RosConnection
	 * @generated
	 */
	EClass getRosConnection();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosConnection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see rossystem.RosConnection#getFrom()
	 * @see #getRosConnection()
	 * @generated
	 */
	EReference getRosConnection_From();

	/**
	 * Returns the meta object for the reference '{@link rossystem.RosConnection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see rossystem.RosConnection#getTo()
	 * @see #getRosConnection()
	 * @generated
	 */
	EReference getRosConnection_To();

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
		 * The meta object literal for the '{@link rossystem.impl.RosSystemImpl <em>Ros System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosSystemImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosSystem()
		 * @generated
		 */
		EClass ROS_SYSTEM = eINSTANCE.getRosSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SYSTEM__NAME = eINSTANCE.getRosSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__PARAMETER = eINSTANCE.getRosSystem_Parameter();

		/**
		 * The meta object literal for the '<em><b>Rosnode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ROSNODE = eINSTANCE.getRosSystem_Rosnode();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__CONNECTIONS = eINSTANCE.getRosSystem_Connections();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__PROCESS = eINSTANCE.getRosSystem_Process();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosNodeImpl <em>Ros Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosNodeImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosNode()
		 * @generated
		 */
		EClass ROS_NODE = eINSTANCE.getRosNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_NODE__NAME = eINSTANCE.getRosNode_Name();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_NODE__FROM = eINSTANCE.getRosNode_From();

		/**
		 * The meta object literal for the '<em><b>Rosinterfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_NODE__ROSINTERFACES = eINSTANCE.getRosNode_Rosinterfaces();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosInterfacesImpl <em>Ros Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosInterfacesImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosInterfaces()
		 * @generated
		 */
		EClass ROS_INTERFACES = eINSTANCE.getRosInterfaces();

		/**
		 * The meta object literal for the '<em><b>Rosactionclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSACTIONCLIENT = eINSTANCE.getRosInterfaces_Rosactionclient();

		/**
		 * The meta object literal for the '<em><b>Rospublisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSPUBLISHER = eINSTANCE.getRosInterfaces_Rospublisher();

		/**
		 * The meta object literal for the '<em><b>Rosserviceserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSSERVICESERVER = eINSTANCE.getRosInterfaces_Rosserviceserver();

		/**
		 * The meta object literal for the '<em><b>Rossubscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSSUBSCRIBER = eINSTANCE.getRosInterfaces_Rossubscriber();

		/**
		 * The meta object literal for the '<em><b>Rosserviceclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSSERVICECLIENT = eINSTANCE.getRosInterfaces_Rosserviceclient();

		/**
		 * The meta object literal for the '<em><b>Rosactionserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSACTIONSERVER = eINSTANCE.getRosInterfaces_Rosactionserver();

		/**
		 * The meta object literal for the '<em><b>Rosparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACES__ROSPARAMETER = eINSTANCE.getRosInterfaces_Rosparameter();

		/**
		 * The meta object literal for the '{@link rossystem.impl.NamedInterfaceImpl <em>Named Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.NamedInterfaceImpl
		 * @see rossystem.impl.RossystemPackageImpl#getNamedInterface()
		 * @generated
		 */
		EClass NAMED_INTERFACE = eINSTANCE.getNamedInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_INTERFACE__NAME = eINSTANCE.getNamedInterface_Name();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosPublisherImpl <em>Ros Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosPublisherImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosPublisher()
		 * @generated
		 */
		EClass ROS_PUBLISHER = eINSTANCE.getRosPublisher();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER__FROM = eINSTANCE.getRosPublisher_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosSubscriberImpl <em>Ros Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosSubscriberImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosSubscriber()
		 * @generated
		 */
		EClass ROS_SUBSCRIBER = eINSTANCE.getRosSubscriber();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SUBSCRIBER__FROM = eINSTANCE.getRosSubscriber_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosServiceServerImpl <em>Ros Service Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosServiceServerImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosServiceServer()
		 * @generated
		 */
		EClass ROS_SERVICE_SERVER = eINSTANCE.getRosServiceServer();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_SERVER__FROM = eINSTANCE.getRosServiceServer_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosServiceClientImpl <em>Ros Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosServiceClientImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosServiceClient()
		 * @generated
		 */
		EClass ROS_SERVICE_CLIENT = eINSTANCE.getRosServiceClient();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SERVICE_CLIENT__FROM = eINSTANCE.getRosServiceClient_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosActionServerImpl <em>Ros Action Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosActionServerImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosActionServer()
		 * @generated
		 */
		EClass ROS_ACTION_SERVER = eINSTANCE.getRosActionServer();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_ACTION_SERVER__FROM = eINSTANCE.getRosActionServer_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosActionClientImpl <em>Ros Action Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosActionClientImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosActionClient()
		 * @generated
		 */
		EClass ROS_ACTION_CLIENT = eINSTANCE.getRosActionClient();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_ACTION_CLIENT__FROM = eINSTANCE.getRosActionClient_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosParameterImpl <em>Ros Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosParameterImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosParameter()
		 * @generated
		 */
		EClass ROS_PARAMETER = eINSTANCE.getRosParameter();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PARAMETER__FROM = eINSTANCE.getRosParameter_From();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PARAMETER__VALUE = eINSTANCE.getRosParameter_Value();

		/**
		 * The meta object literal for the '{@link rossystem.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.ProcessImpl
		 * @see rossystem.impl.RossystemPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__THREADS = eINSTANCE.getProcess_Threads();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__NODES = eINSTANCE.getProcess_Nodes();

		/**
		 * The meta object literal for the '{@link rossystem.impl.TopicConnectionImpl <em>Topic Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.TopicConnectionImpl
		 * @see rossystem.impl.RossystemPackageImpl#getTopicConnection()
		 * @generated
		 */
		EClass TOPIC_CONNECTION = eINSTANCE.getTopicConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_CONNECTION__FROM = eINSTANCE.getTopicConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_CONNECTION__TO = eINSTANCE.getTopicConnection_To();

		/**
		 * The meta object literal for the '{@link rossystem.impl.ServiceConnectionImpl <em>Service Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.ServiceConnectionImpl
		 * @see rossystem.impl.RossystemPackageImpl#getServiceConnection()
		 * @generated
		 */
		EClass SERVICE_CONNECTION = eINSTANCE.getServiceConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTION__FROM = eINSTANCE.getServiceConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTION__TO = eINSTANCE.getServiceConnection_To();

		/**
		 * The meta object literal for the '{@link rossystem.impl.ActionConnectionImpl <em>Action Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.ActionConnectionImpl
		 * @see rossystem.impl.RossystemPackageImpl#getActionConnection()
		 * @generated
		 */
		EClass ACTION_CONNECTION = eINSTANCE.getActionConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CONNECTION__FROM = eINSTANCE.getActionConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CONNECTION__TO = eINSTANCE.getActionConnection_To();

		/**
		 * The meta object literal for the '{@link rossystem.impl.ConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.ConnectionsImpl
		 * @see rossystem.impl.RossystemPackageImpl#getConnections()
		 * @generated
		 */
		EClass CONNECTIONS = eINSTANCE.getConnections();

		/**
		 * The meta object literal for the '<em><b>Ros Topic Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__ROS_TOPIC_CONNECTIONS = eINSTANCE.getConnections_RosTopicConnections();

		/**
		 * The meta object literal for the '<em><b>Ros Service Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__ROS_SERVICE_CONNECTIONS = eINSTANCE.getConnections_RosServiceConnections();

		/**
		 * The meta object literal for the '<em><b>Ros Action Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__ROS_ACTION_CONNECTIONS = eINSTANCE.getConnections_RosActionConnections();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosInterfaceImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosInterface()
		 * @generated
		 */
		EClass ROS_INTERFACE = eINSTANCE.getRosInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_INTERFACE__NAME = eINSTANCE.getRosInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_INTERFACE__REFERENCE = eINSTANCE.getRosInterface_Reference();

		/**
		 * The meta object literal for the '{@link rossystem.impl.InterfaceReferenceImpl <em>Interface Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.InterfaceReferenceImpl
		 * @see rossystem.impl.RossystemPackageImpl#getInterfaceReference()
		 * @generated
		 */
		EClass INTERFACE_REFERENCE = eINSTANCE.getInterfaceReference();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosPublisherReferenceImpl <em>Ros Publisher Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosPublisherReferenceImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosPublisherReference()
		 * @generated
		 */
		EClass ROS_PUBLISHER_REFERENCE = eINSTANCE.getRosPublisherReference();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PUBLISHER_REFERENCE__FROM = eINSTANCE.getRosPublisherReference_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosSubscriberReferenceImpl <em>Ros Subscriber Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosSubscriberReferenceImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosSubscriberReference()
		 * @generated
		 */
		EClass ROS_SUBSCRIBER_REFERENCE = eINSTANCE.getRosSubscriberReference();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SUBSCRIBER_REFERENCE__FROM = eINSTANCE.getRosSubscriberReference_From();

		/**
		 * The meta object literal for the '{@link rossystem.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosConnectionImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosConnection()
		 * @generated
		 */
		EClass ROS_CONNECTION = eINSTANCE.getRosConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_CONNECTION__FROM = eINSTANCE.getRosConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_CONNECTION__TO = eINSTANCE.getRosConnection_To();

	}

} //RossystemPackage
