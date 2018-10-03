/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.Namespace;
import ros.Publisher;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remap Pub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RemapPub#getTopicRef <em>Topic Ref</em>}</li>
 *   <li>{@link componentInterface.RemapPub#getRemapName <em>Remap Name</em>}</li>
 *   <li>{@link componentInterface.RemapPub#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRemapPub()
 * @model
 * @generated
 */
public interface RemapPub extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Ref</em>' reference.
	 * @see #setTopicRef(Publisher)
	 * @see componentInterface.ComponentInterfacePackage#getRemapPub_TopicRef()
	 * @model
	 * @generated
	 */
	Publisher getTopicRef();

	/**
	 * Sets the value of the '{@link componentInterface.RemapPub#getTopicRef <em>Topic Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Ref</em>' reference.
	 * @see #getTopicRef()
	 * @generated
	 */
	void setTopicRef(Publisher value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRemapPub_RemapName()
	 * @model
	 * @generated
	 */
	String getRemapName();

	/**
	 * Sets the value of the '{@link componentInterface.RemapPub#getRemapName <em>Remap Name</em>}' attribute.
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
	 * @see componentInterface.ComponentInterfacePackage#getRemapPub_NameSpace()
	 * @model
	 * @generated
	 */
	Namespace getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.RemapPub#getNameSpace <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Namespace value);

} // RemapPub
