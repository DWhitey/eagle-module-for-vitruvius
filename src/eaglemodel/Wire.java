/**
 */
package eaglemodel;

import eaglemodel.Enums.WireCap;
import eaglemodel.Enums.WireStyle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Wire#getX1 <em>X1</em>}</li>
 *   <li>{@link eaglemodel.Wire#getY1 <em>Y1</em>}</li>
 *   <li>{@link eaglemodel.Wire#getX2 <em>X2</em>}</li>
 *   <li>{@link eaglemodel.Wire#getY2 <em>Y2</em>}</li>
 *   <li>{@link eaglemodel.Wire#getWidth <em>Width</em>}</li>
 *   <li>{@link eaglemodel.Wire#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.Wire#getExtent <em>Extent</em>}</li>
 *   <li>{@link eaglemodel.Wire#getStyle <em>Style</em>}</li>
 *   <li>{@link eaglemodel.Wire#getCurve <em>Curve</em>}</li>
 *   <li>{@link eaglemodel.Wire#getCap <em>Cap</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getWire()
 * @model
 * @generated
 */
public interface Wire extends EObject {
	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #setX1(double)
	 * @see eaglemodel.EaglemodelPackage#getWire_X1()
	 * @model required="true"
	 * @generated
	 */
	double getX1();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(double value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #setY1(double)
	 * @see eaglemodel.EaglemodelPackage#getWire_Y1()
	 * @model required="true"
	 * @generated
	 */
	double getY1();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(double value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #setX2(double)
	 * @see eaglemodel.EaglemodelPackage#getWire_X2()
	 * @model required="true"
	 * @generated
	 */
	double getX2();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(double value);

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #setY2(double)
	 * @see eaglemodel.EaglemodelPackage#getWire_Y2()
	 * @model required="true"
	 * @generated
	 */
	double getY2();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see eaglemodel.EaglemodelPackage#getWire_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

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
	 * @see eaglemodel.EaglemodelPackage#getWire_Layer()
	 * @model required="true"
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(int value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' attribute.
	 * @see #setExtent(String)
	 * @see eaglemodel.EaglemodelPackage#getWire_Extent()
	 * @model
	 * @generated
	 */
	String getExtent();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getExtent <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' attribute.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"continuous"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.WireStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see eaglemodel.Enums.WireStyle
	 * @see #setStyle(WireStyle)
	 * @see eaglemodel.EaglemodelPackage#getWire_Style()
	 * @model default="continuous"
	 * @generated
	 */
	WireStyle getStyle();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see eaglemodel.Enums.WireStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(WireStyle value);

	/**
	 * Returns the value of the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' attribute.
	 * @see #setCurve(double)
	 * @see eaglemodel.EaglemodelPackage#getWire_Curve()
	 * @model
	 * @generated
	 */
	double getCurve();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getCurve <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' attribute.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(double value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' attribute.
	 * The default value is <code>"round"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.WireCap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' attribute.
	 * @see eaglemodel.Enums.WireCap
	 * @see #setCap(WireCap)
	 * @see eaglemodel.EaglemodelPackage#getWire_Cap()
	 * @model default="round"
	 * @generated
	 */
	WireCap getCap();

	/**
	 * Sets the value of the '{@link eaglemodel.Wire#getCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' attribute.
	 * @see eaglemodel.Enums.WireCap
	 * @see #getCap()
	 * @generated
	 */
	void setCap(WireCap value);

} // Wire
