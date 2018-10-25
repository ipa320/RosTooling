/**
 */
package rossystem;

import componentInterface.RosPublisher;
import componentInterface.RosSubscriber;
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
 *   <li>{@link rossystem.TopicConnection#getFromTopic <em>From Topic</em>}</li>
 *   <li>{@link rossystem.TopicConnection#getToTopic <em>To Topic</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getTopicConnection()
 * @model
 * @generated
 */
public interface TopicConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Topic</em>' reference.
	 * @see #setFromTopic(RosPublisher)
	 * @see rossystem.RossystemPackage#getTopicConnection_FromTopic()
	 * @model required="true"
	 * @generated
	 */
	RosPublisher getFromTopic();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getFromTopic <em>From Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Topic</em>' reference.
	 * @see #getFromTopic()
	 * @generated
	 */
	void setFromTopic(RosPublisher value);

	/**
	 * Returns the value of the '<em><b>To Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Topic</em>' reference.
	 * @see #setToTopic(RosSubscriber)
	 * @see rossystem.RossystemPackage#getTopicConnection_ToTopic()
	 * @model required="true"
	 * @generated
	 */
	RosSubscriber getToTopic();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getToTopic <em>To Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Topic</em>' reference.
	 * @see #getToTopic()
	 * @generated
	 */
	void setToTopic(RosSubscriber value);

} // TopicConnection
