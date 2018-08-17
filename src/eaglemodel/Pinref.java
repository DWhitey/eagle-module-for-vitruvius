/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pinref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Pinref#getPart <em>Part</em>}</li>
 *   <li>{@link eaglemodel.Pinref#getGate <em>Gate</em>}</li>
 *   <li>{@link eaglemodel.Pinref#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getPinref()
 * @model
 * @generated
 */
public interface Pinref extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see eaglemodel.EaglemodelPackage#getPinref_Part()
	 * @model required="true"
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link eaglemodel.Pinref#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' attribute.
	 * @see #setGate(String)
	 * @see eaglemodel.EaglemodelPackage#getPinref_Gate()
	 * @model required="true"
	 * @generated
	 */
	String getGate();

	/**
	 * Sets the value of the '{@link eaglemodel.Pinref#getGate <em>Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' attribute.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(String value);

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(String)
	 * @see eaglemodel.EaglemodelPackage#getPinref_Pin()
	 * @model required="true"
	 * @generated
	 */
	String getPin();

	/**
	 * Sets the value of the '{@link eaglemodel.Pinref#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(String value);

} // Pinref
