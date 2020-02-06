/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosServiceServer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Service Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosServiceServerImpl#getSrvserver <em>Srvserver</em>}</li>
 *   <li>{@link componentInterface.impl.RosServiceServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosServiceServerImpl#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosServiceServerImpl extends MinimalEObjectImpl.Container implements RosServiceServer {
	/**
	 * The cached value of the '{@link #getSrvserver() <em>Srvserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvserver()
	 * @generated
	 * @ordered
	 */
	protected ServiceServer srvserver;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated NOT
	 * @ordered
	 */
	protected static String NAME_EDEFAULT = null;
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
	protected static String NS_EDEFAULT = "";
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
	 * @generated NOT
	 */
	public RosServiceServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_SERVICE_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceServer getSrvserver() {
		if (srvserver != null && srvserver.eIsProxy()) {
			InternalEObject oldSrvserver = (InternalEObject)srvserver;
			srvserver = (ServiceServer)eResolveProxy(oldSrvserver);
			if (srvserver != oldSrvserver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_SERVICE_SERVER__SRVSERVER, oldSrvserver, srvserver));
			}
		}
		return srvserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer basicGetSrvserver() {
		return srvserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrvserver(ServiceServer newSrvserver) {
		ServiceServer oldSrvserver = srvserver;
		srvserver = newSrvserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_SERVER__SRVSERVER, oldSrvserver, srvserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		/**if (name!=null) {
			if (name.length()>0) {
				return name;
			}if (ns != null && srvserver != null) {
				String composed_name = String.format("/%s/%s", ns.replaceFirst("/",""), srvserver.getName().replaceFirst("/",""));	
				return composed_name.replaceFirst("//","/");
			}else if (srvserver != null) {
				return String.format("/%s", srvserver.getName().replaceFirst("/",""));	
			}else {
				return name;
			}
		}else {
			return name;
		}*/
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getComponentNs() {
		ComponentInterface component = (ComponentInterface) srvserver.eContainer();
		String component_ns = component.getNameSpace();
		if (component_ns.length()>0) {
			return component_ns;
		}else {
			return NS_EDEFAULT;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDefaultValues() {
		NS_EDEFAULT = getComponentNs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getNs() {
		/**setDefaultValues();
		if (ns.isEmpty()) {
			ns = NS_EDEFAULT;
			return NS_EDEFAULT;
		}else {
			return ns;
		}*/
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setNs(String newNs) {
		/*setDefaultValues();*/
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_SERVER__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__SRVSERVER:
				if (resolve) return getSrvserver();
				return basicGetSrvserver();
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NAME:
				return getName();
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NS:
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
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__SRVSERVER:
				setSrvserver((ServiceServer)newValue);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NAME:
				setName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NS:
				setNs((String)newValue);
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
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__SRVSERVER:
				setSrvserver((ServiceServer)null);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NS:
				setNs(NS_EDEFAULT);
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
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__SRVSERVER:
				return srvserver != null;
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentInterfacePackage.ROS_SERVICE_SERVER__NS:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ns: ");
		result.append(ns);
		result.append(')');
		return result.toString();
	}

} //RosServiceServerImpl
