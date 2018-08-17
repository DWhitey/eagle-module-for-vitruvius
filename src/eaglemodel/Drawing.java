/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Drawing#getSettings <em>Settings</em>}</li>
 *   <li>{@link eaglemodel.Drawing#getGrid <em>Grid</em>}</li>
 *   <li>{@link eaglemodel.Drawing#getLayers <em>Layers</em>}</li>
 *   <li>{@link eaglemodel.Drawing#getSchematic <em>Schematic</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getDrawing()
 * @model
 * @generated
 */
public interface Drawing extends EObject {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(Settings)
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Settings()
	 * @model containment="true"
	 * @generated
	 */
	Settings getSettings();

	/**
	 * Sets the value of the '{@link eaglemodel.Drawing#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(Settings value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Grid()
	 * @model containment="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link eaglemodel.Drawing#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference.
	 * @see #setLayers(Layers)
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Layers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Layers getLayers();

	/**
	 * Sets the value of the '{@link eaglemodel.Drawing#getLayers <em>Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layers</em>' containment reference.
	 * @see #getLayers()
	 * @generated
	 */
	void setLayers(Layers value);

	/**
	 * Returns the value of the '<em><b>Schematic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schematic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schematic</em>' containment reference.
	 * @see #setSchematic(Schematic)
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Schematic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schematic getSchematic();

	/**
	 * Sets the value of the '{@link eaglemodel.Drawing#getSchematic <em>Schematic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schematic</em>' containment reference.
	 * @see #getSchematic()
	 * @generated
	 */
	void setSchematic(Schematic value);

} // Drawing
