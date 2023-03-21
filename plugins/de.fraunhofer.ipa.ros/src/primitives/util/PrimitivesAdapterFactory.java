/**
 */
package primitives.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import primitives.AbstractType;
import primitives.ByteArray;
import primitives.Header;
import primitives.MessagePart;
import primitives.PrimitivesPackage;
import primitives.bool;
import primitives.boolArray;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see primitives.PrimitivesPackage
 * @generated
 */
public class PrimitivesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrimitivesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PrimitivesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitivesSwitch<Adapter> modelSwitch =
		new PrimitivesSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseMessagePart(MessagePart object) {
				return createMessagePartAdapter();
			}
			@Override
			public Adapter casebool(bool object) {
				return createboolAdapter();
			}
			@Override
			public Adapter caseint8(int8 object) {
				return createint8Adapter();
			}
			@Override
			public Adapter caseuint8(uint8 object) {
				return createuint8Adapter();
			}
			@Override
			public Adapter caseint16(int16 object) {
				return createint16Adapter();
			}
			@Override
			public Adapter caseuint16(uint16 object) {
				return createuint16Adapter();
			}
			@Override
			public Adapter caseint32(int32 object) {
				return createint32Adapter();
			}
			@Override
			public Adapter caseuint32(uint32 object) {
				return createuint32Adapter();
			}
			@Override
			public Adapter caseint64(int64 object) {
				return createint64Adapter();
			}
			@Override
			public Adapter caseuint64(uint64 object) {
				return createuint64Adapter();
			}
			@Override
			public Adapter casefloat32(float32 object) {
				return createfloat32Adapter();
			}
			@Override
			public Adapter casefloat64(float64 object) {
				return createfloat64Adapter();
			}
			@Override
			public Adapter casestring(string object) {
				return createstringAdapter();
			}
			@Override
			public Adapter casetime(time object) {
				return createtimeAdapter();
			}
			@Override
			public Adapter caseduration(duration object) {
				return createdurationAdapter();
			}
			@Override
			public Adapter caseboolArray(boolArray object) {
				return createboolArrayAdapter();
			}
			@Override
			public Adapter caseint8Array(int8Array object) {
				return createint8ArrayAdapter();
			}
			@Override
			public Adapter caseuint8Array(uint8Array object) {
				return createuint8ArrayAdapter();
			}
			@Override
			public Adapter caseint16Array(int16Array object) {
				return createint16ArrayAdapter();
			}
			@Override
			public Adapter caseuint16Array(uint16Array object) {
				return createuint16ArrayAdapter();
			}
			@Override
			public Adapter caseint32Array(int32Array object) {
				return createint32ArrayAdapter();
			}
			@Override
			public Adapter caseuint32Array(uint32Array object) {
				return createuint32ArrayAdapter();
			}
			@Override
			public Adapter caseint64Array(int64Array object) {
				return createint64ArrayAdapter();
			}
			@Override
			public Adapter caseuint64Array(uint64Array object) {
				return createuint64ArrayAdapter();
			}
			@Override
			public Adapter casefloat32Array(float32Array object) {
				return createfloat32ArrayAdapter();
			}
			@Override
			public Adapter casefloat64Array(float64Array object) {
				return createfloat64ArrayAdapter();
			}
			@Override
			public Adapter casestringArray(stringArray object) {
				return createstringArrayAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseByte(primitives.Byte object) {
				return createByteAdapter();
			}
			@Override
			public Adapter caseByteArray(ByteArray object) {
				return createByteArrayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link primitives.bool <em>bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.bool
	 * @generated
	 */
	public Adapter createboolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int8 <em>int8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int8
	 * @generated
	 */
	public Adapter createint8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint8 <em>uint8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint8
	 * @generated
	 */
	public Adapter createuint8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int16 <em>int16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int16
	 * @generated
	 */
	public Adapter createint16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint16 <em>uint16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint16
	 * @generated
	 */
	public Adapter createuint16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int32 <em>int32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int32
	 * @generated
	 */
	public Adapter createint32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint32 <em>uint32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint32
	 * @generated
	 */
	public Adapter createuint32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int64 <em>int64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int64
	 * @generated
	 */
	public Adapter createint64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint64 <em>uint64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint64
	 * @generated
	 */
	public Adapter createuint64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.float32 <em>float32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.float32
	 * @generated
	 */
	public Adapter createfloat32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.float64 <em>float64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.float64
	 * @generated
	 */
	public Adapter createfloat64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.string <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.string
	 * @generated
	 */
	public Adapter createstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.time <em>time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.time
	 * @generated
	 */
	public Adapter createtimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.duration <em>duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.duration
	 * @generated
	 */
	public Adapter createdurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.boolArray <em>bool Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.boolArray
	 * @generated
	 */
	public Adapter createboolArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int8Array <em>int8 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int8Array
	 * @generated
	 */
	public Adapter createint8ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint8Array <em>uint8 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint8Array
	 * @generated
	 */
	public Adapter createuint8ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int16Array <em>int16 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int16Array
	 * @generated
	 */
	public Adapter createint16ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint16Array <em>uint16 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint16Array
	 * @generated
	 */
	public Adapter createuint16ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int32Array <em>int32 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int32Array
	 * @generated
	 */
	public Adapter createint32ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint32Array <em>uint32 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint32Array
	 * @generated
	 */
	public Adapter createuint32ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.int64Array <em>int64 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.int64Array
	 * @generated
	 */
	public Adapter createint64ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.uint64Array <em>uint64 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.uint64Array
	 * @generated
	 */
	public Adapter createuint64ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.float32Array <em>float32 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.float32Array
	 * @generated
	 */
	public Adapter createfloat32ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.float64Array <em>float64 Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.float64Array
	 * @generated
	 */
	public Adapter createfloat64ArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.stringArray <em>string Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.stringArray
	 * @generated
	 */
	public Adapter createstringArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.Byte
	 * @generated
	 */
	public Adapter createByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.ByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.ByteArray
	 * @generated
	 */
	public Adapter createByteArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link primitives.MessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see primitives.MessagePart
	 * @generated
	 */
	public Adapter createMessagePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PrimitivesAdapterFactory
