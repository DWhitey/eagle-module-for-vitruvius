/**
 */
package eaglemodel;

import eaglemodel.Enums.TextFont;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Label#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Label#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Label#getSize <em>Size</em>}</li>
 *   <li>{@link eaglemodel.Label#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.Label#getFont <em>Font</em>}</li>
 *   <li>{@link eaglemodel.Label#getRatio <em>Ratio</em>}</li>
 *   <li>{@link eaglemodel.Label#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.Label#isXref <em>Xref</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see eaglemodel.EaglemodelPackage#getLabel_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Size()
	 * @model required="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see #setLayer(int)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Layer()
	 * @model required="true"
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(int value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * The default value is <code>"proportional"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.TextFont}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see eaglemodel.Enums.TextFont
	 * @see #setFont(TextFont)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Font()
	 * @model default="proportional"
	 * @generated
	 */
	TextFont getFont();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see eaglemodel.Enums.TextFont
	 * @see #getFont()
	 * @generated
	 */
	void setFont(TextFont value);

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(int)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Ratio()
	 * @model default="8"
	 * @generated
	 */
	int getRatio();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(int value);

	/**
	 * Returns the value of the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rot</em>' attribute.
	 * @see #setRot(double)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Rot()
	 * @model
	 * @generated
	 */
	double getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(double value);

	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(boolean)
	 * @see eaglemodel.EaglemodelPackage#getLabel_Xref()
	 * @model default="false"
	 * @generated
	 */
	boolean isXref();

	/**
	 * Sets the value of the '{@link eaglemodel.Label#isXref <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' attribute.
	 * @see #isXref()
	 * @generated
	 */
	void setXref(boolean value);

} // Label
