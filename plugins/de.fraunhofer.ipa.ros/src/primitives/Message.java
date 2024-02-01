/**
 */
package primitives;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link primitives.Message#getData <em>Data</em>}</li>
 *   <li>{@link primitives.Message#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see primitives.PrimitivesPackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EObject {
    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(String)
     * @see primitives.PrimitivesPackage#getMessage_Data()
     * @model
     * @generated
     */
    String getData();

    /**
     * Sets the value of the '{@link primitives.Message#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(AbstractType)
     * @see primitives.PrimitivesPackage#getMessage_Type()
     * @model
     * @generated
     */
    AbstractType getType();

    /**
     * Sets the value of the '{@link primitives.Message#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(AbstractType value);

} // Message
