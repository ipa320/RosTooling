/**
 */
package system;

import ros.ActionServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action Server Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosActionServerReference#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosActionServerReference()
 * @model
 * @generated
 */
public interface RosActionServerReference extends InterfaceReference {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ActionServer)
     * @see system.RossystemPackage#getRosActionServerReference_From()
     * @model required="true"
     * @generated
     */
    ActionServer getFrom();

    /**
     * Sets the value of the '{@link system.RosActionServerReference#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ActionServer value);

} // RosActionServerReference
