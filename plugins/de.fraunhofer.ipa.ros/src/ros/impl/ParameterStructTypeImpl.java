/**
 */
package ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ros.ParameterStructType;
import ros.ParameterStructTypeMember;
import ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.ParameterStructTypeImpl#getParameterstructypetmember <em>Parameterstructypetmember</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterStructTypeImpl extends ParameterTypeImpl implements ParameterStructType {
    /**
     * The cached value of the '{@link #getParameterstructypetmember() <em>Parameterstructypetmember</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterstructypetmember()
     * @generated
     * @ordered
     */
    protected EList<ParameterStructTypeMember> parameterstructypetmember;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterStructTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.PARAMETER_STRUCT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ParameterStructTypeMember> getParameterstructypetmember() {
        if (parameterstructypetmember == null) {
            parameterstructypetmember = new EObjectContainmentEList<ParameterStructTypeMember>(ParameterStructTypeMember.class, this, RosPackage.PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER);
        }
        return parameterstructypetmember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER:
                return ((InternalEList<?>)getParameterstructypetmember()).basicRemove(otherEnd, msgs);
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
            case RosPackage.PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER:
                return getParameterstructypetmember();
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
            case RosPackage.PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER:
                getParameterstructypetmember().clear();
                getParameterstructypetmember().addAll((Collection<? extends ParameterStructTypeMember>)newValue);
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
            case RosPackage.PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER:
                getParameterstructypetmember().clear();
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
            case RosPackage.PARAMETER_STRUCT_TYPE__PARAMETERSTRUCTYPETMEMBER:
                return parameterstructypetmember != null && !parameterstructypetmember.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ParameterStructTypeImpl
