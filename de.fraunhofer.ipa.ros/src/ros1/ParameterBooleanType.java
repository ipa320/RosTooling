/**
 */
package ros1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Boolean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.ParameterBooleanType#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getParameterBooleanType()
 * @model
 * @generated
 */
public interface ParameterBooleanType extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(ParameterBoolean)
	 * @see ros1.Ros1Package#getParameterBooleanType_Default()
	 * @model containment="true"
	 * @generated
	 */
	ParameterBoolean getDefault();

	/**
	 * Sets the value of the '{@link ros1.ParameterBooleanType#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ParameterBoolean value);

} // ParameterBooleanType
