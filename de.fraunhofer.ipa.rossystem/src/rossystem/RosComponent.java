/**
 */
package rossystem;

import ros.NamespacedElement;
import ros.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosComponent#getRosNode <em>Ros Node</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosComponent()
 * @model
 * @generated
 */
public interface RosComponent extends NamespacedElement {

	/**
	 * Returns the value of the '<em><b>Ros Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Node</em>' containment reference.
	 * @see #setRosNode(Node)
	 * @see rossystem.RossystemPackage#getRosComponent_RosNode()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	Node getRosNode();

	/**
	 * Sets the value of the '{@link rossystem.RosComponent#getRosNode <em>Ros Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ros Node</em>' containment reference.
	 * @see #getRosNode()
	 * @generated
	 */
	void setRosNode(Node value);

} // RosComponent
