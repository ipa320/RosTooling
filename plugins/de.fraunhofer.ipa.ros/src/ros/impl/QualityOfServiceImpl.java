/**
 */
package ros.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ros.QualityOfService;
import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Of Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.QualityOfServiceImpl#getQoSProfile <em>Qo SProfile</em>}</li>
 *   <li>{@link ros.impl.QualityOfServiceImpl#getHistory <em>History</em>}</li>
 *   <li>{@link ros.impl.QualityOfServiceImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link ros.impl.QualityOfServiceImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link ros.impl.QualityOfServiceImpl#getDurability <em>Durability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityOfServiceImpl extends MinimalEObjectImpl.Container implements QualityOfService {
    /**
     * The default value of the '{@link #getQoSProfile() <em>Qo SProfile</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQoSProfile()
     * @generated
     * @ordered
     */
    protected static final String QO_SPROFILE_EDEFAULT = "default_qos";

    /**
     * The cached value of the '{@link #getQoSProfile() <em>Qo SProfile</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQoSProfile()
     * @generated
     * @ordered
     */
    protected String qoSProfile = QO_SPROFILE_EDEFAULT;

    /**
     * The default value of the '{@link #getHistory() <em>History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHistory()
     * @generated
     * @ordered
     */
    protected static final String HISTORY_EDEFAULT = "keep_all";

    /**
     * The cached value of the '{@link #getHistory() <em>History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHistory()
     * @generated
     * @ordered
     */
    protected String history = HISTORY_EDEFAULT;

    /**
     * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDepth()
     * @generated
     * @ordered
     */
    protected static final int DEPTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDepth()
     * @generated
     * @ordered
     */
    protected int depth = DEPTH_EDEFAULT;

    /**
     * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReliability()
     * @generated
     * @ordered
     */
    protected static final String RELIABILITY_EDEFAULT = "reliable";

    /**
     * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReliability()
     * @generated
     * @ordered
     */
    protected String reliability = RELIABILITY_EDEFAULT;

    /**
     * The default value of the '{@link #getDurability() <em>Durability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurability()
     * @generated
     * @ordered
     */
    protected static final String DURABILITY_EDEFAULT = "transient_local";

    /**
     * The cached value of the '{@link #getDurability() <em>Durability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDurability()
     * @generated
     * @ordered
     */
    protected String durability = DURABILITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualityOfServiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.QUALITY_OF_SERVICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getQoSProfile() {
        return qoSProfile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQoSProfile(String newQoSProfile) {
        String oldQoSProfile = qoSProfile;
        qoSProfile = newQoSProfile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.QUALITY_OF_SERVICE__QO_SPROFILE, oldQoSProfile, qoSProfile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHistory() {
        return history;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHistory(String newHistory) {
        String oldHistory = history;
        history = newHistory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.QUALITY_OF_SERVICE__HISTORY, oldHistory, history));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getDepth() {
        return depth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDepth(int newDepth) {
        int oldDepth = depth;
        depth = newDepth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.QUALITY_OF_SERVICE__DEPTH, oldDepth, depth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReliability() {
        return reliability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReliability(String newReliability) {
        String oldReliability = reliability;
        reliability = newReliability;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.QUALITY_OF_SERVICE__RELIABILITY, oldReliability, reliability));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDurability() {
        return durability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDurability(String newDurability) {
        String oldDurability = durability;
        durability = newDurability;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.QUALITY_OF_SERVICE__DURABILITY, oldDurability, durability));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RosPackage.QUALITY_OF_SERVICE__QO_SPROFILE:
                return getQoSProfile();
            case RosPackage.QUALITY_OF_SERVICE__HISTORY:
                return getHistory();
            case RosPackage.QUALITY_OF_SERVICE__DEPTH:
                return getDepth();
            case RosPackage.QUALITY_OF_SERVICE__RELIABILITY:
                return getReliability();
            case RosPackage.QUALITY_OF_SERVICE__DURABILITY:
                return getDurability();
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
            case RosPackage.QUALITY_OF_SERVICE__QO_SPROFILE:
                setQoSProfile((String)newValue);
                return;
            case RosPackage.QUALITY_OF_SERVICE__HISTORY:
                setHistory((String)newValue);
                return;
            case RosPackage.QUALITY_OF_SERVICE__DEPTH:
                setDepth((Integer)newValue);
                return;
            case RosPackage.QUALITY_OF_SERVICE__RELIABILITY:
                setReliability((String)newValue);
                return;
            case RosPackage.QUALITY_OF_SERVICE__DURABILITY:
                setDurability((String)newValue);
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
            case RosPackage.QUALITY_OF_SERVICE__QO_SPROFILE:
                setQoSProfile(QO_SPROFILE_EDEFAULT);
                return;
            case RosPackage.QUALITY_OF_SERVICE__HISTORY:
                setHistory(HISTORY_EDEFAULT);
                return;
            case RosPackage.QUALITY_OF_SERVICE__DEPTH:
                setDepth(DEPTH_EDEFAULT);
                return;
            case RosPackage.QUALITY_OF_SERVICE__RELIABILITY:
                setReliability(RELIABILITY_EDEFAULT);
                return;
            case RosPackage.QUALITY_OF_SERVICE__DURABILITY:
                setDurability(DURABILITY_EDEFAULT);
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
            case RosPackage.QUALITY_OF_SERVICE__QO_SPROFILE:
                return QO_SPROFILE_EDEFAULT == null ? qoSProfile != null : !QO_SPROFILE_EDEFAULT.equals(qoSProfile);
            case RosPackage.QUALITY_OF_SERVICE__HISTORY:
                return HISTORY_EDEFAULT == null ? history != null : !HISTORY_EDEFAULT.equals(history);
            case RosPackage.QUALITY_OF_SERVICE__DEPTH:
                return depth != DEPTH_EDEFAULT;
            case RosPackage.QUALITY_OF_SERVICE__RELIABILITY:
                return RELIABILITY_EDEFAULT == null ? reliability != null : !RELIABILITY_EDEFAULT.equals(reliability);
            case RosPackage.QUALITY_OF_SERVICE__DURABILITY:
                return DURABILITY_EDEFAULT == null ? durability != null : !DURABILITY_EDEFAULT.equals(durability);
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
        result.append(" (QoSProfile: ");
        result.append(qoSProfile);
        result.append(", History: ");
        result.append(history);
        result.append(", Depth: ");
        result.append(depth);
        result.append(", Reliability: ");
        result.append(reliability);
        result.append(", Durability: ");
        result.append(durability);
        result.append(')');
        return result.toString();
    }

} //QualityOfServiceImpl
