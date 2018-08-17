/**
 */
package eaglemodel.impl;

import eaglemodel.Compatibility;
import eaglemodel.Drawing;
import eaglemodel.Eagle;
import eaglemodel.EaglemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getCompatibility() <em>Compatibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibility()
	 * @generated
	 * @ordered
	 */
	protected Compatibility compatibility;

	/**
	 * The cached value of the '{@link #getDrawing() <em>Drawing</em>}' containment reference.
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
	@Override
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
		return compatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompatibility(Compatibility newCompatibility, NotificationChain msgs) {
		Compatibility oldCompatibility = compatibility;
		compatibility = newCompatibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__COMPATIBILITY, oldCompatibility, newCompatibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompatibility(Compatibility newCompatibility) {
		if (newCompatibility != compatibility) {
			NotificationChain msgs = null;
			if (compatibility != null)
				msgs = ((InternalEObject)compatibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.EAGLE__COMPATIBILITY, null, msgs);
			if (newCompatibility != null)
				msgs = ((InternalEObject)newCompatibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.EAGLE__COMPATIBILITY, null, msgs);
			msgs = basicSetCompatibility(newCompatibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__COMPATIBILITY, newCompatibility, newCompatibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing getDrawing() {
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrawing(Drawing newDrawing, NotificationChain msgs) {
		Drawing oldDrawing = drawing;
		drawing = newDrawing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__DRAWING, oldDrawing, newDrawing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawing(Drawing newDrawing) {
		if (newDrawing != drawing) {
			NotificationChain msgs = null;
			if (drawing != null)
				msgs = ((InternalEObject)drawing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.EAGLE__DRAWING, null, msgs);
			if (newDrawing != null)
				msgs = ((InternalEObject)newDrawing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.EAGLE__DRAWING, null, msgs);
			msgs = basicSetDrawing(newDrawing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.EAGLE__DRAWING, newDrawing, newDrawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.EAGLE__COMPATIBILITY:
				return basicSetCompatibility(null, msgs);
			case EaglemodelPackage.EAGLE__DRAWING:
				return basicSetDrawing(null, msgs);
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
			case EaglemodelPackage.EAGLE__VERSION:
				return getVersion();
			case EaglemodelPackage.EAGLE__COMPATIBILITY:
				return getCompatibility();
			case EaglemodelPackage.EAGLE__DRAWING:
				return getDrawing();
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
	@Override
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
	@Override
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //EagleImpl
