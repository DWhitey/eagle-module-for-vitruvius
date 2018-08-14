/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviceset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Deviceset#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#isUservalue <em>Uservalue</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getGates <em>Gates</em>}</li>
 *   <li>{@link eaglemodel.Deviceset#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
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
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Description)
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Deviceset#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Gates()
	 * @model type="eaglemodel.Gate" required="true"
	 * @generated
	 */
	EList getGates();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getDeviceset_Devices()
	 * @model type="eaglemodel.Device" required="true"
	 * @generated
	 */
	EList getDevices();

} // Deviceset
