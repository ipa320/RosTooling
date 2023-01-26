/**
 */
package rossystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rossystem.ActionConnection;
import rossystem.Connections;
import rossystem.InterfaceReference;
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
import rossystem.RossystemFactory;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

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
			case RossystemPackage.ROS_SYSTEM: return createRosSystem();
			case RossystemPackage.ROS_NODE: return createRosNode();
			case RossystemPackage.ROS_INTERFACES: return createRosInterfaces();
			case RossystemPackage.ROS_PUBLISHER: return createRosPublisher();
			case RossystemPackage.ROS_SUBSCRIBER: return createRosSubscriber();
			case RossystemPackage.ROS_SERVICE_SERVER: return createRosServiceServer();
			case RossystemPackage.ROS_SERVICE_CLIENT: return createRosServiceClient();
			case RossystemPackage.ROS_ACTION_SERVER: return createRosActionServer();
			case RossystemPackage.ROS_ACTION_CLIENT: return createRosActionClient();
			case RossystemPackage.ROS_PARAMETER: return createRosParameter();
			case RossystemPackage.PROCESS: return createProcess();
			case RossystemPackage.TOPIC_CONNECTION: return createTopicConnection();
			case RossystemPackage.SERVICE_CONNECTION: return createServiceConnection();
			case RossystemPackage.ACTION_CONNECTION: return createActionConnection();
			case RossystemPackage.CONNECTIONS: return createConnections();
			case RossystemPackage.ROS_INTERFACE: return createRosInterface();
			case RossystemPackage.INTERFACE_REFERENCE: return createInterfaceReference();
			case RossystemPackage.ROS_PUBLISHER_REFERENCE: return createRosPublisherReference();
			case RossystemPackage.ROS_SUBSCRIBER_REFERENCE: return createRosSubscriberReference();
			case RossystemPackage.ROS_CONNECTION: return createRosConnection();
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
	public RosSystem createRosSystem() {
		RosSystemImpl rosSystem = new RosSystemImpl();
		return rosSystem;
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
	public RosInterfaces createRosInterfaces() {
		RosInterfacesImpl rosInterfaces = new RosInterfacesImpl();
		return rosInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosPublisher createRosPublisher() {
		RosPublisherImpl rosPublisher = new RosPublisherImpl();
		return rosPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosSubscriber createRosSubscriber() {
		RosSubscriberImpl rosSubscriber = new RosSubscriberImpl();
		return rosSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosServiceServer createRosServiceServer() {
		RosServiceServerImpl rosServiceServer = new RosServiceServerImpl();
		return rosServiceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosServiceClient createRosServiceClient() {
		RosServiceClientImpl rosServiceClient = new RosServiceClientImpl();
		return rosServiceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosActionServer createRosActionServer() {
		RosActionServerImpl rosActionServer = new RosActionServerImpl();
		return rosActionServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosActionClient createRosActionClient() {
		RosActionClientImpl rosActionClient = new RosActionClientImpl();
		return rosActionClient;
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
	public rossystem.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopicConnection createTopicConnection() {
		TopicConnectionImpl topicConnection = new TopicConnectionImpl();
		return topicConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceConnection createServiceConnection() {
		ServiceConnectionImpl serviceConnection = new ServiceConnectionImpl();
		return serviceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionConnection createActionConnection() {
		ActionConnectionImpl actionConnection = new ActionConnectionImpl();
		return actionConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connections createConnections() {
		ConnectionsImpl connections = new ConnectionsImpl();
		return connections;
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
