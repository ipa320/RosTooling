/**
 */
package ros1.impl;

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

import ros1.ActionClient;
import ros1.ActionServer;
import ros1.Node;
import ros1.Parameter;
import ros1.Publisher;
import ros1.Ros1Package;
import ros1.ServiceClient;
import ros1.ServiceServer;
import ros1.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros1.impl.NodeImpl#getServiceserver <em>Serviceserver</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getServiceclient <em>Serviceclient</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getActionserver <em>Actionserver</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getActionclient <em>Actionclient</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ros1.impl.NodeImpl#getParameter <em>Parameter</em>}</li>
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
		return Ros1Package.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceServer> getServiceserver() {
		if (serviceserver == null) {
			serviceserver = new EObjectContainmentEList<ServiceServer>(ServiceServer.class, this, Ros1Package.NODE__SERVICESERVER);
		}
		return serviceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublisher() {
		if (publisher == null) {
			publisher = new EObjectContainmentEList<Publisher>(Publisher.class, this, Ros1Package.NODE__PUBLISHER);
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscriber> getSubscriber() {
		if (subscriber == null) {
			subscriber = new EObjectContainmentEList<Subscriber>(Subscriber.class, this, Ros1Package.NODE__SUBSCRIBER);
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClient> getServiceclient() {
		if (serviceclient == null) {
			serviceclient = new EObjectContainmentEList<ServiceClient>(ServiceClient.class, this, Ros1Package.NODE__SERVICECLIENT);
		}
		return serviceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionServer> getActionserver() {
		if (actionserver == null) {
			actionserver = new EObjectContainmentEList<ActionServer>(ActionServer.class, this, Ros1Package.NODE__ACTIONSERVER);
		}
		return actionserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClient> getActionclient() {
		if (actionclient == null) {
			actionclient = new EObjectContainmentEList<ActionClient>(ActionClient.class, this, Ros1Package.NODE__ACTIONCLIENT);
		}
		return actionclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ros1Package.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, Ros1Package.NODE__PARAMETER);
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
			case Ros1Package.NODE__SERVICESERVER:
				return ((InternalEList<?>)getServiceserver()).basicRemove(otherEnd, msgs);
			case Ros1Package.NODE__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case Ros1Package.NODE__SUBSCRIBER:
				return ((InternalEList<?>)getSubscriber()).basicRemove(otherEnd, msgs);
			case Ros1Package.NODE__SERVICECLIENT:
				return ((InternalEList<?>)getServiceclient()).basicRemove(otherEnd, msgs);
			case Ros1Package.NODE__ACTIONSERVER:
				return ((InternalEList<?>)getActionserver()).basicRemove(otherEnd, msgs);
			case Ros1Package.NODE__ACTIONCLIENT:
				return ((InternalEList<?>)getActionclient()).basicRemove(otherEnd, msgs);
			case Ros1Package.NODE__PARAMETER:
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
			case Ros1Package.NODE__SERVICESERVER:
				return getServiceserver();
			case Ros1Package.NODE__PUBLISHER:
				return getPublisher();
			case Ros1Package.NODE__SUBSCRIBER:
				return getSubscriber();
			case Ros1Package.NODE__SERVICECLIENT:
				return getServiceclient();
			case Ros1Package.NODE__ACTIONSERVER:
				return getActionserver();
			case Ros1Package.NODE__ACTIONCLIENT:
				return getActionclient();
			case Ros1Package.NODE__NAME:
				return getName();
			case Ros1Package.NODE__PARAMETER:
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
			case Ros1Package.NODE__SERVICESERVER:
				getServiceserver().clear();
				getServiceserver().addAll((Collection<? extends ServiceServer>)newValue);
				return;
			case Ros1Package.NODE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends Publisher>)newValue);
				return;
			case Ros1Package.NODE__SUBSCRIBER:
				getSubscriber().clear();
				getSubscriber().addAll((Collection<? extends Subscriber>)newValue);
				return;
			case Ros1Package.NODE__SERVICECLIENT:
				getServiceclient().clear();
				getServiceclient().addAll((Collection<? extends ServiceClient>)newValue);
				return;
			case Ros1Package.NODE__ACTIONSERVER:
				getActionserver().clear();
				getActionserver().addAll((Collection<? extends ActionServer>)newValue);
				return;
			case Ros1Package.NODE__ACTIONCLIENT:
				getActionclient().clear();
				getActionclient().addAll((Collection<? extends ActionClient>)newValue);
				return;
			case Ros1Package.NODE__NAME:
				setName((String)newValue);
				return;
			case Ros1Package.NODE__PARAMETER:
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
			case Ros1Package.NODE__SERVICESERVER:
				getServiceserver().clear();
				return;
			case Ros1Package.NODE__PUBLISHER:
				getPublisher().clear();
				return;
			case Ros1Package.NODE__SUBSCRIBER:
				getSubscriber().clear();
				return;
			case Ros1Package.NODE__SERVICECLIENT:
				getServiceclient().clear();
				return;
			case Ros1Package.NODE__ACTIONSERVER:
				getActionserver().clear();
				return;
			case Ros1Package.NODE__ACTIONCLIENT:
				getActionclient().clear();
				return;
			case Ros1Package.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ros1Package.NODE__PARAMETER:
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
			case Ros1Package.NODE__SERVICESERVER:
				return serviceserver != null && !serviceserver.isEmpty();
			case Ros1Package.NODE__PUBLISHER:
				return publisher != null && !publisher.isEmpty();
			case Ros1Package.NODE__SUBSCRIBER:
				return subscriber != null && !subscriber.isEmpty();
			case Ros1Package.NODE__SERVICECLIENT:
				return serviceclient != null && !serviceclient.isEmpty();
			case Ros1Package.NODE__ACTIONSERVER:
				return actionserver != null && !actionserver.isEmpty();
			case Ros1Package.NODE__ACTIONCLIENT:
				return actionclient != null && !actionclient.isEmpty();
			case Ros1Package.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ros1Package.NODE__PARAMETER:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
