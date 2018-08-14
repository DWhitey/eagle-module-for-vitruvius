/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Vertex#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.Vertex#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.Vertex#getCurve <em>Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getVertex_X()
	 * @model required="true"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link eaglemodel.Vertex#getX <em>X</em>}' attribute.
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
	 * @see eaglemodel.EaglemodelPackage#getVertex_Y()
	 * @model required="true"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link eaglemodel.Vertex#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

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
	 * @see eaglemodel.EaglemodelPackage#getVertex_Curve()
	 * @model
	 * @generated
	 */
	double getCurve();

	/**
	 * Sets the value of the '{@link eaglemodel.Vertex#getCurve <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' attribute.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(double value);

} // Vertex
