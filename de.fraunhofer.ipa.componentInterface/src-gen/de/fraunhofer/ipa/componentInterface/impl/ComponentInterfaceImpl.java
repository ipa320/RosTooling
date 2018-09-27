/**
 */
package de.fraunhofer.ipa.componentInterface.impl;

import de.fraunhofer.ipa.componentInterface.ComponentInterface;
import de.fraunhofer.ipa.componentInterface.ComponentInterfacePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl#getRosTopicPublisher <em>Ros Topic Publisher</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl#getRosTopicSubscriber <em>Ros Topic Subscriber</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl#getRosServiceServer <em>Ros Service Server</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl#getRosServiceClient <em>Ros Service Client</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.componentInterface.impl.ComponentInterfaceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceImpl extends MinimalEObjectImpl.Container implements ComponentInterface {
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
	public EList<Publisher> getRosTopicPublisher() {
		if (rosTopicPublisher == null) {
			rosTopicPublisher = new EObjectResolvingEList<Publisher>(Publisher.class, this,
					ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_PUBLISHER);
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
					ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER);
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
					ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER);
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
					ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT);
		}
		return rosServiceClient;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.COMPONENT_INTERFACE__NAME,
					oldName, name));
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
		case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
			return getName();
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
			getRosTopicPublisher().addAll((Collection<? extends Publisher>) newValue);
			return;
		case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_TOPIC_SUBSCRIBER:
			getRosTopicSubscriber().clear();
			getRosTopicSubscriber().addAll((Collection<? extends Subscriber>) newValue);
			return;
		case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_SERVER:
			getRosServiceServer().clear();
			getRosServiceServer().addAll((Collection<? extends ServiceServer>) newValue);
			return;
		case ComponentInterfacePackage.COMPONENT_INTERFACE__ROS_SERVICE_CLIENT:
			getRosServiceClient().clear();
			getRosServiceClient().addAll((Collection<? extends ServiceClient>) newValue);
			return;
		case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
			setName((String) newValue);
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
		case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
			setName(NAME_EDEFAULT);
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
		case ComponentInterfacePackage.COMPONENT_INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentInterfaceImpl
