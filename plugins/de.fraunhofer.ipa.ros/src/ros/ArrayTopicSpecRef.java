/**
 */
package ros;

import primitives.AbstractType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Topic Spec Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ArrayTopicSpecRef#getTopicSpec <em>Topic Spec</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getArrayTopicSpecRef()
 * @model
 * @generated
 */
public interface ArrayTopicSpecRef extends AbstractType {
	/**
	 * Returns the value of the '<em><b>Topic Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Spec</em>' reference.
	 * @see #setTopicSpec(TopicSpec)
	 * @see ros.RosPackage#getArrayTopicSpecRef_TopicSpec()
	 * @model required="true"
	 * @generated
	 */
	TopicSpec getTopicSpec();

	/**
	 * Sets the value of the '{@link ros.ArrayTopicSpecRef#getTopicSpec <em>Topic Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Spec</em>' reference.
	 * @see #getTopicSpec()
	 * @generated
	 */
	void setTopicSpec(TopicSpec value);

} // ArrayTopicSpecRef
