/**
 */
package ros;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.Namespace#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends EObject {
    /**
     * Returns the value of the '<em><b>Parts</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parts</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parts</em>' attribute list.
     * @see ros.RosPackage#getNamespace_Parts()
     * @model unique="false" dataType="ros.GraphName"
     * @generated
     */
    EList<String> getParts();

} // Namespace
