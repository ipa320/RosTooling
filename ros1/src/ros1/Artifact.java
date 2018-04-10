/**
 */
package ros1;

import PackageFormat2.DependencyType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link ros1.Artifact#getNode <em>Node</em>}</li>
 *   <li>{@link ros1.Artifact#getBuild_depend <em>Build depend</em>}</li>
 *   <li>{@link ros1.Artifact#getExec_depend <em>Exec depend</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
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
	 * @see ros1.Ros1Package#getArtifact_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ros1.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(Node)
	 * @see ros1.Ros1Package#getArtifact_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link ros1.Artifact#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Build depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build depend</em>' containment reference list.
	 * @see ros1.Ros1Package#getArtifact_Build_depend()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyType> getBuild_depend();

	/**
	 * Returns the value of the '<em><b>Exec depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec depend</em>' containment reference list.
	 * @see ros1.Ros1Package#getArtifact_Exec_depend()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyType> getExec_depend();

} // Artifact
