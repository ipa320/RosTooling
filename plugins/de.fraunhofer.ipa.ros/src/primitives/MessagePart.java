/**
 */
package primitives;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link primitives.MessagePart#getType <em>Type</em>}</li>
 *   <li>{@link primitives.MessagePart#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see primitives.PrimitivesPackage#getMessagePart()
 * @model
 * @generated
 */
public interface MessagePart extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AbstractType)
	 * @see primitives.PrimitivesPackage#getMessagePart_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractType getType();

	/**
	 * Sets the value of the '{@link primitives.MessagePart#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see primitives.PrimitivesPackage#getMessagePart_Data()
	 * @model required="true"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link primitives.MessagePart#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // MessagePart
