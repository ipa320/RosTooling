/**
 */
package ros;

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
 * @see ros.RosFactory
 * @model kind="package"
 * @generated
 */
public interface RosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ros";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/ros";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ros";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosPackage eINSTANCE = ros.impl.RosPackageImpl.init();

	/**
	 * The meta object id for the '{@link ros.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.NodeImpl
	 * @see ros.impl.RosPackageImpl#getNode()
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
	 * The meta object id for the '{@link ros.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.PackageImpl
	 * @see ros.impl.RosPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SPEC = 1;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>From Git Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FROM_GIT_REPO = 3;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DEPENDENCY = 4;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.DependencyImpl
	 * @see ros.impl.RosPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ros.impl.SpecBaseImpl <em>Spec Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.SpecBaseImpl
	 * @see ros.impl.RosPackageImpl#getSpecBase()
	 * @generated
	 */
	int SPEC_BASE = 11;

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
	 * The meta object id for the '{@link ros.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ServiceSpecImpl
	 * @see ros.impl.RosPackageImpl#getServiceSpec()
	 * @generated
	 */
	int SERVICE_SPEC = 3;

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
	 * The meta object id for the '{@link ros.impl.NamespacedElementImpl <em>Namespaced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.NamespacedElementImpl
	 * @see ros.impl.RosPackageImpl#getNamespacedElement()
	 * @generated
	 */
	int NAMESPACED_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACED_ELEMENT__NAMESPACE = 0;

	/**
	 * The meta object id for the '{@link ros.impl.ServiceServerImpl <em>Service Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ServiceServerImpl
	 * @see ros.impl.RosPackageImpl#getServiceServer()
	 * @generated
	 */
	int SERVICE_SERVER = 4;

	/**
	 * The meta object id for the '{@link ros.impl.TopicSpecImpl <em>Topic Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.TopicSpecImpl
	 * @see ros.impl.RosPackageImpl#getTopicSpec()
	 * @generated
	 */
	int TOPIC_SPEC = 5;

	/**
	 * The meta object id for the '{@link ros.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.PublisherImpl
	 * @see ros.impl.RosPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 9;

	/**
	 * The meta object id for the '{@link ros.impl.PackageDependencyImpl <em>Package Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.PackageDependencyImpl
	 * @see ros.impl.RosPackageImpl#getPackageDependency()
	 * @generated
	 */
	int PACKAGE_DEPENDENCY = 6;

	/**
	 * The meta object id for the '{@link ros.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ExternalDependencyImpl
	 * @see ros.impl.RosPackageImpl#getExternalDependency()
	 * @generated
	 */
	int EXTERNAL_DEPENDENCY = 7;

	/**
	 * The meta object id for the '{@link ros.impl.CatkinPackageImpl <em>Catkin Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.CatkinPackageImpl
	 * @see ros.impl.RosPackageImpl#getCatkinPackage()
	 * @generated
	 */
	int CATKIN_PACKAGE = 8;

	/**
	 * The meta object id for the '{@link ros.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ArtifactImpl
	 * @see ros.impl.RosPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 10;

	/**
	 * The meta object id for the '{@link ros.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.SubscriberImpl
	 * @see ros.impl.RosPackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 12;

	/**
	 * The meta object id for the '{@link ros.impl.ServiceClientImpl <em>Service Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ServiceClientImpl
	 * @see ros.impl.RosPackageImpl#getServiceClient()
	 * @generated
	 */
	int SERVICE_CLIENT = 13;

	/**
	 * The meta object id for the '{@link ros.impl.ActionSpecImpl <em>Action Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ActionSpecImpl
	 * @see ros.impl.RosPackageImpl#getActionSpec()
	 * @generated
	 */
	int ACTION_SPEC = 15;

	/**
	 * The meta object id for the '{@link ros.impl.ActionServerImpl <em>Action Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ActionServerImpl
	 * @see ros.impl.RosPackageImpl#getActionServer()
	 * @generated
	 */
	int ACTION_SERVER = 16;

	/**
	 * The meta object id for the '{@link ros.impl.ActionClientImpl <em>Action Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ActionClientImpl
	 * @see ros.impl.RosPackageImpl#getActionClient()
	 * @generated
	 */
	int ACTION_CLIENT = 17;

	/**
	 * The meta object id for the '{@link ros.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.MessageDefinitionImpl
	 * @see ros.impl.RosPackageImpl#getMessageDefinition()
	 * @generated
	 */
	int MESSAGE_DEFINITION = 18;

	/**
	 * The meta object id for the '{@link ros.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.NamespaceImpl
	 * @see ros.impl.RosPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 19;

	/**
	 * The meta object id for the '{@link ros.impl.GlobalNamespaceImpl <em>Global Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.GlobalNamespaceImpl
	 * @see ros.impl.RosPackageImpl#getGlobalNamespace()
	 * @generated
	 */
	int GLOBAL_NAMESPACE = 20;

	/**
	 * The meta object id for the '{@link ros.impl.RelativeNamespaceImpl <em>Relative Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.RelativeNamespaceImpl
	 * @see ros.impl.RosPackageImpl#getRelativeNamespace()
	 * @generated
	 */
	int RELATIVE_NAMESPACE = 21;

	/**
	 * The meta object id for the '{@link ros.impl.PrivateNamespaceImpl <em>Private Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.PrivateNamespaceImpl
	 * @see ros.impl.RosPackageImpl#getPrivateNamespace()
	 * @generated
	 */
	int PRIVATE_NAMESPACE = 22;

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
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY__PACKAGE = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY__NAME = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE__SPEC = PACKAGE__SPEC;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE__ARTIFACT = PACKAGE__ARTIFACT;

	/**
	 * The feature id for the '<em><b>From Git Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE__FROM_GIT_REPO = PACKAGE__FROM_GIT_REPO;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE__DEPENDENCY = PACKAGE__DEPENDENCY;

	/**
	 * The number of structural features of the '<em>Catkin Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catkin Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATKIN_PACKAGE_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link ros.impl.PackageSetImpl <em>Package Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.PackageSetImpl
	 * @see ros.impl.RosPackageImpl#getPackageSet()
	 * @generated
	 */
	int PACKAGE_SET = 14;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_SET__PACKAGE = 0;

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
	 * The feature id for the '<em><b>Message Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__MESSAGE_PART = 0;

	/**
	 * The number of structural features of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link ros.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 24;

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
	 * The meta object id for the '{@link ros.impl.ParameterListTypeImpl <em>Parameter List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterListTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterListType()
	 * @generated
	 */
	int PARAMETER_LIST_TYPE = 25;

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
	 * The meta object id for the '{@link ros.impl.ParameterStructTypeImpl <em>Parameter Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterStructTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterStructType()
	 * @generated
	 */
	int PARAMETER_STRUCT_TYPE = 26;

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
	 * The meta object id for the '{@link ros.impl.ParameterIntegerTypeImpl <em>Parameter Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterIntegerTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterIntegerType()
	 * @generated
	 */
	int PARAMETER_INTEGER_TYPE = 27;

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
	 * The meta object id for the '{@link ros.impl.ParameterStringTypeImpl <em>Parameter String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterStringTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterStringType()
	 * @generated
	 */
	int PARAMETER_STRING_TYPE = 28;

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
	 * The meta object id for the '{@link ros.impl.ParameterDoubleTypeImpl <em>Parameter Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterDoubleTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterDoubleType()
	 * @generated
	 */
	int PARAMETER_DOUBLE_TYPE = 29;

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
	 * The meta object id for the '{@link ros.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterImpl
	 * @see ros.impl.RosPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 30;

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
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = NAMESPACED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMESPACED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMESPACED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ros.impl.ParameterDateTypeImpl <em>Parameter Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterDateTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterDateType()
	 * @generated
	 */
	int PARAMETER_DATE_TYPE = 31;

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
	 * The meta object id for the '{@link ros.impl.ParameterBooleanTypeImpl <em>Parameter Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterBooleanTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterBooleanType()
	 * @generated
	 */
	int PARAMETER_BOOLEAN_TYPE = 32;

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
	 * The meta object id for the '{@link ros.impl.ParameterBase64TypeImpl <em>Parameter Base64 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterBase64TypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterBase64Type()
	 * @generated
	 */
	int PARAMETER_BASE64_TYPE = 33;

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
	 * The meta object id for the '{@link ros.impl.ParameterAnyTypeImpl <em>Parameter Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterAnyTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterAnyType()
	 * @generated
	 */
	int PARAMETER_ANY_TYPE = 34;

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
	 * The meta object id for the '{@link ros.impl.ParameterStructTypeMemberImpl <em>Parameter Struct Type Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterStructTypeMemberImpl
	 * @see ros.impl.RosPackageImpl#getParameterStructTypeMember()
	 * @generated
	 */
	int PARAMETER_STRUCT_TYPE_MEMBER = 35;

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
	 * The meta object id for the '{@link ros.impl.ParameterArrayTypeImpl <em>Parameter Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterArrayTypeImpl
	 * @see ros.impl.RosPackageImpl#getParameterArrayType()
	 * @generated
	 */
	int PARAMETER_ARRAY_TYPE = 36;

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
	 * The meta object id for the '{@link ros.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterValueImpl
	 * @see ros.impl.RosPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 37;

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
	 * The meta object id for the '{@link ros.impl.ParameterAnyImpl <em>Parameter Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterAnyImpl
	 * @see ros.impl.RosPackageImpl#getParameterAny()
	 * @generated
	 */
	int PARAMETER_ANY = 38;

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
	 * The meta object id for the '{@link ros.impl.ParameterStringImpl <em>Parameter String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterStringImpl
	 * @see ros.impl.RosPackageImpl#getParameterString()
	 * @generated
	 */
	int PARAMETER_STRING = 39;

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
	 * The meta object id for the '{@link ros.impl.ParameterBase64Impl <em>Parameter Base64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterBase64Impl
	 * @see ros.impl.RosPackageImpl#getParameterBase64()
	 * @generated
	 */
	int PARAMETER_BASE64 = 40;

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
	 * The meta object id for the '{@link ros.impl.ParameterIntegerImpl <em>Parameter Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterIntegerImpl
	 * @see ros.impl.RosPackageImpl#getParameterInteger()
	 * @generated
	 */
	int PARAMETER_INTEGER = 41;

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
	 * The meta object id for the '{@link ros.impl.ParameterDoubleImpl <em>Parameter Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterDoubleImpl
	 * @see ros.impl.RosPackageImpl#getParameterDouble()
	 * @generated
	 */
	int PARAMETER_DOUBLE = 42;

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
	 * The meta object id for the '{@link ros.impl.ParameterBooleanImpl <em>Parameter Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterBooleanImpl
	 * @see ros.impl.RosPackageImpl#getParameterBoolean()
	 * @generated
	 */
	int PARAMETER_BOOLEAN = 43;

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
	 * The meta object id for the '{@link ros.impl.ParameterSequenceImpl <em>Parameter Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterSequenceImpl
	 * @see ros.impl.RosPackageImpl#getParameterSequence()
	 * @generated
	 */
	int PARAMETER_SEQUENCE = 44;

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
	 * The meta object id for the '{@link ros.impl.ParameterStructImpl <em>Parameter Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterStructImpl
	 * @see ros.impl.RosPackageImpl#getParameterStruct()
	 * @generated
	 */
	int PARAMETER_STRUCT = 45;

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
	 * The meta object id for the '{@link ros.impl.ParameterStructMemberImpl <em>Parameter Struct Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterStructMemberImpl
	 * @see ros.impl.RosPackageImpl#getParameterStructMember()
	 * @generated
	 */
	int PARAMETER_STRUCT_MEMBER = 46;

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
	 * The meta object id for the '{@link ros.impl.ParameterDateImpl <em>Parameter Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ros.impl.ParameterDateImpl
	 * @see ros.impl.RosPackageImpl#getParameterDate()
	 * @generated
	 */
	int PARAMETER_DATE = 47;

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
	 * @see ros.impl.RosPackageImpl#getGraphName()
	 * @generated
	 */
	int GRAPH_NAME = 48;


	/**
	 * Returns the meta object for class '{@link ros.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ros.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getServiceserver <em>Serviceserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceserver</em>'.
	 * @see ros.Node#getServiceserver()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Serviceserver();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see ros.Node#getPublisher()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriber</em>'.
	 * @see ros.Node#getSubscriber()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscriber();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getServiceclient <em>Serviceclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceclient</em>'.
	 * @see ros.Node#getServiceclient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Serviceclient();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getActionserver <em>Actionserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionserver</em>'.
	 * @see ros.Node#getActionserver()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Actionserver();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getActionclient <em>Actionclient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionclient</em>'.
	 * @see ros.Node#getActionclient()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Actionclient();

	/**
	 * Returns the meta object for the attribute '{@link ros.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Node#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see ros.Node#getParameter()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameter();

	/**
	 * Returns the meta object for class '{@link ros.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see ros.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link ros.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Package#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec</em>'.
	 * @see ros.Package#getSpec()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Spec();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Package#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see ros.Package#getArtifact()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link ros.Package#getFromGitRepo <em>From Git Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Git Repo</em>'.
	 * @see ros.Package#getFromGitRepo()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_FromGitRepo();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.Package#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see ros.Package#getDependency()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Dependency();

	/**
	 * Returns the meta object for class '{@link ros.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see ros.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link ros.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Spec</em>'.
	 * @see ros.ServiceSpec
	 * @generated
	 */
	EClass getServiceSpec();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ServiceSpec#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see ros.ServiceSpec#getRequest()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Request();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ServiceSpec#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see ros.ServiceSpec#getResponse()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Response();

	/**
	 * Returns the meta object for class '{@link ros.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Server</em>'.
	 * @see ros.ServiceServer
	 * @generated
	 */
	EClass getServiceServer();

	/**
	 * Returns the meta object for the reference '{@link ros.ServiceServer#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see ros.ServiceServer#getService()
	 * @see #getServiceServer()
	 * @generated
	 */
	EReference getServiceServer_Service();

	/**
	 * Returns the meta object for class '{@link ros.TopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Spec</em>'.
	 * @see ros.TopicSpec
	 * @generated
	 */
	EClass getTopicSpec();

	/**
	 * Returns the meta object for the containment reference '{@link ros.TopicSpec#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see ros.TopicSpec#getMessage()
	 * @see #getTopicSpec()
	 * @generated
	 */
	EReference getTopicSpec_Message();

	/**
	 * Returns the meta object for class '{@link ros.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see ros.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the reference '{@link ros.Publisher#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see ros.Publisher#getMessage()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Message();

	/**
	 * Returns the meta object for class '{@link ros.PackageDependency <em>Package Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Dependency</em>'.
	 * @see ros.PackageDependency
	 * @generated
	 */
	EClass getPackageDependency();

	/**
	 * Returns the meta object for the reference '{@link ros.PackageDependency#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see ros.PackageDependency#getPackage()
	 * @see #getPackageDependency()
	 * @generated
	 */
	EReference getPackageDependency_Package();

	/**
	 * Returns the meta object for class '{@link ros.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Dependency</em>'.
	 * @see ros.ExternalDependency
	 * @generated
	 */
	EClass getExternalDependency();

	/**
	 * Returns the meta object for the attribute '{@link ros.ExternalDependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.ExternalDependency#getName()
	 * @see #getExternalDependency()
	 * @generated
	 */
	EAttribute getExternalDependency_Name();

	/**
	 * Returns the meta object for class '{@link ros.CatkinPackage <em>Catkin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catkin Package</em>'.
	 * @see ros.CatkinPackage
	 * @generated
	 */
	EClass getCatkinPackage();

	/**
	 * Returns the meta object for class '{@link ros.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see ros.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link ros.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ros.Artifact#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see ros.Artifact#getNode()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Node();

	/**
	 * Returns the meta object for class '{@link ros.SpecBase <em>Spec Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Base</em>'.
	 * @see ros.SpecBase
	 * @generated
	 */
	EClass getSpecBase();

	/**
	 * Returns the meta object for the attribute '{@link ros.SpecBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.SpecBase#getName()
	 * @see #getSpecBase()
	 * @generated
	 */
	EAttribute getSpecBase_Name();

	/**
	 * Returns the meta object for the container reference '{@link ros.SpecBase#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see ros.SpecBase#getPackage()
	 * @see #getSpecBase()
	 * @generated
	 */
	EReference getSpecBase_Package();

	/**
	 * Returns the meta object for the attribute '{@link ros.SpecBase#getFullname <em>Fullname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullname</em>'.
	 * @see ros.SpecBase#getFullname()
	 * @see #getSpecBase()
	 * @generated
	 */
	EAttribute getSpecBase_Fullname();

	/**
	 * Returns the meta object for class '{@link ros.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see ros.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the reference '{@link ros.Subscriber#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see ros.Subscriber#getMessage()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Message();

	/**
	 * Returns the meta object for class '{@link ros.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Client</em>'.
	 * @see ros.ServiceClient
	 * @generated
	 */
	EClass getServiceClient();

	/**
	 * Returns the meta object for the reference '{@link ros.ServiceClient#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see ros.ServiceClient#getService()
	 * @see #getServiceClient()
	 * @generated
	 */
	EReference getServiceClient_Service();

	/**
	 * Returns the meta object for class '{@link ros.PackageSet <em>Package Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Set</em>'.
	 * @see ros.PackageSet
	 * @generated
	 */
	EClass getPackageSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.PackageSet#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see ros.PackageSet#getPackage()
	 * @see #getPackageSet()
	 * @generated
	 */
	EReference getPackageSet_Package();

	/**
	 * Returns the meta object for class '{@link ros.ActionSpec <em>Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Spec</em>'.
	 * @see ros.ActionSpec
	 * @generated
	 */
	EClass getActionSpec();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ActionSpec#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal</em>'.
	 * @see ros.ActionSpec#getGoal()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ActionSpec#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see ros.ActionSpec#getResult()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Result();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ActionSpec#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see ros.ActionSpec#getFeedback()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Feedback();

	/**
	 * Returns the meta object for class '{@link ros.ActionServer <em>Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Server</em>'.
	 * @see ros.ActionServer
	 * @generated
	 */
	EClass getActionServer();

	/**
	 * Returns the meta object for the reference '{@link ros.ActionServer#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ros.ActionServer#getAction()
	 * @see #getActionServer()
	 * @generated
	 */
	EReference getActionServer_Action();

	/**
	 * Returns the meta object for class '{@link ros.ActionClient <em>Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Client</em>'.
	 * @see ros.ActionClient
	 * @generated
	 */
	EClass getActionClient();

	/**
	 * Returns the meta object for the reference '{@link ros.ActionClient#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see ros.ActionClient#getAction()
	 * @see #getActionClient()
	 * @generated
	 */
	EReference getActionClient_Action();

	/**
	 * Returns the meta object for class '{@link ros.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Definition</em>'.
	 * @see ros.MessageDefinition
	 * @generated
	 */
	EClass getMessageDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.MessageDefinition#getMessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Part</em>'.
	 * @see ros.MessageDefinition#getMessagePart()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_MessagePart();

	/**
	 * Returns the meta object for class '{@link ros.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see ros.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute list '{@link ros.Namespace#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parts</em>'.
	 * @see ros.Namespace#getParts()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Parts();

	/**
	 * Returns the meta object for class '{@link ros.GlobalNamespace <em>Global Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Namespace</em>'.
	 * @see ros.GlobalNamespace
	 * @generated
	 */
	EClass getGlobalNamespace();

	/**
	 * Returns the meta object for class '{@link ros.RelativeNamespace <em>Relative Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Namespace</em>'.
	 * @see ros.RelativeNamespace
	 * @generated
	 */
	EClass getRelativeNamespace();

	/**
	 * Returns the meta object for class '{@link ros.PrivateNamespace <em>Private Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Namespace</em>'.
	 * @see ros.PrivateNamespace
	 * @generated
	 */
	EClass getPrivateNamespace();

	/**
	 * Returns the meta object for class '{@link ros.NamespacedElement <em>Namespaced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespaced Element</em>'.
	 * @see ros.NamespacedElement
	 * @generated
	 */
	EClass getNamespacedElement();

	/**
	 * Returns the meta object for the containment reference '{@link ros.NamespacedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace</em>'.
	 * @see ros.NamespacedElement#getNamespace()
	 * @see #getNamespacedElement()
	 * @generated
	 */
	EReference getNamespacedElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link ros.NamespacedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.NamespacedElement#getName()
	 * @see #getNamespacedElement()
	 * @generated
	 */
	EAttribute getNamespacedElement_Name();

	/**
	 * Returns the meta object for class '{@link ros.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see ros.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for class '{@link ros.ParameterListType <em>Parameter List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List Type</em>'.
	 * @see ros.ParameterListType
	 * @generated
	 */
	EClass getParameterListType();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.ParameterListType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see ros.ParameterListType#getSequence()
	 * @see #getParameterListType()
	 * @generated
	 */
	EReference getParameterListType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterListType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterListType#getDefault()
	 * @see #getParameterListType()
	 * @generated
	 */
	EReference getParameterListType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterStructType <em>Parameter Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Type</em>'.
	 * @see ros.ParameterStructType
	 * @generated
	 */
	EClass getParameterStructType();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.ParameterStructType#getParameterstructypetmember <em>Parameterstructypetmember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameterstructypetmember</em>'.
	 * @see ros.ParameterStructType#getParameterstructypetmember()
	 * @see #getParameterStructType()
	 * @generated
	 */
	EReference getParameterStructType_Parameterstructypetmember();

	/**
	 * Returns the meta object for class '{@link ros.ParameterIntegerType <em>Parameter Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Integer Type</em>'.
	 * @see ros.ParameterIntegerType
	 * @generated
	 */
	EClass getParameterIntegerType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterIntegerType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterIntegerType#getDefault()
	 * @see #getParameterIntegerType()
	 * @generated
	 */
	EReference getParameterIntegerType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterStringType <em>Parameter String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String Type</em>'.
	 * @see ros.ParameterStringType
	 * @generated
	 */
	EClass getParameterStringType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterStringType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterStringType#getDefault()
	 * @see #getParameterStringType()
	 * @generated
	 */
	EReference getParameterStringType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterDoubleType <em>Parameter Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Double Type</em>'.
	 * @see ros.ParameterDoubleType
	 * @generated
	 */
	EClass getParameterDoubleType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterDoubleType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterDoubleType#getDefault()
	 * @see #getParameterDoubleType()
	 * @generated
	 */
	EReference getParameterDoubleType_Default();

	/**
	 * Returns the meta object for class '{@link ros.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ros.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link ros.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ros.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ros.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterDateType <em>Parameter Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Date Type</em>'.
	 * @see ros.ParameterDateType
	 * @generated
	 */
	EClass getParameterDateType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterDateType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterDateType#getDefault()
	 * @see #getParameterDateType()
	 * @generated
	 */
	EReference getParameterDateType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterBooleanType <em>Parameter Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Boolean Type</em>'.
	 * @see ros.ParameterBooleanType
	 * @generated
	 */
	EClass getParameterBooleanType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterBooleanType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterBooleanType#getDefault()
	 * @see #getParameterBooleanType()
	 * @generated
	 */
	EReference getParameterBooleanType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterBase64Type <em>Parameter Base64 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Base64 Type</em>'.
	 * @see ros.ParameterBase64Type
	 * @generated
	 */
	EClass getParameterBase64Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterBase64Type#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterBase64Type#getDefault()
	 * @see #getParameterBase64Type()
	 * @generated
	 */
	EReference getParameterBase64Type_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterAnyType <em>Parameter Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Any Type</em>'.
	 * @see ros.ParameterAnyType
	 * @generated
	 */
	EClass getParameterAnyType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterAnyType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterAnyType#getDefault()
	 * @see #getParameterAnyType()
	 * @generated
	 */
	EReference getParameterAnyType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterStructTypeMember <em>Parameter Struct Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Type Member</em>'.
	 * @see ros.ParameterStructTypeMember
	 * @generated
	 */
	EClass getParameterStructTypeMember();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterStructTypeMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.ParameterStructTypeMember#getName()
	 * @see #getParameterStructTypeMember()
	 * @generated
	 */
	EAttribute getParameterStructTypeMember_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterStructTypeMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ros.ParameterStructTypeMember#getType()
	 * @see #getParameterStructTypeMember()
	 * @generated
	 */
	EReference getParameterStructTypeMember_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterStructTypeMember#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterStructTypeMember#getDefault()
	 * @see #getParameterStructTypeMember()
	 * @generated
	 */
	EReference getParameterStructTypeMember_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterArrayType <em>Parameter Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Array Type</em>'.
	 * @see ros.ParameterArrayType
	 * @generated
	 */
	EClass getParameterArrayType();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterArrayType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see ros.ParameterArrayType#getType()
	 * @see #getParameterArrayType()
	 * @generated
	 */
	EReference getParameterArrayType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterArrayType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see ros.ParameterArrayType#getDefault()
	 * @see #getParameterArrayType()
	 * @generated
	 */
	EReference getParameterArrayType_Default();

	/**
	 * Returns the meta object for class '{@link ros.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see ros.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for class '{@link ros.ParameterAny <em>Parameter Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Any</em>'.
	 * @see ros.ParameterAny
	 * @generated
	 */
	EClass getParameterAny();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterAny#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterAny#getValue()
	 * @see #getParameterAny()
	 * @generated
	 */
	EAttribute getParameterAny_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter String</em>'.
	 * @see ros.ParameterString
	 * @generated
	 */
	EClass getParameterString();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterString#getValue()
	 * @see #getParameterString()
	 * @generated
	 */
	EAttribute getParameterString_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterBase64 <em>Parameter Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Base64</em>'.
	 * @see ros.ParameterBase64
	 * @generated
	 */
	EClass getParameterBase64();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterBase64#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterBase64#getValue()
	 * @see #getParameterBase64()
	 * @generated
	 */
	EAttribute getParameterBase64_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterInteger <em>Parameter Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Integer</em>'.
	 * @see ros.ParameterInteger
	 * @generated
	 */
	EClass getParameterInteger();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterInteger#getValue()
	 * @see #getParameterInteger()
	 * @generated
	 */
	EAttribute getParameterInteger_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterDouble <em>Parameter Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Double</em>'.
	 * @see ros.ParameterDouble
	 * @generated
	 */
	EClass getParameterDouble();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterDouble#getValue()
	 * @see #getParameterDouble()
	 * @generated
	 */
	EAttribute getParameterDouble_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterBoolean <em>Parameter Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Boolean</em>'.
	 * @see ros.ParameterBoolean
	 * @generated
	 */
	EClass getParameterBoolean();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterBoolean#isValue()
	 * @see #getParameterBoolean()
	 * @generated
	 */
	EAttribute getParameterBoolean_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterSequence <em>Parameter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Sequence</em>'.
	 * @see ros.ParameterSequence
	 * @generated
	 */
	EClass getParameterSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.ParameterSequence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see ros.ParameterSequence#getValue()
	 * @see #getParameterSequence()
	 * @generated
	 */
	EReference getParameterSequence_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterStruct <em>Parameter Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct</em>'.
	 * @see ros.ParameterStruct
	 * @generated
	 */
	EClass getParameterStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link ros.ParameterStruct#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see ros.ParameterStruct#getValue()
	 * @see #getParameterStruct()
	 * @generated
	 */
	EReference getParameterStruct_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterStructMember <em>Parameter Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Struct Member</em>'.
	 * @see ros.ParameterStructMember
	 * @generated
	 */
	EClass getParameterStructMember();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterStructMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ros.ParameterStructMember#getName()
	 * @see #getParameterStructMember()
	 * @generated
	 */
	EAttribute getParameterStructMember_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ros.ParameterStructMember#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see ros.ParameterStructMember#getValue()
	 * @see #getParameterStructMember()
	 * @generated
	 */
	EReference getParameterStructMember_Value();

	/**
	 * Returns the meta object for class '{@link ros.ParameterDate <em>Parameter Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Date</em>'.
	 * @see ros.ParameterDate
	 * @generated
	 */
	EClass getParameterDate();

	/**
	 * Returns the meta object for the attribute '{@link ros.ParameterDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ros.ParameterDate#getValue()
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
	RosFactory getRosFactory();

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
		 * The meta object literal for the '{@link ros.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.NodeImpl
		 * @see ros.impl.RosPackageImpl#getNode()
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
		 * The meta object literal for the '{@link ros.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.PackageImpl
		 * @see ros.impl.RosPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SPEC = eINSTANCE.getPackage_Spec();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ARTIFACT = eINSTANCE.getPackage_Artifact();

		/**
		 * The meta object literal for the '<em><b>From Git Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__FROM_GIT_REPO = eINSTANCE.getPackage_FromGitRepo();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DEPENDENCY = eINSTANCE.getPackage_Dependency();

		/**
		 * The meta object literal for the '{@link ros.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.DependencyImpl
		 * @see ros.impl.RosPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link ros.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ServiceSpecImpl
		 * @see ros.impl.RosPackageImpl#getServiceSpec()
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
		 * The meta object literal for the '{@link ros.impl.ServiceServerImpl <em>Service Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ServiceServerImpl
		 * @see ros.impl.RosPackageImpl#getServiceServer()
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
		 * The meta object literal for the '{@link ros.impl.TopicSpecImpl <em>Topic Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.TopicSpecImpl
		 * @see ros.impl.RosPackageImpl#getTopicSpec()
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
		 * The meta object literal for the '{@link ros.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.PublisherImpl
		 * @see ros.impl.RosPackageImpl#getPublisher()
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
		 * The meta object literal for the '{@link ros.impl.PackageDependencyImpl <em>Package Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.PackageDependencyImpl
		 * @see ros.impl.RosPackageImpl#getPackageDependency()
		 * @generated
		 */
		EClass PACKAGE_DEPENDENCY = eINSTANCE.getPackageDependency();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DEPENDENCY__PACKAGE = eINSTANCE.getPackageDependency_Package();

		/**
		 * The meta object literal for the '{@link ros.impl.ExternalDependencyImpl <em>External Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ExternalDependencyImpl
		 * @see ros.impl.RosPackageImpl#getExternalDependency()
		 * @generated
		 */
		EClass EXTERNAL_DEPENDENCY = eINSTANCE.getExternalDependency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DEPENDENCY__NAME = eINSTANCE.getExternalDependency_Name();

		/**
		 * The meta object literal for the '{@link ros.impl.CatkinPackageImpl <em>Catkin Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.CatkinPackageImpl
		 * @see ros.impl.RosPackageImpl#getCatkinPackage()
		 * @generated
		 */
		EClass CATKIN_PACKAGE = eINSTANCE.getCatkinPackage();

		/**
		 * The meta object literal for the '{@link ros.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ArtifactImpl
		 * @see ros.impl.RosPackageImpl#getArtifact()
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
		 * The meta object literal for the '{@link ros.impl.SpecBaseImpl <em>Spec Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.SpecBaseImpl
		 * @see ros.impl.RosPackageImpl#getSpecBase()
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
		 * The meta object literal for the '{@link ros.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.SubscriberImpl
		 * @see ros.impl.RosPackageImpl#getSubscriber()
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
		 * The meta object literal for the '{@link ros.impl.ServiceClientImpl <em>Service Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ServiceClientImpl
		 * @see ros.impl.RosPackageImpl#getServiceClient()
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
		 * The meta object literal for the '{@link ros.impl.PackageSetImpl <em>Package Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.PackageSetImpl
		 * @see ros.impl.RosPackageImpl#getPackageSet()
		 * @generated
		 */
		EClass PACKAGE_SET = eINSTANCE.getPackageSet();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_SET__PACKAGE = eINSTANCE.getPackageSet_Package();

		/**
		 * The meta object literal for the '{@link ros.impl.ActionSpecImpl <em>Action Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ActionSpecImpl
		 * @see ros.impl.RosPackageImpl#getActionSpec()
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
		 * The meta object literal for the '{@link ros.impl.ActionServerImpl <em>Action Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ActionServerImpl
		 * @see ros.impl.RosPackageImpl#getActionServer()
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
		 * The meta object literal for the '{@link ros.impl.ActionClientImpl <em>Action Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ActionClientImpl
		 * @see ros.impl.RosPackageImpl#getActionClient()
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
		 * The meta object literal for the '{@link ros.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.MessageDefinitionImpl
		 * @see ros.impl.RosPackageImpl#getMessageDefinition()
		 * @generated
		 */
		EClass MESSAGE_DEFINITION = eINSTANCE.getMessageDefinition();

		/**
		 * The meta object literal for the '<em><b>Message Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DEFINITION__MESSAGE_PART = eINSTANCE.getMessageDefinition_MessagePart();

		/**
		 * The meta object literal for the '{@link ros.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.NamespaceImpl
		 * @see ros.impl.RosPackageImpl#getNamespace()
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
		 * The meta object literal for the '{@link ros.impl.GlobalNamespaceImpl <em>Global Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.GlobalNamespaceImpl
		 * @see ros.impl.RosPackageImpl#getGlobalNamespace()
		 * @generated
		 */
		EClass GLOBAL_NAMESPACE = eINSTANCE.getGlobalNamespace();

		/**
		 * The meta object literal for the '{@link ros.impl.RelativeNamespaceImpl <em>Relative Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.RelativeNamespaceImpl
		 * @see ros.impl.RosPackageImpl#getRelativeNamespace()
		 * @generated
		 */
		EClass RELATIVE_NAMESPACE = eINSTANCE.getRelativeNamespace();

		/**
		 * The meta object literal for the '{@link ros.impl.PrivateNamespaceImpl <em>Private Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.PrivateNamespaceImpl
		 * @see ros.impl.RosPackageImpl#getPrivateNamespace()
		 * @generated
		 */
		EClass PRIVATE_NAMESPACE = eINSTANCE.getPrivateNamespace();

		/**
		 * The meta object literal for the '{@link ros.impl.NamespacedElementImpl <em>Namespaced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.NamespacedElementImpl
		 * @see ros.impl.RosPackageImpl#getNamespacedElement()
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
		 * The meta object literal for the '{@link ros.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link ros.impl.ParameterListTypeImpl <em>Parameter List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterListTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterListType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterStructTypeImpl <em>Parameter Struct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterStructTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterStructType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterIntegerTypeImpl <em>Parameter Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterIntegerTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterIntegerType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterStringTypeImpl <em>Parameter String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterStringTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterStringType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterDoubleTypeImpl <em>Parameter Double Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterDoubleTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterDoubleType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterImpl
		 * @see ros.impl.RosPackageImpl#getParameter()
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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link ros.impl.ParameterDateTypeImpl <em>Parameter Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterDateTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterDateType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterBooleanTypeImpl <em>Parameter Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterBooleanTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterBooleanType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterBase64TypeImpl <em>Parameter Base64 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterBase64TypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterBase64Type()
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
		 * The meta object literal for the '{@link ros.impl.ParameterAnyTypeImpl <em>Parameter Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterAnyTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterAnyType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterStructTypeMemberImpl <em>Parameter Struct Type Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterStructTypeMemberImpl
		 * @see ros.impl.RosPackageImpl#getParameterStructTypeMember()
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
		 * The meta object literal for the '{@link ros.impl.ParameterArrayTypeImpl <em>Parameter Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterArrayTypeImpl
		 * @see ros.impl.RosPackageImpl#getParameterArrayType()
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
		 * The meta object literal for the '{@link ros.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterValueImpl
		 * @see ros.impl.RosPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '{@link ros.impl.ParameterAnyImpl <em>Parameter Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterAnyImpl
		 * @see ros.impl.RosPackageImpl#getParameterAny()
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
		 * The meta object literal for the '{@link ros.impl.ParameterStringImpl <em>Parameter String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterStringImpl
		 * @see ros.impl.RosPackageImpl#getParameterString()
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
		 * The meta object literal for the '{@link ros.impl.ParameterBase64Impl <em>Parameter Base64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterBase64Impl
		 * @see ros.impl.RosPackageImpl#getParameterBase64()
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
		 * The meta object literal for the '{@link ros.impl.ParameterIntegerImpl <em>Parameter Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterIntegerImpl
		 * @see ros.impl.RosPackageImpl#getParameterInteger()
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
		 * The meta object literal for the '{@link ros.impl.ParameterDoubleImpl <em>Parameter Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterDoubleImpl
		 * @see ros.impl.RosPackageImpl#getParameterDouble()
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
		 * The meta object literal for the '{@link ros.impl.ParameterBooleanImpl <em>Parameter Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterBooleanImpl
		 * @see ros.impl.RosPackageImpl#getParameterBoolean()
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
		 * The meta object literal for the '{@link ros.impl.ParameterSequenceImpl <em>Parameter Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterSequenceImpl
		 * @see ros.impl.RosPackageImpl#getParameterSequence()
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
		 * The meta object literal for the '{@link ros.impl.ParameterStructImpl <em>Parameter Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterStructImpl
		 * @see ros.impl.RosPackageImpl#getParameterStruct()
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
		 * The meta object literal for the '{@link ros.impl.ParameterStructMemberImpl <em>Parameter Struct Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterStructMemberImpl
		 * @see ros.impl.RosPackageImpl#getParameterStructMember()
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
		 * The meta object literal for the '{@link ros.impl.ParameterDateImpl <em>Parameter Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ros.impl.ParameterDateImpl
		 * @see ros.impl.RosPackageImpl#getParameterDate()
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
		 * @see ros.impl.RosPackageImpl#getGraphName()
		 * @generated
		 */
		EDataType GRAPH_NAME = eINSTANCE.getGraphName();

	}

} //RosPackage
