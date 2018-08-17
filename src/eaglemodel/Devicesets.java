/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devicesets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Devicesets#getDeviceset <em>Deviceset</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getDevicesets()
 * @model
 * @generated
 */
public interface Devicesets extends EObject {
	/**
	 * Returns the value of the '<em><b>Deviceset</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Deviceset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviceset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceset</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getDevicesets_Deviceset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deviceset> getDeviceset();

} // Devicesets
