/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.Process#getName <em>Name</em>}</li>
 *   <li>{@link system.Process#getThreads <em>Threads</em>}</li>
 *   <li>{@link system.Process#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see system.RossystemPackage#getProcess_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link system.Process#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Threads</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threads</em>' attribute.
     * @see #setThreads(int)
     * @see system.RossystemPackage#getProcess_Threads()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
     * @generated
     */
    int getThreads();

    /**
     * Sets the value of the '{@link system.Process#getThreads <em>Threads</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threads</em>' attribute.
     * @see #getThreads()
     * @generated
     */
    void setThreads(int value);

    /**
     * Returns the value of the '<em><b>Nodes</b></em>' reference list.
     * The list contents are of type {@link system.RosNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' reference list.
     * @see system.RossystemPackage#getProcess_Nodes()
     * @model
     * @generated
     */
    EList<RosNode> getNodes();

} // Process
