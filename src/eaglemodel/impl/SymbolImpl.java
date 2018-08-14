/**
 */
package eaglemodel.impl;

import eaglemodel.Circle;
import eaglemodel.Description;
import eaglemodel.Dimension;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Frame;
import eaglemodel.Pin;
import eaglemodel.Polygon;
import eaglemodel.Rectangle;
import eaglemodel.Symbol;
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
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getText <em>Text</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link eaglemodel.impl.SymbolImpl#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolImpl extends MinimalEObjectImpl.Container implements Symbol {
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
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected EList pin;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SYMBOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SYMBOL__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.SYMBOL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SYMBOL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPolygon() {
		if (polygon == null) {
			polygon = new EObjectResolvingEList(Polygon.class, this, EaglemodelPackage.SYMBOL__POLYGON);
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
			wire = new EObjectResolvingEList(Wire.class, this, EaglemodelPackage.SYMBOL__WIRE);
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
			text = new EObjectResolvingEList(Text.class, this, EaglemodelPackage.SYMBOL__TEXT);
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
			dimension = new EObjectResolvingEList(Dimension.class, this, EaglemodelPackage.SYMBOL__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPin() {
		if (pin == null) {
			pin = new EObjectResolvingEList(Pin.class, this, EaglemodelPackage.SYMBOL__PIN);
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCircle() {
		if (circle == null) {
			circle = new EObjectResolvingEList(Circle.class, this, EaglemodelPackage.SYMBOL__CIRCLE);
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
			rectangle = new EObjectResolvingEList(Rectangle.class, this, EaglemodelPackage.SYMBOL__RECTANGLE);
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
			frame = new EObjectResolvingEList(Frame.class, this, EaglemodelPackage.SYMBOL__FRAME);
		}
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.SYMBOL__NAME:
				return getName();
			case EaglemodelPackage.SYMBOL__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case EaglemodelPackage.SYMBOL__POLYGON:
				return getPolygon();
			case EaglemodelPackage.SYMBOL__WIRE:
				return getWire();
			case EaglemodelPackage.SYMBOL__TEXT:
				return getText();
			case EaglemodelPackage.SYMBOL__DIMENSION:
				return getDimension();
			case EaglemodelPackage.SYMBOL__PIN:
				return getPin();
			case EaglemodelPackage.SYMBOL__CIRCLE:
				return getCircle();
			case EaglemodelPackage.SYMBOL__RECTANGLE:
				return getRectangle();
			case EaglemodelPackage.SYMBOL__FRAME:
				return getFrame();
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
			case EaglemodelPackage.SYMBOL__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.SYMBOL__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.SYMBOL__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__WIRE:
				getWire().clear();
				getWire().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__TEXT:
				getText().clear();
				getText().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__PIN:
				getPin().clear();
				getPin().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SYMBOL__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection)newValue);
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
			case EaglemodelPackage.SYMBOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.SYMBOL__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.SYMBOL__POLYGON:
				getPolygon().clear();
				return;
			case EaglemodelPackage.SYMBOL__WIRE:
				getWire().clear();
				return;
			case EaglemodelPackage.SYMBOL__TEXT:
				getText().clear();
				return;
			case EaglemodelPackage.SYMBOL__DIMENSION:
				getDimension().clear();
				return;
			case EaglemodelPackage.SYMBOL__PIN:
				getPin().clear();
				return;
			case EaglemodelPackage.SYMBOL__CIRCLE:
				getCircle().clear();
				return;
			case EaglemodelPackage.SYMBOL__RECTANGLE:
				getRectangle().clear();
				return;
			case EaglemodelPackage.SYMBOL__FRAME:
				getFrame().clear();
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
			case EaglemodelPackage.SYMBOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.SYMBOL__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.SYMBOL__POLYGON:
				return polygon != null && !polygon.isEmpty();
			case EaglemodelPackage.SYMBOL__WIRE:
				return wire != null && !wire.isEmpty();
			case EaglemodelPackage.SYMBOL__TEXT:
				return text != null && !text.isEmpty();
			case EaglemodelPackage.SYMBOL__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case EaglemodelPackage.SYMBOL__PIN:
				return pin != null && !pin.isEmpty();
			case EaglemodelPackage.SYMBOL__CIRCLE:
				return circle != null && !circle.isEmpty();
			case EaglemodelPackage.SYMBOL__RECTANGLE:
				return rectangle != null && !rectangle.isEmpty();
			case EaglemodelPackage.SYMBOL__FRAME:
				return frame != null && !frame.isEmpty();
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

} //SymbolImpl
