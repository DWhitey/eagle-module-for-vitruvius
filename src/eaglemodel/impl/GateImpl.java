/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Gate;
import eaglemodel.GateAddLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.GateImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.GateImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link eaglemodel.impl.GateImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.GateImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.GateImpl#getAddlevel <em>Addlevel</em>}</li>
 *   <li>{@link eaglemodel.impl.GateImpl#getSwaplevel <em>Swaplevel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GateImpl extends MinimalEObjectImpl.Container implements Gate {
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
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

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
	 * The default value of the '{@link #getAddlevel() <em>Addlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddlevel()
	 * @generated
	 * @ordered
	 */
	protected static final GateAddLevel ADDLEVEL_EDEFAULT = GateAddLevel.NEXT;

	/**
	 * The cached value of the '{@link #getAddlevel() <em>Addlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddlevel()
	 * @generated
	 * @ordered
	 */
	protected GateAddLevel addlevel = ADDLEVEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.GATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GATE__SYMBOL, oldSymbol, symbol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GATE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GATE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateAddLevel getAddlevel() {
		return addlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddlevel(GateAddLevel newAddlevel) {
		GateAddLevel oldAddlevel = addlevel;
		addlevel = newAddlevel == null ? ADDLEVEL_EDEFAULT : newAddlevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GATE__ADDLEVEL, oldAddlevel, addlevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.GATE__SWAPLEVEL, oldSwaplevel, swaplevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.GATE__NAME:
				return getName();
			case EaglemodelPackage.GATE__SYMBOL:
				return getSymbol();
			case EaglemodelPackage.GATE__X:
				return getX();
			case EaglemodelPackage.GATE__Y:
				return getY();
			case EaglemodelPackage.GATE__ADDLEVEL:
				return getAddlevel();
			case EaglemodelPackage.GATE__SWAPLEVEL:
				return getSwaplevel();
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
			case EaglemodelPackage.GATE__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.GATE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case EaglemodelPackage.GATE__X:
				setX((Double)newValue);
				return;
			case EaglemodelPackage.GATE__Y:
				setY((Double)newValue);
				return;
			case EaglemodelPackage.GATE__ADDLEVEL:
				setAddlevel((GateAddLevel)newValue);
				return;
			case EaglemodelPackage.GATE__SWAPLEVEL:
				setSwaplevel((Integer)newValue);
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
			case EaglemodelPackage.GATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.GATE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case EaglemodelPackage.GATE__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.GATE__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.GATE__ADDLEVEL:
				setAddlevel(ADDLEVEL_EDEFAULT);
				return;
			case EaglemodelPackage.GATE__SWAPLEVEL:
				setSwaplevel(SWAPLEVEL_EDEFAULT);
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
			case EaglemodelPackage.GATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.GATE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case EaglemodelPackage.GATE__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.GATE__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.GATE__ADDLEVEL:
				return addlevel != ADDLEVEL_EDEFAULT;
			case EaglemodelPackage.GATE__SWAPLEVEL:
				return swaplevel != SWAPLEVEL_EDEFAULT;
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
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", addlevel: ");
		result.append(addlevel);
		result.append(", swaplevel: ");
		result.append(swaplevel);
		result.append(')');
		return result.toString();
	}

} //GateImpl
