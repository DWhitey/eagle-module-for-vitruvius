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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
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
 * </p>
 *
 * @generated
 */
public class PlainImpl extends MinimalEObjectImpl.Container implements Plain {
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
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.PLAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPolygon() {
		if (polygon == null) {
			polygon = new EObjectResolvingEList(Polygon.class, this, EaglemodelPackage.PLAIN__POLYGON);
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
			wire = new EObjectResolvingEList(Wire.class, this, EaglemodelPackage.PLAIN__WIRE);
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
			text = new EObjectResolvingEList(Text.class, this, EaglemodelPackage.PLAIN__TEXT);
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
			dimension = new EObjectResolvingEList(Dimension.class, this, EaglemodelPackage.PLAIN__DIMENSION);
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
			circle = new EObjectResolvingEList(Circle.class, this, EaglemodelPackage.PLAIN__CIRCLE);
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
			rectangle = new EObjectResolvingEList(Rectangle.class, this, EaglemodelPackage.PLAIN__RECTANGLE);
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
			frame = new EObjectResolvingEList(Frame.class, this, EaglemodelPackage.PLAIN__FRAME);
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
			hole = new EObjectResolvingEList(Hole.class, this, EaglemodelPackage.PLAIN__HOLE);
		}
		return hole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.PLAIN__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__WIRE:
				getWire().clear();
				getWire().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__TEXT:
				getText().clear();
				getText().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__RECTANGLE:
				getRectangle().clear();
				getRectangle().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.PLAIN__HOLE:
				getHole().clear();
				getHole().addAll((Collection)newValue);
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
