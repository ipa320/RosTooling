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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__NAME = 0;

    /**
     * The feature id for the '<em><b>Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__PROCESSES = 1;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__COMPONENTS = 2;

    /**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__CONNECTIONS = 3;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM__PARAMETER = 4;

    /**
     * The number of structural features of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SYSTEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link system.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.ProcessImpl
     * @see system.impl.RossystemPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 1;

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
     * The meta object id for the '{@link system.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.ComponentImpl
     * @see system.impl.RossystemPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 2;

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
     * The meta object id for the '{@link system.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.ConnectionImpl
     * @see system.impl.RossystemPackageImpl#getConnection()
     * @generated
     */
    int CONNECTION = 3;

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
    int ROS_NODE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__NAME = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__FROM = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rosinterfaces</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__ROSINTERFACES = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Rosparameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__ROSPARAMETERS = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Ros Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

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
    int ROS_INTERFACE = 5;

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
    int INTERFACE_REFERENCE = 6;

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
    int ROS_PUBLISHER_REFERENCE = 7;

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
    int ROS_SUBSCRIBER_REFERENCE = 8;

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
    int ROS_SERVICE_SERVER_REFERENCE = 9;

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
     * The meta object id for the '{@link system.impl.RosServerClientReferenceImpl <em>Ros Server Client Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosServerClientReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosServerClientReference()
     * @generated
     */
    int ROS_SERVER_CLIENT_REFERENCE = 10;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVER_CLIENT_REFERENCE__FROM = INTERFACE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Ros Server Client Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVER_CLIENT_REFERENCE_FEATURE_COUNT = INTERFACE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Ros Server Client Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SERVER_CLIENT_REFERENCE_OPERATION_COUNT = INTERFACE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link system.impl.RosActionServerReferenceImpl <em>Ros Action Server Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosActionServerReferenceImpl
     * @see system.impl.RossystemPackageImpl#getRosActionServerReference()
     * @generated
     */
    int ROS_ACTION_SERVER_REFERENCE = 11;

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
    int ROS_ACTION_CLIENT_REFERENCE = 12;

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
    int ROS_PARAMETER_REFERENCE = 13;

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
    int ROS_PARAMETER = 14;

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
     * The meta object id for the '{@link system.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see system.impl.RosConnectionImpl
     * @see system.impl.RossystemPackageImpl#getRosConnection()
     * @generated
     */
    int ROS_CONNECTION = 15;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_CONNECTION__FROM = CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_CONNECTION__TO = CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Ros Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Ros Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;


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
     * Returns the meta object for the reference list '{@link system.Process#getNodes <em>Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Nodes</em>'.
     * @see system.Process#getNodes()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Nodes();

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
     * Returns the meta object for class '{@link system.RosServerClientReference <em>Ros Server Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Server Client Reference</em>'.
     * @see system.RosServerClientReference
     * @generated
     */
    EClass getRosServerClientReference();

    /**
     * Returns the meta object for the reference '{@link system.RosServerClientReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosServerClientReference#getFrom()
     * @see #getRosServerClientReference()
     * @generated
     */
    EReference getRosServerClientReference_From();

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
     * Returns the meta object for class '{@link system.RosConnection <em>Ros Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Connection</em>'.
     * @see system.RosConnection
     * @generated
     */
    EClass getRosConnection();

    /**
     * Returns the meta object for the reference '{@link system.RosConnection#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see system.RosConnection#getFrom()
     * @see #getRosConnection()
     * @generated
     */
    EReference getRosConnection_From();

    /**
     * Returns the meta object for the reference '{@link system.RosConnection#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see system.RosConnection#getTo()
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
         * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCESS__NODES = eINSTANCE.getProcess_Nodes();

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
         * The meta object literal for the '{@link system.impl.RosServerClientReferenceImpl <em>Ros Server Client Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosServerClientReferenceImpl
         * @see system.impl.RossystemPackageImpl#getRosServerClientReference()
         * @generated
         */
        EClass ROS_SERVER_CLIENT_REFERENCE = eINSTANCE.getRosServerClientReference();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_SERVER_CLIENT_REFERENCE__FROM = eINSTANCE.getRosServerClientReference_From();

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
         * The meta object literal for the '{@link system.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see system.impl.RosConnectionImpl
         * @see system.impl.RossystemPackageImpl#getRosConnection()
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
