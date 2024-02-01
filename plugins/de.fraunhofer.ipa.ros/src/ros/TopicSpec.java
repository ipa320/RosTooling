/**
 */
package ros;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.TopicSpec#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getTopicSpec()
 * @model
 * @generated
 */
public interface TopicSpec extends SpecBase {
    /**
     * Returns the value of the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' containment reference.
     * @see #setMessage(MessageDefinition)
     * @see ros.RosPackage#getTopicSpec_Message()
     * @model containment="true"
     * @generated
     */
    MessageDefinition getMessage();

    /**
     * Sets the value of the '{@link ros.TopicSpec#getMessage <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' containment reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(MessageDefinition value);

} // TopicSpec
