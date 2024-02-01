/**
 */
package system;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.SubSystem#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getSubSystem()
 * @model
 * @generated
 */
public interface SubSystem extends Component {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(system.System)
	 * @see system.RossystemPackage#getSubSystem_System()
	 * @model
	 * @generated
	 */
	system.System getSystem();

	/**
	 * Sets the value of the '{@link system.SubSystem#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(system.System value);

} // SubSystem
