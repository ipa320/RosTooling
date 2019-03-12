/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.ActionClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RosActionClient#getActclient <em>Actclient</em>}</li>
 *   <li>{@link componentInterface.RosActionClient#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.RosActionClient#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosActionClient()
 * @model
 * @generated
 */
public interface RosActionClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Actclient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actclient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actclient</em>' reference.
	 * @see #setActclient(ActionClient)
	 * @see componentInterface.ComponentInterfacePackage#getRosActionClient_Actclient()
	 * @model
	 * @generated
	 */
	ActionClient getActclient();

	/**
	 * Sets the value of the '{@link componentInterface.RosActionClient#getActclient <em>Actclient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actclient</em>' reference.
	 * @see #getActclient()
	 * @generated
	 */
	void setActclient(ActionClient value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRosActionClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentInterface.RosActionClient#getName <em>Name</em>}' attribute.
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
	 * @see componentInterface.ComponentInterfacePackage#getRosActionClient_Ns()
	 * @model dataType="componentInterface.NS"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link componentInterface.RosActionClient#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

} // RosActionClient
