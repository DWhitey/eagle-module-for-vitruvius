/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;

import eaglemodel.Enums.PolygonPour;

import eaglemodel.Polygon;
import eaglemodel.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getPour <em>Pour</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getIsolate <em>Isolate</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#isOrphans <em>Orphans</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#isThermals <em>Thermals</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link eaglemodel.impl.PolygonImpl#getVertex <em>Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonImpl extends MinimalEObjectImpl.Container implements Polygon {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected int layer = LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected double spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPour() <em>Pour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPour()
	 * @generated
	 * @ordered
	 */
	protected static final PolygonPour POUR_EDEFAULT = PolygonPour.SOLID_LITERAL;

	/**
	 * The cached value of the '{@link #getPour() <em>Pour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPour()
	 * @generated
	 * @ordered
	 */
	protected PolygonPour pour = POUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolate() <em>Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final double ISOLATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIsolate() <em>Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolate()
	 * @generated
	 * @ordered
	 */
	protected double isolate = ISOLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrphans() <em>Orphans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrphans()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORPHANS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrphans() <em>Orphans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrphans()
	 * @generated
	 * @ordered
	 */
	protected boolean orphans = ORPHANS_EDEFAULT;

	/**
	 * The default value of the '{@link #isThermals() <em>Thermals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThermals()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THERMALS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isThermals() <em>Thermals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThermals()
	 * @generated
	 * @ordered
	 */
	protected boolean thermals = THERMALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected EList vertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(int newLayer) {
		int oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(double newSpacing) {
		double oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPour getPour() {
		return pour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPour(PolygonPour newPour) {
		PolygonPour oldPour = pour;
		pour = newPour == null ? POUR_EDEFAULT : newPour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__POUR, oldPour, pour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIsolate() {
		return isolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolate(double newIsolate) {
		double oldIsolate = isolate;
		isolate = newIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__ISOLATE, oldIsolate, isolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrphans() {
		return orphans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrphans(boolean newOrphans) {
		boolean oldOrphans = orphans;
		orphans = newOrphans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__ORPHANS, oldOrphans, orphans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThermals() {
		return thermals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermals(boolean newThermals) {
		boolean oldThermals = thermals;
		thermals = newThermals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__THERMALS, oldThermals, thermals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.POLYGON__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVertex() {
		if (vertex == null) {
			vertex = new EObjectResolvingEList(Vertex.class, this, EaglemodelPackage.POLYGON__VERTEX);
		}
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.POLYGON__WIDTH:
				return new Double(getWidth());
			case EaglemodelPackage.POLYGON__LAYER:
				return new Integer(getLayer());
			case EaglemodelPackage.POLYGON__SPACING:
				return new Double(getSpacing());
			case EaglemodelPackage.POLYGON__POUR:
				return getPour();
			case EaglemodelPackage.POLYGON__ISOLATE:
				return new Double(getIsolate());
			case EaglemodelPackage.POLYGON__ORPHANS:
				return isOrphans() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.POLYGON__THERMALS:
				return isThermals() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.POLYGON__RANK:
				return new Integer(getRank());
			case EaglemodelPackage.POLYGON__VERTEX:
				return getVertex();
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
			case EaglemodelPackage.POLYGON__WIDTH:
				setWidth(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.POLYGON__LAYER:
				setLayer(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.POLYGON__SPACING:
				setSpacing(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.POLYGON__POUR:
				setPour((PolygonPour)newValue);
				return;
			case EaglemodelPackage.POLYGON__ISOLATE:
				setIsolate(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.POLYGON__ORPHANS:
				setOrphans(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.POLYGON__THERMALS:
				setThermals(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.POLYGON__RANK:
				setRank(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.POLYGON__VERTEX:
				getVertex().clear();
				getVertex().addAll((Collection)newValue);
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
			case EaglemodelPackage.POLYGON__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__POUR:
				setPour(POUR_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__ISOLATE:
				setIsolate(ISOLATE_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__ORPHANS:
				setOrphans(ORPHANS_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__THERMALS:
				setThermals(THERMALS_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case EaglemodelPackage.POLYGON__VERTEX:
				getVertex().clear();
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
			case EaglemodelPackage.POLYGON__WIDTH:
				return width != WIDTH_EDEFAULT;
			case EaglemodelPackage.POLYGON__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.POLYGON__SPACING:
				return spacing != SPACING_EDEFAULT;
			case EaglemodelPackage.POLYGON__POUR:
				return pour != POUR_EDEFAULT;
			case EaglemodelPackage.POLYGON__ISOLATE:
				return isolate != ISOLATE_EDEFAULT;
			case EaglemodelPackage.POLYGON__ORPHANS:
				return orphans != ORPHANS_EDEFAULT;
			case EaglemodelPackage.POLYGON__THERMALS:
				return thermals != THERMALS_EDEFAULT;
			case EaglemodelPackage.POLYGON__RANK:
				return rank != RANK_EDEFAULT;
			case EaglemodelPackage.POLYGON__VERTEX:
				return vertex != null && !vertex.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (width: ");
		result.append(width);
		result.append(", layer: ");
		result.append(layer);
		result.append(", spacing: ");
		result.append(spacing);
		result.append(", pour: ");
		result.append(pour);
		result.append(", isolate: ");
		result.append(isolate);
		result.append(", orphans: ");
		result.append(orphans);
		result.append(", thermals: ");
		result.append(thermals);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //PolygonImpl
