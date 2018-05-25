/**
 */
package ros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ros.ActionClient;
import ros.ActionServer;
import ros.ActionSpec;
import ros.Artifact;
import ros.CatkinPackage;
import ros.ExternalDependency;
import ros.GlobalNamespace;
import ros.MessageDefinition;
import ros.NamespacedElement;
import ros.Node;
import ros.PackageDependency;
import ros.PackageSet;
import ros.Parameter;
import ros.ParameterAny;
import ros.ParameterAnyType;
import ros.ParameterArrayType;
import ros.ParameterBase64;
import ros.ParameterBase64Type;
import ros.ParameterBoolean;
import ros.ParameterBooleanType;
import ros.ParameterDate;
import ros.ParameterDateType;
import ros.ParameterDouble;
import ros.ParameterDoubleType;
import ros.ParameterInteger;
import ros.ParameterIntegerType;
import ros.ParameterListType;
import ros.ParameterSequence;
import ros.ParameterString;
import ros.ParameterStringType;
import ros.ParameterStruct;
import ros.ParameterStructMember;
import ros.ParameterStructType;
import ros.ParameterStructTypeMember;
import ros.PrivateNamespace;
import ros.Publisher;
import ros.RelativeNamespace;
import ros.Ros1Factory;
import ros.Ros1Package;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.ServiceSpec;
import ros.Subscriber;
import ros.TopicSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ros1FactoryImpl extends EFactoryImpl implements Ros1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ros1Factory init() {
		try {
			Ros1Factory theRos1Factory = (Ros1Factory)EPackage.Registry.INSTANCE.getEFactory(Ros1Package.eNS_URI);
			if (theRos1Factory != null) {
				return theRos1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ros1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ros1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ros1Package.NODE: return createNode();
			case Ros1Package.PACKAGE: return createPackage();
			case Ros1Package.SERVICE_SPEC: return createServiceSpec();
			case Ros1Package.SERVICE_SERVER: return createServiceServer();
			case Ros1Package.TOPIC_SPEC: return createTopicSpec();
			case Ros1Package.PUBLISHER: return createPublisher();
			case Ros1Package.PACKAGE_DEPENDENCY: return createPackageDependency();
			case Ros1Package.EXTERNAL_DEPENDENCY: return createExternalDependency();
			case Ros1Package.CATKIN_PACKAGE: return createCatkinPackage();
			case Ros1Package.ARTIFACT: return createArtifact();
			case Ros1Package.SUBSCRIBER: return createSubscriber();
			case Ros1Package.SERVICE_CLIENT: return createServiceClient();
			case Ros1Package.PACKAGE_SET: return createPackageSet();
			case Ros1Package.ACTION_SPEC: return createActionSpec();
			case Ros1Package.ACTION_SERVER: return createActionServer();
			case Ros1Package.ACTION_CLIENT: return createActionClient();
			case Ros1Package.MESSAGE_DEFINITION: return createMessageDefinition();
			case Ros1Package.GLOBAL_NAMESPACE: return createGlobalNamespace();
			case Ros1Package.RELATIVE_NAMESPACE: return createRelativeNamespace();
			case Ros1Package.PRIVATE_NAMESPACE: return createPrivateNamespace();
			case Ros1Package.NAMESPACED_ELEMENT: return createNamespacedElement();
			case Ros1Package.PARAMETER_LIST_TYPE: return createParameterListType();
			case Ros1Package.PARAMETER_STRUCT_TYPE: return createParameterStructType();
			case Ros1Package.PARAMETER_INTEGER_TYPE: return createParameterIntegerType();
			case Ros1Package.PARAMETER_STRING_TYPE: return createParameterStringType();
			case Ros1Package.PARAMETER_DOUBLE_TYPE: return createParameterDoubleType();
			case Ros1Package.PARAMETER: return createParameter();
			case Ros1Package.PARAMETER_DATE_TYPE: return createParameterDateType();
			case Ros1Package.PARAMETER_BOOLEAN_TYPE: return createParameterBooleanType();
			case Ros1Package.PARAMETER_BASE64_TYPE: return createParameterBase64Type();
			case Ros1Package.PARAMETER_ANY_TYPE: return createParameterAnyType();
			case Ros1Package.PARAMETER_STRUCT_TYPE_MEMBER: return createParameterStructTypeMember();
			case Ros1Package.PARAMETER_ARRAY_TYPE: return createParameterArrayType();
			case Ros1Package.PARAMETER_ANY: return createParameterAny();
			case Ros1Package.PARAMETER_STRING: return createParameterString();
			case Ros1Package.PARAMETER_BASE64: return createParameterBase64();
			case Ros1Package.PARAMETER_INTEGER: return createParameterInteger();
			case Ros1Package.PARAMETER_DOUBLE: return createParameterDouble();
			case Ros1Package.PARAMETER_BOOLEAN: return createParameterBoolean();
			case Ros1Package.PARAMETER_SEQUENCE: return createParameterSequence();
			case Ros1Package.PARAMETER_STRUCT: return createParameterStruct();
			case Ros1Package.PARAMETER_STRUCT_MEMBER: return createParameterStructMember();
			case Ros1Package.PARAMETER_DATE: return createParameterDate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Ros1Package.GRAPH_NAME:
				return createGraphNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Ros1Package.GRAPH_NAME:
				return convertGraphNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSpec createServiceSpec() {
		ServiceSpecImpl serviceSpec = new ServiceSpecImpl();
		return serviceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer createServiceServer() {
		ServiceServerImpl serviceServer = new ServiceServerImpl();
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicSpec createTopicSpec() {
		TopicSpecImpl topicSpec = new TopicSpecImpl();
		return topicSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDependency createPackageDependency() {
		PackageDependencyImpl packageDependency = new PackageDependencyImpl();
		return packageDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDependency createExternalDependency() {
		ExternalDependencyImpl externalDependency = new ExternalDependencyImpl();
		return externalDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatkinPackage createCatkinPackage() {
		CatkinPackageImpl catkinPackage = new CatkinPackageImpl();
		return catkinPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber createSubscriber() {
		SubscriberImpl subscriber = new SubscriberImpl();
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient createServiceClient() {
		ServiceClientImpl serviceClient = new ServiceClientImpl();
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSet createPackageSet() {
		PackageSetImpl packageSet = new PackageSetImpl();
		return packageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSpec createActionSpec() {
		ActionSpecImpl actionSpec = new ActionSpecImpl();
		return actionSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionServer createActionServer() {
		ActionServerImpl actionServer = new ActionServerImpl();
		return actionServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionClient createActionClient() {
		ActionClientImpl actionClient = new ActionClientImpl();
		return actionClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition createMessageDefinition() {
		MessageDefinitionImpl messageDefinition = new MessageDefinitionImpl();
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalNamespace createGlobalNamespace() {
		GlobalNamespaceImpl globalNamespace = new GlobalNamespaceImpl();
		return globalNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeNamespace createRelativeNamespace() {
		RelativeNamespaceImpl relativeNamespace = new RelativeNamespaceImpl();
		return relativeNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateNamespace createPrivateNamespace() {
		PrivateNamespaceImpl privateNamespace = new PrivateNamespaceImpl();
		return privateNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespacedElement createNamespacedElement() {
		NamespacedElementImpl namespacedElement = new NamespacedElementImpl();
		return namespacedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterListType createParameterListType() {
		ParameterListTypeImpl parameterListType = new ParameterListTypeImpl();
		return parameterListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStructType createParameterStructType() {
		ParameterStructTypeImpl parameterStructType = new ParameterStructTypeImpl();
		return parameterStructType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIntegerType createParameterIntegerType() {
		ParameterIntegerTypeImpl parameterIntegerType = new ParameterIntegerTypeImpl();
		return parameterIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStringType createParameterStringType() {
		ParameterStringTypeImpl parameterStringType = new ParameterStringTypeImpl();
		return parameterStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDoubleType createParameterDoubleType() {
		ParameterDoubleTypeImpl parameterDoubleType = new ParameterDoubleTypeImpl();
		return parameterDoubleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDateType createParameterDateType() {
		ParameterDateTypeImpl parameterDateType = new ParameterDateTypeImpl();
		return parameterDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBooleanType createParameterBooleanType() {
		ParameterBooleanTypeImpl parameterBooleanType = new ParameterBooleanTypeImpl();
		return parameterBooleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBase64Type createParameterBase64Type() {
		ParameterBase64TypeImpl parameterBase64Type = new ParameterBase64TypeImpl();
		return parameterBase64Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAnyType createParameterAnyType() {
		ParameterAnyTypeImpl parameterAnyType = new ParameterAnyTypeImpl();
		return parameterAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStructTypeMember createParameterStructTypeMember() {
		ParameterStructTypeMemberImpl parameterStructTypeMember = new ParameterStructTypeMemberImpl();
		return parameterStructTypeMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterArrayType createParameterArrayType() {
		ParameterArrayTypeImpl parameterArrayType = new ParameterArrayTypeImpl();
		return parameterArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterAny createParameterAny() {
		ParameterAnyImpl parameterAny = new ParameterAnyImpl();
		return parameterAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterString createParameterString() {
		ParameterStringImpl parameterString = new ParameterStringImpl();
		return parameterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBase64 createParameterBase64() {
		ParameterBase64Impl parameterBase64 = new ParameterBase64Impl();
		return parameterBase64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInteger createParameterInteger() {
		ParameterIntegerImpl parameterInteger = new ParameterIntegerImpl();
		return parameterInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDouble createParameterDouble() {
		ParameterDoubleImpl parameterDouble = new ParameterDoubleImpl();
		return parameterDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBoolean createParameterBoolean() {
		ParameterBooleanImpl parameterBoolean = new ParameterBooleanImpl();
		return parameterBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSequence createParameterSequence() {
		ParameterSequenceImpl parameterSequence = new ParameterSequenceImpl();
		return parameterSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStruct createParameterStruct() {
		ParameterStructImpl parameterStruct = new ParameterStructImpl();
		return parameterStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStructMember createParameterStructMember() {
		ParameterStructMemberImpl parameterStructMember = new ParameterStructMemberImpl();
		return parameterStructMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDate createParameterDate() {
		ParameterDateImpl parameterDate = new ParameterDateImpl();
		return parameterDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGraphNameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ros1Package getRos1Package() {
		return (Ros1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ros1Package getPackage() {
		return Ros1Package.eINSTANCE;
	}

} //Ros1FactoryImpl
