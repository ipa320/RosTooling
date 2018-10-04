/**
 */
package rossystem.impl;

import componentInterface.ServiceClient;
import componentInterface.ServiceServer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rossystem.RossystemPackage;
import rossystem.ServiceConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.ServiceConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link rossystem.impl.ServiceConnectionImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConnectionImpl extends MinimalEObjectImpl.Container implements ServiceConnection {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ServiceServer from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.SERVICE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (ServiceServer)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.SERVICE_CONNECTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ServiceServer newFrom) {
		ServiceServer oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.SERVICE_CONNECTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ServiceClient)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.SERVICE_CONNECTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ServiceClient newTo) {
		ServiceClient oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.SERVICE_CONNECTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RossystemPackage.SERVICE_CONNECTION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case RossystemPackage.SERVICE_CONNECTION__TO:
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
			case RossystemPackage.SERVICE_CONNECTION__FROM:
				setFrom((ServiceServer)newValue);
				return;
			case RossystemPackage.SERVICE_CONNECTION__TO:
				setTo((ServiceClient)newValue);
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
			case RossystemPackage.SERVICE_CONNECTION__FROM:
				setFrom((ServiceServer)null);
				return;
			case RossystemPackage.SERVICE_CONNECTION__TO:
				setTo((ServiceClient)null);
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
			case RossystemPackage.SERVICE_CONNECTION__FROM:
				return from != null;
			case RossystemPackage.SERVICE_CONNECTION__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceConnectionImpl
