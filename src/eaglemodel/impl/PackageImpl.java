/**
 */
package eaglemodel.impl;

import eaglemodel.Circle;
import eaglemodel.Description;
import eaglemodel.Dimension;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Frame;
import eaglemodel.Hole;
import eaglemodel.Pad;
import eaglemodel.Polygon;
import eaglemodel.Rectangle;
import eaglemodel.SMD;
import eaglemodel.Text;
import eaglemodel.Wire;

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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getText <em>Text</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getHole <em>Hole</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getPad <em>Pad</em>}</li>
 *   <li>{@link eaglemodel.impl.PackageImpl#getSmd <em>Smd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements eaglemodel.Package {
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
	 * The cached value of the '{@link #getPolygon() <em>Polygon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygon()
	 * @generated
	 * @ordered
	 */
	protected EList polygon;

	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected EList wire;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList text;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList dimension;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected EList circle;

	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected EList rectangle;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected EList frame;

	/**
	 * The cached value of the '{@link #getHole() <em>Hole</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHole()
	 * @generated
	 * @ordered
	 */
	protected EList hole;

	/**
	 * The cached value of the '{@link #getPad() <em>Pad</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPad()
	 * @generated
	 * @ordered
	 */
	protected EList pad;

	/**
	 * The cached value of the '{@link #getSmd() <em>Smd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmd()
	 * @generated
	 * @ordered
	 */
	protected EList smd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PACKAGE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.PACKAGE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPolygon() {
		if (polygon == null) {
			polygon = new EObjectResolvingEList(Polygon.class, this, EaglemodelPackage.PACKAGE__POLYGON);
		}
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWire() {
		if (wire == null) {
			wire = new EObjectResolvingEList(Wire.class, this, EaglemodelPackage.PACKAGE__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getText() {
		if (text == null) {
			text = new EObjectResolvingEList(Text.class, this, EaglemodelPackage.PACKAGE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDimension() {
		if (dimension == null) {
			dimension = new EObjectResolvingEList(Dimension.class, this, EaglemodelPackage.PACKAGE__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCircle() {
		if (circle == null) {
			circle = new EObjectResolvingEList(Circle.class, this, EaglemodelPackage.PACKAGE__CIRCLE);
		}
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRectangle() {
		if (rectangle == null) {
			rectangle = new EObjectResolvingEList(Rectangle.class, this, EaglemodelPackage.PACKAGE__RECTANGLE);
		}
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFrame() {
		if (frame == null) {
			frame = new EObjectResolvingEList(Frame.class, this, EaglemodelPackage.PACKAGE__FRAME);
		}
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHole() {
		if (hole == null) {
			hole = new EObjectResolvingEList(Hole.class, this, EaglemodelPackage.PACKAGE__HOLE);
		}
		return hole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPad() {
		if (pad == null) {
			pad = new EObjectResolvingEList(Pad.class, this, EaglemodelPackage.PACKAGE__PAD);
		}
		return pad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSmd() {
		if (smd == null) {
			smd = new EObjectResolvingEList(SMD.class, this, EaglemodelPackage.PACKAGE__SMD);
		}
		return smd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.PACKAGE__NAME:
				return getName();
			case EaglemodelPackage.PACKAGE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case EaglemodelPackage.PACKAGE__POLYGON:
				return getPolygon();
			case EaglemodelPackage.PACKAGE__WIRE:
				return getWire();
			case EaglemodelPackage.PACKAGE__TEXT:
				return getText();
			case EaglemodelPackage.PACKAGE__DIMENSION:
				return getDimension();
			case EaglemodelPackage.PACKAGE__CIRCLE:
				return getCircle();
			case EaglemodelPackage.PACKAGE__RECTANGLE:
				return getRectangle();
			case EaglemodelPackage.PACKAGE__FRAME:
				return getFrame();
			case EaglemodelPackage.PACKAGE__HOLE:
				return getHole();
			case EaglemodelPackage.PACKAGE__PAD:
				return getPad();
			case EaglemodelPackage.PACKAGE__SMD:
				return getSmd();
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
			case EaglemodelPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.PACKAGE__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.PACKAGE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__WIRE:
				getWire().clear();
				getWire().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__TEXT:
				getText().clear();
				getText().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__HOLE:
				getHole().clear();
				getHole().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__PAD:
				getPad().clear();
				getPad().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PACKAGE__SMD:
				getSmd().clear();
				getSmd().addAll((Collection)newValue);
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
			case EaglemodelPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.PACKAGE__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.PACKAGE__POLYGON:
				getPolygon().clear();
				return;
			case EaglemodelPackage.PACKAGE__WIRE:
				getWire().clear();
				return;
			case EaglemodelPackage.PACKAGE__TEXT:
				getText().clear();
				return;
			case EaglemodelPackage.PACKAGE__DIMENSION:
				getDimension().clear();
				return;
			case EaglemodelPackage.PACKAGE__CIRCLE:
				getCircle().clear();
				return;
			case EaglemodelPackage.PACKAGE__RECTANGLE:
				getRectangle().clear();
				return;
			case EaglemodelPackage.PACKAGE__FRAME:
				getFrame().clear();
				return;
			case EaglemodelPackage.PACKAGE__HOLE:
				getHole().clear();
				return;
			case EaglemodelPackage.PACKAGE__PAD:
				getPad().clear();
				return;
			case EaglemodelPackage.PACKAGE__SMD:
				getSmd().clear();
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
			case EaglemodelPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.PACKAGE__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.PACKAGE__POLYGON:
				return polygon != null && !polygon.isEmpty();
			case EaglemodelPackage.PACKAGE__WIRE:
				return wire != null && !wire.isEmpty();
			case EaglemodelPackage.PACKAGE__TEXT:
				return text != null && !text.isEmpty();
			case EaglemodelPackage.PACKAGE__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case EaglemodelPackage.PACKAGE__CIRCLE:
				return circle != null && !circle.isEmpty();
			case EaglemodelPackage.PACKAGE__RECTANGLE:
				return rectangle != null && !rectangle.isEmpty();
			case EaglemodelPackage.PACKAGE__FRAME:
				return frame != null && !frame.isEmpty();
			case EaglemodelPackage.PACKAGE__HOLE:
				return hole != null && !hole.isEmpty();
			case EaglemodelPackage.PACKAGE__PAD:
				return pad != null && !pad.isEmpty();
			case EaglemodelPackage.PACKAGE__SMD:
				return smd != null && !smd.isEmpty();
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

} //PackageImpl
