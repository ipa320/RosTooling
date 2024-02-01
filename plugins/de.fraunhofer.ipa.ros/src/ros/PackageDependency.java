/**
 */
package ros;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.PackageDependency#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getPackageDependency()
 * @model
 * @generated
 */
public interface PackageDependency extends Dependency {
    /**
     * Returns the value of the '<em><b>Package</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' reference.
     * @see #setPackage(ros.Package)
     * @see ros.RosPackage#getPackageDependency_Package()
     * @model required="true"
     * @generated
     */
    ros.Package getPackage();

    /**
     * Sets the value of the '{@link ros.PackageDependency#getPackage <em>Package</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(ros.Package value);

} // PackageDependency
