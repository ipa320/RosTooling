/**
 */
package rossystem;

import ros.Publisher;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosPublisher#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosPublisher()
 * @model
 * @generated
 */
public interface RosPublisher extends NamedInterface {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Publisher)
     * @see rossystem.RossystemPackage#getRosPublisher_From()
     * @model required="true"
     * @generated
     */
    Publisher getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosPublisher#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Publisher value);

} // RosPublisher
