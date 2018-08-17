/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviceset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Deviceset#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#isUservalue <em>Uservalue</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getGates <em>Gates</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getDeviceset()
 * @model
 * @generated
 */
public interface Deviceset extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Uservalue</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uservalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uservalue</em>' attribute.
	 * @see #setUservalue(boolean)
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Uservalue()
	 * @model default="false"
	 * @generated
	 */
	boolean isUservalue();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#isUservalue <em>Uservalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uservalue</em>' attribute.
	 * @see #isUservalue()
	 * @generated
	 */
	void setUservalue(boolean value);

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
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference.
	 * @see #setGates(Gates)
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Gates()
	 * @model containment="true"
	 * @generated
	 */
	Gates getGates();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#getGates <em>Gates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gates</em>' containment reference.
	 * @see #getGates()
	 * @generated
	 */
	void setGates(Gates value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference.
	 * @see #setDevices(Devices)
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Devices()
	 * @model containment="true"
	 * @generated
	 */
	Devices getDevices();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#getDevices <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices</em>' containment reference.
	 * @see #getDevices()
	 * @generated
	 */
	void setDevices(Devices value);

} // Deviceset
