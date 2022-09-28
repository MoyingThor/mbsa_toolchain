/**
 */
package component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Failure Severity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see component.Component_Package#getFailureSeverity()
 * @model
 * @generated
 */
public enum FailureSeverity implements Enumerator {
	/**
	 * The '<em><b>Catastrophic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC_VALUE
	 * @generated
	 * @ordered
	 */
	CATASTROPHIC(1, "catastrophic", "catastrophic"),

	/**
	 * The '<em><b>Fatal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FATAL_VALUE
	 * @generated
	 * @ordered
	 */
	FATAL(2, "fatal", "fatal"),

	/**
	 * The '<em><b>Moderate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE_VALUE
	 * @generated
	 * @ordered
	 */
	MODERATE(3, "moderate", "moderate"),

	/**
	 * The '<em><b>Minor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR(4, "minor", "minor");

	/**
	 * The '<em><b>Catastrophic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATASTROPHIC
	 * @model name="catastrophic"
	 * @generated
	 * @ordered
	 */
	public static final int CATASTROPHIC_VALUE = 1;

	/**
	 * The '<em><b>Fatal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FATAL
	 * @model name="fatal"
	 * @generated
	 * @ordered
	 */
	public static final int FATAL_VALUE = 2;

	/**
	 * The '<em><b>Moderate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERATE
	 * @model name="moderate"
	 * @generated
	 * @ordered
	 */
	public static final int MODERATE_VALUE = 3;

	/**
	 * The '<em><b>Minor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR
	 * @model name="minor"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Failure Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FailureSeverity[] VALUES_ARRAY =
		new FailureSeverity[] {
			CATASTROPHIC,
			FATAL,
			MODERATE,
			MINOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Failure Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FailureSeverity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Failure Severity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailureSeverity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureSeverity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Severity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailureSeverity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FailureSeverity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Failure Severity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FailureSeverity get(int value) {
		switch (value) {
			case CATASTROPHIC_VALUE: return CATASTROPHIC;
			case FATAL_VALUE: return FATAL;
			case MODERATE_VALUE: return MODERATE;
			case MINOR_VALUE: return MINOR;
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
	private FailureSeverity(int value, String name, String literal) {
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
	
} //FailureSeverity
