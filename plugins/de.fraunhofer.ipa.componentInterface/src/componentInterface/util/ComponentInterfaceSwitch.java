/**
 */
package componentInterface.util;

import componentInterface.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see componentInterface.ComponentInterfacePackage
 * @generated
 */
public class ComponentInterfaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentInterfacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentInterfacePackage.eINSTANCE;
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE: {
				ComponentInterface componentInterface = (ComponentInterface)theEObject;
				T result = caseComponentInterface(componentInterface);
				if (result == null) result = caseNameSpaceComponent(componentInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.ROS_PUBLISHER: {
				RosPublisher rosPublisher = (RosPublisher)theEObject;
				T result = caseRosPublisher(rosPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.ROS_SUBSCRIBER: {
				RosSubscriber rosSubscriber = (RosSubscriber)theEObject;
				T result = caseRosSubscriber(rosSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.ROS_SERVICE_SERVER: {
				RosServiceServer rosServiceServer = (RosServiceServer)theEObject;
				T result = caseRosServiceServer(rosServiceServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT: {
				RosServiceClient rosServiceClient = (RosServiceClient)theEObject;
				T result = caseRosServiceClient(rosServiceClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.NAME_SPACE_COMPONENT: {
				NameSpaceComponent nameSpaceComponent = (NameSpaceComponent)theEObject;
				T result = caseNameSpaceComponent(nameSpaceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.ROS_ACTION_SERVER: {
				RosActionServer rosActionServer = (RosActionServer)theEObject;
				T result = caseRosActionServer(rosActionServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentInterfacePackage.ROS_ACTION_CLIENT: {
				RosActionClient rosActionClient = (RosActionClient)theEObject;
				T result = caseRosActionClient(rosActionClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInterface(ComponentInterface object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Name Space Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Space Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSpaceComponent(NameSpaceComponent object) {
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

} //ComponentInterfaceSwitch
