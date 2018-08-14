/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Polygon Pour</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getPolygonPour()
 * @model
 * @generated
 */
public final class PolygonPour extends AbstractEnumerator {
	/**
	 * The '<em><b>Solid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLID_LITERAL
	 * @model name="solid"
	 * @generated
	 * @ordered
	 */
	public static final int SOLID = 0;

	/**
	 * The '<em><b>Hatch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hatch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HATCH_LITERAL
	 * @model name="hatch"
	 * @generated
	 * @ordered
	 */
	public static final int HATCH = 0;

	/**
	 * The '<em><b>Cutout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cutout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUTOUT_LITERAL
	 * @model name="cutout"
	 * @generated
	 * @ordered
	 */
	public static final int CUTOUT = 0;

	/**
	 * The '<em><b>Solid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID
	 * @generated
	 * @ordered
	 */
	public static final PolygonPour SOLID_LITERAL = new PolygonPour(SOLID, "solid", "solid");

	/**
	 * The '<em><b>Hatch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HATCH
	 * @generated
	 * @ordered
	 */
	public static final PolygonPour HATCH_LITERAL = new PolygonPour(HATCH, "hatch", "hatch");

	/**
	 * The '<em><b>Cutout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUTOUT
	 * @generated
	 * @ordered
	 */
	public static final PolygonPour CUTOUT_LITERAL = new PolygonPour(CUTOUT, "cutout", "cutout");

	/**
	 * An array of all the '<em><b>Polygon Pour</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PolygonPour[] VALUES_ARRAY =
		new PolygonPour[] {
			SOLID_LITERAL,
			HATCH_LITERAL,
			CUTOUT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Polygon Pour</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Polygon Pour</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolygonPour get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PolygonPour result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Polygon Pour</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolygonPour getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PolygonPour result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Polygon Pour</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolygonPour get(int value) {
		switch (value) {
			case SOLID: return SOLID_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PolygonPour(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PolygonPour
