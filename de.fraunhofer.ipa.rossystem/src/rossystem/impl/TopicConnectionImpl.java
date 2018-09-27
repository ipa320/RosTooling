/**
 */
package rossystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.Publisher;
import ros.Subscriber;

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
 *   <li>{@link rossystem.impl.TopicConnectionImpl#getTopicRemap <em>Topic Remap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicConnectionImpl extends MinimalEObjectImpl.Container implements TopicConnection {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Publisher from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Subscriber to;

	/**
	 * The default value of the '{@link #getTopicRemap() <em>Topic Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicRemap()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_REMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicRemap() <em>Topic Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicRemap()
	 * @generated
	 * @ordered
	 */
	protected String topicRemap = TOPIC_REMAP_EDEFAULT;

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
	public Publisher getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Publisher)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.TOPIC_CONNECTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Publisher newFrom) {
		Publisher oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.TOPIC_CONNECTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Subscriber)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.TOPIC_CONNECTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Subscriber newTo) {
		Subscriber oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.TOPIC_CONNECTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicRemap() {
		return topicRemap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicRemap(String newTopicRemap) {
		String oldTopicRemap = topicRemap;
		topicRemap = newTopicRemap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.TOPIC_CONNECTION__TOPIC_REMAP, oldTopicRemap, topicRemap));
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
				if (resolve) return getFrom();
				return basicGetFrom();
			case RossystemPackage.TOPIC_CONNECTION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_REMAP:
				return getTopicRemap();
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
			case RossystemPackage.TOPIC_CONNECTION__FROM:
				setFrom((Publisher)newValue);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TO:
				setTo((Subscriber)newValue);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_REMAP:
				setTopicRemap((String)newValue);
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
				setFrom((Publisher)null);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TO:
				setTo((Subscriber)null);
				return;
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_REMAP:
				setTopicRemap(TOPIC_REMAP_EDEFAULT);
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
				return from != null;
			case RossystemPackage.TOPIC_CONNECTION__TO:
				return to != null;
			case RossystemPackage.TOPIC_CONNECTION__TOPIC_REMAP:
				return TOPIC_REMAP_EDEFAULT == null ? topicRemap != null : !TOPIC_REMAP_EDEFAULT.equals(topicRemap);
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
		result.append(" (TopicRemap: ");
		result.append(topicRemap);
		result.append(')');
		return result.toString();
	}

} //TopicConnectionImpl
