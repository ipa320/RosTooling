/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRospublisher <em>Rospublisher</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRossubscriber <em>Rossubscriber</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRosserviceserver <em>Rosserviceserver</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRosserviceclient <em>Rosserviceclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceImpl extends MinimalEObjectImpl.Container implements ComponentInterface {
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
	 * The cached value of the '{@link #getRospublisher() <em>Rospublisher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRospublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<RosPublisher> rospublisher;

	/**
	 * The cached value of the '{@link #getRossubscriber() <em>Rossubscriber</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRossubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<RosSubscriber> rossubscriber;

	/**
	 * The cached value of the '{@link #getRosserviceserver() <em>Rosserviceserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosserviceserver()
	 * @generated
	 * @ordered
	 */
	protected EList<RosServiceServer> rosserviceserver;

	/**
	 * The cached value of the '{@link #getRosserviceclient() <em>Rosserviceclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosserviceclient()
	 * @generated
	 * @ordered
	 */
	protected EList<RosServiceClient> rosserviceclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.COMPONENT_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.COMPONENT_INTERFACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.COMPONENT_INTERFACE__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosPublisher> getRospublisher() {
		if (rospublisher == null) {
			rospublisher = new EObjectContainmentEList<RosPublisher>(RosPublisher.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER);
		}
		return rospublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosSubscriber> getRossubscriber() {
		if (rossubscriber == null) {
			rossubscriber = new EObjectContainmentEList<RosSubscriber>(RosSubscriber.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER);
		}
		return rossubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosServiceServer> getRosserviceserver() {
		if (rosserviceserver == null) {
			rosserviceserver = new EObjectContainmentEList<RosServiceServer>(RosServiceServer.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER);
		}
		return rosserviceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosServiceClient> getRosserviceclient() {
		if (rosserviceclient == null) {
			rosserviceclient = new EObjectContainmentEList<RosServiceClient>(RosServiceClient.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT);
		}
		return rosserviceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER:
				return ((InternalEList<?>)getRospublisher()).basicRemove(otherEnd, msgs);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER:
				return ((InternalEList<?>)getRossubscriber()).basicRemove(otherEnd, msgs);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER:
				return ((InternalEList<?>)getRosserviceserver()).basicRemove(otherEnd, msgs);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT:
				return ((InternalEList<?>)getRosserviceclient()).basicRemove(otherEnd, msgs);
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
				return getName();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME_SPACE:
				return getNameSpace();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER:
				return getRospublisher();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER:
				return getRossubscriber();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER:
				return getRosserviceserver();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT:
				return getRosserviceclient();
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME_SPACE:
				setNameSpace((String)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER:
				getRospublisher().clear();
				getRospublisher().addAll((Collection<? extends RosPublisher>)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER:
				getRossubscriber().clear();
				getRossubscriber().addAll((Collection<? extends RosSubscriber>)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER:
				getRosserviceserver().clear();
				getRosserviceserver().addAll((Collection<? extends RosServiceServer>)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT:
				getRosserviceclient().clear();
				getRosserviceclient().addAll((Collection<? extends RosServiceClient>)newValue);
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME_SPACE:
				setNameSpace(NAME_SPACE_EDEFAULT);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER:
				getRospublisher().clear();
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER:
				getRossubscriber().clear();
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER:
				getRosserviceserver().clear();
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT:
				getRosserviceclient().clear();
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER:
				return rospublisher != null && !rospublisher.isEmpty();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER:
				return rossubscriber != null && !rossubscriber.isEmpty();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER:
				return rosserviceserver != null && !rosserviceserver.isEmpty();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT:
				return rosserviceclient != null && !rosserviceclient.isEmpty();
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
		result.append(", NameSpace: ");
		result.append(nameSpace);
		result.append(')');
		return result.toString();
	}

} //ComponentInterfaceImpl
