/**
 */
package eaglemodel.impl;

import eaglemodel.Description;
import eaglemodel.Devicesets;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Library;
import eaglemodel.Packages;
import eaglemodel.Symbols;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getDevicesets <em>Devicesets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected Packages packages;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected Symbols symbols;

	/**
	 * The cached value of the '{@link #getDevicesets() <em>Devicesets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesets()
	 * @generated
	 * @ordered
	 */
	protected Devicesets devicesets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.LIBRARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packages getPackages() {
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackages(Packages newPackages, NotificationChain msgs) {
		Packages oldPackages = packages;
		packages = newPackages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__PACKAGES, oldPackages, newPackages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackages(Packages newPackages) {
		if (newPackages != packages) {
			NotificationChain msgs = null;
			if (packages != null)
				msgs = ((InternalEObject)packages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__PACKAGES, null, msgs);
			if (newPackages != null)
				msgs = ((InternalEObject)newPackages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__PACKAGES, null, msgs);
			msgs = basicSetPackages(newPackages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__PACKAGES, newPackages, newPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbols getSymbols() {
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbols(Symbols newSymbols, NotificationChain msgs) {
		Symbols oldSymbols = symbols;
		symbols = newSymbols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__SYMBOLS, oldSymbols, newSymbols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbols(Symbols newSymbols) {
		if (newSymbols != symbols) {
			NotificationChain msgs = null;
			if (symbols != null)
				msgs = ((InternalEObject)symbols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__SYMBOLS, null, msgs);
			if (newSymbols != null)
				msgs = ((InternalEObject)newSymbols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__SYMBOLS, null, msgs);
			msgs = basicSetSymbols(newSymbols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__SYMBOLS, newSymbols, newSymbols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devicesets getDevicesets() {
		return devicesets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevicesets(Devicesets newDevicesets, NotificationChain msgs) {
		Devicesets oldDevicesets = devicesets;
		devicesets = newDevicesets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__DEVICESETS, oldDevicesets, newDevicesets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevicesets(Devicesets newDevicesets) {
		if (newDevicesets != devicesets) {
			NotificationChain msgs = null;
			if (devicesets != null)
				msgs = ((InternalEObject)devicesets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__DEVICESETS, null, msgs);
			if (newDevicesets != null)
				msgs = ((InternalEObject)newDevicesets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.LIBRARY__DEVICESETS, null, msgs);
			msgs = basicSetDevicesets(newDevicesets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__DEVICESETS, newDevicesets, newDevicesets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EaglemodelPackage.LIBRARY__PACKAGES:
				return basicSetPackages(null, msgs);
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				return basicSetSymbols(null, msgs);
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				return basicSetDevicesets(null, msgs);
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
			case EaglemodelPackage.LIBRARY__NAME:
				return getName();
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				return getDescription();
			case EaglemodelPackage.LIBRARY__PACKAGES:
				return getPackages();
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				return getSymbols();
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				return getDevicesets();
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
			case EaglemodelPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.LIBRARY__PACKAGES:
				setPackages((Packages)newValue);
				return;
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				setSymbols((Symbols)newValue);
				return;
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				setDevicesets((Devicesets)newValue);
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
			case EaglemodelPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.LIBRARY__PACKAGES:
				setPackages((Packages)null);
				return;
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				setSymbols((Symbols)null);
				return;
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				setDevicesets((Devicesets)null);
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
			case EaglemodelPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.LIBRARY__PACKAGES:
				return packages != null;
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				return symbols != null;
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				return devicesets != null;
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
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
