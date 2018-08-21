/**
 */
package de.fraunhofer.ipa.ros.seronetgw.rosgw.impl;

import de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway;
import de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwFactory;
import de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ros.RosPackage;

import ros.impl.RosPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosgwPackageImpl extends EPackageImpl implements RosgwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosGatewayEClass = null;

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
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RosgwPackageImpl() {
		super(eNS_URI, RosgwFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RosgwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RosgwPackage init() {
		if (isInited)
			return (RosgwPackage) EPackage.Registry.INSTANCE.getEPackage(RosgwPackage.eNS_URI);

		// Obtain or create and register package
		RosgwPackageImpl theRosgwPackage = (RosgwPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RosgwPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RosgwPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RosPackageImpl theRosPackage = (RosPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RosPackage.eNS_URI) instanceof RosPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI)
						: RosPackage.eINSTANCE);

		// Create package meta-data objects
		theRosgwPackage.createPackageContents();
		theRosPackage.createPackageContents();

		// Initialize created meta-data
		theRosgwPackage.initializePackageContents();
		theRosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRosgwPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RosgwPackage.eNS_URI, theRosgwPackage);
		return theRosgwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosGateway() {
		return rosGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosGateway_RosTopicPublisher() {
		return (EReference) rosGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosGateway_RosTopicSubscriber() {
		return (EReference) rosGatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosGateway_RosServiceServer() {
		return (EReference) rosGatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosGateway_RosServiceClient() {
		return (EReference) rosGatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosgwFactory getRosgwFactory() {
		return (RosgwFactory) getEFactoryInstance();
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
		rosGatewayEClass = createEClass(ROS_GATEWAY);
		createEReference(rosGatewayEClass, ROS_GATEWAY__ROS_TOPIC_PUBLISHER);
		createEReference(rosGatewayEClass, ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER);
		createEReference(rosGatewayEClass, ROS_GATEWAY__ROS_SERVICE_SERVER);
		createEReference(rosGatewayEClass, ROS_GATEWAY__ROS_SERVICE_CLIENT);
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
		initEClass(rosGatewayEClass, RosGateway.class, "RosGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosGateway_RosTopicPublisher(), theRosPackage.getPublisher(), null, "RosTopicPublisher", null,
				0, -1, RosGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosGateway_RosTopicSubscriber(), theRosPackage.getSubscriber(), null, "RosTopicSubscriber",
				null, 0, -1, RosGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosGateway_RosServiceServer(), theRosPackage.getServiceServer(), null, "RosServiceServer",
				null, 0, -1, RosGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosGateway_RosServiceClient(), theRosPackage.getServiceClient(), null, "RosServiceClient",
				null, 0, -1, RosGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RosgwPackageImpl
