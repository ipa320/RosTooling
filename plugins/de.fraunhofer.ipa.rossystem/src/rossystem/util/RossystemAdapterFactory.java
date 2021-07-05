/**
 */
package rossystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
			public Adapter caseComponentStack(ComponentStack object) {
				return createComponentStackAdapter();
			}
			@Override
			public Adapter caseQualityAttribute(QualityAttribute object) {
				return createQualityAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link rossystem.ComponentStack <em>Component Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.ComponentStack
	 * @generated
	 */
	public Adapter createComponentStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rossystem.QualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rossystem.QualityAttribute
	 * @generated
	 */
	public Adapter createQualityAttributeAdapter() {
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
