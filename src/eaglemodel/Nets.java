/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Nets#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getNets()
 * @model
 * @generated
 */
public interface Nets extends EObject {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Net}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getNets_Net()
	 * @model containment="true"
	 * @generated
	 */
	EList<Net> getNet();

} // Nets
