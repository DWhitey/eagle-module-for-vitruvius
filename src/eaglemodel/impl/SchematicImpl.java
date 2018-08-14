/**
 */
package eaglemodel.impl;

import eaglemodel.Approved;
import eaglemodel.Attribute;
import eaglemodel.Description;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Library;
import eaglemodel.Part;
import eaglemodel.Schematic;
import eaglemodel.Sheet;
import eaglemodel.Variantdef;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList libraries;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList attributes;

	/**
	 * The cached value of the '{@link #getVariantdefs() <em>Variantdefs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantdefs()
	 * @generated
	 * @ordered
	 */
	protected EList variantdefs;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList classes;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList parts;

	/**
	 * The cached value of the '{@link #getSheets() <em>Sheets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheets()
	 * @generated
	 * @ordered
	 */
	protected EList sheets;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected EList errors;

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
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Description)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.SCHEMATIC__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SCHEMATIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList(Library.class, this, EaglemodelPackage.SCHEMATIC__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList(Attribute.class, this, EaglemodelPackage.SCHEMATIC__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVariantdefs() {
		if (variantdefs == null) {
			variantdefs = new EObjectResolvingEList(Variantdef.class, this, EaglemodelPackage.SCHEMATIC__VARIANTDEFS);
		}
		return variantdefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList(eaglemodel.Class.class, this, EaglemodelPackage.SCHEMATIC__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParts() {
		if (parts == null) {
			parts = new EObjectResolvingEList(Part.class, this, EaglemodelPackage.SCHEMATIC__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSheets() {
		if (sheets == null) {
			sheets = new EObjectResolvingEList(Sheet.class, this, EaglemodelPackage.SCHEMATIC__SHEETS);
		}
		return sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrors() {
		if (errors == null) {
			errors = new EObjectResolvingEList(Approved.class, this, EaglemodelPackage.SCHEMATIC__ERRORS);
		}
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.SCHEMATIC__XREFLABEL:
				return getXreflabel();
			case EaglemodelPackage.SCHEMATIC__XREFPART:
				return getXrefpart();
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
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
				getLibraries().clear();
				getLibraries().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				getVariantdefs().clear();
				getVariantdefs().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__PARTS:
				getParts().clear();
				getParts().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				getSheets().clear();
				getSheets().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection)newValue);
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
				getLibraries().clear();
				return;
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				getVariantdefs().clear();
				return;
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				getClasses().clear();
				return;
			case EaglemodelPackage.SCHEMATIC__PARTS:
				getParts().clear();
				return;
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				getSheets().clear();
				return;
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				getErrors().clear();
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
			case EaglemodelPackage.SCHEMATIC__XREFLABEL:
				return XREFLABEL_EDEFAULT == null ? xreflabel != null : !XREFLABEL_EDEFAULT.equals(xreflabel);
			case EaglemodelPackage.SCHEMATIC__XREFPART:
				return XREFPART_EDEFAULT == null ? xrefpart != null : !XREFPART_EDEFAULT.equals(xrefpart);
			case EaglemodelPackage.SCHEMATIC__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.SCHEMATIC__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case EaglemodelPackage.SCHEMATIC__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EaglemodelPackage.SCHEMATIC__VARIANTDEFS:
				return variantdefs != null && !variantdefs.isEmpty();
			case EaglemodelPackage.SCHEMATIC__CLASSES:
				return classes != null && !classes.isEmpty();
			case EaglemodelPackage.SCHEMATIC__PARTS:
				return parts != null && !parts.isEmpty();
			case EaglemodelPackage.SCHEMATIC__SHEETS:
				return sheets != null && !sheets.isEmpty();
			case EaglemodelPackage.SCHEMATIC__ERRORS:
				return errors != null && !errors.isEmpty();
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
		result.append(" (xreflabel: ");
		result.append(xreflabel);
		result.append(", xrefpart: ");
		result.append(xrefpart);
		result.append(')');
		return result.toString();
	}

} //SchematicImpl
