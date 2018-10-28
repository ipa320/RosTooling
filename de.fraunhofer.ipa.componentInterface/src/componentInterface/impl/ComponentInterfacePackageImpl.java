/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ComponentInterfacePackageImpl extends EPackageImpl implements ComponentInterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosServiceServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosServiceClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nsEDataType = null;

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
	 * @see componentInterface.ComponentInterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentInterfacePackageImpl() {
		super(eNS_URI, ComponentInterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentInterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentInterfacePackage init() {
		if (isInited) return (ComponentInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInterfacePackage.eNS_URI);

		// Obtain or create and register package
		ComponentInterfacePackageImpl theComponentInterfacePackage = (ComponentInterfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentInterfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentInterfacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RosPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentInterfacePackage.createPackageContents();

		// Initialize created meta-data
		theComponentInterfacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentInterfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentInterfacePackage.eNS_URI, theComponentInterfacePackage);
		return theComponentInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInterface() {
		return componentInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_Rospublisher() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_Rossubscriber() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_Rosserviceserver() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_Rosserviceclient() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosPublisher() {
		return rosPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosPublisher_Publisher() {
		return (EReference)rosPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosPublisher_Name() {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosPublisher_Ns() {
		return (EAttribute)rosPublisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosSubscriber() {
		return rosSubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosSubscriber_Subscriber() {
		return (EReference)rosSubscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosSubscriber_Name() {
		return (EAttribute)rosSubscriberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosSubscriber_Ns() {
		return (EAttribute)rosSubscriberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosServiceServer() {
		return rosServiceServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosServiceServer_Srvserver() {
		return (EReference)rosServiceServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosServiceServer_Name() {
		return (EAttribute)rosServiceServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosServiceServer_Ns() {
		return (EAttribute)rosServiceServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosServiceClient() {
		return rosServiceClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosServiceClient_Srvclient() {
		return (EReference)rosServiceClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosServiceClient_Name() {
		return (EAttribute)rosServiceClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosServiceClient_Ns() {
		return (EAttribute)rosServiceClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNS() {
		return nsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceFactory getComponentInterfaceFactory() {
		return (ComponentInterfaceFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInterfaceEClass = createEClass(COMPONENT_INTERFACE);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROSPUBLISHER);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROSSUBSCRIBER);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROSSERVICESERVER);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROSSERVICECLIENT);

		rosPublisherEClass = createEClass(ROS_PUBLISHER);
		createEReference(rosPublisherEClass, ROS_PUBLISHER__PUBLISHER);
		createEAttribute(rosPublisherEClass, ROS_PUBLISHER__NAME);
		createEAttribute(rosPublisherEClass, ROS_PUBLISHER__NS);

		rosSubscriberEClass = createEClass(ROS_SUBSCRIBER);
		createEReference(rosSubscriberEClass, ROS_SUBSCRIBER__SUBSCRIBER);
		createEAttribute(rosSubscriberEClass, ROS_SUBSCRIBER__NAME);
		createEAttribute(rosSubscriberEClass, ROS_SUBSCRIBER__NS);

		rosServiceServerEClass = createEClass(ROS_SERVICE_SERVER);
		createEReference(rosServiceServerEClass, ROS_SERVICE_SERVER__SRVSERVER);
		createEAttribute(rosServiceServerEClass, ROS_SERVICE_SERVER__NAME);
		createEAttribute(rosServiceServerEClass, ROS_SERVICE_SERVER__NS);

		rosServiceClientEClass = createEClass(ROS_SERVICE_CLIENT);
		createEReference(rosServiceClientEClass, ROS_SERVICE_CLIENT__SRVCLIENT);
		createEAttribute(rosServiceClientEClass, ROS_SERVICE_CLIENT__NAME);
		createEAttribute(rosServiceClientEClass, ROS_SERVICE_CLIENT__NS);

		// Create data types
		nsEDataType = createEDataType(NS);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RosPackage theRosPackage = (RosPackage)EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInterfaceEClass.getESuperTypes().add(theRosPackage.getNamespacedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentInterfaceEClass, ComponentInterface.class, "ComponentInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInterface_Rospublisher(), this.getRosPublisher(), null, "rospublisher", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_Rossubscriber(), this.getRosSubscriber(), null, "rossubscriber", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_Rosserviceserver(), this.getRosServiceServer(), null, "rosserviceserver", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_Rosserviceclient(), this.getRosServiceClient(), null, "rosserviceclient", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosPublisherEClass, RosPublisher.class, "RosPublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosPublisher_Publisher(), theRosPackage.getPublisher(), null, "publisher", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosPublisher_Name(), ecorePackage.getEString(), "name", null, 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosPublisher_Ns(), this.getNS(), "ns", "", 0, 1, RosPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosSubscriberEClass, RosSubscriber.class, "RosSubscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosSubscriber_Subscriber(), theRosPackage.getSubscriber(), null, "subscriber", null, 0, 1, RosSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosSubscriber_Name(), ecorePackage.getEString(), "name", null, 0, 1, RosSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosSubscriber_Ns(), this.getNS(), "ns", null, 0, 1, RosSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosServiceServerEClass, RosServiceServer.class, "RosServiceServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosServiceServer_Srvserver(), theRosPackage.getServiceServer(), null, "srvserver", null, 0, 1, RosServiceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosServiceServer_Name(), ecorePackage.getEString(), "name", null, 0, 1, RosServiceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosServiceServer_Ns(), this.getNS(), "ns", null, 0, 1, RosServiceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosServiceClientEClass, RosServiceClient.class, "RosServiceClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosServiceClient_Srvclient(), theRosPackage.getServiceClient(), null, "srvclient", null, 0, 1, RosServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosServiceClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, RosServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosServiceClient_Ns(), this.getNS(), "ns", null, 0, 1, RosServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(nsEDataType, String.class, "NS", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentInterfacePackageImpl
