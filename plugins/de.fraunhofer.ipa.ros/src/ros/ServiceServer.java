/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ServiceServer#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getServiceServer()
 * @model
 * @generated
 */
public interface ServiceServer extends InterfaceType {
    /**
     * Returns the value of the '<em><b>Service</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service</em>' reference.
     * @see #setService(ServiceSpec)
     * @see ros.RosPackage#getServiceServer_Service()
     * @model required="true"
     * @generated
     */
    ServiceSpec getService();

    /**
     * Sets the value of the '{@link ros.ServiceServer#getService <em>Service</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service</em>' reference.
     * @see #getService()
     * @generated
     */
    void setService(ServiceSpec value);

} // ServiceServer
