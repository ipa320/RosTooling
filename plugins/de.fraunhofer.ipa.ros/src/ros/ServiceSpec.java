/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ServiceSpec#getRequest <em>Request</em>}</li>
 *   <li>{@link ros.ServiceSpec#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getServiceSpec()
 * @model
 * @generated
 */
public interface ServiceSpec extends SpecBase {
    /**
     * Returns the value of the '<em><b>Request</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request</em>' containment reference.
     * @see #setRequest(MessageDefinition)
     * @see ros.RosPackage#getServiceSpec_Request()
     * @model containment="true"
     * @generated
     */
    MessageDefinition getRequest();

    /**
     * Sets the value of the '{@link ros.ServiceSpec#getRequest <em>Request</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request</em>' containment reference.
     * @see #getRequest()
     * @generated
     */
    void setRequest(MessageDefinition value);

    /**
     * Returns the value of the '<em><b>Response</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Response</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Response</em>' containment reference.
     * @see #setResponse(MessageDefinition)
     * @see ros.RosPackage#getServiceSpec_Response()
     * @model containment="true"
     * @generated
     */
    MessageDefinition getResponse();

    /**
     * Sets the value of the '{@link ros.ServiceSpec#getResponse <em>Response</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Response</em>' containment reference.
     * @see #getResponse()
     * @generated
     */
    void setResponse(MessageDefinition value);

} // ServiceSpec
