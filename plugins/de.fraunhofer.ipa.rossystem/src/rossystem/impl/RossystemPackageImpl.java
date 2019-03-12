/**
 */
package rossystem.impl;

import componentInterface.ComponentInterfacePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ros.RosPackage;

import rossystem.ActionConnection;
import rossystem.RosSystem;
import rossystem.RossystemFactory;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionConnectionEClass = null;

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
	 * @see rossystem.RossystemPackage#eNS_URI
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
		if (isInited) return (RossystemPackage)EPackage.Registry.INSTANCE.getEPackage(RossystemPackage.eNS_URI);

		// Obtain or create and register package
		RossystemPackageImpl theRossystemPackage = (RossystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RossystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RossystemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentInterfacePackage.eINSTANCE.eClass();
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
	public EClass getRosSystem() {
		return rosSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosSystem_TopicConnections() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosSystem_ServiceConnections() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosSystem_Name() {
		return (EAttribute)rosSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosSystem_RosComponent() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosSystem_ActionConnections() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopicConnection() {
		return topicConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopicConnection_From() {
		return (EReference)topicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopicConnection_To() {
		return (EReference)topicConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopicConnection_TopicName() {
		return (EAttribute)topicConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConnection() {
		return serviceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnection_From() {
		return (EReference)serviceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnection_To() {
		return (EReference)serviceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConnection_ServiceName() {
		return (EAttribute)serviceConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionConnection() {
		return actionConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionConnection_From() {
		return (EReference)actionConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionConnection_To() {
		return (EReference)actionConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionConnection_ActionName() {
		return (EAttribute)actionConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RossystemFactory getRossystemFactory() {
		return (RossystemFactory)getEFactoryInstance();
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
		rosSystemEClass = createEClass(ROS_SYSTEM);
		createEReference(rosSystemEClass, ROS_SYSTEM__TOPIC_CONNECTIONS);
		createEReference(rosSystemEClass, ROS_SYSTEM__SERVICE_CONNECTIONS);
		createEAttribute(rosSystemEClass, ROS_SYSTEM__NAME);
		createEReference(rosSystemEClass, ROS_SYSTEM__ROS_COMPONENT);
		createEReference(rosSystemEClass, ROS_SYSTEM__ACTION_CONNECTIONS);

		topicConnectionEClass = createEClass(TOPIC_CONNECTION);
		createEReference(topicConnectionEClass, TOPIC_CONNECTION__FROM);
		createEReference(topicConnectionEClass, TOPIC_CONNECTION__TO);
		createEAttribute(topicConnectionEClass, TOPIC_CONNECTION__TOPIC_NAME);

		serviceConnectionEClass = createEClass(SERVICE_CONNECTION);
		createEReference(serviceConnectionEClass, SERVICE_CONNECTION__FROM);
		createEReference(serviceConnectionEClass, SERVICE_CONNECTION__TO);
		createEAttribute(serviceConnectionEClass, SERVICE_CONNECTION__SERVICE_NAME);

		actionConnectionEClass = createEClass(ACTION_CONNECTION);
		createEReference(actionConnectionEClass, ACTION_CONNECTION__FROM);
		createEReference(actionConnectionEClass, ACTION_CONNECTION__TO);
		createEAttribute(actionConnectionEClass, ACTION_CONNECTION__ACTION_NAME);
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
		ComponentInterfacePackage theComponentInterfacePackage = (ComponentInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInterfacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rosSystemEClass, RosSystem.class, "RosSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosSystem_TopicConnections(), this.getTopicConnection(), null, "TopicConnections", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_ServiceConnections(), this.getServiceConnection(), null, "ServiceConnections", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosSystem_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_RosComponent(), theComponentInterfacePackage.getComponentInterface(), null, "RosComponent", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_ActionConnections(), this.getActionConnection(), null, "ActionConnections", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicConnectionEClass, TopicConnection.class, "TopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopicConnection_From(), theComponentInterfacePackage.getRosPublisher(), null, "From", null, 1, -1, TopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopicConnection_To(), theComponentInterfacePackage.getRosSubscriber(), null, "To", null, 1, -1, TopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopicConnection_TopicName(), ecorePackage.getEString(), "TopicName", null, 1, 1, TopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConnectionEClass, ServiceConnection.class, "ServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConnection_From(), theComponentInterfacePackage.getRosServiceServer(), null, "From", null, 1, -1, ServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConnection_To(), theComponentInterfacePackage.getRosServiceClient(), null, "To", null, 1, 1, ServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConnection_ServiceName(), ecorePackage.getEString(), "ServiceName", null, 1, 1, ServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionConnectionEClass, ActionConnection.class, "ActionConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionConnection_From(), theComponentInterfacePackage.getRosActionServer(), null, "From", null, 1, 1, ActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionConnection_To(), theComponentInterfacePackage.getRosActionClient(), null, "To", null, 1, 1, ActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionConnection_ActionName(), ecorePackage.getEString(), "ActionName", null, 1, 1, ActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RossystemPackageImpl
