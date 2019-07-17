/**
 */
package primitives;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see primitives.PrimitivesFactory
 * @model kind="package"
 * @generated
 */
public interface PrimitivesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "primitives";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/primitives";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "primitives";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitivesPackage eINSTANCE = primitives.impl.PrimitivesPackageImpl.init();

	/**
	 * The meta object id for the '{@link primitives.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.AbstractTypeImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link primitives.impl.boolImpl <em>bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.boolImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getbool()
	 * @generated
	 */
	int BOOL = 1;

	/**
	 * The number of structural features of the '<em>bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int8Impl <em>int8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int8Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getint8()
	 * @generated
	 */
	int INT8 = 2;

	/**
	 * The number of structural features of the '<em>int8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT8_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT8_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint8Impl <em>uint8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint8Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint8()
	 * @generated
	 */
	int UINT8 = 3;

	/**
	 * The number of structural features of the '<em>uint8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT8_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT8_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int16Impl <em>int16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int16Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getint16()
	 * @generated
	 */
	int INT16 = 4;

	/**
	 * The number of structural features of the '<em>int16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT16_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT16_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint16Impl <em>uint16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint16Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint16()
	 * @generated
	 */
	int UINT16 = 5;

	/**
	 * The number of structural features of the '<em>uint16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT16_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT16_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int32Impl <em>int32</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int32Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getint32()
	 * @generated
	 */
	int INT32 = 6;

	/**
	 * The number of structural features of the '<em>int32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT32_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT32_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint32Impl <em>uint32</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint32Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint32()
	 * @generated
	 */
	int UINT32 = 7;

	/**
	 * The number of structural features of the '<em>uint32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT32_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT32_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int64Impl <em>int64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int64Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getint64()
	 * @generated
	 */
	int INT64 = 8;

	/**
	 * The number of structural features of the '<em>int64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT64_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT64_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint64Impl <em>uint64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint64Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint64()
	 * @generated
	 */
	int UINT64 = 9;

	/**
	 * The number of structural features of the '<em>uint64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT64_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT64_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.float32Impl <em>float32</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.float32Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getfloat32()
	 * @generated
	 */
	int FLOAT32 = 10;

	/**
	 * The number of structural features of the '<em>float32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT32_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>float32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT32_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.float64Impl <em>float64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.float64Impl
	 * @see primitives.impl.PrimitivesPackageImpl#getfloat64()
	 * @generated
	 */
	int FLOAT64 = 11;

	/**
	 * The number of structural features of the '<em>float64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT64_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>float64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT64_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.stringImpl <em>string</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.stringImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 12;

	/**
	 * The number of structural features of the '<em>string</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>string</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.timeImpl <em>time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.timeImpl
	 * @see primitives.impl.PrimitivesPackageImpl#gettime()
	 * @generated
	 */
	int TIME = 13;

	/**
	 * The number of structural features of the '<em>time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.durationImpl <em>duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.durationImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getduration()
	 * @generated
	 */
	int DURATION = 14;

	/**
	 * The number of structural features of the '<em>duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.boolArrayImpl <em>bool Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.boolArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getboolArray()
	 * @generated
	 */
	int BOOL_ARRAY = 15;

	/**
	 * The number of structural features of the '<em>bool Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>bool Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int8ArrayImpl <em>int8 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int8ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getint8Array()
	 * @generated
	 */
	int INT8_ARRAY = 16;

	/**
	 * The number of structural features of the '<em>int8 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT8_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int8 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT8_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint8ArrayImpl <em>uint8 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint8ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint8Array()
	 * @generated
	 */
	int UINT8_ARRAY = 17;

	/**
	 * The number of structural features of the '<em>uint8 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT8_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint8 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT8_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int16ArrayImpl <em>int16 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int16ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getint16Array()
	 * @generated
	 */
	int INT16_ARRAY = 18;

	/**
	 * The number of structural features of the '<em>int16 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT16_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int16 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT16_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint16ArrayImpl <em>uint16 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint16ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint16Array()
	 * @generated
	 */
	int UINT16_ARRAY = 19;

	/**
	 * The number of structural features of the '<em>uint16 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT16_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint16 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT16_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int32ArrayImpl <em>int32 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int32ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getint32Array()
	 * @generated
	 */
	int INT32_ARRAY = 20;

	/**
	 * The number of structural features of the '<em>int32 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT32_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int32 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT32_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint32ArrayImpl <em>uint32 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint32ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint32Array()
	 * @generated
	 */
	int UINT32_ARRAY = 21;

	/**
	 * The number of structural features of the '<em>uint32 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT32_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint32 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT32_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.int64ArrayImpl <em>int64 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.int64ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getint64Array()
	 * @generated
	 */
	int INT64_ARRAY = 22;

	/**
	 * The number of structural features of the '<em>int64 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT64_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>int64 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT64_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.uint64ArrayImpl <em>uint64 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.uint64ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getuint64Array()
	 * @generated
	 */
	int UINT64_ARRAY = 23;

	/**
	 * The number of structural features of the '<em>uint64 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT64_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>uint64 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UINT64_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.float32ArrayImpl <em>float32 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.float32ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getfloat32Array()
	 * @generated
	 */
	int FLOAT32_ARRAY = 24;

	/**
	 * The number of structural features of the '<em>float32 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT32_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>float32 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT32_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.float64ArrayImpl <em>float64 Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.float64ArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getfloat64Array()
	 * @generated
	 */
	int FLOAT64_ARRAY = 25;

	/**
	 * The number of structural features of the '<em>float64 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT64_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>float64 Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT64_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.stringArrayImpl <em>string Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.stringArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getstringArray()
	 * @generated
	 */
	int STRING_ARRAY = 26;

	/**
	 * The number of structural features of the '<em>string Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>string Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.HeaderImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 27;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.ByteImpl <em>Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.ByteImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 28;

	/**
	 * The number of structural features of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.ByteArrayImpl <em>Byte Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.ByteArrayImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getByteArray()
	 * @generated
	 */
	int BYTE_ARRAY = 29;

	/**
	 * The number of structural features of the '<em>Byte Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ARRAY_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Byte Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ARRAY_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.TopicSpecRefImpl <em>Topic Spec Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.TopicSpecRefImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getTopicSpecRef()
	 * @generated
	 */
	int TOPIC_SPEC_REF = 30;

	/**
	 * The feature id for the '<em><b>Topic Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_REF__TOPIC_SPEC = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topic Spec Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_REF_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Topic Spec Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_REF_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.ArrayTopicSpecRefImpl <em>Array Topic Spec Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.ArrayTopicSpecRefImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getArrayTopicSpecRef()
	 * @generated
	 */
	int ARRAY_TOPIC_SPEC_REF = 31;

	/**
	 * The feature id for the '<em><b>Topic Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TOPIC_SPEC_REF__TOPIC_SPEC = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Topic Spec Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TOPIC_SPEC_REF_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Topic Spec Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TOPIC_SPEC_REF_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.MessagePartImpl <em>Message Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.MessagePartImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getMessagePart()
	 * @generated
	 */
	int MESSAGE_PART = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART__DATA = 1;

	/**
	 * The number of structural features of the '<em>Message Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link primitives.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.MessageDefinitionImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getMessageDefinition()
	 * @generated
	 */
	int MESSAGE_DEFINITION = 33;

	/**
	 * The feature id for the '<em><b>Message Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__MESSAGE_PART = 0;

	/**
	 * The number of structural features of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link primitives.impl.SpecBaseImpl <em>Spec Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.SpecBaseImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getSpecBase()
	 * @generated
	 */
	int SPEC_BASE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE__FULLNAME = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Spec Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Spec Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link primitives.impl.TopicSpecImpl <em>Topic Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.TopicSpecImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getTopicSpec()
	 * @generated
	 */
	int TOPIC_SPEC = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__NAME = SPEC_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__FULLNAME = SPEC_BASE__FULLNAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__PACKAGE = SPEC_BASE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC__MESSAGE = SPEC_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topic Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_FEATURE_COUNT = SPEC_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Topic Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_SPEC_OPERATION_COUNT = SPEC_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.ServiceSpecImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getServiceSpec()
	 * @generated
	 */
	int SERVICE_SPEC = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__NAME = SPEC_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__FULLNAME = SPEC_BASE__FULLNAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__PACKAGE = SPEC_BASE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__REQUEST = SPEC_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC__RESPONSE = SPEC_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC_FEATURE_COUNT = SPEC_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPEC_OPERATION_COUNT = SPEC_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link primitives.impl.ActionSpecImpl <em>Action Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see primitives.impl.ActionSpecImpl
	 * @see primitives.impl.PrimitivesPackageImpl#getActionSpec()
	 * @generated
	 */
	int ACTION_SPEC = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__NAME = SPEC_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__FULLNAME = SPEC_BASE__FULLNAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__PACKAGE = SPEC_BASE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__GOAL = SPEC_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__RESULT = SPEC_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC__FEEDBACK = SPEC_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC_FEATURE_COUNT = SPEC_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC_OPERATION_COUNT = SPEC_BASE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link primitives.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see primitives.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for class '{@link primitives.bool <em>bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bool</em>'.
	 * @see primitives.bool
	 * @generated
	 */
	EClass getbool();

	/**
	 * Returns the meta object for class '{@link primitives.int8 <em>int8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int8</em>'.
	 * @see primitives.int8
	 * @generated
	 */
	EClass getint8();

	/**
	 * Returns the meta object for class '{@link primitives.uint8 <em>uint8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint8</em>'.
	 * @see primitives.uint8
	 * @generated
	 */
	EClass getuint8();

	/**
	 * Returns the meta object for class '{@link primitives.int16 <em>int16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int16</em>'.
	 * @see primitives.int16
	 * @generated
	 */
	EClass getint16();

	/**
	 * Returns the meta object for class '{@link primitives.uint16 <em>uint16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint16</em>'.
	 * @see primitives.uint16
	 * @generated
	 */
	EClass getuint16();

	/**
	 * Returns the meta object for class '{@link primitives.int32 <em>int32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int32</em>'.
	 * @see primitives.int32
	 * @generated
	 */
	EClass getint32();

	/**
	 * Returns the meta object for class '{@link primitives.uint32 <em>uint32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint32</em>'.
	 * @see primitives.uint32
	 * @generated
	 */
	EClass getuint32();

	/**
	 * Returns the meta object for class '{@link primitives.int64 <em>int64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int64</em>'.
	 * @see primitives.int64
	 * @generated
	 */
	EClass getint64();

	/**
	 * Returns the meta object for class '{@link primitives.uint64 <em>uint64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint64</em>'.
	 * @see primitives.uint64
	 * @generated
	 */
	EClass getuint64();

	/**
	 * Returns the meta object for class '{@link primitives.float32 <em>float32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>float32</em>'.
	 * @see primitives.float32
	 * @generated
	 */
	EClass getfloat32();

	/**
	 * Returns the meta object for class '{@link primitives.float64 <em>float64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>float64</em>'.
	 * @see primitives.float64
	 * @generated
	 */
	EClass getfloat64();

	/**
	 * Returns the meta object for class '{@link primitives.string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string</em>'.
	 * @see primitives.string
	 * @generated
	 */
	EClass getstring();

	/**
	 * Returns the meta object for class '{@link primitives.time <em>time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>time</em>'.
	 * @see primitives.time
	 * @generated
	 */
	EClass gettime();

	/**
	 * Returns the meta object for class '{@link primitives.duration <em>duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duration</em>'.
	 * @see primitives.duration
	 * @generated
	 */
	EClass getduration();

	/**
	 * Returns the meta object for class '{@link primitives.boolArray <em>bool Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bool Array</em>'.
	 * @see primitives.boolArray
	 * @generated
	 */
	EClass getboolArray();

	/**
	 * Returns the meta object for class '{@link primitives.int8Array <em>int8 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int8 Array</em>'.
	 * @see primitives.int8Array
	 * @generated
	 */
	EClass getint8Array();

	/**
	 * Returns the meta object for class '{@link primitives.uint8Array <em>uint8 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint8 Array</em>'.
	 * @see primitives.uint8Array
	 * @generated
	 */
	EClass getuint8Array();

	/**
	 * Returns the meta object for class '{@link primitives.int16Array <em>int16 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int16 Array</em>'.
	 * @see primitives.int16Array
	 * @generated
	 */
	EClass getint16Array();

	/**
	 * Returns the meta object for class '{@link primitives.uint16Array <em>uint16 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint16 Array</em>'.
	 * @see primitives.uint16Array
	 * @generated
	 */
	EClass getuint16Array();

	/**
	 * Returns the meta object for class '{@link primitives.int32Array <em>int32 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int32 Array</em>'.
	 * @see primitives.int32Array
	 * @generated
	 */
	EClass getint32Array();

	/**
	 * Returns the meta object for class '{@link primitives.uint32Array <em>uint32 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint32 Array</em>'.
	 * @see primitives.uint32Array
	 * @generated
	 */
	EClass getuint32Array();

	/**
	 * Returns the meta object for class '{@link primitives.int64Array <em>int64 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int64 Array</em>'.
	 * @see primitives.int64Array
	 * @generated
	 */
	EClass getint64Array();

	/**
	 * Returns the meta object for class '{@link primitives.uint64Array <em>uint64 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uint64 Array</em>'.
	 * @see primitives.uint64Array
	 * @generated
	 */
	EClass getuint64Array();

	/**
	 * Returns the meta object for class '{@link primitives.float32Array <em>float32 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>float32 Array</em>'.
	 * @see primitives.float32Array
	 * @generated
	 */
	EClass getfloat32Array();

	/**
	 * Returns the meta object for class '{@link primitives.float64Array <em>float64 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>float64 Array</em>'.
	 * @see primitives.float64Array
	 * @generated
	 */
	EClass getfloat64Array();

	/**
	 * Returns the meta object for class '{@link primitives.stringArray <em>string Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string Array</em>'.
	 * @see primitives.stringArray
	 * @generated
	 */
	EClass getstringArray();

	/**
	 * Returns the meta object for class '{@link primitives.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see primitives.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for class '{@link primitives.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte</em>'.
	 * @see primitives.Byte
	 * @generated
	 */
	EClass getByte();

	/**
	 * Returns the meta object for class '{@link primitives.ByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Array</em>'.
	 * @see primitives.ByteArray
	 * @generated
	 */
	EClass getByteArray();

	/**
	 * Returns the meta object for class '{@link primitives.TopicSpecRef <em>Topic Spec Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Spec Ref</em>'.
	 * @see primitives.TopicSpecRef
	 * @generated
	 */
	EClass getTopicSpecRef();

	/**
	 * Returns the meta object for the reference '{@link primitives.TopicSpecRef#getTopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Spec</em>'.
	 * @see primitives.TopicSpecRef#getTopicSpec()
	 * @see #getTopicSpecRef()
	 * @generated
	 */
	EReference getTopicSpecRef_TopicSpec();

	/**
	 * Returns the meta object for class '{@link primitives.ArrayTopicSpecRef <em>Array Topic Spec Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Topic Spec Ref</em>'.
	 * @see primitives.ArrayTopicSpecRef
	 * @generated
	 */
	EClass getArrayTopicSpecRef();

	/**
	 * Returns the meta object for the reference '{@link primitives.ArrayTopicSpecRef#getTopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic Spec</em>'.
	 * @see primitives.ArrayTopicSpecRef#getTopicSpec()
	 * @see #getArrayTopicSpecRef()
	 * @generated
	 */
	EReference getArrayTopicSpecRef_TopicSpec();

	/**
	 * Returns the meta object for class '{@link primitives.MessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Part</em>'.
	 * @see primitives.MessagePart
	 * @generated
	 */
	EClass getMessagePart();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.MessagePart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see primitives.MessagePart#getType()
	 * @see #getMessagePart()
	 * @generated
	 */
	EReference getMessagePart_Type();

	/**
	 * Returns the meta object for the attribute '{@link primitives.MessagePart#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see primitives.MessagePart#getData()
	 * @see #getMessagePart()
	 * @generated
	 */
	EAttribute getMessagePart_Data();

	/**
	 * Returns the meta object for class '{@link primitives.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Definition</em>'.
	 * @see primitives.MessageDefinition
	 * @generated
	 */
	EClass getMessageDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link primitives.MessageDefinition#getMessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Part</em>'.
	 * @see primitives.MessageDefinition#getMessagePart()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_MessagePart();

	/**
	 * Returns the meta object for class '{@link primitives.SpecBase <em>Spec Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Base</em>'.
	 * @see primitives.SpecBase
	 * @generated
	 */
	EClass getSpecBase();

	/**
	 * Returns the meta object for the attribute '{@link primitives.SpecBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see primitives.SpecBase#getName()
	 * @see #getSpecBase()
	 * @generated
	 */
	EAttribute getSpecBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link primitives.SpecBase#getFullname <em>Fullname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullname</em>'.
	 * @see primitives.SpecBase#getFullname()
	 * @see #getSpecBase()
	 * @generated
	 */
	EAttribute getSpecBase_Fullname();

	/**
	 * Returns the meta object for the container reference '{@link primitives.SpecBase#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see primitives.SpecBase#getPackage()
	 * @see #getSpecBase()
	 * @generated
	 */
	EReference getSpecBase_Package();

	/**
	 * Returns the meta object for class '{@link primitives.TopicSpec <em>Topic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Spec</em>'.
	 * @see primitives.TopicSpec
	 * @generated
	 */
	EClass getTopicSpec();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.TopicSpec#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see primitives.TopicSpec#getMessage()
	 * @see #getTopicSpec()
	 * @generated
	 */
	EReference getTopicSpec_Message();

	/**
	 * Returns the meta object for class '{@link primitives.ServiceSpec <em>Service Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Spec</em>'.
	 * @see primitives.ServiceSpec
	 * @generated
	 */
	EClass getServiceSpec();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.ServiceSpec#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see primitives.ServiceSpec#getRequest()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Request();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.ServiceSpec#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see primitives.ServiceSpec#getResponse()
	 * @see #getServiceSpec()
	 * @generated
	 */
	EReference getServiceSpec_Response();

	/**
	 * Returns the meta object for class '{@link primitives.ActionSpec <em>Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Spec</em>'.
	 * @see primitives.ActionSpec
	 * @generated
	 */
	EClass getActionSpec();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.ActionSpec#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal</em>'.
	 * @see primitives.ActionSpec#getGoal()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.ActionSpec#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see primitives.ActionSpec#getResult()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Result();

	/**
	 * Returns the meta object for the containment reference '{@link primitives.ActionSpec#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback</em>'.
	 * @see primitives.ActionSpec#getFeedback()
	 * @see #getActionSpec()
	 * @generated
	 */
	EReference getActionSpec_Feedback();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrimitivesFactory getPrimitivesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link primitives.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.AbstractTypeImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '{@link primitives.impl.boolImpl <em>bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.boolImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getbool()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getbool();

		/**
		 * The meta object literal for the '{@link primitives.impl.int8Impl <em>int8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int8Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getint8()
		 * @generated
		 */
		EClass INT8 = eINSTANCE.getint8();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint8Impl <em>uint8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint8Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint8()
		 * @generated
		 */
		EClass UINT8 = eINSTANCE.getuint8();

		/**
		 * The meta object literal for the '{@link primitives.impl.int16Impl <em>int16</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int16Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getint16()
		 * @generated
		 */
		EClass INT16 = eINSTANCE.getint16();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint16Impl <em>uint16</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint16Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint16()
		 * @generated
		 */
		EClass UINT16 = eINSTANCE.getuint16();

		/**
		 * The meta object literal for the '{@link primitives.impl.int32Impl <em>int32</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int32Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getint32()
		 * @generated
		 */
		EClass INT32 = eINSTANCE.getint32();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint32Impl <em>uint32</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint32Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint32()
		 * @generated
		 */
		EClass UINT32 = eINSTANCE.getuint32();

		/**
		 * The meta object literal for the '{@link primitives.impl.int64Impl <em>int64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int64Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getint64()
		 * @generated
		 */
		EClass INT64 = eINSTANCE.getint64();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint64Impl <em>uint64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint64Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint64()
		 * @generated
		 */
		EClass UINT64 = eINSTANCE.getuint64();

		/**
		 * The meta object literal for the '{@link primitives.impl.float32Impl <em>float32</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.float32Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getfloat32()
		 * @generated
		 */
		EClass FLOAT32 = eINSTANCE.getfloat32();

		/**
		 * The meta object literal for the '{@link primitives.impl.float64Impl <em>float64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.float64Impl
		 * @see primitives.impl.PrimitivesPackageImpl#getfloat64()
		 * @generated
		 */
		EClass FLOAT64 = eINSTANCE.getfloat64();

		/**
		 * The meta object literal for the '{@link primitives.impl.stringImpl <em>string</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.stringImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getstring()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getstring();

		/**
		 * The meta object literal for the '{@link primitives.impl.timeImpl <em>time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.timeImpl
		 * @see primitives.impl.PrimitivesPackageImpl#gettime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.gettime();

		/**
		 * The meta object literal for the '{@link primitives.impl.durationImpl <em>duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.durationImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getduration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getduration();

		/**
		 * The meta object literal for the '{@link primitives.impl.boolArrayImpl <em>bool Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.boolArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getboolArray()
		 * @generated
		 */
		EClass BOOL_ARRAY = eINSTANCE.getboolArray();

		/**
		 * The meta object literal for the '{@link primitives.impl.int8ArrayImpl <em>int8 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int8ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getint8Array()
		 * @generated
		 */
		EClass INT8_ARRAY = eINSTANCE.getint8Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint8ArrayImpl <em>uint8 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint8ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint8Array()
		 * @generated
		 */
		EClass UINT8_ARRAY = eINSTANCE.getuint8Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.int16ArrayImpl <em>int16 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int16ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getint16Array()
		 * @generated
		 */
		EClass INT16_ARRAY = eINSTANCE.getint16Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint16ArrayImpl <em>uint16 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint16ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint16Array()
		 * @generated
		 */
		EClass UINT16_ARRAY = eINSTANCE.getuint16Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.int32ArrayImpl <em>int32 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int32ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getint32Array()
		 * @generated
		 */
		EClass INT32_ARRAY = eINSTANCE.getint32Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint32ArrayImpl <em>uint32 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint32ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint32Array()
		 * @generated
		 */
		EClass UINT32_ARRAY = eINSTANCE.getuint32Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.int64ArrayImpl <em>int64 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.int64ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getint64Array()
		 * @generated
		 */
		EClass INT64_ARRAY = eINSTANCE.getint64Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.uint64ArrayImpl <em>uint64 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.uint64ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getuint64Array()
		 * @generated
		 */
		EClass UINT64_ARRAY = eINSTANCE.getuint64Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.float32ArrayImpl <em>float32 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.float32ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getfloat32Array()
		 * @generated
		 */
		EClass FLOAT32_ARRAY = eINSTANCE.getfloat32Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.float64ArrayImpl <em>float64 Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.float64ArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getfloat64Array()
		 * @generated
		 */
		EClass FLOAT64_ARRAY = eINSTANCE.getfloat64Array();

		/**
		 * The meta object literal for the '{@link primitives.impl.stringArrayImpl <em>string Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.stringArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getstringArray()
		 * @generated
		 */
		EClass STRING_ARRAY = eINSTANCE.getstringArray();

		/**
		 * The meta object literal for the '{@link primitives.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.HeaderImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '{@link primitives.impl.ByteImpl <em>Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.ByteImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getByte()
		 * @generated
		 */
		EClass BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '{@link primitives.impl.ByteArrayImpl <em>Byte Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.ByteArrayImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getByteArray()
		 * @generated
		 */
		EClass BYTE_ARRAY = eINSTANCE.getByteArray();

		/**
		 * The meta object literal for the '{@link primitives.impl.TopicSpecRefImpl <em>Topic Spec Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.TopicSpecRefImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getTopicSpecRef()
		 * @generated
		 */
		EClass TOPIC_SPEC_REF = eINSTANCE.getTopicSpecRef();

		/**
		 * The meta object literal for the '<em><b>Topic Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_SPEC_REF__TOPIC_SPEC = eINSTANCE.getTopicSpecRef_TopicSpec();

		/**
		 * The meta object literal for the '{@link primitives.impl.ArrayTopicSpecRefImpl <em>Array Topic Spec Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.ArrayTopicSpecRefImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getArrayTopicSpecRef()
		 * @generated
		 */
		EClass ARRAY_TOPIC_SPEC_REF = eINSTANCE.getArrayTopicSpecRef();

		/**
		 * The meta object literal for the '<em><b>Topic Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TOPIC_SPEC_REF__TOPIC_SPEC = eINSTANCE.getArrayTopicSpecRef_TopicSpec();

		/**
		 * The meta object literal for the '{@link primitives.impl.MessagePartImpl <em>Message Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.MessagePartImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getMessagePart()
		 * @generated
		 */
		EClass MESSAGE_PART = eINSTANCE.getMessagePart();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_PART__TYPE = eINSTANCE.getMessagePart_Type();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_PART__DATA = eINSTANCE.getMessagePart_Data();

		/**
		 * The meta object literal for the '{@link primitives.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.MessageDefinitionImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getMessageDefinition()
		 * @generated
		 */
		EClass MESSAGE_DEFINITION = eINSTANCE.getMessageDefinition();

		/**
		 * The meta object literal for the '<em><b>Message Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DEFINITION__MESSAGE_PART = eINSTANCE.getMessageDefinition_MessagePart();

		/**
		 * The meta object literal for the '{@link primitives.impl.SpecBaseImpl <em>Spec Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.SpecBaseImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getSpecBase()
		 * @generated
		 */
		EClass SPEC_BASE = eINSTANCE.getSpecBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_BASE__NAME = eINSTANCE.getSpecBase_Name();

		/**
		 * The meta object literal for the '<em><b>Fullname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_BASE__FULLNAME = eINSTANCE.getSpecBase_Fullname();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_BASE__PACKAGE = eINSTANCE.getSpecBase_Package();

		/**
		 * The meta object literal for the '{@link primitives.impl.TopicSpecImpl <em>Topic Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.TopicSpecImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getTopicSpec()
		 * @generated
		 */
		EClass TOPIC_SPEC = eINSTANCE.getTopicSpec();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_SPEC__MESSAGE = eINSTANCE.getTopicSpec_Message();

		/**
		 * The meta object literal for the '{@link primitives.impl.ServiceSpecImpl <em>Service Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.ServiceSpecImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getServiceSpec()
		 * @generated
		 */
		EClass SERVICE_SPEC = eINSTANCE.getServiceSpec();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPEC__REQUEST = eINSTANCE.getServiceSpec_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPEC__RESPONSE = eINSTANCE.getServiceSpec_Response();

		/**
		 * The meta object literal for the '{@link primitives.impl.ActionSpecImpl <em>Action Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see primitives.impl.ActionSpecImpl
		 * @see primitives.impl.PrimitivesPackageImpl#getActionSpec()
		 * @generated
		 */
		EClass ACTION_SPEC = eINSTANCE.getActionSpec();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SPEC__GOAL = eINSTANCE.getActionSpec_Goal();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SPEC__RESULT = eINSTANCE.getActionSpec_Result();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SPEC__FEEDBACK = eINSTANCE.getActionSpec_Feedback();

	}

} //PrimitivesPackage
