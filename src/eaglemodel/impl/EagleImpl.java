/**
 */
package eaglemodel.impl;

import eaglemodel.Compatibility;
import eaglemodel.Drawing;
import eaglemodel.Eagle;
import eaglemodel.EaglemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eagle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.EagleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link eaglemodel.impl.EagleImpl#getCompatibility <em>Compatibility</em>}</li>
 *   <li>{@link eaglemodel.impl.EagleImpl#getDrawing <em>Drawing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EagleImpl extends MinimalEObjectImpl.Container implements Eagle {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompatibility() <em>Compatibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibility()
	 * @generated
	 * @ordered
	 */
	protected Compatibility compatibility;

	/**
	 * The cached value of the '{@link #getDrawing() <em>Drawing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawing()
	 * @generated
	 * @ordered
	 */
	protected Drawing drawing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EagleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.EAGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compatibility getCompatibility() {
		if (compatibility != null && compatibility.eIsProxy()) {
			InternalEObject oldCompatibility = (InternalEObject)compatibility;
			compatibility = (Compatibility)eResolveProxy(oldCompatibility);
			if (compatibility != oldCompatibility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.EAGLE__COMPATIBILITY, oldCompatibility, compatibility));
			}
		}
		return compatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compatibility basicGetCompatibility() {
		return compatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompatibility(Compatibility newCompatibility) {
		Compatibility oldCompatibility = compatibility;
		compatibility = newCompatibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__COMPATIBILITY, oldCompatibility, compatibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing getDrawing() {
		if (drawing != null && drawing.eIsProxy()) {
			InternalEObject oldDrawing = (InternalEObject)drawing;
			drawing = (Drawing)eResolveProxy(oldDrawing);
			if (drawing != oldDrawing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.EAGLE__DRAWING, oldDrawing, drawing));
			}
		}
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing basicGetDrawing() {
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawing(Drawing newDrawing) {
		Drawing oldDrawing = drawing;
		drawing = newDrawing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__DRAWING, oldDrawing, drawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.EAGLE__VERSION:
				return getVersion();
			case EaglemodelPackage.EAGLE__COMPATIBILITY:
				if (resolve) return getCompatibility();
				return basicGetCompatibility();
			case EaglemodelPackage.EAGLE__DRAWING:
				if (resolve) return getDrawing();
				return basicGetDrawing();
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
			case EaglemodelPackage.EAGLE__VERSION:
				setVersion((String)newValue);
				return;
			case EaglemodelPackage.EAGLE__COMPATIBILITY:
				setCompatibility((Compatibility)newValue);
				return;
			case EaglemodelPackage.EAGLE__DRAWING:
				setDrawing((Drawing)newValue);
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
			case EaglemodelPackage.EAGLE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EaglemodelPackage.EAGLE__COMPATIBILITY:
				setCompatibility((Compatibility)null);
				return;
			case EaglemodelPackage.EAGLE__DRAWING:
				setDrawing((Drawing)null);
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
			case EaglemodelPackage.EAGLE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EaglemodelPackage.EAGLE__COMPATIBILITY:
				return compatibility != null;
			case EaglemodelPackage.EAGLE__DRAWING:
				return drawing != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //EagleImpl
