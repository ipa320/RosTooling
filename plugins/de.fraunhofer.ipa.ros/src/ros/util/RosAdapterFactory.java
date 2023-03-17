/**
 */
package ros.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import primitives.AbstractType;
import ros.ActionClient;
import ros.ActionServer;
import ros.ActionSpec;
import ros.AmentPackage;
import ros.ArrayTopicSpecRef;
import ros.Artifact;
import ros.CatkinPackage;
import ros.Dependency;
import ros.ExternalDependency;
import ros.GlobalNamespace;
import ros.InterfaceType;
import ros.MessageDefinition;
import ros.Namespace;
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
import ros.ParameterType;
import ros.ParameterValue;
import ros.PrivateNamespace;
import ros.Publisher;
import ros.QualityOfService;
import ros.RelativeNamespace;
import ros.RosPackage;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.ServiceSpec;
import ros.SpecBase;
import ros.Subscriber;
import ros.TopicSpec;
import ros.TopicSpecRef;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ros.RosPackage
 * @generated
 */
public class RosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosSwitch<Adapter> modelSwitch =
		new RosSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter casePackage(ros.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseServiceSpec(ServiceSpec object) {
				return createServiceSpecAdapter();
			}
			@Override
			public Adapter caseServiceServer(ServiceServer object) {
				return createServiceServerAdapter();
			}
			@Override
			public Adapter caseTopicSpec(TopicSpec object) {
				return createTopicSpecAdapter();
			}
			@Override
			public Adapter casePackageDependency(PackageDependency object) {
				return createPackageDependencyAdapter();
			}
			@Override
			public Adapter caseExternalDependency(ExternalDependency object) {
				return createExternalDependencyAdapter();
			}
			@Override
			public Adapter caseCatkinPackage(CatkinPackage object) {
				return createCatkinPackageAdapter();
			}
			@Override
			public Adapter casePublisher(Publisher object) {
				return createPublisherAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseSpecBase(SpecBase object) {
				return createSpecBaseAdapter();
			}
			@Override
			public Adapter caseSubscriber(Subscriber object) {
				return createSubscriberAdapter();
			}
			@Override
			public Adapter caseServiceClient(ServiceClient object) {
				return createServiceClientAdapter();
			}
			@Override
			public Adapter casePackageSet(PackageSet object) {
				return createPackageSetAdapter();
			}
			@Override
			public Adapter caseActionSpec(ActionSpec object) {
				return createActionSpecAdapter();
			}
			@Override
			public Adapter caseActionServer(ActionServer object) {
				return createActionServerAdapter();
			}
			@Override
			public Adapter caseActionClient(ActionClient object) {
				return createActionClientAdapter();
			}
			@Override
			public Adapter caseMessageDefinition(MessageDefinition object) {
				return createMessageDefinitionAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseGlobalNamespace(GlobalNamespace object) {
				return createGlobalNamespaceAdapter();
			}
			@Override
			public Adapter caseRelativeNamespace(RelativeNamespace object) {
				return createRelativeNamespaceAdapter();
			}
			@Override
			public Adapter casePrivateNamespace(PrivateNamespace object) {
				return createPrivateNamespaceAdapter();
			}
			@Override
			public Adapter caseInterfaceType(InterfaceType object) {
				return createInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParameterListType(ParameterListType object) {
				return createParameterListTypeAdapter();
			}
			@Override
			public Adapter caseParameterStructType(ParameterStructType object) {
				return createParameterStructTypeAdapter();
			}
			@Override
			public Adapter caseParameterIntegerType(ParameterIntegerType object) {
				return createParameterIntegerTypeAdapter();
			}
			@Override
			public Adapter caseParameterStringType(ParameterStringType object) {
				return createParameterStringTypeAdapter();
			}
			@Override
			public Adapter caseParameterDoubleType(ParameterDoubleType object) {
				return createParameterDoubleTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterDateType(ParameterDateType object) {
				return createParameterDateTypeAdapter();
			}
			@Override
			public Adapter caseParameterBooleanType(ParameterBooleanType object) {
				return createParameterBooleanTypeAdapter();
			}
			@Override
			public Adapter caseParameterBase64Type(ParameterBase64Type object) {
				return createParameterBase64TypeAdapter();
			}
			@Override
			public Adapter caseParameterAnyType(ParameterAnyType object) {
				return createParameterAnyTypeAdapter();
			}
			@Override
			public Adapter caseParameterStructTypeMember(ParameterStructTypeMember object) {
				return createParameterStructTypeMemberAdapter();
			}
			@Override
			public Adapter caseParameterArrayType(ParameterArrayType object) {
				return createParameterArrayTypeAdapter();
			}
			@Override
			public Adapter caseParameterValue(ParameterValue object) {
				return createParameterValueAdapter();
			}
			@Override
			public Adapter caseParameterAny(ParameterAny object) {
				return createParameterAnyAdapter();
			}
			@Override
			public Adapter caseParameterString(ParameterString object) {
				return createParameterStringAdapter();
			}
			@Override
			public Adapter caseParameterBase64(ParameterBase64 object) {
				return createParameterBase64Adapter();
			}
			@Override
			public Adapter caseParameterInteger(ParameterInteger object) {
				return createParameterIntegerAdapter();
			}
			@Override
			public Adapter caseParameterDouble(ParameterDouble object) {
				return createParameterDoubleAdapter();
			}
			@Override
			public Adapter caseParameterBoolean(ParameterBoolean object) {
				return createParameterBooleanAdapter();
			}
			@Override
			public Adapter caseParameterSequence(ParameterSequence object) {
				return createParameterSequenceAdapter();
			}
			@Override
			public Adapter caseParameterStruct(ParameterStruct object) {
				return createParameterStructAdapter();
			}
			@Override
			public Adapter caseParameterStructMember(ParameterStructMember object) {
				return createParameterStructMemberAdapter();
			}
			@Override
			public Adapter caseParameterDate(ParameterDate object) {
				return createParameterDateAdapter();
			}
			@Override
			public Adapter caseAmentPackage(AmentPackage object) {
				return createAmentPackageAdapter();
			}
			@Override
			public Adapter caseQualityOfService(QualityOfService object) {
				return createQualityOfServiceAdapter();
			}
			@Override
			public Adapter caseTopicSpecRef(TopicSpecRef object) {
				return createTopicSpecRefAdapter();
			}
			@Override
			public Adapter caseArrayTopicSpecRef(ArrayTopicSpecRef object) {
				return createArrayTopicSpecRefAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ros.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ServiceSpec
	 * @generated
	 */
	public Adapter createServiceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ServiceServer
	 * @generated
	 */
	public Adapter createServiceServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.TopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.TopicSpec
	 * @generated
	 */
	public Adapter createTopicSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.PackageDependency <em>Package Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.PackageDependency
	 * @generated
	 */
	public Adapter createPackageDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ExternalDependency
	 * @generated
	 */
	public Adapter createExternalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.CatkinPackage <em>Catkin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.CatkinPackage
	 * @generated
	 */
	public Adapter createCatkinPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.SpecBase <em>Spec Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.SpecBase
	 * @generated
	 */
	public Adapter createSpecBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Subscriber
	 * @generated
	 */
	public Adapter createSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ServiceClient
	 * @generated
	 */
	public Adapter createServiceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.PackageSet <em>Package Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.PackageSet
	 * @generated
	 */
	public Adapter createPackageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ActionSpec <em>Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ActionSpec
	 * @generated
	 */
	public Adapter createActionSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ActionServer <em>Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ActionServer
	 * @generated
	 */
	public Adapter createActionServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ActionClient <em>Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ActionClient
	 * @generated
	 */
	public Adapter createActionClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.MessageDefinition
	 * @generated
	 */
	public Adapter createMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.GlobalNamespace <em>Global Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.GlobalNamespace
	 * @generated
	 */
	public Adapter createGlobalNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.RelativeNamespace <em>Relative Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.RelativeNamespace
	 * @generated
	 */
	public Adapter createRelativeNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.PrivateNamespace <em>Private Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.PrivateNamespace
	 * @generated
	 */
	public Adapter createPrivateNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterListType <em>Parameter List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterListType
	 * @generated
	 */
	public Adapter createParameterListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterStructType <em>Parameter Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterStructType
	 * @generated
	 */
	public Adapter createParameterStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterIntegerType <em>Parameter Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterIntegerType
	 * @generated
	 */
	public Adapter createParameterIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterStringType <em>Parameter String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterStringType
	 * @generated
	 */
	public Adapter createParameterStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterDoubleType <em>Parameter Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterDoubleType
	 * @generated
	 */
	public Adapter createParameterDoubleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterDateType <em>Parameter Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterDateType
	 * @generated
	 */
	public Adapter createParameterDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterBooleanType <em>Parameter Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterBooleanType
	 * @generated
	 */
	public Adapter createParameterBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterBase64Type <em>Parameter Base64 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterBase64Type
	 * @generated
	 */
	public Adapter createParameterBase64TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterAnyType <em>Parameter Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterAnyType
	 * @generated
	 */
	public Adapter createParameterAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterStructTypeMember <em>Parameter Struct Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterStructTypeMember
	 * @generated
	 */
	public Adapter createParameterStructTypeMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterArrayType <em>Parameter Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterArrayType
	 * @generated
	 */
	public Adapter createParameterArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterAny <em>Parameter Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterAny
	 * @generated
	 */
	public Adapter createParameterAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterString
	 * @generated
	 */
	public Adapter createParameterStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterBase64 <em>Parameter Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterBase64
	 * @generated
	 */
	public Adapter createParameterBase64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterInteger <em>Parameter Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterInteger
	 * @generated
	 */
	public Adapter createParameterIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterDouble <em>Parameter Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterDouble
	 * @generated
	 */
	public Adapter createParameterDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterBoolean <em>Parameter Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterBoolean
	 * @generated
	 */
	public Adapter createParameterBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterSequence <em>Parameter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterSequence
	 * @generated
	 */
	public Adapter createParameterSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterStruct <em>Parameter Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterStruct
	 * @generated
	 */
	public Adapter createParameterStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterStructMember <em>Parameter Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterStructMember
	 * @generated
	 */
	public Adapter createParameterStructMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ParameterDate <em>Parameter Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ParameterDate
	 * @generated
	 */
	public Adapter createParameterDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.AmentPackage <em>Ament Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.AmentPackage
	 * @generated
	 */
	public Adapter createAmentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.QualityOfService <em>Quality Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.QualityOfService
	 * @generated
	 */
	public Adapter createQualityOfServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.TopicSpecRef <em>Topic Spec Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.TopicSpecRef
	 * @generated
	 */
	public Adapter createTopicSpecRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros.ArrayTopicSpecRef <em>Array Topic Spec Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros.ArrayTopicSpecRef
	 * @generated
	 */
	public Adapter createArrayTopicSpecRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RosAdapterFactory
