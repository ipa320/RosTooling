/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ros.Publisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RosPublisherImpl#getTopicRef <em>Topic Ref</em>}</li>
 *   <li>{@link componentInterface.impl.RosPublisherImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link componentInterface.impl.RosPublisherImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosPublisherImpl extends MinimalEObjectImpl.Container implements RosPublisher {
	/**
	 * The cached value of the '{@link #getTopicRef() <em>Topic Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicRef()
	 * @generated
	 * @ordered
	 */
	protected Publisher topicRef;

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
	 * The default value of the '{@link #getNameSpace() <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected static String NAME_SPACE_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.ROS_PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getTopicRef() {
		if (topicRef != null && topicRef.eIsProxy()) {
			InternalEObject oldTopicRef = (InternalEObject)topicRef;
			topicRef = (Publisher)eResolveProxy(oldTopicRef);
			if (topicRef != oldTopicRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_REF, oldTopicRef, topicRef));
			}
		}
		return topicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetTopicRef() {
		return topicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicRef(Publisher newTopicRef) {
		Publisher oldTopicRef = topicRef;
		topicRef = newTopicRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_REF, oldTopicRef, topicRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTopicName() {
		if (topicName!=null) {
			if (topicName.length()>0) {
				return topicName;
			}if (nameSpace != null && topicRef != null) {
				return String.format("/%s/%s", nameSpace.replaceFirst("/",""), topicRef.getName().replaceFirst("/",""));	
			}else if (topicRef != null) {
				return String.format("/%s", topicRef.getName().replaceFirst("/",""));	
			}else {
				return topicName;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.ROS_PUBLISHER__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_REF:
				if (resolve) return getTopicRef();
				return basicGetTopicRef();
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_NAME:
				return getTopicName();
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME_SPACE:
				return getNameSpace();
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
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_REF:
				setTopicRef((Publisher)newValue);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME_SPACE:
				setNameSpace((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_REF:
				setTopicRef((Publisher)null);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME_SPACE:
				String component_ns = null;
				String ComponentInterface_toString = eContainer().eContents().toString();
				component_ns=ComponentInterface_toString.substring(ComponentInterface_toString.indexOf("parts: [") + 8, ComponentInterface_toString.indexOf("]"));
				if (component_ns.length()>0) {
					NAME_SPACE_EDEFAULT=component_ns;
				}
				setNameSpace(component_ns);
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
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_REF:
				return topicRef != null;
			case ComponentInterfacePackage.ROS_PUBLISHER__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case ComponentInterfacePackage.ROS_PUBLISHER__NAME_SPACE:
				return NAME_SPACE_EDEFAULT == null ? nameSpace != null : !NAME_SPACE_EDEFAULT.equals(nameSpace);
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
		result.append(", NameSpace: ");
		result.append(nameSpace);
		result.append(')');
		return result.toString();
	}

} //RosPublisherImpl
