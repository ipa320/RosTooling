/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RemapPub;
import componentInterface.RemapSrvCli;
import componentInterface.RemapSrvServ;
import componentInterface.RemapSub;

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
	private EClass remapPubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remapSubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remapSrvServEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remapSrvCliEClass = null;

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
	public EClass getRemapPub() {
		return remapPubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapPub_TopicRef() {
		return (EReference)remapPubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemapPub_RemapName() {
		return (EAttribute)remapPubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapPub_NameSpace() {
		return (EReference)remapPubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemapSub() {
		return remapSubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapSub_TopicRef() {
		return (EReference)remapSubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemapSub_RemapName() {
		return (EAttribute)remapSubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapSub_NameSpace() {
		return (EReference)remapSubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemapSrvServ() {
		return remapSrvServEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapSrvServ_SrvRef() {
		return (EReference)remapSrvServEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemapSrvServ_RemapName() {
		return (EAttribute)remapSrvServEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapSrvServ_NameSpace() {
		return (EReference)remapSrvServEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemapSrvCli() {
		return remapSrvCliEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapSrvCli_SrvRef() {
		return (EReference)remapSrvCliEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemapSrvCli_RemapName() {
		return (EAttribute)remapSrvCliEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemapSrvCli_NameSpace() {
		return (EReference)remapSrvCliEClass.getEStructuralFeatures().get(2);
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

		remapPubEClass = createEClass(REMAP_PUB);
		createEReference(remapPubEClass, REMAP_PUB__TOPIC_REF);
		createEAttribute(remapPubEClass, REMAP_PUB__REMAP_NAME);
		createEReference(remapPubEClass, REMAP_PUB__NAME_SPACE);

		remapSubEClass = createEClass(REMAP_SUB);
		createEReference(remapSubEClass, REMAP_SUB__TOPIC_REF);
		createEAttribute(remapSubEClass, REMAP_SUB__REMAP_NAME);
		createEReference(remapSubEClass, REMAP_SUB__NAME_SPACE);

		remapSrvServEClass = createEClass(REMAP_SRV_SERV);
		createEReference(remapSrvServEClass, REMAP_SRV_SERV__SRV_REF);
		createEAttribute(remapSrvServEClass, REMAP_SRV_SERV__REMAP_NAME);
		createEReference(remapSrvServEClass, REMAP_SRV_SERV__NAME_SPACE);

		remapSrvCliEClass = createEClass(REMAP_SRV_CLI);
		createEReference(remapSrvCliEClass, REMAP_SRV_CLI__SRV_REF);
		createEAttribute(remapSrvCliEClass, REMAP_SRV_CLI__REMAP_NAME);
		createEReference(remapSrvCliEClass, REMAP_SRV_CLI__NAME_SPACE);
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
		initEReference(getComponentInterface_RosTopicPublisher(), this.getRemapPub(), null, "RosTopicPublisher", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_RosTopicSubscriber(), this.getRemapSub(), null, "RosTopicSubscriber", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_RosServiceServer(), this.getRemapSrvServ(), null, "RosServiceServer", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterface_RosServiceClient(), this.getRemapSrvCli(), null, "RosServiceClient", null, 0, -1, ComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(remapPubEClass, RemapPub.class, "RemapPub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemapPub_TopicRef(), theRosPackage.getPublisher(), null, "TopicRef", null, 0, 1, RemapPub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemapPub_RemapName(), ecorePackage.getEString(), "RemapName", null, 0, 1, RemapPub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemapPub_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, RemapPub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remapSubEClass, RemapSub.class, "RemapSub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemapSub_TopicRef(), theRosPackage.getSubscriber(), null, "TopicRef", null, 0, 1, RemapSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemapSub_RemapName(), ecorePackage.getEString(), "RemapName", null, 0, 1, RemapSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemapSub_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, RemapSub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remapSrvServEClass, RemapSrvServ.class, "RemapSrvServ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemapSrvServ_SrvRef(), theRosPackage.getServiceServer(), null, "SrvRef", null, 0, 1, RemapSrvServ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemapSrvServ_RemapName(), ecorePackage.getEString(), "RemapName", null, 0, 1, RemapSrvServ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemapSrvServ_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, RemapSrvServ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remapSrvCliEClass, RemapSrvCli.class, "RemapSrvCli", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemapSrvCli_SrvRef(), theRosPackage.getServiceClient(), null, "SrvRef", null, 0, 1, RemapSrvCli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemapSrvCli_RemapName(), ecorePackage.getEString(), "RemapName", null, 0, 1, RemapSrvCli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemapSrvCli_NameSpace(), theRosPackage.getNamespace(), null, "NameSpace", null, 0, 1, RemapSrvCli.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentInterfacePackageImpl
