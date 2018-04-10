/**
 */
package ros1.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ros1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ros1.Ros1Package
 * @generated
 */
public class Ros1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ros1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ros1Switch() {
		if (modelPackage == null) {
			modelPackage = Ros1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ros1Package.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.SERVICE_SPEC: {
				ServiceSpec serviceSpec = (ServiceSpec)theEObject;
				T result = caseServiceSpec(serviceSpec);
				if (result == null) result = caseSpecBase(serviceSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.SERVICE_SERVER: {
				ServiceServer serviceServer = (ServiceServer)theEObject;
				T result = caseServiceServer(serviceServer);
				if (result == null) result = caseNamespacedElement(serviceServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.TOPIC_SPEC: {
				TopicSpec topicSpec = (TopicSpec)theEObject;
				T result = caseTopicSpec(topicSpec);
				if (result == null) result = caseSpecBase(topicSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PUBLISHER: {
				Publisher publisher = (Publisher)theEObject;
				T result = casePublisher(publisher);
				if (result == null) result = caseNamespacedElement(publisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.SPEC_BASE: {
				SpecBase specBase = (SpecBase)theEObject;
				T result = caseSpecBase(specBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.SUBSCRIBER: {
				Subscriber subscriber = (Subscriber)theEObject;
				T result = caseSubscriber(subscriber);
				if (result == null) result = caseNamespacedElement(subscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.SERVICE_CLIENT: {
				ServiceClient serviceClient = (ServiceClient)theEObject;
				T result = caseServiceClient(serviceClient);
				if (result == null) result = caseNamespacedElement(serviceClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PACKAGE_SET: {
				PackageSet packageSet = (PackageSet)theEObject;
				T result = casePackageSet(packageSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.ACTION_SPEC: {
				ActionSpec actionSpec = (ActionSpec)theEObject;
				T result = caseActionSpec(actionSpec);
				if (result == null) result = caseSpecBase(actionSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.ACTION_SERVER: {
				ActionServer actionServer = (ActionServer)theEObject;
				T result = caseActionServer(actionServer);
				if (result == null) result = caseNamespacedElement(actionServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.ACTION_CLIENT: {
				ActionClient actionClient = (ActionClient)theEObject;
				T result = caseActionClient(actionClient);
				if (result == null) result = caseNamespacedElement(actionClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.MESSAGE_DEFINITION: {
				MessageDefinition messageDefinition = (MessageDefinition)theEObject;
				T result = caseMessageDefinition(messageDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.GLOBAL_NAMESPACE: {
				GlobalNamespace globalNamespace = (GlobalNamespace)theEObject;
				T result = caseGlobalNamespace(globalNamespace);
				if (result == null) result = caseNamespace(globalNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.RELATIVE_NAMESPACE: {
				RelativeNamespace relativeNamespace = (RelativeNamespace)theEObject;
				T result = caseRelativeNamespace(relativeNamespace);
				if (result == null) result = caseNamespace(relativeNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PRIVATE_NAMESPACE: {
				PrivateNamespace privateNamespace = (PrivateNamespace)theEObject;
				T result = casePrivateNamespace(privateNamespace);
				if (result == null) result = caseRelativeNamespace(privateNamespace);
				if (result == null) result = caseNamespace(privateNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.NAMESPACED_ELEMENT: {
				NamespacedElement namespacedElement = (NamespacedElement)theEObject;
				T result = caseNamespacedElement(namespacedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_LIST_TYPE: {
				ParameterListType parameterListType = (ParameterListType)theEObject;
				T result = caseParameterListType(parameterListType);
				if (result == null) result = caseParameterType(parameterListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_STRUCT_TYPE: {
				ParameterStructType parameterStructType = (ParameterStructType)theEObject;
				T result = caseParameterStructType(parameterStructType);
				if (result == null) result = caseParameterType(parameterStructType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_INTEGER_TYPE: {
				ParameterIntegerType parameterIntegerType = (ParameterIntegerType)theEObject;
				T result = caseParameterIntegerType(parameterIntegerType);
				if (result == null) result = caseParameterType(parameterIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_STRING_TYPE: {
				ParameterStringType parameterStringType = (ParameterStringType)theEObject;
				T result = caseParameterStringType(parameterStringType);
				if (result == null) result = caseParameterType(parameterStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_DOUBLE_TYPE: {
				ParameterDoubleType parameterDoubleType = (ParameterDoubleType)theEObject;
				T result = caseParameterDoubleType(parameterDoubleType);
				if (result == null) result = caseParameterType(parameterDoubleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamespacedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_DATE_TYPE: {
				ParameterDateType parameterDateType = (ParameterDateType)theEObject;
				T result = caseParameterDateType(parameterDateType);
				if (result == null) result = caseParameterType(parameterDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_BOOLEAN_TYPE: {
				ParameterBooleanType parameterBooleanType = (ParameterBooleanType)theEObject;
				T result = caseParameterBooleanType(parameterBooleanType);
				if (result == null) result = caseParameterType(parameterBooleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_BASE64_TYPE: {
				ParameterBase64Type parameterBase64Type = (ParameterBase64Type)theEObject;
				T result = caseParameterBase64Type(parameterBase64Type);
				if (result == null) result = caseParameterType(parameterBase64Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_ANY_TYPE: {
				ParameterAnyType parameterAnyType = (ParameterAnyType)theEObject;
				T result = caseParameterAnyType(parameterAnyType);
				if (result == null) result = caseParameterType(parameterAnyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_STRUCT_TYPE_MEMBER: {
				ParameterStructTypeMember parameterStructTypeMember = (ParameterStructTypeMember)theEObject;
				T result = caseParameterStructTypeMember(parameterStructTypeMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_ARRAY_TYPE: {
				ParameterArrayType parameterArrayType = (ParameterArrayType)theEObject;
				T result = caseParameterArrayType(parameterArrayType);
				if (result == null) result = caseParameterType(parameterArrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_VALUE: {
				ParameterValue parameterValue = (ParameterValue)theEObject;
				T result = caseParameterValue(parameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_ANY: {
				ParameterAny parameterAny = (ParameterAny)theEObject;
				T result = caseParameterAny(parameterAny);
				if (result == null) result = caseParameterValue(parameterAny);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_STRING: {
				ParameterString parameterString = (ParameterString)theEObject;
				T result = caseParameterString(parameterString);
				if (result == null) result = caseParameterValue(parameterString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_BASE64: {
				ParameterBase64 parameterBase64 = (ParameterBase64)theEObject;
				T result = caseParameterBase64(parameterBase64);
				if (result == null) result = caseParameterValue(parameterBase64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_INTEGER: {
				ParameterInteger parameterInteger = (ParameterInteger)theEObject;
				T result = caseParameterInteger(parameterInteger);
				if (result == null) result = caseParameterValue(parameterInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_DOUBLE: {
				ParameterDouble parameterDouble = (ParameterDouble)theEObject;
				T result = caseParameterDouble(parameterDouble);
				if (result == null) result = caseParameterValue(parameterDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_BOOLEAN: {
				ParameterBoolean parameterBoolean = (ParameterBoolean)theEObject;
				T result = caseParameterBoolean(parameterBoolean);
				if (result == null) result = caseParameterValue(parameterBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_SEQUENCE: {
				ParameterSequence parameterSequence = (ParameterSequence)theEObject;
				T result = caseParameterSequence(parameterSequence);
				if (result == null) result = caseParameterValue(parameterSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_STRUCT: {
				ParameterStruct parameterStruct = (ParameterStruct)theEObject;
				T result = caseParameterStruct(parameterStruct);
				if (result == null) result = caseParameterValue(parameterStruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_STRUCT_MEMBER: {
				ParameterStructMember parameterStructMember = (ParameterStructMember)theEObject;
				T result = caseParameterStructMember(parameterStructMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ros1Package.PARAMETER_DATE: {
				ParameterDate parameterDate = (ParameterDate)theEObject;
				T result = caseParameterDate(parameterDate);
				if (result == null) result = caseParameterValue(parameterDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSpec(ServiceSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceServer(ServiceServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicSpec(TopicSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecBase(SpecBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscriber(Subscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClient(ServiceClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageSet(PackageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSpec(ActionSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionServer(ActionServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionClient(ActionClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinition(MessageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalNamespace(GlobalNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeNamespace(RelativeNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateNamespace(PrivateNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespaced Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespaced Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespacedElement(NamespacedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterListType(ParameterListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterStructType(ParameterStructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterIntegerType(ParameterIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterStringType(ParameterStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Double Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDoubleType(ParameterDoubleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDateType(ParameterDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBooleanType(ParameterBooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Base64 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Base64 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBase64Type(ParameterBase64Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterAnyType(ParameterAnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Struct Type Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Struct Type Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterStructTypeMember(ParameterStructTypeMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterArrayType(ParameterArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue(ParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterAny(ParameterAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterString(ParameterString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Base64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Base64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBase64(ParameterBase64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterInteger(ParameterInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDouble(ParameterDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBoolean(ParameterBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSequence(ParameterSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterStruct(ParameterStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Struct Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterStructMember(ParameterStructMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDate(ParameterDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ros1Switch
