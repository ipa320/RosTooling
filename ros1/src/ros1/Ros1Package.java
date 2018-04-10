/**
 */
package ros1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see ros1.Ros1Factory
 * @model kind="package"
 * @generated
 */
public interface Ros1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ros1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ros1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ros1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ros1Package eINSTANCE = ros1.impl.Ros1PackageImpl.init();

	/**
	 * The meta object id for the '{@link ros1.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.NodeImpl
	 * @see ros1.impl.Ros1PackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Serviceserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SERVICESERVER = 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBER = 2;

	/**
	 * The feature id for the '<em><b>Serviceclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SERVICECLIENT = 3;

	/**
	 * The feature id for the '<em><b>Actionserver</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ACTIONSERVER = 4;

	/**
	 * The feature id for the '<em><b>Actionclient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ACTIONCLIENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETER = 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ModelImpl
	 * @see ros1.impl.Ros1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SPEC = 1;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARTIFACT = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.SpecBaseImpl <em>Spec Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.SpecBaseImpl
	 * @see ros1.impl.Ros1PackageImpl#getSpecBase()
	 * @generated
	 */
	int SPEC_BASE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE__FULLNAME = 2;

	/**
	 * The number of structural features of the '<em>Spec Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Spec Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ServiceSpecImpl
	 * @see ros1.impl.Ros1PackageImpl#getServiceSpec()
	 * @generated
	 */
	int SERVICE_SPEC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__NAME = SPEC_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__PACKAGE = SPEC_BASE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__FULLNAME = SPEC_BASE__FULLNAME;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__REQUEST = SPEC_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__RESPONSE = SPEC_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC_FEATURE_COUNT = SPEC_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC_OPERATION_COUNT = SPEC_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.NamespacedElementImpl <em>Namespaced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.NamespacedElementImpl
	 * @see ros1.impl.Ros1PackageImpl#getNamespacedElement()
	 * @generated
	 */
	int NAMESPACED_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_ELEMENT__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Namespaced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Namespaced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ServiceServerImpl <em>Service Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ServiceServerImpl
	 * @see ros1.impl.Ros1PackageImpl#getServiceServer()
	 * @generated
	 */
	int SERVICE_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER__SERVICE = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SERVER_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.TopicSpecImpl <em>Topic Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.TopicSpecImpl
	 * @see ros1.impl.Ros1PackageImpl#getTopicSpec()
	 * @generated
	 */
	int TOPIC_SPEC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__NAME = SPEC_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__PACKAGE = SPEC_BASE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__FULLNAME = SPEC_BASE__FULLNAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__MESSAGE = SPEC_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topic Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_FEATURE_COUNT = SPEC_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Topic Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_OPERATION_COUNT = SPEC_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.PublisherImpl
	 * @see ros1.impl.Ros1PackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 5;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__MESSAGE = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ArtifactImpl
	 * @see ros1.impl.Ros1PackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NODE = 1;

	/**
	 * The feature id for the '<em><b>Build depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__BUILD_DEPEND = 2;

	/**
	 * The feature id for the '<em><b>Exec depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXEC_DEPEND = 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.SubscriberImpl
	 * @see ros1.impl.Ros1PackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 8;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__MESSAGE = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ServiceClientImpl <em>Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ServiceClientImpl
	 * @see ros1.impl.Ros1PackageImpl#getServiceClient()
	 * @generated
	 */
	int SERVICE_CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT__SERVICE = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLIENT_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.PackageSetImpl <em>Package Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.PackageSetImpl
	 * @see ros1.impl.Ros1PackageImpl#getPackageSet()
	 * @generated
	 */
	int PACKAGE_SET = 10;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SET__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Package Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Package Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ActionSpecImpl <em>Action Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ActionSpecImpl
	 * @see ros1.impl.Ros1PackageImpl#getActionSpec()
	 * @generated
	 */
	int ACTION_SPEC = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__NAME = SPEC_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__PACKAGE = SPEC_BASE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__FULLNAME = SPEC_BASE__FULLNAME;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__GOAL = SPEC_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__RESULT = SPEC_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__FEEDBACK = SPEC_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC_FEATURE_COUNT = SPEC_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC_OPERATION_COUNT = SPEC_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ActionServerImpl <em>Action Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ActionServerImpl
	 * @see ros1.impl.Ros1PackageImpl#getActionServer()
	 * @generated
	 */
	int ACTION_SERVER = 12;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER__ACTION = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SERVER_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ActionClientImpl <em>Action Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ActionClientImpl
	 * @see ros1.impl.Ros1PackageImpl#getActionClient()
	 * @generated
	 */
	int ACTION_CLIENT = 13;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT__ACTION = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLIENT_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.MessageDefinitionImpl
	 * @see ros1.impl.Ros1PackageImpl#getMessageDefinition()
	 * @generated
	 */
	int MESSAGE_DEFINITION = 14;

	/**
	 * The number of structural features of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.NamespaceImpl
	 * @see ros1.impl.Ros1PackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 15;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PARTS = 0;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.GlobalNamespaceImpl <em>Global Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.GlobalNamespaceImpl
	 * @see ros1.impl.Ros1PackageImpl#getGlobalNamespace()
	 * @generated
	 */
	int GLOBAL_NAMESPACE = 16;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_NAMESPACE__PARTS = NAMESPACE__PARTS;

	/**
	 * The number of structural features of the '<em>Global Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_NAMESPACE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_NAMESPACE_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.RelativeNamespaceImpl <em>Relative Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.RelativeNamespaceImpl
	 * @see ros1.impl.Ros1PackageImpl#getRelativeNamespace()
	 * @generated
	 */
	int RELATIVE_NAMESPACE = 17;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_NAMESPACE__PARTS = NAMESPACE__PARTS;

	/**
	 * The number of structural features of the '<em>Relative Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_NAMESPACE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relative Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_NAMESPACE_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.PrivateNamespaceImpl <em>Private Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.PrivateNamespaceImpl
	 * @see ros1.impl.Ros1PackageImpl#getPrivateNamespace()
	 * @generated
	 */
	int PRIVATE_NAMESPACE = 18;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_NAMESPACE__PARTS = RELATIVE_NAMESPACE__PARTS;

	/**
	 * The number of structural features of the '<em>Private Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_NAMESPACE_FEATURE_COUNT = RELATIVE_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_NAMESPACE_OPERATION_COUNT = RELATIVE_NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterListTypeImpl <em>Parameter List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterListTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterListType()
	 * @generated
	 */
	int PARAMETER_LIST_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_TYPE__SEQUENCE = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterStructTypeImpl <em>Parameter Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterStructTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterStructType()
	 * @generated
	 */
	int PARAMETER_STRUCT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Parameterstructypetmember</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterIntegerTypeImpl <em>Parameter Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterIntegerTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterIntegerType()
	 * @generated
	 */
	int PARAMETER_INTEGER_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterStringTypeImpl <em>Parameter String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterStringTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterStringType()
	 * @generated
	 */
	int PARAMETER_STRING_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterDoubleTypeImpl <em>Parameter Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterDoubleTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterDoubleType()
	 * @generated
	 */
	int PARAMETER_DOUBLE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAMESPACE = NAMESPACED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMESPACED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMESPACED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterDateTypeImpl <em>Parameter Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterDateTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterDateType()
	 * @generated
	 */
	int PARAMETER_DATE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DATE_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DATE_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DATE_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterBooleanTypeImpl <em>Parameter Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterBooleanTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterBooleanType()
	 * @generated
	 */
	int PARAMETER_BOOLEAN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterBase64TypeImpl <em>Parameter Base64 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterBase64TypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterBase64Type()
	 * @generated
	 */
	int PARAMETER_BASE64_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE64_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Base64 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE64_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Base64 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE64_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterAnyTypeImpl <em>Parameter Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterAnyTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterAnyType()
	 * @generated
	 */
	int PARAMETER_ANY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANY_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANY_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANY_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterStructTypeMemberImpl <em>Parameter Struct Type Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterStructTypeMemberImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterStructTypeMember()
	 * @generated
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER__DEFAULT = 2;

	/**
	 * The number of structural features of the '<em>Parameter Struct Type Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter Struct Type Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterArrayTypeImpl <em>Parameter Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterArrayTypeImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterArrayType()
	 * @generated
	 */
	int PARAMETER_ARRAY_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_TYPE__TYPE = PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_TYPE__DEFAULT = PARAMETER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_TYPE_FEATURE_COUNT = PARAMETER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ARRAY_TYPE_OPERATION_COUNT = PARAMETER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterValueImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 33;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterAnyImpl <em>Parameter Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterAnyImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterAny()
	 * @generated
	 */
	int PARAMETER_ANY = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANY__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANY_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ANY_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterStringImpl <em>Parameter String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterStringImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterString()
	 * @generated
	 */
	int PARAMETER_STRING = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRING_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterBase64Impl <em>Parameter Base64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterBase64Impl
	 * @see ros1.impl.Ros1PackageImpl#getParameterBase64()
	 * @generated
	 */
	int PARAMETER_BASE64 = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE64__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE64_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BASE64_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterIntegerImpl <em>Parameter Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterIntegerImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterInteger()
	 * @generated
	 */
	int PARAMETER_INTEGER = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INTEGER_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterDoubleImpl <em>Parameter Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterDoubleImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterDouble()
	 * @generated
	 */
	int PARAMETER_DOUBLE = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOUBLE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterBooleanImpl <em>Parameter Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterBooleanImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterBoolean()
	 * @generated
	 */
	int PARAMETER_BOOLEAN = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BOOLEAN_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterSequenceImpl <em>Parameter Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterSequenceImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterSequence()
	 * @generated
	 */
	int PARAMETER_SEQUENCE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEQUENCE__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEQUENCE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SEQUENCE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterStructImpl <em>Parameter Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterStructImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterStruct()
	 * @generated
	 */
	int PARAMETER_STRUCT = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterStructMemberImpl <em>Parameter Struct Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterStructMemberImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterStructMember()
	 * @generated
	 */
	int PARAMETER_STRUCT_MEMBER = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_MEMBER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_MEMBER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_STRUCT_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros1.impl.ParameterDateImpl <em>Parameter Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros1.impl.ParameterDateImpl
	 * @see ros1.impl.Ros1PackageImpl#getParameterDate()
	 * @generated
	 */
	int PARAMETER_DATE = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DATE__VALUE = PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DATE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DATE_OPERATION_COUNT = PARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Graph Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ros1.impl.Ros1PackageImpl#getGraphName()
	 * @generated
	 */
	int GRAPH_NAME = 44;


	/**
	 * Returns the meta object for class '{@link ros1.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ros1.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getServiceserver <em>Serviceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceserver</em>'.
	 * @see ros1.Node#getServiceserver()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Serviceserver();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see ros1.Node#getPublisher()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriber</em>'.
	 * @see ros1.Node#getSubscriber()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getServiceclient <em>Serviceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceclient</em>'.
	 * @see ros1.Node#getServiceclient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Serviceclient();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getActionserver <em>Actionserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionserver</em>'.
	 * @see ros1.Node#getActionserver()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Actionserver();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getActionclient <em>Actionclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionclient</em>'.
	 * @see ros1.Node#getActionclient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Actionclient();

	/**
	 * Returns the meta object for the attribute '{@link ros1.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Node#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see ros1.Node#getParameter()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameter();

	/**
	 * Returns the meta object for class '{@link ros1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ros1.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link ros1.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Model#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec</em>'.
	 * @see ros1.Model#getSpec()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Spec();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Model#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see ros1.Model#getArtifact()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Artifact();

	/**
	 * Returns the meta object for class '{@link ros1.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Spec</em>'.
	 * @see ros1.ServiceSpec
	 * @generated
	 */
	EClass getServiceSpec();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ServiceSpec#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see ros1.ServiceSpec#getRequest()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Request();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ServiceSpec#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see ros1.ServiceSpec#getResponse()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Response();

	/**
	 * Returns the meta object for class '{@link ros1.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Server</em>'.
	 * @see ros1.ServiceServer
	 * @generated
	 */
	EClass getServiceServer();

	/**
	 * Returns the meta object for the reference '{@link ros1.ServiceServer#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see ros1.ServiceServer#getService()
	 * @see #getServiceServer()
	 * @generated
	 */
	EReference getServiceServer_Service();

	/**
	 * Returns the meta object for class '{@link ros1.TopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Spec</em>'.
	 * @see ros1.TopicSpec
	 * @generated
	 */
	EClass getTopicSpec();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.TopicSpec#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see ros1.TopicSpec#getMessage()
	 * @see #getTopicSpec()
	 * @generated
	 */
	EReference getTopicSpec_Message();

	/**
	 * Returns the meta object for class '{@link ros1.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see ros1.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the reference '{@link ros1.Publisher#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see ros1.Publisher#getMessage()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Message();

	/**
	 * Returns the meta object for class '{@link ros1.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see ros1.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link ros1.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.Artifact#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see ros1.Artifact#getNode()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Artifact#getBuild_depend <em>Build depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build depend</em>'.
	 * @see ros1.Artifact#getBuild_depend()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Build_depend();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.Artifact#getExec_depend <em>Exec depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exec depend</em>'.
	 * @see ros1.Artifact#getExec_depend()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Exec_depend();

	/**
	 * Returns the meta object for class '{@link ros1.SpecBase <em>Spec Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Base</em>'.
	 * @see ros1.SpecBase
	 * @generated
	 */
	EClass getSpecBase();

	/**
	 * Returns the meta object for the attribute '{@link ros1.SpecBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.SpecBase#getName()
	 * @see #getSpecBase()
	 * @generated
	 */
	EAttribute getSpecBase_Name();

	/**
	 * Returns the meta object for the container reference '{@link ros1.SpecBase#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see ros1.SpecBase#getPackage()
	 * @see #getSpecBase()
	 * @generated
	 */
	EReference getSpecBase_Package();

	/**
	 * Returns the meta object for the attribute '{@link ros1.SpecBase#getFullname <em>Fullname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullname</em>'.
	 * @see ros1.SpecBase#getFullname()
	 * @see #getSpecBase()
	 * @generated
	 */
	EAttribute getSpecBase_Fullname();

	/**
	 * Returns the meta object for class '{@link ros1.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see ros1.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the reference '{@link ros1.Subscriber#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see ros1.Subscriber#getMessage()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Message();

	/**
	 * Returns the meta object for class '{@link ros1.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Client</em>'.
	 * @see ros1.ServiceClient
	 * @generated
	 */
	EClass getServiceClient();

	/**
	 * Returns the meta object for the reference '{@link ros1.ServiceClient#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see ros1.ServiceClient#getService()
	 * @see #getServiceClient()
	 * @generated
	 */
	EReference getServiceClient_Service();

	/**
	 * Returns the meta object for class '{@link ros1.PackageSet <em>Package Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Set</em>'.
	 * @see ros1.PackageSet
	 * @generated
	 */
	EClass getPackageSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.PackageSet#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see ros1.PackageSet#getModel()
	 * @see #getPackageSet()
	 * @generated
	 */
	EReference getPackageSet_Model();

	/**
	 * Returns the meta object for class '{@link ros1.ActionSpec <em>Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Spec</em>'.
	 * @see ros1.ActionSpec
	 * @generated
	 */
	EClass getActionSpec();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ActionSpec#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal</em>'.
	 * @see ros1.ActionSpec#getGoal()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ActionSpec#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see ros1.ActionSpec#getResult()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Result();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ActionSpec#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see ros1.ActionSpec#getFeedback()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Feedback();

	/**
	 * Returns the meta object for class '{@link ros1.ActionServer <em>Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Server</em>'.
	 * @see ros1.ActionServer
	 * @generated
	 */
	EClass getActionServer();

	/**
	 * Returns the meta object for the reference '{@link ros1.ActionServer#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ros1.ActionServer#getAction()
	 * @see #getActionServer()
	 * @generated
	 */
	EReference getActionServer_Action();

	/**
	 * Returns the meta object for class '{@link ros1.ActionClient <em>Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Client</em>'.
	 * @see ros1.ActionClient
	 * @generated
	 */
	EClass getActionClient();

	/**
	 * Returns the meta object for the reference '{@link ros1.ActionClient#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ros1.ActionClient#getAction()
	 * @see #getActionClient()
	 * @generated
	 */
	EReference getActionClient_Action();

	/**
	 * Returns the meta object for class '{@link ros1.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Definition</em>'.
	 * @see ros1.MessageDefinition
	 * @generated
	 */
	EClass getMessageDefinition();

	/**
	 * Returns the meta object for class '{@link ros1.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see ros1.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute list '{@link ros1.Namespace#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parts</em>'.
	 * @see ros1.Namespace#getParts()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Parts();

	/**
	 * Returns the meta object for class '{@link ros1.GlobalNamespace <em>Global Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Namespace</em>'.
	 * @see ros1.GlobalNamespace
	 * @generated
	 */
	EClass getGlobalNamespace();

	/**
	 * Returns the meta object for class '{@link ros1.RelativeNamespace <em>Relative Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Namespace</em>'.
	 * @see ros1.RelativeNamespace
	 * @generated
	 */
	EClass getRelativeNamespace();

	/**
	 * Returns the meta object for class '{@link ros1.PrivateNamespace <em>Private Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Namespace</em>'.
	 * @see ros1.PrivateNamespace
	 * @generated
	 */
	EClass getPrivateNamespace();

	/**
	 * Returns the meta object for class '{@link ros1.NamespacedElement <em>Namespaced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespaced Element</em>'.
	 * @see ros1.NamespacedElement
	 * @generated
	 */
	EClass getNamespacedElement();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.NamespacedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace</em>'.
	 * @see ros1.NamespacedElement#getNamespace()
	 * @see #getNamespacedElement()
	 * @generated
	 */
	EReference getNamespacedElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link ros1.NamespacedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.NamespacedElement#getName()
	 * @see #getNamespacedElement()
	 * @generated
	 */
	EAttribute getNamespacedElement_Name();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see ros1.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterListType <em>Parameter List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List Type</em>'.
	 * @see ros1.ParameterListType
	 * @generated
	 */
	EClass getParameterListType();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.ParameterListType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see ros1.ParameterListType#getSequence()
	 * @see #getParameterListType()
	 * @generated
	 */
	EReference getParameterListType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterListType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterListType#getDefault()
	 * @see #getParameterListType()
	 * @generated
	 */
	EReference getParameterListType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterStructType <em>Parameter Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Type</em>'.
	 * @see ros1.ParameterStructType
	 * @generated
	 */
	EClass getParameterStructType();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.ParameterStructType#getParameterstructypetmember <em>Parameterstructypetmember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameterstructypetmember</em>'.
	 * @see ros1.ParameterStructType#getParameterstructypetmember()
	 * @see #getParameterStructType()
	 * @generated
	 */
	EReference getParameterStructType_Parameterstructypetmember();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterIntegerType <em>Parameter Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Integer Type</em>'.
	 * @see ros1.ParameterIntegerType
	 * @generated
	 */
	EClass getParameterIntegerType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterIntegerType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterIntegerType#getDefault()
	 * @see #getParameterIntegerType()
	 * @generated
	 */
	EReference getParameterIntegerType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterStringType <em>Parameter String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String Type</em>'.
	 * @see ros1.ParameterStringType
	 * @generated
	 */
	EClass getParameterStringType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterStringType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterStringType#getDefault()
	 * @see #getParameterStringType()
	 * @generated
	 */
	EReference getParameterStringType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterDoubleType <em>Parameter Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Double Type</em>'.
	 * @see ros1.ParameterDoubleType
	 * @generated
	 */
	EClass getParameterDoubleType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterDoubleType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterDoubleType#getDefault()
	 * @see #getParameterDoubleType()
	 * @generated
	 */
	EReference getParameterDoubleType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ros1.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ros1.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterDateType <em>Parameter Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Date Type</em>'.
	 * @see ros1.ParameterDateType
	 * @generated
	 */
	EClass getParameterDateType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterDateType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterDateType#getDefault()
	 * @see #getParameterDateType()
	 * @generated
	 */
	EReference getParameterDateType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterBooleanType <em>Parameter Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Boolean Type</em>'.
	 * @see ros1.ParameterBooleanType
	 * @generated
	 */
	EClass getParameterBooleanType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterBooleanType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterBooleanType#getDefault()
	 * @see #getParameterBooleanType()
	 * @generated
	 */
	EReference getParameterBooleanType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterBase64Type <em>Parameter Base64 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Base64 Type</em>'.
	 * @see ros1.ParameterBase64Type
	 * @generated
	 */
	EClass getParameterBase64Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterBase64Type#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterBase64Type#getDefault()
	 * @see #getParameterBase64Type()
	 * @generated
	 */
	EReference getParameterBase64Type_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterAnyType <em>Parameter Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Any Type</em>'.
	 * @see ros1.ParameterAnyType
	 * @generated
	 */
	EClass getParameterAnyType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterAnyType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterAnyType#getDefault()
	 * @see #getParameterAnyType()
	 * @generated
	 */
	EReference getParameterAnyType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterStructTypeMember <em>Parameter Struct Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Type Member</em>'.
	 * @see ros1.ParameterStructTypeMember
	 * @generated
	 */
	EClass getParameterStructTypeMember();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterStructTypeMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.ParameterStructTypeMember#getName()
	 * @see #getParameterStructTypeMember()
	 * @generated
	 */
	EAttribute getParameterStructTypeMember_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterStructTypeMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ros1.ParameterStructTypeMember#getType()
	 * @see #getParameterStructTypeMember()
	 * @generated
	 */
	EReference getParameterStructTypeMember_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterStructTypeMember#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterStructTypeMember#getDefault()
	 * @see #getParameterStructTypeMember()
	 * @generated
	 */
	EReference getParameterStructTypeMember_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterArrayType <em>Parameter Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Array Type</em>'.
	 * @see ros1.ParameterArrayType
	 * @generated
	 */
	EClass getParameterArrayType();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterArrayType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ros1.ParameterArrayType#getType()
	 * @see #getParameterArrayType()
	 * @generated
	 */
	EReference getParameterArrayType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterArrayType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros1.ParameterArrayType#getDefault()
	 * @see #getParameterArrayType()
	 * @generated
	 */
	EReference getParameterArrayType_Default();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see ros1.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterAny <em>Parameter Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Any</em>'.
	 * @see ros1.ParameterAny
	 * @generated
	 */
	EClass getParameterAny();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterAny#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterAny#getValue()
	 * @see #getParameterAny()
	 * @generated
	 */
	EAttribute getParameterAny_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String</em>'.
	 * @see ros1.ParameterString
	 * @generated
	 */
	EClass getParameterString();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterString#getValue()
	 * @see #getParameterString()
	 * @generated
	 */
	EAttribute getParameterString_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterBase64 <em>Parameter Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Base64</em>'.
	 * @see ros1.ParameterBase64
	 * @generated
	 */
	EClass getParameterBase64();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterBase64#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterBase64#getValue()
	 * @see #getParameterBase64()
	 * @generated
	 */
	EAttribute getParameterBase64_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterInteger <em>Parameter Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Integer</em>'.
	 * @see ros1.ParameterInteger
	 * @generated
	 */
	EClass getParameterInteger();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterInteger#getValue()
	 * @see #getParameterInteger()
	 * @generated
	 */
	EAttribute getParameterInteger_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterDouble <em>Parameter Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Double</em>'.
	 * @see ros1.ParameterDouble
	 * @generated
	 */
	EClass getParameterDouble();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterDouble#getValue()
	 * @see #getParameterDouble()
	 * @generated
	 */
	EAttribute getParameterDouble_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterBoolean <em>Parameter Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Boolean</em>'.
	 * @see ros1.ParameterBoolean
	 * @generated
	 */
	EClass getParameterBoolean();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterBoolean#isValue()
	 * @see #getParameterBoolean()
	 * @generated
	 */
	EAttribute getParameterBoolean_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterSequence <em>Parameter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Sequence</em>'.
	 * @see ros1.ParameterSequence
	 * @generated
	 */
	EClass getParameterSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.ParameterSequence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see ros1.ParameterSequence#getValue()
	 * @see #getParameterSequence()
	 * @generated
	 */
	EReference getParameterSequence_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterStruct <em>Parameter Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct</em>'.
	 * @see ros1.ParameterStruct
	 * @generated
	 */
	EClass getParameterStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link ros1.ParameterStruct#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see ros1.ParameterStruct#getValue()
	 * @see #getParameterStruct()
	 * @generated
	 */
	EReference getParameterStruct_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterStructMember <em>Parameter Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Member</em>'.
	 * @see ros1.ParameterStructMember
	 * @generated
	 */
	EClass getParameterStructMember();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterStructMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros1.ParameterStructMember#getName()
	 * @see #getParameterStructMember()
	 * @generated
	 */
	EAttribute getParameterStructMember_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ros1.ParameterStructMember#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ros1.ParameterStructMember#getValue()
	 * @see #getParameterStructMember()
	 * @generated
	 */
	EReference getParameterStructMember_Value();

	/**
	 * Returns the meta object for class '{@link ros1.ParameterDate <em>Parameter Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Date</em>'.
	 * @see ros1.ParameterDate
	 * @generated
	 */
	EClass getParameterDate();

	/**
	 * Returns the meta object for the attribute '{@link ros1.ParameterDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros1.ParameterDate#getValue()
	 * @see #getParameterDate()
	 * @generated
	 */
	EAttribute getParameterDate_Value();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Graph Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graph Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getGraphName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ros1Factory getRos1Factory();

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
		 * The meta object literal for the '{@link ros1.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.NodeImpl
		 * @see ros1.impl.Ros1PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Serviceserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SERVICESERVER = eINSTANCE.getNode_Serviceserver();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISHER = eINSTANCE.getNode_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBER = eINSTANCE.getNode_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Serviceclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SERVICECLIENT = eINSTANCE.getNode_Serviceclient();

		/**
		 * The meta object literal for the '<em><b>Actionserver</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ACTIONSERVER = eINSTANCE.getNode_Actionserver();

		/**
		 * The meta object literal for the '<em><b>Actionclient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ACTIONCLIENT = eINSTANCE.getNode_Actionclient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETER = eINSTANCE.getNode_Parameter();

		/**
		 * The meta object literal for the '{@link ros1.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ModelImpl
		 * @see ros1.impl.Ros1PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SPEC = eINSTANCE.getModel_Spec();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ARTIFACT = eINSTANCE.getModel_Artifact();

		/**
		 * The meta object literal for the '{@link ros1.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ServiceSpecImpl
		 * @see ros1.impl.Ros1PackageImpl#getServiceSpec()
		 * @generated
		 */
		EClass SERVICE_SPEC = eINSTANCE.getServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPEC__REQUEST = eINSTANCE.getServiceSpec_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPEC__RESPONSE = eINSTANCE.getServiceSpec_Response();

		/**
		 * The meta object literal for the '{@link ros1.impl.ServiceServerImpl <em>Service Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ServiceServerImpl
		 * @see ros1.impl.Ros1PackageImpl#getServiceServer()
		 * @generated
		 */
		EClass SERVICE_SERVER = eINSTANCE.getServiceServer();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SERVER__SERVICE = eINSTANCE.getServiceServer_Service();

		/**
		 * The meta object literal for the '{@link ros1.impl.TopicSpecImpl <em>Topic Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.TopicSpecImpl
		 * @see ros1.impl.Ros1PackageImpl#getTopicSpec()
		 * @generated
		 */
		EClass TOPIC_SPEC = eINSTANCE.getTopicSpec();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_SPEC__MESSAGE = eINSTANCE.getTopicSpec_Message();

		/**
		 * The meta object literal for the '{@link ros1.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.PublisherImpl
		 * @see ros1.impl.Ros1PackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__MESSAGE = eINSTANCE.getPublisher_Message();

		/**
		 * The meta object literal for the '{@link ros1.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ArtifactImpl
		 * @see ros1.impl.Ros1PackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__NODE = eINSTANCE.getArtifact_Node();

		/**
		 * The meta object literal for the '<em><b>Build depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__BUILD_DEPEND = eINSTANCE.getArtifact_Build_depend();

		/**
		 * The meta object literal for the '<em><b>Exec depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__EXEC_DEPEND = eINSTANCE.getArtifact_Exec_depend();

		/**
		 * The meta object literal for the '{@link ros1.impl.SpecBaseImpl <em>Spec Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.SpecBaseImpl
		 * @see ros1.impl.Ros1PackageImpl#getSpecBase()
		 * @generated
		 */
		EClass SPEC_BASE = eINSTANCE.getSpecBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_BASE__NAME = eINSTANCE.getSpecBase_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_BASE__PACKAGE = eINSTANCE.getSpecBase_Package();

		/**
		 * The meta object literal for the '<em><b>Fullname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_BASE__FULLNAME = eINSTANCE.getSpecBase_Fullname();

		/**
		 * The meta object literal for the '{@link ros1.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.SubscriberImpl
		 * @see ros1.impl.Ros1PackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__MESSAGE = eINSTANCE.getSubscriber_Message();

		/**
		 * The meta object literal for the '{@link ros1.impl.ServiceClientImpl <em>Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ServiceClientImpl
		 * @see ros1.impl.Ros1PackageImpl#getServiceClient()
		 * @generated
		 */
		EClass SERVICE_CLIENT = eINSTANCE.getServiceClient();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLIENT__SERVICE = eINSTANCE.getServiceClient_Service();

		/**
		 * The meta object literal for the '{@link ros1.impl.PackageSetImpl <em>Package Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.PackageSetImpl
		 * @see ros1.impl.Ros1PackageImpl#getPackageSet()
		 * @generated
		 */
		EClass PACKAGE_SET = eINSTANCE.getPackageSet();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SET__MODEL = eINSTANCE.getPackageSet_Model();

		/**
		 * The meta object literal for the '{@link ros1.impl.ActionSpecImpl <em>Action Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ActionSpecImpl
		 * @see ros1.impl.Ros1PackageImpl#getActionSpec()
		 * @generated
		 */
		EClass ACTION_SPEC = eINSTANCE.getActionSpec();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SPEC__GOAL = eINSTANCE.getActionSpec_Goal();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SPEC__RESULT = eINSTANCE.getActionSpec_Result();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SPEC__FEEDBACK = eINSTANCE.getActionSpec_Feedback();

		/**
		 * The meta object literal for the '{@link ros1.impl.ActionServerImpl <em>Action Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ActionServerImpl
		 * @see ros1.impl.Ros1PackageImpl#getActionServer()
		 * @generated
		 */
		EClass ACTION_SERVER = eINSTANCE.getActionServer();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SERVER__ACTION = eINSTANCE.getActionServer_Action();

		/**
		 * The meta object literal for the '{@link ros1.impl.ActionClientImpl <em>Action Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ActionClientImpl
		 * @see ros1.impl.Ros1PackageImpl#getActionClient()
		 * @generated
		 */
		EClass ACTION_CLIENT = eINSTANCE.getActionClient();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CLIENT__ACTION = eINSTANCE.getActionClient_Action();

		/**
		 * The meta object literal for the '{@link ros1.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.MessageDefinitionImpl
		 * @see ros1.impl.Ros1PackageImpl#getMessageDefinition()
		 * @generated
		 */
		EClass MESSAGE_DEFINITION = eINSTANCE.getMessageDefinition();

		/**
		 * The meta object literal for the '{@link ros1.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.NamespaceImpl
		 * @see ros1.impl.Ros1PackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__PARTS = eINSTANCE.getNamespace_Parts();

		/**
		 * The meta object literal for the '{@link ros1.impl.GlobalNamespaceImpl <em>Global Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.GlobalNamespaceImpl
		 * @see ros1.impl.Ros1PackageImpl#getGlobalNamespace()
		 * @generated
		 */
		EClass GLOBAL_NAMESPACE = eINSTANCE.getGlobalNamespace();

		/**
		 * The meta object literal for the '{@link ros1.impl.RelativeNamespaceImpl <em>Relative Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.RelativeNamespaceImpl
		 * @see ros1.impl.Ros1PackageImpl#getRelativeNamespace()
		 * @generated
		 */
		EClass RELATIVE_NAMESPACE = eINSTANCE.getRelativeNamespace();

		/**
		 * The meta object literal for the '{@link ros1.impl.PrivateNamespaceImpl <em>Private Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.PrivateNamespaceImpl
		 * @see ros1.impl.Ros1PackageImpl#getPrivateNamespace()
		 * @generated
		 */
		EClass PRIVATE_NAMESPACE = eINSTANCE.getPrivateNamespace();

		/**
		 * The meta object literal for the '{@link ros1.impl.NamespacedElementImpl <em>Namespaced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.NamespacedElementImpl
		 * @see ros1.impl.Ros1PackageImpl#getNamespacedElement()
		 * @generated
		 */
		EClass NAMESPACED_ELEMENT = eINSTANCE.getNamespacedElement();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACED_ELEMENT__NAMESPACE = eINSTANCE.getNamespacedElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACED_ELEMENT__NAME = eINSTANCE.getNamespacedElement_Name();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterListTypeImpl <em>Parameter List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterListTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterListType()
		 * @generated
		 */
		EClass PARAMETER_LIST_TYPE = eINSTANCE.getParameterListType();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST_TYPE__SEQUENCE = eINSTANCE.getParameterListType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST_TYPE__DEFAULT = eINSTANCE.getParameterListType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterStructTypeImpl <em>Parameter Struct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterStructTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterStructType()
		 * @generated
		 */
		EClass PARAMETER_STRUCT_TYPE = eINSTANCE.getParameterStructType();

		/**
		 * The meta object literal for the '<em><b>Parameterstructypetmember</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER = eINSTANCE.getParameterStructType_Parameterstructypetmember();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterIntegerTypeImpl <em>Parameter Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterIntegerTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterIntegerType()
		 * @generated
		 */
		EClass PARAMETER_INTEGER_TYPE = eINSTANCE.getParameterIntegerType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INTEGER_TYPE__DEFAULT = eINSTANCE.getParameterIntegerType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterStringTypeImpl <em>Parameter String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterStringTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterStringType()
		 * @generated
		 */
		EClass PARAMETER_STRING_TYPE = eINSTANCE.getParameterStringType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRING_TYPE__DEFAULT = eINSTANCE.getParameterStringType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterDoubleTypeImpl <em>Parameter Double Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterDoubleTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterDoubleType()
		 * @generated
		 */
		EClass PARAMETER_DOUBLE_TYPE = eINSTANCE.getParameterDoubleType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DOUBLE_TYPE__DEFAULT = eINSTANCE.getParameterDoubleType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterDateTypeImpl <em>Parameter Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterDateTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterDateType()
		 * @generated
		 */
		EClass PARAMETER_DATE_TYPE = eINSTANCE.getParameterDateType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DATE_TYPE__DEFAULT = eINSTANCE.getParameterDateType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterBooleanTypeImpl <em>Parameter Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterBooleanTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterBooleanType()
		 * @generated
		 */
		EClass PARAMETER_BOOLEAN_TYPE = eINSTANCE.getParameterBooleanType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BOOLEAN_TYPE__DEFAULT = eINSTANCE.getParameterBooleanType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterBase64TypeImpl <em>Parameter Base64 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterBase64TypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterBase64Type()
		 * @generated
		 */
		EClass PARAMETER_BASE64_TYPE = eINSTANCE.getParameterBase64Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BASE64_TYPE__DEFAULT = eINSTANCE.getParameterBase64Type_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterAnyTypeImpl <em>Parameter Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterAnyTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterAnyType()
		 * @generated
		 */
		EClass PARAMETER_ANY_TYPE = eINSTANCE.getParameterAnyType();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ANY_TYPE__DEFAULT = eINSTANCE.getParameterAnyType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterStructTypeMemberImpl <em>Parameter Struct Type Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterStructTypeMemberImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterStructTypeMember()
		 * @generated
		 */
		EClass PARAMETER_STRUCT_TYPE_MEMBER = eINSTANCE.getParameterStructTypeMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_STRUCT_TYPE_MEMBER__NAME = eINSTANCE.getParameterStructTypeMember_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRUCT_TYPE_MEMBER__TYPE = eINSTANCE.getParameterStructTypeMember_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRUCT_TYPE_MEMBER__DEFAULT = eINSTANCE.getParameterStructTypeMember_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterArrayTypeImpl <em>Parameter Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterArrayTypeImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterArrayType()
		 * @generated
		 */
		EClass PARAMETER_ARRAY_TYPE = eINSTANCE.getParameterArrayType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ARRAY_TYPE__TYPE = eINSTANCE.getParameterArrayType_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ARRAY_TYPE__DEFAULT = eINSTANCE.getParameterArrayType_Default();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterValueImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterAnyImpl <em>Parameter Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterAnyImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterAny()
		 * @generated
		 */
		EClass PARAMETER_ANY = eINSTANCE.getParameterAny();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_ANY__VALUE = eINSTANCE.getParameterAny_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterStringImpl <em>Parameter String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterStringImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterString()
		 * @generated
		 */
		EClass PARAMETER_STRING = eINSTANCE.getParameterString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_STRING__VALUE = eINSTANCE.getParameterString_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterBase64Impl <em>Parameter Base64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterBase64Impl
		 * @see ros1.impl.Ros1PackageImpl#getParameterBase64()
		 * @generated
		 */
		EClass PARAMETER_BASE64 = eINSTANCE.getParameterBase64();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_BASE64__VALUE = eINSTANCE.getParameterBase64_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterIntegerImpl <em>Parameter Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterIntegerImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterInteger()
		 * @generated
		 */
		EClass PARAMETER_INTEGER = eINSTANCE.getParameterInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_INTEGER__VALUE = eINSTANCE.getParameterInteger_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterDoubleImpl <em>Parameter Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterDoubleImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterDouble()
		 * @generated
		 */
		EClass PARAMETER_DOUBLE = eINSTANCE.getParameterDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DOUBLE__VALUE = eINSTANCE.getParameterDouble_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterBooleanImpl <em>Parameter Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterBooleanImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterBoolean()
		 * @generated
		 */
		EClass PARAMETER_BOOLEAN = eINSTANCE.getParameterBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_BOOLEAN__VALUE = eINSTANCE.getParameterBoolean_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterSequenceImpl <em>Parameter Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterSequenceImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterSequence()
		 * @generated
		 */
		EClass PARAMETER_SEQUENCE = eINSTANCE.getParameterSequence();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SEQUENCE__VALUE = eINSTANCE.getParameterSequence_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterStructImpl <em>Parameter Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterStructImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterStruct()
		 * @generated
		 */
		EClass PARAMETER_STRUCT = eINSTANCE.getParameterStruct();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRUCT__VALUE = eINSTANCE.getParameterStruct_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterStructMemberImpl <em>Parameter Struct Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterStructMemberImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterStructMember()
		 * @generated
		 */
		EClass PARAMETER_STRUCT_MEMBER = eINSTANCE.getParameterStructMember();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_STRUCT_MEMBER__NAME = eINSTANCE.getParameterStructMember_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_STRUCT_MEMBER__VALUE = eINSTANCE.getParameterStructMember_Value();

		/**
		 * The meta object literal for the '{@link ros1.impl.ParameterDateImpl <em>Parameter Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros1.impl.ParameterDateImpl
		 * @see ros1.impl.Ros1PackageImpl#getParameterDate()
		 * @generated
		 */
		EClass PARAMETER_DATE = eINSTANCE.getParameterDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DATE__VALUE = eINSTANCE.getParameterDate_Value();

		/**
		 * The meta object literal for the '<em>Graph Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ros1.impl.Ros1PackageImpl#getGraphName()
		 * @generated
		 */
		EDataType GRAPH_NAME = eINSTANCE.getGraphName();

	}

} //Ros1Package
