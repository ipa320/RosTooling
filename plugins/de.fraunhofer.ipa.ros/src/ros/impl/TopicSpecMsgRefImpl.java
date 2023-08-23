/**
 */
package ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import primitives.impl.AbstractTypeImpl;
import ros.RosPackage;
import ros.TopicSpec;
import ros.TopicSpecMsgRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Spec Msg Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.TopicSpecMsgRefImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicSpecMsgRefImpl extends AbstractTypeImpl implements TopicSpecMsgRef {
    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected TopicSpec reference;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TopicSpecMsgRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.TOPIC_SPEC_MSG_REF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopicSpec getReference() {
        if (reference != null && reference.eIsProxy()) {
            InternalEObject oldReference = (InternalEObject)reference;
            reference = (TopicSpec)eResolveProxy(oldReference);
            if (reference != oldReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.TOPIC_SPEC_MSG_REF__REFERENCE, oldReference, reference));
            }
        }
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopicSpec basicGetReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReference(TopicSpec newReference) {
        TopicSpec oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.TOPIC_SPEC_MSG_REF__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RosPackage.TOPIC_SPEC_MSG_REF__REFERENCE:
                if (resolve) return getReference();
                return basicGetReference();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RosPackage.TOPIC_SPEC_MSG_REF__REFERENCE:
                setReference((TopicSpec)newValue);
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
            case RosPackage.TOPIC_SPEC_MSG_REF__REFERENCE:
                setReference((TopicSpec)null);
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
            case RosPackage.TOPIC_SPEC_MSG_REF__REFERENCE:
                return reference != null;
        }
        return super.eIsSet(featureID);
    }

} //TopicSpecMsgRefImpl
