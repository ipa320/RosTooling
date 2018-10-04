/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;
import componentInterface.Publisher;
import componentInterface.ServiceClient;
import componentInterface.ServiceServer;
import componentInterface.Subscriber;

import org.eclipse.emf.ecore.EAttribute;
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
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClientEClass = null;

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
	public EReference getComponentInterface_RosTopicPublisher() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_RosTopicSubscriber() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_RosServiceServer() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterface_RosServiceClient() {
		return (EReference)componentInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisher_TopicRef() {
		return (EReference)publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_TopicName() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisher_NameSpace() {
		return (EReference)publisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriber() {
		return subscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriber_TopicRef() {
		return (EReference)subscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriber_TopicName() {
		return (EAttribute)subscriberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriber_NameSpace() {
		return (EReference)subscriberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceServer() {
		return serviceServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceServer_SrvRef() {
		return (EReference)serviceServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceServer_ServiceName() {
		return (EAttribute)serviceServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceServer_NameSpace() {
		return (EReference)serviceServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceClient() {
		return serviceClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClient_SrvRef() {
		return (EReference)serviceClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceClient_ServiceName() {
		return (EAttribute)serviceClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClient_NameSpace() {
		return (EReference)serviceClientEClass.getEStructuralFeatures().get(2);
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
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROS_SERVICE_SERVER);
		createEReference(componentInterfaceEClass, COMPONENT_INTERFACE__ROS_SERVICE_CLIENT);

		publisherEClass = createEClass(PUBLISHER);
		createEReference(publisherEClass, PUBLISHER__TOPIC_REF);
		createEAttribute(publisherEClass, PUBLISHER__TOPIC_NAME);
		createEReference(publisherEClass, PUBLISHER__NAME_SPACE);

		subscriberEClass = createEClass(SUBSCRIBER);
		createEReference(subscriberEClass, SUBSCRIBER__TOPIC_REF);
		createEAttribute(subscriberEClass, SUBSCRIBER__TOPIC_NAME);
		createEReference(subscriberEClass, SUBSCRIBER__NAME_SPACE);

		serviceServerEClass = createEClass(SERVICE_SERVER);
		createEReference(serviceServerEClass, SERVICE_SERVER__SRV_REF);
		createEAttribute(serviceServerEClass, SERVICE_SERVER__SERVICE_NAME);
		createEReference(serviceServerEClass, SERVICE_SERVER__NAME_SPACE);

		serviceClientEClass = createEClass(SERVICE_CLIENT);
		createEReference(serviceClientEClass, SERVICE_CLIENT__SRV_REF);
		createEAttribute(serviceClientEClass, SERVICE_CLIENT__SERVICE_NAME);
		createEReference(serviceClientEClass, SERVICE_CLIENT__NAME_SPACE);
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
		initEReference(getComponentInterface_RosTopicPublisher(), this.getPublisher(), null, "RosTopicPublisher", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_RosTopicSubscriber(), this.getSubscriber(), null, "RosTopicSubscriber", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_RosServiceServer(), this.getServiceServer(), null, "RosServiceServer", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_RosServiceClient(), this.getServiceClient(), null, "RosServiceClient", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublisher_TopicRef(), theRosPackage.getPublisher(), null, "TopicRef", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_TopicName(), ecorePackage.getEString(), "TopicName", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublisher_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriberEClass, Subscriber.class, "Subscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscriber_TopicRef(), theRosPackage.getSubscriber(), null, "TopicRef", null, 0, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscriber_TopicName(), ecorePackage.getEString(), "TopicName", null, 0, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubscriber_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, Subscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceServerEClass, ServiceServer.class, "ServiceServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceServer_SrvRef(), theRosPackage.getServiceServer(), null, "SrvRef", null, 0, 1, ServiceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceServer_ServiceName(), ecorePackage.getEString(), "ServiceName", null, 0, 1, ServiceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceServer_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, ServiceServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceClientEClass, ServiceClient.class, "ServiceClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceClient_SrvRef(), theRosPackage.getServiceClient(), null, "SrvRef", null, 0, 1, ServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceClient_ServiceName(), ecorePackage.getEString(), "ServiceName", null, 0, 1, ServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceClient_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, ServiceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentInterfacePackageImpl
