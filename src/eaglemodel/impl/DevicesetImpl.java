/**
 */
package eaglemodel.impl;

import eaglemodel.Description;
import eaglemodel.Devices;
import eaglemodel.Deviceset;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Gates;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviceset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.DevicesetImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.DevicesetImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link eaglemodel.impl.DevicesetImpl#isUservalue <em>Uservalue</em>}</li>
 *   <li>{@link eaglemodel.impl.DevicesetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.DevicesetImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link eaglemodel.impl.DevicesetImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevicesetImpl extends MinimalEObjectImpl.Container implements Deviceset {
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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isUservalue() <em>Uservalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUservalue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USERVALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUservalue() <em>Uservalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUservalue()
	 * @generated
	 * @ordered
	 */
	protected boolean uservalue = USERVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected Gates gates;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected Devices devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicesetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.DEVICESET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUservalue() {
		return uservalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUservalue(boolean newUservalue) {
		boolean oldUservalue = uservalue;
		uservalue = newUservalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__USERVALUE, oldUservalue, uservalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICESET__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICESET__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gates getGates() {
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGates(Gates newGates, NotificationChain msgs) {
		Gates oldGates = gates;
		gates = newGates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__GATES, oldGates, newGates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGates(Gates newGates) {
		if (newGates != gates) {
			NotificationChain msgs = null;
			if (gates != null)
				msgs = ((InternalEObject)gates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICESET__GATES, null, msgs);
			if (newGates != null)
				msgs = ((InternalEObject)newGates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICESET__GATES, null, msgs);
			msgs = basicSetGates(newGates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__GATES, newGates, newGates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devices getDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevices(Devices newDevices, NotificationChain msgs) {
		Devices oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__DEVICES, oldDevices, newDevices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevices(Devices newDevices) {
		if (newDevices != devices) {
			NotificationChain msgs = null;
			if (devices != null)
				msgs = ((InternalEObject)devices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICESET__DEVICES, null, msgs);
			if (newDevices != null)
				msgs = ((InternalEObject)newDevices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.DEVICESET__DEVICES, null, msgs);
			msgs = basicSetDevices(newDevices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__DEVICES, newDevices, newDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EaglemodelPackage.DEVICESET__GATES:
				return basicSetGates(null, msgs);
			case EaglemodelPackage.DEVICESET__DEVICES:
				return basicSetDevices(null, msgs);
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
			case EaglemodelPackage.DEVICESET__NAME:
				return getName();
			case EaglemodelPackage.DEVICESET__PREFIX:
				return getPrefix();
			case EaglemodelPackage.DEVICESET__USERVALUE:
				return isUservalue();
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				return getDescription();
			case EaglemodelPackage.DEVICESET__GATES:
				return getGates();
			case EaglemodelPackage.DEVICESET__DEVICES:
				return getDevices();
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
			case EaglemodelPackage.DEVICESET__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.DEVICESET__PREFIX:
				setPrefix((String)newValue);
				return;
			case EaglemodelPackage.DEVICESET__USERVALUE:
				setUservalue((Boolean)newValue);
				return;
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.DEVICESET__GATES:
				setGates((Gates)newValue);
				return;
			case EaglemodelPackage.DEVICESET__DEVICES:
				setDevices((Devices)newValue);
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
			case EaglemodelPackage.DEVICESET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.DEVICESET__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case EaglemodelPackage.DEVICESET__USERVALUE:
				setUservalue(USERVALUE_EDEFAULT);
				return;
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.DEVICESET__GATES:
				setGates((Gates)null);
				return;
			case EaglemodelPackage.DEVICESET__DEVICES:
				setDevices((Devices)null);
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
			case EaglemodelPackage.DEVICESET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.DEVICESET__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case EaglemodelPackage.DEVICESET__USERVALUE:
				return uservalue != USERVALUE_EDEFAULT;
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.DEVICESET__GATES:
				return gates != null;
			case EaglemodelPackage.DEVICESET__DEVICES:
				return devices != null;
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
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", uservalue: ");
		result.append(uservalue);
		result.append(')');
		return result.toString();
	}

} //DevicesetImpl
