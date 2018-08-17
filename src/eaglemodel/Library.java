/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Library#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Library#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Library#getPackages <em>Packages</em>}</li>
 *   <li>{@link eaglemodel.Library#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link eaglemodel.Library#getDevicesets <em>Devicesets</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Library#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference.
	 * @see #setPackages(Packages)
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Packages()
	 * @model containment="true"
	 * @generated
	 */
	Packages getPackages();

	/**
	 * Sets the value of the '{@link eaglemodel.Library#getPackages <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' containment reference.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(Packages value);

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference.
	 * @see #setSymbols(Symbols)
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Symbols()
	 * @model containment="true"
	 * @generated
	 */
	Symbols getSymbols();

	/**
	 * Sets the value of the '{@link eaglemodel.Library#getSymbols <em>Symbols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbols</em>' containment reference.
	 * @see #getSymbols()
	 * @generated
	 */
	void setSymbols(Symbols value);

	/**
	 * Returns the value of the '<em><b>Devicesets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicesets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicesets</em>' containment reference.
	 * @see #setDevicesets(Devicesets)
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Devicesets()
	 * @model containment="true"
	 * @generated
	 */
	Devicesets getDevicesets();

	/**
	 * Sets the value of the '{@link eaglemodel.Library#getDevicesets <em>Devicesets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devicesets</em>' containment reference.
	 * @see #getDevicesets()
	 * @generated
	 */
	void setDevicesets(Devicesets value);

} // Library
