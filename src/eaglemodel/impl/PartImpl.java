/**
 */
package eaglemodel.impl;

import eaglemodel.Attribute;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Part;
import eaglemodel.Variant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getDeviceset <em>Deviceset</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartImpl extends MinimalEObjectImpl.Container implements Part {
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
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceset() <em>Deviceset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceset()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceset() <em>Deviceset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceset()
	 * @generated
	 * @ordered
	 */
	protected String deviceset = DEVICESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList attribute;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected EList variant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceset() {
		return deviceset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceset(String newDeviceset) {
		String oldDeviceset = deviceset;
		deviceset = newDeviceset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__DEVICESET, oldDeviceset, deviceset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__TECHNOLOGY, oldTechnology, technology));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList(Attribute.class, this, EaglemodelPackage.PART__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVariant() {
		if (variant == null) {
			variant = new EObjectResolvingEList(Variant.class, this, EaglemodelPackage.PART__VARIANT);
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.PART__NAME:
				return getName();
			case EaglemodelPackage.PART__LIBRARY:
				return getLibrary();
			case EaglemodelPackage.PART__DEVICESET:
				return getDeviceset();
			case EaglemodelPackage.PART__DEVICE:
				return getDevice();
			case EaglemodelPackage.PART__TECHNOLOGY:
				return getTechnology();
			case EaglemodelPackage.PART__VALUE:
				return getValue();
			case EaglemodelPackage.PART__ATTRIBUTE:
				return getAttribute();
			case EaglemodelPackage.PART__VARIANT:
				return getVariant();
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
			case EaglemodelPackage.PART__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.PART__LIBRARY:
				setLibrary((String)newValue);
				return;
			case EaglemodelPackage.PART__DEVICESET:
				setDeviceset((String)newValue);
				return;
			case EaglemodelPackage.PART__DEVICE:
				setDevice((String)newValue);
				return;
			case EaglemodelPackage.PART__TECHNOLOGY:
				setTechnology((String)newValue);
				return;
			case EaglemodelPackage.PART__VALUE:
				setValue((String)newValue);
				return;
			case EaglemodelPackage.PART__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PART__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection)newValue);
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
			case EaglemodelPackage.PART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.PART__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case EaglemodelPackage.PART__DEVICESET:
				setDeviceset(DEVICESET_EDEFAULT);
				return;
			case EaglemodelPackage.PART__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case EaglemodelPackage.PART__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case EaglemodelPackage.PART__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EaglemodelPackage.PART__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EaglemodelPackage.PART__VARIANT:
				getVariant().clear();
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
			case EaglemodelPackage.PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.PART__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case EaglemodelPackage.PART__DEVICESET:
				return DEVICESET_EDEFAULT == null ? deviceset != null : !DEVICESET_EDEFAULT.equals(deviceset);
			case EaglemodelPackage.PART__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case EaglemodelPackage.PART__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case EaglemodelPackage.PART__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EaglemodelPackage.PART__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EaglemodelPackage.PART__VARIANT:
				return variant != null && !variant.isEmpty();
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
		result.append(", library: ");
		result.append(library);
		result.append(", deviceset: ");
		result.append(deviceset);
		result.append(", device: ");
		result.append(device);
		result.append(", technology: ");
		result.append(technology);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //PartImpl
