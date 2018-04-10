/**
 */
package PackageFormat2.impl;

import PackageFormat2.DependencyType;
import PackageFormat2.PackageFormat2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PackageFormat2.impl.DependencyTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link PackageFormat2.impl.DependencyTypeImpl#getVersionLt <em>Version Lt</em>}</li>
 *   <li>{@link PackageFormat2.impl.DependencyTypeImpl#getVersionLte <em>Version Lte</em>}</li>
 *   <li>{@link PackageFormat2.impl.DependencyTypeImpl#getVersionEq <em>Version Eq</em>}</li>
 *   <li>{@link PackageFormat2.impl.DependencyTypeImpl#getVersionGte <em>Version Gte</em>}</li>
 *   <li>{@link PackageFormat2.impl.DependencyTypeImpl#getVersionGt <em>Version Gt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyTypeImpl extends MinimalEObjectImpl.Container implements DependencyType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionLt() <em>Version Lt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionLt()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_LT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionLt() <em>Version Lt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionLt()
	 * @generated
	 * @ordered
	 */
	protected String versionLt = VERSION_LT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionLte() <em>Version Lte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionLte()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_LTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionLte() <em>Version Lte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionLte()
	 * @generated
	 * @ordered
	 */
	protected String versionLte = VERSION_LTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionEq() <em>Version Eq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionEq()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionEq() <em>Version Eq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionEq()
	 * @generated
	 * @ordered
	 */
	protected String versionEq = VERSION_EQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionGte() <em>Version Gte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGte()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_GTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionGte() <em>Version Gte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGte()
	 * @generated
	 * @ordered
	 */
	protected String versionGte = VERSION_GTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionGt() <em>Version Gt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGt()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_GT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionGt() <em>Version Gt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionGt()
	 * @generated
	 * @ordered
	 */
	protected String versionGt = VERSION_GT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageFormat2Package.Literals.DEPENDENCY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.DEPENDENCY_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionLt() {
		return versionLt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionLt(String newVersionLt) {
		String oldVersionLt = versionLt;
		versionLt = newVersionLt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LT, oldVersionLt, versionLt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionLte() {
		return versionLte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionLte(String newVersionLte) {
		String oldVersionLte = versionLte;
		versionLte = newVersionLte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LTE, oldVersionLte, versionLte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionEq() {
		return versionEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionEq(String newVersionEq) {
		String oldVersionEq = versionEq;
		versionEq = newVersionEq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.DEPENDENCY_TYPE__VERSION_EQ, oldVersionEq, versionEq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionGte() {
		return versionGte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionGte(String newVersionGte) {
		String oldVersionGte = versionGte;
		versionGte = newVersionGte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GTE, oldVersionGte, versionGte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionGt() {
		return versionGt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionGt(String newVersionGt) {
		String oldVersionGt = versionGt;
		versionGt = newVersionGt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GT, oldVersionGt, versionGt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageFormat2Package.DEPENDENCY_TYPE__VALUE:
				return getValue();
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LT:
				return getVersionLt();
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LTE:
				return getVersionLte();
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_EQ:
				return getVersionEq();
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GTE:
				return getVersionGte();
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GT:
				return getVersionGt();
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
			case PackageFormat2Package.DEPENDENCY_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LT:
				setVersionLt((String)newValue);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LTE:
				setVersionLte((String)newValue);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_EQ:
				setVersionEq((String)newValue);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GTE:
				setVersionGte((String)newValue);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GT:
				setVersionGt((String)newValue);
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
			case PackageFormat2Package.DEPENDENCY_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LT:
				setVersionLt(VERSION_LT_EDEFAULT);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LTE:
				setVersionLte(VERSION_LTE_EDEFAULT);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_EQ:
				setVersionEq(VERSION_EQ_EDEFAULT);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GTE:
				setVersionGte(VERSION_GTE_EDEFAULT);
				return;
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GT:
				setVersionGt(VERSION_GT_EDEFAULT);
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
			case PackageFormat2Package.DEPENDENCY_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LT:
				return VERSION_LT_EDEFAULT == null ? versionLt != null : !VERSION_LT_EDEFAULT.equals(versionLt);
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_LTE:
				return VERSION_LTE_EDEFAULT == null ? versionLte != null : !VERSION_LTE_EDEFAULT.equals(versionLte);
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_EQ:
				return VERSION_EQ_EDEFAULT == null ? versionEq != null : !VERSION_EQ_EDEFAULT.equals(versionEq);
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GTE:
				return VERSION_GTE_EDEFAULT == null ? versionGte != null : !VERSION_GTE_EDEFAULT.equals(versionGte);
			case PackageFormat2Package.DEPENDENCY_TYPE__VERSION_GT:
				return VERSION_GT_EDEFAULT == null ? versionGt != null : !VERSION_GT_EDEFAULT.equals(versionGt);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", versionLt: ");
		result.append(versionLt);
		result.append(", versionLte: ");
		result.append(versionLte);
		result.append(", versionEq: ");
		result.append(versionEq);
		result.append(", versionGte: ");
		result.append(versionGte);
		result.append(", versionGt: ");
		result.append(versionGt);
		result.append(')');
		return result.toString();
	}

} //DependencyTypeImpl
