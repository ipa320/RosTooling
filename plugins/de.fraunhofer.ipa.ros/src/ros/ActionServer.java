/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ActionServer#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getActionServer()
 * @model
 * @generated
 */
public interface ActionServer extends InterfaceType {
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
     * @see ros.RosPackage#getActionServer_Action()
     * @model required="true"
     * @generated
     */
    ActionSpec getAction();

    /**
     * Sets the value of the '{@link ros.ActionServer#getAction <em>Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' reference.
     * @see #getAction()
     * @generated
     */
    void setAction(ActionSpec value);

} // ActionServer
