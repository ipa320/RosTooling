/**
 */
package rossystem;

import org.eclipse.emf.ecore.EObject;

import ros.ServiceClient;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.ServiceConnection#getFrom <em>From</em>}</li>
 *   <li>{@link rossystem.ServiceConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getServiceConnection()
 * @model
 * @generated
 */
public interface ServiceConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ServiceServer)
	 * @see rossystem.RossystemPackage#getServiceConnection_From()
	 * @model
	 * @generated
	 */
	ServiceServer getFrom();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ServiceServer value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ServiceClient)
	 * @see rossystem.RossystemPackage#getServiceConnection_To()
	 * @model
	 * @generated
	 */
	ServiceClient getTo();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ServiceClient value);

} // ServiceConnection
