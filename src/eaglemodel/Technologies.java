/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technologies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Technologies#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getTechnologies()
 * @model
 * @generated
 */
public interface Technologies extends EObject {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Technology}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getTechnologies_Technology()
	 * @model containment="true"
	 * @generated
	 */
	EList<Technology> getTechnology();

} // Technologies
