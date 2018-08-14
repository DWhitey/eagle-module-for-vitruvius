/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Grid Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getGridStyle()
 * @model
 * @generated
 */
public final class GridStyle extends AbstractEnumerator {
	/**
	 * The '<em><b>Lines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINES_LITERAL
	 * @model name="lines"
	 * @generated
	 * @ordered
	 */
	public static final int LINES = 0;

	/**
	 * The '<em><b>Dots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dots</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOTS_LITERAL
	 * @model name="dots"
	 * @generated
	 * @ordered
	 */
	public static final int DOTS = 0;

	/**
	 * The '<em><b>Lines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINES
	 * @generated
	 * @ordered
	 */
	public static final GridStyle LINES_LITERAL = new GridStyle(LINES, "lines", "lines");

	/**
	 * The '<em><b>Dots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOTS
	 * @generated
	 * @ordered
	 */
	public static final GridStyle DOTS_LITERAL = new GridStyle(DOTS, "dots", "dots");

	/**
	 * An array of all the '<em><b>Grid Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GridStyle[] VALUES_ARRAY =
		new GridStyle[] {
			LINES_LITERAL,
			DOTS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Grid Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Grid Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GridStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GridStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GridStyle get(int value) {
		switch (value) {
			case LINES: return LINES_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GridStyle(int value, String name, String literal) {
		super(value, name, literal);
	}

} //GridStyle
