/**
 */
package rossystem;

import componentInterface.ComponentInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rossystem.ComponentStack#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.ComponentStack#getRosComponent <em>Ros Component</em>}</li>
 *   <li>{@link rossystem.ComponentStack#getQualityAttribute <em>Quality Attribute</em>}</li>
 * </ul>
 *
 * @see rossystem.RossystemPackage#getComponentStack()
 * @model
 * @generated
 */
public interface ComponentStack extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rossystem.RossystemPackage#getComponentStack_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rossystem.ComponentStack#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ros Component</b></em>' containment reference list.
	 * The list contents are of type {@link componentInterface.ComponentInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Component</em>' containment reference list.
	 * @see rossystem.RossystemPackage#getComponentStack_RosComponent()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<ComponentInterface> getRosComponent();

	/**
	 * Returns the value of the '<em><b>Quality Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link rossystem.QualityAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Attribute</em>' containment reference list.
	 * @see rossystem.RossystemPackage#getComponentStack_QualityAttribute()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<QualityAttribute> getQualityAttribute();

} // ComponentStack
