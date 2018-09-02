/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Pad;
import eaglemodel.PadShape;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.PadImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#getDrill <em>Drill</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#isStop <em>Stop</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#isThermals <em>Thermals</em>}</li>
 *   <li>{@link eaglemodel.impl.PadImpl#isFirst <em>First</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PadImpl extends MinimalEObjectImpl.Container implements Pad {
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
	 * The default value of the '{@link #getDrill() <em>Drill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrill()
	 * @generated
	 * @ordered
	 */
	protected static final double DRILL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDrill() <em>Drill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrill()
	 * @generated
	 * @ordered
	 */
	protected double drill = DRILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected double diameter = DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final PadShape SHAPE_EDEFAULT = PadShape.ROUND;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected PadShape shape = SHAPE_EDEFAULT;

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
	 * The default value of the '{@link #isStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStop()
	 * @generated
	 * @ordered
	 */
	protected boolean stop = STOP_EDEFAULT;

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
	 * The default value of the '{@link #isFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirst() <em>First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean first = FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.PAD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDrill() {
		return drill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrill(double newDrill) {
		double oldDrill = drill;
		drill = newDrill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__DRILL, oldDrill, drill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameter(double newDiameter) {
		double oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__DIAMETER, oldDiameter, diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadShape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(PadShape newShape) {
		PadShape oldShape = shape;
		shape = newShape == null ? SHAPE_EDEFAULT : newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__SHAPE, oldShape, shape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(boolean newStop) {
		boolean oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__STOP, oldStop, stop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__THERMALS, oldThermals, thermals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(boolean newFirst) {
		boolean oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PAD__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.PAD__NAME:
				return getName();
			case EaglemodelPackage.PAD__X:
				return getX();
			case EaglemodelPackage.PAD__Y:
				return getY();
			case EaglemodelPackage.PAD__DRILL:
				return getDrill();
			case EaglemodelPackage.PAD__DIAMETER:
				return getDiameter();
			case EaglemodelPackage.PAD__SHAPE:
				return getShape();
			case EaglemodelPackage.PAD__ROT:
				return getRot();
			case EaglemodelPackage.PAD__STOP:
				return isStop();
			case EaglemodelPackage.PAD__THERMALS:
				return isThermals();
			case EaglemodelPackage.PAD__FIRST:
				return isFirst();
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
			case EaglemodelPackage.PAD__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.PAD__X:
				setX((Double)newValue);
				return;
			case EaglemodelPackage.PAD__Y:
				setY((Double)newValue);
				return;
			case EaglemodelPackage.PAD__DRILL:
				setDrill((Double)newValue);
				return;
			case EaglemodelPackage.PAD__DIAMETER:
				setDiameter((Double)newValue);
				return;
			case EaglemodelPackage.PAD__SHAPE:
				setShape((PadShape)newValue);
				return;
			case EaglemodelPackage.PAD__ROT:
				setRot((Integer)newValue);
				return;
			case EaglemodelPackage.PAD__STOP:
				setStop((Boolean)newValue);
				return;
			case EaglemodelPackage.PAD__THERMALS:
				setThermals((Boolean)newValue);
				return;
			case EaglemodelPackage.PAD__FIRST:
				setFirst((Boolean)newValue);
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
			case EaglemodelPackage.PAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__DRILL:
				setDrill(DRILL_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__DIAMETER:
				setDiameter(DIAMETER_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__STOP:
				setStop(STOP_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__THERMALS:
				setThermals(THERMALS_EDEFAULT);
				return;
			case EaglemodelPackage.PAD__FIRST:
				setFirst(FIRST_EDEFAULT);
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
			case EaglemodelPackage.PAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.PAD__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.PAD__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.PAD__DRILL:
				return drill != DRILL_EDEFAULT;
			case EaglemodelPackage.PAD__DIAMETER:
				return diameter != DIAMETER_EDEFAULT;
			case EaglemodelPackage.PAD__SHAPE:
				return shape != SHAPE_EDEFAULT;
			case EaglemodelPackage.PAD__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.PAD__STOP:
				return stop != STOP_EDEFAULT;
			case EaglemodelPackage.PAD__THERMALS:
				return thermals != THERMALS_EDEFAULT;
			case EaglemodelPackage.PAD__FIRST:
				return first != FIRST_EDEFAULT;
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
		result.append(", drill: ");
		result.append(drill);
		result.append(", diameter: ");
		result.append(diameter);
		result.append(", shape: ");
		result.append(shape);
		result.append(", rot: ");
		result.append(rot);
		result.append(", stop: ");
		result.append(stop);
		result.append(", thermals: ");
		result.append(thermals);
		result.append(", first: ");
		result.append(first);
		result.append(')');
		return result.toString();
	}

} //PadImpl
