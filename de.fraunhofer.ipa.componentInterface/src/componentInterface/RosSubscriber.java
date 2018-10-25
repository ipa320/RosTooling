/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EObject;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.RosSubscriber#getTopicRef <em>Topic Ref</em>}</li>
 *   <li>{@link componentInterface.RosSubscriber#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link componentInterface.RosSubscriber#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getRosSubscriber()
 * @model
 * @generated
 */
public interface RosSubscriber extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Ref</em>' reference.
	 * @see #setTopicRef(Subscriber)
	 * @see componentInterface.ComponentInterfacePackage#getRosSubscriber_TopicRef()
	 * @model
	 * @generated
	 */
	Subscriber getTopicRef();

	/**
	 * Sets the value of the '{@link componentInterface.RosSubscriber#getTopicRef <em>Topic Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Ref</em>' reference.
	 * @see #getTopicRef()
	 * @generated
	 */
	void setTopicRef(Subscriber value);

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
	 * @see componentInterface.ComponentInterfacePackage#getRosSubscriber_TopicName()
	 * @model
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link componentInterface.RosSubscriber#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see componentInterface.ComponentInterfacePackage#getRosSubscriber_NameSpace()
	 * @model dataType="componentInterface.NS"
	 * @generated
	 */
	String getNameSpace();

	/**
	 * Sets the value of the '{@link componentInterface.RosSubscriber#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

} // RosSubscriber
