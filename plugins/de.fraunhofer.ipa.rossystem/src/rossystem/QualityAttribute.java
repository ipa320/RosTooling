/**
 */
package rossystem;

import org.eclipse.emf.ecore.EObject;

import ros.ParameterType;
import ros.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.QualityAttribute#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.QualityAttribute#getType <em>Type</em>}</li>
 *   <li>{@link rossystem.QualityAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getQualityAttribute()
 * @model
 * @generated
 */
public interface QualityAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rossystem.RossystemPackage#getQualityAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rossystem.QualityAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ParameterType)
	 * @see rossystem.RossystemPackage#getQualityAttribute_Type()
	 * @model containment="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link rossystem.QualityAttribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ParameterValue)
	 * @see rossystem.RossystemPackage#getQualityAttribute_Value()
	 * @model containment="true"
	 * @generated
	 */
	ParameterValue getValue();

	/**
	 * Sets the value of the '{@link rossystem.QualityAttribute#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ParameterValue value);

} // QualityAttribute
