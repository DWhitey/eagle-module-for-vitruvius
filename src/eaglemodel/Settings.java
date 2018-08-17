/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Settings#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSettings()
 * @model
 * @generated
 */
public interface Settings extends EObject {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSettings_Settings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getSettings();

} // Settings
