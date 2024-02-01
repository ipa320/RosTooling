/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.Publisher#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends InterfaceType {
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
     * @see ros.RosPackage#getPublisher_Message()
     * @model required="true"
     * @generated
     */
    TopicSpec getMessage();

    /**
     * Sets the value of the '{@link ros.Publisher#getMessage <em>Message</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(TopicSpec value);

} // Publisher
