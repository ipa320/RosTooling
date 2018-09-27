/**
 */
package de.fraunhofer.ipa.componentInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosTopicPublisher <em>Ros Topic Publisher</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosServiceServer <em>Ros Service Server</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getRosServiceClient <em>Ros Service Client</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage#getComponentInterface()
 * @model
 * @generated
 */
public interface ComponentInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Ros Topic Publisher</b></em>' reference list.
	 * The list contents are of type {@link ros.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Topic Publisher</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Topic Publisher</em>' reference list.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage#getComponentInterface_RosTopicPublisher()
	 * @model
	 * @generated
	 */
	EList<Publisher> getRosTopicPublisher();

	/**
	 * Returns the value of the '<em><b>Ros Topic Subscriber</b></em>' reference list.
	 * The list contents are of type {@link ros.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Topic Subscriber</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Topic Subscriber</em>' reference list.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage#getComponentInterface_RosTopicSubscriber()
	 * @model
	 * @generated
	 */
	EList<Subscriber> getRosTopicSubscriber();

	/**
	 * Returns the value of the '<em><b>Ros Service Server</b></em>' reference list.
	 * The list contents are of type {@link ros.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Service Server</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Service Server</em>' reference list.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage#getComponentInterface_RosServiceServer()
	 * @model
	 * @generated
	 */
	EList<ServiceServer> getRosServiceServer();

	/**
	 * Returns the value of the '<em><b>Ros Service Client</b></em>' reference list.
	 * The list contents are of type {@link ros.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Service Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Service Client</em>' reference list.
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage#getComponentInterface_RosServiceClient()
	 * @model
	 * @generated
	 */
	EList<ServiceClient> getRosServiceClient();

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
	 * @see de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage#getComponentInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.ipa.componentInterface.ComponentInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentInterface
