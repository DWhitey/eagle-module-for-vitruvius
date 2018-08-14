/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schematic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Schematic#getXreflabel <em>Xreflabel</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getXrefpart <em>Xrefpart</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getVariantdefs <em>Variantdefs</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getClasses <em>Classes</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getParts <em>Parts</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getSheets <em>Sheets</em>}</li>
 *   <li>{@link eaglemodel.Schematic#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSchematic()
 * @model
 * @generated
 */
public interface Schematic extends EObject {
	/**
	 * Returns the value of the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xreflabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xreflabel</em>' attribute.
	 * @see #setXreflabel(String)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Xreflabel()
	 * @model
	 * @generated
	 */
	String getXreflabel();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(String value);

	/**
	 * Returns the value of the '<em><b>Xrefpart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xrefpart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xrefpart</em>' attribute.
	 * @see #setXrefpart(String)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Xrefpart()
	 * @model
	 * @generated
	 */
	String getXrefpart();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getXrefpart <em>Xrefpart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xrefpart</em>' attribute.
	 * @see #getXrefpart()
	 * @generated
	 */
	void setXrefpart(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Libraries()
	 * @model type="eaglemodel.Library"
	 * @generated
	 */
	EList getLibraries();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Attributes()
	 * @model type="eaglemodel.Attribute"
	 * @generated
	 */
	EList getAttributes();

	/**
	 * Returns the value of the '<em><b>Variantdefs</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Variantdef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variantdefs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variantdefs</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Variantdefs()
	 * @model type="eaglemodel.Variantdef"
	 * @generated
	 */
	EList getVariantdefs();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Classes()
	 * @model type="eaglemodel.Class"
	 * @generated
	 */
	EList getClasses();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Parts()
	 * @model type="eaglemodel.Part"
	 * @generated
	 */
	EList getParts();

	/**
	 * Returns the value of the '<em><b>Sheets</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Sheet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Sheets()
	 * @model type="eaglemodel.Sheet"
	 * @generated
	 */
	EList getSheets();

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Approved}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Errors()
	 * @model type="eaglemodel.Approved"
	 * @generated
	 */
	EList getErrors();

} // Schematic
