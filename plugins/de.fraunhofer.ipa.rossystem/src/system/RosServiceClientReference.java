/**
 */
package system;

import ros.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Client Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosServiceClientReference#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosServiceClientReference()
 * @model
 * @generated
 */
public interface RosServiceClientReference extends InterfaceReference {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ServiceClient)
     * @see system.RossystemPackage#getRosServiceClientReference_From()
     * @model required="true"
     * @generated
     */
    ServiceClient getFrom();

    /**
     * Sets the value of the '{@link system.RosServiceClientReference#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ServiceClient value);

} // RosServiceClientReference
