/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import ros.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosNode#getName <em>Name</em>}</li>
 *   <li>{@link system.RosNode#getFrom <em>From</em>}</li>
 *   <li>{@link system.RosNode#getRosinterfaces <em>Rosinterfaces</em>}</li>
 *   <li>{@link system.RosNode#getRosparameters <em>Rosparameters</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosNode()
 * @model
 * @generated
 */
public interface RosNode extends Component {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see system.RossystemPackage#getRosNode_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link system.RosNode#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Node)
     * @see system.RossystemPackage#getRosNode_From()
     * @model required="true"
     * @generated
     */
    Node getFrom();

    /**
     * Sets the value of the '{@link system.RosNode#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Node value);

    /**
     * Returns the value of the '<em><b>Rosinterfaces</b></em>' containment reference list.
     * The list contents are of type {@link system.RosInterface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosinterfaces</em>' containment reference list.
     * @see system.RossystemPackage#getRosNode_Rosinterfaces()
     * @model containment="true"
     * @generated
     */
    EList<RosInterface> getRosinterfaces();

    /**
     * Returns the value of the '<em><b>Rosparameters</b></em>' containment reference list.
     * The list contents are of type {@link system.RosParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosparameters</em>' containment reference list.
     * @see system.RossystemPackage#getRosNode_Rosparameters()
     * @model containment="true"
     * @generated
     */
    EList<RosParameter> getRosparameters();

} // RosNode
