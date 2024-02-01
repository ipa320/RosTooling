/**
 */
package ros.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ros.Artifact;
import ros.Dependency;
import ros.RosPackage;
import ros.SpecBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ros.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getFromGitRepo <em>From Git Repo</em>}</li>
 *   <li>{@link ros.impl.PackageImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements ros.Package {
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
     * The cached value of the '{@link #getSpec() <em>Spec</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpec()
     * @generated
     * @ordered
     */
    protected EList<SpecBase> spec;

    /**
     * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArtifact()
     * @generated
     * @ordered
     */
    protected EList<Artifact> artifact;

    /**
     * The default value of the '{@link #getFromGitRepo() <em>From Git Repo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromGitRepo()
     * @generated
     * @ordered
     */
    protected static final String FROM_GIT_REPO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromGitRepo() <em>From Git Repo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromGitRepo()
     * @generated
     * @ordered
     */
    protected String fromGitRepo = FROM_GIT_REPO_EDEFAULT;

    /**
     * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependency()
     * @generated
     * @ordered
     */
    protected EList<Dependency> dependency;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RosPackage.Literals.PACKAGE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SpecBase> getSpec() {
        if (spec == null) {
            spec = new EObjectContainmentWithInverseEList<SpecBase>(SpecBase.class, this, RosPackage.PACKAGE__SPEC, RosPackage.SPEC_BASE__PACKAGE);
        }
        return spec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Artifact> getArtifact() {
        if (artifact == null) {
            artifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, RosPackage.PACKAGE__ARTIFACT);
        }
        return artifact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromGitRepo() {
        return fromGitRepo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromGitRepo(String newFromGitRepo) {
        String oldFromGitRepo = fromGitRepo;
        fromGitRepo = newFromGitRepo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RosPackage.PACKAGE__FROM_GIT_REPO, oldFromGitRepo, fromGitRepo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Dependency> getDependency() {
        if (dependency == null) {
            dependency = new EObjectContainmentEList<Dependency>(Dependency.class, this, RosPackage.PACKAGE__DEPENDENCY);
        }
        return dependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.PACKAGE__SPEC:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpec()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RosPackage.PACKAGE__SPEC:
                return ((InternalEList<?>)getSpec()).basicRemove(otherEnd, msgs);
            case RosPackage.PACKAGE__ARTIFACT:
                return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
            case RosPackage.PACKAGE__DEPENDENCY:
                return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
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
            case RosPackage.PACKAGE__NAME:
                return getName();
            case RosPackage.PACKAGE__SPEC:
                return getSpec();
            case RosPackage.PACKAGE__ARTIFACT:
                return getArtifact();
            case RosPackage.PACKAGE__FROM_GIT_REPO:
                return getFromGitRepo();
            case RosPackage.PACKAGE__DEPENDENCY:
                return getDependency();
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
            case RosPackage.PACKAGE__NAME:
                setName((String)newValue);
                return;
            case RosPackage.PACKAGE__SPEC:
                getSpec().clear();
                getSpec().addAll((Collection<? extends SpecBase>)newValue);
                return;
            case RosPackage.PACKAGE__ARTIFACT:
                getArtifact().clear();
                getArtifact().addAll((Collection<? extends Artifact>)newValue);
                return;
            case RosPackage.PACKAGE__FROM_GIT_REPO:
                setFromGitRepo((String)newValue);
                return;
            case RosPackage.PACKAGE__DEPENDENCY:
                getDependency().clear();
                getDependency().addAll((Collection<? extends Dependency>)newValue);
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
            case RosPackage.PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case RosPackage.PACKAGE__SPEC:
                getSpec().clear();
                return;
            case RosPackage.PACKAGE__ARTIFACT:
                getArtifact().clear();
                return;
            case RosPackage.PACKAGE__FROM_GIT_REPO:
                setFromGitRepo(FROM_GIT_REPO_EDEFAULT);
                return;
            case RosPackage.PACKAGE__DEPENDENCY:
                getDependency().clear();
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
            case RosPackage.PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case RosPackage.PACKAGE__SPEC:
                return spec != null && !spec.isEmpty();
            case RosPackage.PACKAGE__ARTIFACT:
                return artifact != null && !artifact.isEmpty();
            case RosPackage.PACKAGE__FROM_GIT_REPO:
                return FROM_GIT_REPO_EDEFAULT == null ? fromGitRepo != null : !FROM_GIT_REPO_EDEFAULT.equals(fromGitRepo);
            case RosPackage.PACKAGE__DEPENDENCY:
                return dependency != null && !dependency.isEmpty();
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
        result.append(", fromGitRepo: ");
        result.append(fromGitRepo);
        result.append(')');
        return result.toString();
    }

} //PackageImpl
