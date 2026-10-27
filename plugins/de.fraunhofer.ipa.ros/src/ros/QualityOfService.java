/**
 */
package ros;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Of Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros.QualityOfService#getQoSProfile <em>Qo SProfile</em>}</li>
 *   <li>{@link ros.QualityOfService#getHistory <em>History</em>}</li>
 *   <li>{@link ros.QualityOfService#getDepth <em>Depth</em>}</li>
 *   <li>{@link ros.QualityOfService#getReliability <em>Reliability</em>}</li>
 *   <li>{@link ros.QualityOfService#getDurability <em>Durability</em>}</li>
 *   <li>{@link ros.QualityOfService#getLiveliness <em>Liveliness</em>}</li>
 *   <li>{@link ros.QualityOfService#getLeaseDuration <em>Lease Duration</em>}</li>
 *   <li>{@link ros.QualityOfService#getLifespan <em>Lifespan</em>}</li>
 *   <li>{@link ros.QualityOfService#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see ros.RosPackage#getQualityOfService()
 * @model
 * @generated
 */
public interface QualityOfService extends EObject {
	/**
	 * Returns the value of the '<em><b>Qo SProfile</b></em>' attribute.
	 * The default value is <code>"default_qos"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qo SProfile</em>' attribute.
	 * @see #setQoSProfile(String)
	 * @see ros.RosPackage#getQualityOfService_QoSProfile()
	 * @model default="default_qos"
	 * @generated
	 */
	String getQoSProfile();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getQoSProfile <em>Qo SProfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qo SProfile</em>' attribute.
	 * @see #getQoSProfile()
	 * @generated
	 */
	void setQoSProfile(String value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute.
	 * The default value is <code>"keep_all"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute.
	 * @see #setHistory(String)
	 * @see ros.RosPackage#getQualityOfService_History()
	 * @model default="keep_all"
	 * @generated
	 */
	String getHistory();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getHistory <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' attribute.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(String value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see ros.RosPackage#getQualityOfService_Depth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * The default value is <code>"reliable"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(String)
	 * @see ros.RosPackage#getQualityOfService_Reliability()
	 * @model default="reliable"
	 * @generated
	 */
	String getReliability();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(String value);

	/**
	 * Returns the value of the '<em><b>Durability</b></em>' attribute.
	 * The default value is <code>"transient_local"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durability</em>' attribute.
	 * @see #setDurability(String)
	 * @see ros.RosPackage#getQualityOfService_Durability()
	 * @model default="transient_local"
	 * @generated
	 */
	String getDurability();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getDurability <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durability</em>' attribute.
	 * @see #getDurability()
	 * @generated
	 */
	void setDurability(String value);

	/**
	 * Returns the value of the '<em><b>Liveliness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liveliness</em>' attribute.
	 * @see #setLiveliness(String)
	 * @see ros.RosPackage#getQualityOfService_Liveliness()
	 * @model
	 * @generated
	 */
	String getLiveliness();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getLiveliness <em>Liveliness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liveliness</em>' attribute.
	 * @see #getLiveliness()
	 * @generated
	 */
	void setLiveliness(String value);

	/**
	 * Returns the value of the '<em><b>Lease Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lease Duration</em>' attribute.
	 * @see #setLeaseDuration(String)
	 * @see ros.RosPackage#getQualityOfService_LeaseDuration()
	 * @model
	 * @generated
	 */
	String getLeaseDuration();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getLeaseDuration <em>Lease Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease Duration</em>' attribute.
	 * @see #getLeaseDuration()
	 * @generated
	 */
	void setLeaseDuration(String value);

	/**
	 * Returns the value of the '<em><b>Lifespan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifespan</em>' attribute.
	 * @see #setLifespan(String)
	 * @see ros.RosPackage#getQualityOfService_Lifespan()
	 * @model
	 * @generated
	 */
	String getLifespan();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getLifespan <em>Lifespan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifespan</em>' attribute.
	 * @see #getLifespan()
	 * @generated
	 */
	void setLifespan(String value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(String)
	 * @see ros.RosPackage#getQualityOfService_Deadline()
	 * @model
	 * @generated
	 */
	String getDeadline();

	/**
	 * Sets the value of the '{@link ros.QualityOfService#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(String value);

} // QualityOfService
