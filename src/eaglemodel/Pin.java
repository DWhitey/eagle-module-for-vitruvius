/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Pin#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Pin#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Pin#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Pin#getVisible <em>Visible</em>}</li>
 *   <li>{@link eaglemodel.Pin#getLength <em>Length</em>}</li>
 *   <li>{@link eaglemodel.Pin#getDirection <em>Direction</em>}</li>
 *   <li>{@link eaglemodel.Pin#getFunction <em>Function</em>}</li>
 *   <li>{@link eaglemodel.Pin#getSwaplevel <em>Swaplevel</em>}</li>
 *   <li>{@link eaglemodel.Pin#getRot <em>Rot</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getPin_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getPin_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getPin_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"both"</code>.
	 * The literals are from the enumeration {@link eaglemodel.PinVisible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see eaglemodel.PinVisible
	 * @see #setVisible(PinVisible)
	 * @see eaglemodel.EaglemodelPackage#getPin_Visible()
	 * @model default="both"
	 * @generated
	 */
	PinVisible getVisible();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see eaglemodel.PinVisible
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(PinVisible value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"long"</code>.
	 * The literals are from the enumeration {@link eaglemodel.PinLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see eaglemodel.PinLength
	 * @see #setLength(PinLength)
	 * @see eaglemodel.EaglemodelPackage#getPin_Length()
	 * @model default="long"
	 * @generated
	 */
	PinLength getLength();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see eaglemodel.PinLength
	 * @see #getLength()
	 * @generated
	 */
	void setLength(PinLength value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"io"</code>.
	 * The literals are from the enumeration {@link eaglemodel.PinDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see eaglemodel.PinDirection
	 * @see #setDirection(PinDirection)
	 * @see eaglemodel.EaglemodelPackage#getPin_Direction()
	 * @model default="io"
	 * @generated
	 */
	PinDirection getDirection();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see eaglemodel.PinDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PinDirection value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link eaglemodel.PinFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see eaglemodel.PinFunction
	 * @see #setFunction(PinFunction)
	 * @see eaglemodel.EaglemodelPackage#getPin_Function()
	 * @model default="none"
	 * @generated
	 */
	PinFunction getFunction();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see eaglemodel.PinFunction
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(PinFunction value);

	/**
	 * Returns the value of the '<em><b>Swaplevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swaplevel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swaplevel</em>' attribute.
	 * @see #setSwaplevel(int)
	 * @see eaglemodel.EaglemodelPackage#getPin_Swaplevel()
	 * @model
	 * @generated
	 */
	int getSwaplevel();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getSwaplevel <em>Swaplevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swaplevel</em>' attribute.
	 * @see #getSwaplevel()
	 * @generated
	 */
	void setSwaplevel(int value);

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
	 * @see eaglemodel.EaglemodelPackage#getPin_Rot()
	 * @model
	 * @generated
	 */
	double getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Pin#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(double value);

} // Pin
