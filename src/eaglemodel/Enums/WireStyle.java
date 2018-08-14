/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Wire Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getWireStyle()
 * @model
 * @generated
 */
public final class WireStyle extends AbstractEnumerator {
	/**
	 * The '<em><b>Continuous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Continuous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS_LITERAL
	 * @model name="continuous"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUOUS = 0;

	/**
	 * The '<em><b>Longdash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Longdash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONGDASH_LITERAL
	 * @model name="longdash"
	 * @generated
	 * @ordered
	 */
	public static final int LONGDASH = 0;

	/**
	 * The '<em><b>Shortdash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shortdash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORTDASH_LITERAL
	 * @model name="shortdash"
	 * @generated
	 * @ordered
	 */
	public static final int SHORTDASH = 0;

	/**
	 * The '<em><b>Dashdot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dashdot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASHDOT_LITERAL
	 * @model name="dashdot"
	 * @generated
	 * @ordered
	 */
	public static final int DASHDOT = 0;

	/**
	 * The '<em><b>Continuous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUOUS
	 * @generated
	 * @ordered
	 */
	public static final WireStyle CONTINUOUS_LITERAL = new WireStyle(CONTINUOUS, "continuous", "continuous");

	/**
	 * The '<em><b>Longdash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONGDASH
	 * @generated
	 * @ordered
	 */
	public static final WireStyle LONGDASH_LITERAL = new WireStyle(LONGDASH, "longdash", "longdash");

	/**
	 * The '<em><b>Shortdash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORTDASH
	 * @generated
	 * @ordered
	 */
	public static final WireStyle SHORTDASH_LITERAL = new WireStyle(SHORTDASH, "shortdash", "shortdash");

	/**
	 * The '<em><b>Dashdot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASHDOT
	 * @generated
	 * @ordered
	 */
	public static final WireStyle DASHDOT_LITERAL = new WireStyle(DASHDOT, "dashdot", "dashdot");

	/**
	 * An array of all the '<em><b>Wire Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WireStyle[] VALUES_ARRAY =
		new WireStyle[] {
			CONTINUOUS_LITERAL,
			LONGDASH_LITERAL,
			SHORTDASH_LITERAL,
			DASHDOT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Wire Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Wire Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WireStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WireStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wire Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WireStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WireStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Wire Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WireStyle get(int value) {
		switch (value) {
			case CONTINUOUS: return CONTINUOUS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WireStyle(int value, String name, String literal) {
		super(value, name, literal);
	}

} //WireStyle
