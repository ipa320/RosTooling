/**
 */
package rossystem;

import componentInterface.RemapPub;
import componentInterface.RemapSub;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.TopicConnection#getFrom <em>From</em>}</li>
 *   <li>{@link rossystem.TopicConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getTopicConnection()
 * @model
 * @generated
 */
public interface TopicConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(RemapPub)
	 * @see rossystem.RossystemPackage#getTopicConnection_From()
	 * @model
	 * @generated
	 */
	RemapPub getFrom();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(RemapPub value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RemapSub)
	 * @see rossystem.RossystemPackage#getTopicConnection_To()
	 * @model
	 * @generated
	 */
	RemapSub getTo();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RemapSub value);

} // TopicConnection
