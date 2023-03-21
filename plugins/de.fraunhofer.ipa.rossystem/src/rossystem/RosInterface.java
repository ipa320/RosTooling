/**
 */
package rossystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.RosInterface#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.RosInterface#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getRosInterface()
 * @model
 * @generated
 */
public interface RosInterface extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see rossystem.RossystemPackage#getRosInterface_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rossystem.RosInterface#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' containment reference.
     * @see #setReference(InterfaceReference)
     * @see rossystem.RossystemPackage#getRosInterface_Reference()
     * @model containment="true" required="true"
     * @generated
     */
    InterfaceReference getReference();

    /**
     * Sets the value of the '{@link rossystem.RosInterface#getReference <em>Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' containment reference.
     * @see #getReference()
     * @generated
     */
    void setReference(InterfaceReference value);

} // RosInterface
