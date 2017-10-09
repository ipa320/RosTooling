/**
 */
package ros1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catkin Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.CatkinPackage#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getCatkinPackage()
 * @model
 * @generated
 */
public interface CatkinPackage extends ros1.Package {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see ros1.Ros1Package#getCatkinPackage_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

} // CatkinPackage
