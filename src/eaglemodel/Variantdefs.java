/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variantdefs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Variantdefs#getVariantdef <em>Variantdef</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getVariantdefs()
 * @model
 * @generated
 */
public interface Variantdefs extends EObject {
	/**
	 * Returns the value of the '<em><b>Variantdef</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Variantdef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variantdef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variantdef</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getVariantdefs_Variantdef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variantdef> getVariantdef();

} // Variantdefs
