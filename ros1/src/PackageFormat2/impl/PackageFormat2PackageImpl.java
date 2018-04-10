/**
 */
package PackageFormat2.impl;

import PackageFormat2.DependencyType;
import PackageFormat2.DescriptionType;
import PackageFormat2.DocumentRoot;
import PackageFormat2.ExportType;
import PackageFormat2.PackageFormat2Factory;
import PackageFormat2.PackageFormat2Package;
import PackageFormat2.PackageType;
import PackageFormat2.PersonWithEmailType;
import PackageFormat2.PersonWithOptionalEmailType;
import PackageFormat2.UrlType;
import PackageFormat2.UrlTypeEnum;

import PackageFormat2.util.PackageFormat2Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import ros1.Ros1Package;

import ros1.impl.Ros1PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageFormat2PackageImpl extends EPackageImpl implements PackageFormat2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personWithEmailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personWithOptionalEmailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum urlTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emailTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionLimitTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see PackageFormat2.PackageFormat2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackageFormat2PackageImpl() {
		super(eNS_URI, PackageFormat2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PackageFormat2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PackageFormat2Package init() {
		if (isInited) return (PackageFormat2Package)EPackage.Registry.INSTANCE.getEPackage(PackageFormat2Package.eNS_URI);

		// Obtain or create and register package
		PackageFormat2PackageImpl thePackageFormat2Package = (PackageFormat2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PackageFormat2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PackageFormat2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Ros1PackageImpl theRos1Package = (Ros1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ros1Package.eNS_URI) instanceof Ros1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ros1Package.eNS_URI) : Ros1Package.eINSTANCE);

		// Create package meta-data objects
		thePackageFormat2Package.createPackageContents();
		theRos1Package.createPackageContents();

		// Initialize created meta-data
		thePackageFormat2Package.initializePackageContents();
		theRos1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePackageFormat2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PackageFormat2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePackageFormat2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackageFormat2Package.eNS_URI, thePackageFormat2Package);
		return thePackageFormat2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyType() {
		return dependencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_Value() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_VersionLt() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_VersionLte() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_VersionEq() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_VersionGte() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependencyType_VersionGt() {
		return (EAttribute)dependencyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Mixed() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Any() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Package() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportType() {
		return exportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExportType_Any() {
		return (EAttribute)exportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportType_Model() {
		return (EReference)exportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageType() {
		return packageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Name() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Version() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Description() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Maintainer() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_License() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Url() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Author() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Group() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_BuildDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_BuildExportDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_BuildtoolDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_BuildtoolExportDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_ExecDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Depend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_DocDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_TestDepend() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Conflict() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Replace() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Export() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Format() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonWithEmailType() {
		return personWithEmailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonWithEmailType_Value() {
		return (EAttribute)personWithEmailTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonWithEmailType_Email() {
		return (EAttribute)personWithEmailTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonWithOptionalEmailType() {
		return personWithOptionalEmailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonWithOptionalEmailType_Value() {
		return (EAttribute)personWithOptionalEmailTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonWithOptionalEmailType_Email() {
		return (EAttribute)personWithOptionalEmailTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlType() {
		return urlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_Value() {
		return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlType_Type() {
		return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUrlTypeEnum() {
		return urlTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEmailType() {
		return emailTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUrlTypeEnumObject() {
		return urlTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionLimitType() {
		return versionLimitTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFormat2Factory getPackageFormat2Factory() {
		return (PackageFormat2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dependencyTypeEClass = createEClass(DEPENDENCY_TYPE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__VALUE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__VERSION_LT);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__VERSION_LTE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__VERSION_EQ);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__VERSION_GTE);
		createEAttribute(dependencyTypeEClass, DEPENDENCY_TYPE__VERSION_GT);

		descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__MIXED);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__ANY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGE);

		exportTypeEClass = createEClass(EXPORT_TYPE);
		createEAttribute(exportTypeEClass, EXPORT_TYPE__ANY);
		createEReference(exportTypeEClass, EXPORT_TYPE__MODEL);

		packageTypeEClass = createEClass(PACKAGE_TYPE);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__NAME);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__VERSION);
		createEReference(packageTypeEClass, PACKAGE_TYPE__DESCRIPTION);
		createEReference(packageTypeEClass, PACKAGE_TYPE__MAINTAINER);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__LICENSE);
		createEReference(packageTypeEClass, PACKAGE_TYPE__URL);
		createEReference(packageTypeEClass, PACKAGE_TYPE__AUTHOR);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__GROUP);
		createEReference(packageTypeEClass, PACKAGE_TYPE__BUILD_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__BUILD_EXPORT_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__BUILDTOOL_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__EXEC_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__DOC_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__TEST_DEPEND);
		createEReference(packageTypeEClass, PACKAGE_TYPE__CONFLICT);
		createEReference(packageTypeEClass, PACKAGE_TYPE__REPLACE);
		createEReference(packageTypeEClass, PACKAGE_TYPE__EXPORT);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__FORMAT);

		personWithEmailTypeEClass = createEClass(PERSON_WITH_EMAIL_TYPE);
		createEAttribute(personWithEmailTypeEClass, PERSON_WITH_EMAIL_TYPE__VALUE);
		createEAttribute(personWithEmailTypeEClass, PERSON_WITH_EMAIL_TYPE__EMAIL);

		personWithOptionalEmailTypeEClass = createEClass(PERSON_WITH_OPTIONAL_EMAIL_TYPE);
		createEAttribute(personWithOptionalEmailTypeEClass, PERSON_WITH_OPTIONAL_EMAIL_TYPE__VALUE);
		createEAttribute(personWithOptionalEmailTypeEClass, PERSON_WITH_OPTIONAL_EMAIL_TYPE__EMAIL);

		urlTypeEClass = createEClass(URL_TYPE);
		createEAttribute(urlTypeEClass, URL_TYPE__VALUE);
		createEAttribute(urlTypeEClass, URL_TYPE__TYPE);

		// Create enums
		urlTypeEnumEEnum = createEEnum(URL_TYPE_ENUM);

		// Create data types
		emailTypeEDataType = createEDataType(EMAIL_TYPE);
		nameTypeEDataType = createEDataType(NAME_TYPE);
		urlTypeEnumObjectEDataType = createEDataType(URL_TYPE_ENUM_OBJECT);
		versionLimitTypeEDataType = createEDataType(VERSION_LIMIT_TYPE);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		Ros1Package theRos1Package = (Ros1Package)EPackage.Registry.INSTANCE.getEPackage(Ros1Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dependencyTypeEClass, DependencyType.class, "DependencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependencyType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_VersionLt(), this.getVersionLimitType(), "versionLt", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_VersionLte(), this.getVersionLimitType(), "versionLte", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_VersionEq(), this.getVersionLimitType(), "versionEq", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_VersionGte(), this.getVersionLimitType(), "versionGte", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependencyType_VersionGt(), this.getVersionLimitType(), "versionGt", null, 0, 1, DependencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Package(), this.getPackageType(), null, "package", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exportTypeEClass, ExportType.class, "ExportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExportType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ExportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExportType_Model(), theRos1Package.getPackageSet(), null, "model", null, 0, 1, ExportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageTypeEClass, PackageType.class, "PackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageType_Name(), this.getNameType(), "name", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Version(), this.getVersionType(), "version", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Description(), this.getDescriptionType(), null, "description", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Maintainer(), this.getPersonWithEmailType(), null, "maintainer", null, 1, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_License(), theXMLTypePackage.getToken(), "license", null, 1, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Url(), this.getUrlType(), null, "url", null, 0, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Author(), this.getPersonWithOptionalEmailType(), null, "author", null, 0, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_BuildDepend(), this.getDependencyType(), null, "buildDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_BuildExportDepend(), this.getDependencyType(), null, "buildExportDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_BuildtoolDepend(), this.getDependencyType(), null, "buildtoolDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_BuildtoolExportDepend(), this.getDependencyType(), null, "buildtoolExportDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_ExecDepend(), this.getDependencyType(), null, "execDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Depend(), this.getDependencyType(), null, "depend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_DocDepend(), this.getDependencyType(), null, "docDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_TestDepend(), this.getDependencyType(), null, "testDepend", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Conflict(), this.getDependencyType(), null, "conflict", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Replace(), this.getDependencyType(), null, "replace", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Export(), this.getExportType(), null, "export", null, 0, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Format(), ecorePackage.getEInt(), "format", "2", 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personWithEmailTypeEClass, PersonWithEmailType.class, "PersonWithEmailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonWithEmailType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, PersonWithEmailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonWithEmailType_Email(), this.getEmailType(), "email", null, 1, 1, PersonWithEmailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personWithOptionalEmailTypeEClass, PersonWithOptionalEmailType.class, "PersonWithOptionalEmailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonWithOptionalEmailType_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, PersonWithOptionalEmailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonWithOptionalEmailType_Email(), this.getEmailType(), "email", null, 0, 1, PersonWithOptionalEmailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlTypeEClass, UrlType.class, "UrlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, UrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlType_Type(), this.getUrlTypeEnum(), "type", "website", 0, 1, UrlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(urlTypeEnumEEnum, UrlTypeEnum.class, "UrlTypeEnum");
		addEEnumLiteral(urlTypeEnumEEnum, UrlTypeEnum.WEBSITE);
		addEEnumLiteral(urlTypeEnumEEnum, UrlTypeEnum.BUGTRACKER);
		addEEnumLiteral(urlTypeEnumEEnum, UrlTypeEnum.REPOSITORY);

		// Initialize data types
		initEDataType(emailTypeEDataType, String.class, "EmailType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameTypeEDataType, String.class, "NameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(urlTypeEnumObjectEDataType, UrlTypeEnum.class, "UrlTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionLimitTypeEDataType, String.class, "VersionLimitType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (dependencyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DependencyType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDependencyType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getDependencyType_VersionLt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version_lt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDependencyType_VersionLte(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version_lte",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDependencyType_VersionEq(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version_eq",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDependencyType_VersionGte(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version_gte",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDependencyType_VersionGt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version_gt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (descriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DescriptionType",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDescriptionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDescriptionType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "skip"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (emailTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "EmailType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[-a-zA-Z0-9_%25+]+(\\.[-a-zA-Z0-9_%25+]+)*@[-a-zA-Z0-9%25]+(\\.[-a-zA-Z0-9%25]+)*\\.[a-zA-Z]{2,}"
		   });	
		addAnnotation
		  (exportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExportType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getExportType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "skip"
		   });	
		addAnnotation
		  (nameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "name_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[a-z](_?[a-z0-9]+)*"
		   });	
		addAnnotation
		  (packageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "package_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPackageType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Maintainer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maintainer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_License(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "license",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:7"
		   });	
		addAnnotation
		  (getPackageType_BuildDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "build_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_BuildExportDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "build_export_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_BuildtoolDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "buildtool_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_BuildtoolExportDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "buildtool_export_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_ExecDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exec_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_Depend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_DocDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doc_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_TestDepend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "test_depend",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_Conflict(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conflict",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_Replace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replace",
			 "namespace", "##targetNamespace",
			 "group", "group:7"
		   });	
		addAnnotation
		  (getPackageType_Export(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "export",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPackageType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (personWithEmailTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonWithEmailType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPersonWithEmailType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPersonWithEmailType_Email(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (personWithOptionalEmailTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonWithOptionalEmailType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPersonWithOptionalEmailType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPersonWithOptionalEmailType_Email(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (urlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UrlType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getUrlType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getUrlType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (urlTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "UrlTypeEnum"
		   });	
		addAnnotation
		  (urlTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "UrlTypeEnum:Object",
			 "baseType", "UrlTypeEnum"
		   });	
		addAnnotation
		  (versionLimitTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "VersionLimitType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "(0|[1-9][0-9]*)(.(0|[1-9][0-9]*)){0,2}"
		   });	
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "VersionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "(0|[1-9][0-9]*)(.(0|[1-9][0-9]*)){2}"
		   });
	}

} //PackageFormat2PackageImpl
