/**
 */
package ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.SpecBase#getName <em>Name</em>}</li>
 *   <li>{@link ros.SpecBase#getPackage <em>Package</em>}</li>
 *   <li>{@link ros.SpecBase#getFullname <em>Fullname</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getSpecBase()
 * @model abstract="true"
 * @generated
 */
public interface SpecBase extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ros.RosPackage#getSpecBase_Name()
     * @model default="" unique="false" required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ros.SpecBase#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ros.Package#getSpec <em>Spec</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(ros.Package)
     * @see ros.RosPackage#getSpecBase_Package()
     * @see ros.Package#getSpec
     * @model opposite="spec" required="true" transient="false"
     * @generated
     */
    ros.Package getPackage();

    /**
     * Sets the value of the '{@link ros.SpecBase#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(ros.Package value);

    /**
     * Returns the value of the '<em><b>Fullname</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fullname</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fullname</em>' attribute.
     * @see #isSetFullname()
     * @see ros.RosPackage#getSpecBase_Fullname()
     * @model default="" unsettable="true" id="true" required="true" transient="true" changeable="false" volatile="true"
     * @generated
     */
    String getFullname();

    /**
     * Returns whether the value of the '{@link ros.SpecBase#getFullname <em>Fullname</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fullname</em>' attribute is set.
     * @see #getFullname()
     * @generated
     */
    boolean isSetFullname();

} // SpecBase
