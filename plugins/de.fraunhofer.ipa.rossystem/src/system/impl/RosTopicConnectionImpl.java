/**
 */
package system.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ros.Publisher;
import ros.Subscriber;

import system.RosTopicConnection;
import system.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.RosTopicConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link system.impl.RosTopicConnectionImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosTopicConnectionImpl extends RosConnectionImpl implements RosTopicConnection {
    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected Publisher from;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected Subscriber to;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RosTopicConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RossystemPackage.Literals.ROS_TOPIC_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Publisher getFrom() {
        if (from != null && from.eIsProxy()) {
            InternalEObject oldFrom = (InternalEObject)from;
            from = (Publisher)eResolveProxy(oldFrom);
            if (from != oldFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.ROS_TOPIC_CONNECTION__FROM, oldFrom, from));
            }
        }
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Publisher basicGetFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFrom(Publisher newFrom) {
        Publisher oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_TOPIC_CONNECTION__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Subscriber getTo() {
        if (to != null && to.eIsProxy()) {
            InternalEObject oldTo = (InternalEObject)to;
            to = (Subscriber)eResolveProxy(oldTo);
            if (to != oldTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.ROS_TOPIC_CONNECTION__TO, oldTo, to));
            }
        }
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Subscriber basicGetTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTo(Subscriber newTo) {
        Subscriber oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_TOPIC_CONNECTION__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RossystemPackage.ROS_TOPIC_CONNECTION__FROM:
                if (resolve) return getFrom();
                return basicGetFrom();
            case RossystemPackage.ROS_TOPIC_CONNECTION__TO:
                if (resolve) return getTo();
                return basicGetTo();
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
            case RossystemPackage.ROS_TOPIC_CONNECTION__FROM:
                setFrom((Publisher)newValue);
                return;
            case RossystemPackage.ROS_TOPIC_CONNECTION__TO:
                setTo((Subscriber)newValue);
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
            case RossystemPackage.ROS_TOPIC_CONNECTION__FROM:
                setFrom((Publisher)null);
                return;
            case RossystemPackage.ROS_TOPIC_CONNECTION__TO:
                setTo((Subscriber)null);
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
            case RossystemPackage.ROS_TOPIC_CONNECTION__FROM:
                return from != null;
            case RossystemPackage.ROS_TOPIC_CONNECTION__TO:
                return to != null;
        }
        return super.eIsSet(featureID);
    }

} //RosTopicConnectionImpl
