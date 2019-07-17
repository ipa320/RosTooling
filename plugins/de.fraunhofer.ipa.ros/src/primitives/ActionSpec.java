/**
 */
package primitives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link primitives.ActionSpec#getGoal <em>Goal</em>}</li>
 *   <li>{@link primitives.ActionSpec#getResult <em>Result</em>}</li>
 *   <li>{@link primitives.ActionSpec#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see primitives.PrimitivesPackage#getActionSpec()
 * @model
 * @generated
 */
public interface ActionSpec extends SpecBase {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(MessageDefinition)
	 * @see primitives.PrimitivesPackage#getActionSpec_Goal()
	 * @model containment="true"
	 * @generated
	 */
	MessageDefinition getGoal();

	/**
	 * Sets the value of the '{@link primitives.ActionSpec#getGoal <em>Goal</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(MessageDefinition)
	 * @see primitives.PrimitivesPackage#getActionSpec_Result()
	 * @model containment="true"
	 * @generated
	 */
	MessageDefinition getResult();

	/**
	 * Sets the value of the '{@link primitives.ActionSpec#getResult <em>Result</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference.
	 * @see #setFeedback(MessageDefinition)
	 * @see primitives.PrimitivesPackage#getActionSpec_Feedback()
	 * @model containment="true"
	 * @generated
	 */
	MessageDefinition getFeedback();

	/**
	 * Sets the value of the '{@link primitives.ActionSpec#getFeedback <em>Feedback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' containment reference.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(MessageDefinition value);

} // ActionSpec
