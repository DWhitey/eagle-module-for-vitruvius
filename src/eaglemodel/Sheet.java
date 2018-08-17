/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Sheet#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getPlain <em>Plain</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getInstances <em>Instances</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getBusses <em>Busses</em>}</li>
 *   <li>{@link eaglemodel.Sheet#getNets <em>Nets</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSheet()
 * @model
 * @generated
 */
public interface Sheet extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Plain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plain</em>' containment reference.
	 * @see #setPlain(Plain)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Plain()
	 * @model containment="true"
	 * @generated
	 */
	Plain getPlain();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getPlain <em>Plain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plain</em>' containment reference.
	 * @see #getPlain()
	 * @generated
	 */
	void setPlain(Plain value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(Instances)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Instances()
	 * @model containment="true"
	 * @generated
	 */
	Instances getInstances();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(Instances value);

	/**
	 * Returns the value of the '<em><b>Busses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busses</em>' containment reference.
	 * @see #setBusses(Busses)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Busses()
	 * @model containment="true"
	 * @generated
	 */
	Busses getBusses();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getBusses <em>Busses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busses</em>' containment reference.
	 * @see #getBusses()
	 * @generated
	 */
	void setBusses(Busses value);

	/**
	 * Returns the value of the '<em><b>Nets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nets</em>' containment reference.
	 * @see #setNets(Nets)
	 * @see eaglemodel.EaglemodelPackage#getSheet_Nets()
	 * @model containment="true"
	 * @generated
	 */
	Nets getNets();

	/**
	 * Sets the value of the '{@link eaglemodel.Sheet#getNets <em>Nets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nets</em>' containment reference.
	 * @see #getNets()
	 * @generated
	 */
	void setNets(Nets value);

} // Sheet
