/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Connects#getConnect <em>Connect</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getConnects()
 * @model
 * @generated
 */
public interface Connects extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Connect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getConnects_Connect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connect> getConnect();

} // Connects
