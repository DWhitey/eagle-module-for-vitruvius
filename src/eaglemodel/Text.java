/**
 */
package eaglemodel;

import eaglemodel.Enums.Align;
import eaglemodel.Enums.TextFont;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Text#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Text#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Text#getSize <em>Size</em>}</li>
 *   <li>{@link eaglemodel.Text#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.Text#getFont <em>Font</em>}</li>
 *   <li>{@link eaglemodel.Text#getRatio <em>Ratio</em>}</li>
 *   <li>{@link eaglemodel.Text#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.Text#getAlign <em>Align</em>}</li>
 *   <li>{@link eaglemodel.Text#getDistance <em>Distance</em>}</li>
 *   <li>{@link eaglemodel.Text#getPcdata <em>Pcdata</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getText()
 * @model
 * @generated
 */
public interface Text extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getText_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getText_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getY <em>Y</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getText_Size()
	 * @model required="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getSize <em>Size</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getText_Layer()
	 * @model required="true"
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getLayer <em>Layer</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getText_Font()
	 * @model default="proportional"
	 * @generated
	 */
	TextFont getFont();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getFont <em>Font</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getText_Ratio()
	 * @model default="8"
	 * @generated
	 */
	int getRatio();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getRatio <em>Ratio</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getText_Rot()
	 * @model
	 * @generated
	 */
	double getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(double value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The default value is <code>"bottom-left"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.Align}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see eaglemodel.Enums.Align
	 * @see #setAlign(Align)
	 * @see eaglemodel.EaglemodelPackage#getText_Align()
	 * @model default="bottom-left"
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see eaglemodel.Enums.Align
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see eaglemodel.EaglemodelPackage#getText_Distance()
	 * @model default="50"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Pcdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcdata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcdata</em>' attribute.
	 * @see #setPcdata(String)
	 * @see eaglemodel.EaglemodelPackage#getText_Pcdata()
	 * @model
	 * @generated
	 */
	String getPcdata();

	/**
	 * Sets the value of the '{@link eaglemodel.Text#getPcdata <em>Pcdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcdata</em>' attribute.
	 * @see #getPcdata()
	 * @generated
	 */
	void setPcdata(String value);

} // Text
