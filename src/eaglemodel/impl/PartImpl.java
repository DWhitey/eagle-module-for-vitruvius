/**
 */
package eaglemodel.impl;

import eaglemodel.Attribute;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Part;
import eaglemodel.Variant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link eaglemodel.impl.PartImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#isSmashed <em>Smashed</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.PartImpl#getUid <em>Uid</em>}</li>
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
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variant;

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
	@Override
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__GATE, oldGate, gate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__SMASHED, oldSmashed, smashed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		int oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PART__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, EaglemodelPackage.PART__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariant() {
		if (variant == null) {
			variant = new EObjectContainmentEList<Variant>(Variant.class, this, EaglemodelPackage.PART__VARIANT);
		}
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.PART__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PART__VARIANT:
				return ((InternalEList<?>)getVariant()).basicRemove(otherEnd, msgs);
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
			case EaglemodelPackage.PART__GATE:
				return getGate();
			case EaglemodelPackage.PART__X:
				return getX();
			case EaglemodelPackage.PART__Y:
				return getY();
			case EaglemodelPackage.PART__SMASHED:
				return isSmashed();
			case EaglemodelPackage.PART__ROT:
				return getRot();
			case EaglemodelPackage.PART__UID:
				return getUid();
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
	@SuppressWarnings("unchecked")
	@Override
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
			case EaglemodelPackage.PART__GATE:
				setGate((String)newValue);
				return;
			case EaglemodelPackage.PART__X:
				setX((Double)newValue);
				return;
			case EaglemodelPackage.PART__Y:
				setY((Double)newValue);
				return;
			case EaglemodelPackage.PART__SMASHED:
				setSmashed((Boolean)newValue);
				return;
			case EaglemodelPackage.PART__ROT:
				setRot((Double)newValue);
				return;
			case EaglemodelPackage.PART__UID:
				setUid((Integer)newValue);
				return;
			case EaglemodelPackage.PART__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EaglemodelPackage.PART__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends Variant>)newValue);
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
			case EaglemodelPackage.PART__GATE:
				setGate(GATE_EDEFAULT);
				return;
			case EaglemodelPackage.PART__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.PART__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.PART__SMASHED:
				setSmashed(SMASHED_EDEFAULT);
				return;
			case EaglemodelPackage.PART__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.PART__UID:
				setUid(UID_EDEFAULT);
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
	@Override
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
			case EaglemodelPackage.PART__GATE:
				return GATE_EDEFAULT == null ? gate != null : !GATE_EDEFAULT.equals(gate);
			case EaglemodelPackage.PART__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.PART__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.PART__SMASHED:
				return smashed != SMASHED_EDEFAULT;
			case EaglemodelPackage.PART__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.PART__UID:
				return uid != UID_EDEFAULT;
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
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
		result.append(", uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //PartImpl
