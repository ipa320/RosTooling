/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.ActionServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Action Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RosActionServer#getActserver <em>Actserver</em>}</li>
 *   <li>{@link componentInterface.RosActionServer#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.RosActionServer#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosActionServer()
 * @model
 * @generated
 */
public interface RosActionServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Actserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actserver</em>' reference.
	 * @see #setActserver(ActionServer)
	 * @see componentInterface.ComponentInterfacePackage#getRosActionServer_Actserver()
	 * @model
	 * @generated
	 */
	ActionServer getActserver();

	/**
	 * Sets the value of the '{@link componentInterface.RosActionServer#getActserver <em>Actserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actserver</em>' reference.
	 * @see #getActserver()
	 * @generated
	 */
	void setActserver(ActionServer value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRosActionServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentInterface.RosActionServer#getName <em>Name</em>}' attribute.
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
	 * @see componentInterface.ComponentInterfacePackage#getRosActionServer_Ns()
	 * @model dataType="componentInterface.NS"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link componentInterface.RosActionServer#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

} // RosActionServer
