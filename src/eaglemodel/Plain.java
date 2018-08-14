/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Plain#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link eaglemodel.Plain#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.Plain#getText <em>Text</em>}</li>
 *   <li>{@link eaglemodel.Plain#getDimension <em>Dimension</em>}</li>
 *   <li>{@link eaglemodel.Plain#getCircle <em>Circle</em>}</li>
 *   <li>{@link eaglemodel.Plain#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link eaglemodel.Plain#getFrame <em>Frame</em>}</li>
 *   <li>{@link eaglemodel.Plain#getHole <em>Hole</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getPlain()
 * @model
 * @generated
 */
public interface Plain extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Polygon()
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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Wire()
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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Text()
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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Dimension()
	 * @model type="eaglemodel.Dimension"
	 * @generated
	 */
	EList getDimension();

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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Circle()
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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Rectangle()
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
	 * @see eaglemodel.EaglemodelPackage#getPlain_Frame()
	 * @model type="eaglemodel.Frame"
	 * @generated
	 */
	EList getFrame();

	/**
	 * Returns the value of the '<em><b>Hole</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Hole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hole</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getPlain_Hole()
	 * @model type="eaglemodel.Hole"
	 * @generated
	 */
	EList getHole();

} // Plain
