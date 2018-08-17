/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Pad#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Pad#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Pad#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Pad#getDrill <em>Drill</em>}</li>
 *   <li>{@link eaglemodel.Pad#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link eaglemodel.Pad#getShape <em>Shape</em>}</li>
 *   <li>{@link eaglemodel.Pad#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.Pad#isStop <em>Stop</em>}</li>
 *   <li>{@link eaglemodel.Pad#isThermals <em>Thermals</em>}</li>
 *   <li>{@link eaglemodel.Pad#isFirst <em>First</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getPad()
 * @model
 * @generated
 */
public interface Pad extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getPad_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getName <em>Name</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getPad_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getPad_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Drill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drill</em>' attribute.
	 * @see #setDrill(double)
	 * @see eaglemodel.EaglemodelPackage#getPad_Drill()
	 * @model required="true"
	 * @generated
	 */
	double getDrill();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getDrill <em>Drill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drill</em>' attribute.
	 * @see #getDrill()
	 * @generated
	 */
	void setDrill(double value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #setDiameter(double)
	 * @see eaglemodel.EaglemodelPackage#getPad_Diameter()
	 * @model
	 * @generated
	 */
	double getDiameter();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(double value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"round"</code>.
	 * The literals are from the enumeration {@link eaglemodel.PadShape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see eaglemodel.PadShape
	 * @see #setShape(PadShape)
	 * @see eaglemodel.EaglemodelPackage#getPad_Shape()
	 * @model default="round"
	 * @generated
	 */
	PadShape getShape();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see eaglemodel.PadShape
	 * @see #getShape()
	 * @generated
	 */
	void setShape(PadShape value);

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
	 * @see eaglemodel.EaglemodelPackage#getPad_Rot()
	 * @model
	 * @generated
	 */
	double getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(double value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' attribute.
	 * @see #setStop(boolean)
	 * @see eaglemodel.EaglemodelPackage#getPad_Stop()
	 * @model default="true"
	 * @generated
	 */
	boolean isStop();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#isStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #isStop()
	 * @generated
	 */
	void setStop(boolean value);

	/**
	 * Returns the value of the '<em><b>Thermals</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermals</em>' attribute.
	 * @see #setThermals(boolean)
	 * @see eaglemodel.EaglemodelPackage#getPad_Thermals()
	 * @model default="true"
	 * @generated
	 */
	boolean isThermals();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#isThermals <em>Thermals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermals</em>' attribute.
	 * @see #isThermals()
	 * @generated
	 */
	void setThermals(boolean value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' attribute.
	 * @see #setFirst(boolean)
	 * @see eaglemodel.EaglemodelPackage#getPad_First()
	 * @model default="false"
	 * @generated
	 */
	boolean isFirst();

	/**
	 * Sets the value of the '{@link eaglemodel.Pad#isFirst <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' attribute.
	 * @see #isFirst()
	 * @generated
	 */
	void setFirst(boolean value);

} // Pad
