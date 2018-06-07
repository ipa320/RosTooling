/**
 */
package ros.impl;

import PackageFormat2.DependencyType;
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
import ros.Artifact;
import ros.Node;
import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link ros.impl.ArtifactImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ros.impl.ArtifactImpl#getBuild_depend <em>Build depend</em>}</li>
 *   <li>{@link ros.impl.ArtifactImpl#getExec_depend <em>Exec depend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends MinimalEObjectImpl.Container implements Artifact {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * The cached value of the '{@link #getBuild_depend() <em>Build depend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild_depend()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyType> build_depend;

	/**
	 * The cached value of the '{@link #getExec_depend() <em>Exec depend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExec_depend()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyType> exec_depend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.ARTIFACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ARTIFACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RosPackage.ARTIFACT__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RosPackage.ARTIFACT__NODE, null, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RosPackage.ARTIFACT__NODE, null, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.ARTIFACT__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getBuild_depend() {
		if (build_depend == null) {
			build_depend = new EObjectContainmentEList<DependencyType>(DependencyType.class, this, RosPackage.ARTIFACT__BUILD_DEPEND);
		}
		return build_depend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getExec_depend() {
		if (exec_depend == null) {
			exec_depend = new EObjectContainmentEList<DependencyType>(DependencyType.class, this, RosPackage.ARTIFACT__EXEC_DEPEND);
		}
		return exec_depend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosPackage.ARTIFACT__NODE:
				return basicSetNode(null, msgs);
			case RosPackage.ARTIFACT__BUILD_DEPEND:
				return ((InternalEList<?>)getBuild_depend()).basicRemove(otherEnd, msgs);
			case RosPackage.ARTIFACT__EXEC_DEPEND:
				return ((InternalEList<?>)getExec_depend()).basicRemove(otherEnd, msgs);
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
			case RosPackage.ARTIFACT__NAME:
				return getName();
			case RosPackage.ARTIFACT__NODE:
				return getNode();
			case RosPackage.ARTIFACT__BUILD_DEPEND:
				return getBuild_depend();
			case RosPackage.ARTIFACT__EXEC_DEPEND:
				return getExec_depend();
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
			case RosPackage.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case RosPackage.ARTIFACT__NODE:
				setNode((Node)newValue);
				return;
			case RosPackage.ARTIFACT__BUILD_DEPEND:
				getBuild_depend().clear();
				getBuild_depend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case RosPackage.ARTIFACT__EXEC_DEPEND:
				getExec_depend().clear();
				getExec_depend().addAll((Collection<? extends DependencyType>)newValue);
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
			case RosPackage.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosPackage.ARTIFACT__NODE:
				setNode((Node)null);
				return;
			case RosPackage.ARTIFACT__BUILD_DEPEND:
				getBuild_depend().clear();
				return;
			case RosPackage.ARTIFACT__EXEC_DEPEND:
				getExec_depend().clear();
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
			case RosPackage.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosPackage.ARTIFACT__NODE:
				return node != null;
			case RosPackage.ARTIFACT__BUILD_DEPEND:
				return build_depend != null && !build_depend.isEmpty();
			case RosPackage.ARTIFACT__EXEC_DEPEND:
				return exec_depend != null && !exec_depend.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
