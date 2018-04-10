/**
 */
package PackageFormat2.util;

import PackageFormat2.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see PackageFormat2.PackageFormat2Package
 * @generated
 */
public class PackageFormat2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PackageFormat2Validator INSTANCE = new PackageFormat2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "PackageFormat2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFormat2Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PackageFormat2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PackageFormat2Package.DEPENDENCY_TYPE:
				return validateDependencyType((DependencyType)value, diagnostics, context);
			case PackageFormat2Package.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case PackageFormat2Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PackageFormat2Package.EXPORT_TYPE:
				return validateExportType((ExportType)value, diagnostics, context);
			case PackageFormat2Package.PACKAGE_TYPE:
				return validatePackageType((PackageType)value, diagnostics, context);
			case PackageFormat2Package.PERSON_WITH_EMAIL_TYPE:
				return validatePersonWithEmailType((PersonWithEmailType)value, diagnostics, context);
			case PackageFormat2Package.PERSON_WITH_OPTIONAL_EMAIL_TYPE:
				return validatePersonWithOptionalEmailType((PersonWithOptionalEmailType)value, diagnostics, context);
			case PackageFormat2Package.URL_TYPE:
				return validateUrlType((UrlType)value, diagnostics, context);
			case PackageFormat2Package.URL_TYPE_ENUM:
				return validateUrlTypeEnum((UrlTypeEnum)value, diagnostics, context);
			case PackageFormat2Package.EMAIL_TYPE:
				return validateEmailType((String)value, diagnostics, context);
			case PackageFormat2Package.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case PackageFormat2Package.URL_TYPE_ENUM_OBJECT:
				return validateUrlTypeEnumObject((UrlTypeEnum)value, diagnostics, context);
			case PackageFormat2Package.VERSION_LIMIT_TYPE:
				return validateVersionLimitType((String)value, diagnostics, context);
			case PackageFormat2Package.VERSION_TYPE:
				return validateVersionType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependencyType(DependencyType dependencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExportType(ExportType exportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageType(PackageType packageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonWithEmailType(PersonWithEmailType personWithEmailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personWithEmailType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersonWithOptionalEmailType(PersonWithOptionalEmailType personWithOptionalEmailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(personWithOptionalEmailType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType(UrlType urlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(urlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlTypeEnum(UrlTypeEnum urlTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailType(String emailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEmailType_Pattern(emailType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEmailType_Pattern
	 */
	public static final  PatternMatcher [][] EMAIL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[-a-zA-Z0-9_%+]+(\\.[-a-zA-Z0-9_%+]+)*@[-a-zA-Z0-9%]+(\\.[-a-zA-Z0-9%]+)*\\.[a-zA-Z]{2,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailType_Pattern(String emailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PackageFormat2Package.Literals.EMAIL_TYPE, emailType, EMAIL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType_Pattern(nameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNameType_Pattern
	 */
	public static final  PatternMatcher [][] NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z](_?[a-z0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_Pattern(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PackageFormat2Package.Literals.NAME_TYPE, nameType, NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlTypeEnumObject(UrlTypeEnum urlTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionLimitType(String versionLimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionLimitType_Pattern(versionLimitType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionLimitType_Pattern
	 */
	public static final  PatternMatcher [][] VERSION_LIMIT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]*)(.(0|[1-9][0-9]*)){0,2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version Limit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionLimitType_Pattern(String versionLimitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PackageFormat2Package.Literals.VERSION_LIMIT_TYPE, versionLimitType, VERSION_LIMIT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionType_Pattern(versionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionType_Pattern
	 */
	public static final  PatternMatcher [][] VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0|[1-9][0-9]*)(.(0|[1-9][0-9]*)){2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType_Pattern(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(PackageFormat2Package.Literals.VERSION_TYPE, versionType, VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PackageFormat2Validator
