/**
 */
package eaglemodel;

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
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference.
	 * @see #setLibraries(Libraries)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Libraries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Libraries getLibraries();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getLibraries <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraries</em>' containment reference.
	 * @see #getLibraries()
	 * @generated
	 */
	void setLibraries(Libraries value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(Attributes)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attributes getAttributes();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attributes value);

	/**
	 * Returns the value of the '<em><b>Variantdefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variantdefs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variantdefs</em>' containment reference.
	 * @see #setVariantdefs(Variantdefs)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Variantdefs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variantdefs getVariantdefs();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getVariantdefs <em>Variantdefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variantdefs</em>' containment reference.
	 * @see #getVariantdefs()
	 * @generated
	 */
	void setVariantdefs(Variantdefs value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference.
	 * @see #setClasses(Classes)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Classes getClasses();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getClasses <em>Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' containment reference.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(Classes value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference.
	 * @see #setParts(Parts)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Parts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parts getParts();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getParts <em>Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parts</em>' containment reference.
	 * @see #getParts()
	 * @generated
	 */
	void setParts(Parts value);

	/**
	 * Returns the value of the '<em><b>Sheets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheets</em>' containment reference.
	 * @see #setSheets(Sheets)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Sheets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sheets getSheets();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getSheets <em>Sheets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheets</em>' containment reference.
	 * @see #getSheets()
	 * @generated
	 */
	void setSheets(Sheets value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference.
	 * @see #setErrors(Errors)
	 * @see eaglemodel.EaglemodelPackage#getSchematic_Errors()
	 * @model containment="true"
	 * @generated
	 */
	Errors getErrors();

	/**
	 * Sets the value of the '{@link eaglemodel.Schematic#getErrors <em>Errors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' containment reference.
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(Errors value);

} // Schematic
