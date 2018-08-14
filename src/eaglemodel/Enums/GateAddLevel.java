/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gate Add Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getGateAddLevel()
 * @model
 * @generated
 */
public final class GateAddLevel extends AbstractEnumerator {
	/**
	 * The '<em><b>Must</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Must</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUST_LITERAL
	 * @model name="must"
	 * @generated
	 * @ordered
	 */
	public static final int MUST = 0;

	/**
	 * The '<em><b>Can</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Can</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN_LITERAL
	 * @model name="can"
	 * @generated
	 * @ordered
	 */
	public static final int CAN = 0;

	/**
	 * The '<em><b>Next</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_LITERAL
	 * @model name="next"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT = 0;

	/**
	 * The '<em><b>Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_LITERAL
	 * @model name="request"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST = 0;

	/**
	 * The '<em><b>Always</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_LITERAL
	 * @model name="always"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS = 0;

	/**
	 * The '<em><b>Must</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST
	 * @generated
	 * @ordered
	 */
	public static final GateAddLevel MUST_LITERAL = new GateAddLevel(MUST, "must", "must");

	/**
	 * The '<em><b>Can</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN
	 * @generated
	 * @ordered
	 */
	public static final GateAddLevel CAN_LITERAL = new GateAddLevel(CAN, "can", "can");

	/**
	 * The '<em><b>Next</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT
	 * @generated
	 * @ordered
	 */
	public static final GateAddLevel NEXT_LITERAL = new GateAddLevel(NEXT, "next", "next");

	/**
	 * The '<em><b>Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @generated
	 * @ordered
	 */
	public static final GateAddLevel REQUEST_LITERAL = new GateAddLevel(REQUEST, "request", "request");

	/**
	 * The '<em><b>Always</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @generated
	 * @ordered
	 */
	public static final GateAddLevel ALWAYS_LITERAL = new GateAddLevel(ALWAYS, "always", "always");

	/**
	 * An array of all the '<em><b>Gate Add Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GateAddLevel[] VALUES_ARRAY =
		new GateAddLevel[] {
			MUST_LITERAL,
			CAN_LITERAL,
			NEXT_LITERAL,
			REQUEST_LITERAL,
			ALWAYS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Gate Add Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gate Add Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GateAddLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GateAddLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gate Add Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GateAddLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GateAddLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gate Add Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GateAddLevel get(int value) {
		switch (value) {
			case MUST: return MUST_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GateAddLevel(int value, String name, String literal) {
		super(value, name, literal);
	}

} //GateAddLevel
