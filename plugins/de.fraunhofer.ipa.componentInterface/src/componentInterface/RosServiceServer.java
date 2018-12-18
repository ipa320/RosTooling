/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Service Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RosServiceServer#getSrvserver <em>Srvserver</em>}</li>
 *   <li>{@link componentInterface.RosServiceServer#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.RosServiceServer#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer()
 * @model
 * @generated
 */
public interface RosServiceServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Srvserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srvserver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srvserver</em>' reference.
	 * @see #setSrvserver(ServiceServer)
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer_Srvserver()
	 * @model
	 * @generated
	 */
	ServiceServer getSrvserver();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceServer#getSrvserver <em>Srvserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srvserver</em>' reference.
	 * @see #getSrvserver()
	 * @generated
	 */
	void setSrvserver(ServiceServer value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceServer#getName <em>Name</em>}' attribute.
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
	 * @see componentInterface.ComponentInterfacePackage#getRosServiceServer_Ns()
	 * @model dataType="componentInterface.NS"
	 * @generated
	 */
	String getNs();

	/**
	 * Sets the value of the '{@link componentInterface.RosServiceServer#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(String value);

} // RosServiceServer
