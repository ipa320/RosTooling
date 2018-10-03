/**
 */
package rossystem;

import componentInterface.ComponentInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosSystem#getTopicConnections <em>Topic Connections</em>}</li>
 *   <li>{@link rossystem.RosSystem#getServiceConnections <em>Service Connections</em>}</li>
 *   <li>{@link rossystem.RosSystem#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.RosSystem#getRosComponent <em>Ros Component</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosSystem()
 * @model
 * @generated
 */
public interface RosSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic Connections</b></em>' containment reference list.
	 * The list contents are of type {@link rossystem.TopicConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Connections</em>' containment reference list.
	 * @see rossystem.RossystemPackage#getRosSystem_TopicConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopicConnection> getTopicConnections();

	/**
	 * Returns the value of the '<em><b>Service Connections</b></em>' containment reference list.
	 * The list contents are of type {@link rossystem.ServiceConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Connections</em>' containment reference list.
	 * @see rossystem.RossystemPackage#getRosSystem_ServiceConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConnection> getServiceConnections();

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
	 * @model
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
	 * Returns the value of the '<em><b>Ros Component</b></em>' reference list.
	 * The list contents are of type {@link componentInterface.ComponentInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Component</em>' reference list.
	 * @see rossystem.RossystemPackage#getRosSystem_RosComponent()
	 * @model
	 * @generated
	 */
	EList<ComponentInterface> getRosComponent();

} // RosSystem
