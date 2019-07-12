/**
 */
package rossystem.impl;

import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link rossystem.impl.ServiceConnectionImpl#getServiceName <em>Service Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceConnectionImpl extends MinimalEObjectImpl.Container implements ServiceConnection {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RosServiceServer> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected RosServiceClient to;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConnectionImpl() {
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
	public EList<RosServiceServer> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<RosServiceServer>(RosServiceServer.class, this, RossystemPackage.SERVICE_CONNECTION__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosServiceClient getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (RosServiceClient)eResolveProxy(oldTo);
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
	public RosServiceClient basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(RosServiceClient newTo) {
		RosServiceClient oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.SERVICE_CONNECTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.SERVICE_CONNECTION__SERVICE_NAME, oldServiceName, serviceName));
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
				return getFrom();
			case RossystemPackage.SERVICE_CONNECTION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case RossystemPackage.SERVICE_CONNECTION__SERVICE_NAME:
				return getServiceName();
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
			case RossystemPackage.SERVICE_CONNECTION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends RosServiceServer>)newValue);
				return;
			case RossystemPackage.SERVICE_CONNECTION__TO:
				setTo((RosServiceClient)newValue);
				return;
			case RossystemPackage.SERVICE_CONNECTION__SERVICE_NAME:
				setServiceName((String)newValue);
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
				getFrom().clear();
				return;
			case RossystemPackage.SERVICE_CONNECTION__TO:
				setTo((RosServiceClient)null);
				return;
			case RossystemPackage.SERVICE_CONNECTION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
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
				return from != null && !from.isEmpty();
			case RossystemPackage.SERVICE_CONNECTION__TO:
				return to != null;
			case RossystemPackage.SERVICE_CONNECTION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
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

} //ServiceConnectionImpl
