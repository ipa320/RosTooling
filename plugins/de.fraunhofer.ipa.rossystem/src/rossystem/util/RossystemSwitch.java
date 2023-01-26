/**
 */
package rossystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rossystem.ActionConnection;
import rossystem.Connections;
import rossystem.InterfaceReference;
import rossystem.NamedInterface;
import rossystem.RosActionClient;
import rossystem.RosActionServer;
import rossystem.RosConnection;
import rossystem.RosInterface;
import rossystem.RosInterfaces;
import rossystem.RosNode;
import rossystem.RosParameter;
import rossystem.RosPublisher;
import rossystem.RosPublisherReference;
import rossystem.RosServiceClient;
import rossystem.RosServiceServer;
import rossystem.RosSubscriber;
import rossystem.RosSubscriberReference;
import rossystem.RosSystem;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

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
 * @see rossystem.RossystemPackage
 * @generated
 */
public class RossystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RossystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RossystemSwitch() {
		if (modelPackage == null) {
			modelPackage = RossystemPackage.eINSTANCE;
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
			case RossystemPackage.ROS_SYSTEM: {
				RosSystem rosSystem = (RosSystem)theEObject;
				T result = caseRosSystem(rosSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_NODE: {
				RosNode rosNode = (RosNode)theEObject;
				T result = caseRosNode(rosNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_INTERFACES: {
				RosInterfaces rosInterfaces = (RosInterfaces)theEObject;
				T result = caseRosInterfaces(rosInterfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.NAMED_INTERFACE: {
				NamedInterface namedInterface = (NamedInterface)theEObject;
				T result = caseNamedInterface(namedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_PUBLISHER: {
				RosPublisher rosPublisher = (RosPublisher)theEObject;
				T result = caseRosPublisher(rosPublisher);
				if (result == null) result = caseNamedInterface(rosPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_SUBSCRIBER: {
				RosSubscriber rosSubscriber = (RosSubscriber)theEObject;
				T result = caseRosSubscriber(rosSubscriber);
				if (result == null) result = caseNamedInterface(rosSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_SERVICE_SERVER: {
				RosServiceServer rosServiceServer = (RosServiceServer)theEObject;
				T result = caseRosServiceServer(rosServiceServer);
				if (result == null) result = caseNamedInterface(rosServiceServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_SERVICE_CLIENT: {
				RosServiceClient rosServiceClient = (RosServiceClient)theEObject;
				T result = caseRosServiceClient(rosServiceClient);
				if (result == null) result = caseNamedInterface(rosServiceClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_ACTION_SERVER: {
				RosActionServer rosActionServer = (RosActionServer)theEObject;
				T result = caseRosActionServer(rosActionServer);
				if (result == null) result = caseNamedInterface(rosActionServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_ACTION_CLIENT: {
				RosActionClient rosActionClient = (RosActionClient)theEObject;
				T result = caseRosActionClient(rosActionClient);
				if (result == null) result = caseNamedInterface(rosActionClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_PARAMETER: {
				RosParameter rosParameter = (RosParameter)theEObject;
				T result = caseRosParameter(rosParameter);
				if (result == null) result = caseNamedInterface(rosParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.PROCESS: {
				rossystem.Process process = (rossystem.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.TOPIC_CONNECTION: {
				TopicConnection topicConnection = (TopicConnection)theEObject;
				T result = caseTopicConnection(topicConnection);
				if (result == null) result = caseNamedInterface(topicConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.SERVICE_CONNECTION: {
				ServiceConnection serviceConnection = (ServiceConnection)theEObject;
				T result = caseServiceConnection(serviceConnection);
				if (result == null) result = caseNamedInterface(serviceConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ACTION_CONNECTION: {
				ActionConnection actionConnection = (ActionConnection)theEObject;
				T result = caseActionConnection(actionConnection);
				if (result == null) result = caseNamedInterface(actionConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.CONNECTIONS: {
				Connections connections = (Connections)theEObject;
				T result = caseConnections(connections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_INTERFACE: {
				RosInterface rosInterface = (RosInterface)theEObject;
				T result = caseRosInterface(rosInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.INTERFACE_REFERENCE: {
				InterfaceReference interfaceReference = (InterfaceReference)theEObject;
				T result = caseInterfaceReference(interfaceReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_PUBLISHER_REFERENCE: {
				RosPublisherReference rosPublisherReference = (RosPublisherReference)theEObject;
				T result = caseRosPublisherReference(rosPublisherReference);
				if (result == null) result = caseInterfaceReference(rosPublisherReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_SUBSCRIBER_REFERENCE: {
				RosSubscriberReference rosSubscriberReference = (RosSubscriberReference)theEObject;
				T result = caseRosSubscriberReference(rosSubscriberReference);
				if (result == null) result = caseInterfaceReference(rosSubscriberReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RossystemPackage.ROS_CONNECTION: {
				RosConnection rosConnection = (RosConnection)theEObject;
				T result = caseRosConnection(rosConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosSystem(RosSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosNode(RosNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosInterfaces(RosInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedInterface(NamedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosPublisher(RosPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosSubscriber(RosSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Service Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Service Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosServiceServer(RosServiceServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Service Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Service Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosServiceClient(RosServiceClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Action Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Action Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosActionServer(RosActionServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Action Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Action Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosActionClient(RosActionClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosParameter(RosParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(rossystem.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicConnection(TopicConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConnection(ServiceConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionConnection(ActionConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnections(Connections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosInterface(RosInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceReference(InterfaceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Publisher Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Publisher Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosPublisherReference(RosPublisherReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Subscriber Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Subscriber Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosSubscriberReference(RosSubscriberReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ros Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ros Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRosConnection(RosConnection object) {
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

} //RossystemSwitch
