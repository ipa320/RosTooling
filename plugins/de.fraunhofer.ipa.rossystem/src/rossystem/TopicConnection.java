/**
 */
package rossystem;

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
public interface TopicConnection extends NamedInterface {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(RosPublisher)
     * @see rossystem.RossystemPackage#getTopicConnection_From()
     * @model required="true"
     * @generated
     */
    RosPublisher getFrom();

    /**
     * Sets the value of the '{@link rossystem.TopicConnection#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(RosPublisher value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(RosSubscriber)
     * @see rossystem.RossystemPackage#getTopicConnection_To()
     * @model required="true"
     * @generated
     */
    RosSubscriber getTo();

    /**
     * Sets the value of the '{@link rossystem.TopicConnection#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(RosSubscriber value);

} // TopicConnection
