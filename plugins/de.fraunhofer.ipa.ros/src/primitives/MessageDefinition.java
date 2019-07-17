/**
 */
package primitives;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link primitives.MessageDefinition#getMessagePart <em>Message Part</em>}</li>
 * </ul>
 *
 * @see primitives.PrimitivesPackage#getMessageDefinition()
 * @model
 * @generated
 */
public interface MessageDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Part</b></em>' containment reference list.
	 * The list contents are of type {@link primitives.MessagePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Part</em>' containment reference list.
	 * @see primitives.PrimitivesPackage#getMessageDefinition_MessagePart()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessagePart> getMessagePart();

} // MessageDefinition
