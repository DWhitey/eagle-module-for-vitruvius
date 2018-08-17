/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Grid;
import eaglemodel.GridStyle;
import eaglemodel.GridUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.GridImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getUnitdist <em>Unitdist</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#isDisplay <em>Display</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getAltdistance <em>Altdistance</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getAltunitdist <em>Altunitdist</em>}</li>
 *   <li>{@link eaglemodel.impl.GridImpl#getAltunit <em>Altunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridImpl extends MinimalEObjectImpl.Container implements Grid {
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitdist() <em>Unitdist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitdist()
	 * @generated
	 * @ordered
	 */
	protected static final GridUnit UNITDIST_EDEFAULT = GridUnit.MIC;

	/**
	 * The cached value of the '{@link #getUnitdist() <em>Unitdist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitdist()
	 * @generated
	 * @ordered
	 */
	protected GridUnit unitdist = UNITDIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GridUnit UNIT_EDEFAULT = GridUnit.MIC;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GridUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final GridStyle STYLE_EDEFAULT = GridStyle.LINES;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected GridStyle style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected int multiple = MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplay()
	 * @generated
	 * @ordered
	 */
	protected boolean display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltdistance() <em>Altdistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltdistance()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTDISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltdistance() <em>Altdistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltdistance()
	 * @generated
	 * @ordered
	 */
	protected double altdistance = ALTDISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltunitdist() <em>Altunitdist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltunitdist()
	 * @generated
	 * @ordered
	 */
	protected static final GridUnit ALTUNITDIST_EDEFAULT = GridUnit.MIC;

	/**
	 * The cached value of the '{@link #getAltunitdist() <em>Altunitdist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltunitdist()
	 * @generated
	 * @ordered
	 */
	protected GridUnit altunitdist = ALTUNITDIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltunit() <em>Altunit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltunit()
	 * @generated
	 * @ordered
	 */
	protected static final GridUnit ALTUNIT_EDEFAULT = GridUnit.MIC;

	/**
	 * The cached value of the '{@link #getAltunit() <em>Altunit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltunit()
	 * @generated
	 * @ordered
	 */
	protected GridUnit altunit = ALTUNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit getUnitdist() {
		return unitdist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitdist(GridUnit newUnitdist) {
		GridUnit oldUnitdist = unitdist;
		unitdist = newUnitdist == null ? UNITDIST_EDEFAULT : newUnitdist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__UNITDIST, oldUnitdist, unitdist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GridUnit newUnit) {
		GridUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(GridStyle newStyle) {
		GridStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(int newMultiple) {
		int oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__MULTIPLE, oldMultiple, multiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(boolean newDisplay) {
		boolean oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAltdistance() {
		return altdistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltdistance(double newAltdistance) {
		double oldAltdistance = altdistance;
		altdistance = newAltdistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__ALTDISTANCE, oldAltdistance, altdistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit getAltunitdist() {
		return altunitdist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltunitdist(GridUnit newAltunitdist) {
		GridUnit oldAltunitdist = altunitdist;
		altunitdist = newAltunitdist == null ? ALTUNITDIST_EDEFAULT : newAltunitdist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__ALTUNITDIST, oldAltunitdist, altunitdist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit getAltunit() {
		return altunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltunit(GridUnit newAltunit) {
		GridUnit oldAltunit = altunit;
		altunit = newAltunit == null ? ALTUNIT_EDEFAULT : newAltunit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GRID__ALTUNIT, oldAltunit, altunit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.GRID__DISTANCE:
				return getDistance();
			case EaglemodelPackage.GRID__UNITDIST:
				return getUnitdist();
			case EaglemodelPackage.GRID__UNIT:
				return getUnit();
			case EaglemodelPackage.GRID__STYLE:
				return getStyle();
			case EaglemodelPackage.GRID__MULTIPLE:
				return getMultiple();
			case EaglemodelPackage.GRID__DISPLAY:
				return isDisplay();
			case EaglemodelPackage.GRID__ALTDISTANCE:
				return getAltdistance();
			case EaglemodelPackage.GRID__ALTUNITDIST:
				return getAltunitdist();
			case EaglemodelPackage.GRID__ALTUNIT:
				return getAltunit();
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
			case EaglemodelPackage.GRID__DISTANCE:
				setDistance((Double)newValue);
				return;
			case EaglemodelPackage.GRID__UNITDIST:
				setUnitdist((GridUnit)newValue);
				return;
			case EaglemodelPackage.GRID__UNIT:
				setUnit((GridUnit)newValue);
				return;
			case EaglemodelPackage.GRID__STYLE:
				setStyle((GridStyle)newValue);
				return;
			case EaglemodelPackage.GRID__MULTIPLE:
				setMultiple((Integer)newValue);
				return;
			case EaglemodelPackage.GRID__DISPLAY:
				setDisplay((Boolean)newValue);
				return;
			case EaglemodelPackage.GRID__ALTDISTANCE:
				setAltdistance((Double)newValue);
				return;
			case EaglemodelPackage.GRID__ALTUNITDIST:
				setAltunitdist((GridUnit)newValue);
				return;
			case EaglemodelPackage.GRID__ALTUNIT:
				setAltunit((GridUnit)newValue);
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
			case EaglemodelPackage.GRID__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__UNITDIST:
				setUnitdist(UNITDIST_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__ALTDISTANCE:
				setAltdistance(ALTDISTANCE_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__ALTUNITDIST:
				setAltunitdist(ALTUNITDIST_EDEFAULT);
				return;
			case EaglemodelPackage.GRID__ALTUNIT:
				setAltunit(ALTUNIT_EDEFAULT);
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
			case EaglemodelPackage.GRID__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case EaglemodelPackage.GRID__UNITDIST:
				return unitdist != UNITDIST_EDEFAULT;
			case EaglemodelPackage.GRID__UNIT:
				return unit != UNIT_EDEFAULT;
			case EaglemodelPackage.GRID__STYLE:
				return style != STYLE_EDEFAULT;
			case EaglemodelPackage.GRID__MULTIPLE:
				return multiple != MULTIPLE_EDEFAULT;
			case EaglemodelPackage.GRID__DISPLAY:
				return display != DISPLAY_EDEFAULT;
			case EaglemodelPackage.GRID__ALTDISTANCE:
				return altdistance != ALTDISTANCE_EDEFAULT;
			case EaglemodelPackage.GRID__ALTUNITDIST:
				return altunitdist != ALTUNITDIST_EDEFAULT;
			case EaglemodelPackage.GRID__ALTUNIT:
				return altunit != ALTUNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (distance: ");
		result.append(distance);
		result.append(", unitdist: ");
		result.append(unitdist);
		result.append(", unit: ");
		result.append(unit);
		result.append(", style: ");
		result.append(style);
		result.append(", multiple: ");
		result.append(multiple);
		result.append(", display: ");
		result.append(display);
		result.append(", altdistance: ");
		result.append(altdistance);
		result.append(", altunitdist: ");
		result.append(altunitdist);
		result.append(", altunit: ");
		result.append(altunit);
		result.append(')');
		return result.toString();
	}

} //GridImpl
