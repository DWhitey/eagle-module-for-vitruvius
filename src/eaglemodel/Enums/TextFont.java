/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Text Font</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getTextFont()
 * @model
 * @generated
 */
public final class TextFont extends AbstractEnumerator {
	/**
	 * The '<em><b>Vector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR_LITERAL
	 * @model name="vector"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR = 0;

	/**
	 * The '<em><b>Proportional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proportional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONAL_LITERAL
	 * @model name="proportional"
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTIONAL = 0;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_LITERAL
	 * @model name="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED = 0;

	/**
	 * The '<em><b>Vector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR
	 * @generated
	 * @ordered
	 */
	public static final TextFont VECTOR_LITERAL = new TextFont(VECTOR, "vector", "vector");

	/**
	 * The '<em><b>Proportional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTIONAL
	 * @generated
	 * @ordered
	 */
	public static final TextFont PROPORTIONAL_LITERAL = new TextFont(PROPORTIONAL, "proportional", "proportional");

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @generated
	 * @ordered
	 */
	public static final TextFont FIXED_LITERAL = new TextFont(FIXED, "fixed", "fixed");

	/**
	 * An array of all the '<em><b>Text Font</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TextFont[] VALUES_ARRAY =
		new TextFont[] {
			VECTOR_LITERAL,
			PROPORTIONAL_LITERAL,
			FIXED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Text Font</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Text Font</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFont get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextFont result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Font</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFont getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TextFont result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Text Font</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextFont get(int value) {
		switch (value) {
			case VECTOR: return VECTOR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TextFont(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TextFont
