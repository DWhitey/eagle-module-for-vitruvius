/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Sheets#getSheet <em>Sheet</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSheets()
 * @model
 * @generated
 */
public interface Sheets extends EObject {
	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Sheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSheets_Sheet()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sheet> getSheet();

} // Sheets
