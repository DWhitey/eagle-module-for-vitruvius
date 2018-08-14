/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Display</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getAttributeDisplay()
 * @model
 * @generated
 */
public final class AttributeDisplay extends AbstractEnumerator {
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
	 * The '<em><b>Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE_LITERAL
	 * @model name="value"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE = 0;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME_LITERAL
	 * @model name="name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME = 0;

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
	public static final AttributeDisplay OFF_LITERAL = new AttributeDisplay(OFF, "off", "off");

	/**
	 * The '<em><b>Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE
	 * @generated
	 * @ordered
	 */
	public static final AttributeDisplay VALUE_LITERAL = new AttributeDisplay(VALUE, "value", "value");

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @generated
	 * @ordered
	 */
	public static final AttributeDisplay NAME_LITERAL = new AttributeDisplay(NAME, "name", "name");

	/**
	 * The '<em><b>Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @generated
	 * @ordered
	 */
	public static final AttributeDisplay BOTH_LITERAL = new AttributeDisplay(BOTH, "both", "both");

	/**
	 * An array of all the '<em><b>Attribute Display</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeDisplay[] VALUES_ARRAY =
		new AttributeDisplay[] {
			OFF_LITERAL,
			VALUE_LITERAL,
			NAME_LITERAL,
			BOTH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Display</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Display</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeDisplay get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeDisplay result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Display</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeDisplay getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeDisplay result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Display</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeDisplay get(int value) {
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
	private AttributeDisplay(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AttributeDisplay
