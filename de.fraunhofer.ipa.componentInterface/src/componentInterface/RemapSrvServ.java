/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.Namespace;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remap Srv Serv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RemapSrvServ#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.RemapSrvServ#getRemapName <em>Remap Name</em>}</li>
 *   <li>{@link componentInterface.RemapSrvServ#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRemapSrvServ()
 * @model
 * @generated
 */
public interface RemapSrvServ extends EObject {
	/**
	 * Returns the value of the '<em><b>Srv Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Ref</em>' reference.
	 * @see #setSrvRef(ServiceServer)
	 * @see componentInterface.ComponentInterfacePackage#getRemapSrvServ_SrvRef()
	 * @model
	 * @generated
	 */
	ServiceServer getSrvRef();

	/**
	 * Sets the value of the '{@link componentInterface.RemapSrvServ#getSrvRef <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Ref</em>' reference.
	 * @see #getSrvRef()
	 * @generated
	 */
	void setSrvRef(ServiceServer value);

	/**
	 * Returns the value of the '<em><b>Remap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remap Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap Name</em>' attribute.
	 * @see #setRemapName(String)
	 * @see componentInterface.ComponentInterfacePackage#getRemapSrvServ_RemapName()
	 * @model
	 * @generated
	 */
	String getRemapName();

	/**
	 * Sets the value of the '{@link componentInterface.RemapSrvServ#getRemapName <em>Remap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap Name</em>' attribute.
	 * @see #getRemapName()
	 * @generated
	 */
	void setRemapName(String value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRemapSrvServ_NameSpace()
	 * @model
	 * @generated
	 */
	Namespace getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.RemapSrvServ#getNameSpace <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Namespace value);

} // RemapSrvServ
