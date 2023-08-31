/**
 */
package system;

import ros.Publisher;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosTopicConnection#getFrom <em>From</em>}</li>
 *   <li>{@link system.RosTopicConnection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosTopicConnection()
 * @model
 * @generated
 */
public interface RosTopicConnection extends RosConnection {
    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Publisher)
     * @see system.RossystemPackage#getRosTopicConnection_From()
     * @model required="true"
     * @generated
     */
    Publisher getFrom();

    /**
     * Sets the value of the '{@link system.RosTopicConnection#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Publisher value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(Subscriber)
     * @see system.RossystemPackage#getRosTopicConnection_To()
     * @model required="true"
     * @generated
     */
    Subscriber getTo();

    /**
     * Sets the value of the '{@link system.RosTopicConnection#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(Subscriber value);

} // RosTopicConnection
