/**
 */
package rossystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ros.Node;
import ros.impl.NamespacedElementImpl;
import rossystem.RosComponent;
import rossystem.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.RosComponentImpl#getRosNode <em>Ros Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosComponentImpl extends NamespacedElementImpl implements RosComponent {
	/**
	 * The cached value of the '{@link #getRosNode() <em>Ros Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosNode()
	 * @generated
	 * @ordered
	 */
	protected Node rosNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.ROS_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRosNode() {
		return rosNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRosNode(Node newRosNode, NotificationChain msgs) {
		Node oldRosNode = rosNode;
		rosNode = newRosNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_COMPONENT__ROS_NODE, oldRosNode, newRosNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRosNode(Node newRosNode) {
		if (newRosNode != rosNode) {
			NotificationChain msgs = null;
			if (rosNode != null)
				msgs = ((InternalEObject)rosNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RossystemPackage.ROS_COMPONENT__ROS_NODE, null, msgs);
			if (newRosNode != null)
				msgs = ((InternalEObject)newRosNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RossystemPackage.ROS_COMPONENT__ROS_NODE, null, msgs);
			msgs = basicSetRosNode(newRosNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_COMPONENT__ROS_NODE, newRosNode, newRosNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RossystemPackage.ROS_COMPONENT__ROS_NODE:
				return basicSetRosNode(null, msgs);
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
			case RossystemPackage.ROS_COMPONENT__ROS_NODE:
				return getRosNode();
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
			case RossystemPackage.ROS_COMPONENT__ROS_NODE:
				setRosNode((Node)newValue);
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
			case RossystemPackage.ROS_COMPONENT__ROS_NODE:
				setRosNode((Node)null);
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
			case RossystemPackage.ROS_COMPONENT__ROS_NODE:
				return rosNode != null;
		}
		return super.eIsSet(featureID);
	}

} //RosComponentImpl
