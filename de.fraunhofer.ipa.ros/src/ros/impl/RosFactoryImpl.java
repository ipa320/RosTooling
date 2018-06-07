/**
 */
package ros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ros.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosFactoryImpl extends EFactoryImpl implements RosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RosFactory init() {
		try {
			RosFactory theRosFactory = (RosFactory)EPackage.Registry.INSTANCE.getEFactory(RosPackage.eNS_URI);
			if (theRosFactory != null) {
				return theRosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosFactoryImpl() {
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
			case RosPackage.NODE: return createNode();
			case RosPackage.MODEL: return createModel();
			case RosPackage.SERVICE_SPEC: return createServiceSpec();
			case RosPackage.SERVICE_SERVER: return createServiceServer();
			case RosPackage.TOPIC_SPEC: return createTopicSpec();
			case RosPackage.PUBLISHER: return createPublisher();
			case RosPackage.ARTIFACT: return createArtifact();
			case RosPackage.SUBSCRIBER: return createSubscriber();
			case RosPackage.SERVICE_CLIENT: return createServiceClient();
			case RosPackage.PACKAGE_SET: return createPackageSet();
			case RosPackage.ACTION_SPEC: return createActionSpec();
			case RosPackage.ACTION_SERVER: return createActionServer();
			case RosPackage.ACTION_CLIENT: return createActionClient();
			case RosPackage.MESSAGE_DEFINITION: return createMessageDefinition();
			case RosPackage.GLOBAL_NAMESPACE: return createGlobalNamespace();
			case RosPackage.RELATIVE_NAMESPACE: return createRelativeNamespace();
			case RosPackage.PRIVATE_NAMESPACE: return createPrivateNamespace();
			case RosPackage.NAMESPACED_ELEMENT: return createNamespacedElement();
			case RosPackage.PARAMETER_LIST_TYPE: return createParameterListType();
			case RosPackage.PARAMETER_STRUCT_TYPE: return createParameterStructType();
			case RosPackage.PARAMETER_INTEGER_TYPE: return createParameterIntegerType();
			case RosPackage.PARAMETER_STRING_TYPE: return createParameterStringType();
			case RosPackage.PARAMETER_DOUBLE_TYPE: return createParameterDoubleType();
			case RosPackage.PARAMETER: return createParameter();
			case RosPackage.PARAMETER_DATE_TYPE: return createParameterDateType();
			case RosPackage.PARAMETER_BOOLEAN_TYPE: return createParameterBooleanType();
			case RosPackage.PARAMETER_BASE64_TYPE: return createParameterBase64Type();
			case RosPackage.PARAMETER_ANY_TYPE: return createParameterAnyType();
			case RosPackage.PARAMETER_STRUCT_TYPE_MEMBER: return createParameterStructTypeMember();
			case RosPackage.PARAMETER_ARRAY_TYPE: return createParameterArrayType();
			case RosPackage.PARAMETER_ANY: return createParameterAny();
			case RosPackage.PARAMETER_STRING: return createParameterString();
			case RosPackage.PARAMETER_BASE64: return createParameterBase64();
			case RosPackage.PARAMETER_INTEGER: return createParameterInteger();
			case RosPackage.PARAMETER_DOUBLE: return createParameterDouble();
			case RosPackage.PARAMETER_BOOLEAN: return createParameterBoolean();
			case RosPackage.PARAMETER_SEQUENCE: return createParameterSequence();
			case RosPackage.PARAMETER_STRUCT: return createParameterStruct();
			case RosPackage.PARAMETER_STRUCT_MEMBER: return createParameterStructMember();
			case RosPackage.PARAMETER_DATE: return createParameterDate();
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
			case RosPackage.GRAPH_NAME:
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
			case RosPackage.GRAPH_NAME:
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
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
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
	public RosPackage getRosPackage() {
		return (RosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RosPackage getPackage() {
		return RosPackage.eINSTANCE;
	}

} //RosFactoryImpl
