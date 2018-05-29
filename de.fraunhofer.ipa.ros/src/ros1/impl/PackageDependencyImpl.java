/**
 */
package ros1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ros1.PackageDependency;
import ros1.Ros1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros1.impl.PackageDependencyImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageDependencyImpl extends DependencyImpl implements PackageDependency {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected ros1.Package package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ros1Package.Literals.PACKAGE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros1.Package getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = (ros1.Package)eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ros1Package.PACKAGE_DEPENDENCY__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ros1.Package basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(ros1.Package newPackage) {
		ros1.Package oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ros1Package.PACKAGE_DEPENDENCY__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ros1Package.PACKAGE_DEPENDENCY__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
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
			case Ros1Package.PACKAGE_DEPENDENCY__PACKAGE:
				setPackage((ros1.Package)newValue);
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
			case Ros1Package.PACKAGE_DEPENDENCY__PACKAGE:
				setPackage((ros1.Package)null);
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
			case Ros1Package.PACKAGE_DEPENDENCY__PACKAGE:
				return package_ != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageDependencyImpl
