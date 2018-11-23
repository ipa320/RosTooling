/**
 */
package rossystem.impl;

import componentInterface.RosPublisher;
import componentInterface.RosSubscriber;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import rossystem.RossystemPackage;
import rossystem.TopicConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.TopicConnectionImpl#getFromTopic <em>From Topic</em>}</li>
 *   <li>{@link rossystem.impl.TopicConnectionImpl#getToTopic <em>To Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicConnectionImpl extends MinimalEObjectImpl.Container implements TopicConnection {
	/**
	 * The cached value of the '{@link #getFromTopic() <em>From Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTopic()
	 * @generated
	 * @ordered
	 */
	protected RosPublisher fromTopic;

	/**
	 * The cached value of the '{@link #getToTopic() <em>To Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTopic()
	 * @generated
	 * @ordered
	 */
	protected RosSubscriber toTopic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.TOPIC_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPublisher getFromTopic() {
		if (fromTopic != null && fromTopic.eIsProxy()) {
			InternalEObject oldFromTopic = (InternalEObject)fromTopic;
			fromTopic = (RosPublisher)eResolveProxy(oldFromTopic);
			if (fromTopic != oldFromTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.TOPIC_CONNECTION__FROM_TOPIC, oldFromTopic, fromTopic));
			}
		}
		return fromTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPublisher basicGetFromTopic() {
		return fromTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTopic(RosPublisher newFromTopic) {
		RosPublisher oldFromTopic = fromTopic;
		fromTopic = newFromTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.TOPIC_CONNECTION__FROM_TOPIC, oldFromTopic, fromTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosSubscriber getToTopic() {
		if (toTopic != null && toTopic.eIsProxy()) {
			InternalEObject oldToTopic = (InternalEObject)toTopic;
			toTopic = (RosSubscriber)eResolveProxy(oldToTopic);
			if (toTopic != oldToTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.TOPIC_CONNECTION__TO_TOPIC, oldToTopic, toTopic));
			}
		}
		return toTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosSubscriber basicGetToTopic() {
		return toTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTopic(RosSubscriber newToTopic) {
		RosSubscriber oldToTopic = toTopic;
		toTopic = newToTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.TOPIC_CONNECTION__TO_TOPIC, oldToTopic, toTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RossystemPackage.TOPIC_CONNECTION__FROM_TOPIC:
				if (resolve) return getFromTopic();
				return basicGetFromTopic();
			case RossystemPackage.TOPIC_CONNECTION__TO_TOPIC:
				if (resolve) return getToTopic();
				return basicGetToTopic();
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
			case RossystemPackage.TOPIC_CONNECTION__FROM_TOPIC:
				setFromTopic((RosPublisher)newValue);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TO_TOPIC:
				setToTopic((RosSubscriber)newValue);
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
			case RossystemPackage.TOPIC_CONNECTION__FROM_TOPIC:
				setFromTopic((RosPublisher)null);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TO_TOPIC:
				setToTopic((RosSubscriber)null);
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
			case RossystemPackage.TOPIC_CONNECTION__FROM_TOPIC:
				return fromTopic != null;
			case RossystemPackage.TOPIC_CONNECTION__TO_TOPIC:
				return toTopic != null;
		}
		return super.eIsSet(featureID);
	}

} //TopicConnectionImpl
