/**
 */
package ros;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ament Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.AmentPackage#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getAmentPackage()
 * @model
 * @generated
 */
public interface AmentPackage extends ros.Package {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link ros.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see ros.RosPackage#getAmentPackage_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

} // AmentPackage
