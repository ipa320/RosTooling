/**
 */
package system.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import system.Component;
import system.ComponentRef;
import system.Connection;
import system.InterfaceReference;
import system.RosActionClientReference;
import system.RosActionServerReference;
import system.RosConnection;
import system.RosInterface;
import system.RosNode;
import system.RosParameter;
import system.RosParameterReference;
import system.RosPublisherReference;
import system.RosServerClientReference;
import system.RosServiceServerReference;
import system.RosSubscriberReference;
import system.Rossystem;
import system.RossystemPackage;

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
 * @see system.RossystemPackage
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
            case RossystemPackage.SYSTEM: {
                system.System system = (system.System)theEObject;
                T result = caseSystem(system);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROSSYSTEM: {
                Rossystem rossystem = (Rossystem)theEObject;
                T result = caseRossystem(rossystem);
                if (result == null) result = caseSystem(rossystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.PROCESS: {
                system.Process process = (system.Process)theEObject;
                T result = caseProcess(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.COMPONENT: {
                Component component = (Component)theEObject;
                T result = caseComponent(component);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.CONNECTION: {
                Connection connection = (Connection)theEObject;
                T result = caseConnection(connection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_NODE: {
                RosNode rosNode = (RosNode)theEObject;
                T result = caseRosNode(rosNode);
                if (result == null) result = caseComponent(rosNode);
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
            case RossystemPackage.ROS_SERVICE_SERVER_REFERENCE: {
                RosServiceServerReference rosServiceServerReference = (RosServiceServerReference)theEObject;
                T result = caseRosServiceServerReference(rosServiceServerReference);
                if (result == null) result = caseInterfaceReference(rosServiceServerReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_SERVER_CLIENT_REFERENCE: {
                RosServerClientReference rosServerClientReference = (RosServerClientReference)theEObject;
                T result = caseRosServerClientReference(rosServerClientReference);
                if (result == null) result = caseInterfaceReference(rosServerClientReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_ACTION_SERVER_REFERENCE: {
                RosActionServerReference rosActionServerReference = (RosActionServerReference)theEObject;
                T result = caseRosActionServerReference(rosActionServerReference);
                if (result == null) result = caseInterfaceReference(rosActionServerReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_ACTION_CLIENT_REFERENCE: {
                RosActionClientReference rosActionClientReference = (RosActionClientReference)theEObject;
                T result = caseRosActionClientReference(rosActionClientReference);
                if (result == null) result = caseInterfaceReference(rosActionClientReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_PARAMETER_REFERENCE: {
                RosParameterReference rosParameterReference = (RosParameterReference)theEObject;
                T result = caseRosParameterReference(rosParameterReference);
                if (result == null) result = caseInterfaceReference(rosParameterReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_PARAMETER: {
                RosParameter rosParameter = (RosParameter)theEObject;
                T result = caseRosParameter(rosParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.ROS_CONNECTION: {
                RosConnection rosConnection = (RosConnection)theEObject;
                T result = caseRosConnection(rosConnection);
                if (result == null) result = caseConnection(rosConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RossystemPackage.COMPONENT_REF: {
                ComponentRef componentRef = (ComponentRef)theEObject;
                T result = caseComponentRef(componentRef);
                if (result == null) result = caseComponent(componentRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystem(system.System object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rossystem</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rossystem</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRossystem(Rossystem object) {
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
    public T caseProcess(system.Process object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponent(Component object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnection(Connection object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Ros Service Server Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ros Service Server Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRosServiceServerReference(RosServiceServerReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ros Server Client Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ros Server Client Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRosServerClientReference(RosServerClientReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ros Action Server Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ros Action Server Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRosActionServerReference(RosActionServerReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ros Action Client Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ros Action Client Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRosActionClientReference(RosActionClientReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ros Parameter Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ros Parameter Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRosParameterReference(RosParameterReference object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Component Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponentRef(ComponentRef object) {
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
