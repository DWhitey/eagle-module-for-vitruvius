/**
 */
package eaglemodel.impl;

import eaglemodel.Dimension;
import eaglemodel.DimensionType;
import eaglemodel.EaglemodelPackage;
import eaglemodel.GridUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getX3 <em>X3</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getY3 <em>Y3</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getDtype <em>Dtype</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getExtwidth <em>Extwidth</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getExtlength <em>Extlength</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getExtoffset <em>Extoffset</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getTextsize <em>Textsize</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getTextratio <em>Textratio</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link eaglemodel.impl.DimensionImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final double X1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected double x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final double Y1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected double y1 = Y1_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final double X2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected double x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final double Y2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected double y2 = Y2_EDEFAULT;

	/**
	 * The default value of the '{@link #getX3() <em>X3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX3()
	 * @generated
	 * @ordered
	 */
	protected static final double X3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX3() <em>X3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX3()
	 * @generated
	 * @ordered
	 */
	protected double x3 = X3_EDEFAULT;

	/**
	 * The default value of the '{@link #getY3() <em>Y3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3()
	 * @generated
	 * @ordered
	 */
	protected static final double Y3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY3() <em>Y3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY3()
	 * @generated
	 * @ordered
	 */
	protected double y3 = Y3_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected int layer = LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionType DTYPE_EDEFAULT = DimensionType.PARALLEL;

	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected DimensionType dtype = DTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtwidth() <em>Extwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtwidth()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTWIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtwidth() <em>Extwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtwidth()
	 * @generated
	 * @ordered
	 */
	protected double extwidth = EXTWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtlength() <em>Extlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtlength()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtlength() <em>Extlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtlength()
	 * @generated
	 * @ordered
	 */
	protected double extlength = EXTLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtoffset() <em>Extoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtoffset()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTOFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExtoffset() <em>Extoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtoffset()
	 * @generated
	 * @ordered
	 */
	protected double extoffset = EXTOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextsize() <em>Textsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextsize()
	 * @generated
	 * @ordered
	 */
	protected static final double TEXTSIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTextsize() <em>Textsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextsize()
	 * @generated
	 * @ordered
	 */
	protected double textsize = TEXTSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextratio() <em>Textratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextratio()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXTRATIO_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getTextratio() <em>Textratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextratio()
	 * @generated
	 * @ordered
	 */
	protected int textratio = TEXTRATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GridUnit UNIT_EDEFAULT = GridUnit.MM;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GridUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(double newX1) {
		double oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(double newY1) {
		double oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(double newX2) {
		double oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(double newY2) {
		double oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__Y2, oldY2, y2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX3() {
		return x3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX3(double newX3) {
		double oldX3 = x3;
		x3 = newX3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__X3, oldX3, x3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY3() {
		return y3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY3(double newY3) {
		double oldY3 = y3;
		y3 = newY3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__Y3, oldY3, y3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(int newLayer) {
		int oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType getDtype() {
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtype(DimensionType newDtype) {
		DimensionType oldDtype = dtype;
		dtype = newDtype == null ? DTYPE_EDEFAULT : newDtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__DTYPE, oldDtype, dtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExtwidth() {
		return extwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtwidth(double newExtwidth) {
		double oldExtwidth = extwidth;
		extwidth = newExtwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__EXTWIDTH, oldExtwidth, extwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExtlength() {
		return extlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtlength(double newExtlength) {
		double oldExtlength = extlength;
		extlength = newExtlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__EXTLENGTH, oldExtlength, extlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExtoffset() {
		return extoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtoffset(double newExtoffset) {
		double oldExtoffset = extoffset;
		extoffset = newExtoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__EXTOFFSET, oldExtoffset, extoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTextsize() {
		return textsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextsize(double newTextsize) {
		double oldTextsize = textsize;
		textsize = newTextsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__TEXTSIZE, oldTextsize, textsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextratio() {
		return textratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextratio(int newTextratio) {
		int oldTextratio = textratio;
		textratio = newTextratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__TEXTRATIO, oldTextratio, textratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GridUnit newUnit) {
		GridUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.DIMENSION__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.DIMENSION__X1:
				return getX1();
			case EaglemodelPackage.DIMENSION__Y1:
				return getY1();
			case EaglemodelPackage.DIMENSION__X2:
				return getX2();
			case EaglemodelPackage.DIMENSION__Y2:
				return getY2();
			case EaglemodelPackage.DIMENSION__X3:
				return getX3();
			case EaglemodelPackage.DIMENSION__Y3:
				return getY3();
			case EaglemodelPackage.DIMENSION__LAYER:
				return getLayer();
			case EaglemodelPackage.DIMENSION__DTYPE:
				return getDtype();
			case EaglemodelPackage.DIMENSION__WIDTH:
				return getWidth();
			case EaglemodelPackage.DIMENSION__EXTWIDTH:
				return getExtwidth();
			case EaglemodelPackage.DIMENSION__EXTLENGTH:
				return getExtlength();
			case EaglemodelPackage.DIMENSION__EXTOFFSET:
				return getExtoffset();
			case EaglemodelPackage.DIMENSION__TEXTSIZE:
				return getTextsize();
			case EaglemodelPackage.DIMENSION__TEXTRATIO:
				return getTextratio();
			case EaglemodelPackage.DIMENSION__UNIT:
				return getUnit();
			case EaglemodelPackage.DIMENSION__PRECISION:
				return getPrecision();
			case EaglemodelPackage.DIMENSION__VISIBLE:
				return isVisible();
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
			case EaglemodelPackage.DIMENSION__X1:
				setX1((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__Y1:
				setY1((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__X2:
				setX2((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__Y2:
				setY2((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__X3:
				setX3((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__Y3:
				setY3((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__LAYER:
				setLayer((Integer)newValue);
				return;
			case EaglemodelPackage.DIMENSION__DTYPE:
				setDtype((DimensionType)newValue);
				return;
			case EaglemodelPackage.DIMENSION__WIDTH:
				setWidth((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__EXTWIDTH:
				setExtwidth((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__EXTLENGTH:
				setExtlength((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__EXTOFFSET:
				setExtoffset((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__TEXTSIZE:
				setTextsize((Double)newValue);
				return;
			case EaglemodelPackage.DIMENSION__TEXTRATIO:
				setTextratio((Integer)newValue);
				return;
			case EaglemodelPackage.DIMENSION__UNIT:
				setUnit((GridUnit)newValue);
				return;
			case EaglemodelPackage.DIMENSION__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case EaglemodelPackage.DIMENSION__VISIBLE:
				setVisible((Boolean)newValue);
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
			case EaglemodelPackage.DIMENSION__X1:
				setX1(X1_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__X2:
				setX2(X2_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__Y2:
				setY2(Y2_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__X3:
				setX3(X3_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__Y3:
				setY3(Y3_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__DTYPE:
				setDtype(DTYPE_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__EXTWIDTH:
				setExtwidth(EXTWIDTH_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__EXTLENGTH:
				setExtlength(EXTLENGTH_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__EXTOFFSET:
				setExtoffset(EXTOFFSET_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__TEXTSIZE:
				setTextsize(TEXTSIZE_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__TEXTRATIO:
				setTextratio(TEXTRATIO_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case EaglemodelPackage.DIMENSION__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
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
			case EaglemodelPackage.DIMENSION__X1:
				return x1 != X1_EDEFAULT;
			case EaglemodelPackage.DIMENSION__Y1:
				return y1 != Y1_EDEFAULT;
			case EaglemodelPackage.DIMENSION__X2:
				return x2 != X2_EDEFAULT;
			case EaglemodelPackage.DIMENSION__Y2:
				return y2 != Y2_EDEFAULT;
			case EaglemodelPackage.DIMENSION__X3:
				return x3 != X3_EDEFAULT;
			case EaglemodelPackage.DIMENSION__Y3:
				return y3 != Y3_EDEFAULT;
			case EaglemodelPackage.DIMENSION__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.DIMENSION__DTYPE:
				return dtype != DTYPE_EDEFAULT;
			case EaglemodelPackage.DIMENSION__WIDTH:
				return width != WIDTH_EDEFAULT;
			case EaglemodelPackage.DIMENSION__EXTWIDTH:
				return extwidth != EXTWIDTH_EDEFAULT;
			case EaglemodelPackage.DIMENSION__EXTLENGTH:
				return extlength != EXTLENGTH_EDEFAULT;
			case EaglemodelPackage.DIMENSION__EXTOFFSET:
				return extoffset != EXTOFFSET_EDEFAULT;
			case EaglemodelPackage.DIMENSION__TEXTSIZE:
				return textsize != TEXTSIZE_EDEFAULT;
			case EaglemodelPackage.DIMENSION__TEXTRATIO:
				return textratio != TEXTRATIO_EDEFAULT;
			case EaglemodelPackage.DIMENSION__UNIT:
				return unit != UNIT_EDEFAULT;
			case EaglemodelPackage.DIMENSION__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case EaglemodelPackage.DIMENSION__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
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
		result.append(" (x1: ");
		result.append(x1);
		result.append(", y1: ");
		result.append(y1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", y2: ");
		result.append(y2);
		result.append(", x3: ");
		result.append(x3);
		result.append(", y3: ");
		result.append(y3);
		result.append(", layer: ");
		result.append(layer);
		result.append(", dtype: ");
		result.append(dtype);
		result.append(", width: ");
		result.append(width);
		result.append(", extwidth: ");
		result.append(extwidth);
		result.append(", extlength: ");
		result.append(extlength);
		result.append(", extoffset: ");
		result.append(extoffset);
		result.append(", textsize: ");
		result.append(textsize);
		result.append(", textratio: ");
		result.append(textratio);
		result.append(", unit: ");
		result.append(unit);
		result.append(", precision: ");
		result.append(precision);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
