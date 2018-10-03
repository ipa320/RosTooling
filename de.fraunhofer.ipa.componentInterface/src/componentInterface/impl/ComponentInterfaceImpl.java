/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RemapPub;
import componentInterface.RemapSrvCli;
import componentInterface.RemapSrvServ;
import componentInterface.RemapSub;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ros.impl.NamespacedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRosTopicPublisher <em>Ros Topic Publisher</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRosServiceServer <em>Ros Service Server</em>}</li>
 *   <li>{@link componentInterface.impl.ComponentInterfaceImpl#getRosServiceClient <em>Ros Service Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceImpl extends NamespacedElementImpl implements ComponentInterface {
	/**
	 * The cached value of the '{@link #getRosTopicPublisher() <em>Ros Topic Publisher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosTopicPublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<RemapPub> rosTopicPublisher;

	/**
	 * The cached value of the '{@link #getRosTopicSubscriber() <em>Ros Topic Subscriber</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosTopicSubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<RemapSub> rosTopicSubscriber;

	/**
	 * The cached value of the '{@link #getRosServiceServer() <em>Ros Service Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosServiceServer()
	 * @generated
	 * @ordered
	 */
	protected EList<RemapSrvServ> rosServiceServer;

	/**
	 * The cached value of the '{@link #getRosServiceClient() <em>Ros Service Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosServiceClient()
	 * @generated
	 * @ordered
	 */
	protected EList<RemapSrvCli> rosServiceClient;

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
	public EList<RemapPub> getRosTopicPublisher() {
		if (rosTopicPublisher == null) {
			rosTopicPublisher = new EObjectContainmentEList<RemapPub>(RemapPub.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER);
		}
		return rosTopicPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemapSub> getRosTopicSubscriber() {
		if (rosTopicSubscriber == null) {
			rosTopicSubscriber = new EObjectContainmentEList<RemapSub>(RemapSub.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER);
		}
		return rosTopicSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemapSrvServ> getRosServiceServer() {
		if (rosServiceServer == null) {
			rosServiceServer = new EObjectContainmentEList<RemapSrvServ>(RemapSrvServ.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER);
		}
		return rosServiceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemapSrvCli> getRosServiceClient() {
		if (rosServiceClient == null) {
			rosServiceClient = new EObjectContainmentEList<RemapSrvCli>(RemapSrvCli.class, this, ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT);
		}
		return rosServiceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER:
				return ((InternalEList<?>)getRosTopicPublisher()).basicRemove(otherEnd, msgs);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER:
				return ((InternalEList<?>)getRosTopicSubscriber()).basicRemove(otherEnd, msgs);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER:
				return ((InternalEList<?>)getRosServiceServer()).basicRemove(otherEnd, msgs);
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT:
				return ((InternalEList<?>)getRosServiceClient()).basicRemove(otherEnd, msgs);
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER:
				return getRosTopicPublisher();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER:
				return getRosTopicSubscriber();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER:
				return getRosServiceServer();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT:
				return getRosServiceClient();
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER:
				getRosTopicPublisher().clear();
				getRosTopicPublisher().addAll((Collection<? extends RemapPub>)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER:
				getRosTopicSubscriber().clear();
				getRosTopicSubscriber().addAll((Collection<? extends RemapSub>)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER:
				getRosServiceServer().clear();
				getRosServiceServer().addAll((Collection<? extends RemapSrvServ>)newValue);
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT:
				getRosServiceClient().clear();
				getRosServiceClient().addAll((Collection<? extends RemapSrvCli>)newValue);
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER:
				getRosTopicPublisher().clear();
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER:
				getRosTopicSubscriber().clear();
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER:
				getRosServiceServer().clear();
				return;
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT:
				getRosServiceClient().clear();
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER:
				return rosTopicPublisher != null && !rosTopicPublisher.isEmpty();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER:
				return rosTopicSubscriber != null && !rosTopicSubscriber.isEmpty();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER:
				return rosServiceServer != null && !rosServiceServer.isEmpty();
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT:
				return rosServiceClient != null && !rosServiceClient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInterfaceImpl
