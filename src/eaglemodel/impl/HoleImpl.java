/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Hole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hole</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.HoleImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.HoleImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.HoleImpl#getDrill <em>Drill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HoleImpl extends MinimalEObjectImpl.Container implements Hole {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.HOLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.HOLE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.HOLE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.HOLE__DRILL, oldDrill, drill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.HOLE__X:
				return new Double(getX());
			case EaglemodelPackage.HOLE__Y:
				return new Double(getY());
			case EaglemodelPackage.HOLE__DRILL:
				return new Double(getDrill());
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
			case EaglemodelPackage.HOLE__X:
				setX(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.HOLE__Y:
				setY(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.HOLE__DRILL:
				setDrill(((Double)newValue).doubleValue());
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
			case EaglemodelPackage.HOLE__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.HOLE__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.HOLE__DRILL:
				setDrill(DRILL_EDEFAULT);
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
			case EaglemodelPackage.HOLE__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.HOLE__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.HOLE__DRILL:
				return drill != DRILL_EDEFAULT;
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
		result.append(", drill: ");
		result.append(drill);
		result.append(')');
		return result.toString();
	}

} //HoleImpl
