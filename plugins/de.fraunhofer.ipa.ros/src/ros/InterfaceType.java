/**
 */
package ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.InterfaceType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ros.InterfaceType#getName <em>Name</em>}</li>
 *   <li>{@link ros.InterfaceType#getQos <em>Qos</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getInterfaceType()
 * @model
 * @generated
 */
public interface InterfaceType extends EObject {
    /**
     * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' containment reference.
     * @see #setNamespace(Namespace)
     * @see ros.RosPackage#getInterfaceType_Namespace()
     * @model containment="true"
     * @generated
     */
    Namespace getNamespace();

    /**
     * Sets the value of the '{@link ros.InterfaceType#getNamespace <em>Namespace</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' containment reference.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(Namespace value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ros.RosPackage#getInterfaceType_Name()
     * @model dataType="ros.GraphName" required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ros.InterfaceType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Qos</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qos</em>' containment reference.
     * @see #setQos(QualityOfService)
     * @see ros.RosPackage#getInterfaceType_Qos()
     * @model containment="true"
     * @generated
     */
    QualityOfService getQos();

    /**
     * Sets the value of the '{@link ros.InterfaceType#getQos <em>Qos</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qos</em>' containment reference.
     * @see #getQos()
     * @generated
     */
    void setQos(QualityOfService value);

} // InterfaceType
