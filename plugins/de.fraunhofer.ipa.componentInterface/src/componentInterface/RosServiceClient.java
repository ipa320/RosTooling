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
 *   <li>{@link componentInterface.RosServiceClient#getSrvclient <em>Srvclient</em>}</li>
 *   <li>{@link componentInterface.RosServiceClient#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.RosServiceClient#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient()
 * @model
 * @generated
 */
public interface RosServiceClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Srvclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srvclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srvclient</em>' reference.
	 * @see #setSrvclient(ServiceClient)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient_Srvclient()
	 * @model
	 * @generated
	 */
	ServiceClient getSrvclient();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceClient#getSrvclient <em>Srvclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srvclient</em>' reference.
	 * @see #getSrvclient()
	 * @generated
	 */
	void setSrvclient(ServiceClient value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceClient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(String)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceClient_Ns()
	 * @model dataType="componentInterface.NS"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceClient#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

} // RosServiceClient
