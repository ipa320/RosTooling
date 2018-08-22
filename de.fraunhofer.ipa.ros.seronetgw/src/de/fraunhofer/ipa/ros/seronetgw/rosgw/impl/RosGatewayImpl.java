/**
 */
package de.fraunhofer.ipa.ros.seronetgw.rosgw.impl;

import de.fraunhofer.ipa.ros.seronetgw.rosgw.RosGateway;
import de.fraunhofer.ipa.ros.seronetgw.rosgw.RosgwPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl#getRosTopicPublisher <em>Ros Topic Publisher</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl#getRosServiceServer <em>Ros Service Server</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.ros.seronetgw.rosgw.impl.RosGatewayImpl#getRosServiceClient <em>Ros Service Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosGatewayImpl extends MinimalEObjectImpl.Container implements RosGateway {
	/**
	 * The cached value of the '{@link #getRosTopicPublisher() <em>Ros Topic Publisher</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosTopicPublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<Publisher> rosTopicPublisher;

	/**
	 * The cached value of the '{@link #getRosTopicSubscriber() <em>Ros Topic Subscriber</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosTopicSubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscriber> rosTopicSubscriber;

	/**
	 * The cached value of the '{@link #getRosServiceServer() <em>Ros Service Server</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosServiceServer()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceServer> rosServiceServer;

	/**
	 * The cached value of the '{@link #getRosServiceClient() <em>Ros Service Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosServiceClient()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClient> rosServiceClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosgwPackage.Literals.ROS_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getRosTopicPublisher() {
		if (rosTopicPublisher == null) {
			rosTopicPublisher = new EObjectResolvingEList<Publisher>(Publisher.class, this,
					RosgwPackage.ROS_GATEWAY__ROS_TOPIC_PUBLISHER);
		}
		return rosTopicPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscriber> getRosTopicSubscriber() {
		if (rosTopicSubscriber == null) {
			rosTopicSubscriber = new EObjectResolvingEList<Subscriber>(Subscriber.class, this,
					RosgwPackage.ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER);
		}
		return rosTopicSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceServer> getRosServiceServer() {
		if (rosServiceServer == null) {
			rosServiceServer = new EObjectResolvingEList<ServiceServer>(ServiceServer.class, this,
					RosgwPackage.ROS_GATEWAY__ROS_SERVICE_SERVER);
		}
		return rosServiceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClient> getRosServiceClient() {
		if (rosServiceClient == null) {
			rosServiceClient = new EObjectResolvingEList<ServiceClient>(ServiceClient.class, this,
					RosgwPackage.ROS_GATEWAY__ROS_SERVICE_CLIENT);
		}
		return rosServiceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_PUBLISHER:
			return getRosTopicPublisher();
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER:
			return getRosTopicSubscriber();
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_SERVER:
			return getRosServiceServer();
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_CLIENT:
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
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_PUBLISHER:
			getRosTopicPublisher().clear();
			getRosTopicPublisher().addAll((Collection<? extends Publisher>) newValue);
			return;
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER:
			getRosTopicSubscriber().clear();
			getRosTopicSubscriber().addAll((Collection<? extends Subscriber>) newValue);
			return;
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_SERVER:
			getRosServiceServer().clear();
			getRosServiceServer().addAll((Collection<? extends ServiceServer>) newValue);
			return;
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_CLIENT:
			getRosServiceClient().clear();
			getRosServiceClient().addAll((Collection<? extends ServiceClient>) newValue);
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
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_PUBLISHER:
			getRosTopicPublisher().clear();
			return;
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER:
			getRosTopicSubscriber().clear();
			return;
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_SERVER:
			getRosServiceServer().clear();
			return;
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_CLIENT:
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
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_PUBLISHER:
			return rosTopicPublisher != null && !rosTopicPublisher.isEmpty();
		case RosgwPackage.ROS_GATEWAY__ROS_TOPIC_SUBSCRIBER:
			return rosTopicSubscriber != null && !rosTopicSubscriber.isEmpty();
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_SERVER:
			return rosServiceServer != null && !rosServiceServer.isEmpty();
		case RosgwPackage.ROS_GATEWAY__ROS_SERVICE_CLIENT:
			return rosServiceClient != null && !rosServiceClient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RosGatewayImpl
