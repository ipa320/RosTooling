/**
 */
package ros1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ros1.ActionClient;
import ros1.ActionServer;
import ros1.ActionSpec;
import ros1.Artifact;
import ros1.CatkinPackage;
import ros1.Dependency;
import ros1.ExternalDependency;
import ros1.GlobalNamespace;
import ros1.MessageDefinition;
import ros1.Namespace;
import ros1.NamespacedElement;
import ros1.Node;
import ros1.PackageDependency;
import ros1.PackageSet;
import ros1.Parameter;
import ros1.ParameterAny;
import ros1.ParameterAnyType;
import ros1.ParameterArrayType;
import ros1.ParameterBase64;
import ros1.ParameterBase64Type;
import ros1.ParameterBoolean;
import ros1.ParameterBooleanType;
import ros1.ParameterDate;
import ros1.ParameterDateType;
import ros1.ParameterDouble;
import ros1.ParameterDoubleType;
import ros1.ParameterInteger;
import ros1.ParameterIntegerType;
import ros1.ParameterListType;
import ros1.ParameterSequence;
import ros1.ParameterString;
import ros1.ParameterStringType;
import ros1.ParameterStruct;
import ros1.ParameterStructMember;
import ros1.ParameterStructType;
import ros1.ParameterStructTypeMember;
import ros1.ParameterType;
import ros1.ParameterValue;
import ros1.PrivateNamespace;
import ros1.Publisher;
import ros1.RelativeNamespace;
import ros1.Ros1Package;
import ros1.ServiceClient;
import ros1.ServiceServer;
import ros1.ServiceSpec;
import ros1.SpecBase;
import ros1.Subscriber;
import ros1.TopicSpec;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ros1.Ros1Package
 * @generated
 */
public class Ros1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ros1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ros1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ros1Package.eINSTANCE;
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
	protected Ros1Switch<Adapter> modelSwitch =
		new Ros1Switch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter casePackage(ros1.Package object) {
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
			public Adapter casePublisher(Publisher object) {
				return createPublisherAdapter();
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
			public Adapter caseNamespacedElement(NamespacedElement object) {
				return createNamespacedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link ros1.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ServiceSpec
	 * @generated
	 */
	public Adapter createServiceSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ServiceServer <em>Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ServiceServer
	 * @generated
	 */
	public Adapter createServiceServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.TopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.TopicSpec
	 * @generated
	 */
	public Adapter createTopicSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.PackageDependency <em>Package Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.PackageDependency
	 * @generated
	 */
	public Adapter createPackageDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ExternalDependency
	 * @generated
	 */
	public Adapter createExternalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.CatkinPackage <em>Catkin Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.CatkinPackage
	 * @generated
	 */
	public Adapter createCatkinPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.SpecBase <em>Spec Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.SpecBase
	 * @generated
	 */
	public Adapter createSpecBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Subscriber
	 * @generated
	 */
	public Adapter createSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ServiceClient <em>Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ServiceClient
	 * @generated
	 */
	public Adapter createServiceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.PackageSet <em>Package Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.PackageSet
	 * @generated
	 */
	public Adapter createPackageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ActionSpec <em>Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ActionSpec
	 * @generated
	 */
	public Adapter createActionSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ActionServer <em>Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ActionServer
	 * @generated
	 */
	public Adapter createActionServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ActionClient <em>Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ActionClient
	 * @generated
	 */
	public Adapter createActionClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.MessageDefinition
	 * @generated
	 */
	public Adapter createMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.GlobalNamespace <em>Global Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.GlobalNamespace
	 * @generated
	 */
	public Adapter createGlobalNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.RelativeNamespace <em>Relative Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.RelativeNamespace
	 * @generated
	 */
	public Adapter createRelativeNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.PrivateNamespace <em>Private Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.PrivateNamespace
	 * @generated
	 */
	public Adapter createPrivateNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.NamespacedElement <em>Namespaced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.NamespacedElement
	 * @generated
	 */
	public Adapter createNamespacedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterListType <em>Parameter List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterListType
	 * @generated
	 */
	public Adapter createParameterListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterStructType <em>Parameter Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterStructType
	 * @generated
	 */
	public Adapter createParameterStructTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterIntegerType <em>Parameter Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterIntegerType
	 * @generated
	 */
	public Adapter createParameterIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterStringType <em>Parameter String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterStringType
	 * @generated
	 */
	public Adapter createParameterStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterDoubleType <em>Parameter Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterDoubleType
	 * @generated
	 */
	public Adapter createParameterDoubleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterDateType <em>Parameter Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterDateType
	 * @generated
	 */
	public Adapter createParameterDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterBooleanType <em>Parameter Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterBooleanType
	 * @generated
	 */
	public Adapter createParameterBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterBase64Type <em>Parameter Base64 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterBase64Type
	 * @generated
	 */
	public Adapter createParameterBase64TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterAnyType <em>Parameter Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterAnyType
	 * @generated
	 */
	public Adapter createParameterAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterStructTypeMember <em>Parameter Struct Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterStructTypeMember
	 * @generated
	 */
	public Adapter createParameterStructTypeMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterArrayType <em>Parameter Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterArrayType
	 * @generated
	 */
	public Adapter createParameterArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterAny <em>Parameter Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterAny
	 * @generated
	 */
	public Adapter createParameterAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterString <em>Parameter String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterString
	 * @generated
	 */
	public Adapter createParameterStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterBase64 <em>Parameter Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterBase64
	 * @generated
	 */
	public Adapter createParameterBase64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterInteger <em>Parameter Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterInteger
	 * @generated
	 */
	public Adapter createParameterIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterDouble <em>Parameter Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterDouble
	 * @generated
	 */
	public Adapter createParameterDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterBoolean <em>Parameter Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterBoolean
	 * @generated
	 */
	public Adapter createParameterBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterSequence <em>Parameter Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterSequence
	 * @generated
	 */
	public Adapter createParameterSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterStruct <em>Parameter Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterStruct
	 * @generated
	 */
	public Adapter createParameterStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterStructMember <em>Parameter Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterStructMember
	 * @generated
	 */
	public Adapter createParameterStructMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ros1.ParameterDate <em>Parameter Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ros1.ParameterDate
	 * @generated
	 */
	public Adapter createParameterDateAdapter() {
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

} //Ros1AdapterFactory
