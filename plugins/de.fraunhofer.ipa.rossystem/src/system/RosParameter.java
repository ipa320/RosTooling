/**
 */
package system;

import org.eclipse.emf.ecore.EObject;

import ros.Parameter;
import ros.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.RosParameter#getName <em>Name</em>}</li>
 *   <li>{@link system.RosParameter#getValue <em>Value</em>}</li>
 *   <li>{@link system.RosParameter#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see system.RossystemPackage#getRosParameter()
 * @model
 * @generated
 */
public interface RosParameter extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see system.RossystemPackage#getRosParameter_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link system.RosParameter#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(ParameterValue)
     * @see system.RossystemPackage#getRosParameter_Value()
     * @model containment="true"
     * @generated
     */
    ParameterValue getValue();

    /**
     * Sets the value of the '{@link system.RosParameter#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(ParameterValue value);

    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Parameter)
     * @see system.RossystemPackage#getRosParameter_From()
     * @model required="true"
     * @generated
     */
    Parameter getFrom();

    /**
     * Sets the value of the '{@link system.RosParameter#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Parameter value);

} // RosParameter
