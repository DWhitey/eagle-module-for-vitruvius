/**
 */
package eaglemodel.impl;

import eaglemodel.Drawing;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Grid;
import eaglemodel.Layers;
import eaglemodel.Schematic;
import eaglemodel.Settings;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link eaglemodel.impl.DrawingImpl#getSchematic <em>Schematic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrawingImpl extends MinimalEObjectImpl.Container implements Drawing {
	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected Settings settings;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected Layers layers;

	/**
	 * The cached value of the '{@link #getSchematic() <em>Schematic</em>}' containment reference.
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
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(Settings newSettings, NotificationChain msgs) {
		Settings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__SETTINGS, oldSettings, newSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(Settings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(Grid newGrid, NotificationChain msgs) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__GRID, oldGrid, newGrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(Grid newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layers getLayers() {
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayers(Layers newLayers, NotificationChain msgs) {
		Layers oldLayers = layers;
		layers = newLayers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__LAYERS, oldLayers, newLayers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayers(Layers newLayers) {
		if (newLayers != layers) {
			NotificationChain msgs = null;
			if (layers != null)
				msgs = ((InternalEObject)layers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__LAYERS, null, msgs);
			if (newLayers != null)
				msgs = ((InternalEObject)newLayers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__LAYERS, null, msgs);
			msgs = basicSetLayers(newLayers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__LAYERS, newLayers, newLayers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schematic getSchematic() {
		return schematic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchematic(Schematic newSchematic, NotificationChain msgs) {
		Schematic oldSchematic = schematic;
		schematic = newSchematic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__SCHEMATIC, oldSchematic, newSchematic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchematic(Schematic newSchematic) {
		if (newSchematic != schematic) {
			NotificationChain msgs = null;
			if (schematic != null)
				msgs = ((InternalEObject)schematic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__SCHEMATIC, null, msgs);
			if (newSchematic != null)
				msgs = ((InternalEObject)newSchematic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DRAWING__SCHEMATIC, null, msgs);
			msgs = basicSetSchematic(newSchematic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DRAWING__SCHEMATIC, newSchematic, newSchematic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				return basicSetSettings(null, msgs);
			case EaglemodelPackage.DRAWING__GRID:
				return basicSetGrid(null, msgs);
			case EaglemodelPackage.DRAWING__LAYERS:
				return basicSetLayers(null, msgs);
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				return basicSetSchematic(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				return getSettings();
			case EaglemodelPackage.DRAWING__GRID:
				return getGrid();
			case EaglemodelPackage.DRAWING__LAYERS:
				return getLayers();
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				return getSchematic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				setSettings((Settings)newValue);
				return;
			case EaglemodelPackage.DRAWING__GRID:
				setGrid((Grid)newValue);
				return;
			case EaglemodelPackage.DRAWING__LAYERS:
				setLayers((Layers)newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				setSettings((Settings)null);
				return;
			case EaglemodelPackage.DRAWING__GRID:
				setGrid((Grid)null);
				return;
			case EaglemodelPackage.DRAWING__LAYERS:
				setLayers((Layers)null);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.DRAWING__SETTINGS:
				return settings != null;
			case EaglemodelPackage.DRAWING__GRID:
				return grid != null;
			case EaglemodelPackage.DRAWING__LAYERS:
				return layers != null;
			case EaglemodelPackage.DRAWING__SCHEMATIC:
				return schematic != null;
		}
		return super.eIsSet(featureID);
	}

} //DrawingImpl
