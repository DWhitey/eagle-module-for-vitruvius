/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Package#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.Package#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link eaglemodel.Package#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.Package#getText <em>Text</em>}</li>
 *   <li>{@link eaglemodel.Package#getDimension <em>Dimension</em>}</li>
 *   <li>{@link eaglemodel.Package#getCircle <em>Circle</em>}</li>
 *   <li>{@link eaglemodel.Package#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link eaglemodel.Package#getFrame <em>Frame</em>}</li>
 *   <li>{@link eaglemodel.Package#getHole <em>Hole</em>}</li>
 *   <li>{@link eaglemodel.Package#getPad <em>Pad</em>}</li>
 *   <li>{@link eaglemodel.Package#getSmd <em>Smd</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Package#getName <em>Name</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Description()
	 * @model
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link eaglemodel.Package#getDescription <em>Description</em>}' reference.
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Polygon()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Wire()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Text()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Dimension()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Circle()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Rectangle()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Frame()
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
	 * @see eaglemodel.EaglemodelPackage#getPackage_Hole()
	 * @model type="eaglemodel.Hole"
	 * @generated
	 */
	EList getHole();

	/**
	 * Returns the value of the '<em><b>Pad</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Pad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getPackage_Pad()
	 * @model type="eaglemodel.Pad"
	 * @generated
	 */
	EList getPad();

	/**
	 * Returns the value of the '<em><b>Smd</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.SMD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smd</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smd</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getPackage_Smd()
	 * @model type="eaglemodel.SMD"
	 * @generated
	 */
	EList getSmd();

} // Package
