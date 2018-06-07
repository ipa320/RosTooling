/**
 */
package ros;

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
 *   <li>{@link ros.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link ros.Artifact#getNode <em>Node</em>}</li>
 *   <li>{@link ros.Artifact#getBuild_depend <em>Build depend</em>}</li>
 *   <li>{@link ros.Artifact#getExec_depend <em>Exec depend</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getArtifact()
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
	 * @see ros.RosPackage#getArtifact_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ros.Artifact#getName <em>Name</em>}' attribute.
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
	 * @see ros.RosPackage#getArtifact_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link ros.Artifact#getNode <em>Node</em>}' containment reference.
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
	 * @see ros.RosPackage#getArtifact_Build_depend()
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
	 * @see ros.RosPackage#getArtifact_Exec_depend()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyType> getExec_depend();

} // Artifact
