/**
 */
package PackageFormat2.impl;

import PackageFormat2.DependencyType;
import PackageFormat2.DescriptionType;
import PackageFormat2.ExportType;
import PackageFormat2.PackageFormat2Package;
import PackageFormat2.PackageType;
import PackageFormat2.PersonWithEmailType;
import PackageFormat2.PersonWithOptionalEmailType;
import PackageFormat2.UrlType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getLicense <em>License</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getBuildDepend <em>Build Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getBuildExportDepend <em>Build Export Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getBuildtoolDepend <em>Buildtool Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getBuildtoolExportDepend <em>Buildtool Export Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getExecDepend <em>Exec Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getDepend <em>Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getDocDepend <em>Doc Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getTestDepend <em>Test Depend</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getConflict <em>Conflict</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getReplace <em>Replace</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getExport <em>Export</em>}</li>
 *   <li>{@link PackageFormat2.impl.PackageTypeImpl#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageTypeImpl extends MinimalEObjectImpl.Container implements PackageType {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getMaintainer() <em>Maintainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonWithEmailType> maintainer;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected EList<String> license;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<UrlType> url;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonWithOptionalEmailType> author;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getExport() <em>Export</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport()
	 * @generated
	 * @ordered
	 */
	protected ExportType export;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final int FORMAT_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected int format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageFormat2Package.Literals.PACKAGE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonWithEmailType> getMaintainer() {
		if (maintainer == null) {
			maintainer = new EObjectContainmentEList<PersonWithEmailType>(PersonWithEmailType.class, this, PackageFormat2Package.PACKAGE_TYPE__MAINTAINER);
		}
		return maintainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLicense() {
		if (license == null) {
			license = new EDataTypeEList<String>(String.class, this, PackageFormat2Package.PACKAGE_TYPE__LICENSE);
		}
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlType> getUrl() {
		if (url == null) {
			url = new EObjectContainmentEList<UrlType>(UrlType.class, this, PackageFormat2Package.PACKAGE_TYPE__URL);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonWithOptionalEmailType> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<PersonWithOptionalEmailType>(PersonWithOptionalEmailType.class, this, PackageFormat2Package.PACKAGE_TYPE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PackageFormat2Package.PACKAGE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getBuildDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILD_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getBuildExportDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILD_EXPORT_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getBuildtoolDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILDTOOL_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getBuildtoolExportDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getExecDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__EXEC_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getDocDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__DOC_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getTestDepend() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__TEST_DEPEND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getConflict() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__CONFLICT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyType> getReplace() {
		return getGroup().list(PackageFormat2Package.Literals.PACKAGE_TYPE__REPLACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportType getExport() {
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport(ExportType newExport, NotificationChain msgs) {
		ExportType oldExport = export;
		export = newExport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__EXPORT, oldExport, newExport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport(ExportType newExport) {
		if (newExport != export) {
			NotificationChain msgs = null;
			if (export != null)
				msgs = ((InternalEObject)export).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackageFormat2Package.PACKAGE_TYPE__EXPORT, null, msgs);
			if (newExport != null)
				msgs = ((InternalEObject)newExport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackageFormat2Package.PACKAGE_TYPE__EXPORT, null, msgs);
			msgs = basicSetExport(newExport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__EXPORT, newExport, newExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(int newFormat) {
		int oldFormat = format;
		format = newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageFormat2Package.PACKAGE_TYPE__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		int oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PackageFormat2Package.PACKAGE_TYPE__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__MAINTAINER:
				return ((InternalEList<?>)getMaintainer()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__URL:
				return ((InternalEList<?>)getUrl()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_DEPEND:
				return ((InternalEList<?>)getBuildDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_EXPORT_DEPEND:
				return ((InternalEList<?>)getBuildExportDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_DEPEND:
				return ((InternalEList<?>)getBuildtoolDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND:
				return ((InternalEList<?>)getBuildtoolExportDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__EXEC_DEPEND:
				return ((InternalEList<?>)getExecDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__DEPEND:
				return ((InternalEList<?>)getDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__DOC_DEPEND:
				return ((InternalEList<?>)getDocDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__TEST_DEPEND:
				return ((InternalEList<?>)getTestDepend()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__CONFLICT:
				return ((InternalEList<?>)getConflict()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__REPLACE:
				return ((InternalEList<?>)getReplace()).basicRemove(otherEnd, msgs);
			case PackageFormat2Package.PACKAGE_TYPE__EXPORT:
				return basicSetExport(null, msgs);
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
			case PackageFormat2Package.PACKAGE_TYPE__NAME:
				return getName();
			case PackageFormat2Package.PACKAGE_TYPE__VERSION:
				return getVersion();
			case PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION:
				return getDescription();
			case PackageFormat2Package.PACKAGE_TYPE__MAINTAINER:
				return getMaintainer();
			case PackageFormat2Package.PACKAGE_TYPE__LICENSE:
				return getLicense();
			case PackageFormat2Package.PACKAGE_TYPE__URL:
				return getUrl();
			case PackageFormat2Package.PACKAGE_TYPE__AUTHOR:
				return getAuthor();
			case PackageFormat2Package.PACKAGE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_DEPEND:
				return getBuildDepend();
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_EXPORT_DEPEND:
				return getBuildExportDepend();
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_DEPEND:
				return getBuildtoolDepend();
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND:
				return getBuildtoolExportDepend();
			case PackageFormat2Package.PACKAGE_TYPE__EXEC_DEPEND:
				return getExecDepend();
			case PackageFormat2Package.PACKAGE_TYPE__DEPEND:
				return getDepend();
			case PackageFormat2Package.PACKAGE_TYPE__DOC_DEPEND:
				return getDocDepend();
			case PackageFormat2Package.PACKAGE_TYPE__TEST_DEPEND:
				return getTestDepend();
			case PackageFormat2Package.PACKAGE_TYPE__CONFLICT:
				return getConflict();
			case PackageFormat2Package.PACKAGE_TYPE__REPLACE:
				return getReplace();
			case PackageFormat2Package.PACKAGE_TYPE__EXPORT:
				return getExport();
			case PackageFormat2Package.PACKAGE_TYPE__FORMAT:
				return getFormat();
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
			case PackageFormat2Package.PACKAGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__MAINTAINER:
				getMaintainer().clear();
				getMaintainer().addAll((Collection<? extends PersonWithEmailType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__LICENSE:
				getLicense().clear();
				getLicense().addAll((Collection<? extends String>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__URL:
				getUrl().clear();
				getUrl().addAll((Collection<? extends UrlType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends PersonWithOptionalEmailType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_DEPEND:
				getBuildDepend().clear();
				getBuildDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_EXPORT_DEPEND:
				getBuildExportDepend().clear();
				getBuildExportDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_DEPEND:
				getBuildtoolDepend().clear();
				getBuildtoolDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND:
				getBuildtoolExportDepend().clear();
				getBuildtoolExportDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__EXEC_DEPEND:
				getExecDepend().clear();
				getExecDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DEPEND:
				getDepend().clear();
				getDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DOC_DEPEND:
				getDocDepend().clear();
				getDocDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__TEST_DEPEND:
				getTestDepend().clear();
				getTestDepend().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__CONFLICT:
				getConflict().clear();
				getConflict().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__REPLACE:
				getReplace().clear();
				getReplace().addAll((Collection<? extends DependencyType>)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__EXPORT:
				setExport((ExportType)newValue);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__FORMAT:
				setFormat((Integer)newValue);
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
			case PackageFormat2Package.PACKAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__MAINTAINER:
				getMaintainer().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__LICENSE:
				getLicense().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__URL:
				getUrl().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__GROUP:
				getGroup().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_DEPEND:
				getBuildDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_EXPORT_DEPEND:
				getBuildExportDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_DEPEND:
				getBuildtoolDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND:
				getBuildtoolExportDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__EXEC_DEPEND:
				getExecDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DEPEND:
				getDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DOC_DEPEND:
				getDocDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__TEST_DEPEND:
				getTestDepend().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__CONFLICT:
				getConflict().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__REPLACE:
				getReplace().clear();
				return;
			case PackageFormat2Package.PACKAGE_TYPE__EXPORT:
				setExport((ExportType)null);
				return;
			case PackageFormat2Package.PACKAGE_TYPE__FORMAT:
				unsetFormat();
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
			case PackageFormat2Package.PACKAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PackageFormat2Package.PACKAGE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION:
				return description != null;
			case PackageFormat2Package.PACKAGE_TYPE__MAINTAINER:
				return maintainer != null && !maintainer.isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__LICENSE:
				return license != null && !license.isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__URL:
				return url != null && !url.isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__AUTHOR:
				return author != null && !author.isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_DEPEND:
				return !getBuildDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__BUILD_EXPORT_DEPEND:
				return !getBuildExportDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_DEPEND:
				return !getBuildtoolDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND:
				return !getBuildtoolExportDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__EXEC_DEPEND:
				return !getExecDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__DEPEND:
				return !getDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__DOC_DEPEND:
				return !getDocDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__TEST_DEPEND:
				return !getTestDepend().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__CONFLICT:
				return !getConflict().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__REPLACE:
				return !getReplace().isEmpty();
			case PackageFormat2Package.PACKAGE_TYPE__EXPORT:
				return export != null;
			case PackageFormat2Package.PACKAGE_TYPE__FORMAT:
				return isSetFormat();
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
		result.append(", version: ");
		result.append(version);
		result.append(", license: ");
		result.append(license);
		result.append(", group: ");
		result.append(group);
		result.append(", format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PackageTypeImpl
