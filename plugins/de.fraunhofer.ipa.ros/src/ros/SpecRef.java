/**
 */
package ros;

import primitives.AbstractType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.SpecRef#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getSpecRef()
 * @model
 * @generated
 */
public interface SpecRef extends AbstractType {
    /**
     * Returns the value of the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' reference.
     * @see #setReference(SpecBase)
     * @see ros.RosPackage#getSpecRef_Reference()
     * @model required="true"
     * @generated
     */
    SpecBase getReference();

    /**
     * Sets the value of the '{@link ros.SpecRef#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(SpecBase value);

} // SpecRef
