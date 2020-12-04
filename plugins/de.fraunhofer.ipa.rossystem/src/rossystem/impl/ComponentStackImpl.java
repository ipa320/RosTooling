/**
 */
package rossystem.impl;

import componentInterface.ComponentInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rossystem.ComponentStack;
import rossystem.QualityAttribute;
import rossystem.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.ComponentStackImpl#getName <em>Name</em>}</li>
 *   <li>{@link rossystem.impl.ComponentStackImpl#getRosComponent <em>Ros Component</em>}</li>
 *   <li>{@link rossystem.impl.ComponentStackImpl#getQualityAttribute <em>Quality Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentStackImpl extends MinimalEObjectImpl.Container implements ComponentStack {
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
	 * The cached value of the '{@link #getRosComponent() <em>Ros Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> rosComponent;

	/**
	 * The cached value of the '{@link #getQualityAttribute() <em>Quality Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityAttribute> qualityAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.COMPONENT_STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.COMPONENT_STACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentInterface> getRosComponent() {
		if (rosComponent == null) {
			rosComponent = new EObjectContainmentEList<ComponentInterface>(ComponentInterface.class, this, RossystemPackage.COMPONENT_STACK__ROS_COMPONENT);
		}
		return rosComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityAttribute> getQualityAttribute() {
		if (qualityAttribute == null) {
			qualityAttribute = new EObjectContainmentEList<QualityAttribute>(QualityAttribute.class, this, RossystemPackage.COMPONENT_STACK__QUALITY_ATTRIBUTE);
		}
		return qualityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RossystemPackage.COMPONENT_STACK__ROS_COMPONENT:
				return ((InternalEList<?>)getRosComponent()).basicRemove(otherEnd, msgs);
			case RossystemPackage.COMPONENT_STACK__QUALITY_ATTRIBUTE:
				return ((InternalEList<?>)getQualityAttribute()).basicRemove(otherEnd, msgs);
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
			case RossystemPackage.COMPONENT_STACK__NAME:
				return getName();
			case RossystemPackage.COMPONENT_STACK__ROS_COMPONENT:
				return getRosComponent();
			case RossystemPackage.COMPONENT_STACK__QUALITY_ATTRIBUTE:
				return getQualityAttribute();
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
			case RossystemPackage.COMPONENT_STACK__NAME:
				setName((String)newValue);
				return;
			case RossystemPackage.COMPONENT_STACK__ROS_COMPONENT:
				getRosComponent().clear();
				getRosComponent().addAll((Collection<? extends ComponentInterface>)newValue);
				return;
			case RossystemPackage.COMPONENT_STACK__QUALITY_ATTRIBUTE:
				getQualityAttribute().clear();
				getQualityAttribute().addAll((Collection<? extends QualityAttribute>)newValue);
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
			case RossystemPackage.COMPONENT_STACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RossystemPackage.COMPONENT_STACK__ROS_COMPONENT:
				getRosComponent().clear();
				return;
			case RossystemPackage.COMPONENT_STACK__QUALITY_ATTRIBUTE:
				getQualityAttribute().clear();
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
			case RossystemPackage.COMPONENT_STACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RossystemPackage.COMPONENT_STACK__ROS_COMPONENT:
				return rosComponent != null && !rosComponent.isEmpty();
			case RossystemPackage.COMPONENT_STACK__QUALITY_ATTRIBUTE:
				return qualityAttribute != null && !qualityAttribute.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentStackImpl
