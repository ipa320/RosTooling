/**
 */
package de.fraunhofer.ipa.rossystem.impl;

import de.fraunhofer.ipa.rossystem.ROSSystem;
import de.fraunhofer.ipa.rossystem.RossystemPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ros.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.rossystem.impl.ROSSystemImpl#getRosNode <em>Ros Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSSystemImpl extends MinimalEObjectImpl.Container implements ROSSystem {
	/**
	 * The cached value of the '{@link #getRosNode() <em>Ros Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> rosNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.ROS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getRosNode() {
		if (rosNode == null) {
			rosNode = new EObjectResolvingEList<Node>(Node.class, this, RossystemPackage.ROS_SYSTEM__ROS_NODE);
		}
		return rosNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RossystemPackage.ROS_SYSTEM__ROS_NODE:
			return getRosNode();
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
		case RossystemPackage.ROS_SYSTEM__ROS_NODE:
			getRosNode().clear();
			getRosNode().addAll((Collection<? extends Node>) newValue);
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
		case RossystemPackage.ROS_SYSTEM__ROS_NODE:
			getRosNode().clear();
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
		case RossystemPackage.ROS_SYSTEM__ROS_NODE:
			return rosNode != null && !rosNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ROSSystemImpl
