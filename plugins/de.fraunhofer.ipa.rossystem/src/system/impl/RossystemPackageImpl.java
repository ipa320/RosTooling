/**
 */
package system.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import primitives.PrimitivesPackage;

import ros.RosPackage;

import system.Component;
import system.Connection;
import system.InterfaceReference;
import system.RosActionClientReference;
import system.RosActionConnection;
import system.RosActionServerReference;
import system.RosConnection;
import system.RosInterface;
import system.RosNode;
import system.RosParameter;
import system.RosParameterReference;
import system.RosPublisherReference;
import system.RosServiceClientReference;
import system.RosServiceConnection;
import system.RosServiceServerReference;
import system.RosSubscriberReference;
import system.RosSystemConnection;
import system.RosTopicConnection;
import system.Rossystem;
import system.RossystemFactory;
import system.RossystemPackage;

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
    private EClass systemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rossystemEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass componentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosInterfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosPublisherReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosSubscriberReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosServiceServerReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosServiceClientReferenceEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosActionServerReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosActionClientReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosParameterReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosSystemConnectionEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosTopicConnectionEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosServiceConnectionEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rosActionConnectionEClass = null;

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
     * @see system.RossystemPackage#eNS_URI
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
        RosPackage.eINSTANCE.eClass();
        PrimitivesPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

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
    public EClass getSystem() {
        return systemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSystem_Name() {
        return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Processes() {
        return (EReference)systemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Components() {
        return (EReference)systemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Connections() {
        return (EReference)systemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSystem_Parameter() {
        return (EReference)systemEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRossystem() {
        return rossystemEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcess_Name() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcess_Threads() {
        return (EAttribute)processEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_Components() {
        return (EReference)processEClass.getEStructuralFeatures().get(2);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getComponent() {
        return componentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConnection() {
        return connectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosNode() {
        return rosNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRosNode_Name() {
        return (EAttribute)rosNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosNode_From() {
        return (EReference)rosNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosNode_Rosinterfaces() {
        return (EReference)rosNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosNode_Rosparameters() {
        return (EReference)rosNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosInterface() {
        return rosInterfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRosInterface_Name() {
        return (EAttribute)rosInterfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosInterface_Reference() {
        return (EReference)rosInterfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInterfaceReference() {
        return interfaceReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosPublisherReference() {
        return rosPublisherReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosPublisherReference_From() {
        return (EReference)rosPublisherReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosSubscriberReference() {
        return rosSubscriberReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosSubscriberReference_From() {
        return (EReference)rosSubscriberReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosServiceServerReference() {
        return rosServiceServerReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosServiceServerReference_From() {
        return (EReference)rosServiceServerReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosServiceClientReference() {
        return rosServiceClientReferenceEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosServiceClientReference_From() {
        return (EReference)rosServiceClientReferenceEClass.getEStructuralFeatures().get(0);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosActionServerReference() {
        return rosActionServerReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosActionServerReference_From() {
        return (EReference)rosActionServerReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosActionClientReference() {
        return rosActionClientReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosActionClientReference_From() {
        return (EReference)rosActionClientReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosParameterReference() {
        return rosParameterReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosParameterReference_From() {
        return (EReference)rosParameterReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosParameter() {
        return rosParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRosParameter_Name() {
        return (EAttribute)rosParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosParameter_Value() {
        return (EReference)rosParameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosParameter_From() {
        return (EReference)rosParameterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosSystemConnection() {
        return rosSystemConnectionEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosSystemConnection_From() {
        return (EReference)rosSystemConnectionEClass.getEStructuralFeatures().get(0);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosSystemConnection_To() {
        return (EReference)rosSystemConnectionEClass.getEStructuralFeatures().get(1);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosConnection() {
        return rosConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosTopicConnection() {
        return rosTopicConnectionEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosTopicConnection_From() {
        return (EReference)rosTopicConnectionEClass.getEStructuralFeatures().get(0);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosTopicConnection_To() {
        return (EReference)rosTopicConnectionEClass.getEStructuralFeatures().get(1);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosServiceConnection() {
        return rosServiceConnectionEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosServiceConnection_From() {
        return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(0);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosServiceConnection_To() {
        return (EReference)rosServiceConnectionEClass.getEStructuralFeatures().get(1);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRosActionConnection() {
        return rosActionConnectionEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosActionConnection_From() {
        return (EReference)rosActionConnectionEClass.getEStructuralFeatures().get(0);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRosActionConnection_To() {
        return (EReference)rosActionConnectionEClass.getEStructuralFeatures().get(1);
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
        systemEClass = createEClass(SYSTEM);
        createEAttribute(systemEClass, SYSTEM__NAME);
        createEReference(systemEClass, SYSTEM__PROCESSES);
        createEReference(systemEClass, SYSTEM__COMPONENTS);
        createEReference(systemEClass, SYSTEM__CONNECTIONS);
        createEReference(systemEClass, SYSTEM__PARAMETER);

        rossystemEClass = createEClass(ROSSYSTEM);

        processEClass = createEClass(PROCESS);
        createEAttribute(processEClass, PROCESS__NAME);
        createEAttribute(processEClass, PROCESS__THREADS);
        createEReference(processEClass, PROCESS__COMPONENTS);

        componentEClass = createEClass(COMPONENT);

        connectionEClass = createEClass(CONNECTION);

        rosNodeEClass = createEClass(ROS_NODE);
        createEAttribute(rosNodeEClass, ROS_NODE__NAME);
        createEReference(rosNodeEClass, ROS_NODE__FROM);
        createEReference(rosNodeEClass, ROS_NODE__ROSINTERFACES);
        createEReference(rosNodeEClass, ROS_NODE__ROSPARAMETERS);

        rosInterfaceEClass = createEClass(ROS_INTERFACE);
        createEAttribute(rosInterfaceEClass, ROS_INTERFACE__NAME);
        createEReference(rosInterfaceEClass, ROS_INTERFACE__REFERENCE);

        interfaceReferenceEClass = createEClass(INTERFACE_REFERENCE);

        rosPublisherReferenceEClass = createEClass(ROS_PUBLISHER_REFERENCE);
        createEReference(rosPublisherReferenceEClass, ROS_PUBLISHER_REFERENCE__FROM);

        rosSubscriberReferenceEClass = createEClass(ROS_SUBSCRIBER_REFERENCE);
        createEReference(rosSubscriberReferenceEClass, ROS_SUBSCRIBER_REFERENCE__FROM);

        rosServiceServerReferenceEClass = createEClass(ROS_SERVICE_SERVER_REFERENCE);
        createEReference(rosServiceServerReferenceEClass, ROS_SERVICE_SERVER_REFERENCE__FROM);

        rosServiceClientReferenceEClass = createEClass(ROS_SERVICE_CLIENT_REFERENCE);
        createEReference(rosServiceClientReferenceEClass, ROS_SERVICE_CLIENT_REFERENCE__FROM);

        rosActionServerReferenceEClass = createEClass(ROS_ACTION_SERVER_REFERENCE);
        createEReference(rosActionServerReferenceEClass, ROS_ACTION_SERVER_REFERENCE__FROM);

        rosActionClientReferenceEClass = createEClass(ROS_ACTION_CLIENT_REFERENCE);
        createEReference(rosActionClientReferenceEClass, ROS_ACTION_CLIENT_REFERENCE__FROM);

        rosParameterReferenceEClass = createEClass(ROS_PARAMETER_REFERENCE);
        createEReference(rosParameterReferenceEClass, ROS_PARAMETER_REFERENCE__FROM);

        rosParameterEClass = createEClass(ROS_PARAMETER);
        createEAttribute(rosParameterEClass, ROS_PARAMETER__NAME);
        createEReference(rosParameterEClass, ROS_PARAMETER__VALUE);
        createEReference(rosParameterEClass, ROS_PARAMETER__FROM);

        rosSystemConnectionEClass = createEClass(ROS_SYSTEM_CONNECTION);
        createEReference(rosSystemConnectionEClass, ROS_SYSTEM_CONNECTION__FROM);
        createEReference(rosSystemConnectionEClass, ROS_SYSTEM_CONNECTION__TO);

        rosConnectionEClass = createEClass(ROS_CONNECTION);

        rosTopicConnectionEClass = createEClass(ROS_TOPIC_CONNECTION);
        createEReference(rosTopicConnectionEClass, ROS_TOPIC_CONNECTION__FROM);
        createEReference(rosTopicConnectionEClass, ROS_TOPIC_CONNECTION__TO);

        rosServiceConnectionEClass = createEClass(ROS_SERVICE_CONNECTION);
        createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__FROM);
        createEReference(rosServiceConnectionEClass, ROS_SERVICE_CONNECTION__TO);

        rosActionConnectionEClass = createEClass(ROS_ACTION_CONNECTION);
        createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__FROM);
        createEReference(rosActionConnectionEClass, ROS_ACTION_CONNECTION__TO);
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
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        systemEClass.getESuperTypes().add(this.getComponent());
        rossystemEClass.getESuperTypes().add(this.getSystem());
        rosNodeEClass.getESuperTypes().add(this.getComponent());
        rosPublisherReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosSubscriberReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosServiceServerReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosServiceClientReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosActionServerReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosActionClientReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosParameterReferenceEClass.getESuperTypes().add(this.getInterfaceReference());
        rosSystemConnectionEClass.getESuperTypes().add(this.getConnection());
        rosConnectionEClass.getESuperTypes().add(this.getConnection());
        rosTopicConnectionEClass.getESuperTypes().add(this.getRosConnection());
        rosServiceConnectionEClass.getESuperTypes().add(this.getRosConnection());
        rosActionConnectionEClass.getESuperTypes().add(this.getRosConnection());

        // Initialize classes, features, and operations; add parameters
        initEClass(systemEClass, system.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 1, 1, system.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Processes(), this.getProcess(), null, "processes", null, 0, -1, system.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Components(), this.getComponent(), null, "components", null, 0, -1, system.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Connections(), this.getConnection(), null, "connections", null, 0, -1, system.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSystem_Parameter(), theRosPackage.getParameter(), null, "parameter", null, 0, -1, system.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(rossystemEClass, Rossystem.class, "Rossystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processEClass, system.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 1, 1, system.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProcess_Threads(), theXMLTypePackage.getInt(), "threads", null, 0, 1, system.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_Components(), this.getComponent(), null, "components", null, 0, -1, system.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rosNodeEClass, RosNode.class, "RosNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRosNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosNode_From(), theRosPackage.getNode(), null, "from", null, 1, 1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosNode_Rosinterfaces(), this.getRosInterface(), null, "rosinterfaces", null, 0, -1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosNode_Rosparameters(), this.getRosParameter(), null, "rosparameters", null, 0, -1, RosNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosInterfaceEClass, RosInterface.class, "RosInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRosInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosInterface_Reference(), this.getInterfaceReference(), null, "reference", null, 1, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceReferenceEClass, InterfaceReference.class, "InterfaceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rosPublisherReferenceEClass, RosPublisherReference.class, "RosPublisherReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosPublisherReference_From(), theRosPackage.getPublisher(), null, "from", null, 1, 1, RosPublisherReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosSubscriberReferenceEClass, RosSubscriberReference.class, "RosSubscriberReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosSubscriberReference_From(), theRosPackage.getSubscriber(), null, "from", null, 1, 1, RosSubscriberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosServiceServerReferenceEClass, RosServiceServerReference.class, "RosServiceServerReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosServiceServerReference_From(), theRosPackage.getServiceServer(), null, "from", null, 1, 1, RosServiceServerReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosServiceClientReferenceEClass, RosServiceClientReference.class, "RosServiceClientReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosServiceClientReference_From(), theRosPackage.getServiceClient(), null, "from", null, 1, 1, RosServiceClientReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosActionServerReferenceEClass, RosActionServerReference.class, "RosActionServerReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosActionServerReference_From(), theRosPackage.getActionServer(), null, "from", null, 1, 1, RosActionServerReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosActionClientReferenceEClass, RosActionClientReference.class, "RosActionClientReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosActionClientReference_From(), theRosPackage.getActionClient(), null, "from", null, 1, 1, RosActionClientReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosParameterReferenceEClass, RosParameterReference.class, "RosParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosParameterReference_From(), theRosPackage.getParameter(), null, "from", null, 1, 1, RosParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosParameterEClass, RosParameter.class, "RosParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRosParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, RosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosParameter_Value(), theRosPackage.getParameterValue(), null, "value", null, 0, 1, RosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosParameter_From(), theRosPackage.getParameter(), null, "from", null, 1, 1, RosParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosSystemConnectionEClass, RosSystemConnection.class, "RosSystemConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosSystemConnection_From(), this.getRosInterface(), null, "from", null, 1, 1, RosSystemConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosSystemConnection_To(), this.getRosInterface(), null, "to", null, 1, 1, RosSystemConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosConnectionEClass, RosConnection.class, "RosConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rosTopicConnectionEClass, RosTopicConnection.class, "RosTopicConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosTopicConnection_From(), theRosPackage.getPublisher(), null, "from", null, 1, 1, RosTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosTopicConnection_To(), theRosPackage.getSubscriber(), null, "to", null, 1, 1, RosTopicConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosServiceConnectionEClass, RosServiceConnection.class, "RosServiceConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosServiceConnection_From(), theRosPackage.getServiceServer(), null, "from", null, 1, 1, RosServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosServiceConnection_To(), theRosPackage.getServiceClient(), null, "to", null, 1, 1, RosServiceConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rosActionConnectionEClass, RosActionConnection.class, "RosActionConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRosActionConnection_From(), theRosPackage.getActionServer(), null, "from", null, 1, 1, RosActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRosActionConnection_To(), theRosPackage.getActionClient(), null, "to", null, 1, 1, RosActionConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //RossystemPackageImpl
