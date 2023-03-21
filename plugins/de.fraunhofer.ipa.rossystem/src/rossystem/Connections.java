/**
 */
package rossystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.Connections#getRosTopicConnections <em>Ros Topic Connections</em>}</li>
 *   <li>{@link rossystem.Connections#getRosServiceConnections <em>Ros Service Connections</em>}</li>
 *   <li>{@link rossystem.Connections#getRosActionConnections <em>Ros Action Connections</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getConnections()
 * @model
 * @generated
 */
public interface Connections extends EObject {
    /**
     * Returns the value of the '<em><b>Ros Topic Connections</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.TopicConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ros Topic Connections</em>' containment reference list.
     * @see rossystem.RossystemPackage#getConnections_RosTopicConnections()
     * @model containment="true"
     * @generated
     */
    EList<TopicConnection> getRosTopicConnections();

    /**
     * Returns the value of the '<em><b>Ros Service Connections</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.ServiceConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ros Service Connections</em>' containment reference list.
     * @see rossystem.RossystemPackage#getConnections_RosServiceConnections()
     * @model containment="true"
     * @generated
     */
    EList<ServiceConnection> getRosServiceConnections();

    /**
     * Returns the value of the '<em><b>Ros Action Connections</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.ActionConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ros Action Connections</em>' containment reference list.
     * @see rossystem.RossystemPackage#getConnections_RosActionConnections()
     * @model containment="true"
     * @generated
     */
    EList<ActionConnection> getRosActionConnections();

} // Connections
