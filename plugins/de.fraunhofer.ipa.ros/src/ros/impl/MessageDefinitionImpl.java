/**
 */
package ros.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import primitives.MessagePart;
import ros.MessageDefinition;
import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.MessageDefinitionImpl#getMessagePart <em>Message Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDefinitionImpl extends MinimalEObjectImpl.Container implements MessageDefinition {
    /**
     * The cached value of the '{@link #getMessagePart() <em>Message Part</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessagePart()
     * @generated
     * @ordered
     */
    protected EList<MessagePart> messagePart;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageDefinitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.MESSAGE_DEFINITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<MessagePart> getMessagePart() {
        if (messagePart == null) {
            messagePart = new EObjectContainmentEList<MessagePart>(MessagePart.class, this, RosPackage.MESSAGE_DEFINITION__MESSAGE_PART);
        }
        return messagePart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.MESSAGE_DEFINITION__MESSAGE_PART:
                return ((InternalEList<?>)getMessagePart()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RosPackage.MESSAGE_DEFINITION__MESSAGE_PART:
                return getMessagePart();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RosPackage.MESSAGE_DEFINITION__MESSAGE_PART:
                getMessagePart().clear();
                getMessagePart().addAll((Collection<? extends MessagePart>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RosPackage.MESSAGE_DEFINITION__MESSAGE_PART:
                getMessagePart().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RosPackage.MESSAGE_DEFINITION__MESSAGE_PART:
                return messagePart != null && !messagePart.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MessageDefinitionImpl
