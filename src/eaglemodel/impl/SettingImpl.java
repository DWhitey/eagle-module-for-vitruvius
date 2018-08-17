/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Setting;
import eaglemodel.VerticalText;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.SettingImpl#isAlwaysvectorfont <em>Alwaysvectorfont</em>}</li>
 *   <li>{@link eaglemodel.impl.SettingImpl#getVerticaltext <em>Verticaltext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingImpl extends MinimalEObjectImpl.Container implements Setting {
	/**
	 * The default value of the '{@link #isAlwaysvectorfont() <em>Alwaysvectorfont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysvectorfont()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALWAYSVECTORFONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlwaysvectorfont() <em>Alwaysvectorfont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysvectorfont()
	 * @generated
	 * @ordered
	 */
	protected boolean alwaysvectorfont = ALWAYSVECTORFONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticaltext() <em>Verticaltext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticaltext()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalText VERTICALTEXT_EDEFAULT = VerticalText.UP;

	/**
	 * The cached value of the '{@link #getVerticaltext() <em>Verticaltext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticaltext()
	 * @generated
	 * @ordered
	 */
	protected VerticalText verticaltext = VERTICALTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlwaysvectorfont() {
		return alwaysvectorfont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlwaysvectorfont(boolean newAlwaysvectorfont) {
		boolean oldAlwaysvectorfont = alwaysvectorfont;
		alwaysvectorfont = newAlwaysvectorfont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SETTING__ALWAYSVECTORFONT, oldAlwaysvectorfont, alwaysvectorfont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalText getVerticaltext() {
		return verticaltext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticaltext(VerticalText newVerticaltext) {
		VerticalText oldVerticaltext = verticaltext;
		verticaltext = newVerticaltext == null ? VERTICALTEXT_EDEFAULT : newVerticaltext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SETTING__VERTICALTEXT, oldVerticaltext, verticaltext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.SETTING__ALWAYSVECTORFONT:
				return isAlwaysvectorfont();
			case EaglemodelPackage.SETTING__VERTICALTEXT:
				return getVerticaltext();
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
			case EaglemodelPackage.SETTING__ALWAYSVECTORFONT:
				setAlwaysvectorfont((Boolean)newValue);
				return;
			case EaglemodelPackage.SETTING__VERTICALTEXT:
				setVerticaltext((VerticalText)newValue);
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
			case EaglemodelPackage.SETTING__ALWAYSVECTORFONT:
				setAlwaysvectorfont(ALWAYSVECTORFONT_EDEFAULT);
				return;
			case EaglemodelPackage.SETTING__VERTICALTEXT:
				setVerticaltext(VERTICALTEXT_EDEFAULT);
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
			case EaglemodelPackage.SETTING__ALWAYSVECTORFONT:
				return alwaysvectorfont != ALWAYSVECTORFONT_EDEFAULT;
			case EaglemodelPackage.SETTING__VERTICALTEXT:
				return verticaltext != VERTICALTEXT_EDEFAULT;
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
		result.append(" (alwaysvectorfont: ");
		result.append(alwaysvectorfont);
		result.append(", verticaltext: ");
		result.append(verticaltext);
		result.append(')');
		return result.toString();
	}

} //SettingImpl
