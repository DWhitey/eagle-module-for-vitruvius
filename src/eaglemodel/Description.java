/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Description#getLanguage <em>Language</em>}</li>
 *   <li>{@link eaglemodel.Description#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"en"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see eaglemodel.EaglemodelPackage#getDescription_Language()
	 * @model default="en"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link eaglemodel.Description#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eaglemodel.EaglemodelPackage#getDescription_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eaglemodel.Description#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Description
