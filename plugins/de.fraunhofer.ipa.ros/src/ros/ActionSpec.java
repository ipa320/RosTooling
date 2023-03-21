/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ActionSpec#getGoal <em>Goal</em>}</li>
 *   <li>{@link ros.ActionSpec#getResult <em>Result</em>}</li>
 *   <li>{@link ros.ActionSpec#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getActionSpec()
 * @model
 * @generated
 */
public interface ActionSpec extends SpecBase {
    /**
     * Returns the value of the '<em><b>Goal</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Goal</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goal</em>' containment reference.
     * @see #setGoal(MessageDefinition)
     * @see ros.RosPackage#getActionSpec_Goal()
     * @model containment="true"
     * @generated
     */
    MessageDefinition getGoal();

    /**
     * Sets the value of the '{@link ros.ActionSpec#getGoal <em>Goal</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goal</em>' containment reference.
     * @see #getGoal()
     * @generated
     */
    void setGoal(MessageDefinition value);

    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' containment reference.
     * @see #setResult(MessageDefinition)
     * @see ros.RosPackage#getActionSpec_Result()
     * @model containment="true"
     * @generated
     */
    MessageDefinition getResult();

    /**
     * Sets the value of the '{@link ros.ActionSpec#getResult <em>Result</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' containment reference.
     * @see #getResult()
     * @generated
     */
    void setResult(MessageDefinition value);

    /**
     * Returns the value of the '<em><b>Feedback</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feedback</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feedback</em>' containment reference.
     * @see #setFeedback(MessageDefinition)
     * @see ros.RosPackage#getActionSpec_Feedback()
     * @model containment="true"
     * @generated
     */
    MessageDefinition getFeedback();

    /**
     * Sets the value of the '{@link ros.ActionSpec#getFeedback <em>Feedback</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feedback</em>' containment reference.
     * @see #getFeedback()
     * @generated
     */
    void setFeedback(MessageDefinition value);

} // ActionSpec
