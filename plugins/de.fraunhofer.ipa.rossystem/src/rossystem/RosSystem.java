/**
 */
package rossystem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import ros.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosSystem#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.RosSystem#getProcess <em>Process</em>}</li>
 *   <li>{@link rossystem.RosSystem#getRosnode <em>Rosnode</em>}</li>
 *   <li>{@link rossystem.RosSystem#getConnections <em>Connections</em>}</li>
 *   <li>{@link rossystem.RosSystem#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosSystem()
 * @model
 * @generated
 */
public interface RosSystem extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see rossystem.RossystemPackage#getRosSystem_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rossystem.RosSystem#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link ros.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosSystem_Parameter()
     * @model containment="true" derived="true"
     * @generated
     */
    EList<Parameter> getParameter();

    /**
     * Returns the value of the '<em><b>Rosnode</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosnode</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosSystem_Rosnode()
     * @model containment="true"
     * @generated
     */
    EList<RosNode> getRosnode();

    /**
     * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connections</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosSystem_Connections()
     * @model containment="true"
     * @generated
     */
    EList<RosConnection> getConnections();

    /**
     * Returns the value of the '<em><b>Process</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.Process}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosSystem_Process()
     * @model containment="true"
     * @generated
     */
    EList<rossystem.Process> getProcess();


} // RosSystem
