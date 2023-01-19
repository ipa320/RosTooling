/**
 */
package rossystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rossystem.RosActionClient;
import rossystem.RosActionServer;
import rossystem.RosInterfaces;
import rossystem.RosParameter;
import rossystem.RosPublisher;
import rossystem.RosServiceClient;
import rossystem.RosServiceServer;
import rossystem.RosSubscriber;
import rossystem.RossystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRosactionclient <em>Rosactionclient</em>}</li>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRospublisher <em>Rospublisher</em>}</li>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRosserviceserver <em>Rosserviceserver</em>}</li>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRossubscriber <em>Rossubscriber</em>}</li>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRosserviceclient <em>Rosserviceclient</em>}</li>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRosactionserver <em>Rosactionserver</em>}</li>
 *   <li>{@link rossystem.impl.RosInterfacesImpl#getRosparameter <em>Rosparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosInterfacesImpl extends MinimalEObjectImpl.Container implements RosInterfaces {
	/**
	 * The cached value of the '{@link #getRosactionclient() <em>Rosactionclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosactionclient()
	 * @generated
	 * @ordered
	 */
	protected EList<RosActionClient> rosactionclient;

	/**
	 * The cached value of the '{@link #getRospublisher() <em>Rospublisher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRospublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<RosPublisher> rospublisher;

	/**
	 * The cached value of the '{@link #getRosserviceserver() <em>Rosserviceserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosserviceserver()
	 * @generated
	 * @ordered
	 */
	protected EList<RosServiceServer> rosserviceserver;

	/**
	 * The cached value of the '{@link #getRossubscriber() <em>Rossubscriber</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRossubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<RosSubscriber> rossubscriber;

	/**
	 * The cached value of the '{@link #getRosserviceclient() <em>Rosserviceclient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosserviceclient()
	 * @generated
	 * @ordered
	 */
	protected EList<RosServiceClient> rosserviceclient;

	/**
	 * The cached value of the '{@link #getRosactionserver() <em>Rosactionserver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosactionserver()
	 * @generated
	 * @ordered
	 */
	protected EList<RosActionServer> rosactionserver;

	/**
	 * The cached value of the '{@link #getRosparameter() <em>Rosparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRosparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<RosParameter> rosparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RossystemPackage.Literals.ROS_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosActionClient> getRosactionclient() {
		if (rosactionclient == null) {
			rosactionclient = new EObjectContainmentEList<RosActionClient>(RosActionClient.class, this, RossystemPackage.ROS_INTERFACES__ROSACTIONCLIENT);
		}
		return rosactionclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosPublisher> getRospublisher() {
		if (rospublisher == null) {
			rospublisher = new EObjectContainmentEList<RosPublisher>(RosPublisher.class, this, RossystemPackage.ROS_INTERFACES__ROSPUBLISHER);
		}
		return rospublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosServiceServer> getRosserviceserver() {
		if (rosserviceserver == null) {
			rosserviceserver = new EObjectContainmentEList<RosServiceServer>(RosServiceServer.class, this, RossystemPackage.ROS_INTERFACES__ROSSERVICESERVER);
		}
		return rosserviceserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosSubscriber> getRossubscriber() {
		if (rossubscriber == null) {
			rossubscriber = new EObjectContainmentEList<RosSubscriber>(RosSubscriber.class, this, RossystemPackage.ROS_INTERFACES__ROSSUBSCRIBER);
		}
		return rossubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosServiceClient> getRosserviceclient() {
		if (rosserviceclient == null) {
			rosserviceclient = new EObjectContainmentEList<RosServiceClient>(RosServiceClient.class, this, RossystemPackage.ROS_INTERFACES__ROSSERVICECLIENT);
		}
		return rosserviceclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosActionServer> getRosactionserver() {
		if (rosactionserver == null) {
			rosactionserver = new EObjectContainmentEList<RosActionServer>(RosActionServer.class, this, RossystemPackage.ROS_INTERFACES__ROSACTIONSERVER);
		}
		return rosactionserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RosParameter> getRosparameter() {
		if (rosparameter == null) {
			rosparameter = new EObjectContainmentEList<RosParameter>(RosParameter.class, this, RossystemPackage.ROS_INTERFACES__ROSPARAMETER);
		}
		return rosparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RossystemPackage.ROS_INTERFACES__ROSACTIONCLIENT:
				return ((InternalEList<?>)getRosactionclient()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_INTERFACES__ROSPUBLISHER:
				return ((InternalEList<?>)getRospublisher()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_INTERFACES__ROSSERVICESERVER:
				return ((InternalEList<?>)getRosserviceserver()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_INTERFACES__ROSSUBSCRIBER:
				return ((InternalEList<?>)getRossubscriber()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_INTERFACES__ROSSERVICECLIENT:
				return ((InternalEList<?>)getRosserviceclient()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_INTERFACES__ROSACTIONSERVER:
				return ((InternalEList<?>)getRosactionserver()).basicRemove(otherEnd, msgs);
			case RossystemPackage.ROS_INTERFACES__ROSPARAMETER:
				return ((InternalEList<?>)getRosparameter()).basicRemove(otherEnd, msgs);
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
			case RossystemPackage.ROS_INTERFACES__ROSACTIONCLIENT:
				return getRosactionclient();
			case RossystemPackage.ROS_INTERFACES__ROSPUBLISHER:
				return getRospublisher();
			case RossystemPackage.ROS_INTERFACES__ROSSERVICESERVER:
				return getRosserviceserver();
			case RossystemPackage.ROS_INTERFACES__ROSSUBSCRIBER:
				return getRossubscriber();
			case RossystemPackage.ROS_INTERFACES__ROSSERVICECLIENT:
				return getRosserviceclient();
			case RossystemPackage.ROS_INTERFACES__ROSACTIONSERVER:
				return getRosactionserver();
			case RossystemPackage.ROS_INTERFACES__ROSPARAMETER:
				return getRosparameter();
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
			case RossystemPackage.ROS_INTERFACES__ROSACTIONCLIENT:
				getRosactionclient().clear();
				getRosactionclient().addAll((Collection<? extends RosActionClient>)newValue);
				return;
			case RossystemPackage.ROS_INTERFACES__ROSPUBLISHER:
				getRospublisher().clear();
				getRospublisher().addAll((Collection<? extends RosPublisher>)newValue);
				return;
			case RossystemPackage.ROS_INTERFACES__ROSSERVICESERVER:
				getRosserviceserver().clear();
				getRosserviceserver().addAll((Collection<? extends RosServiceServer>)newValue);
				return;
			case RossystemPackage.ROS_INTERFACES__ROSSUBSCRIBER:
				getRossubscriber().clear();
				getRossubscriber().addAll((Collection<? extends RosSubscriber>)newValue);
				return;
			case RossystemPackage.ROS_INTERFACES__ROSSERVICECLIENT:
				getRosserviceclient().clear();
				getRosserviceclient().addAll((Collection<? extends RosServiceClient>)newValue);
				return;
			case RossystemPackage.ROS_INTERFACES__ROSACTIONSERVER:
				getRosactionserver().clear();
				getRosactionserver().addAll((Collection<? extends RosActionServer>)newValue);
				return;
			case RossystemPackage.ROS_INTERFACES__ROSPARAMETER:
				getRosparameter().clear();
				getRosparameter().addAll((Collection<? extends RosParameter>)newValue);
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
			case RossystemPackage.ROS_INTERFACES__ROSACTIONCLIENT:
				getRosactionclient().clear();
				return;
			case RossystemPackage.ROS_INTERFACES__ROSPUBLISHER:
				getRospublisher().clear();
				return;
			case RossystemPackage.ROS_INTERFACES__ROSSERVICESERVER:
				getRosserviceserver().clear();
				return;
			case RossystemPackage.ROS_INTERFACES__ROSSUBSCRIBER:
				getRossubscriber().clear();
				return;
			case RossystemPackage.ROS_INTERFACES__ROSSERVICECLIENT:
				getRosserviceclient().clear();
				return;
			case RossystemPackage.ROS_INTERFACES__ROSACTIONSERVER:
				getRosactionserver().clear();
				return;
			case RossystemPackage.ROS_INTERFACES__ROSPARAMETER:
				getRosparameter().clear();
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
			case RossystemPackage.ROS_INTERFACES__ROSACTIONCLIENT:
				return rosactionclient != null && !rosactionclient.isEmpty();
			case RossystemPackage.ROS_INTERFACES__ROSPUBLISHER:
				return rospublisher != null && !rospublisher.isEmpty();
			case RossystemPackage.ROS_INTERFACES__ROSSERVICESERVER:
				return rosserviceserver != null && !rosserviceserver.isEmpty();
			case RossystemPackage.ROS_INTERFACES__ROSSUBSCRIBER:
				return rossubscriber != null && !rossubscriber.isEmpty();
			case RossystemPackage.ROS_INTERFACES__ROSSERVICECLIENT:
				return rosserviceclient != null && !rosserviceclient.isEmpty();
			case RossystemPackage.ROS_INTERFACES__ROSACTIONSERVER:
				return rosactionserver != null && !rosactionserver.isEmpty();
			case RossystemPackage.ROS_INTERFACES__ROSPARAMETER:
				return rosparameter != null && !rosparameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RosInterfacesImpl
