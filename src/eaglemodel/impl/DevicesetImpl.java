/**
 */
package eaglemodel.impl;

import eaglemodel.Description;
import eaglemodel.Device;
import eaglemodel.Deviceset;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Gate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList gates;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList devices;

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
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Description)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.DEVICESET__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DEVICESET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGates() {
		if (gates == null) {
			gates = new EObjectResolvingEList(Gate.class, this, EaglemodelPackage.DEVICESET__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList(Device.class, this, EaglemodelPackage.DEVICESET__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.DEVICESET__NAME:
				return getName();
			case EaglemodelPackage.DEVICESET__PREFIX:
				return getPrefix();
			case EaglemodelPackage.DEVICESET__USERVALUE:
				return isUservalue() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.DEVICESET__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.DEVICESET__PREFIX:
				setPrefix((String)newValue);
				return;
			case EaglemodelPackage.DEVICESET__USERVALUE:
				setUservalue(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.DEVICESET__GATES:
				getGates().clear();
				getGates().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.DEVICESET__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection)newValue);
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
				getGates().clear();
				return;
			case EaglemodelPackage.DEVICESET__DEVICES:
				getDevices().clear();
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
			case EaglemodelPackage.DEVICESET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.DEVICESET__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case EaglemodelPackage.DEVICESET__USERVALUE:
				return uservalue != USERVALUE_EDEFAULT;
			case EaglemodelPackage.DEVICESET__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.DEVICESET__GATES:
				return gates != null && !gates.isEmpty();
			case EaglemodelPackage.DEVICESET__DEVICES:
				return devices != null && !devices.isEmpty();
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
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", uservalue: ");
		result.append(uservalue);
		result.append(')');
		return result.toString();
	}

} //DevicesetImpl
