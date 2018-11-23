/**
 */
package rossystem.impl;

import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
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
 *   <li>{@link rossystem.impl.ServiceConnectionImpl#getFromSrv <em>From Srv</em>}</li>
 *   <li>{@link rossystem.impl.ServiceConnectionImpl#getToSrv <em>To Srv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConnectionImpl extends MinimalEObjectImpl.Container implements ServiceConnection {
	/**
	 * The cached value of the '{@link #getFromSrv() <em>From Srv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSrv()
	 * @generated
	 * @ordered
	 */
	protected RosServiceServer fromSrv;

	/**
	 * The cached value of the '{@link #getToSrv() <em>To Srv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSrv()
	 * @generated
	 * @ordered
	 */
	protected RosServiceClient toSrv;

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
	public RosServiceServer getFromSrv() {
		if (fromSrv != null && fromSrv.eIsProxy()) {
			InternalEObject oldFromSrv = (InternalEObject)fromSrv;
			fromSrv = (RosServiceServer)eResolveProxy(oldFromSrv);
			if (fromSrv != oldFromSrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.SERVICE_CONNECTION__FROM_SRV, oldFromSrv, fromSrv));
			}
		}
		return fromSrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosServiceServer basicGetFromSrv() {
		return fromSrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromSrv(RosServiceServer newFromSrv) {
		RosServiceServer oldFromSrv = fromSrv;
		fromSrv = newFromSrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.SERVICE_CONNECTION__FROM_SRV, oldFromSrv, fromSrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosServiceClient getToSrv() {
		if (toSrv != null && toSrv.eIsProxy()) {
			InternalEObject oldToSrv = (InternalEObject)toSrv;
			toSrv = (RosServiceClient)eResolveProxy(oldToSrv);
			if (toSrv != oldToSrv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.SERVICE_CONNECTION__TO_SRV, oldToSrv, toSrv));
			}
		}
		return toSrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosServiceClient basicGetToSrv() {
		return toSrv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSrv(RosServiceClient newToSrv) {
		RosServiceClient oldToSrv = toSrv;
		toSrv = newToSrv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.SERVICE_CONNECTION__TO_SRV, oldToSrv, toSrv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RossystemPackage.SERVICE_CONNECTION__FROM_SRV:
				if (resolve) return getFromSrv();
				return basicGetFromSrv();
			case RossystemPackage.SERVICE_CONNECTION__TO_SRV:
				if (resolve) return getToSrv();
				return basicGetToSrv();
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
			case RossystemPackage.SERVICE_CONNECTION__FROM_SRV:
				setFromSrv((RosServiceServer)newValue);
				return;
			case RossystemPackage.SERVICE_CONNECTION__TO_SRV:
				setToSrv((RosServiceClient)newValue);
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
			case RossystemPackage.SERVICE_CONNECTION__FROM_SRV:
				setFromSrv((RosServiceServer)null);
				return;
			case RossystemPackage.SERVICE_CONNECTION__TO_SRV:
				setToSrv((RosServiceClient)null);
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
			case RossystemPackage.SERVICE_CONNECTION__FROM_SRV:
				return fromSrv != null;
			case RossystemPackage.SERVICE_CONNECTION__TO_SRV:
				return toSrv != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceConnectionImpl
