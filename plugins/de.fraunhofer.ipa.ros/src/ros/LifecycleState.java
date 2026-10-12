/**
 */
package ros;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lifecycle State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ros.RosPackage#getLifecycleState()
 * @model
 * @generated
 */
public enum LifecycleState implements Enumerator {
	/**
	 * The '<em><b>UNCONFIGURED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONFIGURED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCONFIGURED(0, "UNCONFIGURED", "Unconfigured"),

	/**
	 * The '<em><b>INACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(1, "INACTIVE", "Inactive"),

	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(2, "ACTIVE", "Active"),

	/**
	 * The '<em><b>FINALIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALIZED_VALUE
	 * @generated
	 * @ordered
	 */
	FINALIZED(3, "FINALIZED", "Finalized");

	/**
	 * The '<em><b>UNCONFIGURED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONFIGURED
	 * @model literal="Unconfigured"
	 * @generated
	 * @ordered
	 */
	public static final int UNCONFIGURED_VALUE = 0;

	/**
	 * The '<em><b>INACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INACTIVE
	 * @model literal="Inactive"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 1;

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE
	 * @model literal="Active"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 2;

	/**
	 * The '<em><b>FINALIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALIZED
	 * @model literal="Finalized"
	 * @generated
	 * @ordered
	 */
	public static final int FINALIZED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Lifecycle State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifecycleState[] VALUES_ARRAY =
		new LifecycleState[] {
			UNCONFIGURED,
			INACTIVE,
			ACTIVE,
			FINALIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Lifecycle State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifecycleState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lifecycle State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleState get(int value) {
		switch (value) {
			case UNCONFIGURED_VALUE: return UNCONFIGURED;
			case INACTIVE_VALUE: return INACTIVE;
			case ACTIVE_VALUE: return ACTIVE;
			case FINALIZED_VALUE: return FINALIZED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LifecycleState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LifecycleState
