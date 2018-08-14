/**
 */
package eaglemodel.impl;

import eaglemodel.Drawing;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Grid;
import eaglemodel.Layer;
import eaglemodel.Schematic;
import eaglemodel.Setting;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getSchematic <em>Schematic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DrawingImpl extends MinimalEObjectImpl.Container implements Drawing {
	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected EList settings;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList layers;

	/**
	 * The cached value of the '{@link #getSchematic() <em>Schematic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchematic()
	 * @generated
	 * @ordered
	 */
	protected Schematic schematic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrawingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSettings() {
		if (settings == null) {
			settings = new EObjectResolvingEList(Setting.class, this, EaglemodelPackage.DRAWING__SETTINGS);
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid getGrid() {
		if (grid != null && grid.eIsProxy()) {
			InternalEObject oldGrid = (InternalEObject)grid;
			grid = (Grid)eResolveProxy(oldGrid);
			if (grid != oldGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.DRAWING__GRID, oldGrid, grid));
			}
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid basicGetGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(Grid newGrid) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLayers() {
		if (layers == null) {
			layers = new EObjectResolvingEList(Layer.class, this, EaglemodelPackage.DRAWING__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schematic getSchematic() {
		if (schematic != null && schematic.eIsProxy()) {
			InternalEObject oldSchematic = (InternalEObject)schematic;
			schematic = (Schematic)eResolveProxy(oldSchematic);
			if (schematic != oldSchematic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.DRAWING__SCHEMATIC, oldSchematic, schematic));
			}
		}
		return schematic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schematic basicGetSchematic() {
		return schematic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchematic(Schematic newSchematic) {
		Schematic oldSchematic = schematic;
		schematic = newSchematic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__SCHEMATIC, oldSchematic, schematic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				return getSettings();
			case EaglemodelPackage.DRAWING__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case EaglemodelPackage.DRAWING__LAYERS:
				return getLayers();
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				if (resolve) return getSchematic();
				return basicGetSchematic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				getSettings().clear();
				getSettings().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.DRAWING__GRID:
				setGrid((Grid)newValue);
				return;
			case EaglemodelPackage.DRAWING__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				setSchematic((Schematic)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				getSettings().clear();
				return;
			case EaglemodelPackage.DRAWING__GRID:
				setGrid((Grid)null);
				return;
			case EaglemodelPackage.DRAWING__LAYERS:
				getLayers().clear();
				return;
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				setSchematic((Schematic)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				return settings != null && !settings.isEmpty();
			case EaglemodelPackage.DRAWING__GRID:
				return grid != null;
			case EaglemodelPackage.DRAWING__LAYERS:
				return layers != null && !layers.isEmpty();
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				return schematic != null;
		}
		return super.eIsSet(featureID);
	}

} //DrawingImpl
