/**
 */
package rossystem;

import ros.Publisher;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Publisher Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosPublisherReference#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosPublisherReference()
 * @model
 * @generated
 */
public interface RosPublisherReference extends InterfaceReference {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Publisher)
     * @see rossystem.RossystemPackage#getRosPublisherReference_From()
     * @model required="true"
     * @generated
     */
    Publisher getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosPublisherReference#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Publisher value);

} // RosPublisherReference
