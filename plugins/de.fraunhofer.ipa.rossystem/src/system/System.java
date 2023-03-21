/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ros.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.System#getName <em>Name</em>}</li>
 *   <li>{@link system.System#getProcesses <em>Processes</em>}</li>
 *   <li>{@link system.System#getComponents <em>Components</em>}</li>
 *   <li>{@link system.System#getConnections <em>Connections</em>}</li>
 *   <li>{@link system.System#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see system.RossystemPackage#getSystem_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link system.System#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
     * The list contents are of type {@link system.Process}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Processes</em>' containment reference list.
     * @see system.RossystemPackage#getSystem_Processes()
     * @model containment="true"
     * @generated
     */
    EList<system.Process> getProcesses();

    /**
     * Returns the value of the '<em><b>Components</b></em>' containment reference list.
     * The list contents are of type {@link system.Component}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Components</em>' containment reference list.
     * @see system.RossystemPackage#getSystem_Components()
     * @model containment="true"
     * @generated
     */
    EList<Component> getComponents();

    /**
     * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
     * The list contents are of type {@link system.Connection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connections</em>' containment reference list.
     * @see system.RossystemPackage#getSystem_Connections()
     * @model containment="true"
     * @generated
     */
    EList<Connection> getConnections();

    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link ros.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see system.RossystemPackage#getSystem_Parameter()
     * @model containment="true" derived="true"
     * @generated
     */
    EList<Parameter> getParameter();

} // System
