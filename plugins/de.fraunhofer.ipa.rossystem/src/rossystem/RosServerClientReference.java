/**
 */
package rossystem;

import ros.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Server Client Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosServerClientReference#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosServerClientReference()
 * @model
 * @generated
 */
public interface RosServerClientReference extends InterfaceReference {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ServiceClient)
     * @see rossystem.RossystemPackage#getRosServerClientReference_From()
     * @model required="true"
     * @generated
     */
    ServiceClient getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosServerClientReference#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ServiceClient value);

} // RosServerClientReference
