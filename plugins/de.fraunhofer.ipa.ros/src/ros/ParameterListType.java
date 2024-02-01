/**
 */
package ros;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterListType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link ros.ParameterListType#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterListType()
 * @model
 * @generated
 */
public interface ParameterListType extends ParameterType {
    /**
     * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
     * The list contents are of type {@link ros.ParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence</em>' containment reference list.
     * @see ros.RosPackage#getParameterListType_Sequence()
     * @model containment="true"
     * @generated
     */
    EList<ParameterType> getSequence();

    /**
     * Returns the value of the '<em><b>Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' containment reference.
     * @see #setDefault(ParameterSequence)
     * @see ros.RosPackage#getParameterListType_Default()
     * @model containment="true"
     * @generated
     */
    ParameterSequence getDefault();

    /**
     * Sets the value of the '{@link ros.ParameterListType#getDefault <em>Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' containment reference.
     * @see #getDefault()
     * @generated
     */
    void setDefault(ParameterSequence value);

} // ParameterListType
