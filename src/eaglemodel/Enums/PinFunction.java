/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pin Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getPinFunction()
 * @model
 * @generated
 */
public final class PinFunction extends AbstractEnumerator {
	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOT_LITERAL
	 * @model name="dot"
	 * @generated
	 * @ordered
	 */
	public static final int DOT = 0;

	/**
	 * The '<em><b>Clk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLK_LITERAL
	 * @model name="clk"
	 * @generated
	 * @ordered
	 */
	public static final int CLK = 0;

	/**
	 * The '<em><b>Dotclk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dotclk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOTCLK_LITERAL
	 * @model name="dotclk"
	 * @generated
	 * @ordered
	 */
	public static final int DOTCLK = 0;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final PinFunction NONE_LITERAL = new PinFunction(NONE, "none", "none");

	/**
	 * The '<em><b>Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT
	 * @generated
	 * @ordered
	 */
	public static final PinFunction DOT_LITERAL = new PinFunction(DOT, "dot", "dot");

	/**
	 * The '<em><b>Clk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLK
	 * @generated
	 * @ordered
	 */
	public static final PinFunction CLK_LITERAL = new PinFunction(CLK, "clk", "clk");

	/**
	 * The '<em><b>Dotclk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOTCLK
	 * @generated
	 * @ordered
	 */
	public static final PinFunction DOTCLK_LITERAL = new PinFunction(DOTCLK, "dotclk", "dotclk");

	/**
	 * An array of all the '<em><b>Pin Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PinFunction[] VALUES_ARRAY =
		new PinFunction[] {
			NONE_LITERAL,
			DOT_LITERAL,
			CLK_LITERAL,
			DOTCLK_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pin Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pin Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinFunction get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PinFunction(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PinFunction
