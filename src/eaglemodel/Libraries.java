/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Libraries#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getLibraries()
 * @model
 * @generated
 */
public interface Libraries extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getLibraries_Library()
	 * @model containment="true"
	 * @generated
	 */
	EList<Library> getLibrary();

} // Libraries
