/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Devices#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getDevices()
 * @model
 * @generated
 */
public interface Devices extends EObject {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getDevices_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

} // Devices
