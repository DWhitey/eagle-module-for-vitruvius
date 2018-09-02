/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getSize <em>Size</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getFont <em>Font</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getRatio <em>Ratio</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.Attribute#getDisplay <em>Display</em>}</li>
 *   <li>{@link eaglemodel.Attribute#isConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getAttribute_X()
	 * @model
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Y()
	 * @model
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getY <em>Y</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getSize <em>Size</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Layer()
	 * @model
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(int value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * The default value is <code>"vector"</code>.
	 * The literals are from the enumeration {@link eaglemodel.TextFont}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see eaglemodel.TextFont
	 * @see #setFont(TextFont)
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Font()
	 * @model default="vector"
	 * @generated
	 */
	TextFont getFont();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see eaglemodel.TextFont
	 * @see #getFont()
	 * @generated
	 */
	void setFont(TextFont value);

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(int)
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Ratio()
	 * @model
	 * @generated
	 */
	int getRatio();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getRatio <em>Ratio</em>}' attribute.
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
	 * @see #setRot(int)
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Rot()
	 * @model
	 * @generated
	 */
	int getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(int value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The default value is <code>"value"</code>.
	 * The literals are from the enumeration {@link eaglemodel.AttributeDisplay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see eaglemodel.AttributeDisplay
	 * @see #setDisplay(AttributeDisplay)
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Display()
	 * @model default="value"
	 * @generated
	 */
	AttributeDisplay getDisplay();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see eaglemodel.AttributeDisplay
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(AttributeDisplay value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see eaglemodel.EaglemodelPackage#getAttribute_Constant()
	 * @model default="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link eaglemodel.Attribute#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

} // Attribute
