/**
 */
package ros1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.Package#getName <em>Name</em>}</li>
 *   <li>{@link ros1.Package#getSpec <em>Spec</em>}</li>
 *   <li>{@link ros1.Package#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
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
	 * @see ros1.Ros1Package#getPackage_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ros1.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.SpecBase}.
	 * It is bidirectional and its opposite is '{@link ros1.SpecBase#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference list.
	 * @see ros1.Ros1Package#getPackage_Spec()
	 * @see ros1.SpecBase#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<SpecBase> getSpec();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link ros1.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see ros1.Ros1Package#getPackage_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifact();

} // Package
