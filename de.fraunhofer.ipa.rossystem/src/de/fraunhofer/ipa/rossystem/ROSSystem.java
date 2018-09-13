/**
 */
package de.fraunhofer.ipa.rossystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ros.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.rossystem.ROSSystem#getRosNode <em>Ros Node</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.rossystem.RossystemPackage#getROSSystem()
 * @model
 * @generated
 */
public interface ROSSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Ros Node</b></em>' reference list.
	 * The list contents are of type {@link ros.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ros Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ros Node</em>' reference list.
	 * @see de.fraunhofer.ipa.rossystem.RossystemPackage#getROSSystem_RosNode()
	 * @model
	 * @generated
	 */
	EList<Node> getRosNode();

} // ROSSystem
