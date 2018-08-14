/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Sheet#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getPlain <em>Plain</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getInstances <em>Instances</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getBusses <em>Busses</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getNets <em>Nets</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getSheet()
 * @model
 * @generated
 */
public interface Sheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Description)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Plain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plain</em>' reference.
	 * @see #setPlain(Plain)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Plain()
	 * @model
	 * @generated
	 */
	Plain getPlain();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getPlain <em>Plain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plain</em>' reference.
	 * @see #getPlain()
	 * @generated
	 */
	void setPlain(Plain value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSheet_Instances()
	 * @model type="eaglemodel.Instance"
	 * @generated
	 */
	EList getInstances();

	/**
	 * Returns the value of the '<em><b>Busses</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Bus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busses</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSheet_Busses()
	 * @model type="eaglemodel.Bus"
	 * @generated
	 */
	EList getBusses();

	/**
	 * Returns the value of the '<em><b>Nets</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Net}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nets</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSheet_Nets()
	 * @model type="eaglemodel.Net"
	 * @generated
	 */
	EList getNets();

} // Sheet
