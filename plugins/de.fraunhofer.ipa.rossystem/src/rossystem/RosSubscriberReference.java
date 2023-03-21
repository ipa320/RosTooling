/**
 */
package rossystem;

import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Subscriber Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosSubscriberReference#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosSubscriberReference()
 * @model
 * @generated
 */
public interface RosSubscriberReference extends InterfaceReference {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Subscriber)
     * @see rossystem.RossystemPackage#getRosSubscriberReference_From()
     * @model required="true"
     * @generated
     */
    Subscriber getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosSubscriberReference#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Subscriber value);

} // RosSubscriberReference
