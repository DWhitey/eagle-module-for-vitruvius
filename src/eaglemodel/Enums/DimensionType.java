/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dimension Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getDimensionType()
 * @model
 * @generated
 */
public final class DimensionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_LITERAL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL = 0;

	/**
	 * The '<em><b>Horizontal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Horizontal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_LITERAL
	 * @model name="horizontal"
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL = 0;

	/**
	 * The '<em><b>Vertical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_LITERAL
	 * @model name="vertical"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL = 0;

	/**
	 * The '<em><b>Radius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radius</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIUS_LITERAL
	 * @model name="radius"
	 * @generated
	 * @ordered
	 */
	public static final int RADIUS = 0;

	/**
	 * The '<em><b>Diameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAMETER_LITERAL
	 * @model name="diameter"
	 * @generated
	 * @ordered
	 */
	public static final int DIAMETER = 0;

	/**
	 * The '<em><b>Leader</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leader</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEADER_LITERAL
	 * @model name="leader"
	 * @generated
	 * @ordered
	 */
	public static final int LEADER = 0;

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @generated
	 * @ordered
	 */
	public static final DimensionType PARALLEL_LITERAL = new DimensionType(PARALLEL, "parallel", "parallel");

	/**
	 * The '<em><b>Horizontal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL
	 * @generated
	 * @ordered
	 */
	public static final DimensionType HORIZONTAL_LITERAL = new DimensionType(HORIZONTAL, "horizontal", "horizontal");

	/**
	 * The '<em><b>Vertical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL
	 * @generated
	 * @ordered
	 */
	public static final DimensionType VERTICAL_LITERAL = new DimensionType(VERTICAL, "vertical", "vertical");

	/**
	 * The '<em><b>Radius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIUS
	 * @generated
	 * @ordered
	 */
	public static final DimensionType RADIUS_LITERAL = new DimensionType(RADIUS, "radius", "radius");

	/**
	 * The '<em><b>Diameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAMETER
	 * @generated
	 * @ordered
	 */
	public static final DimensionType DIAMETER_LITERAL = new DimensionType(DIAMETER, "diameter", "diameter");

	/**
	 * The '<em><b>Leader</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEADER
	 * @generated
	 * @ordered
	 */
	public static final DimensionType LEADER_LITERAL = new DimensionType(LEADER, "leader", "leader");

	/**
	 * An array of all the '<em><b>Dimension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DimensionType[] VALUES_ARRAY =
		new DimensionType[] {
			PARALLEL_LITERAL,
			HORIZONTAL_LITERAL,
			VERTICAL_LITERAL,
			RADIUS_LITERAL,
			DIAMETER_LITERAL,
			LEADER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Dimension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dimension Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DimensionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DimensionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DimensionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DimensionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DimensionType get(int value) {
		switch (value) {
			case PARALLEL: return PARALLEL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DimensionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DimensionType
