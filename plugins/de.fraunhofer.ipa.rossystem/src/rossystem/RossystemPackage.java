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
     * The feature id for the '<em><b>Process</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SYSTEM__PROCESS = 1;

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
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_SYSTEM__PARAMETER = 4;

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
    int ROS_NODE = 2;

    /**
     * The meta object id for the '{@link rossystem.impl.RosParameterImpl <em>Ros Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosParameterImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosParameter()
     * @generated
     */
    int ROS_PARAMETER = 12;

    /**
     * The meta object id for the '{@link rossystem.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.ProcessImpl
     * @see rossystem.impl.RossystemPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 1;

    /**
     * The meta object id for the '{@link rossystem.impl.RosInterfaceImpl <em>Ros Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosInterfaceImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosInterface()
     * @generated
     */
    int ROS_INTERFACE = 3;

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
     * The feature id for the '<em><b>Rosparameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE__ROSPARAMETERS = 3;

    /**
     * The number of structural features of the '<em>Ros Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Ros Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROS_NODE_OPERATION_COUNT = 0;

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
    int INTERFACE_REFERENCE = 4;

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
    int ROS_PUBLISHER_REFERENCE = 5;

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
    int ROS_SUBSCRIBER_REFERENCE = 6;

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
     * The meta object id for the '{@link rossystem.impl.RosServiceServerReferenceImpl <em>Ros Service Server Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosServiceServerReferenceImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosServiceServerReference()
     * @generated
     */
    int ROS_SERVICE_SERVER_REFERENCE = 7;

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
     * The meta object id for the '{@link rossystem.impl.RosServerClientReferenceImpl <em>Ros Server Client Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosServerClientReferenceImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosServerClientReference()
     * @generated
     */
    int ROS_SERVER_CLIENT_REFERENCE = 8;

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
     * The meta object id for the '{@link rossystem.impl.RosActionServerReferenceImpl <em>Ros Action Server Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosActionServerReferenceImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosActionServerReference()
     * @generated
     */
    int ROS_ACTION_SERVER_REFERENCE = 9;

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
     * The meta object id for the '{@link rossystem.impl.RosActionClientReferenceImpl <em>Ros Action Client Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosActionClientReferenceImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosActionClientReference()
     * @generated
     */
    int ROS_ACTION_CLIENT_REFERENCE = 10;

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
     * The meta object id for the '{@link rossystem.impl.RosConnectionImpl <em>Ros Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosConnectionImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosConnection()
     * @generated
     */
    int ROS_CONNECTION = 13;

    /**
     * The meta object id for the '{@link rossystem.impl.RosParameterReferenceImpl <em>Ros Parameter Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rossystem.impl.RosParameterReferenceImpl
     * @see rossystem.impl.RossystemPackageImpl#getRosParameterReference()
     * @generated
     */
    int ROS_PARAMETER_REFERENCE = 11;

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
     * Returns the meta object for the containment reference list '{@link rossystem.RosNode#getRosparameters <em>Rosparameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rosparameters</em>'.
     * @see rossystem.RosNode#getRosparameters()
     * @see #getRosNode()
     * @generated
     */
    EReference getRosNode_Rosparameters();

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
     * Returns the meta object for the attribute '{@link rossystem.RosParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see rossystem.RosParameter#getName()
     * @see #getRosParameter()
     * @generated
     */
    EAttribute getRosParameter_Name();

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
     * Returns the meta object for class '{@link rossystem.RosServiceServerReference <em>Ros Service Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Service Server Reference</em>'.
     * @see rossystem.RosServiceServerReference
     * @generated
     */
    EClass getRosServiceServerReference();

    /**
     * Returns the meta object for the reference '{@link rossystem.RosServiceServerReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see rossystem.RosServiceServerReference#getFrom()
     * @see #getRosServiceServerReference()
     * @generated
     */
    EReference getRosServiceServerReference_From();

    /**
     * Returns the meta object for class '{@link rossystem.RosServerClientReference <em>Ros Server Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Server Client Reference</em>'.
     * @see rossystem.RosServerClientReference
     * @generated
     */
    EClass getRosServerClientReference();

    /**
     * Returns the meta object for the reference '{@link rossystem.RosServerClientReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see rossystem.RosServerClientReference#getFrom()
     * @see #getRosServerClientReference()
     * @generated
     */
    EReference getRosServerClientReference_From();

    /**
     * Returns the meta object for class '{@link rossystem.RosActionServerReference <em>Ros Action Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Action Server Reference</em>'.
     * @see rossystem.RosActionServerReference
     * @generated
     */
    EClass getRosActionServerReference();

    /**
     * Returns the meta object for the reference '{@link rossystem.RosActionServerReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see rossystem.RosActionServerReference#getFrom()
     * @see #getRosActionServerReference()
     * @generated
     */
    EReference getRosActionServerReference_From();

    /**
     * Returns the meta object for class '{@link rossystem.RosActionClientReference <em>Ros Action Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Action Client Reference</em>'.
     * @see rossystem.RosActionClientReference
     * @generated
     */
    EClass getRosActionClientReference();

    /**
     * Returns the meta object for the reference '{@link rossystem.RosActionClientReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see rossystem.RosActionClientReference#getFrom()
     * @see #getRosActionClientReference()
     * @generated
     */
    EReference getRosActionClientReference_From();

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
     * Returns the meta object for class '{@link rossystem.RosParameterReference <em>Ros Parameter Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ros Parameter Reference</em>'.
     * @see rossystem.RosParameterReference
     * @generated
     */
    EClass getRosParameterReference();

    /**
     * Returns the meta object for the reference '{@link rossystem.RosParameterReference#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see rossystem.RosParameterReference#getFrom()
     * @see #getRosParameterReference()
     * @generated
     */
    EReference getRosParameterReference_From();

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
         * The meta object literal for the '<em><b>Rosparameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ROS_NODE__ROSPARAMETERS = eINSTANCE.getRosNode_Rosparameters();

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
         * The meta object literal for the '{@link rossystem.impl.RosServiceServerReferenceImpl <em>Ros Service Server Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rossystem.impl.RosServiceServerReferenceImpl
         * @see rossystem.impl.RossystemPackageImpl#getRosServiceServerReference()
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
         * The meta object literal for the '{@link rossystem.impl.RosServerClientReferenceImpl <em>Ros Server Client Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rossystem.impl.RosServerClientReferenceImpl
         * @see rossystem.impl.RossystemPackageImpl#getRosServerClientReference()
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
         * The meta object literal for the '{@link rossystem.impl.RosActionServerReferenceImpl <em>Ros Action Server Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rossystem.impl.RosActionServerReferenceImpl
         * @see rossystem.impl.RossystemPackageImpl#getRosActionServerReference()
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
         * The meta object literal for the '{@link rossystem.impl.RosActionClientReferenceImpl <em>Ros Action Client Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rossystem.impl.RosActionClientReferenceImpl
         * @see rossystem.impl.RossystemPackageImpl#getRosActionClientReference()
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

        /**
         * The meta object literal for the '{@link rossystem.impl.RosParameterReferenceImpl <em>Ros Parameter Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see rossystem.impl.RosParameterReferenceImpl
         * @see rossystem.impl.RossystemPackageImpl#getRosParameterReference()
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

    }

} //RossystemPackage
