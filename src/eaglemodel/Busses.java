/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Busses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Busses#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getBusses()
 * @model
 * @generated
 */
public interface Busses extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Bus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getBusses_Bus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bus> getBus();

} // Busses
