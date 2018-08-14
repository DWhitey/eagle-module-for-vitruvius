/**
 */
package eaglemodel.impl;

import eaglemodel.Description;
import eaglemodel.EaglemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.DescriptionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link eaglemodel.impl.DescriptionImpl#getPcdata <em>Pcdata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "en";

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPcdata() <em>Pcdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcdata()
	 * @generated
	 * @ordered
	 */
	protected static final String PCDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPcdata() <em>Pcdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcdata()
	 * @generated
	 * @ordered
	 */
	protected String pcdata = PCDATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DESCRIPTION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPcdata() {
		return pcdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcdata(String newPcdata) {
		String oldPcdata = pcdata;
		pcdata = newPcdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DESCRIPTION__PCDATA, oldPcdata, pcdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.DESCRIPTION__LANGUAGE:
				return getLanguage();
			case EaglemodelPackage.DESCRIPTION__PCDATA:
				return getPcdata();
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
			case EaglemodelPackage.DESCRIPTION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case EaglemodelPackage.DESCRIPTION__PCDATA:
				setPcdata((String)newValue);
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
			case EaglemodelPackage.DESCRIPTION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case EaglemodelPackage.DESCRIPTION__PCDATA:
				setPcdata(PCDATA_EDEFAULT);
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
			case EaglemodelPackage.DESCRIPTION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case EaglemodelPackage.DESCRIPTION__PCDATA:
				return PCDATA_EDEFAULT == null ? pcdata != null : !PCDATA_EDEFAULT.equals(pcdata);
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
		result.append(" (language: ");
		result.append(language);
		result.append(", pcdata: ");
		result.append(pcdata);
		result.append(')');
		return result.toString();
	}

} //DescriptionImpl
