/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Rectangle#getX1 <em>X1</em>}</li>
 *   <li>{@link eaglemodel.Rectangle#getY1 <em>Y1</em>}</li>
 *   <li>{@link eaglemodel.Rectangle#getX2 <em>X2</em>}</li>
 *   <li>{@link eaglemodel.Rectangle#getY2 <em>Y2</em>}</li>
 *   <li>{@link eaglemodel.Rectangle#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.Rectangle#getRot <em>Rot</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getRectangle_X1()
	 * @model required="true"
	 * @generated
	 */
	double getX1();

	/**
	 * Sets the value of the '{@link eaglemodel.Rectangle#getX1 <em>X1</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getRectangle_Y1()
	 * @model required="true"
	 * @generated
	 */
	double getY1();

	/**
	 * Sets the value of the '{@link eaglemodel.Rectangle#getY1 <em>Y1</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getRectangle_X2()
	 * @model required="true"
	 * @generated
	 */
	double getX2();

	/**
	 * Sets the value of the '{@link eaglemodel.Rectangle#getX2 <em>X2</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getRectangle_Y2()
	 * @model required="true"
	 * @generated
	 */
	double getY2();

	/**
	 * Sets the value of the '{@link eaglemodel.Rectangle#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(double value);

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
	 * @see eaglemodel.EaglemodelPackage#getRectangle_Layer()
	 * @model required="true"
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link eaglemodel.Rectangle#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(int value);

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
	 * @see eaglemodel.EaglemodelPackage#getRectangle_Rot()
	 * @model
	 * @generated
	 */
	double getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Rectangle#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(double value);

} // Rectangle
