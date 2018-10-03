/**
 */
package rossystem;

import componentInterface.RemapSrvCli;
import componentInterface.RemapSrvServ;
import org.eclipse.emf.ecore.EObject;

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
	 * @see #setFrom(RemapSrvServ)
	 * @see rossystem.RossystemPackage#getServiceConnection_From()
	 * @model
	 * @generated
	 */
	RemapSrvServ getFrom();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(RemapSrvServ value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RemapSrvCli)
	 * @see rossystem.RossystemPackage#getServiceConnection_To()
	 * @model
	 * @generated
	 */
	RemapSrvCli getTo();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RemapSrvCli value);

} // ServiceConnection
