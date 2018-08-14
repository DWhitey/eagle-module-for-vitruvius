/**
 */
package eaglemodel.impl;

import eaglemodel.Attribute;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Instance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.InstanceImpl#getPart <em>Part</em>}</li>
 *   <li>{@link eaglemodel.impl.InstanceImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link eaglemodel.impl.InstanceImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.InstanceImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.InstanceImpl#isSmashed <em>Smashed</em>}</li>
 *   <li>{@link eaglemodel.impl.InstanceImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.InstanceImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
	/**
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected String part = PART_EDEFAULT;

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
	 * The default value of the '{@link #isSmashed() <em>Smashed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmashed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMASHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSmashed() <em>Smashed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmashed()
	 * @generated
	 * @ordered
	 */
	protected boolean smashed = SMASHED_EDEFAULT;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(String newPart) {
		String oldPart = part;
		part = newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.INSTANCE__PART, oldPart, part));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.INSTANCE__GATE, oldGate, gate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.INSTANCE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.INSTANCE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmashed() {
		return smashed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmashed(boolean newSmashed) {
		boolean oldSmashed = smashed;
		smashed = newSmashed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.INSTANCE__SMASHED, oldSmashed, smashed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.INSTANCE__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList(Attribute.class, this, EaglemodelPackage.INSTANCE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.INSTANCE__PART:
				return getPart();
			case EaglemodelPackage.INSTANCE__GATE:
				return getGate();
			case EaglemodelPackage.INSTANCE__X:
				return new Double(getX());
			case EaglemodelPackage.INSTANCE__Y:
				return new Double(getY());
			case EaglemodelPackage.INSTANCE__SMASHED:
				return isSmashed() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.INSTANCE__ROT:
				return new Double(getRot());
			case EaglemodelPackage.INSTANCE__ATTRIBUTE:
				return getAttribute();
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
			case EaglemodelPackage.INSTANCE__PART:
				setPart((String)newValue);
				return;
			case EaglemodelPackage.INSTANCE__GATE:
				setGate((String)newValue);
				return;
			case EaglemodelPackage.INSTANCE__X:
				setX(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.INSTANCE__Y:
				setY(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.INSTANCE__SMASHED:
				setSmashed(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.INSTANCE__ROT:
				setRot(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.INSTANCE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection)newValue);
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
			case EaglemodelPackage.INSTANCE__PART:
				setPart(PART_EDEFAULT);
				return;
			case EaglemodelPackage.INSTANCE__GATE:
				setGate(GATE_EDEFAULT);
				return;
			case EaglemodelPackage.INSTANCE__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.INSTANCE__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.INSTANCE__SMASHED:
				setSmashed(SMASHED_EDEFAULT);
				return;
			case EaglemodelPackage.INSTANCE__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.INSTANCE__ATTRIBUTE:
				getAttribute().clear();
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
			case EaglemodelPackage.INSTANCE__PART:
				return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
			case EaglemodelPackage.INSTANCE__GATE:
				return GATE_EDEFAULT == null ? gate != null : !GATE_EDEFAULT.equals(gate);
			case EaglemodelPackage.INSTANCE__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.INSTANCE__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.INSTANCE__SMASHED:
				return smashed != SMASHED_EDEFAULT;
			case EaglemodelPackage.INSTANCE__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.INSTANCE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
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
		result.append(" (part: ");
		result.append(part);
		result.append(", gate: ");
		result.append(gate);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", smashed: ");
		result.append(smashed);
		result.append(", rot: ");
		result.append(rot);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
