/**
 */
package system;

import ros.ServiceClient;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosServiceConnection#getFrom <em>From</em>}</li>
 *   <li>{@link system.RosServiceConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosServiceConnection()
 * @model
 * @generated
 */
public interface RosServiceConnection extends RosConnection {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ServiceServer)
     * @see system.RossystemPackage#getRosServiceConnection_From()
     * @model required="true"
     * @generated
     */
    ServiceServer getFrom();

    /**
     * Sets the value of the '{@link system.RosServiceConnection#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ServiceServer value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(ServiceClient)
     * @see system.RossystemPackage#getRosServiceConnection_To()
     * @model required="true"
     * @generated
     */
    ServiceClient getTo();

    /**
     * Sets the value of the '{@link system.RosServiceConnection#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(ServiceClient value);

} // RosServiceConnection
