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
	 * The meta object id for the '{@link componentInterface.impl.RemapPubImpl <em>Remap Pub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RemapPubImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapPub()
	 * @generated
	 */
	int REMAP_PUB = 1;

	/**
	 * The feature id for the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_PUB__TOPIC_REF = 0;

	/**
	 * The feature id for the '<em><b>Remap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_PUB__REMAP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_PUB__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Remap Pub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_PUB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Remap Pub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_PUB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RemapSubImpl <em>Remap Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RemapSubImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapSub()
	 * @generated
	 */
	int REMAP_SUB = 2;

	/**
	 * The feature id for the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SUB__TOPIC_REF = 0;

	/**
	 * The feature id for the '<em><b>Remap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SUB__REMAP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SUB__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Remap Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SUB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Remap Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SUB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RemapSrvServImpl <em>Remap Srv Serv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RemapSrvServImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapSrvServ()
	 * @generated
	 */
	int REMAP_SRV_SERV = 3;

	/**
	 * The feature id for the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_SERV__SRV_REF = 0;

	/**
	 * The feature id for the '<em><b>Remap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_SERV__REMAP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_SERV__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Remap Srv Serv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_SERV_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Remap Srv Serv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_SERV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentInterface.impl.RemapSrvCliImpl <em>Remap Srv Cli</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentInterface.impl.RemapSrvCliImpl
	 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapSrvCli()
	 * @generated
	 */
	int REMAP_SRV_CLI = 4;

	/**
	 * The feature id for the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_CLI__SRV_REF = 0;

	/**
	 * The feature id for the '<em><b>Remap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_CLI__REMAP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_CLI__NAME_SPACE = 2;

	/**
	 * The number of structural features of the '<em>Remap Srv Cli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_CLI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Remap Srv Cli</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_SRV_CLI_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link componentInterface.RemapPub <em>Remap Pub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap Pub</em>'.
	 * @see componentInterface.RemapPub
	 * @generated
	 */
	EClass getRemapPub();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapPub#getTopicRef <em>Topic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Ref</em>'.
	 * @see componentInterface.RemapPub#getTopicRef()
	 * @see #getRemapPub()
	 * @generated
	 */
	EReference getRemapPub_TopicRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RemapPub#getRemapName <em>Remap Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remap Name</em>'.
	 * @see componentInterface.RemapPub#getRemapName()
	 * @see #getRemapPub()
	 * @generated
	 */
	EAttribute getRemapPub_RemapName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapPub#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RemapPub#getNameSpace()
	 * @see #getRemapPub()
	 * @generated
	 */
	EReference getRemapPub_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.RemapSub <em>Remap Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap Sub</em>'.
	 * @see componentInterface.RemapSub
	 * @generated
	 */
	EClass getRemapSub();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapSub#getTopicRef <em>Topic Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Ref</em>'.
	 * @see componentInterface.RemapSub#getTopicRef()
	 * @see #getRemapSub()
	 * @generated
	 */
	EReference getRemapSub_TopicRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RemapSub#getRemapName <em>Remap Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remap Name</em>'.
	 * @see componentInterface.RemapSub#getRemapName()
	 * @see #getRemapSub()
	 * @generated
	 */
	EAttribute getRemapSub_RemapName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapSub#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RemapSub#getNameSpace()
	 * @see #getRemapSub()
	 * @generated
	 */
	EReference getRemapSub_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.RemapSrvServ <em>Remap Srv Serv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap Srv Serv</em>'.
	 * @see componentInterface.RemapSrvServ
	 * @generated
	 */
	EClass getRemapSrvServ();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapSrvServ#getSrvRef <em>Srv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Ref</em>'.
	 * @see componentInterface.RemapSrvServ#getSrvRef()
	 * @see #getRemapSrvServ()
	 * @generated
	 */
	EReference getRemapSrvServ_SrvRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RemapSrvServ#getRemapName <em>Remap Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remap Name</em>'.
	 * @see componentInterface.RemapSrvServ#getRemapName()
	 * @see #getRemapSrvServ()
	 * @generated
	 */
	EAttribute getRemapSrvServ_RemapName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapSrvServ#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RemapSrvServ#getNameSpace()
	 * @see #getRemapSrvServ()
	 * @generated
	 */
	EReference getRemapSrvServ_NameSpace();

	/**
	 * Returns the meta object for class '{@link componentInterface.RemapSrvCli <em>Remap Srv Cli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap Srv Cli</em>'.
	 * @see componentInterface.RemapSrvCli
	 * @generated
	 */
	EClass getRemapSrvCli();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapSrvCli#getSrvRef <em>Srv Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srv Ref</em>'.
	 * @see componentInterface.RemapSrvCli#getSrvRef()
	 * @see #getRemapSrvCli()
	 * @generated
	 */
	EReference getRemapSrvCli_SrvRef();

	/**
	 * Returns the meta object for the attribute '{@link componentInterface.RemapSrvCli#getRemapName <em>Remap Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remap Name</em>'.
	 * @see componentInterface.RemapSrvCli#getRemapName()
	 * @see #getRemapSrvCli()
	 * @generated
	 */
	EAttribute getRemapSrvCli_RemapName();

	/**
	 * Returns the meta object for the reference '{@link componentInterface.RemapSrvCli#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Space</em>'.
	 * @see componentInterface.RemapSrvCli#getNameSpace()
	 * @see #getRemapSrvCli()
	 * @generated
	 */
	EReference getRemapSrvCli_NameSpace();

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
		 * The meta object literal for the '{@link componentInterface.impl.RemapPubImpl <em>Remap Pub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RemapPubImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapPub()
		 * @generated
		 */
		EClass REMAP_PUB = eINSTANCE.getRemapPub();

		/**
		 * The meta object literal for the '<em><b>Topic Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_PUB__TOPIC_REF = eINSTANCE.getRemapPub_TopicRef();

		/**
		 * The meta object literal for the '<em><b>Remap Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP_PUB__REMAP_NAME = eINSTANCE.getRemapPub_RemapName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_PUB__NAME_SPACE = eINSTANCE.getRemapPub_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RemapSubImpl <em>Remap Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RemapSubImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapSub()
		 * @generated
		 */
		EClass REMAP_SUB = eINSTANCE.getRemapSub();

		/**
		 * The meta object literal for the '<em><b>Topic Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_SUB__TOPIC_REF = eINSTANCE.getRemapSub_TopicRef();

		/**
		 * The meta object literal for the '<em><b>Remap Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP_SUB__REMAP_NAME = eINSTANCE.getRemapSub_RemapName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_SUB__NAME_SPACE = eINSTANCE.getRemapSub_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RemapSrvServImpl <em>Remap Srv Serv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RemapSrvServImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapSrvServ()
		 * @generated
		 */
		EClass REMAP_SRV_SERV = eINSTANCE.getRemapSrvServ();

		/**
		 * The meta object literal for the '<em><b>Srv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_SRV_SERV__SRV_REF = eINSTANCE.getRemapSrvServ_SrvRef();

		/**
		 * The meta object literal for the '<em><b>Remap Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP_SRV_SERV__REMAP_NAME = eINSTANCE.getRemapSrvServ_RemapName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_SRV_SERV__NAME_SPACE = eINSTANCE.getRemapSrvServ_NameSpace();

		/**
		 * The meta object literal for the '{@link componentInterface.impl.RemapSrvCliImpl <em>Remap Srv Cli</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentInterface.impl.RemapSrvCliImpl
		 * @see componentInterface.impl.ComponentInterfacePackageImpl#getRemapSrvCli()
		 * @generated
		 */
		EClass REMAP_SRV_CLI = eINSTANCE.getRemapSrvCli();

		/**
		 * The meta object literal for the '<em><b>Srv Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_SRV_CLI__SRV_REF = eINSTANCE.getRemapSrvCli_SrvRef();

		/**
		 * The meta object literal for the '<em><b>Remap Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP_SRV_CLI__REMAP_NAME = eINSTANCE.getRemapSrvCli_RemapName();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMAP_SRV_CLI__NAME_SPACE = eINSTANCE.getRemapSrvCli_NameSpace();

	}

} //ComponentInterfacePackage
