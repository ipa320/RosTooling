/**
 */
package ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ros.ParameterListType;
import ros.ParameterSequence;
import ros.ParameterType;
import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.ParameterListTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link ros.impl.ParameterListTypeImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterListTypeImpl extends ParameterTypeImpl implements ParameterListType {
    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected EList<ParameterType> sequence;

    /**
     * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefault()
     * @generated
     * @ordered
     */
    protected ParameterSequence default_;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.PARAMETER_LIST_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ParameterType> getSequence() {
        if (sequence == null) {
            sequence = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, RosPackage.PARAMETER_LIST_TYPE__SEQUENCE);
        }
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ParameterSequence getDefault() {
        return default_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefault(ParameterSequence newDefault, NotificationChain msgs) {
        ParameterSequence oldDefault = default_;
        default_ = newDefault;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RosPackage.PARAMETER_LIST_TYPE__DEFAULT, oldDefault, newDefault);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefault(ParameterSequence newDefault) {
        if (newDefault != default_) {
            NotificationChain msgs = null;
            if (default_ != null)
                msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RosPackage.PARAMETER_LIST_TYPE__DEFAULT, null, msgs);
            if (newDefault != null)
                msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RosPackage.PARAMETER_LIST_TYPE__DEFAULT, null, msgs);
            msgs = basicSetDefault(newDefault, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PARAMETER_LIST_TYPE__DEFAULT, newDefault, newDefault));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.PARAMETER_LIST_TYPE__SEQUENCE:
                return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
            case RosPackage.PARAMETER_LIST_TYPE__DEFAULT:
                return basicSetDefault(null, msgs);
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
            case RosPackage.PARAMETER_LIST_TYPE__SEQUENCE:
                return getSequence();
            case RosPackage.PARAMETER_LIST_TYPE__DEFAULT:
                return getDefault();
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
            case RosPackage.PARAMETER_LIST_TYPE__SEQUENCE:
                getSequence().clear();
                getSequence().addAll((Collection<? extends ParameterType>)newValue);
                return;
            case RosPackage.PARAMETER_LIST_TYPE__DEFAULT:
                setDefault((ParameterSequence)newValue);
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
            case RosPackage.PARAMETER_LIST_TYPE__SEQUENCE:
                getSequence().clear();
                return;
            case RosPackage.PARAMETER_LIST_TYPE__DEFAULT:
                setDefault((ParameterSequence)null);
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
            case RosPackage.PARAMETER_LIST_TYPE__SEQUENCE:
                return sequence != null && !sequence.isEmpty();
            case RosPackage.PARAMETER_LIST_TYPE__DEFAULT:
                return default_ != null;
        }
        return super.eIsSet(featureID);
    }

} //ParameterListTypeImpl
