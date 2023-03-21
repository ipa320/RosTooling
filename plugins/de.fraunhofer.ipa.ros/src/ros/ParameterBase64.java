/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Base64</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterBase64#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterBase64()
 * @model
 * @generated
 */
public interface ParameterBase64 extends ParameterValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(byte[])
     * @see ros.RosPackage#getParameterBase64_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
     * @generated
     */
    byte[] getValue();

    /**
     * Sets the value of the '{@link ros.ParameterBase64#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(byte[] value);

} // ParameterBase64
