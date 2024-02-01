/**
 */
package primitives.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitivesFactoryImpl extends EFactoryImpl implements PrimitivesFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitivesFactory init() {
    try {
      PrimitivesFactory thePrimitivesFactory =
          (PrimitivesFactory) EPackage.Registry.INSTANCE.getEFactory(PrimitivesPackage.eNS_URI);
      if (thePrimitivesFactory != null) {
        return thePrimitivesFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PrimitivesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitivesFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case PrimitivesPackage.MESSAGE_PART:
        return createMessagePart();
      case PrimitivesPackage.BOOL:
        return createbool();
      case PrimitivesPackage.INT8:
        return createint8();
      case PrimitivesPackage.UINT8:
        return createuint8();
      case PrimitivesPackage.INT16:
        return createint16();
      case PrimitivesPackage.UINT16:
        return createuint16();
      case PrimitivesPackage.INT32:
        return createint32();
      case PrimitivesPackage.UINT32:
        return createuint32();
      case PrimitivesPackage.INT64:
        return createint64();
      case PrimitivesPackage.UINT64:
        return createuint64();
      case PrimitivesPackage.FLOAT32:
        return createfloat32();
      case PrimitivesPackage.FLOAT64:
        return createfloat64();
      case PrimitivesPackage.STRING:
        return createstring();
      case PrimitivesPackage.TIME:
        return createtime();
      case PrimitivesPackage.DURATION:
        return createduration();
      case PrimitivesPackage.BOOL_ARRAY:
        return createboolArray();
      case PrimitivesPackage.INT8_ARRAY:
        return createint8Array();
      case PrimitivesPackage.UINT8_ARRAY:
        return createuint8Array();
      case PrimitivesPackage.INT16_ARRAY:
        return createint16Array();
      case PrimitivesPackage.UINT16_ARRAY:
        return createuint16Array();
      case PrimitivesPackage.INT32_ARRAY:
        return createint32Array();
      case PrimitivesPackage.UINT32_ARRAY:
        return createuint32Array();
      case PrimitivesPackage.INT64_ARRAY:
        return createint64Array();
      case PrimitivesPackage.UINT64_ARRAY:
        return createuint64Array();
      case PrimitivesPackage.FLOAT32_ARRAY:
        return createfloat32Array();
      case PrimitivesPackage.FLOAT64_ARRAY:
        return createfloat64Array();
      case PrimitivesPackage.STRING_ARRAY:
        return createstringArray();
      case PrimitivesPackage.HEADER:
        return createHeader();
      case PrimitivesPackage.BYTE:
        return createByte();
      case PrimitivesPackage.BYTE_ARRAY:
        return createByteArray();
      case PrimitivesPackage.CHAR0:
        return createchar0();
      case PrimitivesPackage.CHAR_ARRAY:
        return createcharArray();
      default:
        throw new IllegalArgumentException(
            "The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public bool createbool() {
    boolImpl bool = new boolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int8 createint8() {
    int8Impl int8 = new int8Impl();
    return int8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint8 createuint8() {
    uint8Impl uint8 = new uint8Impl();
    return uint8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int16 createint16() {
    int16Impl int16 = new int16Impl();
    return int16;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint16 createuint16() {
    uint16Impl uint16 = new uint16Impl();
    return uint16;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int32 createint32() {
    int32Impl int32 = new int32Impl();
    return int32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint32 createuint32() {
    uint32Impl uint32 = new uint32Impl();
    return uint32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int64 createint64() {
    int64Impl int64 = new int64Impl();
    return int64;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint64 createuint64() {
    uint64Impl uint64 = new uint64Impl();
    return uint64;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float32 createfloat32() {
    float32Impl float32 = new float32Impl();
    return float32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float64 createfloat64() {
    float64Impl float64 = new float64Impl();
    return float64;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public string createstring() {
    stringImpl string = new stringImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public time createtime() {
    timeImpl time = new timeImpl();
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public duration createduration() {
    durationImpl duration = new durationImpl();
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolArray createboolArray() {
    boolArrayImpl boolArray = new boolArrayImpl();
    return boolArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int8Array createint8Array() {
    int8ArrayImpl int8Array = new int8ArrayImpl();
    return int8Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint8Array createuint8Array() {
    uint8ArrayImpl uint8Array = new uint8ArrayImpl();
    return uint8Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int16Array createint16Array() {
    int16ArrayImpl int16Array = new int16ArrayImpl();
    return int16Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint16Array createuint16Array() {
    uint16ArrayImpl uint16Array = new uint16ArrayImpl();
    return uint16Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int32Array createint32Array() {
    int32ArrayImpl int32Array = new int32ArrayImpl();
    return int32Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint32Array createuint32Array() {
    uint32ArrayImpl uint32Array = new uint32ArrayImpl();
    return uint32Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int64Array createint64Array() {
    int64ArrayImpl int64Array = new int64ArrayImpl();
    return int64Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uint64Array createuint64Array() {
    uint64ArrayImpl uint64Array = new uint64ArrayImpl();
    return uint64Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float32Array createfloat32Array() {
    float32ArrayImpl float32Array = new float32ArrayImpl();
    return float32Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float64Array createfloat64Array() {
    float64ArrayImpl float64Array = new float64ArrayImpl();
    return float64Array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public stringArray createstringArray() {
    stringArrayImpl stringArray = new stringArrayImpl();
    return stringArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Header createHeader() {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public primitives.Byte createByte() {
    ByteImpl byte_ = new ByteImpl();
    return byte_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ByteArray createByteArray() {
    ByteArrayImpl byteArray = new ByteArrayImpl();
    return byteArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public char0 createchar0() {
    char0Impl char0 = new char0Impl();
    return char0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public charArray createcharArray() {
    charArrayImpl charArray = new charArrayImpl();
    return charArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MessagePart createMessagePart() {
    MessagePartImpl messagePart = new MessagePartImpl();
    return messagePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitivesPackage getPrimitivesPackage() {
    return (PrimitivesPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PrimitivesPackage getPackage() {
    return PrimitivesPackage.eINSTANCE;
  }

} // PrimitivesFactoryImpl
