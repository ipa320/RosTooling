/**
 */
package rossystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link rossystem.RosNode#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.RosNode#getFrom <em>From</em>}</li>
 *   <li>{@link rossystem.RosNode#getRosinterfaces <em>Rosinterfaces</em>}</li>
 *   <li>{@link rossystem.RosNode#getRosparameters <em>Rosparameters</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosNode()
 * @model
 * @generated
 */
public interface RosNode extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see rossystem.RossystemPackage#getRosNode_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rossystem.RosNode#getName <em>Name</em>}' attribute.
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
     * @see rossystem.RossystemPackage#getRosNode_From()
     * @model required="true"
     * @generated
     */
    Node getFrom();

    /**
     * Sets the value of the '{@link rossystem.RosNode#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Node value);

    /**
     * Returns the value of the '<em><b>Rosinterfaces</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosInterface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosinterfaces</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosNode_Rosinterfaces()
     * @model containment="true"
     * @generated
     */
    EList<RosInterface> getRosinterfaces();

    /**
     * Returns the value of the '<em><b>Rosparameters</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosparameters</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosNode_Rosparameters()
     * @model containment="true"
     * @generated
     */
    EList<RosParameter> getRosparameters();

} // RosNode
