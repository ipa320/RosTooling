/**
 */
package system.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import system.InterfaceReference;
import system.RosActionClientReference;
import system.RosActionConnection;
import system.RosActionServerReference;
import system.RosConnection;
import system.RosInterface;
import system.RosNode;
import system.RosParameter;
import system.RosParameterReference;
import system.RosPublisherReference;
import system.RosServiceClientReference;
import system.RosServiceConnection;
import system.RosServiceServerReference;
import system.RosSubscriberReference;
import system.RosSystemConnection;
import system.RosTopicConnection;
import system.Rossystem;
import system.RossystemFactory;
import system.RossystemPackage;
import system.SubSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RossystemFactoryImpl extends EFactoryImpl implements RossystemFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RossystemFactory init() {
        try {
            RossystemFactory theRossystemFactory = (RossystemFactory)EPackage.Registry.INSTANCE.getEFactory(RossystemPackage.eNS_URI);
            if (theRossystemFactory != null) {
                return theRossystemFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RossystemFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RossystemFactoryImpl() {
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
            case RossystemPackage.SYSTEM: return createSystem();
            case RossystemPackage.ROSSYSTEM: return createRossystem();
            case RossystemPackage.PROCESS: return createProcess();
            case RossystemPackage.ROS_NODE: return createRosNode();
            case RossystemPackage.ROS_INTERFACE: return createRosInterface();
            case RossystemPackage.INTERFACE_REFERENCE: return createInterfaceReference();
            case RossystemPackage.ROS_PUBLISHER_REFERENCE: return createRosPublisherReference();
            case RossystemPackage.ROS_SUBSCRIBER_REFERENCE: return createRosSubscriberReference();
            case RossystemPackage.ROS_SERVICE_SERVER_REFERENCE: return createRosServiceServerReference();
            case RossystemPackage.ROS_SERVICE_CLIENT_REFERENCE: return createRosServiceClientReference();
            case RossystemPackage.ROS_ACTION_SERVER_REFERENCE: return createRosActionServerReference();
            case RossystemPackage.ROS_ACTION_CLIENT_REFERENCE: return createRosActionClientReference();
            case RossystemPackage.ROS_PARAMETER_REFERENCE: return createRosParameterReference();
            case RossystemPackage.ROS_PARAMETER: return createRosParameter();
            case RossystemPackage.ROS_SYSTEM_CONNECTION: return createRosSystemConnection();
            case RossystemPackage.ROS_CONNECTION: return createRosConnection();
            case RossystemPackage.ROS_TOPIC_CONNECTION: return createRosTopicConnection();
            case RossystemPackage.ROS_SERVICE_CONNECTION: return createRosServiceConnection();
            case RossystemPackage.ROS_ACTION_CONNECTION: return createRosActionConnection();
            case RossystemPackage.SUB_SYSTEM: return createSubSystem();
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
    public system.System createSystem() {
        SystemImpl system = new SystemImpl();
        return system;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Rossystem createRossystem() {
        RossystemImpl rossystem = new RossystemImpl();
        return rossystem;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public system.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosNode createRosNode() {
        RosNodeImpl rosNode = new RosNodeImpl();
        return rosNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosInterface createRosInterface() {
        RosInterfaceImpl rosInterface = new RosInterfaceImpl();
        return rosInterface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InterfaceReference createInterfaceReference() {
        InterfaceReferenceImpl interfaceReference = new InterfaceReferenceImpl();
        return interfaceReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosPublisherReference createRosPublisherReference() {
        RosPublisherReferenceImpl rosPublisherReference = new RosPublisherReferenceImpl();
        return rosPublisherReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosSubscriberReference createRosSubscriberReference() {
        RosSubscriberReferenceImpl rosSubscriberReference = new RosSubscriberReferenceImpl();
        return rosSubscriberReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosServiceServerReference createRosServiceServerReference() {
        RosServiceServerReferenceImpl rosServiceServerReference = new RosServiceServerReferenceImpl();
        return rosServiceServerReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosServiceClientReference createRosServiceClientReference() {
        RosServiceClientReferenceImpl rosServiceClientReference = new RosServiceClientReferenceImpl();
        return rosServiceClientReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosActionServerReference createRosActionServerReference() {
        RosActionServerReferenceImpl rosActionServerReference = new RosActionServerReferenceImpl();
        return rosActionServerReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosActionClientReference createRosActionClientReference() {
        RosActionClientReferenceImpl rosActionClientReference = new RosActionClientReferenceImpl();
        return rosActionClientReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosParameterReference createRosParameterReference() {
        RosParameterReferenceImpl rosParameterReference = new RosParameterReferenceImpl();
        return rosParameterReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosParameter createRosParameter() {
        RosParameterImpl rosParameter = new RosParameterImpl();
        return rosParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosSystemConnection createRosSystemConnection() {
        RosSystemConnectionImpl rosSystemConnection = new RosSystemConnectionImpl();
        return rosSystemConnection;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosConnection createRosConnection() {
        RosConnectionImpl rosConnection = new RosConnectionImpl();
        return rosConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosTopicConnection createRosTopicConnection() {
        RosTopicConnectionImpl rosTopicConnection = new RosTopicConnectionImpl();
        return rosTopicConnection;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosServiceConnection createRosServiceConnection() {
        RosServiceConnectionImpl rosServiceConnection = new RosServiceConnectionImpl();
        return rosServiceConnection;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RosActionConnection createRosActionConnection() {
        RosActionConnectionImpl rosActionConnection = new RosActionConnectionImpl();
        return rosActionConnection;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubSystem createSubSystem() {
        SubSystemImpl subSystem = new SubSystemImpl();
        return subSystem;
    }

                                                                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RossystemPackage getRossystemPackage() {
        return (RossystemPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RossystemPackage getPackage() {
        return RossystemPackage.eINSTANCE;
    }

} //RossystemFactoryImpl
