/**
 */
package rossystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosInterfaces#getRosactionclient <em>Rosactionclient</em>}</li>
 *   <li>{@link rossystem.RosInterfaces#getRospublisher <em>Rospublisher</em>}</li>
 *   <li>{@link rossystem.RosInterfaces#getRosserviceserver <em>Rosserviceserver</em>}</li>
 *   <li>{@link rossystem.RosInterfaces#getRossubscriber <em>Rossubscriber</em>}</li>
 *   <li>{@link rossystem.RosInterfaces#getRosserviceclient <em>Rosserviceclient</em>}</li>
 *   <li>{@link rossystem.RosInterfaces#getRosactionserver <em>Rosactionserver</em>}</li>
 *   <li>{@link rossystem.RosInterfaces#getRosparameter <em>Rosparameter</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosInterfaces()
 * @model
 * @generated
 */
public interface RosInterfaces extends EObject {
    /**
     * Returns the value of the '<em><b>Rosactionclient</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosActionClient}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosactionclient</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rosactionclient()
     * @model containment="true"
     * @generated
     */
    EList<RosActionClient> getRosactionclient();

    /**
     * Returns the value of the '<em><b>Rospublisher</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosPublisher}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rospublisher</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rospublisher()
     * @model containment="true"
     * @generated
     */
    EList<RosPublisher> getRospublisher();

    /**
     * Returns the value of the '<em><b>Rosserviceserver</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosServiceServer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosserviceserver</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rosserviceserver()
     * @model containment="true"
     * @generated
     */
    EList<RosServiceServer> getRosserviceserver();

    /**
     * Returns the value of the '<em><b>Rossubscriber</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosSubscriber}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rossubscriber</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rossubscriber()
     * @model containment="true"
     * @generated
     */
    EList<RosSubscriber> getRossubscriber();

    /**
     * Returns the value of the '<em><b>Rosserviceclient</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosServiceClient}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosserviceclient</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rosserviceclient()
     * @model containment="true"
     * @generated
     */
    EList<RosServiceClient> getRosserviceclient();

    /**
     * Returns the value of the '<em><b>Rosactionserver</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosActionServer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosactionserver</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rosactionserver()
     * @model containment="true"
     * @generated
     */
    EList<RosActionServer> getRosactionserver();

    /**
     * Returns the value of the '<em><b>Rosparameter</b></em>' containment reference list.
     * The list contents are of type {@link rossystem.RosParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rosparameter</em>' containment reference list.
     * @see rossystem.RossystemPackage#getRosInterfaces_Rosparameter()
     * @model containment="true"
     * @generated
     */
    EList<RosParameter> getRosparameter();

} // RosInterfaces
