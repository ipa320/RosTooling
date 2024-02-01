/**
 */
package ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import primitives.impl.AbstractTypeImpl;

import ros.ArrayTopicSpecMsgRef;
import ros.RosPackage;
import ros.SpecBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Topic Spec Msg Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.ArrayTopicSpecMsgRefImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTopicSpecMsgRefImpl extends AbstractTypeImpl implements ArrayTopicSpecMsgRef {
    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected SpecBase reference;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArrayTopicSpecMsgRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.ARRAY_TOPIC_SPEC_MSG_REF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SpecBase getReference() {
        if (reference != null && reference.eIsProxy()) {
            InternalEObject oldReference = (InternalEObject)reference;
            reference = (SpecBase)eResolveProxy(oldReference);
            if (reference != oldReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.ARRAY_TOPIC_SPEC_MSG_REF__REFERENCE, oldReference, reference));
            }
        }
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecBase basicGetReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReference(SpecBase newReference) {
        SpecBase oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ARRAY_TOPIC_SPEC_MSG_REF__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RosPackage.ARRAY_TOPIC_SPEC_MSG_REF__REFERENCE:
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
            case RosPackage.ARRAY_TOPIC_SPEC_MSG_REF__REFERENCE:
                setReference((SpecBase)newValue);
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
            case RosPackage.ARRAY_TOPIC_SPEC_MSG_REF__REFERENCE:
                setReference((SpecBase)null);
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
            case RosPackage.ARRAY_TOPIC_SPEC_MSG_REF__REFERENCE:
                return reference != null;
        }
        return super.eIsSet(featureID);
    }

} //ArrayTopicSpecMsgRefImpl
