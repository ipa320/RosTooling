/**
 */
package ros.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.InterfaceType;
import ros.Namespace;
import ros.QualityOfService;
import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.InterfaceTypeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link ros.impl.InterfaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ros.impl.InterfaceTypeImpl#getQos <em>Qos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTypeImpl extends MinimalEObjectImpl.Container implements InterfaceType {
    /**
     * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected Namespace namespace;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getQos() <em>Qos</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQos()
     * @generated
     * @ordered
     */
    protected QualityOfService qos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.INTERFACE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
        Namespace oldNamespace = namespace;
        namespace = newNamespace;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RosPackage.INTERFACE_TYPE__NAMESPACE, oldNamespace, newNamespace);
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
    public void setNamespace(Namespace newNamespace) {
        if (newNamespace != namespace) {
            NotificationChain msgs = null;
            if (namespace != null)
                msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RosPackage.INTERFACE_TYPE__NAMESPACE, null, msgs);
            if (newNamespace != null)
                msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RosPackage.INTERFACE_TYPE__NAMESPACE, null, msgs);
            msgs = basicSetNamespace(newNamespace, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.INTERFACE_TYPE__NAMESPACE, newNamespace, newNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.INTERFACE_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QualityOfService getQos() {
        return qos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQos(QualityOfService newQos, NotificationChain msgs) {
        QualityOfService oldQos = qos;
        qos = newQos;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RosPackage.INTERFACE_TYPE__QOS, oldQos, newQos);
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
    public void setQos(QualityOfService newQos) {
        if (newQos != qos) {
            NotificationChain msgs = null;
            if (qos != null)
                msgs = ((InternalEObject)qos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RosPackage.INTERFACE_TYPE__QOS, null, msgs);
            if (newQos != null)
                msgs = ((InternalEObject)newQos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RosPackage.INTERFACE_TYPE__QOS, null, msgs);
            msgs = basicSetQos(newQos, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.INTERFACE_TYPE__QOS, newQos, newQos));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.INTERFACE_TYPE__NAMESPACE:
                return basicSetNamespace(null, msgs);
            case RosPackage.INTERFACE_TYPE__QOS:
                return basicSetQos(null, msgs);
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
            case RosPackage.INTERFACE_TYPE__NAMESPACE:
                return getNamespace();
            case RosPackage.INTERFACE_TYPE__NAME:
                return getName();
            case RosPackage.INTERFACE_TYPE__QOS:
                return getQos();
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
            case RosPackage.INTERFACE_TYPE__NAMESPACE:
                setNamespace((Namespace)newValue);
                return;
            case RosPackage.INTERFACE_TYPE__NAME:
                setName((String)newValue);
                return;
            case RosPackage.INTERFACE_TYPE__QOS:
                setQos((QualityOfService)newValue);
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
            case RosPackage.INTERFACE_TYPE__NAMESPACE:
                setNamespace((Namespace)null);
                return;
            case RosPackage.INTERFACE_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RosPackage.INTERFACE_TYPE__QOS:
                setQos((QualityOfService)null);
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
            case RosPackage.INTERFACE_TYPE__NAMESPACE:
                return namespace != null;
            case RosPackage.INTERFACE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RosPackage.INTERFACE_TYPE__QOS:
                return qos != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //InterfaceTypeImpl
