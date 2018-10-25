/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.NameSpace#getNS <em>NS</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getNameSpace()
 * @model
 * @generated
 */
public interface NameSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NS</em>' attribute.
	 * @see #setNS(String)
	 * @see componentInterface.ComponentInterfacePackage#getNameSpace_NS()
	 * @model
	 * @generated
	 */
	String getNS();

	/**
	 * Sets the value of the '{@link componentInterface.NameSpace#getNS <em>NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NS</em>' attribute.
	 * @see #getNS()
	 * @generated
	 */
	void setNS(String value);

} // NameSpace
