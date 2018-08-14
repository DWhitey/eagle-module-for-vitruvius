/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pad Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getPadShape()
 * @model
 * @generated
 */
public final class PadShape extends AbstractEnumerator {
	/**
	 * The '<em><b>Square</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Square</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQUARE_LITERAL
	 * @model name="square"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE = 0;

	/**
	 * The '<em><b>Round</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND_LITERAL
	 * @model name="round"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND = 0;

	/**
	 * The '<em><b>Octagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Octagon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCTAGON_LITERAL
	 * @model name="octagon"
	 * @generated
	 * @ordered
	 */
	public static final int OCTAGON = 0;

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
	 * The '<em><b>Offset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Offset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFSET_LITERAL
	 * @model name="offset"
	 * @generated
	 * @ordered
	 */
	public static final int OFFSET = 0;

	/**
	 * The '<em><b>Square</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @generated
	 * @ordered
	 */
	public static final PadShape SQUARE_LITERAL = new PadShape(SQUARE, "square", "square");

	/**
	 * The '<em><b>Round</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND
	 * @generated
	 * @ordered
	 */
	public static final PadShape ROUND_LITERAL = new PadShape(ROUND, "round", "round");

	/**
	 * The '<em><b>Octagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTAGON
	 * @generated
	 * @ordered
	 */
	public static final PadShape OCTAGON_LITERAL = new PadShape(OCTAGON, "octagon", "octagon");

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @generated
	 * @ordered
	 */
	public static final PadShape LONG_LITERAL = new PadShape(LONG, "long", "long");

	/**
	 * The '<em><b>Offset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFSET
	 * @generated
	 * @ordered
	 */
	public static final PadShape OFFSET_LITERAL = new PadShape(OFFSET, "offset", "offset");

	/**
	 * An array of all the '<em><b>Pad Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PadShape[] VALUES_ARRAY =
		new PadShape[] {
			SQUARE_LITERAL,
			ROUND_LITERAL,
			OCTAGON_LITERAL,
			LONG_LITERAL,
			OFFSET_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pad Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pad Shape</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PadShape get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PadShape result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pad Shape</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PadShape getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PadShape result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pad Shape</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PadShape get(int value) {
		switch (value) {
			case SQUARE: return SQUARE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PadShape(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PadShape
