/**
 */
package rossystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rossystem.ActionConnection;
import rossystem.Connections;
import rossystem.RosActionClient;
import rossystem.RosActionServer;
import rossystem.RosInterface;
import rossystem.RosInterfaces;
import rossystem.RosNode;
import rossystem.RosParameter;
import rossystem.RosPublisher;
import rossystem.RosServiceClient;
import rossystem.RosServiceServer;
import rossystem.RosSubscriber;
import rossystem.RosSystem;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;
import rossystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rossystem.RossystemPackage
 * @generated
 */
public class RossystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RossystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RossystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RossystemPackage.eINSTANCE;
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
	protected RossystemSwitch<Adapter> modelSwitch =
		new RossystemSwitch<Adapter>() {
			@Override
			public Adapter caseRosSystem(RosSystem object) {
				return createRosSystemAdapter();
			}
			@Override
			public Adapter caseRosNode(RosNode object) {
				return createRosNodeAdapter();
			}
			@Override
			public Adapter caseRosInterfaces(RosInterfaces object) {
				return createRosInterfacesAdapter();
			}
			@Override
			public Adapter caseRosInterface(RosInterface object) {
				return createRosInterfaceAdapter();
			}
			@Override
			public Adapter caseRosPublisher(RosPublisher object) {
				return createRosPublisherAdapter();
			}
			@Override
			public Adapter caseRosSubscriber(RosSubscriber object) {
				return createRosSubscriberAdapter();
			}
			@Override
			public Adapter caseRosServiceServer(RosServiceServer object) {
				return createRosServiceServerAdapter();
			}
			@Override
			public Adapter caseRosServiceClient(RosServiceClient object) {
				return createRosServiceClientAdapter();
			}
			@Override
			public Adapter caseRosActionServer(RosActionServer object) {
				return createRosActionServerAdapter();
			}
			@Override
			public Adapter caseRosActionClient(RosActionClient object) {
				return createRosActionClientAdapter();
			}
			@Override
			public Adapter caseRosParameter(RosParameter object) {
				return createRosParameterAdapter();
			}
			@Override
			public Adapter caseProcess(rossystem.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseTopicConnection(TopicConnection object) {
				return createTopicConnectionAdapter();
			}
			@Override
			public Adapter caseServiceConnection(ServiceConnection object) {
				return createServiceConnectionAdapter();
			}
			@Override
			public Adapter caseActionConnection(ActionConnection object) {
				return createActionConnectionAdapter();
			}
			@Override
			public Adapter caseConnections(Connections object) {
				return createConnectionsAdapter();
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
	 * Creates a new adapter for an object of class '{@link rossystem.RosSystem <em>Ros System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosSystem
	 * @generated
	 */
	public Adapter createRosSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosNode <em>Ros Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosNode
	 * @generated
	 */
	public Adapter createRosNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosInterfaces <em>Ros Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosInterfaces
	 * @generated
	 */
	public Adapter createRosInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosInterface <em>Ros Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosInterface
	 * @generated
	 */
	public Adapter createRosInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosPublisher <em>Ros Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosPublisher
	 * @generated
	 */
	public Adapter createRosPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosSubscriber <em>Ros Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosSubscriber
	 * @generated
	 */
	public Adapter createRosSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosServiceServer <em>Ros Service Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosServiceServer
	 * @generated
	 */
	public Adapter createRosServiceServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosServiceClient <em>Ros Service Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosServiceClient
	 * @generated
	 */
	public Adapter createRosServiceClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosActionServer <em>Ros Action Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosActionServer
	 * @generated
	 */
	public Adapter createRosActionServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosActionClient <em>Ros Action Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosActionClient
	 * @generated
	 */
	public Adapter createRosActionClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.RosParameter <em>Ros Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.RosParameter
	 * @generated
	 */
	public Adapter createRosParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.TopicConnection <em>Topic Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.TopicConnection
	 * @generated
	 */
	public Adapter createTopicConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.ServiceConnection <em>Service Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.ServiceConnection
	 * @generated
	 */
	public Adapter createServiceConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.ActionConnection <em>Action Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.ActionConnection
	 * @generated
	 */
	public Adapter createActionConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.Connections
	 * @generated
	 */
	public Adapter createConnectionsAdapter() {
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

} //RossystemAdapterFactory
