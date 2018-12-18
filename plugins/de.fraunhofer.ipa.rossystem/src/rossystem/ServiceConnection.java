/**
 */
package rossystem;

import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
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
 *   <li>{@link rossystem.ServiceConnection#getFromSrv <em>From Srv</em>}</li>
 *   <li>{@link rossystem.ServiceConnection#getToSrv <em>To Srv</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getServiceConnection()
 * @model
 * @generated
 */
public interface ServiceConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From Srv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Srv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Srv</em>' reference.
	 * @see #setFromSrv(RosServiceServer)
	 * @see rossystem.RossystemPackage#getServiceConnection_FromSrv()
	 * @model required="true"
	 * @generated
	 */
	RosServiceServer getFromSrv();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getFromSrv <em>From Srv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Srv</em>' reference.
	 * @see #getFromSrv()
	 * @generated
	 */
	void setFromSrv(RosServiceServer value);

	/**
	 * Returns the value of the '<em><b>To Srv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Srv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Srv</em>' reference.
	 * @see #setToSrv(RosServiceClient)
	 * @see rossystem.RossystemPackage#getServiceConnection_ToSrv()
	 * @model required="true"
	 * @generated
	 */
	RosServiceClient getToSrv();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getToSrv <em>To Srv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Srv</em>' reference.
	 * @see #getToSrv()
	 * @generated
	 */
	void setToSrv(RosServiceClient value);

} // ServiceConnection
