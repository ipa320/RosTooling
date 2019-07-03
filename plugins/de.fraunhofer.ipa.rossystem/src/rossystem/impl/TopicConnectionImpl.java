/**
 */
package rossystem.impl;

import componentInterface.RosPublisher;
import componentInterface.RosSubscriber;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link rossystem.impl.TopicConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link rossystem.impl.TopicConnectionImpl#getTo <em>To</em>}</li>
 *   <li>{@link rossystem.impl.TopicConnectionImpl#getTopicName <em>Topic Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicConnectionImpl extends MinimalEObjectImpl.Container implements TopicConnection {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RosPublisher> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RosSubscriber> to;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicConnectionImpl() {
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
	public EList<RosPublisher> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<RosPublisher>(RosPublisher.class, this, RossystemPackage.TOPIC_CONNECTION__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosSubscriber> getTo() {
		if (to == null) {
			to = new EObjectResolvingEList<RosSubscriber>(RosSubscriber.class, this, RossystemPackage.TOPIC_CONNECTION__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicName() {
		return topicName;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.TOPIC_CONNECTION__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RossystemPackage.TOPIC_CONNECTION__FROM:
				return getFrom();
			case RossystemPackage.TOPIC_CONNECTION__TO:
				return getTo();
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_NAME:
				return getTopicName();
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
			case RossystemPackage.TOPIC_CONNECTION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends RosPublisher>)newValue);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends RosSubscriber>)newValue);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_NAME:
				setTopicName((String)newValue);
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
			case RossystemPackage.TOPIC_CONNECTION__FROM:
				getFrom().clear();
				return;
			case RossystemPackage.TOPIC_CONNECTION__TO:
				getTo().clear();
				return;
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
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
			case RossystemPackage.TOPIC_CONNECTION__FROM:
				return from != null && !from.isEmpty();
			case RossystemPackage.TOPIC_CONNECTION__TO:
				return to != null && !to.isEmpty();
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
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

} //TopicConnectionImpl
