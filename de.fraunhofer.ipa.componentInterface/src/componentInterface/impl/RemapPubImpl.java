/**
 */
package componentInterface.impl;

import componentInterface.ComponentInterfacePackage;
import componentInterface.RemapPub;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.Namespace;
import ros.Publisher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remap Pub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentInterface.impl.RemapPubImpl#getTopicRef <em>Topic Ref</em>}</li>
 *   <li>{@link componentInterface.impl.RemapPubImpl#getRemapName <em>Remap Name</em>}</li>
 *   <li>{@link componentInterface.impl.RemapPubImpl#getNameSpace <em>Name Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemapPubImpl extends MinimalEObjectImpl.Container implements RemapPub {
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
	 * The default value of the '{@link #getRemapName() <em>Remap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapName()
	 * @generated
	 * @ordered
	 */
	protected static final String REMAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemapName() <em>Remap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapName()
	 * @generated
	 * @ordered
	 */
	protected String remapName = REMAP_NAME_EDEFAULT;

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
	protected RemapPubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInterfacePackage.Literals.REMAP_PUB;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.REMAP_PUB__TOPIC_REF, oldTopicRef, topicRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.REMAP_PUB__TOPIC_REF, oldTopicRef, topicRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRemapName() {
		if (getNameSpace().getParts() != null) {
			return String.format("%s/%s", getNameSpace().getParts().get(0), getTopicRef().getName());	
		}else {
			return getTopicRef().getName();
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemapName(String newRemapName) {
		String oldRemapName = remapName;
		remapName = newRemapName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.REMAP_PUB__REMAP_NAME, oldRemapName, remapName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInterfacePackage.REMAP_PUB__NAME_SPACE, oldNameSpace, nameSpace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInterfacePackage.REMAP_PUB__NAME_SPACE, oldNameSpace, nameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInterfacePackage.REMAP_PUB__TOPIC_REF:
				if (resolve) return getTopicRef();
				return basicGetTopicRef();
			case ComponentInterfacePackage.REMAP_PUB__REMAP_NAME:
				return getRemapName();
			case ComponentInterfacePackage.REMAP_PUB__NAME_SPACE:
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
			case ComponentInterfacePackage.REMAP_PUB__TOPIC_REF:
				setTopicRef((Publisher)newValue);
				return;
			case ComponentInterfacePackage.REMAP_PUB__REMAP_NAME:
				setRemapName((String)newValue);
				return;
			case ComponentInterfacePackage.REMAP_PUB__NAME_SPACE:
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
			case ComponentInterfacePackage.REMAP_PUB__TOPIC_REF:
				setTopicRef((Publisher)null);
				return;
			case ComponentInterfacePackage.REMAP_PUB__REMAP_NAME:
				setRemapName(REMAP_NAME_EDEFAULT);
				return;
			case ComponentInterfacePackage.REMAP_PUB__NAME_SPACE:
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
			case ComponentInterfacePackage.REMAP_PUB__TOPIC_REF:
				return topicRef != null;
			case ComponentInterfacePackage.REMAP_PUB__REMAP_NAME:
				return REMAP_NAME_EDEFAULT == null ? remapName != null : !REMAP_NAME_EDEFAULT.equals(remapName);
			case ComponentInterfacePackage.REMAP_PUB__NAME_SPACE:
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
		result.append(" (RemapName: ");
		result.append(remapName);
		result.append(')');
		return result.toString();
	}

} //RemapPubImpl
