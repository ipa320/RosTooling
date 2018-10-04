/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.Subscriber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.SubscriberImpl#getTopicRef <em>Topic Ref</em>}</li>
 *   <li>{@link componentInterface.impl.SubscriberImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link componentInterface.impl.SubscriberImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriberImpl extends MinimalEObjectImpl.Container implements Subscriber {
	/**
	 * The cached value of the '{@link #getTopicRef() <em>Topic Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicRef()
	 * @generated
	 * @ordered
	 */
	protected ros.Subscriber topicRef;

	/**
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected Namespace nameSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.SUBSCRIBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros.Subscriber getTopicRef() {
		if (topicRef != null && topicRef.eIsProxy()) {
			InternalEObject oldTopicRef = (InternalEObject)topicRef;
			topicRef = (ros.Subscriber)eResolveProxy(oldTopicRef);
			if (topicRef != oldTopicRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.SUBSCRIBER__TOPIC_REF, oldTopicRef, topicRef));
			}
		}
		return topicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros.Subscriber basicGetTopicRef() {
		return topicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicRef(ros.Subscriber newTopicRef) {
		ros.Subscriber oldTopicRef = topicRef;
		topicRef = newTopicRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.SUBSCRIBER__TOPIC_REF, oldTopicRef, topicRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTopicName() {
		if (topicName.isEmpty()) {
			if (nameSpace != null) {
				return String.format("%s/%s", nameSpace.getParts().get(0), topicRef.getName());	
			}else if (topicRef != null) {
				return topicRef.getName();
			} else
				return topicName;
		}else {
			return topicName;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName) {
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.SUBSCRIBER__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNameSpace() {
		if (nameSpace != null && nameSpace.eIsProxy()) {
			InternalEObject oldNameSpace = (InternalEObject)nameSpace;
			nameSpace = (Namespace)eResolveProxy(oldNameSpace);
			if (nameSpace != oldNameSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.SUBSCRIBER__NAME_SPACE, oldNameSpace, nameSpace));
			}
		}
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(Namespace newNameSpace) {
		Namespace oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.SUBSCRIBER__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_REF:
				if (resolve) return getTopicRef();
				return basicGetTopicRef();
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_NAME:
				return getTopicName();
			case ComponentInterfacePackage.SUBSCRIBER__NAME_SPACE:
				if (resolve) return getNameSpace();
				return basicGetNameSpace();
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
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_REF:
				setTopicRef((ros.Subscriber)newValue);
				return;
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case ComponentInterfacePackage.SUBSCRIBER__NAME_SPACE:
				setNameSpace((Namespace)newValue);
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
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_REF:
				setTopicRef((ros.Subscriber)null);
				return;
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.SUBSCRIBER__NAME_SPACE:
				setNameSpace((Namespace)null);
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
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_REF:
				return topicRef != null;
			case ComponentInterfacePackage.SUBSCRIBER__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case ComponentInterfacePackage.SUBSCRIBER__NAME_SPACE:
				return nameSpace != null;
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
		result.append(" (TopicName: ");
		result.append(topicName);
		result.append(')');
		return result.toString();
	}

} //SubscriberImpl
