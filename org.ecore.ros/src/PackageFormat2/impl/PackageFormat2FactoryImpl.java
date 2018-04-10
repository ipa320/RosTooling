/**
 */
package PackageFormat2.impl;

import PackageFormat2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageFormat2FactoryImpl extends EFactoryImpl implements PackageFormat2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageFormat2Factory init() {
		try {
			PackageFormat2Factory thePackageFormat2Factory = (PackageFormat2Factory)EPackage.Registry.INSTANCE.getEFactory(PackageFormat2Package.eNS_URI);
			if (thePackageFormat2Factory != null) {
				return thePackageFormat2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackageFormat2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFormat2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PackageFormat2Package.DEPENDENCY_TYPE: return createDependencyType();
			case PackageFormat2Package.DESCRIPTION_TYPE: return createDescriptionType();
			case PackageFormat2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case PackageFormat2Package.EXPORT_TYPE: return createExportType();
			case PackageFormat2Package.PACKAGE_TYPE: return createPackageType();
			case PackageFormat2Package.PERSON_WITH_EMAIL_TYPE: return createPersonWithEmailType();
			case PackageFormat2Package.PERSON_WITH_OPTIONAL_EMAIL_TYPE: return createPersonWithOptionalEmailType();
			case PackageFormat2Package.URL_TYPE: return createUrlType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PackageFormat2Package.URL_TYPE_ENUM:
				return createUrlTypeEnumFromString(eDataType, initialValue);
			case PackageFormat2Package.EMAIL_TYPE:
				return createEmailTypeFromString(eDataType, initialValue);
			case PackageFormat2Package.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case PackageFormat2Package.URL_TYPE_ENUM_OBJECT:
				return createUrlTypeEnumObjectFromString(eDataType, initialValue);
			case PackageFormat2Package.VERSION_LIMIT_TYPE:
				return createVersionLimitTypeFromString(eDataType, initialValue);
			case PackageFormat2Package.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PackageFormat2Package.URL_TYPE_ENUM:
				return convertUrlTypeEnumToString(eDataType, instanceValue);
			case PackageFormat2Package.EMAIL_TYPE:
				return convertEmailTypeToString(eDataType, instanceValue);
			case PackageFormat2Package.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case PackageFormat2Package.URL_TYPE_ENUM_OBJECT:
				return convertUrlTypeEnumObjectToString(eDataType, instanceValue);
			case PackageFormat2Package.VERSION_LIMIT_TYPE:
				return convertVersionLimitTypeToString(eDataType, instanceValue);
			case PackageFormat2Package.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyType createDependencyType() {
		DependencyTypeImpl dependencyType = new DependencyTypeImpl();
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportType createExportType() {
		ExportTypeImpl exportType = new ExportTypeImpl();
		return exportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType createPackageType() {
		PackageTypeImpl packageType = new PackageTypeImpl();
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonWithEmailType createPersonWithEmailType() {
		PersonWithEmailTypeImpl personWithEmailType = new PersonWithEmailTypeImpl();
		return personWithEmailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonWithOptionalEmailType createPersonWithOptionalEmailType() {
		PersonWithOptionalEmailTypeImpl personWithOptionalEmailType = new PersonWithOptionalEmailTypeImpl();
		return personWithOptionalEmailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlType createUrlType() {
		UrlTypeImpl urlType = new UrlTypeImpl();
		return urlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlTypeEnum createUrlTypeEnumFromString(EDataType eDataType, String initialValue) {
		UrlTypeEnum result = UrlTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmailTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlTypeEnum createUrlTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createUrlTypeEnumFromString(PackageFormat2Package.Literals.URL_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUrlTypeEnumToString(PackageFormat2Package.Literals.URL_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionLimitTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionLimitTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageFormat2Package getPackageFormat2Package() {
		return (PackageFormat2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackageFormat2Package getPackage() {
		return PackageFormat2Package.eINSTANCE;
	}

} //PackageFormat2FactoryImpl
