/**
 */
package ros;

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
 *   <li>{@link ros.ParameterStruct#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterStruct()
 * @model
 * @generated
 */
public interface ParameterStruct extends ParameterValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference list.
     * The list contents are of type {@link ros.ParameterStructMember}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference list.
     * @see ros.RosPackage#getParameterStruct_Value()
     * @model containment="true"
     * @generated
     */
    EList<ParameterStructMember> getValue();

} // ParameterStruct
