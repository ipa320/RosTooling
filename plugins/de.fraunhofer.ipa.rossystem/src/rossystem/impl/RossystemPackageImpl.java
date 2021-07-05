/**
 */
package rossystem.impl;

import componentInterface.ComponentInterfacePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import primitives.PrimitivesPackage;
import ros.RosPackage;

import rossystem.ActionConnection;
import rossystem.ComponentStack;
import rossystem.QualityAttribute;
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
	private EClass componentStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAttributeEClass = null;

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
		Object registeredRossystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RossystemPackageImpl theRossystemPackage = registeredRossystemPackage instanceof RossystemPackageImpl ? (RossystemPackageImpl)registeredRossystemPackage : new RossystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ComponentInterfacePackage.eINSTANCE.eClass();
		RosPackage.eINSTANCE.eClass();
		PrimitivesPackage.eINSTANCE.eClass();

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
	@Override
	public EClass getRosSystem() {
		return rosSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRosSystem_TopicConnections() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRosSystem_ServiceConnections() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRosSystem_Name() {
		return (EAttribute)rosSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRosSystem_ComponentStack() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRosSystem_RosComponent() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentStack() {
		return componentStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentStack_Name() {
		return (EAttribute)componentStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentStack_RosComponent() {
		return (EReference)componentStackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentStack_QualityAttribute() {
		return (EReference)componentStackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityAttribute() {
		return qualityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualityAttribute_Name() {
		return (EAttribute)qualityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityAttribute_Type() {
		return (EReference)qualityAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityAttribute_Value() {
		return (EReference)qualityAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRosSystem_Parameter() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRosSystem_ActionConnections() {
		return (EReference)rosSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopicConnection() {
		return topicConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopicConnection_From() {
		return (EReference)topicConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopicConnection_To() {
		return (EReference)topicConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTopicConnection_TopicName() {
		return (EAttribute)topicConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceConnection() {
		return serviceConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceConnection_From() {
		return (EReference)serviceConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceConnection_To() {
		return (EReference)serviceConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceConnection_ServiceName() {
		return (EAttribute)serviceConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionConnection() {
		return actionConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionConnection_From() {
		return (EReference)actionConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionConnection_To() {
		return (EReference)actionConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionConnection_ActionName() {
		return (EAttribute)actionConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEReference(rosSystemEClass, ROS_SYSTEM__ACTION_CONNECTIONS);
		createEAttribute(rosSystemEClass, ROS_SYSTEM__NAME);
		createEReference(rosSystemEClass, ROS_SYSTEM__COMPONENT_STACK);
		createEReference(rosSystemEClass, ROS_SYSTEM__PARAMETER);
		createEReference(rosSystemEClass, ROS_SYSTEM__ROS_COMPONENT);

		componentStackEClass = createEClass(COMPONENT_STACK);
		createEAttribute(componentStackEClass, COMPONENT_STACK__NAME);
		createEReference(componentStackEClass, COMPONENT_STACK__ROS_COMPONENT);
		createEReference(componentStackEClass, COMPONENT_STACK__QUALITY_ATTRIBUTE);

		qualityAttributeEClass = createEClass(QUALITY_ATTRIBUTE);
		createEAttribute(qualityAttributeEClass, QUALITY_ATTRIBUTE__NAME);
		createEReference(qualityAttributeEClass, QUALITY_ATTRIBUTE__TYPE);
		createEReference(qualityAttributeEClass, QUALITY_ATTRIBUTE__VALUE);

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
		RosPackage theRosPackage = (RosPackage)EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);
		ComponentInterfacePackage theComponentInterfacePackage = (ComponentInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInterfacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rosSystemEClass, RosSystem.class, "RosSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosSystem_TopicConnections(), this.getTopicConnection(), null, "TopicConnections", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_ServiceConnections(), this.getServiceConnection(), null, "ServiceConnections", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_ActionConnections(), this.getActionConnection(), null, "ActionConnections", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosSystem_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_ComponentStack(), this.getComponentStack(), null, "ComponentStack", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_Parameter(), theRosPackage.getParameter(), null, "Parameter", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRosSystem_RosComponent(), theComponentInterfacePackage.getComponentInterface(), null, "RosComponent", null, 0, -1, RosSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentStackEClass, ComponentStack.class, "ComponentStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentStack_Name(), ecorePackage.getEString(), "Name", null, 1, 1, ComponentStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentStack_RosComponent(), theComponentInterfacePackage.getComponentInterface(), null, "RosComponent", null, 0, -1, ComponentStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentStack_QualityAttribute(), this.getQualityAttribute(), null, "QualityAttribute", null, 0, -1, ComponentStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(qualityAttributeEClass, QualityAttribute.class, "QualityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityAttribute_Name(), ecorePackage.getEString(), "Name", null, 1, 1, QualityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityAttribute_Type(), theRosPackage.getParameterType(), null, "Type", null, 0, 1, QualityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityAttribute_Value(), theRosPackage.getParameterValue(), null, "Value", null, 0, 1, QualityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
