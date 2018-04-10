/**
 */
package PackageFormat2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PackageFormat2.PackageFormat2Package
 * @generated
 */
public interface PackageFormat2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageFormat2Factory eINSTANCE = PackageFormat2.impl.PackageFormat2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Type</em>'.
	 * @generated
	 */
	DependencyType createDependencyType();

	/**
	 * Returns a new object of class '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Type</em>'.
	 * @generated
	 */
	DescriptionType createDescriptionType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Export Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Type</em>'.
	 * @generated
	 */
	ExportType createExportType();

	/**
	 * Returns a new object of class '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Type</em>'.
	 * @generated
	 */
	PackageType createPackageType();

	/**
	 * Returns a new object of class '<em>Person With Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person With Email Type</em>'.
	 * @generated
	 */
	PersonWithEmailType createPersonWithEmailType();

	/**
	 * Returns a new object of class '<em>Person With Optional Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person With Optional Email Type</em>'.
	 * @generated
	 */
	PersonWithOptionalEmailType createPersonWithOptionalEmailType();

	/**
	 * Returns a new object of class '<em>Url Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url Type</em>'.
	 * @generated
	 */
	UrlType createUrlType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PackageFormat2Package getPackageFormat2Package();

} //PackageFormat2Factory
