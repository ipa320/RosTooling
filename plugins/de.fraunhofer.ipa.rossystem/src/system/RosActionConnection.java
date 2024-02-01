/**
 */
package system;

import ros.ActionClient;
import ros.ActionServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosActionConnection#getFrom <em>From</em>}</li>
 *   <li>{@link system.RosActionConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosActionConnection()
 * @model
 * @generated
 */
public interface RosActionConnection extends RosConnection {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ActionServer)
     * @see system.RossystemPackage#getRosActionConnection_From()
     * @model required="true"
     * @generated
     */
    ActionServer getFrom();

    /**
     * Sets the value of the '{@link system.RosActionConnection#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ActionServer value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(ActionClient)
     * @see system.RossystemPackage#getRosActionConnection_To()
     * @model required="true"
     * @generated
     */
    ActionClient getTo();

    /**
     * Sets the value of the '{@link system.RosActionConnection#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(ActionClient value);

} // RosActionConnection
