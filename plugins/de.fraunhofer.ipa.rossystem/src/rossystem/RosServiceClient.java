/**
 */
package rossystem;

import ros.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosServiceClient#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosServiceClient()
 * @model
 * @generated
 */
public interface RosServiceClient extends NamedInterface {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(ServiceClient)
     * @see rossystem.RossystemPackage#getRosServiceClient_From()
     * @model required="true"
     * @generated
     */
    ServiceClient getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosServiceClient#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(ServiceClient value);

} // RosServiceClient
