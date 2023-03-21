/**
 */
package ros;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.ParameterDate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getParameterDate()
 * @model
 * @generated
 */
public interface ParameterDate extends ParameterValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(XMLGregorianCalendar)
     * @see ros.RosPackage#getParameterDate_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
     * @generated
     */
    XMLGregorianCalendar getValue();

    /**
     * Sets the value of the '{@link ros.ParameterDate#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(XMLGregorianCalendar value);

} // ParameterDate
