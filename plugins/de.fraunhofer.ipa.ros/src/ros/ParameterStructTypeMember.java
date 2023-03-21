/**
 */
package ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Struct Type Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterStructTypeMember#getName <em>Name</em>}</li>
 *   <li>{@link ros.ParameterStructTypeMember#getType <em>Type</em>}</li>
 *   <li>{@link ros.ParameterStructTypeMember#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterStructTypeMember()
 * @model
 * @generated
 */
public interface ParameterStructTypeMember extends EObject {
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
     * @see ros.RosPackage#getParameterStructTypeMember_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ros.ParameterStructTypeMember#getName <em>Name</em>}' attribute.
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
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(ParameterType)
     * @see ros.RosPackage#getParameterStructTypeMember_Type()
     * @model containment="true" required="true"
     * @generated
     */
    ParameterType getType();

    /**
     * Sets the value of the '{@link ros.ParameterStructTypeMember#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(ParameterType value);

    /**
     * Returns the value of the '<em><b>Default</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' containment reference.
     * @see #setDefault(ParameterStruct)
     * @see ros.RosPackage#getParameterStructTypeMember_Default()
     * @model containment="true"
     * @generated
     */
    ParameterStruct getDefault();

    /**
     * Sets the value of the '{@link ros.ParameterStructTypeMember#getDefault <em>Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' containment reference.
     * @see #getDefault()
     * @generated
     */
    void setDefault(ParameterStruct value);

} // ParameterStructTypeMember
