/**
 */
package primitives;

import ros.TopicSpec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Spec Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link primitives.TopicSpecRef#getTopicSpec <em>Topic Spec</em>}</li>
 * </ul>
 *
 * @see primitives.PrimitivesPackage#getTopicSpecRef()
 * @model
 * @generated
 */
public interface TopicSpecRef extends AbstractType {
    /**
     * Returns the value of the '<em><b>Topic Spec</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topic Spec</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topic Spec</em>' reference.
     * @see #setTopicSpec(TopicSpec)
     * @see primitives.PrimitivesPackage#getTopicSpecRef_TopicSpec()
     * @model required="true"
     * @generated
     */
    TopicSpec getTopicSpec();

    /**
     * Sets the value of the '{@link primitives.TopicSpecRef#getTopicSpec <em>Topic Spec</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topic Spec</em>' reference.
     * @see #getTopicSpec()
     * @generated
     */
    void setTopicSpec(TopicSpec value);

} // TopicSpecRef
