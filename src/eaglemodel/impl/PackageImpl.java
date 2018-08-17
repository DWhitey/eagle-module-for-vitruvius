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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getPolygon() <em>Polygon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygon()
	 * @generated
	 * @ordered
	 */
	protected EList<Polygon> polygon;

	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> wire;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> text;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimension;

	/**
	 * The cached value of the '{@link #getCircle() <em>Circle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircle()
	 * @generated
	 * @ordered
	 */
	protected EList<Circle> circle;

	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected EList<Rectangle> rectangle;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected EList<Frame> frame;

	/**
	 * The cached value of the '{@link #getHole() <em>Hole</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHole()
	 * @generated
	 * @ordered
	 */
	protected EList<Hole> hole;

	/**
	 * The cached value of the '{@link #getPad() <em>Pad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPad()
	 * @generated
	 * @ordered
	 */
	protected EList<Pad> pad;

	/**
	 * The cached value of the '{@link #getSmd() <em>Smd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmd()
	 * @generated
	 * @ordered
	 */
	protected EList<SMD> smd;

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
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PACKAGE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.PACKAGE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.PACKAGE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.PACKAGE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Polygon> getPolygon() {
		if (polygon == null) {
			polygon = new EObjectContainmentEList<Polygon>(Polygon.class, this, EaglemodelPackage.PACKAGE__POLYGON);
		}
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWire() {
		if (wire == null) {
			wire = new EObjectContainmentEList<Wire>(Wire.class, this, EaglemodelPackage.PACKAGE__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<Text>(Text.class, this, EaglemodelPackage.PACKAGE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentEList<Dimension>(Dimension.class, this, EaglemodelPackage.PACKAGE__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Circle> getCircle() {
		if (circle == null) {
			circle = new EObjectContainmentEList<Circle>(Circle.class, this, EaglemodelPackage.PACKAGE__CIRCLE);
		}
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rectangle> getRectangle() {
		if (rectangle == null) {
			rectangle = new EObjectContainmentEList<Rectangle>(Rectangle.class, this, EaglemodelPackage.PACKAGE__RECTANGLE);
		}
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frame> getFrame() {
		if (frame == null) {
			frame = new EObjectContainmentEList<Frame>(Frame.class, this, EaglemodelPackage.PACKAGE__FRAME);
		}
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hole> getHole() {
		if (hole == null) {
			hole = new EObjectContainmentEList<Hole>(Hole.class, this, EaglemodelPackage.PACKAGE__HOLE);
		}
		return hole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pad> getPad() {
		if (pad == null) {
			pad = new EObjectContainmentEList<Pad>(Pad.class, this, EaglemodelPackage.PACKAGE__PAD);
		}
		return pad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SMD> getSmd() {
		if (smd == null) {
			smd = new EObjectContainmentEList<SMD>(SMD.class, this, EaglemodelPackage.PACKAGE__SMD);
		}
		return smd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.PACKAGE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EaglemodelPackage.PACKAGE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__WIRE:
				return ((InternalEList<?>)getWire()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__RECTANGLE:
				return ((InternalEList<?>)getRectangle()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__HOLE:
				return ((InternalEList<?>)getHole()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__PAD:
				return ((InternalEList<?>)getPad()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PACKAGE__SMD:
				return ((InternalEList<?>)getSmd()).basicRemove(otherEnd, msgs);
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
			case EaglemodelPackage.PACKAGE__NAME:
				return getName();
			case EaglemodelPackage.PACKAGE__DESCRIPTION:
				return getDescription();
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
	@SuppressWarnings("unchecked")
	@Override
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
				getPolygon().addAll((Collection<? extends Polygon>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends Text>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Dimension>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends Circle>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends Rectangle>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends Frame>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__HOLE:
				getHole().clear();
				getHole().addAll((Collection<? extends Hole>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__PAD:
				getPad().clear();
				getPad().addAll((Collection<? extends Pad>)newValue);
				return;
			case EaglemodelPackage.PACKAGE__SMD:
				getSmd().clear();
				getSmd().addAll((Collection<? extends SMD>)newValue);
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
	@Override
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
