/**
 */
package ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespaced Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.NamespacedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ros.NamespacedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getNamespacedElement()
 * @model
 * @generated
 */
public interface NamespacedElement extends EObject {
    /**
     * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' containment reference.
     * @see #setNamespace(Namespace)
     * @see ros.RosPackage#getNamespacedElement_Namespace()
     * @model containment="true"
     * @generated
     */
    Namespace getNamespace();

    /**
     * Sets the value of the '{@link ros.NamespacedElement#getNamespace <em>Namespace</em>}' containment reference.
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
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ros.RosPackage#getNamespacedElement_Name()
     * @model dataType="ros.GraphName" required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ros.NamespacedElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // NamespacedElement
