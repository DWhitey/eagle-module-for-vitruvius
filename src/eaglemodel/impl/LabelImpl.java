/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;

import eaglemodel.Enums.TextFont;

import eaglemodel.Label;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.LabelImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#getFont <em>Font</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.LabelImpl#isXref <em>Xref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label {
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
	protected static final TextFont FONT_EDEFAULT = TextFont.PROPORTIONAL_LITERAL;

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
	protected static final double ROT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRot() <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRot()
	 * @generated
	 * @ordered
	 */
	protected double rot = ROT_EDEFAULT;

	/**
	 * The default value of the '{@link #isXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXref()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XREF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXref()
	 * @generated
	 * @ordered
	 */
	protected boolean xref = XREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.LABEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__LAYER, oldLayer, layer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__FONT, oldFont, font));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__RATIO, oldRatio, ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRot() {
		return rot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRot(double newRot) {
		double oldRot = rot;
		rot = newRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXref() {
		return xref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXref(boolean newXref) {
		boolean oldXref = xref;
		xref = newXref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LABEL__XREF, oldXref, xref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.LABEL__X:
				return new Double(getX());
			case EaglemodelPackage.LABEL__Y:
				return new Double(getY());
			case EaglemodelPackage.LABEL__SIZE:
				return new Double(getSize());
			case EaglemodelPackage.LABEL__LAYER:
				return new Integer(getLayer());
			case EaglemodelPackage.LABEL__FONT:
				return getFont();
			case EaglemodelPackage.LABEL__RATIO:
				return new Integer(getRatio());
			case EaglemodelPackage.LABEL__ROT:
				return new Double(getRot());
			case EaglemodelPackage.LABEL__XREF:
				return isXref() ? Boolean.TRUE : Boolean.FALSE;
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
			case EaglemodelPackage.LABEL__X:
				setX(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.LABEL__Y:
				setY(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.LABEL__SIZE:
				setSize(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.LABEL__LAYER:
				setLayer(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.LABEL__FONT:
				setFont((TextFont)newValue);
				return;
			case EaglemodelPackage.LABEL__RATIO:
				setRatio(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.LABEL__ROT:
				setRot(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.LABEL__XREF:
				setXref(((Boolean)newValue).booleanValue());
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
			case EaglemodelPackage.LABEL__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.LABEL__XREF:
				setXref(XREF_EDEFAULT);
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
			case EaglemodelPackage.LABEL__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.LABEL__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.LABEL__SIZE:
				return size != SIZE_EDEFAULT;
			case EaglemodelPackage.LABEL__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.LABEL__FONT:
				return font != FONT_EDEFAULT;
			case EaglemodelPackage.LABEL__RATIO:
				return ratio != RATIO_EDEFAULT;
			case EaglemodelPackage.LABEL__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.LABEL__XREF:
				return xref != XREF_EDEFAULT;
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
		result.append(", xref: ");
		result.append(xref);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
