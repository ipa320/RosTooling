/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RosServiceClient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ros.ServiceClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Service Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosServiceClientImpl#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.impl.RosServiceClientImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosServiceClientImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosServiceClientImpl extends MinimalEObjectImpl.Container implements RosServiceClient {
	/**
	 * The cached value of the '{@link #getSrvRef() <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvRef()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient srvRef;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected String nameSpace = NAME_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosServiceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_SERVICE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient getSrvRef() {
		if (srvRef != null && srvRef.eIsProxy()) {
			InternalEObject oldSrvRef = (InternalEObject)srvRef;
			srvRef = (ServiceClient)eResolveProxy(oldSrvRef);
			if (srvRef != oldSrvRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRV_REF, oldSrvRef, srvRef));
			}
		}
		return srvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient basicGetSrvRef() {
		return srvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvRef(ServiceClient newSrvRef) {
		ServiceClient oldSrvRef = srvRef;
		srvRef = newSrvRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRV_REF, oldSrvRef, srvRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getServiceName() {
		if (serviceName!=null) {
			if (serviceName.length()>0) {
				return serviceName;
			}if (nameSpace != null && srvRef != null) {
				return String.format("/%s/%s", nameSpace.replaceFirst("/",""), srvRef.getName().replaceFirst("/",""));	
			}else if (srvRef != null) {
				return String.format("/%s", srvRef.getName().replaceFirst("/",""));	
			}else {
				return serviceName;
			}
		}else {
			return serviceName;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_CLIENT__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(String newNameSpace) {
		String oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRV_REF:
				if (resolve) return getSrvRef();
				return basicGetSrvRef();
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SERVICE_NAME:
				return getServiceName();
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME_SPACE:
				return getNameSpace();
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
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRV_REF:
				setSrvRef((ServiceClient)newValue);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME_SPACE:
				setNameSpace((String)newValue);
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
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRV_REF:
				setSrvRef((ServiceClient)null);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
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
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SRV_REF:
				return srvRef != null;
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
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
		result.append(" (ServiceName: ");
		result.append(serviceName);
		result.append(", NameSpace: ");
		result.append(nameSpace);
		result.append(')');
		return result.toString();
	}

} //RosServiceClientImpl
