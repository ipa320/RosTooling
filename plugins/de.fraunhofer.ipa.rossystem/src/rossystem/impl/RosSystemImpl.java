/**
 */
package rossystem.impl;

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

import ros.Parameter;
import rossystem.Connections;
import rossystem.RosNode;
import rossystem.RosSystem;
import rossystem.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.RosSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getRosnode <em>Rosnode</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link rossystem.impl.RosSystemImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosSystemImpl extends MinimalEObjectImpl.Container implements RosSystem {
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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getRosnode() <em>Rosnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosnode()
	 * @generated
	 * @ordered
	 */
	protected EList<RosNode> rosnode;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> connections;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<rossystem.Process> processes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.ROS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, RossystemPackage.ROS_SYSTEM__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosNode> getRosnode() {
		if (rosnode == null) {
			rosnode = new EObjectContainmentEList<RosNode>(RosNode.class, this, RossystemPackage.ROS_SYSTEM__ROSNODE);
		}
		return rosnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connections> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connections>(Connections.class, this, RossystemPackage.ROS_SYSTEM__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<rossystem.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<rossystem.Process>(rossystem.Process.class, this, RossystemPackage.ROS_SYSTEM__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RossystemPackage.ROS_SYSTEM__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_SYSTEM__ROSNODE:
				return ((InternalEList<?>)getRosnode()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_SYSTEM__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_SYSTEM__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
			case RossystemPackage.ROS_SYSTEM__NAME:
				return getName();
			case RossystemPackage.ROS_SYSTEM__PARAMETER:
				return getParameter();
			case RossystemPackage.ROS_SYSTEM__ROSNODE:
				return getRosnode();
			case RossystemPackage.ROS_SYSTEM__CONNECTIONS:
				return getConnections();
			case RossystemPackage.ROS_SYSTEM__PROCESSES:
				return getProcesses();
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
			case RossystemPackage.ROS_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__ROSNODE:
				getRosnode().clear();
				getRosnode().addAll((Collection<? extends RosNode>)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connections>)newValue);
				return;
			case RossystemPackage.ROS_SYSTEM__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends rossystem.Process>)newValue);
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
			case RossystemPackage.ROS_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RossystemPackage.ROS_SYSTEM__PARAMETER:
				getParameter().clear();
				return;
			case RossystemPackage.ROS_SYSTEM__ROSNODE:
				getRosnode().clear();
				return;
			case RossystemPackage.ROS_SYSTEM__CONNECTIONS:
				getConnections().clear();
				return;
			case RossystemPackage.ROS_SYSTEM__PROCESSES:
				getProcesses().clear();
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
			case RossystemPackage.ROS_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RossystemPackage.ROS_SYSTEM__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case RossystemPackage.ROS_SYSTEM__ROSNODE:
				return rosnode != null && !rosnode.isEmpty();
			case RossystemPackage.ROS_SYSTEM__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case RossystemPackage.ROS_SYSTEM__PROCESSES:
				return processes != null && !processes.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RosSystemImpl
