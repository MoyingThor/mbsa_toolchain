/**
 */
package component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tolerance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see component.Component_Package#getToleranceType()
 * @model
 * @generated
 */
public enum ToleranceType implements Enumerator {
	/**
	 * The '<em><b>Oneoo1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEOO1_VALUE
	 * @generated
	 * @ordered
	 */
	ONEOO1(1, "oneoo1", "oneoo1"),

	/**
	 * The '<em><b>Oneoo2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEOO2_VALUE
	 * @generated
	 * @ordered
	 */
	ONEOO2(2, "oneoo2", "oneoo2"),

	/**
	 * The '<em><b>Oneoo3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEOO3_VALUE
	 * @generated
	 * @ordered
	 */
	ONEOO3(3, "oneoo3", "oneoo3"),

	/**
	 * The '<em><b>Twooo3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWOOO3_VALUE
	 * @generated
	 * @ordered
	 */
	TWOOO3(4, "twooo3", "twooo3");

	/**
	 * The '<em><b>Oneoo1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEOO1
	 * @model name="oneoo1"
	 * @generated
	 * @ordered
	 */
	public static final int ONEOO1_VALUE = 1;

	/**
	 * The '<em><b>Oneoo2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEOO2
	 * @model name="oneoo2"
	 * @generated
	 * @ordered
	 */
	public static final int ONEOO2_VALUE = 2;

	/**
	 * The '<em><b>Oneoo3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEOO3
	 * @model name="oneoo3"
	 * @generated
	 * @ordered
	 */
	public static final int ONEOO3_VALUE = 3;

	/**
	 * The '<em><b>Twooo3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWOOO3
	 * @model name="twooo3"
	 * @generated
	 * @ordered
	 */
	public static final int TWOOO3_VALUE = 4;

	/**
	 * An array of all the '<em><b>Tolerance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ToleranceType[] VALUES_ARRAY =
		new ToleranceType[] {
			ONEOO1,
			ONEOO2,
			ONEOO3,
			TWOOO3,
		};

	/**
	 * A public read-only list of all the '<em><b>Tolerance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ToleranceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tolerance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToleranceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToleranceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tolerance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToleranceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ToleranceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tolerance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ToleranceType get(int value) {
		switch (value) {
			case ONEOO1_VALUE: return ONEOO1;
			case ONEOO2_VALUE: return ONEOO2;
			case ONEOO3_VALUE: return ONEOO3;
			case TWOOO3_VALUE: return TWOOO3;
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
	private ToleranceType(int value, String name, String literal) {
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
	
} //ToleranceType
