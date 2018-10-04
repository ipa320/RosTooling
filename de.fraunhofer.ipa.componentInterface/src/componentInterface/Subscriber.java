/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;

import ros.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.Subscriber#getTopicRef <em>Topic Ref</em>}</li>
 *   <li>{@link componentInterface.Subscriber#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link componentInterface.Subscriber#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getSubscriber()
 * @model
 * @generated
 */
public interface Subscriber extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Ref</em>' reference.
	 * @see #setTopicRef(ros.Subscriber)
	 * @see componentInterface.ComponentInterfacePackage#getSubscriber_TopicRef()
	 * @model
	 * @generated
	 */
	ros.Subscriber getTopicRef();

	/**
	 * Sets the value of the '{@link componentInterface.Subscriber#getTopicRef <em>Topic Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Ref</em>' reference.
	 * @see #getTopicRef()
	 * @generated
	 */
	void setTopicRef(ros.Subscriber value);

	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see componentInterface.ComponentInterfacePackage#getSubscriber_TopicName()
	 * @model
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link componentInterface.Subscriber#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

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
	 * @see componentInterface.ComponentInterfacePackage#getSubscriber_NameSpace()
	 * @model
	 * @generated
	 */
	Namespace getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.Subscriber#getNameSpace <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Namespace value);

} // Subscriber
