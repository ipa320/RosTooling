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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ros.ActionClient;
import ros.ActionServer;
import ros.Node;
import ros.Parameter;
import ros.Publisher;
import ros.RosPackage;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.NodeImpl#getServiceserver <em>Serviceserver</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getServiceclient <em>Serviceclient</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getActionserver <em>Actionserver</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getActionclient <em>Actionclient</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ros.impl.NodeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
    /**
     * The cached value of the '{@link #getServiceserver() <em>Serviceserver</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceserver()
     * @generated
     * @ordered
     */
    protected EList<ServiceServer> serviceserver;

    /**
     * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublisher()
     * @generated
     * @ordered
     */
    protected EList<Publisher> publisher;

    /**
     * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubscriber()
     * @generated
     * @ordered
     */
    protected EList<Subscriber> subscriber;

    /**
     * The cached value of the '{@link #getServiceclient() <em>Serviceclient</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getServiceclient()
     * @generated
     * @ordered
     */
    protected EList<ServiceClient> serviceclient;

    /**
     * The cached value of the '{@link #getActionserver() <em>Actionserver</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionserver()
     * @generated
     * @ordered
     */
    protected EList<ActionServer> actionserver;

    /**
     * The cached value of the '{@link #getActionclient() <em>Actionclient</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionclient()
     * @generated
     * @ordered
     */
    protected EList<ActionClient> actionclient;

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
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected EList<Parameter> parameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ServiceServer> getServiceserver() {
        if (serviceserver == null) {
            serviceserver = new EObjectContainmentEList<ServiceServer>(ServiceServer.class, this, RosPackage.NODE__SERVICESERVER);
        }
        return serviceserver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Publisher> getPublisher() {
        if (publisher == null) {
            publisher = new EObjectContainmentEList<Publisher>(Publisher.class, this, RosPackage.NODE__PUBLISHER);
        }
        return publisher;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Subscriber> getSubscriber() {
        if (subscriber == null) {
            subscriber = new EObjectContainmentEList<Subscriber>(Subscriber.class, this, RosPackage.NODE__SUBSCRIBER);
        }
        return subscriber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ServiceClient> getServiceclient() {
        if (serviceclient == null) {
            serviceclient = new EObjectContainmentEList<ServiceClient>(ServiceClient.class, this, RosPackage.NODE__SERVICECLIENT);
        }
        return serviceclient;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ActionServer> getActionserver() {
        if (actionserver == null) {
            actionserver = new EObjectContainmentEList<ActionServer>(ActionServer.class, this, RosPackage.NODE__ACTIONSERVER);
        }
        return actionserver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ActionClient> getActionclient() {
        if (actionclient == null) {
            actionclient = new EObjectContainmentEList<ActionClient>(ActionClient.class, this, RosPackage.NODE__ACTIONCLIENT);
        }
        return actionclient;
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
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.NODE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, RosPackage.NODE__PARAMETER);
        }
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.NODE__SERVICESERVER:
                return ((InternalEList<?>)getServiceserver()).basicRemove(otherEnd, msgs);
            case RosPackage.NODE__PUBLISHER:
                return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
            case RosPackage.NODE__SUBSCRIBER:
                return ((InternalEList<?>)getSubscriber()).basicRemove(otherEnd, msgs);
            case RosPackage.NODE__SERVICECLIENT:
                return ((InternalEList<?>)getServiceclient()).basicRemove(otherEnd, msgs);
            case RosPackage.NODE__ACTIONSERVER:
                return ((InternalEList<?>)getActionserver()).basicRemove(otherEnd, msgs);
            case RosPackage.NODE__ACTIONCLIENT:
                return ((InternalEList<?>)getActionclient()).basicRemove(otherEnd, msgs);
            case RosPackage.NODE__PARAMETER:
                return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
            case RosPackage.NODE__SERVICESERVER:
                return getServiceserver();
            case RosPackage.NODE__PUBLISHER:
                return getPublisher();
            case RosPackage.NODE__SUBSCRIBER:
                return getSubscriber();
            case RosPackage.NODE__SERVICECLIENT:
                return getServiceclient();
            case RosPackage.NODE__ACTIONSERVER:
                return getActionserver();
            case RosPackage.NODE__ACTIONCLIENT:
                return getActionclient();
            case RosPackage.NODE__NAME:
                return getName();
            case RosPackage.NODE__PARAMETER:
                return getParameter();
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
            case RosPackage.NODE__SERVICESERVER:
                getServiceserver().clear();
                getServiceserver().addAll((Collection<? extends ServiceServer>)newValue);
                return;
            case RosPackage.NODE__PUBLISHER:
                getPublisher().clear();
                getPublisher().addAll((Collection<? extends Publisher>)newValue);
                return;
            case RosPackage.NODE__SUBSCRIBER:
                getSubscriber().clear();
                getSubscriber().addAll((Collection<? extends Subscriber>)newValue);
                return;
            case RosPackage.NODE__SERVICECLIENT:
                getServiceclient().clear();
                getServiceclient().addAll((Collection<? extends ServiceClient>)newValue);
                return;
            case RosPackage.NODE__ACTIONSERVER:
                getActionserver().clear();
                getActionserver().addAll((Collection<? extends ActionServer>)newValue);
                return;
            case RosPackage.NODE__ACTIONCLIENT:
                getActionclient().clear();
                getActionclient().addAll((Collection<? extends ActionClient>)newValue);
                return;
            case RosPackage.NODE__NAME:
                setName((String)newValue);
                return;
            case RosPackage.NODE__PARAMETER:
                getParameter().clear();
                getParameter().addAll((Collection<? extends Parameter>)newValue);
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
            case RosPackage.NODE__SERVICESERVER:
                getServiceserver().clear();
                return;
            case RosPackage.NODE__PUBLISHER:
                getPublisher().clear();
                return;
            case RosPackage.NODE__SUBSCRIBER:
                getSubscriber().clear();
                return;
            case RosPackage.NODE__SERVICECLIENT:
                getServiceclient().clear();
                return;
            case RosPackage.NODE__ACTIONSERVER:
                getActionserver().clear();
                return;
            case RosPackage.NODE__ACTIONCLIENT:
                getActionclient().clear();
                return;
            case RosPackage.NODE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RosPackage.NODE__PARAMETER:
                getParameter().clear();
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
            case RosPackage.NODE__SERVICESERVER:
                return serviceserver != null && !serviceserver.isEmpty();
            case RosPackage.NODE__PUBLISHER:
                return publisher != null && !publisher.isEmpty();
            case RosPackage.NODE__SUBSCRIBER:
                return subscriber != null && !subscriber.isEmpty();
            case RosPackage.NODE__SERVICECLIENT:
                return serviceclient != null && !serviceclient.isEmpty();
            case RosPackage.NODE__ACTIONSERVER:
                return actionserver != null && !actionserver.isEmpty();
            case RosPackage.NODE__ACTIONCLIENT:
                return actionclient != null && !actionclient.isEmpty();
            case RosPackage.NODE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RosPackage.NODE__PARAMETER:
                return parameter != null && !parameter.isEmpty();
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

} //NodeImpl
