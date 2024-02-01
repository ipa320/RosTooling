/**
 */
package ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ros.RosPackage;
import ros.ServiceServer;
import ros.ServiceSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.ServiceServerImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceServerImpl extends InterfaceTypeImpl implements ServiceServer {
    /**
     * The cached value of the '{@link #getService() <em>Service</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected ServiceSpec service;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceServerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.SERVICE_SERVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSpec getService() {
        if (service != null && service.eIsProxy()) {
            InternalEObject oldService = (InternalEObject)service;
            service = (ServiceSpec)eResolveProxy(oldService);
            if (service != oldService) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RosPackage.SERVICE_SERVER__SERVICE, oldService, service));
            }
        }
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSpec basicGetService() {
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setService(ServiceSpec newService) {
        ServiceSpec oldService = service;
        service = newService;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SERVICE_SERVER__SERVICE, oldService, service));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RosPackage.SERVICE_SERVER__SERVICE:
                if (resolve) return getService();
                return basicGetService();
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
            case RosPackage.SERVICE_SERVER__SERVICE:
                setService((ServiceSpec)newValue);
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
            case RosPackage.SERVICE_SERVER__SERVICE:
                setService((ServiceSpec)null);
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
            case RosPackage.SERVICE_SERVER__SERVICE:
                return service != null;
        }
        return super.eIsSet(featureID);
    }

} //ServiceServerImpl
