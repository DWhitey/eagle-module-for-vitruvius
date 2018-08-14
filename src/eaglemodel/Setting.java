/**
 */
package eaglemodel;

import eaglemodel.Enums.VerticalText;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Setting#isAlwaysvectorfont <em>Alwaysvectorfont</em>}</li>
 *   <li>{@link eaglemodel.Setting#getVerticaltext <em>Verticaltext</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSetting()
 * @model
 * @generated
 */
public interface Setting extends EObject {
	/**
	 * Returns the value of the '<em><b>Alwaysvectorfont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alwaysvectorfont</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alwaysvectorfont</em>' attribute.
	 * @see #setAlwaysvectorfont(boolean)
	 * @see eaglemodel.EaglemodelPackage#getSetting_Alwaysvectorfont()
	 * @model
	 * @generated
	 */
	boolean isAlwaysvectorfont();

	/**
	 * Sets the value of the '{@link eaglemodel.Setting#isAlwaysvectorfont <em>Alwaysvectorfont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alwaysvectorfont</em>' attribute.
	 * @see #isAlwaysvectorfont()
	 * @generated
	 */
	void setAlwaysvectorfont(boolean value);

	/**
	 * Returns the value of the '<em><b>Verticaltext</b></em>' attribute.
	 * The default value is <code>"up"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.VerticalText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verticaltext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verticaltext</em>' attribute.
	 * @see eaglemodel.Enums.VerticalText
	 * @see #setVerticaltext(VerticalText)
	 * @see eaglemodel.EaglemodelPackage#getSetting_Verticaltext()
	 * @model default="up"
	 * @generated
	 */
	VerticalText getVerticaltext();

	/**
	 * Sets the value of the '{@link eaglemodel.Setting#getVerticaltext <em>Verticaltext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verticaltext</em>' attribute.
	 * @see eaglemodel.Enums.VerticalText
	 * @see #getVerticaltext()
	 * @generated
	 */
	void setVerticaltext(VerticalText value);

} // Setting
