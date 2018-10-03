/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RemapSrvServ;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.Namespace;
import ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remap Srv Serv</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RemapSrvServImpl#getSrvRef <em>Srv Ref</em>}</li>
 *   <li>{@link componentInterface.impl.RemapSrvServImpl#getRemapName <em>Remap Name</em>}</li>
 *   <li>{@link componentInterface.impl.RemapSrvServImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemapSrvServImpl extends MinimalEObjectImpl.Container implements RemapSrvServ {
	/**
	 * The cached value of the '{@link #getSrvRef() <em>Srv Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrvRef()
	 * @generated
	 * @ordered
	 */
	protected ServiceServer srvRef;

	/**
	 * The default value of the '{@link #getRemapName() <em>Remap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapName()
	 * @generated
	 * @ordered
	 */
	protected static final String REMAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemapName() <em>Remap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapName()
	 * @generated
	 * @ordered
	 */
	protected String remapName = REMAP_NAME_EDEFAULT;

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
	protected RemapSrvServImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.REMAP_SRV_SERV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer getSrvRef() {
		if (srvRef != null && srvRef.eIsProxy()) {
			InternalEObject oldSrvRef = (InternalEObject)srvRef;
			srvRef = (ServiceServer)eResolveProxy(oldSrvRef);
			if (srvRef != oldSrvRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.REMAP_SRV_SERV__SRV_REF, oldSrvRef, srvRef));
			}
		}
		return srvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer basicGetSrvRef() {
		return srvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrvRef(ServiceServer newSrvRef) {
		ServiceServer oldSrvRef = srvRef;
		srvRef = newSrvRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.REMAP_SRV_SERV__SRV_REF, oldSrvRef, srvRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRemapName() {
		if (getNameSpace().getParts() != null) {
			return String.format("%s/%s", getNameSpace().getParts().get(0), getSrvRef().getName());	
		}else {
			return getSrvRef().getName();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemapName(String newRemapName) {
		String oldRemapName = remapName;
		remapName = newRemapName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.REMAP_SRV_SERV__REMAP_NAME, oldRemapName, remapName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.REMAP_SRV_SERV__NAME_SPACE, oldNameSpace, nameSpace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.REMAP_SRV_SERV__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.REMAP_SRV_SERV__SRV_REF:
				if (resolve) return getSrvRef();
				return basicGetSrvRef();
			case ComponentInterfacePackage.REMAP_SRV_SERV__REMAP_NAME:
				return getRemapName();
			case ComponentInterfacePackage.REMAP_SRV_SERV__NAME_SPACE:
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
			case ComponentInterfacePackage.REMAP_SRV_SERV__SRV_REF:
				setSrvRef((ServiceServer)newValue);
				return;
			case ComponentInterfacePackage.REMAP_SRV_SERV__REMAP_NAME:
				setRemapName((String)newValue);
				return;
			case ComponentInterfacePackage.REMAP_SRV_SERV__NAME_SPACE:
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
			case ComponentInterfacePackage.REMAP_SRV_SERV__SRV_REF:
				setSrvRef((ServiceServer)null);
				return;
			case ComponentInterfacePackage.REMAP_SRV_SERV__REMAP_NAME:
				setRemapName(REMAP_NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.REMAP_SRV_SERV__NAME_SPACE:
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
			case ComponentInterfacePackage.REMAP_SRV_SERV__SRV_REF:
				return srvRef != null;
			case ComponentInterfacePackage.REMAP_SRV_SERV__REMAP_NAME:
				return REMAP_NAME_EDEFAULT == null ? remapName != null : !REMAP_NAME_EDEFAULT.equals(remapName);
			case ComponentInterfacePackage.REMAP_SRV_SERV__NAME_SPACE:
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
		result.append(" (RemapName: ");
		result.append(remapName);
		result.append(')');
		return result.toString();
	}

} //RemapSrvServImpl
