/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Polygon#getWidth <em>Width</em>}</li>
 *   <li>{@link eaglemodel.Polygon#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.Polygon#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link eaglemodel.Polygon#getPour <em>Pour</em>}</li>
 *   <li>{@link eaglemodel.Polygon#getIsolate <em>Isolate</em>}</li>
 *   <li>{@link eaglemodel.Polygon#isOrphans <em>Orphans</em>}</li>
 *   <li>{@link eaglemodel.Polygon#isThermals <em>Thermals</em>}</li>
 *   <li>{@link eaglemodel.Polygon#getRank <em>Rank</em>}</li>
 *   <li>{@link eaglemodel.Polygon#getVertex <em>Vertex</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

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
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Layer()
	 * @model required="true"
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(int value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(double)
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Spacing()
	 * @model
	 * @generated
	 */
	double getSpacing();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(double value);

	/**
	 * Returns the value of the '<em><b>Pour</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * The literals are from the enumeration {@link eaglemodel.PolygonPour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pour</em>' attribute.
	 * @see eaglemodel.PolygonPour
	 * @see #setPour(PolygonPour)
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Pour()
	 * @model default="solid"
	 * @generated
	 */
	PolygonPour getPour();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#getPour <em>Pour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pour</em>' attribute.
	 * @see eaglemodel.PolygonPour
	 * @see #getPour()
	 * @generated
	 */
	void setPour(PolygonPour value);

	/**
	 * Returns the value of the '<em><b>Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolate</em>' attribute.
	 * @see #setIsolate(double)
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Isolate()
	 * @model
	 * @generated
	 */
	double getIsolate();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#getIsolate <em>Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolate</em>' attribute.
	 * @see #getIsolate()
	 * @generated
	 */
	void setIsolate(double value);

	/**
	 * Returns the value of the '<em><b>Orphans</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphans</em>' attribute.
	 * @see #setOrphans(boolean)
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Orphans()
	 * @model default="false"
	 * @generated
	 */
	boolean isOrphans();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#isOrphans <em>Orphans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orphans</em>' attribute.
	 * @see #isOrphans()
	 * @generated
	 */
	void setOrphans(boolean value);

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
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Thermals()
	 * @model default="true"
	 * @generated
	 */
	boolean isThermals();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#isThermals <em>Thermals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermals</em>' attribute.
	 * @see #isThermals()
	 * @generated
	 */
	void setThermals(boolean value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link eaglemodel.Polygon#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getPolygon_Vertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vertex> getVertex();

} // Polygon
