/**
 */
package eaglemodel.impl;

import eaglemodel.Align;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Text;
import eaglemodel.TextFont;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.TextImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getFont <em>Font</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link eaglemodel.impl.TextImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends MinimalEObjectImpl.Container implements Text {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final TextFont FONT_EDEFAULT = TextFont.PROPORTIONAL;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected TextFont font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final int RATIO_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected int ratio = RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRot() <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRot()
	 * @generated
	 * @ordered
	 */
	protected static final int ROT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRot() <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRot()
	 * @generated
	 * @ordered
	 */
	protected int rot = ROT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Align ALIGN_EDEFAULT = Align.BOTTOMLEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected Align align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFont getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(TextFont newFont) {
		TextFont oldFont = font;
		font = newFont == null ? FONT_EDEFAULT : newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatio(int newRatio) {
		int oldRatio = ratio;
		ratio = newRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__RATIO, oldRatio, ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRot() {
		return rot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRot(int newRot) {
		int oldRot = rot;
		rot = newRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Align newAlign) {
		Align oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.TEXT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.TEXT__X:
				return getX();
			case EaglemodelPackage.TEXT__Y:
				return getY();
			case EaglemodelPackage.TEXT__SIZE:
				return getSize();
			case EaglemodelPackage.TEXT__LAYER:
				return getLayer();
			case EaglemodelPackage.TEXT__FONT:
				return getFont();
			case EaglemodelPackage.TEXT__RATIO:
				return getRatio();
			case EaglemodelPackage.TEXT__ROT:
				return getRot();
			case EaglemodelPackage.TEXT__ALIGN:
				return getAlign();
			case EaglemodelPackage.TEXT__DISTANCE:
				return getDistance();
			case EaglemodelPackage.TEXT__VALUE:
				return getValue();
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
			case EaglemodelPackage.TEXT__X:
				setX((Double)newValue);
				return;
			case EaglemodelPackage.TEXT__Y:
				setY((Double)newValue);
				return;
			case EaglemodelPackage.TEXT__SIZE:
				setSize((Double)newValue);
				return;
			case EaglemodelPackage.TEXT__LAYER:
				setLayer((Integer)newValue);
				return;
			case EaglemodelPackage.TEXT__FONT:
				setFont((TextFont)newValue);
				return;
			case EaglemodelPackage.TEXT__RATIO:
				setRatio((Integer)newValue);
				return;
			case EaglemodelPackage.TEXT__ROT:
				setRot((Integer)newValue);
				return;
			case EaglemodelPackage.TEXT__ALIGN:
				setAlign((Align)newValue);
				return;
			case EaglemodelPackage.TEXT__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case EaglemodelPackage.TEXT__VALUE:
				setValue((String)newValue);
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
			case EaglemodelPackage.TEXT__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case EaglemodelPackage.TEXT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case EaglemodelPackage.TEXT__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.TEXT__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.TEXT__SIZE:
				return size != SIZE_EDEFAULT;
			case EaglemodelPackage.TEXT__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.TEXT__FONT:
				return font != FONT_EDEFAULT;
			case EaglemodelPackage.TEXT__RATIO:
				return ratio != RATIO_EDEFAULT;
			case EaglemodelPackage.TEXT__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.TEXT__ALIGN:
				return align != ALIGN_EDEFAULT;
			case EaglemodelPackage.TEXT__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case EaglemodelPackage.TEXT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", size: ");
		result.append(size);
		result.append(", layer: ");
		result.append(layer);
		result.append(", font: ");
		result.append(font);
		result.append(", ratio: ");
		result.append(ratio);
		result.append(", rot: ");
		result.append(rot);
		result.append(", align: ");
		result.append(align);
		result.append(", distance: ");
		result.append(distance);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TextImpl
