/**
 */
package rossystem;

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
	 * The feature id for the '<em><b>Ros Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ROS_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Topic Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__TOPIC_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Service Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__SERVICE_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__NAME = 3;

	/**
	 * The number of structural features of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.TopicConnectionImpl <em>Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.TopicConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getTopicConnection()
	 * @generated
	 */
	int TOPIC_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__TO = 1;

	/**
	 * The number of structural features of the '<em>Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.ServiceConnectionImpl <em>Service Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ServiceConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getServiceConnection()
	 * @generated
	 */
	int SERVICE_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__TO = 1;

	/**
	 * The number of structural features of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.RosComponentImpl <em>Ros Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.RosComponentImpl
	 * @see rossystem.impl.RossystemPackageImpl#getRosComponent()
	 * @generated
	 */
	int ROS_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPONENT__NAMESPACE = RosPackage.NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPONENT__NAME = RosPackage.NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ros Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPONENT__ROS_NODE = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ros Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPONENT_FEATURE_COUNT = RosPackage.NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ros Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_COMPONENT_OPERATION_COUNT = RosPackage.NAMESPACED_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getRosComponent <em>Ros Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Component</em>'.
	 * @see rossystem.RosSystem#getRosComponent()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_RosComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getTopicConnections <em>Topic Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic Connections</em>'.
	 * @see rossystem.RosSystem#getTopicConnections()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_TopicConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getServiceConnections <em>Service Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Connections</em>'.
	 * @see rossystem.RosSystem#getServiceConnections()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_ServiceConnections();

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
	 * Returns the meta object for class '{@link rossystem.RosComponent <em>Ros Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Component</em>'.
	 * @see rossystem.RosComponent
	 * @generated
	 */
	EClass getRosComponent();

	/**
	 * Returns the meta object for the containment reference '{@link rossystem.RosComponent#getRosNode <em>Ros Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ros Node</em>'.
	 * @see rossystem.RosComponent#getRosNode()
	 * @see #getRosComponent()
	 * @generated
	 */
	EReference getRosComponent_RosNode();

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
		 * The meta object literal for the '<em><b>Ros Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ROS_COMPONENT = eINSTANCE.getRosSystem_RosComponent();

		/**
		 * The meta object literal for the '<em><b>Topic Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__TOPIC_CONNECTIONS = eINSTANCE.getRosSystem_TopicConnections();

		/**
		 * The meta object literal for the '<em><b>Service Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__SERVICE_CONNECTIONS = eINSTANCE.getRosSystem_ServiceConnections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SYSTEM__NAME = eINSTANCE.getRosSystem_Name();

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
		 * The meta object literal for the '{@link rossystem.impl.RosComponentImpl <em>Ros Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.RosComponentImpl
		 * @see rossystem.impl.RossystemPackageImpl#getRosComponent()
		 * @generated
		 */
		EClass ROS_COMPONENT = eINSTANCE.getRosComponent();

		/**
		 * The meta object literal for the '<em><b>Ros Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_COMPONENT__ROS_NODE = eINSTANCE.getRosComponent_RosNode();

	}

} //RossystemPackage
