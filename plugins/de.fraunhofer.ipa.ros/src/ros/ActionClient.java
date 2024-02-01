/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ActionClient#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getActionClient()
 * @model
 * @generated
 */
public interface ActionClient extends InterfaceType {
    /**
     * Returns the value of the '<em><b>Action</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' reference.
     * @see #setAction(ActionSpec)
     * @see ros.RosPackage#getActionClient_Action()
     * @model required="true"
     * @generated
     */
    ActionSpec getAction();

    /**
     * Sets the value of the '{@link ros.ActionClient#getAction <em>Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' reference.
     * @see #getAction()
     * @generated
     */
    void setAction(ActionSpec value);

} // ActionClient
