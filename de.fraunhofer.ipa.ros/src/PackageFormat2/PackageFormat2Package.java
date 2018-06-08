/**
 */
package PackageFormat2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PackageFormat2.PackageFormat2Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface PackageFormat2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PackageFormat2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://download.ros.org/schema/package_format2.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PackageFormat2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageFormat2Package eINSTANCE = PackageFormat2.impl.PackageFormat2PackageImpl.init();

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.DependencyTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Version Lt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__VERSION_LT = 1;

	/**
	 * The feature id for the '<em><b>Version Lte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__VERSION_LTE = 2;

	/**
	 * The feature id for the '<em><b>Version Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__VERSION_EQ = 3;

	/**
	 * The feature id for the '<em><b>Version Gte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__VERSION_GTE = 4;

	/**
	 * The feature id for the '<em><b>Version Gt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__VERSION_GT = 5;

	/**
	 * The number of structural features of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.DescriptionTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getDescriptionType()
	 * @generated
	 */
	int DESCRIPTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE__ANY = 1;

	/**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.DocumentRootImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.ExportTypeImpl <em>Export Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.ExportTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getExportType()
	 * @generated
	 */
	int EXPORT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TYPE__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Export Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Export Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.PackageTypeImpl <em>Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.PackageTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__MAINTAINER = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__URL = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__AUTHOR = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__GROUP = 7;

	/**
	 * The feature id for the '<em><b>Build Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__BUILD_DEPEND = 8;

	/**
	 * The feature id for the '<em><b>Build Export Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__BUILD_EXPORT_DEPEND = 9;

	/**
	 * The feature id for the '<em><b>Buildtool Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__BUILDTOOL_DEPEND = 10;

	/**
	 * The feature id for the '<em><b>Buildtool Export Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND = 11;

	/**
	 * The feature id for the '<em><b>Exec Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__EXEC_DEPEND = 12;

	/**
	 * The feature id for the '<em><b>Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__DEPEND = 13;

	/**
	 * The feature id for the '<em><b>Doc Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__DOC_DEPEND = 14;

	/**
	 * The feature id for the '<em><b>Test Depend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__TEST_DEPEND = 15;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__CONFLICT = 16;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__REPLACE = 17;

	/**
	 * The feature id for the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__EXPORT = 18;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__FORMAT = 19;

	/**
	 * The number of structural features of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.PersonWithEmailTypeImpl <em>Person With Email Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.PersonWithEmailTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getPersonWithEmailType()
	 * @generated
	 */
	int PERSON_WITH_EMAIL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_EMAIL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_EMAIL_TYPE__EMAIL = 1;

	/**
	 * The number of structural features of the '<em>Person With Email Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_EMAIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person With Email Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_EMAIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.PersonWithOptionalEmailTypeImpl <em>Person With Optional Email Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.PersonWithOptionalEmailTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getPersonWithOptionalEmailType()
	 * @generated
	 */
	int PERSON_WITH_OPTIONAL_EMAIL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_OPTIONAL_EMAIL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_OPTIONAL_EMAIL_TYPE__EMAIL = 1;

	/**
	 * The number of structural features of the '<em>Person With Optional Email Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_OPTIONAL_EMAIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person With Optional Email Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_WITH_OPTIONAL_EMAIL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.impl.UrlTypeImpl <em>Url Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.impl.UrlTypeImpl
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getUrlType()
	 * @generated
	 */
	int URL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Url Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PackageFormat2.UrlTypeEnum <em>Url Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.UrlTypeEnum
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getUrlTypeEnum()
	 * @generated
	 */
	int URL_TYPE_ENUM = 8;

	/**
	 * The meta object id for the '<em>Email Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getEmailType()
	 * @generated
	 */
	int EMAIL_TYPE = 9;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 10;

	/**
	 * The meta object id for the '<em>Url Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PackageFormat2.UrlTypeEnum
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getUrlTypeEnumObject()
	 * @generated
	 */
	int URL_TYPE_ENUM_OBJECT = 11;

	/**
	 * The meta object id for the '<em>Version Limit Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getVersionLimitType()
	 * @generated
	 */
	int VERSION_LIMIT_TYPE = 12;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link PackageFormat2.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Type</em>'.
	 * @see PackageFormat2.DependencyType
	 * @generated
	 */
	EClass getDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.DependencyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PackageFormat2.DependencyType#getValue()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.DependencyType#getVersionLt <em>Version Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Lt</em>'.
	 * @see PackageFormat2.DependencyType#getVersionLt()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_VersionLt();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.DependencyType#getVersionLte <em>Version Lte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Lte</em>'.
	 * @see PackageFormat2.DependencyType#getVersionLte()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_VersionLte();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.DependencyType#getVersionEq <em>Version Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Eq</em>'.
	 * @see PackageFormat2.DependencyType#getVersionEq()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_VersionEq();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.DependencyType#getVersionGte <em>Version Gte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Gte</em>'.
	 * @see PackageFormat2.DependencyType#getVersionGte()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_VersionGte();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.DependencyType#getVersionGt <em>Version Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Gt</em>'.
	 * @see PackageFormat2.DependencyType#getVersionGt()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_VersionGt();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see PackageFormat2.DescriptionType
	 * @generated
	 */
	EClass getDescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link PackageFormat2.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see PackageFormat2.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link PackageFormat2.DescriptionType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see PackageFormat2.DescriptionType#getAny()
	 * @see #getDescriptionType()
	 * @generated
	 */
	EAttribute getDescriptionType_Any();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see PackageFormat2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link PackageFormat2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see PackageFormat2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link PackageFormat2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see PackageFormat2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link PackageFormat2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see PackageFormat2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link PackageFormat2.DocumentRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see PackageFormat2.DocumentRoot#getPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Package();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.ExportType <em>Export Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Type</em>'.
	 * @see PackageFormat2.ExportType
	 * @generated
	 */
	EClass getExportType();

	/**
	 * Returns the meta object for the attribute list '{@link PackageFormat2.ExportType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see PackageFormat2.ExportType#getAny()
	 * @see #getExportType()
	 * @generated
	 */
	EAttribute getExportType_Any();

	/**
	 * Returns the meta object for the containment reference '{@link PackageFormat2.ExportType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see PackageFormat2.ExportType#getModel()
	 * @see #getExportType()
	 * @generated
	 */
	EReference getExportType_Model();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Type</em>'.
	 * @see PackageFormat2.PackageType
	 * @generated
	 */
	EClass getPackageType();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PackageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PackageFormat2.PackageType#getName()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PackageType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see PackageFormat2.PackageType#getVersion()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link PackageFormat2.PackageType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see PackageFormat2.PackageType#getDescription()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maintainer</em>'.
	 * @see PackageFormat2.PackageType#getMaintainer()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Maintainer();

	/**
	 * Returns the meta object for the attribute list '{@link PackageFormat2.PackageType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>License</em>'.
	 * @see PackageFormat2.PackageType#getLicense()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_License();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url</em>'.
	 * @see PackageFormat2.PackageType#getUrl()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see PackageFormat2.PackageType#getAuthor()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Author();

	/**
	 * Returns the meta object for the attribute list '{@link PackageFormat2.PackageType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see PackageFormat2.PackageType#getGroup()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getBuildDepend <em>Build Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Depend</em>'.
	 * @see PackageFormat2.PackageType#getBuildDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_BuildDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getBuildExportDepend <em>Build Export Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Build Export Depend</em>'.
	 * @see PackageFormat2.PackageType#getBuildExportDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_BuildExportDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getBuildtoolDepend <em>Buildtool Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildtool Depend</em>'.
	 * @see PackageFormat2.PackageType#getBuildtoolDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_BuildtoolDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getBuildtoolExportDepend <em>Buildtool Export Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildtool Export Depend</em>'.
	 * @see PackageFormat2.PackageType#getBuildtoolExportDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_BuildtoolExportDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getExecDepend <em>Exec Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exec Depend</em>'.
	 * @see PackageFormat2.PackageType#getExecDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_ExecDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getDepend <em>Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Depend</em>'.
	 * @see PackageFormat2.PackageType#getDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Depend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getDocDepend <em>Doc Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc Depend</em>'.
	 * @see PackageFormat2.PackageType#getDocDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_DocDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getTestDepend <em>Test Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Depend</em>'.
	 * @see PackageFormat2.PackageType#getTestDepend()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_TestDepend();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conflict</em>'.
	 * @see PackageFormat2.PackageType#getConflict()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Conflict();

	/**
	 * Returns the meta object for the containment reference list '{@link PackageFormat2.PackageType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace</em>'.
	 * @see PackageFormat2.PackageType#getReplace()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Replace();

	/**
	 * Returns the meta object for the containment reference '{@link PackageFormat2.PackageType#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Export</em>'.
	 * @see PackageFormat2.PackageType#getExport()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Export();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PackageType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see PackageFormat2.PackageType#getFormat()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Format();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.PersonWithEmailType <em>Person With Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person With Email Type</em>'.
	 * @see PackageFormat2.PersonWithEmailType
	 * @generated
	 */
	EClass getPersonWithEmailType();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PersonWithEmailType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PackageFormat2.PersonWithEmailType#getValue()
	 * @see #getPersonWithEmailType()
	 * @generated
	 */
	EAttribute getPersonWithEmailType_Value();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PersonWithEmailType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see PackageFormat2.PersonWithEmailType#getEmail()
	 * @see #getPersonWithEmailType()
	 * @generated
	 */
	EAttribute getPersonWithEmailType_Email();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.PersonWithOptionalEmailType <em>Person With Optional Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person With Optional Email Type</em>'.
	 * @see PackageFormat2.PersonWithOptionalEmailType
	 * @generated
	 */
	EClass getPersonWithOptionalEmailType();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PersonWithOptionalEmailType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PackageFormat2.PersonWithOptionalEmailType#getValue()
	 * @see #getPersonWithOptionalEmailType()
	 * @generated
	 */
	EAttribute getPersonWithOptionalEmailType_Value();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.PersonWithOptionalEmailType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see PackageFormat2.PersonWithOptionalEmailType#getEmail()
	 * @see #getPersonWithOptionalEmailType()
	 * @generated
	 */
	EAttribute getPersonWithOptionalEmailType_Email();

	/**
	 * Returns the meta object for class '{@link PackageFormat2.UrlType <em>Url Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Type</em>'.
	 * @see PackageFormat2.UrlType
	 * @generated
	 */
	EClass getUrlType();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.UrlType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see PackageFormat2.UrlType#getValue()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_Value();

	/**
	 * Returns the meta object for the attribute '{@link PackageFormat2.UrlType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see PackageFormat2.UrlType#getType()
	 * @see #getUrlType()
	 * @generated
	 */
	EAttribute getUrlType_Type();

	/**
	 * Returns the meta object for enum '{@link PackageFormat2.UrlTypeEnum <em>Url Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Url Type Enum</em>'.
	 * @see PackageFormat2.UrlTypeEnum
	 * @generated
	 */
	EEnum getUrlTypeEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Email Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='EmailType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[-a-zA-Z0-9_%25+]+(\\.[-a-zA-Z0-9_%25+]+)*@[-a-zA-Z0-9%25]+(\\.[-a-zA-Z0-9%25]+)*\\.[a-zA-Z]{2,}'"
	 * @generated
	 */
	EDataType getEmailType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='name_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[a-z](_?[a-z0-9]+)*'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link PackageFormat2.UrlTypeEnum <em>Url Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Type Enum Object</em>'.
	 * @see PackageFormat2.UrlTypeEnum
	 * @model instanceClass="PackageFormat2.UrlTypeEnum"
	 *        extendedMetaData="name='UrlTypeEnum:Object' baseType='UrlTypeEnum'"
	 * @generated
	 */
	EDataType getUrlTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Limit Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionLimitType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(0|[1-9][0-9]*)(.(0|[1-9][0-9]*)){0,2}'"
	 * @generated
	 */
	EDataType getVersionLimitType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='VersionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='(0|[1-9][0-9]*)(.(0|[1-9][0-9]*)){2}'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageFormat2Factory getPackageFormat2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.DependencyTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getDependencyType()
		 * @generated
		 */
		EClass DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__VALUE = eINSTANCE.getDependencyType_Value();

		/**
		 * The meta object literal for the '<em><b>Version Lt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__VERSION_LT = eINSTANCE.getDependencyType_VersionLt();

		/**
		 * The meta object literal for the '<em><b>Version Lte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__VERSION_LTE = eINSTANCE.getDependencyType_VersionLte();

		/**
		 * The meta object literal for the '<em><b>Version Eq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__VERSION_EQ = eINSTANCE.getDependencyType_VersionEq();

		/**
		 * The meta object literal for the '<em><b>Version Gte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__VERSION_GTE = eINSTANCE.getDependencyType_VersionGte();

		/**
		 * The meta object literal for the '<em><b>Version Gt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__VERSION_GT = eINSTANCE.getDependencyType_VersionGt();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.DescriptionTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getDescriptionType()
		 * @generated
		 */
		EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__MIXED = eINSTANCE.getDescriptionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_TYPE__ANY = eINSTANCE.getDescriptionType_Any();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.DocumentRootImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGE = eINSTANCE.getDocumentRoot_Package();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.ExportTypeImpl <em>Export Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.ExportTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getExportType()
		 * @generated
		 */
		EClass EXPORT_TYPE = eINSTANCE.getExportType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_TYPE__ANY = eINSTANCE.getExportType_Any();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_TYPE__MODEL = eINSTANCE.getExportType_Model();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.PackageTypeImpl <em>Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.PackageTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getPackageType()
		 * @generated
		 */
		EClass PACKAGE_TYPE = eINSTANCE.getPackageType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__NAME = eINSTANCE.getPackageType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__VERSION = eINSTANCE.getPackageType_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__DESCRIPTION = eINSTANCE.getPackageType_Description();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__MAINTAINER = eINSTANCE.getPackageType_Maintainer();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__LICENSE = eINSTANCE.getPackageType_License();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__URL = eINSTANCE.getPackageType_Url();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__AUTHOR = eINSTANCE.getPackageType_Author();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__GROUP = eINSTANCE.getPackageType_Group();

		/**
		 * The meta object literal for the '<em><b>Build Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__BUILD_DEPEND = eINSTANCE.getPackageType_BuildDepend();

		/**
		 * The meta object literal for the '<em><b>Build Export Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__BUILD_EXPORT_DEPEND = eINSTANCE.getPackageType_BuildExportDepend();

		/**
		 * The meta object literal for the '<em><b>Buildtool Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__BUILDTOOL_DEPEND = eINSTANCE.getPackageType_BuildtoolDepend();

		/**
		 * The meta object literal for the '<em><b>Buildtool Export Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND = eINSTANCE.getPackageType_BuildtoolExportDepend();

		/**
		 * The meta object literal for the '<em><b>Exec Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__EXEC_DEPEND = eINSTANCE.getPackageType_ExecDepend();

		/**
		 * The meta object literal for the '<em><b>Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__DEPEND = eINSTANCE.getPackageType_Depend();

		/**
		 * The meta object literal for the '<em><b>Doc Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__DOC_DEPEND = eINSTANCE.getPackageType_DocDepend();

		/**
		 * The meta object literal for the '<em><b>Test Depend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__TEST_DEPEND = eINSTANCE.getPackageType_TestDepend();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__CONFLICT = eINSTANCE.getPackageType_Conflict();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__REPLACE = eINSTANCE.getPackageType_Replace();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__EXPORT = eINSTANCE.getPackageType_Export();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__FORMAT = eINSTANCE.getPackageType_Format();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.PersonWithEmailTypeImpl <em>Person With Email Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.PersonWithEmailTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getPersonWithEmailType()
		 * @generated
		 */
		EClass PERSON_WITH_EMAIL_TYPE = eINSTANCE.getPersonWithEmailType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_WITH_EMAIL_TYPE__VALUE = eINSTANCE.getPersonWithEmailType_Value();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_WITH_EMAIL_TYPE__EMAIL = eINSTANCE.getPersonWithEmailType_Email();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.PersonWithOptionalEmailTypeImpl <em>Person With Optional Email Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.PersonWithOptionalEmailTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getPersonWithOptionalEmailType()
		 * @generated
		 */
		EClass PERSON_WITH_OPTIONAL_EMAIL_TYPE = eINSTANCE.getPersonWithOptionalEmailType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_WITH_OPTIONAL_EMAIL_TYPE__VALUE = eINSTANCE.getPersonWithOptionalEmailType_Value();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_WITH_OPTIONAL_EMAIL_TYPE__EMAIL = eINSTANCE.getPersonWithOptionalEmailType_Email();

		/**
		 * The meta object literal for the '{@link PackageFormat2.impl.UrlTypeImpl <em>Url Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.impl.UrlTypeImpl
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getUrlType()
		 * @generated
		 */
		EClass URL_TYPE = eINSTANCE.getUrlType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TYPE__VALUE = eINSTANCE.getUrlType_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_TYPE__TYPE = eINSTANCE.getUrlType_Type();

		/**
		 * The meta object literal for the '{@link PackageFormat2.UrlTypeEnum <em>Url Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.UrlTypeEnum
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getUrlTypeEnum()
		 * @generated
		 */
		EEnum URL_TYPE_ENUM = eINSTANCE.getUrlTypeEnum();

		/**
		 * The meta object literal for the '<em>Email Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getEmailType()
		 * @generated
		 */
		EDataType EMAIL_TYPE = eINSTANCE.getEmailType();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getNameType()
		 * @generated
		 */
		EDataType NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Url Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PackageFormat2.UrlTypeEnum
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getUrlTypeEnumObject()
		 * @generated
		 */
		EDataType URL_TYPE_ENUM_OBJECT = eINSTANCE.getUrlTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Version Limit Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getVersionLimitType()
		 * @generated
		 */
		EDataType VERSION_LIMIT_TYPE = eINSTANCE.getVersionLimitType();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see PackageFormat2.impl.PackageFormat2PackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //PackageFormat2Package
