/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Gates#getGate <em>Gate</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getGates()
 * @model
 * @generated
 */
public interface Gates extends EObject {
	/**
	 * Returns the value of the '<em><b>Gate</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getGates_Gate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGate();

} // Gates
