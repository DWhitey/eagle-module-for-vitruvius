/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Grid Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getGridUnit()
 * @model
 * @generated
 */
public final class GridUnit extends AbstractEnumerator {
	/**
	 * The '<em><b>Mic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIC_LITERAL
	 * @model name="mic"
	 * @generated
	 * @ordered
	 */
	public static final int MIC = 0;

	/**
	 * The '<em><b>Mm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MM_LITERAL
	 * @model name="mm"
	 * @generated
	 * @ordered
	 */
	public static final int MM = 0;

	/**
	 * The '<em><b>Mil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mil</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIL_LITERAL
	 * @model name="mil"
	 * @generated
	 * @ordered
	 */
	public static final int MIL = 0;

	/**
	 * The '<em><b>Inch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCH_LITERAL
	 * @model name="inch"
	 * @generated
	 * @ordered
	 */
	public static final int INCH = 0;

	/**
	 * The '<em><b>Mic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIC
	 * @generated
	 * @ordered
	 */
	public static final GridUnit MIC_LITERAL = new GridUnit(MIC, "mic", "mic");

	/**
	 * The '<em><b>Mm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM
	 * @generated
	 * @ordered
	 */
	public static final GridUnit MM_LITERAL = new GridUnit(MM, "mm", "mm");

	/**
	 * The '<em><b>Mil</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIL
	 * @generated
	 * @ordered
	 */
	public static final GridUnit MIL_LITERAL = new GridUnit(MIL, "mil", "mil");

	/**
	 * The '<em><b>Inch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCH
	 * @generated
	 * @ordered
	 */
	public static final GridUnit INCH_LITERAL = new GridUnit(INCH, "inch", "inch");

	/**
	 * An array of all the '<em><b>Grid Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GridUnit[] VALUES_ARRAY =
		new GridUnit[] {
			MIC_LITERAL,
			MM_LITERAL,
			MIL_LITERAL,
			INCH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Grid Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Grid Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GridUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GridUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GridUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grid Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GridUnit get(int value) {
		switch (value) {
			case MIC: return MIC_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GridUnit(int value, String name, String literal) {
		super(value, name, literal);
	}

} //GridUnit
