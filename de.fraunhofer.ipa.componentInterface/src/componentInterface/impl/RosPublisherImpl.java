/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ros.Publisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosPublisherImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link componentInterface.impl.RosPublisherImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosPublisherImpl#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosPublisherImpl extends MinimalEObjectImpl.Container implements RosPublisher {
	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher;

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
	 * @generated NOT
	 * @ordered
	 */
	protected  String NS_EDEFAULT = null;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (Publisher)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_PUBLISHER__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPublisher(Publisher newPublisher) {
		String component_ns = null;
		String ComponentInterface_toString = eContainer().eContents().toString();
		component_ns=ComponentInterface_toString.substring(ComponentInterface_toString.indexOf("parts: [") + 8, ComponentInterface_toString.indexOf("]"));
		if (component_ns.length()>0) {
			NS_EDEFAULT=component_ns;
		}
		setNs(component_ns);
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PUBLISHER__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (name!=null) {
			if (name.length()>0) {
				return name;
			}if (ns != null && publisher != null) {
				return String.format("/%s/%s", ns.replaceFirst("/",""), publisher.getName().replaceFirst("/",""));	
			}else if (publisher != null) {
				return String.format("/%s", publisher.getName().replaceFirst("/",""));	
			}else {
				return name;
			}
		}else {
			return name;
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PUBLISHER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PUBLISHER__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PUBLISHER__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME:
				return getName();
			case ComponentInterfacePackage.ROS_PUBLISHER__NS:
				return getNs();
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
			case ComponentInterfacePackage.ROS_PUBLISHER__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME:
				setName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__NS:
				setNs((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PUBLISHER__PUBLISHER:
				setPublisher(publisher);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__NS:
				String component_ns = null;
				String ComponentInterface_toString = eContainer().eContents().toString();
				component_ns=ComponentInterface_toString.substring(ComponentInterface_toString.indexOf("parts: [") + 8, ComponentInterface_toString.indexOf("]"));
				if (component_ns.length()>0) {
					NS_EDEFAULT=component_ns;
				}
				setNs(component_ns);
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
			case ComponentInterfacePackage.ROS_PUBLISHER__PUBLISHER:
				return publisher != null;
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentInterfacePackage.ROS_PUBLISHER__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
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

} //RosPublisherImpl
