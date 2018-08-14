/**
 */
package eaglemodel.impl;

import eaglemodel.Connect;
import eaglemodel.EaglemodelPackage;

import eaglemodel.Enums.ContactRoute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.ConnectImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link eaglemodel.impl.ConnectImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link eaglemodel.impl.ConnectImpl#getPad <em>Pad</em>}</li>
 *   <li>{@link eaglemodel.impl.ConnectImpl#getRoute <em>Route</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectImpl extends MinimalEObjectImpl.Container implements Connect {
	/**
	 * The default value of the '{@link #getGate() <em>Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected static final String GATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGate() <em>Gate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected String gate = GATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected static final String PIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected String pin = PIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPad() <em>Pad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPad()
	 * @generated
	 * @ordered
	 */
	protected static final String PAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPad() <em>Pad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPad()
	 * @generated
	 * @ordered
	 */
	protected String pad = PAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected static final ContactRoute ROUTE_EDEFAULT = ContactRoute.ALL_LITERAL;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected ContactRoute route = ROUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.CONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGate() {
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGate(String newGate) {
		String oldGate = gate;
		gate = newGate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.CONNECT__GATE, oldGate, gate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(String newPin) {
		String oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.CONNECT__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPad() {
		return pad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPad(String newPad) {
		String oldPad = pad;
		pad = newPad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.CONNECT__PAD, oldPad, pad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactRoute getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(ContactRoute newRoute) {
		ContactRoute oldRoute = route;
		route = newRoute == null ? ROUTE_EDEFAULT : newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.CONNECT__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.CONNECT__GATE:
				return getGate();
			case EaglemodelPackage.CONNECT__PIN:
				return getPin();
			case EaglemodelPackage.CONNECT__PAD:
				return getPad();
			case EaglemodelPackage.CONNECT__ROUTE:
				return getRoute();
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
			case EaglemodelPackage.CONNECT__GATE:
				setGate((String)newValue);
				return;
			case EaglemodelPackage.CONNECT__PIN:
				setPin((String)newValue);
				return;
			case EaglemodelPackage.CONNECT__PAD:
				setPad((String)newValue);
				return;
			case EaglemodelPackage.CONNECT__ROUTE:
				setRoute((ContactRoute)newValue);
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
			case EaglemodelPackage.CONNECT__GATE:
				setGate(GATE_EDEFAULT);
				return;
			case EaglemodelPackage.CONNECT__PIN:
				setPin(PIN_EDEFAULT);
				return;
			case EaglemodelPackage.CONNECT__PAD:
				setPad(PAD_EDEFAULT);
				return;
			case EaglemodelPackage.CONNECT__ROUTE:
				setRoute(ROUTE_EDEFAULT);
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
			case EaglemodelPackage.CONNECT__GATE:
				return GATE_EDEFAULT == null ? gate != null : !GATE_EDEFAULT.equals(gate);
			case EaglemodelPackage.CONNECT__PIN:
				return PIN_EDEFAULT == null ? pin != null : !PIN_EDEFAULT.equals(pin);
			case EaglemodelPackage.CONNECT__PAD:
				return PAD_EDEFAULT == null ? pad != null : !PAD_EDEFAULT.equals(pad);
			case EaglemodelPackage.CONNECT__ROUTE:
				return route != ROUTE_EDEFAULT;
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
		result.append(" (gate: ");
		result.append(gate);
		result.append(", pin: ");
		result.append(pin);
		result.append(", pad: ");
		result.append(pad);
		result.append(", route: ");
		result.append(route);
		result.append(')');
		return result.toString();
	}

} //ConnectImpl
