/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Device#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Device#getPackage <em>Package</em>}</li>
 *   <li>{@link eaglemodel.Device#getConnects <em>Connects</em>}</li>
 *   <li>{@link eaglemodel.Device#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see eaglemodel.EaglemodelPackage#getDevice_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link eaglemodel.Device#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Connects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' containment reference.
	 * @see #setConnects(Connects)
	 * @see eaglemodel.EaglemodelPackage#getDevice_Connects()
	 * @model containment="true"
	 * @generated
	 */
	Connects getConnects();

	/**
	 * Sets the value of the '{@link eaglemodel.Device#getConnects <em>Connects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connects</em>' containment reference.
	 * @see #getConnects()
	 * @generated
	 */
	void setConnects(Connects value);

	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technologies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologies</em>' containment reference.
	 * @see #setTechnologies(Technologies)
	 * @see eaglemodel.EaglemodelPackage#getDevice_Technologies()
	 * @model containment="true"
	 * @generated
	 */
	Technologies getTechnologies();

	/**
	 * Sets the value of the '{@link eaglemodel.Device#getTechnologies <em>Technologies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technologies</em>' containment reference.
	 * @see #getTechnologies()
	 * @generated
	 */
	void setTechnologies(Technologies value);

} // Device
