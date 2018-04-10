/**
 */
package PackageFormat2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PackageFormat2.DependencyType#getValue <em>Value</em>}</li>
 *   <li>{@link PackageFormat2.DependencyType#getVersionLt <em>Version Lt</em>}</li>
 *   <li>{@link PackageFormat2.DependencyType#getVersionLte <em>Version Lte</em>}</li>
 *   <li>{@link PackageFormat2.DependencyType#getVersionEq <em>Version Eq</em>}</li>
 *   <li>{@link PackageFormat2.DependencyType#getVersionGte <em>Version Gte</em>}</li>
 *   <li>{@link PackageFormat2.DependencyType#getVersionGt <em>Version Gt</em>}</li>
 * </ul>
 *
 * @see PackageFormat2.PackageFormat2Package#getDependencyType()
 * @model extendedMetaData="name='DependencyType' kind='simple'"
 * @generated
 */
public interface DependencyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see PackageFormat2.PackageFormat2Package#getDependencyType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link PackageFormat2.DependencyType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Version Lt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Lt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Lt</em>' attribute.
	 * @see #setVersionLt(String)
	 * @see PackageFormat2.PackageFormat2Package#getDependencyType_VersionLt()
	 * @model dataType="PackageFormat2.VersionLimitType"
	 *        extendedMetaData="kind='attribute' name='version_lt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionLt();

	/**
	 * Sets the value of the '{@link PackageFormat2.DependencyType#getVersionLt <em>Version Lt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Lt</em>' attribute.
	 * @see #getVersionLt()
	 * @generated
	 */
	void setVersionLt(String value);

	/**
	 * Returns the value of the '<em><b>Version Lte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Lte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Lte</em>' attribute.
	 * @see #setVersionLte(String)
	 * @see PackageFormat2.PackageFormat2Package#getDependencyType_VersionLte()
	 * @model dataType="PackageFormat2.VersionLimitType"
	 *        extendedMetaData="kind='attribute' name='version_lte' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionLte();

	/**
	 * Sets the value of the '{@link PackageFormat2.DependencyType#getVersionLte <em>Version Lte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Lte</em>' attribute.
	 * @see #getVersionLte()
	 * @generated
	 */
	void setVersionLte(String value);

	/**
	 * Returns the value of the '<em><b>Version Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Eq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Eq</em>' attribute.
	 * @see #setVersionEq(String)
	 * @see PackageFormat2.PackageFormat2Package#getDependencyType_VersionEq()
	 * @model dataType="PackageFormat2.VersionLimitType"
	 *        extendedMetaData="kind='attribute' name='version_eq' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionEq();

	/**
	 * Sets the value of the '{@link PackageFormat2.DependencyType#getVersionEq <em>Version Eq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Eq</em>' attribute.
	 * @see #getVersionEq()
	 * @generated
	 */
	void setVersionEq(String value);

	/**
	 * Returns the value of the '<em><b>Version Gte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Gte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Gte</em>' attribute.
	 * @see #setVersionGte(String)
	 * @see PackageFormat2.PackageFormat2Package#getDependencyType_VersionGte()
	 * @model dataType="PackageFormat2.VersionLimitType"
	 *        extendedMetaData="kind='attribute' name='version_gte' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionGte();

	/**
	 * Sets the value of the '{@link PackageFormat2.DependencyType#getVersionGte <em>Version Gte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Gte</em>' attribute.
	 * @see #getVersionGte()
	 * @generated
	 */
	void setVersionGte(String value);

	/**
	 * Returns the value of the '<em><b>Version Gt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Gt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Gt</em>' attribute.
	 * @see #setVersionGt(String)
	 * @see PackageFormat2.PackageFormat2Package#getDependencyType_VersionGt()
	 * @model dataType="PackageFormat2.VersionLimitType"
	 *        extendedMetaData="kind='attribute' name='version_gt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionGt();

	/**
	 * Sets the value of the '{@link PackageFormat2.DependencyType#getVersionGt <em>Version Gt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Gt</em>' attribute.
	 * @see #getVersionGt()
	 * @generated
	 */
	void setVersionGt(String value);

} // DependencyType
