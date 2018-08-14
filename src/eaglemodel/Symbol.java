/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Symbol#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getText <em>Text</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getDimension <em>Dimension</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getPin <em>Pin</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getCircle <em>Circle</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link eaglemodel.Symbol#getFrame <em>Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Symbol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Description)
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Symbol#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Polygon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Polygon()
	 * @model type="eaglemodel.Polygon"
	 * @generated
	 */
	EList getPolygon();

	/**
	 * Returns the value of the '<em><b>Wire</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Wire()
	 * @model type="eaglemodel.Wire"
	 * @generated
	 */
	EList getWire();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Text()
	 * @model type="eaglemodel.Text"
	 * @generated
	 */
	EList getText();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Dimension()
	 * @model type="eaglemodel.Dimension"
	 * @generated
	 */
	EList getDimension();

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Pin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Pin()
	 * @model type="eaglemodel.Pin"
	 * @generated
	 */
	EList getPin();

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Circle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Circle()
	 * @model type="eaglemodel.Circle"
	 * @generated
	 */
	EList getCircle();

	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Rectangle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Rectangle()
	 * @model type="eaglemodel.Rectangle"
	 * @generated
	 */
	EList getRectangle();

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Frame}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbol_Frame()
	 * @model type="eaglemodel.Frame"
	 * @generated
	 */
	EList getFrame();

} // Symbol
