/**
 */
package eaglemodel.impl;

import eaglemodel.Attribute;
import eaglemodel.EaglemodelPackage;

import eaglemodel.Enums.AttributeDisplay;
import eaglemodel.Enums.TextFont;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getFont <em>Font</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link eaglemodel.impl.AttributeImpl#isConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected static final TextFont FONT_EDEFAULT = TextFont.VECTOR_LITERAL;

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
	protected static final int RATIO_EDEFAULT = 0;

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
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeDisplay DISPLAY_EDEFAULT = AttributeDisplay.VALUE_LITERAL;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected AttributeDisplay display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__LAYER, oldLayer, layer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__FONT, oldFont, font));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__RATIO, oldRatio, ratio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDisplay getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(AttributeDisplay newDisplay) {
		AttributeDisplay oldDisplay = display;
		display = newDisplay == null ? DISPLAY_EDEFAULT : newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.ATTRIBUTE__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.ATTRIBUTE__NAME:
				return getName();
			case EaglemodelPackage.ATTRIBUTE__VALUE:
				return getValue();
			case EaglemodelPackage.ATTRIBUTE__X:
				return new Double(getX());
			case EaglemodelPackage.ATTRIBUTE__Y:
				return new Double(getY());
			case EaglemodelPackage.ATTRIBUTE__SIZE:
				return new Double(getSize());
			case EaglemodelPackage.ATTRIBUTE__LAYER:
				return new Integer(getLayer());
			case EaglemodelPackage.ATTRIBUTE__FONT:
				return getFont();
			case EaglemodelPackage.ATTRIBUTE__RATIO:
				return new Integer(getRatio());
			case EaglemodelPackage.ATTRIBUTE__ROT:
				return new Double(getRot());
			case EaglemodelPackage.ATTRIBUTE__DISPLAY:
				return getDisplay();
			case EaglemodelPackage.ATTRIBUTE__CONSTANT:
				return isConstant() ? Boolean.TRUE : Boolean.FALSE;
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
			case EaglemodelPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case EaglemodelPackage.ATTRIBUTE__X:
				setX(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.ATTRIBUTE__Y:
				setY(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.ATTRIBUTE__SIZE:
				setSize(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.ATTRIBUTE__LAYER:
				setLayer(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.ATTRIBUTE__FONT:
				setFont((TextFont)newValue);
				return;
			case EaglemodelPackage.ATTRIBUTE__RATIO:
				setRatio(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.ATTRIBUTE__ROT:
				setRot(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.ATTRIBUTE__DISPLAY:
				setDisplay((AttributeDisplay)newValue);
				return;
			case EaglemodelPackage.ATTRIBUTE__CONSTANT:
				setConstant(((Boolean)newValue).booleanValue());
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
			case EaglemodelPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case EaglemodelPackage.ATTRIBUTE__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
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
			case EaglemodelPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EaglemodelPackage.ATTRIBUTE__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__SIZE:
				return size != SIZE_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__FONT:
				return font != FONT_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__RATIO:
				return ratio != RATIO_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__DISPLAY:
				return display != DISPLAY_EDEFAULT;
			case EaglemodelPackage.ATTRIBUTE__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", x: ");
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
		result.append(", display: ");
		result.append(display);
		result.append(", constant: ");
		result.append(constant);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
