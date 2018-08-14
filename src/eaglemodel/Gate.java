/**
 */
package eaglemodel;

import eaglemodel.Enums.GateAddLevel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Gate#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Gate#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link eaglemodel.Gate#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Gate#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Gate#getAddlevel <em>Addlevel</em>}</li>
 *   <li>{@link eaglemodel.Gate#getSwaplevel <em>Swaplevel</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getGate_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Gate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see eaglemodel.EaglemodelPackage#getGate_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link eaglemodel.Gate#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getGate_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Gate#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getGate_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Gate#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Addlevel</b></em>' attribute.
	 * The default value is <code>"next"</code>.
	 * The literals are from the enumeration {@link eaglemodel.Enums.GateAddLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addlevel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addlevel</em>' attribute.
	 * @see eaglemodel.Enums.GateAddLevel
	 * @see #setAddlevel(GateAddLevel)
	 * @see eaglemodel.EaglemodelPackage#getGate_Addlevel()
	 * @model default="next"
	 * @generated
	 */
	GateAddLevel getAddlevel();

	/**
	 * Sets the value of the '{@link eaglemodel.Gate#getAddlevel <em>Addlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addlevel</em>' attribute.
	 * @see eaglemodel.Enums.GateAddLevel
	 * @see #getAddlevel()
	 * @generated
	 */
	void setAddlevel(GateAddLevel value);

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
	 * @see eaglemodel.EaglemodelPackage#getGate_Swaplevel()
	 * @model
	 * @generated
	 */
	int getSwaplevel();

	/**
	 * Sets the value of the '{@link eaglemodel.Gate#getSwaplevel <em>Swaplevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swaplevel</em>' attribute.
	 * @see #getSwaplevel()
	 * @generated
	 */
	void setSwaplevel(int value);

} // Gate
