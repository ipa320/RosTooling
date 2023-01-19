/**
 */
package rossystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rossystem.ActionConnection;
import rossystem.Connections;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.ConnectionsImpl#getRosTopicConnections <em>Ros Topic Connections</em>}</li>
 *   <li>{@link rossystem.impl.ConnectionsImpl#getRosServiceConnections <em>Ros Service Connections</em>}</li>
 *   <li>{@link rossystem.impl.ConnectionsImpl#getRosActionConnections <em>Ros Action Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionsImpl extends MinimalEObjectImpl.Container implements Connections {
	/**
	 * The cached value of the '{@link #getRosTopicConnections() <em>Ros Topic Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosTopicConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<TopicConnection> rosTopicConnections;

	/**
	 * The cached value of the '{@link #getRosServiceConnections() <em>Ros Service Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosServiceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConnection> rosServiceConnections;

	/**
	 * The cached value of the '{@link #getRosActionConnections() <em>Ros Action Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosActionConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionConnection> rosActionConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.CONNECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TopicConnection> getRosTopicConnections() {
		if (rosTopicConnections == null) {
			rosTopicConnections = new EObjectContainmentEList<TopicConnection>(TopicConnection.class, this, RossystemPackage.CONNECTIONS__ROS_TOPIC_CONNECTIONS);
		}
		return rosTopicConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceConnection> getRosServiceConnections() {
		if (rosServiceConnections == null) {
			rosServiceConnections = new EObjectContainmentEList<ServiceConnection>(ServiceConnection.class, this, RossystemPackage.CONNECTIONS__ROS_SERVICE_CONNECTIONS);
		}
		return rosServiceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionConnection> getRosActionConnections() {
		if (rosActionConnections == null) {
			rosActionConnections = new EObjectContainmentEList<ActionConnection>(ActionConnection.class, this, RossystemPackage.CONNECTIONS__ROS_ACTION_CONNECTIONS);
		}
		return rosActionConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RossystemPackage.CONNECTIONS__ROS_TOPIC_CONNECTIONS:
				return ((InternalEList<?>)getRosTopicConnections()).basicRemove(otherEnd, msgs);
			case RossystemPackage.CONNECTIONS__ROS_SERVICE_CONNECTIONS:
				return ((InternalEList<?>)getRosServiceConnections()).basicRemove(otherEnd, msgs);
			case RossystemPackage.CONNECTIONS__ROS_ACTION_CONNECTIONS:
				return ((InternalEList<?>)getRosActionConnections()).basicRemove(otherEnd, msgs);
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
			case RossystemPackage.CONNECTIONS__ROS_TOPIC_CONNECTIONS:
				return getRosTopicConnections();
			case RossystemPackage.CONNECTIONS__ROS_SERVICE_CONNECTIONS:
				return getRosServiceConnections();
			case RossystemPackage.CONNECTIONS__ROS_ACTION_CONNECTIONS:
				return getRosActionConnections();
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
			case RossystemPackage.CONNECTIONS__ROS_TOPIC_CONNECTIONS:
				getRosTopicConnections().clear();
				getRosTopicConnections().addAll((Collection<? extends TopicConnection>)newValue);
				return;
			case RossystemPackage.CONNECTIONS__ROS_SERVICE_CONNECTIONS:
				getRosServiceConnections().clear();
				getRosServiceConnections().addAll((Collection<? extends ServiceConnection>)newValue);
				return;
			case RossystemPackage.CONNECTIONS__ROS_ACTION_CONNECTIONS:
				getRosActionConnections().clear();
				getRosActionConnections().addAll((Collection<? extends ActionConnection>)newValue);
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
			case RossystemPackage.CONNECTIONS__ROS_TOPIC_CONNECTIONS:
				getRosTopicConnections().clear();
				return;
			case RossystemPackage.CONNECTIONS__ROS_SERVICE_CONNECTIONS:
				getRosServiceConnections().clear();
				return;
			case RossystemPackage.CONNECTIONS__ROS_ACTION_CONNECTIONS:
				getRosActionConnections().clear();
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
			case RossystemPackage.CONNECTIONS__ROS_TOPIC_CONNECTIONS:
				return rosTopicConnections != null && !rosTopicConnections.isEmpty();
			case RossystemPackage.CONNECTIONS__ROS_SERVICE_CONNECTIONS:
				return rosServiceConnections != null && !rosServiceConnections.isEmpty();
			case RossystemPackage.CONNECTIONS__ROS_ACTION_CONNECTIONS:
				return rosActionConnections != null && !rosActionConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionsImpl
