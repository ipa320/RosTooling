/**
 */
package ros;

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
 *   <li>{@link ros.Package#getName <em>Name</em>}</li>
 *   <li>{@link ros.Package#getSpec <em>Spec</em>}</li>
 *   <li>{@link ros.Package#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link ros.Package#getFromGitRepo <em>From Git Repo</em>}</li>
 *   <li>{@link ros.Package#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getPackage()
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
	 * @see ros.RosPackage#getPackage_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ros.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference list.
	 * The list contents are of type {@link ros.SpecBase}.
	 * It is bidirectional and its opposite is '{@link ros.SpecBase#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference list.
	 * @see ros.RosPackage#getPackage_Spec()
	 * @see ros.SpecBase#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<SpecBase> getSpec();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link ros.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see ros.RosPackage#getPackage_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>From Git Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Git Repo</em>' attribute.
	 * @see #setFromGitRepo(String)
	 * @see ros.RosPackage#getPackage_FromGitRepo()
	 * @model
	 * @generated
	 */
	String getFromGitRepo();

	/**
	 * Sets the value of the '{@link ros.Package#getFromGitRepo <em>From Git Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Git Repo</em>' attribute.
	 * @see #getFromGitRepo()
	 * @generated
	 */
	void setFromGitRepo(String value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link ros.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see ros.RosPackage#getPackage_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

} // Package
