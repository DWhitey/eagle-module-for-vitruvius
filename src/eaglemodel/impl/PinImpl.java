/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Pin;
import eaglemodel.PinDirection;
import eaglemodel.PinFunction;
import eaglemodel.PinLength;
import eaglemodel.PinVisible;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.PinImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getLength <em>Length</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getSwaplevel <em>Swaplevel</em>}</li>
 *   <li>{@link eaglemodel.impl.PinImpl#getRot <em>Rot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinImpl extends MinimalEObjectImpl.Container implements Pin {
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
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final PinVisible VISIBLE_EDEFAULT = PinVisible.BOTH;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected PinVisible visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final PinLength LENGTH_EDEFAULT = PinLength.LONG;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected PinLength length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PinDirection DIRECTION_EDEFAULT = PinDirection.IO;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PinDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final PinFunction FUNCTION_EDEFAULT = PinFunction.NONE;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected PinFunction function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwaplevel() <em>Swaplevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwaplevel()
	 * @generated
	 * @ordered
	 */
	protected static final int SWAPLEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwaplevel() <em>Swaplevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwaplevel()
	 * @generated
	 * @ordered
	 */
	protected int swaplevel = SWAPLEVEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.PIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinVisible getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(PinVisible newVisible) {
		PinVisible oldVisible = visible;
		visible = newVisible == null ? VISIBLE_EDEFAULT : newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinLength getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(PinLength newLength) {
		PinLength oldLength = length;
		length = newLength == null ? LENGTH_EDEFAULT : newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(PinDirection newDirection) {
		PinDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinFunction getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(PinFunction newFunction) {
		PinFunction oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSwaplevel() {
		return swaplevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwaplevel(int newSwaplevel) {
		int oldSwaplevel = swaplevel;
		swaplevel = newSwaplevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__SWAPLEVEL, oldSwaplevel, swaplevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PIN__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.PIN__NAME:
				return getName();
			case EaglemodelPackage.PIN__X:
				return getX();
			case EaglemodelPackage.PIN__Y:
				return getY();
			case EaglemodelPackage.PIN__VISIBLE:
				return getVisible();
			case EaglemodelPackage.PIN__LENGTH:
				return getLength();
			case EaglemodelPackage.PIN__DIRECTION:
				return getDirection();
			case EaglemodelPackage.PIN__FUNCTION:
				return getFunction();
			case EaglemodelPackage.PIN__SWAPLEVEL:
				return getSwaplevel();
			case EaglemodelPackage.PIN__ROT:
				return getRot();
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
			case EaglemodelPackage.PIN__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.PIN__X:
				setX((Double)newValue);
				return;
			case EaglemodelPackage.PIN__Y:
				setY((Double)newValue);
				return;
			case EaglemodelPackage.PIN__VISIBLE:
				setVisible((PinVisible)newValue);
				return;
			case EaglemodelPackage.PIN__LENGTH:
				setLength((PinLength)newValue);
				return;
			case EaglemodelPackage.PIN__DIRECTION:
				setDirection((PinDirection)newValue);
				return;
			case EaglemodelPackage.PIN__FUNCTION:
				setFunction((PinFunction)newValue);
				return;
			case EaglemodelPackage.PIN__SWAPLEVEL:
				setSwaplevel((Integer)newValue);
				return;
			case EaglemodelPackage.PIN__ROT:
				setRot((Integer)newValue);
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
			case EaglemodelPackage.PIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__SWAPLEVEL:
				setSwaplevel(SWAPLEVEL_EDEFAULT);
				return;
			case EaglemodelPackage.PIN__ROT:
				setRot(ROT_EDEFAULT);
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
			case EaglemodelPackage.PIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.PIN__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.PIN__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.PIN__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case EaglemodelPackage.PIN__LENGTH:
				return length != LENGTH_EDEFAULT;
			case EaglemodelPackage.PIN__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case EaglemodelPackage.PIN__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case EaglemodelPackage.PIN__SWAPLEVEL:
				return swaplevel != SWAPLEVEL_EDEFAULT;
			case EaglemodelPackage.PIN__ROT:
				return rot != ROT_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", visible: ");
		result.append(visible);
		result.append(", length: ");
		result.append(length);
		result.append(", direction: ");
		result.append(direction);
		result.append(", function: ");
		result.append(function);
		result.append(", swaplevel: ");
		result.append(swaplevel);
		result.append(", rot: ");
		result.append(rot);
		result.append(')');
		return result.toString();
	}

} //PinImpl
