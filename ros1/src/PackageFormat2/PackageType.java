/**
 */
package PackageFormat2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PackageFormat2.PackageType#getName <em>Name</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getVersion <em>Version</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getDescription <em>Description</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getLicense <em>License</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getUrl <em>Url</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getAuthor <em>Author</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getGroup <em>Group</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getBuildDepend <em>Build Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getBuildExportDepend <em>Build Export Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getBuildtoolDepend <em>Buildtool Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getBuildtoolExportDepend <em>Buildtool Export Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getExecDepend <em>Exec Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getDepend <em>Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getDocDepend <em>Doc Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getTestDepend <em>Test Depend</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getConflict <em>Conflict</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getReplace <em>Replace</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getExport <em>Export</em>}</li>
 *   <li>{@link PackageFormat2.PackageType#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see PackageFormat2.PackageFormat2Package#getPackageType()
 * @model extendedMetaData="name='package_._type' kind='elementOnly'"
 * @generated
 */
public interface PackageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The package name should be unique within the ROS community.
	 *               It may differ from the folder name into which it is checked out,
	 *               but that is not recommended.
	 *               It must start with a lower-case letter and consist of only
	 *               lower-case letters, numbers and underscores.
	 *               It must not have two consecutive underscores.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Name()
	 * @model dataType="PackageFormat2.NameType" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PackageFormat2.PackageType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Version()
	 * @model dataType="PackageFormat2.VersionType" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link PackageFormat2.PackageType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link PackageFormat2.PackageType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Maintainer</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.PersonWithEmailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Maintainer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maintainer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonWithEmailType> getMaintainer();

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_License()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
	 *        extendedMetaData="kind='element' name='license' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getLicense();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.UrlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UrlType> getUrl();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.PersonWithOptionalEmailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonWithOptionalEmailType> getAuthor();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:7'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Build Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_BuildDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='build_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getBuildDepend();

	/**
	 * Returns the value of the '<em><b>Build Export Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Export Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Export Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_BuildExportDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='build_export_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getBuildExportDepend();

	/**
	 * Returns the value of the '<em><b>Buildtool Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildtool Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildtool Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_BuildtoolDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='buildtool_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getBuildtoolDepend();

	/**
	 * Returns the value of the '<em><b>Buildtool Export Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildtool Export Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildtool Export Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_BuildtoolExportDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='buildtool_export_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getBuildtoolExportDepend();

	/**
	 * Returns the value of the '<em><b>Exec Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_ExecDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exec_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getExecDepend();

	/**
	 * Returns the value of the '<em><b>Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Depend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getDepend();

	/**
	 * Returns the value of the '<em><b>Doc Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_DocDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doc_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getDocDepend();

	/**
	 * Returns the value of the '<em><b>Test Depend</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Depend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Depend</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_TestDepend()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='test_depend' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getTestDepend();

	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Conflict()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conflict' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getConflict();

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' containment reference list.
	 * The list contents are of type {@link PackageFormat2.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' containment reference list.
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Replace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replace' namespace='##targetNamespace' group='group:7'"
	 * @generated
	 */
	EList<DependencyType> getReplace();

	/**
	 * Returns the value of the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' containment reference.
	 * @see #setExport(ExportType)
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Export()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace'"
	 * @generated
	 */
	ExportType getExport();

	/**
	 * Sets the value of the '{@link PackageFormat2.PackageType#getExport <em>Export</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' containment reference.
	 * @see #getExport()
	 * @generated
	 */
	void setExport(ExportType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(int)
	 * @see PackageFormat2.PackageFormat2Package#getPackageType_Format()
	 * @model default="2" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	int getFormat();

	/**
	 * Sets the value of the '{@link PackageFormat2.PackageType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(int value);

	/**
	 * Unsets the value of the '{@link PackageFormat2.PackageType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(int)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link PackageFormat2.PackageType#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(int)
	 * @generated
	 */
	boolean isSetFormat();

} // PackageType
