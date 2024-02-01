/**
 */
package ros.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ros.MessageDefinition;
import ros.RosPackage;
import ros.ServiceSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.ServiceSpecImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link ros.impl.ServiceSpecImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecImpl extends SpecBaseImpl implements ServiceSpec {
    /**
     * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequest()
     * @generated
     * @ordered
     */
    protected MessageDefinition request;

    /**
     * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResponse()
     * @generated
     * @ordered
     */
    protected MessageDefinition response;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceSpecImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.SERVICE_SPEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MessageDefinition getRequest() {
        return request;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequest(MessageDefinition newRequest, NotificationChain msgs) {
        MessageDefinition oldRequest = request;
        request = newRequest;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RosPackage.SERVICE_SPEC__REQUEST, oldRequest, newRequest);
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
    public void setRequest(MessageDefinition newRequest) {
        if (newRequest != request) {
            NotificationChain msgs = null;
            if (request != null)
                msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RosPackage.SERVICE_SPEC__REQUEST, null, msgs);
            if (newRequest != null)
                msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RosPackage.SERVICE_SPEC__REQUEST, null, msgs);
            msgs = basicSetRequest(newRequest, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SERVICE_SPEC__REQUEST, newRequest, newRequest));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MessageDefinition getResponse() {
        return response;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResponse(MessageDefinition newResponse, NotificationChain msgs) {
        MessageDefinition oldResponse = response;
        response = newResponse;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RosPackage.SERVICE_SPEC__RESPONSE, oldResponse, newResponse);
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
    public void setResponse(MessageDefinition newResponse) {
        if (newResponse != response) {
            NotificationChain msgs = null;
            if (response != null)
                msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RosPackage.SERVICE_SPEC__RESPONSE, null, msgs);
            if (newResponse != null)
                msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RosPackage.SERVICE_SPEC__RESPONSE, null, msgs);
            msgs = basicSetResponse(newResponse, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.SERVICE_SPEC__RESPONSE, newResponse, newResponse));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.SERVICE_SPEC__REQUEST:
                return basicSetRequest(null, msgs);
            case RosPackage.SERVICE_SPEC__RESPONSE:
                return basicSetResponse(null, msgs);
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
            case RosPackage.SERVICE_SPEC__REQUEST:
                return getRequest();
            case RosPackage.SERVICE_SPEC__RESPONSE:
                return getResponse();
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
            case RosPackage.SERVICE_SPEC__REQUEST:
                setRequest((MessageDefinition)newValue);
                return;
            case RosPackage.SERVICE_SPEC__RESPONSE:
                setResponse((MessageDefinition)newValue);
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
            case RosPackage.SERVICE_SPEC__REQUEST:
                setRequest((MessageDefinition)null);
                return;
            case RosPackage.SERVICE_SPEC__RESPONSE:
                setResponse((MessageDefinition)null);
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
            case RosPackage.SERVICE_SPEC__REQUEST:
                return request != null;
            case RosPackage.SERVICE_SPEC__RESPONSE:
                return response != null;
        }
        return super.eIsSet(featureID);
    }

} //ServiceSpecImpl
