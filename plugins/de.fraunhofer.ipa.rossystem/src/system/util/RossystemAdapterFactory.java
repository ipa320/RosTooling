/**
 */
package system.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import system.Component;
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
import system.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see system.RossystemPackage
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
            public Adapter caseSystem(system.System object) {
                return createSystemAdapter();
            }
            @Override
            public Adapter caseProcess(system.Process object) {
                return createProcessAdapter();
            }
            @Override
            public Adapter caseComponent(Component object) {
                return createComponentAdapter();
            }
            @Override
            public Adapter caseConnection(Connection object) {
                return createConnectionAdapter();
            }
            @Override
            public Adapter caseRosNode(RosNode object) {
                return createRosNodeAdapter();
            }
            @Override
            public Adapter caseRosInterface(RosInterface object) {
                return createRosInterfaceAdapter();
            }
            @Override
            public Adapter caseInterfaceReference(InterfaceReference object) {
                return createInterfaceReferenceAdapter();
            }
            @Override
            public Adapter caseRosPublisherReference(RosPublisherReference object) {
                return createRosPublisherReferenceAdapter();
            }
            @Override
            public Adapter caseRosSubscriberReference(RosSubscriberReference object) {
                return createRosSubscriberReferenceAdapter();
            }
            @Override
            public Adapter caseRosServiceServerReference(RosServiceServerReference object) {
                return createRosServiceServerReferenceAdapter();
            }
            @Override
            public Adapter caseRosServerClientReference(RosServerClientReference object) {
                return createRosServerClientReferenceAdapter();
            }
            @Override
            public Adapter caseRosActionServerReference(RosActionServerReference object) {
                return createRosActionServerReferenceAdapter();
            }
            @Override
            public Adapter caseRosActionClientReference(RosActionClientReference object) {
                return createRosActionClientReferenceAdapter();
            }
            @Override
            public Adapter caseRosParameterReference(RosParameterReference object) {
                return createRosParameterReferenceAdapter();
            }
            @Override
            public Adapter caseRosParameter(RosParameter object) {
                return createRosParameterAdapter();
            }
            @Override
            public Adapter caseRosConnection(RosConnection object) {
                return createRosConnectionAdapter();
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
     * Creates a new adapter for an object of class '{@link system.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.System
     * @generated
     */
    public Adapter createSystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.Connection
     * @generated
     */
    public Adapter createConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosNode <em>Ros Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosNode
     * @generated
     */
    public Adapter createRosNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosInterface <em>Ros Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosInterface
     * @generated
     */
    public Adapter createRosInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.InterfaceReference <em>Interface Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.InterfaceReference
     * @generated
     */
    public Adapter createInterfaceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosPublisherReference <em>Ros Publisher Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosPublisherReference
     * @generated
     */
    public Adapter createRosPublisherReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosSubscriberReference <em>Ros Subscriber Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosSubscriberReference
     * @generated
     */
    public Adapter createRosSubscriberReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosServiceServerReference <em>Ros Service Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosServiceServerReference
     * @generated
     */
    public Adapter createRosServiceServerReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosServerClientReference <em>Ros Server Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosServerClientReference
     * @generated
     */
    public Adapter createRosServerClientReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosActionServerReference <em>Ros Action Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosActionServerReference
     * @generated
     */
    public Adapter createRosActionServerReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosActionClientReference <em>Ros Action Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosActionClientReference
     * @generated
     */
    public Adapter createRosActionClientReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosParameterReference <em>Ros Parameter Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosParameterReference
     * @generated
     */
    public Adapter createRosParameterReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosParameter <em>Ros Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosParameter
     * @generated
     */
    public Adapter createRosParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link system.RosConnection <em>Ros Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see system.RosConnection
     * @generated
     */
    public Adapter createRosConnectionAdapter() {
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
