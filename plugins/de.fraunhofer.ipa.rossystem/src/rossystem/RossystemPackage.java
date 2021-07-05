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
	 * The feature id for the '<em><b>Action Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ACTION_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Component Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__COMPONENT_STACK = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Ros Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ROS_COMPONENT = 6;

	/**
	 * The number of structural features of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.ComponentStackImpl <em>Component Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ComponentStackImpl
	 * @see rossystem.impl.RossystemPackageImpl#getComponentStack()
	 * @generated
	 */
	int COMPONENT_STACK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ros Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STACK__ROS_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Quality Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STACK__QUALITY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Component Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STACK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_STACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.QualityAttributeImpl <em>Quality Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.QualityAttributeImpl
	 * @see rossystem.impl.RossystemPackageImpl#getQualityAttribute()
	 * @generated
	 */
	int QUALITY_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Quality Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Quality Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rossystem.impl.TopicConnectionImpl <em>Topic Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.TopicConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getTopicConnection()
	 * @generated
	 */
	int TOPIC_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__TO = 1;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION__TOPIC_NAME = 2;

	/**
	 * The number of structural features of the '<em>Topic Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_CONNECTION_FEATURE_COUNT = 3;

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
	int SERVICE_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
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
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION__SERVICE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link rossystem.impl.ActionConnectionImpl <em>Action Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rossystem.impl.ActionConnectionImpl
	 * @see rossystem.impl.RossystemPackageImpl#getActionConnection()
	 * @generated
	 */
	int ACTION_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION__TO = 1;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION__ACTION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CONNECTION_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getComponentStack <em>Component Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Stack</em>'.
	 * @see rossystem.RosSystem#getComponentStack()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_ComponentStack();

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
	 * Returns the meta object for class '{@link rossystem.ComponentStack <em>Component Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Stack</em>'.
	 * @see rossystem.ComponentStack
	 * @generated
	 */
	EClass getComponentStack();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.ComponentStack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.ComponentStack#getName()
	 * @see #getComponentStack()
	 * @generated
	 */
	EAttribute getComponentStack_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.ComponentStack#getRosComponent <em>Ros Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ros Component</em>'.
	 * @see rossystem.ComponentStack#getRosComponent()
	 * @see #getComponentStack()
	 * @generated
	 */
	EReference getComponentStack_RosComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link rossystem.ComponentStack#getQualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quality Attribute</em>'.
	 * @see rossystem.ComponentStack#getQualityAttribute()
	 * @see #getComponentStack()
	 * @generated
	 */
	EReference getComponentStack_QualityAttribute();

	/**
	 * Returns the meta object for class '{@link rossystem.QualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Attribute</em>'.
	 * @see rossystem.QualityAttribute
	 * @generated
	 */
	EClass getQualityAttribute();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.QualityAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rossystem.QualityAttribute#getName()
	 * @see #getQualityAttribute()
	 * @generated
	 */
	EAttribute getQualityAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rossystem.QualityAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see rossystem.QualityAttribute#getType()
	 * @see #getQualityAttribute()
	 * @generated
	 */
	EReference getQualityAttribute_Type();

	/**
	 * Returns the meta object for the containment reference '{@link rossystem.QualityAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rossystem.QualityAttribute#getValue()
	 * @see #getQualityAttribute()
	 * @generated
	 */
	EReference getQualityAttribute_Value();

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
	 * Returns the meta object for the containment reference list '{@link rossystem.RosSystem#getActionConnections <em>Action Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Connections</em>'.
	 * @see rossystem.RosSystem#getActionConnections()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_ActionConnections();

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
	 * Returns the meta object for the reference list '{@link rossystem.TopicConnection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see rossystem.TopicConnection#getFrom()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EReference getTopicConnection_From();

	/**
	 * Returns the meta object for the reference list '{@link rossystem.TopicConnection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see rossystem.TopicConnection#getTo()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EReference getTopicConnection_To();

	/**
	 * Returns the meta object for the attribute '{@link rossystem.TopicConnection#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see rossystem.TopicConnection#getTopicName()
	 * @see #getTopicConnection()
	 * @generated
	 */
	EAttribute getTopicConnection_TopicName();

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
	 * Returns the meta object for the reference list '{@link rossystem.ServiceConnection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
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
	 * Returns the meta object for the attribute '{@link rossystem.ServiceConnection#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see rossystem.ServiceConnection#getServiceName()
	 * @see #getServiceConnection()
	 * @generated
	 */
	EAttribute getServiceConnection_ServiceName();

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
	 * Returns the meta object for the attribute '{@link rossystem.ActionConnection#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see rossystem.ActionConnection#getActionName()
	 * @see #getActionConnection()
	 * @generated
	 */
	EAttribute getActionConnection_ActionName();

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
		 * The meta object literal for the '<em><b>Component Stack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__COMPONENT_STACK = eINSTANCE.getRosSystem_ComponentStack();

		/**
		 * The meta object literal for the '<em><b>Ros Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ROS_COMPONENT = eINSTANCE.getRosSystem_RosComponent();

		/**
		 * The meta object literal for the '{@link rossystem.impl.ComponentStackImpl <em>Component Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.ComponentStackImpl
		 * @see rossystem.impl.RossystemPackageImpl#getComponentStack()
		 * @generated
		 */
		EClass COMPONENT_STACK = eINSTANCE.getComponentStack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_STACK__NAME = eINSTANCE.getComponentStack_Name();

		/**
		 * The meta object literal for the '<em><b>Ros Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STACK__ROS_COMPONENT = eINSTANCE.getComponentStack_RosComponent();

		/**
		 * The meta object literal for the '<em><b>Quality Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_STACK__QUALITY_ATTRIBUTE = eINSTANCE.getComponentStack_QualityAttribute();

		/**
		 * The meta object literal for the '{@link rossystem.impl.QualityAttributeImpl <em>Quality Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rossystem.impl.QualityAttributeImpl
		 * @see rossystem.impl.RossystemPackageImpl#getQualityAttribute()
		 * @generated
		 */
		EClass QUALITY_ATTRIBUTE = eINSTANCE.getQualityAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ATTRIBUTE__NAME = eINSTANCE.getQualityAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ATTRIBUTE__TYPE = eINSTANCE.getQualityAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ATTRIBUTE__VALUE = eINSTANCE.getQualityAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__PARAMETER = eINSTANCE.getRosSystem_Parameter();

		/**
		 * The meta object literal for the '<em><b>Action Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ACTION_CONNECTIONS = eINSTANCE.getRosSystem_ActionConnections();

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
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_CONNECTION__FROM = eINSTANCE.getTopicConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_CONNECTION__TO = eINSTANCE.getTopicConnection_To();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_CONNECTION__TOPIC_NAME = eINSTANCE.getTopicConnection_TopicName();

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
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONNECTION__SERVICE_NAME = eINSTANCE.getServiceConnection_ServiceName();

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
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CONNECTION__ACTION_NAME = eINSTANCE.getActionConnection_ActionName();

	}

} //RossystemPackage
