/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RosSubscriber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosSubscriberImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosSubscriberImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link componentInterface.impl.RosSubscriberImpl#getSubscriber <em>Subscriber</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosSubscriberImpl extends MinimalEObjectImpl.Container implements RosSubscriber {
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
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected String ns = NS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Subscriber subscriber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosSubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_SUBSCRIBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SUBSCRIBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNs(String newNs) {
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SUBSCRIBER__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber getSubscriber() {
		if (subscriber != null && subscriber.eIsProxy()) {
			InternalEObject oldSubscriber = (InternalEObject)subscriber;
			subscriber = (Subscriber)eResolveProxy(oldSubscriber);
			if (subscriber != oldSubscriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_SUBSCRIBER__SUBSCRIBER, oldSubscriber, subscriber));
			}
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber basicGetSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriber(Subscriber newSubscriber) {
		Subscriber oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SUBSCRIBER__SUBSCRIBER, oldSubscriber, subscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NAME:
				return getName();
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NS:
				return getNs();
			case ComponentInterfacePackage.ROS_SUBSCRIBER__SUBSCRIBER:
				if (resolve) return getSubscriber();
				return basicGetSubscriber();
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
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NAME:
				setName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NS:
				setNs((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_SUBSCRIBER__SUBSCRIBER:
				setSubscriber((Subscriber)newValue);
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
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NS:
				setNs(NS_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_SUBSCRIBER__SUBSCRIBER:
				setSubscriber((Subscriber)null);
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
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentInterfacePackage.ROS_SUBSCRIBER__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
			case ComponentInterfacePackage.ROS_SUBSCRIBER__SUBSCRIBER:
				return subscriber != null;
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
		result.append(", ns: ");
		result.append(ns);
		result.append(')');
		return result.toString();
	}

} //RosSubscriberImpl
