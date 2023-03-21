/**
 */
package system;

import ros.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosParameterReference#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosParameterReference()
 * @model
 * @generated
 */
public interface RosParameterReference extends InterfaceReference {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Parameter)
     * @see system.RossystemPackage#getRosParameterReference_From()
     * @model required="true"
     * @generated
     */
    Parameter getFrom();

    /**
     * Sets the value of the '{@link system.RosParameterReference#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Parameter value);

} // RosParameterReference
