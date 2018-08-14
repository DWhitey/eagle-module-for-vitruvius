/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vertical Text</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getVerticalText()
 * @model
 * @generated
 */
public final class VerticalText extends AbstractEnumerator {
	/**
	 * The '<em><b>Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UP_LITERAL
	 * @model name="up"
	 * @generated
	 * @ordered
	 */
	public static final int UP = 0;

	/**
	 * The '<em><b>Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWN_LITERAL
	 * @model name="down"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN = 0;

	/**
	 * The '<em><b>Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @generated
	 * @ordered
	 */
	public static final VerticalText UP_LITERAL = new VerticalText(UP, "up", "up");

	/**
	 * The '<em><b>Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @generated
	 * @ordered
	 */
	public static final VerticalText DOWN_LITERAL = new VerticalText(DOWN, "down", "down");

	/**
	 * An array of all the '<em><b>Vertical Text</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VerticalText[] VALUES_ARRAY =
		new VerticalText[] {
			UP_LITERAL,
			DOWN_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Vertical Text</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vertical Text</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerticalText get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerticalText result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertical Text</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerticalText getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VerticalText result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vertical Text</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerticalText get(int value) {
		switch (value) {
			case UP: return UP_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private VerticalText(int value, String name, String literal) {
		super(value, name, literal);
	}

} //VerticalText
