/**
 */
package ros1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.ParameterInteger#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getParameterInteger()
 * @model
 * @generated
 */
public interface ParameterInteger extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ros1.Ros1Package#getParameterInteger_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ros1.ParameterInteger#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ParameterInteger
