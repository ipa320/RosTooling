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
	 * The feature id for the '<em><b>Topic Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__TOPIC_CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Service Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__SERVICE_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Ros Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ROS_COMPONENT = 3;

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
	 * The feature id for the '<em><b>From Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__FROM_TOPIC = 0;

	/**
	 * The feature id for the '<em><b>To Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__TO_TOPIC = 1;

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
	 * The feature id for the '<em><b>From Srv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__FROM_SRV = 0;

	/**
	 * The feature id for the '<em><b>To Srv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__TO_SRV = 1;

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
	 * Returns the meta object for class '{@link rossystem.RosSystem <em>Ros System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros System</em>'.
	 * @see rossystem.RosSystem
	 * @generated
	 */
	EClass getRosSystem();

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
	 * Returns the meta object for the reference list '{@link rossystem.RosSystem#getRosComponent <em>Ros Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ros Component</em>'.
	 * @see rossystem.RosSystem#getRosComponent()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_RosComponent();

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
	 * Returns the meta object for the reference '{@link rossystem.TopicConnection#getFromTopic <em>From Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Topic</em>'.
	 * @see rossystem.TopicConnection#getFromTopic()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EReference getTopicConnection_FromTopic();

	/**
	 * Returns the meta object for the reference '{@link rossystem.TopicConnection#getToTopic <em>To Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Topic</em>'.
	 * @see rossystem.TopicConnection#getToTopic()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EReference getTopicConnection_ToTopic();

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
	 * Returns the meta object for the reference '{@link rossystem.ServiceConnection#getFromSrv <em>From Srv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Srv</em>'.
	 * @see rossystem.ServiceConnection#getFromSrv()
	 * @see #getServiceConnection()
	 * @generated
	 */
	EReference getServiceConnection_FromSrv();

	/**
	 * Returns the meta object for the reference '{@link rossystem.ServiceConnection#getToSrv <em>To Srv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Srv</em>'.
	 * @see rossystem.ServiceConnection#getToSrv()
	 * @see #getServiceConnection()
	 * @generated
	 */
	EReference getServiceConnection_ToSrv();

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
		 * The meta object literal for the '<em><b>Ros Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ROS_COMPONENT = eINSTANCE.getRosSystem_RosComponent();

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
		 * The meta object literal for the '<em><b>From Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_CONNECTION__FROM_TOPIC = eINSTANCE.getTopicConnection_FromTopic();

		/**
		 * The meta object literal for the '<em><b>To Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_CONNECTION__TO_TOPIC = eINSTANCE.getTopicConnection_ToTopic();

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
		 * The meta object literal for the '<em><b>From Srv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTION__FROM_SRV = eINSTANCE.getServiceConnection_FromSrv();

		/**
		 * The meta object literal for the '<em><b>To Srv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTION__TO_SRV = eINSTANCE.getServiceConnection_ToSrv();

	}

} //RossystemPackage
