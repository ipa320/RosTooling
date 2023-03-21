/**
 */
package rossystem;

import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosServiceServer#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosServiceServer()
 * @model
 * @generated
 */
public interface RosServiceServer extends NamedInterface {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ServiceServer)
     * @see rossystem.RossystemPackage#getRosServiceServer_From()
     * @model required="true"
     * @generated
     */
    ServiceServer getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosServiceServer#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ServiceServer value);

} // RosServiceServer
