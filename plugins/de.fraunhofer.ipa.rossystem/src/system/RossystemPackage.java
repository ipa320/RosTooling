/**
 */
package system;

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
 * @see system.RossystemFactory
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
    String eNAME = "system";

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
    String eNS_PREFIX = "system";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RossystemPackage eINSTANCE = system.impl.RossystemPackageImpl.init();

    /**
     * The meta object id for the '{@link system.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.SystemImpl
     * @see system.impl.RossystemPackageImpl#getSystem()
     * @generated
     */
    int SYSTEM = 0;

    /**
     * The meta object id for the '{@link system.impl.RossystemImpl <em>Rossystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RossystemImpl
     * @see system.impl.RossystemPackageImpl#getRossystem()
     * @generated
     */
    int ROSSYSTEM = 1;

                /**
     * The meta object id for the '{@link system.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.ProcessImpl
     * @see system.impl.RossystemPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 2;

    /**
     * The meta object id for the '{@link system.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.ComponentImpl
     * @see system.impl.RossystemPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 3;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = 0;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__NAME = COMPONENT_FEATURE_COUNT + 0;

                /**
     * The feature id for the '<em><b>From File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__FROM_FILE = COMPONENT_FEATURE_COUNT + 1;

                                                                /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__PROCESSES = COMPONENT_FEATURE_COUNT + 2;

                /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__COMPONENTS = COMPONENT_FEATURE_COUNT + 3;

                /**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__CONNECTIONS = COMPONENT_FEATURE_COUNT + 4;

                /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__PARAMETER = COMPONENT_FEATURE_COUNT + 5;

                /**
     * The number of structural features of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 6;

                /**
     * The number of operations of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

                /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM__NAME = SYSTEM__NAME;

                /**
     * The feature id for the '<em><b>From File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROSSYSTEM__FROM_FILE = SYSTEM__FROM_FILE;

                                                                /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM__PROCESSES = SYSTEM__PROCESSES;

                /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM__COMPONENTS = SYSTEM__COMPONENTS;

                /**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM__CONNECTIONS = SYSTEM__CONNECTIONS;

                /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM__PARAMETER = SYSTEM__PARAMETER;

                /**
     * The number of structural features of the '<em>Rossystem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 0;

                /**
     * The number of operations of the '<em>Rossystem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
int ROSSYSTEM_OPERATION_COUNT = SYSTEM_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Components</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__COMPONENTS = 2;

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
     * The meta object id for the '{@link system.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.ConnectionImpl
     * @see system.impl.RossystemPackageImpl#getConnection()
     * @generated
     */
    int CONNECTION = 4;

    /**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link system.impl.RosNodeImpl <em>Ros Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosNodeImpl
     * @see system.impl.RossystemPackageImpl#getRosNode()
     * @generated
     */
    int ROS_NODE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__NAME = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__NAMESPACE = COMPONENT_FEATURE_COUNT + 1;

                /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__FROM = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Rosinterfaces</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__ROSINTERFACES = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Rosparameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__ROSPARAMETERS = COMPONENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Ros Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Ros Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link system.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosInterfaceImpl
     * @see system.impl.RossystemPackageImpl#getRosInterface()
     * @generated
     */
    int ROS_INTERFACE = 6;

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
     * The meta object id for the '{@link system.impl.InterfaceReferenceImpl <em>Interface Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.InterfaceReferenceImpl
     * @see system.impl.RossystemPackageImpl#getInterfaceReference()
     * @generated
     */
    int INTERFACE_REFERENCE = 7;

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
     * The meta object id for the '{@link system.impl.RosPublisherReferenceImpl <em>Ros Publisher Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosPublisherReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosPublisherReference()
     * @generated
     */
    int ROS_PUBLISHER_REFERENCE = 8;

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
     * The meta object id for the '{@link system.impl.RosSubscriberReferenceImpl <em>Ros Subscriber Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosSubscriberReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosSubscriberReference()
     * @generated
     */
    int ROS_SUBSCRIBER_REFERENCE = 9;

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
     * The meta object id for the '{@link system.impl.RosServiceServerReferenceImpl <em>Ros Service Server Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosServiceServerReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosServiceServerReference()
     * @generated
     */
    int ROS_SERVICE_SERVER_REFERENCE = 10;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_SERVER_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ros Service Server Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_SERVER_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ros Service Server Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_SERVER_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link system.impl.RosServiceClientReferenceImpl <em>Ros Service Client Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosServiceClientReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosServiceClientReference()
     * @generated
     */
    int ROS_SERVICE_CLIENT_REFERENCE = 11;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CLIENT_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ros Service Client Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CLIENT_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

                /**
     * The number of operations of the '<em>Ros Service Client Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CLIENT_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

                /**
     * The meta object id for the '{@link system.impl.RosActionServerReferenceImpl <em>Ros Action Server Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosActionServerReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosActionServerReference()
     * @generated
     */
    int ROS_ACTION_SERVER_REFERENCE = 12;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_SERVER_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ros Action Server Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_SERVER_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ros Action Server Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_SERVER_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link system.impl.RosActionClientReferenceImpl <em>Ros Action Client Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosActionClientReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosActionClientReference()
     * @generated
     */
    int ROS_ACTION_CLIENT_REFERENCE = 13;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CLIENT_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ros Action Client Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CLIENT_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ros Action Client Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CLIENT_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link system.impl.RosParameterReferenceImpl <em>Ros Parameter Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosParameterReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosParameterReference()
     * @generated
     */
    int ROS_PARAMETER_REFERENCE = 14;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ros Parameter Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ros Parameter Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link system.impl.RosParameterImpl <em>Ros Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosParameterImpl
     * @see system.impl.RossystemPackageImpl#getRosParameter()
     * @generated
     */
    int ROS_PARAMETER = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER__VALUE = 1;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER__FROM = 2;

    /**
     * The number of structural features of the '<em>Ros Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Ros Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link system.impl.RosSystemConnectionImpl <em>Ros System Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosSystemConnectionImpl
     * @see system.impl.RossystemPackageImpl#getRosSystemConnection()
     * @generated
     */
    int ROS_SYSTEM_CONNECTION = 16;

                /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SYSTEM_CONNECTION__FROM = CONNECTION_FEATURE_COUNT + 0;

                /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SYSTEM_CONNECTION__TO = CONNECTION_FEATURE_COUNT + 1;

                /**
     * The number of structural features of the '<em>Ros System Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SYSTEM_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

                /**
     * The number of operations of the '<em>Ros System Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SYSTEM_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

                /**
     * The meta object id for the '{@link system.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosConnectionImpl
     * @see system.impl.RossystemPackageImpl#getRosConnection()
     * @generated
     */
    int ROS_CONNECTION = 17;

    /**
     * The number of structural features of the '<em>Ros Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Ros Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link system.impl.RosTopicConnectionImpl <em>Ros Topic Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosTopicConnectionImpl
     * @see system.impl.RossystemPackageImpl#getRosTopicConnection()
     * @generated
     */
    int ROS_TOPIC_CONNECTION = 18;

                /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_TOPIC_CONNECTION__FROM = ROS_CONNECTION_FEATURE_COUNT + 0;

                /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_TOPIC_CONNECTION__TO = ROS_CONNECTION_FEATURE_COUNT + 1;

                /**
     * The number of structural features of the '<em>Ros Topic Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_TOPIC_CONNECTION_FEATURE_COUNT = ROS_CONNECTION_FEATURE_COUNT + 2;

                /**
     * The number of operations of the '<em>Ros Topic Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_TOPIC_CONNECTION_OPERATION_COUNT = ROS_CONNECTION_OPERATION_COUNT + 0;

                /**
     * The meta object id for the '{@link system.impl.RosServiceConnectionImpl <em>Ros Service Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosServiceConnectionImpl
     * @see system.impl.RossystemPackageImpl#getRosServiceConnection()
     * @generated
     */
    int ROS_SERVICE_CONNECTION = 19;

                /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CONNECTION__FROM = ROS_CONNECTION_FEATURE_COUNT + 0;

                /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CONNECTION__TO = ROS_CONNECTION_FEATURE_COUNT + 1;

                /**
     * The number of structural features of the '<em>Ros Service Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CONNECTION_FEATURE_COUNT = ROS_CONNECTION_FEATURE_COUNT + 2;

                /**
     * The number of operations of the '<em>Ros Service Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVICE_CONNECTION_OPERATION_COUNT = ROS_CONNECTION_OPERATION_COUNT + 0;

                /**
     * The meta object id for the '{@link system.impl.RosActionConnectionImpl <em>Ros Action Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosActionConnectionImpl
     * @see system.impl.RossystemPackageImpl#getRosActionConnection()
     * @generated
     */
    int ROS_ACTION_CONNECTION = 20;

                /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CONNECTION__FROM = ROS_CONNECTION_FEATURE_COUNT + 0;

                /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CONNECTION__TO = ROS_CONNECTION_FEATURE_COUNT + 1;

                /**
     * The number of structural features of the '<em>Ros Action Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CONNECTION_FEATURE_COUNT = ROS_CONNECTION_FEATURE_COUNT + 2;

                /**
     * The number of operations of the '<em>Ros Action Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_ACTION_CONNECTION_OPERATION_COUNT = ROS_CONNECTION_OPERATION_COUNT + 0;


                /**
     * The meta object id for the '{@link system.impl.SubSystemImpl <em>Sub System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.SubSystemImpl
     * @see system.impl.RossystemPackageImpl#getSubSystem()
     * @generated
     */
    int SUB_SYSTEM = 21;

                                                                /**
     * The feature id for the '<em><b>System</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM__SYSTEM = COMPONENT_FEATURE_COUNT + 0;

                                                                /**
     * The number of structural features of the '<em>Sub System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

                                                                /**
     * The number of operations of the '<em>Sub System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_SYSTEM_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;


                                                                /**
     * Returns the meta object for class '{@link system.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>System</em>'.
     * @see system.System
     * @generated
     */
    EClass getSystem();

    /**
     * Returns the meta object for the attribute '{@link system.System#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see system.System#getName()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_Name();

    /**
     * Returns the meta object for the attribute '{@link system.System#getFromFile <em>From File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From File</em>'.
     * @see system.System#getFromFile()
     * @see #getSystem()
     * @generated
     */
    EAttribute getSystem_FromFile();

                /**
     * Returns the meta object for the containment reference list '{@link system.System#getProcesses <em>Processes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Processes</em>'.
     * @see system.System#getProcesses()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Processes();

    /**
     * Returns the meta object for the containment reference list '{@link system.System#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see system.System#getComponents()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Components();

    /**
     * Returns the meta object for the containment reference list '{@link system.System#getConnections <em>Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connections</em>'.
     * @see system.System#getConnections()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Connections();

    /**
     * Returns the meta object for the containment reference list '{@link system.System#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see system.System#getParameter()
     * @see #getSystem()
     * @generated
     */
    EReference getSystem_Parameter();

    /**
     * Returns the meta object for class '{@link system.Rossystem <em>Rossystem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rossystem</em>'.
     * @see system.Rossystem
     * @generated
     */
    EClass getRossystem();

                /**
     * Returns the meta object for class '{@link system.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see system.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for the attribute '{@link system.Process#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see system.Process#getName()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_Name();

    /**
     * Returns the meta object for the attribute '{@link system.Process#getThreads <em>Threads</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Threads</em>'.
     * @see system.Process#getThreads()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_Threads();

    /**
     * Returns the meta object for the reference list '{@link system.Process#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Components</em>'.
     * @see system.Process#getComponents()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Components();

                /**
     * Returns the meta object for class '{@link system.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see system.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for class '{@link system.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see system.Connection
     * @generated
     */
    EClass getConnection();

    /**
     * Returns the meta object for class '{@link system.RosNode <em>Ros Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Node</em>'.
     * @see system.RosNode
     * @generated
     */
    EClass getRosNode();

    /**
     * Returns the meta object for the attribute '{@link system.RosNode#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see system.RosNode#getName()
     * @see #getRosNode()
     * @generated
     */
    EAttribute getRosNode_Name();

    /**
     * Returns the meta object for the attribute '{@link system.RosNode#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see system.RosNode#getNamespace()
     * @see #getRosNode()
     * @generated
     */
    EAttribute getRosNode_Namespace();

                /**
     * Returns the meta object for the reference '{@link system.RosNode#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosNode#getFrom()
     * @see #getRosNode()
     * @generated
     */
    EReference getRosNode_From();

    /**
     * Returns the meta object for the containment reference list '{@link system.RosNode#getRosinterfaces <em>Rosinterfaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rosinterfaces</em>'.
     * @see system.RosNode#getRosinterfaces()
     * @see #getRosNode()
     * @generated
     */
    EReference getRosNode_Rosinterfaces();

    /**
     * Returns the meta object for the containment reference list '{@link system.RosNode#getRosparameters <em>Rosparameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rosparameters</em>'.
     * @see system.RosNode#getRosparameters()
     * @see #getRosNode()
     * @generated
     */
    EReference getRosNode_Rosparameters();

    /**
     * Returns the meta object for class '{@link system.RosInterface <em>Ros Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Interface</em>'.
     * @see system.RosInterface
     * @generated
     */
    EClass getRosInterface();

    /**
     * Returns the meta object for the attribute '{@link system.RosInterface#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see system.RosInterface#getName()
     * @see #getRosInterface()
     * @generated
     */
    EAttribute getRosInterface_Name();

    /**
     * Returns the meta object for the containment reference '{@link system.RosInterface#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Reference</em>'.
     * @see system.RosInterface#getReference()
     * @see #getRosInterface()
     * @generated
     */
    EReference getRosInterface_Reference();

    /**
     * Returns the meta object for class '{@link system.InterfaceReference <em>Interface Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Reference</em>'.
     * @see system.InterfaceReference
     * @generated
     */
    EClass getInterfaceReference();

    /**
     * Returns the meta object for class '{@link system.RosPublisherReference <em>Ros Publisher Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Publisher Reference</em>'.
     * @see system.RosPublisherReference
     * @generated
     */
    EClass getRosPublisherReference();

    /**
     * Returns the meta object for the reference '{@link system.RosPublisherReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosPublisherReference#getFrom()
     * @see #getRosPublisherReference()
     * @generated
     */
    EReference getRosPublisherReference_From();

    /**
     * Returns the meta object for class '{@link system.RosSubscriberReference <em>Ros Subscriber Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Subscriber Reference</em>'.
     * @see system.RosSubscriberReference
     * @generated
     */
    EClass getRosSubscriberReference();

    /**
     * Returns the meta object for the reference '{@link system.RosSubscriberReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosSubscriberReference#getFrom()
     * @see #getRosSubscriberReference()
     * @generated
     */
    EReference getRosSubscriberReference_From();

    /**
     * Returns the meta object for class '{@link system.RosServiceServerReference <em>Ros Service Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Service Server Reference</em>'.
     * @see system.RosServiceServerReference
     * @generated
     */
    EClass getRosServiceServerReference();

    /**
     * Returns the meta object for the reference '{@link system.RosServiceServerReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosServiceServerReference#getFrom()
     * @see #getRosServiceServerReference()
     * @generated
     */
    EReference getRosServiceServerReference_From();

    /**
     * Returns the meta object for class '{@link system.RosServiceClientReference <em>Ros Service Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Service Client Reference</em>'.
     * @see system.RosServiceClientReference
     * @generated
     */
    EClass getRosServiceClientReference();

                /**
     * Returns the meta object for the reference '{@link system.RosServiceClientReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosServiceClientReference#getFrom()
     * @see #getRosServiceClientReference()
     * @generated
     */
    EReference getRosServiceClientReference_From();

                /**
     * Returns the meta object for class '{@link system.RosActionServerReference <em>Ros Action Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Action Server Reference</em>'.
     * @see system.RosActionServerReference
     * @generated
     */
    EClass getRosActionServerReference();

    /**
     * Returns the meta object for the reference '{@link system.RosActionServerReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosActionServerReference#getFrom()
     * @see #getRosActionServerReference()
     * @generated
     */
    EReference getRosActionServerReference_From();

    /**
     * Returns the meta object for class '{@link system.RosActionClientReference <em>Ros Action Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Action Client Reference</em>'.
     * @see system.RosActionClientReference
     * @generated
     */
    EClass getRosActionClientReference();

    /**
     * Returns the meta object for the reference '{@link system.RosActionClientReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosActionClientReference#getFrom()
     * @see #getRosActionClientReference()
     * @generated
     */
    EReference getRosActionClientReference_From();

    /**
     * Returns the meta object for class '{@link system.RosParameterReference <em>Ros Parameter Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Parameter Reference</em>'.
     * @see system.RosParameterReference
     * @generated
     */
    EClass getRosParameterReference();

    /**
     * Returns the meta object for the reference '{@link system.RosParameterReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosParameterReference#getFrom()
     * @see #getRosParameterReference()
     * @generated
     */
    EReference getRosParameterReference_From();

    /**
     * Returns the meta object for class '{@link system.RosParameter <em>Ros Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Parameter</em>'.
     * @see system.RosParameter
     * @generated
     */
    EClass getRosParameter();

    /**
     * Returns the meta object for the attribute '{@link system.RosParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see system.RosParameter#getName()
     * @see #getRosParameter()
     * @generated
     */
    EAttribute getRosParameter_Name();

    /**
     * Returns the meta object for the containment reference '{@link system.RosParameter#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see system.RosParameter#getValue()
     * @see #getRosParameter()
     * @generated
     */
    EReference getRosParameter_Value();

    /**
     * Returns the meta object for the reference '{@link system.RosParameter#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosParameter#getFrom()
     * @see #getRosParameter()
     * @generated
     */
    EReference getRosParameter_From();

    /**
     * Returns the meta object for class '{@link system.RosSystemConnection <em>Ros System Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros System Connection</em>'.
     * @see system.RosSystemConnection
     * @generated
     */
    EClass getRosSystemConnection();

                /**
     * Returns the meta object for the reference '{@link system.RosSystemConnection#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosSystemConnection#getFrom()
     * @see #getRosSystemConnection()
     * @generated
     */
    EReference getRosSystemConnection_From();

                /**
     * Returns the meta object for the reference '{@link system.RosSystemConnection#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see system.RosSystemConnection#getTo()
     * @see #getRosSystemConnection()
     * @generated
     */
    EReference getRosSystemConnection_To();

                /**
     * Returns the meta object for class '{@link system.RosConnection <em>Ros Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Connection</em>'.
     * @see system.RosConnection
     * @generated
     */
    EClass getRosConnection();

    /**
     * Returns the meta object for class '{@link system.RosTopicConnection <em>Ros Topic Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Topic Connection</em>'.
     * @see system.RosTopicConnection
     * @generated
     */
    EClass getRosTopicConnection();

                /**
     * Returns the meta object for the reference '{@link system.RosTopicConnection#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosTopicConnection#getFrom()
     * @see #getRosTopicConnection()
     * @generated
     */
    EReference getRosTopicConnection_From();

                /**
     * Returns the meta object for the reference '{@link system.RosTopicConnection#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see system.RosTopicConnection#getTo()
     * @see #getRosTopicConnection()
     * @generated
     */
    EReference getRosTopicConnection_To();

                /**
     * Returns the meta object for class '{@link system.RosServiceConnection <em>Ros Service Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Service Connection</em>'.
     * @see system.RosServiceConnection
     * @generated
     */
    EClass getRosServiceConnection();

                /**
     * Returns the meta object for the reference '{@link system.RosServiceConnection#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosServiceConnection#getFrom()
     * @see #getRosServiceConnection()
     * @generated
     */
    EReference getRosServiceConnection_From();

                /**
     * Returns the meta object for the reference '{@link system.RosServiceConnection#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see system.RosServiceConnection#getTo()
     * @see #getRosServiceConnection()
     * @generated
     */
    EReference getRosServiceConnection_To();

                /**
     * Returns the meta object for class '{@link system.RosActionConnection <em>Ros Action Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Action Connection</em>'.
     * @see system.RosActionConnection
     * @generated
     */
    EClass getRosActionConnection();

                /**
     * Returns the meta object for the reference '{@link system.RosActionConnection#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosActionConnection#getFrom()
     * @see #getRosActionConnection()
     * @generated
     */
    EReference getRosActionConnection_From();

                /**
     * Returns the meta object for the reference '{@link system.RosActionConnection#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see system.RosActionConnection#getTo()
     * @see #getRosActionConnection()
     * @generated
     */
    EReference getRosActionConnection_To();

                /**
     * Returns the meta object for class '{@link system.SubSystem <em>Sub System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub System</em>'.
     * @see system.SubSystem
     * @generated
     */
    EClass getSubSystem();

                                                                /**
     * Returns the meta object for the reference '{@link system.SubSystem#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>System</em>'.
     * @see system.SubSystem#getSystem()
     * @see #getSubSystem()
     * @generated
     */
    EReference getSubSystem_System();

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
         * The meta object literal for the '{@link system.impl.SystemImpl <em>System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.SystemImpl
         * @see system.impl.RossystemPackageImpl#getSystem()
         * @generated
         */
        EClass SYSTEM = eINSTANCE.getSystem();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

        /**
         * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SYSTEM__FROM_FILE = eINSTANCE.getSystem_FromFile();

                                /**
         * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__PROCESSES = eINSTANCE.getSystem_Processes();

        /**
         * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

        /**
         * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__CONNECTIONS = eINSTANCE.getSystem_Connections();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SYSTEM__PARAMETER = eINSTANCE.getSystem_Parameter();

        /**
         * The meta object literal for the '{@link system.impl.RossystemImpl <em>Rossystem</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RossystemImpl
         * @see system.impl.RossystemPackageImpl#getRossystem()
         * @generated
         */
        EClass ROSSYSTEM = eINSTANCE.getRossystem();

                                /**
         * The meta object literal for the '{@link system.impl.ProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.ProcessImpl
         * @see system.impl.RossystemPackageImpl#getProcess()
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
         * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS__COMPONENTS = eINSTANCE.getProcess_Components();

                                /**
         * The meta object literal for the '{@link system.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.ComponentImpl
         * @see system.impl.RossystemPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '{@link system.impl.ConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.ConnectionImpl
         * @see system.impl.RossystemPackageImpl#getConnection()
         * @generated
         */
        EClass CONNECTION = eINSTANCE.getConnection();

        /**
         * The meta object literal for the '{@link system.impl.RosNodeImpl <em>Ros Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosNodeImpl
         * @see system.impl.RossystemPackageImpl#getRosNode()
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
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROS_NODE__NAMESPACE = eINSTANCE.getRosNode_Namespace();

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
         * The meta object literal for the '<em><b>Rosparameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_NODE__ROSPARAMETERS = eINSTANCE.getRosNode_Rosparameters();

        /**
         * The meta object literal for the '{@link system.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosInterfaceImpl
         * @see system.impl.RossystemPackageImpl#getRosInterface()
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
         * The meta object literal for the '{@link system.impl.InterfaceReferenceImpl <em>Interface Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.InterfaceReferenceImpl
         * @see system.impl.RossystemPackageImpl#getInterfaceReference()
         * @generated
         */
        EClass INTERFACE_REFERENCE = eINSTANCE.getInterfaceReference();

        /**
         * The meta object literal for the '{@link system.impl.RosPublisherReferenceImpl <em>Ros Publisher Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosPublisherReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosPublisherReference()
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
         * The meta object literal for the '{@link system.impl.RosSubscriberReferenceImpl <em>Ros Subscriber Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosSubscriberReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosSubscriberReference()
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
         * The meta object literal for the '{@link system.impl.RosServiceServerReferenceImpl <em>Ros Service Server Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosServiceServerReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosServiceServerReference()
         * @generated
         */
        EClass ROS_SERVICE_SERVER_REFERENCE = eINSTANCE.getRosServiceServerReference();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SERVICE_SERVER_REFERENCE__FROM = eINSTANCE.getRosServiceServerReference_From();

        /**
         * The meta object literal for the '{@link system.impl.RosServiceClientReferenceImpl <em>Ros Service Client Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosServiceClientReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosServiceClientReference()
         * @generated
         */
        EClass ROS_SERVICE_CLIENT_REFERENCE = eINSTANCE.getRosServiceClientReference();

                                /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SERVICE_CLIENT_REFERENCE__FROM = eINSTANCE.getRosServiceClientReference_From();

                                /**
         * The meta object literal for the '{@link system.impl.RosActionServerReferenceImpl <em>Ros Action Server Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosActionServerReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosActionServerReference()
         * @generated
         */
        EClass ROS_ACTION_SERVER_REFERENCE = eINSTANCE.getRosActionServerReference();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_ACTION_SERVER_REFERENCE__FROM = eINSTANCE.getRosActionServerReference_From();

        /**
         * The meta object literal for the '{@link system.impl.RosActionClientReferenceImpl <em>Ros Action Client Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosActionClientReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosActionClientReference()
         * @generated
         */
        EClass ROS_ACTION_CLIENT_REFERENCE = eINSTANCE.getRosActionClientReference();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_ACTION_CLIENT_REFERENCE__FROM = eINSTANCE.getRosActionClientReference_From();

        /**
         * The meta object literal for the '{@link system.impl.RosParameterReferenceImpl <em>Ros Parameter Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosParameterReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosParameterReference()
         * @generated
         */
        EClass ROS_PARAMETER_REFERENCE = eINSTANCE.getRosParameterReference();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_PARAMETER_REFERENCE__FROM = eINSTANCE.getRosParameterReference_From();

        /**
         * The meta object literal for the '{@link system.impl.RosParameterImpl <em>Ros Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosParameterImpl
         * @see system.impl.RossystemPackageImpl#getRosParameter()
         * @generated
         */
        EClass ROS_PARAMETER = eINSTANCE.getRosParameter();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ROS_PARAMETER__NAME = eINSTANCE.getRosParameter_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_PARAMETER__VALUE = eINSTANCE.getRosParameter_Value();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_PARAMETER__FROM = eINSTANCE.getRosParameter_From();

        /**
         * The meta object literal for the '{@link system.impl.RosSystemConnectionImpl <em>Ros System Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosSystemConnectionImpl
         * @see system.impl.RossystemPackageImpl#getRosSystemConnection()
         * @generated
         */
        EClass ROS_SYSTEM_CONNECTION = eINSTANCE.getRosSystemConnection();

                                /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SYSTEM_CONNECTION__FROM = eINSTANCE.getRosSystemConnection_From();

                                /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SYSTEM_CONNECTION__TO = eINSTANCE.getRosSystemConnection_To();

                                /**
         * The meta object literal for the '{@link system.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosConnectionImpl
         * @see system.impl.RossystemPackageImpl#getRosConnection()
         * @generated
         */
        EClass ROS_CONNECTION = eINSTANCE.getRosConnection();

        /**
         * The meta object literal for the '{@link system.impl.RosTopicConnectionImpl <em>Ros Topic Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosTopicConnectionImpl
         * @see system.impl.RossystemPackageImpl#getRosTopicConnection()
         * @generated
         */
        EClass ROS_TOPIC_CONNECTION = eINSTANCE.getRosTopicConnection();

                                /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_TOPIC_CONNECTION__FROM = eINSTANCE.getRosTopicConnection_From();

                                /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_TOPIC_CONNECTION__TO = eINSTANCE.getRosTopicConnection_To();

                                /**
         * The meta object literal for the '{@link system.impl.RosServiceConnectionImpl <em>Ros Service Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosServiceConnectionImpl
         * @see system.impl.RossystemPackageImpl#getRosServiceConnection()
         * @generated
         */
        EClass ROS_SERVICE_CONNECTION = eINSTANCE.getRosServiceConnection();

                                /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SERVICE_CONNECTION__FROM = eINSTANCE.getRosServiceConnection_From();

                                /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SERVICE_CONNECTION__TO = eINSTANCE.getRosServiceConnection_To();

                                /**
         * The meta object literal for the '{@link system.impl.RosActionConnectionImpl <em>Ros Action Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosActionConnectionImpl
         * @see system.impl.RossystemPackageImpl#getRosActionConnection()
         * @generated
         */
        EClass ROS_ACTION_CONNECTION = eINSTANCE.getRosActionConnection();

                                /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_ACTION_CONNECTION__FROM = eINSTANCE.getRosActionConnection_From();

                                /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_ACTION_CONNECTION__TO = eINSTANCE.getRosActionConnection_To();

                                                                                                                                /**
         * The meta object literal for the '{@link system.impl.SubSystemImpl <em>Sub System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.SubSystemImpl
         * @see system.impl.RossystemPackageImpl#getSubSystem()
         * @generated
         */
        EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

                                                                                                                                /**
         * The meta object literal for the '<em><b>System</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUB_SYSTEM__SYSTEM = eINSTANCE.getSubSystem_System();

    }

} //RossystemPackage
