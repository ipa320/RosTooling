/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.ServiceClient#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.ServiceClient#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link componentInterface.ServiceClient#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getServiceClient()
 * @model
 * @generated
 */
public interface ServiceClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Ref</em>' reference.
	 * @see #setSrvRef(ros.ServiceClient)
	 * @see componentInterface.ComponentInterfacePackage#getServiceClient_SrvRef()
	 * @model
	 * @generated
	 */
	ros.ServiceClient getSrvRef();

	/**
	 * Sets the value of the '{@link componentInterface.ServiceClient#getSrvRef <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Ref</em>' reference.
	 * @see #getSrvRef()
	 * @generated
	 */
	void setSrvRef(ros.ServiceClient value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see componentInterface.ComponentInterfacePackage#getServiceClient_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link componentInterface.ServiceClient#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' reference.
	 * @see #setNameSpace(Namespace)
	 * @see componentInterface.ComponentInterfacePackage#getServiceClient_NameSpace()
	 * @model
	 * @generated
	 */
	Namespace getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.ServiceClient#getNameSpace <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Namespace value);

} // ServiceClient
