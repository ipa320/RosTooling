/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.Subscriber#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getSubscriber()
 * @model
 * @generated
 */
public interface Subscriber extends InterfaceType {
    /**
     * Returns the value of the '<em><b>Message</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' reference.
     * @see #setMessage(TopicSpec)
     * @see ros.RosPackage#getSubscriber_Message()
     * @model required="true"
     * @generated
     */
    TopicSpec getMessage();

    /**
     * Sets the value of the '{@link ros.Subscriber#getMessage <em>Message</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(TopicSpec value);

} // Subscriber
