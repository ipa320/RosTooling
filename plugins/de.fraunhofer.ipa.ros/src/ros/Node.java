/**
 */
package ros;

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
 *   <li>{@link ros.Node#getServiceserver <em>Serviceserver</em>}</li>
 *   <li>{@link ros.Node#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ros.Node#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link ros.Node#getServiceclient <em>Serviceclient</em>}</li>
 *   <li>{@link ros.Node#getActionserver <em>Actionserver</em>}</li>
 *   <li>{@link ros.Node#getActionclient <em>Actionclient</em>}</li>
 *   <li>{@link ros.Node#getName <em>Name</em>}</li>
 *   <li>{@link ros.Node#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
    /**
     * Returns the value of the '<em><b>Serviceserver</b></em>' containment reference list.
     * The list contents are of type {@link ros.ServiceServer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Serviceserver</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Serviceserver</em>' containment reference list.
     * @see ros.RosPackage#getNode_Serviceserver()
     * @model containment="true"
     * @generated
     */
    EList<ServiceServer> getServiceserver();

    /**
     * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
     * The list contents are of type {@link ros.Publisher}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Publisher</em>' containment reference list.
     * @see ros.RosPackage#getNode_Publisher()
     * @model containment="true"
     * @generated
     */
    EList<Publisher> getPublisher();

    /**
     * Returns the value of the '<em><b>Subscriber</b></em>' containment reference list.
     * The list contents are of type {@link ros.Subscriber}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subscriber</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subscriber</em>' containment reference list.
     * @see ros.RosPackage#getNode_Subscriber()
     * @model containment="true"
     * @generated
     */
    EList<Subscriber> getSubscriber();

    /**
     * Returns the value of the '<em><b>Serviceclient</b></em>' containment reference list.
     * The list contents are of type {@link ros.ServiceClient}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Serviceclient</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Serviceclient</em>' containment reference list.
     * @see ros.RosPackage#getNode_Serviceclient()
     * @model containment="true"
     * @generated
     */
    EList<ServiceClient> getServiceclient();

    /**
     * Returns the value of the '<em><b>Actionserver</b></em>' containment reference list.
     * The list contents are of type {@link ros.ActionServer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actionserver</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actionserver</em>' containment reference list.
     * @see ros.RosPackage#getNode_Actionserver()
     * @model containment="true"
     * @generated
     */
    EList<ActionServer> getActionserver();

    /**
     * Returns the value of the '<em><b>Actionclient</b></em>' containment reference list.
     * The list contents are of type {@link ros.ActionClient}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actionclient</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actionclient</em>' containment reference list.
     * @see ros.RosPackage#getNode_Actionclient()
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
     * @see ros.RosPackage#getNode_Name()
     * @model dataType="ros.GraphName" required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ros.Node#getName <em>Name</em>}' attribute.
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
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see ros.RosPackage#getNode_Parameter()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameter();

} // Node
