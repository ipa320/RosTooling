/**
 */
package primitives.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import primitives.AbstractType;
import primitives.ByteArray;
import primitives.Header;
import primitives.MessagePart;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see primitives.PrimitivesPackage
 * @generated
 */
public class PrimitivesSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PrimitivesPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitivesSwitch() {
        if (modelPackage == null) {
            modelPackage = PrimitivesPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case PrimitivesPackage.ABSTRACT_TYPE: {
                AbstractType abstractType = (AbstractType)theEObject;
                T result = caseAbstractType(abstractType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.MESSAGE_PART: {
                MessagePart messagePart = (MessagePart)theEObject;
                T result = caseMessagePart(messagePart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.BOOL: {
                bool bool = (bool)theEObject;
                T result = casebool(bool);
                if (result == null) result = caseAbstractType(bool);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT8: {
                int8 int8 = (int8)theEObject;
                T result = caseint8(int8);
                if (result == null) result = caseAbstractType(int8);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT8: {
                uint8 uint8 = (uint8)theEObject;
                T result = caseuint8(uint8);
                if (result == null) result = caseAbstractType(uint8);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT16: {
                int16 int16 = (int16)theEObject;
                T result = caseint16(int16);
                if (result == null) result = caseAbstractType(int16);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT16: {
                uint16 uint16 = (uint16)theEObject;
                T result = caseuint16(uint16);
                if (result == null) result = caseAbstractType(uint16);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT32: {
                int32 int32 = (int32)theEObject;
                T result = caseint32(int32);
                if (result == null) result = caseAbstractType(int32);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT32: {
                uint32 uint32 = (uint32)theEObject;
                T result = caseuint32(uint32);
                if (result == null) result = caseAbstractType(uint32);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT64: {
                int64 int64 = (int64)theEObject;
                T result = caseint64(int64);
                if (result == null) result = caseAbstractType(int64);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT64: {
                uint64 uint64 = (uint64)theEObject;
                T result = caseuint64(uint64);
                if (result == null) result = caseAbstractType(uint64);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.FLOAT32: {
                float32 float32 = (float32)theEObject;
                T result = casefloat32(float32);
                if (result == null) result = caseAbstractType(float32);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.FLOAT64: {
                float64 float64 = (float64)theEObject;
                T result = casefloat64(float64);
                if (result == null) result = caseAbstractType(float64);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.STRING: {
                string string = (string)theEObject;
                T result = casestring(string);
                if (result == null) result = caseAbstractType(string);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.TIME: {
                time time = (time)theEObject;
                T result = casetime(time);
                if (result == null) result = caseAbstractType(time);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.DURATION: {
                duration duration = (duration)theEObject;
                T result = caseduration(duration);
                if (result == null) result = caseAbstractType(duration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.BOOL_ARRAY: {
                boolArray boolArray = (boolArray)theEObject;
                T result = caseboolArray(boolArray);
                if (result == null) result = caseAbstractType(boolArray);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT8_ARRAY: {
                int8Array int8Array = (int8Array)theEObject;
                T result = caseint8Array(int8Array);
                if (result == null) result = caseAbstractType(int8Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT8_ARRAY: {
                uint8Array uint8Array = (uint8Array)theEObject;
                T result = caseuint8Array(uint8Array);
                if (result == null) result = caseAbstractType(uint8Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT16_ARRAY: {
                int16Array int16Array = (int16Array)theEObject;
                T result = caseint16Array(int16Array);
                if (result == null) result = caseAbstractType(int16Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT16_ARRAY: {
                uint16Array uint16Array = (uint16Array)theEObject;
                T result = caseuint16Array(uint16Array);
                if (result == null) result = caseAbstractType(uint16Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT32_ARRAY: {
                int32Array int32Array = (int32Array)theEObject;
                T result = caseint32Array(int32Array);
                if (result == null) result = caseAbstractType(int32Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT32_ARRAY: {
                uint32Array uint32Array = (uint32Array)theEObject;
                T result = caseuint32Array(uint32Array);
                if (result == null) result = caseAbstractType(uint32Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.INT64_ARRAY: {
                int64Array int64Array = (int64Array)theEObject;
                T result = caseint64Array(int64Array);
                if (result == null) result = caseAbstractType(int64Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.UINT64_ARRAY: {
                uint64Array uint64Array = (uint64Array)theEObject;
                T result = caseuint64Array(uint64Array);
                if (result == null) result = caseAbstractType(uint64Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.FLOAT32_ARRAY: {
                float32Array float32Array = (float32Array)theEObject;
                T result = casefloat32Array(float32Array);
                if (result == null) result = caseAbstractType(float32Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.FLOAT64_ARRAY: {
                float64Array float64Array = (float64Array)theEObject;
                T result = casefloat64Array(float64Array);
                if (result == null) result = caseAbstractType(float64Array);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.STRING_ARRAY: {
                stringArray stringArray = (stringArray)theEObject;
                T result = casestringArray(stringArray);
                if (result == null) result = caseAbstractType(stringArray);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.HEADER: {
                Header header = (Header)theEObject;
                T result = caseHeader(header);
                if (result == null) result = caseAbstractType(header);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.BYTE: {
                primitives.Byte byte_ = (primitives.Byte)theEObject;
                T result = caseByte(byte_);
                if (result == null) result = caseAbstractType(byte_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.BYTE_ARRAY: {
                ByteArray byteArray = (ByteArray)theEObject;
                T result = caseByteArray(byteArray);
                if (result == null) result = caseAbstractType(byteArray);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.CHAR0: {
                char0 char0 = (char0)theEObject;
                T result = casechar0(char0);
                if (result == null) result = caseAbstractType(char0);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case PrimitivesPackage.CHAR_ARRAY: {
                charArray charArray = (charArray)theEObject;
                T result = casecharArray(charArray);
                if (result == null) result = caseAbstractType(charArray);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>bool</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>bool</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casebool(bool object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int8</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int8</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint8(int8 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint8</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint8</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint8(uint8 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int16</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int16</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint16(int16 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint16</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint16</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint16(uint16 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int32</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int32</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint32(int32 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint32</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint32</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint32(uint32 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int64</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int64</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint64(int64 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint64</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint64</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint64(uint64 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>float32</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>float32</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casefloat32(float32 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>float64</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>float64</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casefloat64(float64 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractType(AbstractType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>string</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>string</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casestring(string object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casetime(time object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>duration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>duration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseduration(duration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>bool Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>bool Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseboolArray(boolArray object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int8 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int8 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint8Array(int8Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint8 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint8 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint8Array(uint8Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int16 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int16 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint16Array(int16Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint16 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint16 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint16Array(uint16Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int32 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int32 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint32Array(int32Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint32 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint32 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint32Array(uint32Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>int64 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>int64 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseint64Array(int64Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>uint64 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>uint64 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseuint64Array(uint64Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>float32 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>float32 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casefloat32Array(float32Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>float64 Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>float64 Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casefloat64Array(float64Array object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>string Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>string Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casestringArray(stringArray object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Header</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeader(Header object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseByte(primitives.Byte object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Byte Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Byte Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseByteArray(ByteArray object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>char0</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>char0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casechar0(char0 object) {
        return null;
    }

                /**
     * Returns the result of interpreting the object as an instance of '<em>char Array</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>char Array</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casecharArray(charArray object) {
        return null;
    }

                /**
     * Returns the result of interpreting the object as an instance of '<em>Message Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Message Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMessagePart(MessagePart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //PrimitivesSwitch
