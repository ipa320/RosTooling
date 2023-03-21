/**
 */
package rossystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import rossystem.InterfaceReference;
import rossystem.RosActionClientReference;
import rossystem.RosActionServerReference;
import rossystem.RosConnection;
import rossystem.RosInterface;
import rossystem.RosNode;
import rossystem.RosParameter;
import rossystem.RosParameterReference;
import rossystem.RosPublisherReference;
import rossystem.RosServerClientReference;
import rossystem.RosServiceServerReference;
import rossystem.RosSubscriberReference;
import rossystem.RosSystem;
import rossystem.RossystemPackage;

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
            public Adapter caseProcess(rossystem.Process object) {
                return createProcessAdapter();
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
     * Creates a new adapter for an object of class '{@link rossystem.InterfaceReference <em>Interface Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.InterfaceReference
     * @generated
     */
    public Adapter createInterfaceReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosPublisherReference <em>Ros Publisher Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosPublisherReference
     * @generated
     */
    public Adapter createRosPublisherReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosSubscriberReference <em>Ros Subscriber Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosSubscriberReference
     * @generated
     */
    public Adapter createRosSubscriberReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosServiceServerReference <em>Ros Service Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosServiceServerReference
     * @generated
     */
    public Adapter createRosServiceServerReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosServerClientReference <em>Ros Server Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosServerClientReference
     * @generated
     */
    public Adapter createRosServerClientReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosActionServerReference <em>Ros Action Server Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosActionServerReference
     * @generated
     */
    public Adapter createRosActionServerReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosActionClientReference <em>Ros Action Client Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosActionClientReference
     * @generated
     */
    public Adapter createRosActionClientReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosConnection <em>Ros Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosConnection
     * @generated
     */
    public Adapter createRosConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rossystem.RosParameterReference <em>Ros Parameter Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rossystem.RosParameterReference
     * @generated
     */
    public Adapter createRosParameterReferenceAdapter() {
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
