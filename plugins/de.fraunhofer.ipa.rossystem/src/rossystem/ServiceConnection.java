/**
 */
package rossystem;

import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link rossystem.ServiceConnection#getServiceName <em>Service Name</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getServiceConnection()
 * @model
 * @generated
 */
public interface ServiceConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link componentInterface.RosServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see rossystem.RossystemPackage#getServiceConnection_From()
	 * @model required="true"
	 * @generated
	 */
	EList<RosServiceServer> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RosServiceClient)
	 * @see rossystem.RossystemPackage#getServiceConnection_To()
	 * @model required="true"
	 * @generated
	 */
	RosServiceClient getTo();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RosServiceClient value);

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
	 * @see rossystem.RossystemPackage#getServiceConnection_ServiceName()
	 * @model required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link rossystem.ServiceConnection#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // ServiceConnection
