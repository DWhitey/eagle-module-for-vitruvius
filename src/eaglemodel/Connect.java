/**
 */
package eaglemodel;

import eaglemodel.Enums.ContactRoute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Connect#getGate <em>Gate</em>}</li>
 *   <li>{@link eaglemodel.Connect#getPin <em>Pin</em>}</li>
 *   <li>{@link eaglemodel.Connect#getPad <em>Pad</em>}</li>
 *   <li>{@link eaglemodel.Connect#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getConnect()
 * @model
 * @generated
 */
public interface Connect extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getConnect_Gate()
	 * @model required="true"
	 * @generated
	 */
	String getGate();

	/**
	 * Sets the value of the '{@link eaglemodel.Connect#getGate <em>Gate</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getConnect_Pin()
	 * @model required="true"
	 * @generated
	 */
	String getPin();

	/**
	 * Sets the value of the '{@link eaglemodel.Connect#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(String value);

	/**
	 * Returns the value of the '<em><b>Pad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad</em>' attribute.
	 * @see #setPad(String)
	 * @see eaglemodel.EaglemodelPackage#getConnect_Pad()
	 * @model required="true"
	 * @generated
	 */
	String getPad();

	/**
	 * Sets the value of the '{@link eaglemodel.Connect#getPad <em>Pad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pad</em>' attribute.
	 * @see #getPad()
	 * @generated
	 */
	void setPad(String value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * The default value is <code>"all"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.ContactRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see eaglemodel.Enums.ContactRoute
	 * @see #setRoute(ContactRoute)
	 * @see eaglemodel.EaglemodelPackage#getConnect_Route()
	 * @model default="all"
	 * @generated
	 */
	ContactRoute getRoute();

	/**
	 * Sets the value of the '{@link eaglemodel.Connect#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see eaglemodel.Enums.ContactRoute
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(ContactRoute value);

} // Connect
