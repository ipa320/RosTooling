/**
 */
package rossystem;

import ros.ActionClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosActionClient#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosActionClient()
 * @model
 * @generated
 */
public interface RosActionClient extends NamedInterface {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ActionClient)
     * @see rossystem.RossystemPackage#getRosActionClient_From()
     * @model required="true"
     * @generated
     */
    ActionClient getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosActionClient#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ActionClient value);

} // RosActionClient
