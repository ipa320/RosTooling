/**
 */
package PackageFormat2.util;

import PackageFormat2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PackageFormat2.PackageFormat2Package
 * @generated
 */
public class PackageFormat2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackageFormat2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFormat2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PackageFormat2Package.eINSTANCE;
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
	protected PackageFormat2Switch<Adapter> modelSwitch =
		new PackageFormat2Switch<Adapter>() {
			@Override
			public Adapter caseDependencyType(DependencyType object) {
				return createDependencyTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExportType(ExportType object) {
				return createExportTypeAdapter();
			}
			@Override
			public Adapter casePackageType(PackageType object) {
				return createPackageTypeAdapter();
			}
			@Override
			public Adapter casePersonWithEmailType(PersonWithEmailType object) {
				return createPersonWithEmailTypeAdapter();
			}
			@Override
			public Adapter casePersonWithOptionalEmailType(PersonWithOptionalEmailType object) {
				return createPersonWithOptionalEmailTypeAdapter();
			}
			@Override
			public Adapter caseUrlType(UrlType object) {
				return createUrlTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link PackageFormat2.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.DependencyType
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.ExportType <em>Export Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.ExportType
	 * @generated
	 */
	public Adapter createExportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.PackageType
	 * @generated
	 */
	public Adapter createPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.PersonWithEmailType <em>Person With Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.PersonWithEmailType
	 * @generated
	 */
	public Adapter createPersonWithEmailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.PersonWithOptionalEmailType <em>Person With Optional Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.PersonWithOptionalEmailType
	 * @generated
	 */
	public Adapter createPersonWithOptionalEmailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PackageFormat2.UrlType <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PackageFormat2.UrlType
	 * @generated
	 */
	public Adapter createUrlTypeAdapter() {
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

} //PackageFormat2AdapterFactory
