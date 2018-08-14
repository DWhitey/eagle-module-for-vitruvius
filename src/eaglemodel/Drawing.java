/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Settings</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Settings()
	 * @model type="eaglemodel.Setting"
	 * @generated
	 */
	EList getSettings();

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see #setGrid(Grid)
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Grid()
	 * @model
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link eaglemodel.Drawing#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Layers()
	 * @model type="eaglemodel.Layer" required="true"
	 * @generated
	 */
	EList getLayers();

	/**
	 * Returns the value of the '<em><b>Schematic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schematic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schematic</em>' reference.
	 * @see #setSchematic(Schematic)
	 * @see eaglemodel.EaglemodelPackage#getDrawing_Schematic()
	 * @model required="true"
	 * @generated
	 */
	Schematic getSchematic();

	/**
	 * Sets the value of the '{@link eaglemodel.Drawing#getSchematic <em>Schematic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schematic</em>' reference.
	 * @see #getSchematic()
	 * @generated
	 */
	void setSchematic(Schematic value);

} // Drawing
