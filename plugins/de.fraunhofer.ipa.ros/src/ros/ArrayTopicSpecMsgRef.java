/**
 */
package ros;

import primitives.AbstractType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Topic Spec Msg Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ArrayTopicSpecMsgRef#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getArrayTopicSpecMsgRef()
 * @model
 * @generated
 */
public interface ArrayTopicSpecMsgRef extends AbstractType {
    /**
     * Returns the value of the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' reference.
     * @see #setReference(SpecBase)
     * @see ros.RosPackage#getArrayTopicSpecMsgRef_Reference()
     * @model required="true"
     * @generated
     */
    SpecBase getReference();

    /**
     * Sets the value of the '{@link ros.ArrayTopicSpecMsgRef#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(SpecBase value);

} // ArrayTopicSpecMsgRef
