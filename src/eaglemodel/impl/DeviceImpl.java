/**
 */
package eaglemodel.impl;

import eaglemodel.Connects;
import eaglemodel.Device;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Technologies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.DeviceImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link eaglemodel.impl.DeviceImpl#getConnects <em>Connects</em>}</li>
 *   <li>{@link eaglemodel.impl.DeviceImpl#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
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
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnects() <em>Connects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnects()
	 * @generated
	 * @ordered
	 */
	protected Connects connects;

	/**
	 * The cached value of the '{@link #getTechnologies() <em>Technologies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologies()
	 * @generated
	 * @ordered
	 */
	protected Technologies technologies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connects getConnects() {
		return connects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnects(Connects newConnects, NotificationChain msgs) {
		Connects oldConnects = connects;
		connects = newConnects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICE__CONNECTS, oldConnects, newConnects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnects(Connects newConnects) {
		if (newConnects != connects) {
			NotificationChain msgs = null;
			if (connects != null)
				msgs = ((InternalEObject)connects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICE__CONNECTS, null, msgs);
			if (newConnects != null)
				msgs = ((InternalEObject)newConnects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICE__CONNECTS, null, msgs);
			msgs = basicSetConnects(newConnects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICE__CONNECTS, newConnects, newConnects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technologies getTechnologies() {
		return technologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologies(Technologies newTechnologies, NotificationChain msgs) {
		Technologies oldTechnologies = technologies;
		technologies = newTechnologies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICE__TECHNOLOGIES, oldTechnologies, newTechnologies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologies(Technologies newTechnologies) {
		if (newTechnologies != technologies) {
			NotificationChain msgs = null;
			if (technologies != null)
				msgs = ((InternalEObject)technologies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICE__TECHNOLOGIES, null, msgs);
			if (newTechnologies != null)
				msgs = ((InternalEObject)newTechnologies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICE__TECHNOLOGIES, null, msgs);
			msgs = basicSetTechnologies(newTechnologies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICE__TECHNOLOGIES, newTechnologies, newTechnologies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.DEVICE__CONNECTS:
				return basicSetConnects(null, msgs);
			case EaglemodelPackage.DEVICE__TECHNOLOGIES:
				return basicSetTechnologies(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.DEVICE__NAME:
				return getName();
			case EaglemodelPackage.DEVICE__PACKAGE:
				return getPackage();
			case EaglemodelPackage.DEVICE__CONNECTS:
				return getConnects();
			case EaglemodelPackage.DEVICE__TECHNOLOGIES:
				return getTechnologies();
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
			case EaglemodelPackage.DEVICE__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.DEVICE__PACKAGE:
				setPackage((String)newValue);
				return;
			case EaglemodelPackage.DEVICE__CONNECTS:
				setConnects((Connects)newValue);
				return;
			case EaglemodelPackage.DEVICE__TECHNOLOGIES:
				setTechnologies((Technologies)newValue);
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
			case EaglemodelPackage.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.DEVICE__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case EaglemodelPackage.DEVICE__CONNECTS:
				setConnects((Connects)null);
				return;
			case EaglemodelPackage.DEVICE__TECHNOLOGIES:
				setTechnologies((Technologies)null);
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
			case EaglemodelPackage.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.DEVICE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case EaglemodelPackage.DEVICE__CONNECTS:
				return connects != null;
			case EaglemodelPackage.DEVICE__TECHNOLOGIES:
				return technologies != null;
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
		result.append(", package: ");
		result.append(package_);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
