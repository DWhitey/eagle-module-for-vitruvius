/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Instance#getPart <em>Part</em>}</li>
 *   <li>{@link eaglemodel.Instance#getGate <em>Gate</em>}</li>
 *   <li>{@link eaglemodel.Instance#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Instance#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Instance#isSmashed <em>Smashed</em>}</li>
 *   <li>{@link eaglemodel.Instance#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.Instance#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see eaglemodel.EaglemodelPackage#getInstance_Part()
	 * @model required="true"
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link eaglemodel.Instance#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' attribute.
	 * @see #setGate(String)
	 * @see eaglemodel.EaglemodelPackage#getInstance_Gate()
	 * @model required="true"
	 * @generated
	 */
	String getGate();

	/**
	 * Sets the value of the '{@link eaglemodel.Instance#getGate <em>Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' attribute.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(String value);

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
	 * @see eaglemodel.EaglemodelPackage#getInstance_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Instance#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getInstance_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Instance#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Smashed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smashed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smashed</em>' attribute.
	 * @see #setSmashed(boolean)
	 * @see eaglemodel.EaglemodelPackage#getInstance_Smashed()
	 * @model default="false"
	 * @generated
	 */
	boolean isSmashed();

	/**
	 * Sets the value of the '{@link eaglemodel.Instance#isSmashed <em>Smashed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smashed</em>' attribute.
	 * @see #isSmashed()
	 * @generated
	 */
	void setSmashed(boolean value);

	/**
	 * Returns the value of the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rot</em>' attribute.
	 * @see #setRot(int)
	 * @see eaglemodel.EaglemodelPackage#getInstance_Rot()
	 * @model
	 * @generated
	 */
	int getRot();

	/**
	 * Sets the value of the '{@link eaglemodel.Instance#getRot <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot</em>' attribute.
	 * @see #getRot()
	 * @generated
	 */
	void setRot(int value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getInstance_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // Instance
