/**
 */
package PackageFormat2;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import ros.PackageSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PackageFormat2.ExportType#getAny <em>Any</em>}</li>
 *   <li>{@link PackageFormat2.ExportType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see PackageFormat2.PackageFormat2Package#getExportType()
 * @model extendedMetaData="name='ExportType' kind='elementOnly'"
 * @generated
 */
public interface ExportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see PackageFormat2.PackageFormat2Package#getExportType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(PackageSet)
	 * @see PackageFormat2.PackageFormat2Package#getExportType_Model()
	 * @model containment="true"
	 * @generated
	 */
	PackageSet getModel();

	/**
	 * Sets the value of the '{@link PackageFormat2.ExportType#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(PackageSet value);

} // ExportType
