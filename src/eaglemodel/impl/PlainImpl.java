/**
 */
package eaglemodel.impl;

import eaglemodel.Circle;
import eaglemodel.Dimension;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Frame;
import eaglemodel.Hole;
import eaglemodel.Plain;
import eaglemodel.Polygon;
import eaglemodel.Rectangle;
import eaglemodel.Text;
import eaglemodel.Wire;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.PlainImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getText <em>Text</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link eaglemodel.impl.PlainImpl#getHole <em>Hole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainImpl extends MinimalEObjectImpl.Container implements Plain {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.PLAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Polygon> getPolygon() {
		if (polygon == null) {
			polygon = new EObjectContainmentEList<Polygon>(Polygon.class, this, EaglemodelPackage.PLAIN__POLYGON);
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
			wire = new EObjectContainmentEList<Wire>(Wire.class, this, EaglemodelPackage.PLAIN__WIRE);
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
			text = new EObjectContainmentEList<Text>(Text.class, this, EaglemodelPackage.PLAIN__TEXT);
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
			dimension = new EObjectContainmentEList<Dimension>(Dimension.class, this, EaglemodelPackage.PLAIN__DIMENSION);
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
			circle = new EObjectContainmentEList<Circle>(Circle.class, this, EaglemodelPackage.PLAIN__CIRCLE);
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
			rectangle = new EObjectContainmentEList<Rectangle>(Rectangle.class, this, EaglemodelPackage.PLAIN__RECTANGLE);
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
			frame = new EObjectContainmentEList<Frame>(Frame.class, this, EaglemodelPackage.PLAIN__FRAME);
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
			hole = new EObjectContainmentEList<Hole>(Hole.class, this, EaglemodelPackage.PLAIN__HOLE);
		}
		return hole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.PLAIN__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__WIRE:
				return ((InternalEList<?>)getWire()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__RECTANGLE:
				return ((InternalEList<?>)getRectangle()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.PLAIN__HOLE:
				return ((InternalEList<?>)getHole()).basicRemove(otherEnd, msgs);
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
			case EaglemodelPackage.PLAIN__POLYGON:
				return getPolygon();
			case EaglemodelPackage.PLAIN__WIRE:
				return getWire();
			case EaglemodelPackage.PLAIN__TEXT:
				return getText();
			case EaglemodelPackage.PLAIN__DIMENSION:
				return getDimension();
			case EaglemodelPackage.PLAIN__CIRCLE:
				return getCircle();
			case EaglemodelPackage.PLAIN__RECTANGLE:
				return getRectangle();
			case EaglemodelPackage.PLAIN__FRAME:
				return getFrame();
			case EaglemodelPackage.PLAIN__HOLE:
				return getHole();
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
			case EaglemodelPackage.PLAIN__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends Polygon>)newValue);
				return;
			case EaglemodelPackage.PLAIN__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
				return;
			case EaglemodelPackage.PLAIN__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends Text>)newValue);
				return;
			case EaglemodelPackage.PLAIN__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Dimension>)newValue);
				return;
			case EaglemodelPackage.PLAIN__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends Circle>)newValue);
				return;
			case EaglemodelPackage.PLAIN__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection<? extends Rectangle>)newValue);
				return;
			case EaglemodelPackage.PLAIN__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends Frame>)newValue);
				return;
			case EaglemodelPackage.PLAIN__HOLE:
				getHole().clear();
				getHole().addAll((Collection<? extends Hole>)newValue);
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
			case EaglemodelPackage.PLAIN__POLYGON:
				getPolygon().clear();
				return;
			case EaglemodelPackage.PLAIN__WIRE:
				getWire().clear();
				return;
			case EaglemodelPackage.PLAIN__TEXT:
				getText().clear();
				return;
			case EaglemodelPackage.PLAIN__DIMENSION:
				getDimension().clear();
				return;
			case EaglemodelPackage.PLAIN__CIRCLE:
				getCircle().clear();
				return;
			case EaglemodelPackage.PLAIN__RECTANGLE:
				getRectangle().clear();
				return;
			case EaglemodelPackage.PLAIN__FRAME:
				getFrame().clear();
				return;
			case EaglemodelPackage.PLAIN__HOLE:
				getHole().clear();
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
			case EaglemodelPackage.PLAIN__POLYGON:
				return polygon != null && !polygon.isEmpty();
			case EaglemodelPackage.PLAIN__WIRE:
				return wire != null && !wire.isEmpty();
			case EaglemodelPackage.PLAIN__TEXT:
				return text != null && !text.isEmpty();
			case EaglemodelPackage.PLAIN__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case EaglemodelPackage.PLAIN__CIRCLE:
				return circle != null && !circle.isEmpty();
			case EaglemodelPackage.PLAIN__RECTANGLE:
				return rectangle != null && !rectangle.isEmpty();
			case EaglemodelPackage.PLAIN__FRAME:
				return frame != null && !frame.isEmpty();
			case EaglemodelPackage.PLAIN__HOLE:
				return hole != null && !hole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlainImpl
