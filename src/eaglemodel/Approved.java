/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approved</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Approved#getHash <em>Hash</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getApproved()
 * @model
 * @generated
 */
public interface Approved extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see eaglemodel.EaglemodelPackage#getApproved_Hash()
	 * @model required="true"
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link eaglemodel.Approved#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

} // Approved
