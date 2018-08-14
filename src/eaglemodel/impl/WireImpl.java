/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;

import eaglemodel.Enums.WireCap;
import eaglemodel.Enums.WireStyle;

import eaglemodel.Wire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.WireImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link eaglemodel.impl.WireImpl#getCap <em>Cap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WireImpl extends MinimalEObjectImpl.Container implements Wire {
	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final double X1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected double x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final double Y1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected double y1 = Y1_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final double X2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected double x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final double Y2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected double y2 = Y2_EDEFAULT;

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
	 * The default value of the '{@link #getExtent() <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected String extent = EXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final WireStyle STYLE_EDEFAULT = WireStyle.CONTINUOUS_LITERAL;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected WireStyle style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected static final double CURVE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected double curve = CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected static final WireCap CAP_EDEFAULT = WireCap.ROUND_LITERAL;

	/**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected WireCap cap = CAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.WIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(double newX1) {
		double oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(double newY1) {
		double oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(double newX2) {
		double oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(double newY2) {
		double oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__Y2, oldY2, y2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(String newExtent) {
		String oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(WireStyle newStyle) {
		WireStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve(double newCurve) {
		double oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__CURVE, oldCurve, curve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireCap getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap(WireCap newCap) {
		WireCap oldCap = cap;
		cap = newCap == null ? CAP_EDEFAULT : newCap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.WIRE__CAP, oldCap, cap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.WIRE__X1:
				return new Double(getX1());
			case EaglemodelPackage.WIRE__Y1:
				return new Double(getY1());
			case EaglemodelPackage.WIRE__X2:
				return new Double(getX2());
			case EaglemodelPackage.WIRE__Y2:
				return new Double(getY2());
			case EaglemodelPackage.WIRE__WIDTH:
				return new Double(getWidth());
			case EaglemodelPackage.WIRE__LAYER:
				return new Integer(getLayer());
			case EaglemodelPackage.WIRE__EXTENT:
				return getExtent();
			case EaglemodelPackage.WIRE__STYLE:
				return getStyle();
			case EaglemodelPackage.WIRE__CURVE:
				return new Double(getCurve());
			case EaglemodelPackage.WIRE__CAP:
				return getCap();
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
			case EaglemodelPackage.WIRE__X1:
				setX1(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.WIRE__Y1:
				setY1(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.WIRE__X2:
				setX2(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.WIRE__Y2:
				setY2(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.WIRE__WIDTH:
				setWidth(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.WIRE__LAYER:
				setLayer(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.WIRE__EXTENT:
				setExtent((String)newValue);
				return;
			case EaglemodelPackage.WIRE__STYLE:
				setStyle((WireStyle)newValue);
				return;
			case EaglemodelPackage.WIRE__CURVE:
				setCurve(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.WIRE__CAP:
				setCap((WireCap)newValue);
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
			case EaglemodelPackage.WIRE__X1:
				setX1(X1_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__X2:
				setX2(X2_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__Y2:
				setY2(Y2_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__EXTENT:
				setExtent(EXTENT_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__CURVE:
				setCurve(CURVE_EDEFAULT);
				return;
			case EaglemodelPackage.WIRE__CAP:
				setCap(CAP_EDEFAULT);
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
			case EaglemodelPackage.WIRE__X1:
				return x1 != X1_EDEFAULT;
			case EaglemodelPackage.WIRE__Y1:
				return y1 != Y1_EDEFAULT;
			case EaglemodelPackage.WIRE__X2:
				return x2 != X2_EDEFAULT;
			case EaglemodelPackage.WIRE__Y2:
				return y2 != Y2_EDEFAULT;
			case EaglemodelPackage.WIRE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case EaglemodelPackage.WIRE__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.WIRE__EXTENT:
				return EXTENT_EDEFAULT == null ? extent != null : !EXTENT_EDEFAULT.equals(extent);
			case EaglemodelPackage.WIRE__STYLE:
				return style != STYLE_EDEFAULT;
			case EaglemodelPackage.WIRE__CURVE:
				return curve != CURVE_EDEFAULT;
			case EaglemodelPackage.WIRE__CAP:
				return cap != CAP_EDEFAULT;
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
		result.append(" (x1: ");
		result.append(x1);
		result.append(", y1: ");
		result.append(y1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", y2: ");
		result.append(y2);
		result.append(", width: ");
		result.append(width);
		result.append(", layer: ");
		result.append(layer);
		result.append(", extent: ");
		result.append(extent);
		result.append(", style: ");
		result.append(style);
		result.append(", curve: ");
		result.append(curve);
		result.append(", cap: ");
		result.append(cap);
		result.append(')');
		return result.toString();
	}

} //WireImpl
