/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Layers#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getLayers()
 * @model
 * @generated
 */
public interface Layers extends EObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getLayers_Layers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // Layers
