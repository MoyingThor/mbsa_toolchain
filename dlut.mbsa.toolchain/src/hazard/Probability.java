/**
 */
package hazard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Probability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hazard.Hazard_Package#getProbability()
 * @model
 * @generated
 */
public enum Probability implements Enumerator {
	/**
	 * The '<em><b>Frequent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENT(1, "frequent", "frequent"),

	/**
	 * The '<em><b>Probable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABLE(2, "probable", "probable"),

	/**
	 * The '<em><b>Occasional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCASIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OCCASIONAL(3, "occasional", "occasional"),

	/**
	 * The '<em><b>Remote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE(4, "remote", "remote"),

	/**
	 * The '<em><b>Improbable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPROBABLE(5, "improbable", "improbable");

	/**
	 * The '<em><b>Frequent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENT
	 * @model name="frequent"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENT_VALUE = 1;

	/**
	 * The '<em><b>Probable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABLE
	 * @model name="probable"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABLE_VALUE = 2;

	/**
	 * The '<em><b>Occasional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCASIONAL
	 * @model name="occasional"
	 * @generated
	 * @ordered
	 */
	public static final int OCCASIONAL_VALUE = 3;

	/**
	 * The '<em><b>Remote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE
	 * @model name="remote"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_VALUE = 4;

	/**
	 * The '<em><b>Improbable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPROBABLE
	 * @model name="improbable"
	 * @generated
	 * @ordered
	 */
	public static final int IMPROBABLE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Probability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Probability[] VALUES_ARRAY =
		new Probability[] {
			FREQUENT,
			PROBABLE,
			OCCASIONAL,
			REMOTE,
			IMPROBABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Probability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Probability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Probability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Probability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Probability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Probability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Probability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Probability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Probability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Probability get(int value) {
		switch (value) {
			case FREQUENT_VALUE: return FREQUENT;
			case PROBABLE_VALUE: return PROBABLE;
			case OCCASIONAL_VALUE: return OCCASIONAL;
			case REMOTE_VALUE: return REMOTE;
			case IMPROBABLE_VALUE: return IMPROBABLE;
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
	private Probability(int value, String name, String literal) {
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
	
} //Probability
