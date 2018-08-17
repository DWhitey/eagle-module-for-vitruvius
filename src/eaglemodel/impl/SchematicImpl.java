/**
 */
package eaglemodel.impl;

import eaglemodel.Attributes;
import eaglemodel.Classes;
import eaglemodel.Description;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Errors;
import eaglemodel.Libraries;
import eaglemodel.Parts;
import eaglemodel.Schematic;
import eaglemodel.Sheets;
import eaglemodel.Variantdefs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schematic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getXreflabel <em>Xreflabel</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getXrefpart <em>Xrefpart</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getVariantdefs <em>Variantdefs</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getSheets <em>Sheets</em>}</li>
 *   <li>{@link eaglemodel.impl.SchematicImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchematicImpl extends MinimalEObjectImpl.Container implements Schematic {
	/**
	 * The default value of the '{@link #getXreflabel() <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXreflabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XREFLABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXreflabel() <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXreflabel()
	 * @generated
	 * @ordered
	 */
	protected String xreflabel = XREFLABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getXrefpart() <em>Xrefpart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXrefpart()
	 * @generated
	 * @ordered
	 */
	protected static final String XREFPART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXrefpart() <em>Xrefpart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXrefpart()
	 * @generated
	 * @ordered
	 */
	protected String xrefpart = XREFPART_EDEFAULT;

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
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected Libraries libraries;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributes;

	/**
	 * The cached value of the '{@link #getVariantdefs() <em>Variantdefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantdefs()
	 * @generated
	 * @ordered
	 */
	protected Variantdefs variantdefs;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected Classes classes;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected Parts parts;

	/**
	 * The cached value of the '{@link #getSheets() <em>Sheets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheets()
	 * @generated
	 * @ordered
	 */
	protected Sheets sheets;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected Errors errors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchematicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SCHEMATIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXreflabel() {
		return xreflabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXreflabel(String newXreflabel) {
		String oldXreflabel = xreflabel;
		xreflabel = newXreflabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__XREFLABEL, oldXreflabel, xreflabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXrefpart() {
		return xrefpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXrefpart(String newXrefpart) {
		String oldXrefpart = xrefpart;
		xrefpart = newXrefpart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__XREFPART, oldXrefpart, xrefpart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Libraries getLibraries() {
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraries(Libraries newLibraries, NotificationChain msgs) {
		Libraries oldLibraries = libraries;
		libraries = newLibraries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__LIBRARIES, oldLibraries, newLibraries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraries(Libraries newLibraries) {
		if (newLibraries != libraries) {
			NotificationChain msgs = null;
			if (libraries != null)
				msgs = ((InternalEObject)libraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__LIBRARIES, null, msgs);
			if (newLibraries != null)
				msgs = ((InternalEObject)newLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__LIBRARIES, null, msgs);
			msgs = basicSetLibraries(newLibraries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__LIBRARIES, newLibraries, newLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs) {
		Attributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attributes newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variantdefs getVariantdefs() {
		return variantdefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantdefs(Variantdefs newVariantdefs, NotificationChain msgs) {
		Variantdefs oldVariantdefs = variantdefs;
		variantdefs = newVariantdefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__VARIANTDEFS, oldVariantdefs, newVariantdefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantdefs(Variantdefs newVariantdefs) {
		if (newVariantdefs != variantdefs) {
			NotificationChain msgs = null;
			if (variantdefs != null)
				msgs = ((InternalEObject)variantdefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__VARIANTDEFS, null, msgs);
			if (newVariantdefs != null)
				msgs = ((InternalEObject)newVariantdefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__VARIANTDEFS, null, msgs);
			msgs = basicSetVariantdefs(newVariantdefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__VARIANTDEFS, newVariantdefs, newVariantdefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classes getClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClasses(Classes newClasses, NotificationChain msgs) {
		Classes oldClasses = classes;
		classes = newClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__CLASSES, oldClasses, newClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasses(Classes newClasses) {
		if (newClasses != classes) {
			NotificationChain msgs = null;
			if (classes != null)
				msgs = ((InternalEObject)classes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__CLASSES, null, msgs);
			if (newClasses != null)
				msgs = ((InternalEObject)newClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__CLASSES, null, msgs);
			msgs = basicSetClasses(newClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__CLASSES, newClasses, newClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parts getParts() {
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParts(Parts newParts, NotificationChain msgs) {
		Parts oldParts = parts;
		parts = newParts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__PARTS, oldParts, newParts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParts(Parts newParts) {
		if (newParts != parts) {
			NotificationChain msgs = null;
			if (parts != null)
				msgs = ((InternalEObject)parts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__PARTS, null, msgs);
			if (newParts != null)
				msgs = ((InternalEObject)newParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__PARTS, null, msgs);
			msgs = basicSetParts(newParts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__PARTS, newParts, newParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheets getSheets() {
		return sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheets(Sheets newSheets, NotificationChain msgs) {
		Sheets oldSheets = sheets;
		sheets = newSheets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__SHEETS, oldSheets, newSheets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheets(Sheets newSheets) {
		if (newSheets != sheets) {
			NotificationChain msgs = null;
			if (sheets != null)
				msgs = ((InternalEObject)sheets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__SHEETS, null, msgs);
			if (newSheets != null)
				msgs = ((InternalEObject)newSheets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__SHEETS, null, msgs);
			msgs = basicSetSheets(newSheets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__SHEETS, newSheets, newSheets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Errors getErrors() {
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrors(Errors newErrors, NotificationChain msgs) {
		Errors oldErrors = errors;
		errors = newErrors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__ERRORS, oldErrors, newErrors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrors(Errors newErrors) {
		if (newErrors != errors) {
			NotificationChain msgs = null;
			if (errors != null)
				msgs = ((InternalEObject)errors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__ERRORS, null, msgs);
			if (newErrors != null)
				msgs = ((InternalEObject)newErrors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SCHEMATIC__ERRORS, null, msgs);
			msgs = basicSetErrors(newErrors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__ERRORS, newErrors, newErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EaglemodelPackage.SCHEMATIC__LIBRARIES:
				return basicSetLibraries(null, msgs);
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				return basicSetVariantdefs(null, msgs);
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				return basicSetClasses(null, msgs);
			case EaglemodelPackage.SCHEMATIC__PARTS:
				return basicSetParts(null, msgs);
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				return basicSetSheets(null, msgs);
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				return basicSetErrors(null, msgs);
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
			case EaglemodelPackage.SCHEMATIC__XREFLABEL:
				return getXreflabel();
			case EaglemodelPackage.SCHEMATIC__XREFPART:
				return getXrefpart();
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				return getDescription();
			case EaglemodelPackage.SCHEMATIC__LIBRARIES:
				return getLibraries();
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				return getAttributes();
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				return getVariantdefs();
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				return getClasses();
			case EaglemodelPackage.SCHEMATIC__PARTS:
				return getParts();
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				return getSheets();
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				return getErrors();
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
			case EaglemodelPackage.SCHEMATIC__XREFLABEL:
				setXreflabel((String)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__XREFPART:
				setXrefpart((String)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__LIBRARIES:
				setLibraries((Libraries)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				setAttributes((Attributes)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				setVariantdefs((Variantdefs)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				setClasses((Classes)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__PARTS:
				setParts((Parts)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				setSheets((Sheets)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				setErrors((Errors)newValue);
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
			case EaglemodelPackage.SCHEMATIC__XREFLABEL:
				setXreflabel(XREFLABEL_EDEFAULT);
				return;
			case EaglemodelPackage.SCHEMATIC__XREFPART:
				setXrefpart(XREFPART_EDEFAULT);
				return;
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.SCHEMATIC__LIBRARIES:
				setLibraries((Libraries)null);
				return;
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				setAttributes((Attributes)null);
				return;
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				setVariantdefs((Variantdefs)null);
				return;
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				setClasses((Classes)null);
				return;
			case EaglemodelPackage.SCHEMATIC__PARTS:
				setParts((Parts)null);
				return;
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				setSheets((Sheets)null);
				return;
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				setErrors((Errors)null);
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
			case EaglemodelPackage.SCHEMATIC__XREFLABEL:
				return XREFLABEL_EDEFAULT == null ? xreflabel != null : !XREFLABEL_EDEFAULT.equals(xreflabel);
			case EaglemodelPackage.SCHEMATIC__XREFPART:
				return XREFPART_EDEFAULT == null ? xrefpart != null : !XREFPART_EDEFAULT.equals(xrefpart);
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.SCHEMATIC__LIBRARIES:
				return libraries != null;
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				return attributes != null;
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				return variantdefs != null;
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				return classes != null;
			case EaglemodelPackage.SCHEMATIC__PARTS:
				return parts != null;
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				return sheets != null;
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				return errors != null;
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
		result.append(" (xreflabel: ");
		result.append(xreflabel);
		result.append(", xrefpart: ");
		result.append(xrefpart);
		result.append(')');
		return result.toString();
	}

} //SchematicImpl
