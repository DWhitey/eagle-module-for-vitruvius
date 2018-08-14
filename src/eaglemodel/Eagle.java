/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eagle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Eagle#getVersion <em>Version</em>}</li>
 *   <li>{@link eaglemodel.Eagle#getCompatibility <em>Compatibility</em>}</li>
 *   <li>{@link eaglemodel.Eagle#getDrawing <em>Drawing</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getEagle()
 * @model
 * @generated
 */
public interface Eagle extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eaglemodel.EaglemodelPackage#getEagle_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eaglemodel.Eagle#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Compatibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibility</em>' reference.
	 * @see #setCompatibility(Compatibility)
	 * @see eaglemodel.EaglemodelPackage#getEagle_Compatibility()
	 * @model
	 * @generated
	 */
	Compatibility getCompatibility();

	/**
	 * Sets the value of the '{@link eaglemodel.Eagle#getCompatibility <em>Compatibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatibility</em>' reference.
	 * @see #getCompatibility()
	 * @generated
	 */
	void setCompatibility(Compatibility value);

	/**
	 * Returns the value of the '<em><b>Drawing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawing</em>' reference.
	 * @see #setDrawing(Drawing)
	 * @see eaglemodel.EaglemodelPackage#getEagle_Drawing()
	 * @model required="true"
	 * @generated
	 */
	Drawing getDrawing();

	/**
	 * Sets the value of the '{@link eaglemodel.Eagle#getDrawing <em>Drawing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawing</em>' reference.
	 * @see #getDrawing()
	 * @generated
	 */
	void setDrawing(Drawing value);

} // Eagle
