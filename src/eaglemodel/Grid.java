/**
 */
package eaglemodel;

import eaglemodel.Enums.GridStyle;
import eaglemodel.Enums.GridUnit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Grid#getDistance <em>Distance</em>}</li>
 *   <li>{@link eaglemodel.Grid#getUnitdist <em>Unitdist</em>}</li>
 *   <li>{@link eaglemodel.Grid#getUnit <em>Unit</em>}</li>
 *   <li>{@link eaglemodel.Grid#getStyle <em>Style</em>}</li>
 *   <li>{@link eaglemodel.Grid#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link eaglemodel.Grid#isDisplay <em>Display</em>}</li>
 *   <li>{@link eaglemodel.Grid#getAltdistance <em>Altdistance</em>}</li>
 *   <li>{@link eaglemodel.Grid#getAltunitdist <em>Altunitdist</em>}</li>
 *   <li>{@link eaglemodel.Grid#getAltunit <em>Altunit</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Unitdist</b></em>' attribute.
	 * The default value is <code>"mic"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.GridUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unitdist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unitdist</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #setUnitdist(GridUnit)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Unitdist()
	 * @model default="mic"
	 * @generated
	 */
	GridUnit getUnitdist();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getUnitdist <em>Unitdist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unitdist</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #getUnitdist()
	 * @generated
	 */
	void setUnitdist(GridUnit value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"mic"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.GridUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #setUnit(GridUnit)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Unit()
	 * @model default="mic"
	 * @generated
	 */
	GridUnit getUnit();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GridUnit value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"lines"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.GridStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see eaglemodel.Enums.GridStyle
	 * @see #setStyle(GridStyle)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Style()
	 * @model default="lines"
	 * @generated
	 */
	GridStyle getStyle();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see eaglemodel.Enums.GridStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(GridStyle value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(int)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Multiple()
	 * @model default="1"
	 * @generated
	 */
	int getMultiple();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(int value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(boolean)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Display()
	 * @model default="false"
	 * @generated
	 */
	boolean isDisplay();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#isDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #isDisplay()
	 * @generated
	 */
	void setDisplay(boolean value);

	/**
	 * Returns the value of the '<em><b>Altdistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altdistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altdistance</em>' attribute.
	 * @see #setAltdistance(double)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Altdistance()
	 * @model
	 * @generated
	 */
	double getAltdistance();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getAltdistance <em>Altdistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altdistance</em>' attribute.
	 * @see #getAltdistance()
	 * @generated
	 */
	void setAltdistance(double value);

	/**
	 * Returns the value of the '<em><b>Altunitdist</b></em>' attribute.
	 * The default value is <code>"mic"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.GridUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altunitdist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altunitdist</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #setAltunitdist(GridUnit)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Altunitdist()
	 * @model default="mic"
	 * @generated
	 */
	GridUnit getAltunitdist();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getAltunitdist <em>Altunitdist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altunitdist</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #getAltunitdist()
	 * @generated
	 */
	void setAltunitdist(GridUnit value);

	/**
	 * Returns the value of the '<em><b>Altunit</b></em>' attribute.
	 * The default value is <code>"mic"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.GridUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altunit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altunit</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #setAltunit(GridUnit)
	 * @see eaglemodel.EaglemodelPackage#getGrid_Altunit()
	 * @model default="mic"
	 * @generated
	 */
	GridUnit getAltunit();

	/**
	 * Sets the value of the '{@link eaglemodel.Grid#getAltunit <em>Altunit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altunit</em>' attribute.
	 * @see eaglemodel.Enums.GridUnit
	 * @see #getAltunit()
	 * @generated
	 */
	void setAltunit(GridUnit value);

} // Grid
