/**
 */
package rossystem;

import ros.ActionServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosActionServer#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosActionServer()
 * @model
 * @generated
 */
public interface RosActionServer extends NamedInterface {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ActionServer)
     * @see rossystem.RossystemPackage#getRosActionServer_From()
     * @model required="true"
     * @generated
     */
    ActionServer getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosActionServer#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ActionServer value);

} // RosActionServer
