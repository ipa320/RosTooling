/**
 */
package system.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import system.Component;
import system.ComponentRef;
import system.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.ComponentRefImpl#getComponentRef <em>Component Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRefImpl extends ComponentImpl implements ComponentRef {
    /**
     * The cached value of the '{@link #getComponentRef() <em>Component Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponentRef()
     * @generated
     * @ordered
     */
    protected Component componentRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RossystemPackage.Literals.COMPONENT_REF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Component getComponentRef() {
        if (componentRef != null && componentRef.eIsProxy()) {
            InternalEObject oldComponentRef = (InternalEObject)componentRef;
            componentRef = (Component)eResolveProxy(oldComponentRef);
            if (componentRef != oldComponentRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.COMPONENT_REF__COMPONENT_REF, oldComponentRef, componentRef));
            }
        }
        return componentRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component basicGetComponentRef() {
        return componentRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setComponentRef(Component newComponentRef) {
        Component oldComponentRef = componentRef;
        componentRef = newComponentRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.COMPONENT_REF__COMPONENT_REF, oldComponentRef, componentRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RossystemPackage.COMPONENT_REF__COMPONENT_REF:
                if (resolve) return getComponentRef();
                return basicGetComponentRef();
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
            case RossystemPackage.COMPONENT_REF__COMPONENT_REF:
                setComponentRef((Component)newValue);
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
            case RossystemPackage.COMPONENT_REF__COMPONENT_REF:
                setComponentRef((Component)null);
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
            case RossystemPackage.COMPONENT_REF__COMPONENT_REF:
                return componentRef != null;
        }
        return super.eIsSet(featureID);
    }

} //ComponentRefImpl
