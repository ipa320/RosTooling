/**
 */
package rossystem;

import componentInterface.RosPublisher;
import componentInterface.RosSubscriber;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link rossystem.TopicConnection#getTopicName <em>Topic Name</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getTopicConnection()
 * @model
 * @generated
 */
public interface TopicConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link componentInterface.RosPublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see rossystem.RossystemPackage#getTopicConnection_From()
	 * @model required="true"
	 * @generated
	 */
	EList<RosPublisher> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link componentInterface.RosSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see rossystem.RossystemPackage#getTopicConnection_To()
	 * @model required="true"
	 * @generated
	 */
	EList<RosSubscriber> getTo();

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
	 * @see rossystem.RossystemPackage#getTopicConnection_TopicName()
	 * @model required="true"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link rossystem.TopicConnection#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

} // TopicConnection
