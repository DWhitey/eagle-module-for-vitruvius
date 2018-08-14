/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Library#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Library#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Library#getPackages <em>Packages</em>}</li>
 *   <li>{@link eaglemodel.Library#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link eaglemodel.Library#getDevicesets <em>Devicesets</em>}</li>
 * </ul>
 * </p>
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
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Description)
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Library#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Packages()
	 * @model type="eaglemodel.Package"
	 * @generated
	 */
	EList getPackages();

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Symbols()
	 * @model type="eaglemodel.Symbol"
	 * @generated
	 */
	EList getSymbols();

	/**
	 * Returns the value of the '<em><b>Devicesets</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Deviceset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devicesets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devicesets</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getLibrary_Devicesets()
	 * @model type="eaglemodel.Deviceset"
	 * @generated
	 */
	EList getDevicesets();

} // Library
