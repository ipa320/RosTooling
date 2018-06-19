/**
 */
package ros.impl;

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

import ros.ActionDefinition;
import ros.Artifact;
import ros.MessageDefinition;
import ros.RosPackage;
import ros.ServiceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getService <em>Service</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements ros.Package {
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
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinition> message;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifact;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDefinition> service;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDefinition> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinition> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<MessageDefinition>(MessageDefinition.class, this, RosPackage.PACKAGE__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, RosPackage.PACKAGE__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDefinition> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<ServiceDefinition>(ServiceDefinition.class, this, RosPackage.PACKAGE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDefinition> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<ActionDefinition>(ActionDefinition.class, this, RosPackage.PACKAGE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosPackage.PACKAGE__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
			case RosPackage.PACKAGE__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
			case RosPackage.PACKAGE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case RosPackage.PACKAGE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case RosPackage.PACKAGE__NAME:
				return getName();
			case RosPackage.PACKAGE__MESSAGE:
				return getMessage();
			case RosPackage.PACKAGE__ARTIFACT:
				return getArtifact();
			case RosPackage.PACKAGE__SERVICE:
				return getService();
			case RosPackage.PACKAGE__ACTION:
				return getAction();
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
			case RosPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case RosPackage.PACKAGE__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends MessageDefinition>)newValue);
				return;
			case RosPackage.PACKAGE__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends Artifact>)newValue);
				return;
			case RosPackage.PACKAGE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends ServiceDefinition>)newValue);
				return;
			case RosPackage.PACKAGE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionDefinition>)newValue);
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
			case RosPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.PACKAGE__MESSAGE:
				getMessage().clear();
				return;
			case RosPackage.PACKAGE__ARTIFACT:
				getArtifact().clear();
				return;
			case RosPackage.PACKAGE__SERVICE:
				getService().clear();
				return;
			case RosPackage.PACKAGE__ACTION:
				getAction().clear();
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
			case RosPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.PACKAGE__MESSAGE:
				return message != null && !message.isEmpty();
			case RosPackage.PACKAGE__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
			case RosPackage.PACKAGE__SERVICE:
				return service != null && !service.isEmpty();
			case RosPackage.PACKAGE__ACTION:
				return action != null && !action.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PackageImpl
