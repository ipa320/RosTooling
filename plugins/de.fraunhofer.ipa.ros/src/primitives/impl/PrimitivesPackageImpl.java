/**
 */
package primitives.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import primitives.AbstractType;
import primitives.ByteArray;
import primitives.Header;
import primitives.MessagePart;
import primitives.PrimitivesFactory;
import primitives.PrimitivesPackage;
import primitives.bool;
import primitives.boolArray;
import primitives.char0;
import primitives.charArray;
import primitives.duration;
import primitives.float32;
import primitives.float32Array;
import primitives.float64;
import primitives.float64Array;
import primitives.int16;
import primitives.int16Array;
import primitives.int32;
import primitives.int32Array;
import primitives.int64;
import primitives.int64Array;
import primitives.int8;
import primitives.int8Array;
import primitives.string;
import primitives.stringArray;
import primitives.time;
import primitives.uint16;
import primitives.uint16Array;
import primitives.uint32;
import primitives.uint32Array;
import primitives.uint64;
import primitives.uint64Array;
import primitives.uint8;
import primitives.uint8Array;
import ros.RosPackage;

import ros.impl.RosPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitivesPackageImpl extends EPackageImpl implements PrimitivesPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boolEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int8EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint8EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int16EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint16EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int32EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint32EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int64EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint64EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass float32EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass float64EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass durationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boolArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int8ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint8ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int16ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint16ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int32ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint32ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass int64ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uint64ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass float32ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass float64ArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass headerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass byteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass byteArrayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass char0EClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass charArrayEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messagePartEClass = null;

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
     * @see primitives.PrimitivesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PrimitivesPackageImpl() {
        super(eNS_URI, PrimitivesFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PrimitivesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PrimitivesPackage init() {
        if (isInited) return (PrimitivesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivesPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredPrimitivesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        PrimitivesPackageImpl thePrimitivesPackage = registeredPrimitivesPackage instanceof PrimitivesPackageImpl ? (PrimitivesPackageImpl)registeredPrimitivesPackage : new PrimitivesPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RosPackage.eNS_URI);
        RosPackageImpl theRosPackage = (RosPackageImpl)(registeredPackage instanceof RosPackageImpl ? registeredPackage : RosPackage.eINSTANCE);

        // Create package meta-data objects
        thePrimitivesPackage.createPackageContents();
        theRosPackage.createPackageContents();

        // Initialize created meta-data
        thePrimitivesPackage.initializePackageContents();
        theRosPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePrimitivesPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PrimitivesPackage.eNS_URI, thePrimitivesPackage);
        return thePrimitivesPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getbool() {
        return boolEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint8() {
        return int8EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint8() {
        return uint8EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint16() {
        return int16EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint16() {
        return uint16EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint32() {
        return int32EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint32() {
        return uint32EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint64() {
        return int64EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint64() {
        return uint64EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getfloat32() {
        return float32EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getfloat64() {
        return float64EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractType() {
        return abstractTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getstring() {
        return stringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass gettime() {
        return timeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getduration() {
        return durationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getboolArray() {
        return boolArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint8Array() {
        return int8ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint8Array() {
        return uint8ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint16Array() {
        return int16ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint16Array() {
        return uint16ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint32Array() {
        return int32ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint32Array() {
        return uint32ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getint64Array() {
        return int64ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getuint64Array() {
        return uint64ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getfloat32Array() {
        return float32ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getfloat64Array() {
        return float64ArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getstringArray() {
        return stringArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHeader() {
        return headerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getByte() {
        return byteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getByteArray() {
        return byteArrayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getchar0() {
        return char0EClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getcharArray() {
        return charArrayEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMessagePart() {
        return messagePartEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMessagePart_Type() {
        return (EReference)messagePartEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMessagePart_Data() {
        return (EAttribute)messagePartEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimitivesFactory getPrimitivesFactory() {
        return (PrimitivesFactory)getEFactoryInstance();
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
        abstractTypeEClass = createEClass(ABSTRACT_TYPE);

        messagePartEClass = createEClass(MESSAGE_PART);
        createEReference(messagePartEClass, MESSAGE_PART__TYPE);
        createEAttribute(messagePartEClass, MESSAGE_PART__DATA);

        boolEClass = createEClass(BOOL);

        int8EClass = createEClass(INT8);

        uint8EClass = createEClass(UINT8);

        int16EClass = createEClass(INT16);

        uint16EClass = createEClass(UINT16);

        int32EClass = createEClass(INT32);

        uint32EClass = createEClass(UINT32);

        int64EClass = createEClass(INT64);

        uint64EClass = createEClass(UINT64);

        float32EClass = createEClass(FLOAT32);

        float64EClass = createEClass(FLOAT64);

        stringEClass = createEClass(STRING);

        timeEClass = createEClass(TIME);

        durationEClass = createEClass(DURATION);

        boolArrayEClass = createEClass(BOOL_ARRAY);

        int8ArrayEClass = createEClass(INT8_ARRAY);

        uint8ArrayEClass = createEClass(UINT8_ARRAY);

        int16ArrayEClass = createEClass(INT16_ARRAY);

        uint16ArrayEClass = createEClass(UINT16_ARRAY);

        int32ArrayEClass = createEClass(INT32_ARRAY);

        uint32ArrayEClass = createEClass(UINT32_ARRAY);

        int64ArrayEClass = createEClass(INT64_ARRAY);

        uint64ArrayEClass = createEClass(UINT64_ARRAY);

        float32ArrayEClass = createEClass(FLOAT32_ARRAY);

        float64ArrayEClass = createEClass(FLOAT64_ARRAY);

        stringArrayEClass = createEClass(STRING_ARRAY);

        headerEClass = createEClass(HEADER);

        byteEClass = createEClass(BYTE);

        byteArrayEClass = createEClass(BYTE_ARRAY);

        char0EClass = createEClass(CHAR0);

        charArrayEClass = createEClass(CHAR_ARRAY);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        boolEClass.getESuperTypes().add(this.getAbstractType());
        int8EClass.getESuperTypes().add(this.getAbstractType());
        uint8EClass.getESuperTypes().add(this.getAbstractType());
        int16EClass.getESuperTypes().add(this.getAbstractType());
        uint16EClass.getESuperTypes().add(this.getAbstractType());
        int32EClass.getESuperTypes().add(this.getAbstractType());
        uint32EClass.getESuperTypes().add(this.getAbstractType());
        int64EClass.getESuperTypes().add(this.getAbstractType());
        uint64EClass.getESuperTypes().add(this.getAbstractType());
        float32EClass.getESuperTypes().add(this.getAbstractType());
        float64EClass.getESuperTypes().add(this.getAbstractType());
        stringEClass.getESuperTypes().add(this.getAbstractType());
        timeEClass.getESuperTypes().add(this.getAbstractType());
        durationEClass.getESuperTypes().add(this.getAbstractType());
        boolArrayEClass.getESuperTypes().add(this.getAbstractType());
        int8ArrayEClass.getESuperTypes().add(this.getAbstractType());
        uint8ArrayEClass.getESuperTypes().add(this.getAbstractType());
        int16ArrayEClass.getESuperTypes().add(this.getAbstractType());
        uint16ArrayEClass.getESuperTypes().add(this.getAbstractType());
        int32ArrayEClass.getESuperTypes().add(this.getAbstractType());
        uint32ArrayEClass.getESuperTypes().add(this.getAbstractType());
        int64ArrayEClass.getESuperTypes().add(this.getAbstractType());
        uint64ArrayEClass.getESuperTypes().add(this.getAbstractType());
        float32ArrayEClass.getESuperTypes().add(this.getAbstractType());
        float64ArrayEClass.getESuperTypes().add(this.getAbstractType());
        stringArrayEClass.getESuperTypes().add(this.getAbstractType());
        headerEClass.getESuperTypes().add(this.getAbstractType());
        byteEClass.getESuperTypes().add(this.getAbstractType());
        byteArrayEClass.getESuperTypes().add(this.getAbstractType());
        char0EClass.getESuperTypes().add(this.getAbstractType());
        charArrayEClass.getESuperTypes().add(this.getAbstractType());

        // Initialize classes, features, and operations; add parameters
        initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(messagePartEClass, MessagePart.class, "MessagePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMessagePart_Type(), this.getAbstractType(), null, "Type", null, 1, 1, MessagePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMessagePart_Data(), ecorePackage.getEString(), "Data", null, 1, 1, MessagePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boolEClass, bool.class, "bool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int8EClass, int8.class, "int8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint8EClass, uint8.class, "uint8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int16EClass, int16.class, "int16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint16EClass, uint16.class, "uint16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int32EClass, int32.class, "int32", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint32EClass, uint32.class, "uint32", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int64EClass, int64.class, "int64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint64EClass, uint64.class, "uint64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(float32EClass, float32.class, "float32", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(float64EClass, float64.class, "float64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stringEClass, string.class, "string", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeEClass, time.class, "time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(durationEClass, duration.class, "duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(boolArrayEClass, boolArray.class, "boolArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int8ArrayEClass, int8Array.class, "int8Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint8ArrayEClass, uint8Array.class, "uint8Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int16ArrayEClass, int16Array.class, "int16Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint16ArrayEClass, uint16Array.class, "uint16Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int32ArrayEClass, int32Array.class, "int32Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint32ArrayEClass, uint32Array.class, "uint32Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(int64ArrayEClass, int64Array.class, "int64Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uint64ArrayEClass, uint64Array.class, "uint64Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(float32ArrayEClass, float32Array.class, "float32Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(float64ArrayEClass, float64Array.class, "float64Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(stringArrayEClass, stringArray.class, "stringArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(byteEClass, primitives.Byte.class, "Byte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(byteArrayEClass, ByteArray.class, "ByteArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(char0EClass, char0.class, "char0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(charArrayEClass, charArray.class, "charArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //PrimitivesPackageImpl
