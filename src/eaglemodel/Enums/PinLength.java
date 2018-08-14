/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pin Length</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getPinLength()
 * @model
 * @generated
 */
public final class PinLength extends AbstractEnumerator {
	/**
	 * The '<em><b>Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINT_LITERAL
	 * @model name="point"
	 * @generated
	 * @ordered
	 */
	public static final int POINT = 0;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT_LITERAL
	 * @model name="short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT = 0;

	/**
	 * The '<em><b>Middle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Middle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_LITERAL
	 * @model name="middle"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE = 0;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_LITERAL
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG = 0;

	/**
	 * The '<em><b>Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT
	 * @generated
	 * @ordered
	 */
	public static final PinLength POINT_LITERAL = new PinLength(POINT, "point", "point");

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @generated
	 * @ordered
	 */
	public static final PinLength SHORT_LITERAL = new PinLength(SHORT, "short", "short");

	/**
	 * The '<em><b>Middle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE
	 * @generated
	 * @ordered
	 */
	public static final PinLength MIDDLE_LITERAL = new PinLength(MIDDLE, "middle", "middle");

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @generated
	 * @ordered
	 */
	public static final PinLength LONG_LITERAL = new PinLength(LONG, "long", "long");

	/**
	 * An array of all the '<em><b>Pin Length</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PinLength[] VALUES_ARRAY =
		new PinLength[] {
			POINT_LITERAL,
			SHORT_LITERAL,
			MIDDLE_LITERAL,
			LONG_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pin Length</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pin Length</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinLength get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinLength result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Length</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinLength getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PinLength result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pin Length</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PinLength get(int value) {
		switch (value) {
			case POINT: return POINT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PinLength(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PinLength
