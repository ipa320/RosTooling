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
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.Export#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.Export#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.Export#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.Export#getServiceServer <em>Service Server</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getExport()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Export extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference list.
	 * The list contents are of type {@link ros.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getExport_Subscriber()
	 * @model
	 * @generated
	 */
	EList<Subscriber> getSubscriber();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference list.
	 * The list contents are of type {@link ros.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getExport_Publisher()
	 * @model
	 * @generated
	 */
	EList<Publisher> getPublisher();

	/**
	 * Returns the value of the '<em><b>Service Client</b></em>' reference list.
	 * The list contents are of type {@link ros.ServiceClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Client</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getExport_ServiceClient()
	 * @model
	 * @generated
	 */
	EList<ServiceClient> getServiceClient();

	/**
	 * Returns the value of the '<em><b>Service Server</b></em>' reference list.
	 * The list contents are of type {@link ros.ServiceServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Server</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Server</em>' reference list.
	 * @see de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage#getExport_ServiceServer()
	 * @model
	 * @generated
	 */
	EList<ServiceServer> getServiceServer();

} // Export
