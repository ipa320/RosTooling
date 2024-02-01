/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link ros.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends InterfaceType {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(ParameterType)
     * @see ros.RosPackage#getParameter_Type()
     * @model containment="true" required="true"
     * @generated
     */
    ParameterType getType();

    /**
     * Sets the value of the '{@link ros.Parameter#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(ParameterType value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(ParameterValue)
     * @see ros.RosPackage#getParameter_Value()
     * @model containment="true"
     * @generated
     */
    ParameterValue getValue();

    /**
     * Sets the value of the '{@link ros.Parameter#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(ParameterValue value);

} // Parameter
