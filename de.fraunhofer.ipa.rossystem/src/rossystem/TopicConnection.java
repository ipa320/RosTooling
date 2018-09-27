/**
 */
package rossystem;

import org.eclipse.emf.ecore.EObject;

import ros.Publisher;
import ros.Subscriber;

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
 *   <li>{@link rossystem.TopicConnection#getTopicRemap <em>Topic Remap</em>}</li>
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
	 * @see #setFrom(Publisher)
	 * @see rossystem.RossystemPackage#getTopicConnection_From()
	 * @model
	 * @generated
	 */
	Publisher getFrom();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Publisher value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Subscriber)
	 * @see rossystem.RossystemPackage#getTopicConnection_To()
	 * @model
	 * @generated
	 */
	Subscriber getTo();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Subscriber value);

	/**
	 * Returns the value of the '<em><b>Topic Remap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Remap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Remap</em>' attribute.
	 * @see #setTopicRemap(String)
	 * @see rossystem.RossystemPackage#getTopicConnection_TopicRemap()
	 * @model
	 * @generated
	 */
	String getTopicRemap();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getTopicRemap <em>Topic Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Remap</em>' attribute.
	 * @see #getTopicRemap()
	 * @generated
	 */
	void setTopicRemap(String value);

} // TopicConnection
