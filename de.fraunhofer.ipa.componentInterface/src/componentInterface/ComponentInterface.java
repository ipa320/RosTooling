/**
 */
package componentInterface;

import org.eclipse.emf.common.util.EList;
import ros.NamespacedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.ComponentInterface#getRosTopicPublisher <em>Ros Topic Publisher</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getRosServiceServer <em>Ros Service Server</em>}</li>
 *   <li>{@link componentInterface.ComponentInterface#getRosServiceClient <em>Ros Service Client</em>}</li>
 * </ul>
 *
 * @see componentInterface.ComponentInterfacePackage#getComponentInterface()
 * @model
 * @generated
 */
public interface ComponentInterface extends NamespacedElement {
	/**
	 * Returns the value of the '<em><b>Ros Topic Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RemapPub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Topic Publisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Topic Publisher</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_RosTopicPublisher()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<RemapPub> getRosTopicPublisher();

	/**
	 * Returns the value of the '<em><b>Ros Topic Subscriber</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RemapSub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Topic Subscriber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Topic Subscriber</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_RosTopicSubscriber()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<RemapSub> getRosTopicSubscriber();

	/**
	 * Returns the value of the '<em><b>Ros Service Server</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RemapSrvServ}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Service Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Service Server</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_RosServiceServer()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<RemapSrvServ> getRosServiceServer();

	/**
	 * Returns the value of the '<em><b>Ros Service Client</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.RemapSrvCli}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Service Client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Service Client</em>' containment reference list.
	 * @see componentInterface.ComponentInterfacePackage#getComponentInterface_RosServiceClient()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<RemapSrvCli> getRosServiceClient();

} // ComponentInterface
