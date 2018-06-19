/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ServiceClient#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getServiceClient()
 * @model
 * @generated
 */
public interface ServiceClient extends NamespacedElement {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(ServiceDefinition)
	 * @see ros.RosPackage#getServiceClient_Service()
	 * @model required="true"
	 * @generated
	 */
	ServiceDefinition getService();

	/**
	 * Sets the value of the '{@link ros.ServiceClient#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceDefinition value);

} // ServiceClient
