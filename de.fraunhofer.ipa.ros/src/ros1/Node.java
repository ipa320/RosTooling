/**
 */
package ros1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.Node#getServiceserver <em>Serviceserver</em>}</li>
 *   <li>{@link ros1.Node#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ros1.Node#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link ros1.Node#getServiceclient <em>Serviceclient</em>}</li>
 *   <li>{@link ros1.Node#getActionserver <em>Actionserver</em>}</li>
 *   <li>{@link ros1.Node#getActionclient <em>Actionclient</em>}</li>
 *   <li>{@link ros1.Node#getName <em>Name</em>}</li>
 *   <li>{@link ros1.Node#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Serviceserver</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceserver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceserver</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Serviceserver()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceServer> getServiceserver();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publisher> getPublisher();

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Subscriber()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscriber> getSubscriber();

	/**
	 * Returns the value of the '<em><b>Serviceclient</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceclient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceclient</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Serviceclient()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceClient> getServiceclient();

	/**
	 * Returns the value of the '<em><b>Actionserver</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.ActionServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionserver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionserver</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Actionserver()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionServer> getActionserver();

	/**
	 * Returns the value of the '<em><b>Actionclient</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.ActionClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionclient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionclient</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Actionclient()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionClient> getActionclient();

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
	 * @see ros1.Ros1Package#getNode_Name()
	 * @model dataType="ros1.GraphName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ros1.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see ros1.Ros1Package#getNode_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Node
