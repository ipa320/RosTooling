/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.ServiceClient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.ServiceClientImpl#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.impl.ServiceClientImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link componentInterface.impl.ServiceClientImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceClientImpl extends MinimalEObjectImpl.Container implements ServiceClient {
	/**
	 * The cached value of the '{@link #getSrvRef() <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvRef()
	 * @generated
	 * @ordered
	 */
	protected ros.ServiceClient srvRef;

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
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected Namespace nameSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.SERVICE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros.ServiceClient getSrvRef() {
		if (srvRef != null && srvRef.eIsProxy()) {
			InternalEObject oldSrvRef = (InternalEObject)srvRef;
			srvRef = (ros.ServiceClient)eResolveProxy(oldSrvRef);
			if (srvRef != oldSrvRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.SERVICE_CLIENT__SRV_REF, oldSrvRef, srvRef));
			}
		}
		return srvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros.ServiceClient basicGetSrvRef() {
		return srvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvRef(ros.ServiceClient newSrvRef) {
		ros.ServiceClient oldSrvRef = srvRef;
		srvRef = newSrvRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.SERVICE_CLIENT__SRV_REF, oldSrvRef, srvRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getServiceName() {
		if (serviceName.isEmpty()) {
			if (nameSpace != null) {
				return String.format("%s/%s", nameSpace.getParts().get(0), srvRef.getName());	
			}else if (srvRef != null) {
				return srvRef.getName();
			} else
				return serviceName;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.SERVICE_CLIENT__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNameSpace() {
		if (nameSpace != null && nameSpace.eIsProxy()) {
			InternalEObject oldNameSpace = (InternalEObject)nameSpace;
			nameSpace = (Namespace)eResolveProxy(oldNameSpace);
			if (nameSpace != oldNameSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.SERVICE_CLIENT__NAME_SPACE, oldNameSpace, nameSpace));
			}
		}
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(Namespace newNameSpace) {
		Namespace oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.SERVICE_CLIENT__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.SERVICE_CLIENT__SRV_REF:
				if (resolve) return getSrvRef();
				return basicGetSrvRef();
			case ComponentInterfacePackage.SERVICE_CLIENT__SERVICE_NAME:
				return getServiceName();
			case ComponentInterfacePackage.SERVICE_CLIENT__NAME_SPACE:
				if (resolve) return getNameSpace();
				return basicGetNameSpace();
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
			case ComponentInterfacePackage.SERVICE_CLIENT__SRV_REF:
				setSrvRef((ros.ServiceClient)newValue);
				return;
			case ComponentInterfacePackage.SERVICE_CLIENT__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ComponentInterfacePackage.SERVICE_CLIENT__NAME_SPACE:
				setNameSpace((Namespace)newValue);
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
			case ComponentInterfacePackage.SERVICE_CLIENT__SRV_REF:
				setSrvRef((ros.ServiceClient)null);
				return;
			case ComponentInterfacePackage.SERVICE_CLIENT__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.SERVICE_CLIENT__NAME_SPACE:
				setNameSpace((Namespace)null);
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
			case ComponentInterfacePackage.SERVICE_CLIENT__SRV_REF:
				return srvRef != null;
			case ComponentInterfacePackage.SERVICE_CLIENT__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ComponentInterfacePackage.SERVICE_CLIENT__NAME_SPACE:
				return nameSpace != null;
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
		result.append(')');
		return result.toString();
	}

} //ServiceClientImpl
