/**
 */
package de.fraunhofer.ipa.rossystem.impl;

import de.fraunhofer.ipa.rossystem.ROSSystem;
import de.fraunhofer.ipa.rossystem.RossystemFactory;
import de.fraunhofer.ipa.rossystem.RossystemPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RossystemPackageImpl extends EPackageImpl implements RossystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.fraunhofer.ipa.rossystem.RossystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RossystemPackageImpl() {
		super(eNS_URI, RossystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RossystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RossystemPackage init() {
		if (isInited)
			return (RossystemPackage) EPackage.Registry.INSTANCE.getEPackage(RossystemPackage.eNS_URI);

		// Obtain or create and register package
		RossystemPackageImpl theRossystemPackage = (RossystemPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RossystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RossystemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RosPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRossystemPackage.createPackageContents();

		// Initialize created meta-data
		theRossystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRossystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RossystemPackage.eNS_URI, theRossystemPackage);
		return theRossystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROSSystem() {
		return rosSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROSSystem_RosNode() {
		return (EReference) rosSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RossystemFactory getRossystemFactory() {
		return (RossystemFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		rosSystemEClass = createEClass(ROS_SYSTEM);
		createEReference(rosSystemEClass, ROS_SYSTEM__ROS_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RosPackage theRosPackage = (RosPackage) EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rosSystemEClass, ROSSystem.class, "ROSSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getROSSystem_RosNode(), theRosPackage.getNode(), null, "RosNode", null, 0, -1, ROSSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RossystemPackageImpl
