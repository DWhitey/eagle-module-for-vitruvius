/**
 */
package eaglemodel.impl;

import eaglemodel.Description;
import eaglemodel.Deviceset;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Library;
import eaglemodel.Symbol;

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
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link eaglemodel.impl.LibraryImpl#getDevicesets <em>Devicesets</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList packages;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList symbols;

	/**
	 * The cached value of the '{@link #getDevicesets() <em>Devicesets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesets()
	 * @generated
	 * @ordered
	 */
	protected EList devicesets;

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
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Description)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.LIBRARY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.LIBRARY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList(eaglemodel.Package.class, this, EaglemodelPackage.LIBRARY__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSymbols() {
		if (symbols == null) {
			symbols = new EObjectResolvingEList(Symbol.class, this, EaglemodelPackage.LIBRARY__SYMBOLS);
		}
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDevicesets() {
		if (devicesets == null) {
			devicesets = new EObjectResolvingEList(Deviceset.class, this, EaglemodelPackage.LIBRARY__DEVICESETS);
		}
		return devicesets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.LIBRARY__NAME:
				return getName();
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.LIBRARY__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				getSymbols().clear();
				getSymbols().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				getDevicesets().clear();
				getDevicesets().addAll((Collection)newValue);
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
			case EaglemodelPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.LIBRARY__PACKAGES:
				getPackages().clear();
				return;
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				getSymbols().clear();
				return;
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				getDevicesets().clear();
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
			case EaglemodelPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.LIBRARY__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.LIBRARY__PACKAGES:
				return packages != null && !packages.isEmpty();
			case EaglemodelPackage.LIBRARY__SYMBOLS:
				return symbols != null && !symbols.isEmpty();
			case EaglemodelPackage.LIBRARY__DEVICESETS:
				return devicesets != null && !devicesets.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
