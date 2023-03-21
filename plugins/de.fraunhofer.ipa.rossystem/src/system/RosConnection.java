/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosConnection#getFrom <em>From</em>}</li>
 *   <li>{@link system.RosConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosConnection()
 * @model
 * @generated
 */
public interface RosConnection extends Connection {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(RosInterface)
     * @see system.RossystemPackage#getRosConnection_From()
     * @model required="true"
     * @generated
     */
    RosInterface getFrom();

    /**
     * Sets the value of the '{@link system.RosConnection#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(RosInterface value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(RosInterface)
     * @see system.RossystemPackage#getRosConnection_To()
     * @model required="true"
     * @generated
     */
    RosInterface getTo();

    /**
     * Sets the value of the '{@link system.RosConnection#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(RosInterface value);

} // RosConnection
