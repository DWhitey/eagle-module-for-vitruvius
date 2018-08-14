/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Compatibility#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getCompatibility()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Compatibility extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getCompatibility_Note()
	 * @model type="eaglemodel.Note"
	 * @generated
	 */
	EList getNote();

} // Compatibility
