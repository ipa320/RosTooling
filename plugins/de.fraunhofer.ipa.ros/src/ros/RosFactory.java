/**
 */
package ros;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ros.RosPackage
 * @generated
 */
public interface RosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosFactory eINSTANCE = ros.impl.RosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Spec</em>'.
	 * @generated
	 */
	ServiceSpec createServiceSpec();

	/**
	 * Returns a new object of class '<em>Service Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Server</em>'.
	 * @generated
	 */
	ServiceServer createServiceServer();

	/**
	 * Returns a new object of class '<em>Topic Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Spec</em>'.
	 * @generated
	 */
	TopicSpec createTopicSpec();

	/**
	 * Returns a new object of class '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher</em>'.
	 * @generated
	 */
	Publisher createPublisher();

	/**
	 * Returns a new object of class '<em>Package Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Dependency</em>'.
	 * @generated
	 */
	PackageDependency createPackageDependency();

	/**
	 * Returns a new object of class '<em>External Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Dependency</em>'.
	 * @generated
	 */
	ExternalDependency createExternalDependency();

	/**
	 * Returns a new object of class '<em>Catkin Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catkin Package</em>'.
	 * @generated
	 */
	CatkinPackage createCatkinPackage();

	/**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
	Artifact createArtifact();

	/**
	 * Returns a new object of class '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscriber</em>'.
	 * @generated
	 */
	Subscriber createSubscriber();

	/**
	 * Returns a new object of class '<em>Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Client</em>'.
	 * @generated
	 */
	ServiceClient createServiceClient();

	/**
	 * Returns a new object of class '<em>Package Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Set</em>'.
	 * @generated
	 */
	PackageSet createPackageSet();

	/**
	 * Returns a new object of class '<em>Action Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Spec</em>'.
	 * @generated
	 */
	ActionSpec createActionSpec();

	/**
	 * Returns a new object of class '<em>Action Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Server</em>'.
	 * @generated
	 */
	ActionServer createActionServer();

	/**
	 * Returns a new object of class '<em>Action Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Client</em>'.
	 * @generated
	 */
	ActionClient createActionClient();

	/**
	 * Returns a new object of class '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Definition</em>'.
	 * @generated
	 */
	MessageDefinition createMessageDefinition();

	/**
	 * Returns a new object of class '<em>Global Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Namespace</em>'.
	 * @generated
	 */
	GlobalNamespace createGlobalNamespace();

	/**
	 * Returns a new object of class '<em>Relative Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Namespace</em>'.
	 * @generated
	 */
	RelativeNamespace createRelativeNamespace();

	/**
	 * Returns a new object of class '<em>Private Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Namespace</em>'.
	 * @generated
	 */
	PrivateNamespace createPrivateNamespace();

	/**
	 * Returns a new object of class '<em>Namespaced Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespaced Element</em>'.
	 * @generated
	 */
	NamespacedElement createNamespacedElement();

	/**
	 * Returns a new object of class '<em>Parameter List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List Type</em>'.
	 * @generated
	 */
	ParameterListType createParameterListType();

	/**
	 * Returns a new object of class '<em>Parameter Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Struct Type</em>'.
	 * @generated
	 */
	ParameterStructType createParameterStructType();

	/**
	 * Returns a new object of class '<em>Parameter Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Integer Type</em>'.
	 * @generated
	 */
	ParameterIntegerType createParameterIntegerType();

	/**
	 * Returns a new object of class '<em>Parameter String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter String Type</em>'.
	 * @generated
	 */
	ParameterStringType createParameterStringType();

	/**
	 * Returns a new object of class '<em>Parameter Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Double Type</em>'.
	 * @generated
	 */
	ParameterDoubleType createParameterDoubleType();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Parameter Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Date Type</em>'.
	 * @generated
	 */
	ParameterDateType createParameterDateType();

	/**
	 * Returns a new object of class '<em>Parameter Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Boolean Type</em>'.
	 * @generated
	 */
	ParameterBooleanType createParameterBooleanType();

	/**
	 * Returns a new object of class '<em>Parameter Base64 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Base64 Type</em>'.
	 * @generated
	 */
	ParameterBase64Type createParameterBase64Type();

	/**
	 * Returns a new object of class '<em>Parameter Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Any Type</em>'.
	 * @generated
	 */
	ParameterAnyType createParameterAnyType();

	/**
	 * Returns a new object of class '<em>Parameter Struct Type Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Struct Type Member</em>'.
	 * @generated
	 */
	ParameterStructTypeMember createParameterStructTypeMember();

	/**
	 * Returns a new object of class '<em>Parameter Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Array Type</em>'.
	 * @generated
	 */
	ParameterArrayType createParameterArrayType();

	/**
	 * Returns a new object of class '<em>Parameter Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Any</em>'.
	 * @generated
	 */
	ParameterAny createParameterAny();

	/**
	 * Returns a new object of class '<em>Parameter String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter String</em>'.
	 * @generated
	 */
	ParameterString createParameterString();

	/**
	 * Returns a new object of class '<em>Parameter Base64</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Base64</em>'.
	 * @generated
	 */
	ParameterBase64 createParameterBase64();

	/**
	 * Returns a new object of class '<em>Parameter Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Integer</em>'.
	 * @generated
	 */
	ParameterInteger createParameterInteger();

	/**
	 * Returns a new object of class '<em>Parameter Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Double</em>'.
	 * @generated
	 */
	ParameterDouble createParameterDouble();

	/**
	 * Returns a new object of class '<em>Parameter Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Boolean</em>'.
	 * @generated
	 */
	ParameterBoolean createParameterBoolean();

	/**
	 * Returns a new object of class '<em>Parameter Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Sequence</em>'.
	 * @generated
	 */
	ParameterSequence createParameterSequence();

	/**
	 * Returns a new object of class '<em>Parameter Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Struct</em>'.
	 * @generated
	 */
	ParameterStruct createParameterStruct();

	/**
	 * Returns a new object of class '<em>Parameter Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Struct Member</em>'.
	 * @generated
	 */
	ParameterStructMember createParameterStructMember();

	/**
	 * Returns a new object of class '<em>Parameter Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Date</em>'.
	 * @generated
	 */
	ParameterDate createParameterDate();

	/**
	 * Returns a new object of class '<em>Ament Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ament Package</em>'.
	 * @generated
	 */
	AmentPackage createAmentPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RosPackage getRosPackage();

} //RosFactory
