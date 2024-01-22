/**
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ros.Node;

import system.RosInterface;
import system.RosNode;
import system.RosParameter;
import system.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.impl.RosNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link system.impl.RosNodeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link system.impl.RosNodeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link system.impl.RosNodeImpl#getRosinterfaces <em>Rosinterfaces</em>}</li>
 *   <li>{@link system.impl.RosNodeImpl#getRosparameters <em>Rosparameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosNodeImpl extends ComponentImpl implements RosNode {
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
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

                /**
     * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected String namespace = NAMESPACE_EDEFAULT;

                /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected Node from;

    /**
     * The cached value of the '{@link #getRosinterfaces() <em>Rosinterfaces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRosinterfaces()
     * @generated
     * @ordered
     */
    protected EList<RosInterface> rosinterfaces;

    /**
     * The cached value of the '{@link #getRosparameters() <em>Rosparameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRosparameters()
     * @generated
     * @ordered
     */
    protected EList<RosParameter> rosparameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RosNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RossystemPackage.Literals.ROS_NODE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_NODE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNamespace() {
        return namespace;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNamespace(String newNamespace) {
        String oldNamespace = namespace;
        namespace = newNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_NODE__NAMESPACE, oldNamespace, namespace));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Node getFrom() {
        if (from != null && from.eIsProxy()) {
            InternalEObject oldFrom = (InternalEObject)from;
            from = (Node)eResolveProxy(oldFrom);
            if (from != oldFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RossystemPackage.ROS_NODE__FROM, oldFrom, from));
            }
        }
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node basicGetFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFrom(Node newFrom) {
        Node oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RossystemPackage.ROS_NODE__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RosInterface> getRosinterfaces() {
        if (rosinterfaces == null) {
            rosinterfaces = new EObjectContainmentEList<RosInterface>(RosInterface.class, this, RossystemPackage.ROS_NODE__ROSINTERFACES);
        }
        return rosinterfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RosParameter> getRosparameters() {
        if (rosparameters == null) {
            rosparameters = new EObjectContainmentEList<RosParameter>(RosParameter.class, this, RossystemPackage.ROS_NODE__ROSPARAMETERS);
        }
        return rosparameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RossystemPackage.ROS_NODE__ROSINTERFACES:
                return ((InternalEList<?>)getRosinterfaces()).basicRemove(otherEnd, msgs);
            case RossystemPackage.ROS_NODE__ROSPARAMETERS:
                return ((InternalEList<?>)getRosparameters()).basicRemove(otherEnd, msgs);
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
            case RossystemPackage.ROS_NODE__NAME:
                return getName();
            case RossystemPackage.ROS_NODE__NAMESPACE:
                return getNamespace();
            case RossystemPackage.ROS_NODE__FROM:
                if (resolve) return getFrom();
                return basicGetFrom();
            case RossystemPackage.ROS_NODE__ROSINTERFACES:
                return getRosinterfaces();
            case RossystemPackage.ROS_NODE__ROSPARAMETERS:
                return getRosparameters();
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
            case RossystemPackage.ROS_NODE__NAME:
                setName((String)newValue);
                return;
            case RossystemPackage.ROS_NODE__NAMESPACE:
                setNamespace((String)newValue);
                return;
            case RossystemPackage.ROS_NODE__FROM:
                setFrom((Node)newValue);
                return;
            case RossystemPackage.ROS_NODE__ROSINTERFACES:
                getRosinterfaces().clear();
                getRosinterfaces().addAll((Collection<? extends RosInterface>)newValue);
                return;
            case RossystemPackage.ROS_NODE__ROSPARAMETERS:
                getRosparameters().clear();
                getRosparameters().addAll((Collection<? extends RosParameter>)newValue);
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
            case RossystemPackage.ROS_NODE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RossystemPackage.ROS_NODE__NAMESPACE:
                setNamespace(NAMESPACE_EDEFAULT);
                return;
            case RossystemPackage.ROS_NODE__FROM:
                setFrom((Node)null);
                return;
            case RossystemPackage.ROS_NODE__ROSINTERFACES:
                getRosinterfaces().clear();
                return;
            case RossystemPackage.ROS_NODE__ROSPARAMETERS:
                getRosparameters().clear();
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
            case RossystemPackage.ROS_NODE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RossystemPackage.ROS_NODE__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
            case RossystemPackage.ROS_NODE__FROM:
                return from != null;
            case RossystemPackage.ROS_NODE__ROSINTERFACES:
                return rosinterfaces != null && !rosinterfaces.isEmpty();
            case RossystemPackage.ROS_NODE__ROSPARAMETERS:
                return rosparameters != null && !rosparameters.isEmpty();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", namespace: ");
        result.append(namespace);
        result.append(')');
        return result.toString();
    }

} //RosNodeImpl
