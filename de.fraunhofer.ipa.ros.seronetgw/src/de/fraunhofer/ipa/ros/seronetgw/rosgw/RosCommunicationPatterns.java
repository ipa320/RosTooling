/**
 */
package de.fraunhofer.ipa.ros.seronetgw.rosgw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Communication Patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosCommunicationPatterns#getTopicpub <em>Topicpub</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosCommunicationPatterns#getTopicSub <em>Topic Sub</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosCommunicationPatterns#getSrvServer <em>Srv Server</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.RosCommunicationPatterns#getSrvClient <em>Srv Client</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getRosCommunicationPatterns()
 * @model abstract="true"
 * @generated
 */
public interface RosCommunicationPatterns extends EObject {
	/**
	 * Returns the value of the '<em><b>Topicpub</b></em>' reference list.
	 * The list contents are of type {@link ros.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topicpub</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topicpub</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getRosCommunicationPatterns_Topicpub()
	 * @model
	 * @generated
	 */
	EList<Publisher> getTopicpub();

	/**
	 * Returns the value of the '<em><b>Topic Sub</b></em>' reference list.
	 * The list contents are of type {@link ros.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Sub</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Sub</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getRosCommunicationPatterns_TopicSub()
	 * @model
	 * @generated
	 */
	EList<Subscriber> getTopicSub();

	/**
	 * Returns the value of the '<em><b>Srv Server</b></em>' reference list.
	 * The list contents are of type {@link ros.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Server</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Server</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getRosCommunicationPatterns_SrvServer()
	 * @model
	 * @generated
	 */
	EList<ServiceServer> getSrvServer();

	/**
	 * Returns the value of the '<em><b>Srv Client</b></em>' reference list.
	 * The list contents are of type {@link ros.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Client</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getRosCommunicationPatterns_SrvClient()
	 * @model
	 * @generated
	 */
	EList<ServiceClient> getSrvClient();

} // RosCommunicationPatterns
