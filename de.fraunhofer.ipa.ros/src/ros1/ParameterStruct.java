/**
 */
package ros1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.ParameterStruct#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getParameterStruct()
 * @model
 * @generated
 */
public interface ParameterStruct extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.ParameterStructMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see ros1.Ros1Package#getParameterStruct_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterStructMember> getValue();

} // ParameterStruct
