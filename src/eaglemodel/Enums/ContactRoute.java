/**
 */
package eaglemodel.Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contact Route</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eaglemodel.Enums.EnumsPackage#getContactRoute()
 * @model
 * @generated
 */
public final class ContactRoute extends AbstractEnumerator {
	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_LITERAL
	 * @model name="all"
	 * @generated
	 * @ordered
	 */
	public static final int ALL = 0;

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model name="any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 0;

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @generated
	 * @ordered
	 */
	public static final ContactRoute ALL_LITERAL = new ContactRoute(ALL, "all", "all");

	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final ContactRoute ANY_LITERAL = new ContactRoute(ANY, "any", "any");

	/**
	 * An array of all the '<em><b>Contact Route</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContactRoute[] VALUES_ARRAY =
		new ContactRoute[] {
			ALL_LITERAL,
			ANY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Contact Route</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contact Route</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactRoute get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactRoute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Route</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactRoute getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContactRoute result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contact Route</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContactRoute get(int value) {
		switch (value) {
			case ALL: return ALL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContactRoute(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ContactRoute
