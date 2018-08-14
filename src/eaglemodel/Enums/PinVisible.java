/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pin Visible</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getPinVisible()
 * @model
 * @generated
 */
public final class PinVisible extends AbstractEnumerator {
	/**
	 * The '<em><b>Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Off</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF_LITERAL
	 * @model name="off"
	 * @generated
	 * @ordered
	 */
	public static final int OFF = 0;

	/**
	 * The '<em><b>Pad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAD_LITERAL
	 * @model name="pad"
	 * @generated
	 * @ordered
	 */
	public static final int PAD = 0;

	/**
	 * The '<em><b>Pin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_LITERAL
	 * @model name="pin"
	 * @generated
	 * @ordered
	 */
	public static final int PIN = 0;

	/**
	 * The '<em><b>Both</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_LITERAL
	 * @model name="both"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH = 0;

	/**
	 * The '<em><b>Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @generated
	 * @ordered
	 */
	public static final PinVisible OFF_LITERAL = new PinVisible(OFF, "off", "off");

	/**
	 * The '<em><b>Pad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAD
	 * @generated
	 * @ordered
	 */
	public static final PinVisible PAD_LITERAL = new PinVisible(PAD, "pad", "pad");

	/**
	 * The '<em><b>Pin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN
	 * @generated
	 * @ordered
	 */
	public static final PinVisible PIN_LITERAL = new PinVisible(PIN, "pin", "pin");

	/**
	 * The '<em><b>Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @generated
	 * @ordered
	 */
	public static final PinVisible BOTH_LITERAL = new PinVisible(BOTH, "both", "both");

	/**
	 * An array of all the '<em><b>Pin Visible</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PinVisible[] VALUES_ARRAY =
		new PinVisible[] {
			OFF_LITERAL,
			PAD_LITERAL,
			PIN_LITERAL,
			BOTH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pin Visible</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pin Visible</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinVisible get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinVisible result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Visible</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinVisible getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinVisible result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Visible</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinVisible get(int value) {
		switch (value) {
			case OFF: return OFF_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PinVisible(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PinVisible
