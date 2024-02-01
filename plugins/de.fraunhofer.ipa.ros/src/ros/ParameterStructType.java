/**
 */
package ros;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterStructType#getParameterstructypetmember <em>Parameterstructypetmember</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterStructType()
 * @model
 * @generated
 */
public interface ParameterStructType extends ParameterType {
    /**
     * Returns the value of the '<em><b>Parameterstructypetmember</b></em>' containment reference list.
     * The list contents are of type {@link ros.ParameterStructTypeMember}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameterstructypetmember</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameterstructypetmember</em>' containment reference list.
     * @see ros.RosPackage#getParameterStructType_Parameterstructypetmember()
     * @model containment="true"
     * @generated
     */
    EList<ParameterStructTypeMember> getParameterstructypetmember();

} // ParameterStructType
