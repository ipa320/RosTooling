/**
 */
package ros;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterSequence#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterSequence()
 * @model
 * @generated
 */
public interface ParameterSequence extends ParameterValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference list.
     * The list contents are of type {@link ros.ParameterValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference list.
     * @see ros.RosPackage#getParameterSequence_Value()
     * @model containment="true"
     * @generated
     */
    EList<ParameterValue> getValue();

} // ParameterSequence
