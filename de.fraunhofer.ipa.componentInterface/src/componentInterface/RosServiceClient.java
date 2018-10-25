/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link componentInterface.RosServiceClient#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.RosServiceClient#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link componentInterface.RosServiceClient#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient()
 * @model
 * @generated
 */
public interface RosServiceClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Ref</em>' reference.
	 * @see #setSrvRef(ServiceClient)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient_SrvRef()
	 * @model
	 * @generated
	 */
	ServiceClient getSrvRef();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceClient#getSrvRef <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Ref</em>' reference.
	 * @see #getSrvRef()
	 * @generated
	 */
	void setSrvRef(ServiceClient value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceClient#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient_NameSpace()
	 * @model dataType="componentInterface.NS"
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceClient#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

} // RosServiceClient
