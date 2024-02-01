/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterIntegerType#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterIntegerType()
 * @model
 * @generated
 */
public interface ParameterIntegerType extends ParameterType {
    /**
     * Returns the value of the '<em><b>Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' containment reference.
     * @see #setDefault(ParameterInteger)
     * @see ros.RosPackage#getParameterIntegerType_Default()
     * @model containment="true"
     * @generated
     */
    ParameterInteger getDefault();

    /**
     * Sets the value of the '{@link ros.ParameterIntegerType#getDefault <em>Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' containment reference.
     * @see #getDefault()
     * @generated
     */
    void setDefault(ParameterInteger value);

} // ParameterIntegerType
