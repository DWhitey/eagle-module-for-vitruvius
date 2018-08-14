/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Frame;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.FrameImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#isBorderleft <em>Borderleft</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#isBordertop <em>Bordertop</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#isBorderright <em>Borderright</em>}</li>
 *   <li>{@link eaglemodel.impl.FrameImpl#isBorderbottom <em>Borderbottom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameImpl extends MinimalEObjectImpl.Container implements Frame {
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
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

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
	 * The default value of the '{@link #isBorderleft() <em>Borderleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderleft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERLEFT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBorderleft() <em>Borderleft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderleft()
	 * @generated
	 * @ordered
	 */
	protected boolean borderleft = BORDERLEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBordertop() <em>Bordertop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBordertop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERTOP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBordertop() <em>Bordertop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBordertop()
	 * @generated
	 * @ordered
	 */
	protected boolean bordertop = BORDERTOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isBorderright() <em>Borderright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderright()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERRIGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBorderright() <em>Borderright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderright()
	 * @generated
	 * @ordered
	 */
	protected boolean borderright = BORDERRIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBorderbottom() <em>Borderbottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderbottom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BORDERBOTTOM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBorderbottom() <em>Borderbottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBorderbottom()
	 * @generated
	 * @ordered
	 */
	protected boolean borderbottom = BORDERBOTTOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.FRAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__X1, oldX1, x1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__Y1, oldY1, y1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__X2, oldX2, x2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__Y2, oldY2, y2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__ROWS, oldRows, rows));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorderleft() {
		return borderleft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderleft(boolean newBorderleft) {
		boolean oldBorderleft = borderleft;
		borderleft = newBorderleft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__BORDERLEFT, oldBorderleft, borderleft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBordertop() {
		return bordertop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBordertop(boolean newBordertop) {
		boolean oldBordertop = bordertop;
		bordertop = newBordertop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__BORDERTOP, oldBordertop, bordertop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorderright() {
		return borderright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderright(boolean newBorderright) {
		boolean oldBorderright = borderright;
		borderright = newBorderright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__BORDERRIGHT, oldBorderright, borderright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBorderbottom() {
		return borderbottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderbottom(boolean newBorderbottom) {
		boolean oldBorderbottom = borderbottom;
		borderbottom = newBorderbottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.FRAME__BORDERBOTTOM, oldBorderbottom, borderbottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.FRAME__X1:
				return new Double(getX1());
			case EaglemodelPackage.FRAME__Y1:
				return new Double(getY1());
			case EaglemodelPackage.FRAME__X2:
				return new Double(getX2());
			case EaglemodelPackage.FRAME__Y2:
				return new Double(getY2());
			case EaglemodelPackage.FRAME__COLUMNS:
				return new Integer(getColumns());
			case EaglemodelPackage.FRAME__ROWS:
				return new Integer(getRows());
			case EaglemodelPackage.FRAME__LAYER:
				return new Integer(getLayer());
			case EaglemodelPackage.FRAME__BORDERLEFT:
				return isBorderleft() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.FRAME__BORDERTOP:
				return isBordertop() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.FRAME__BORDERRIGHT:
				return isBorderright() ? Boolean.TRUE : Boolean.FALSE;
			case EaglemodelPackage.FRAME__BORDERBOTTOM:
				return isBorderbottom() ? Boolean.TRUE : Boolean.FALSE;
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
			case EaglemodelPackage.FRAME__X1:
				setX1(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.FRAME__Y1:
				setY1(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.FRAME__X2:
				setX2(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.FRAME__Y2:
				setY2(((Double)newValue).doubleValue());
				return;
			case EaglemodelPackage.FRAME__COLUMNS:
				setColumns(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.FRAME__ROWS:
				setRows(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.FRAME__LAYER:
				setLayer(((Integer)newValue).intValue());
				return;
			case EaglemodelPackage.FRAME__BORDERLEFT:
				setBorderleft(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.FRAME__BORDERTOP:
				setBordertop(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.FRAME__BORDERRIGHT:
				setBorderright(((Boolean)newValue).booleanValue());
				return;
			case EaglemodelPackage.FRAME__BORDERBOTTOM:
				setBorderbottom(((Boolean)newValue).booleanValue());
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
			case EaglemodelPackage.FRAME__X1:
				setX1(X1_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__X2:
				setX2(X2_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__Y2:
				setY2(Y2_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__BORDERLEFT:
				setBorderleft(BORDERLEFT_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__BORDERTOP:
				setBordertop(BORDERTOP_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__BORDERRIGHT:
				setBorderright(BORDERRIGHT_EDEFAULT);
				return;
			case EaglemodelPackage.FRAME__BORDERBOTTOM:
				setBorderbottom(BORDERBOTTOM_EDEFAULT);
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
			case EaglemodelPackage.FRAME__X1:
				return x1 != X1_EDEFAULT;
			case EaglemodelPackage.FRAME__Y1:
				return y1 != Y1_EDEFAULT;
			case EaglemodelPackage.FRAME__X2:
				return x2 != X2_EDEFAULT;
			case EaglemodelPackage.FRAME__Y2:
				return y2 != Y2_EDEFAULT;
			case EaglemodelPackage.FRAME__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case EaglemodelPackage.FRAME__ROWS:
				return rows != ROWS_EDEFAULT;
			case EaglemodelPackage.FRAME__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.FRAME__BORDERLEFT:
				return borderleft != BORDERLEFT_EDEFAULT;
			case EaglemodelPackage.FRAME__BORDERTOP:
				return bordertop != BORDERTOP_EDEFAULT;
			case EaglemodelPackage.FRAME__BORDERRIGHT:
				return borderright != BORDERRIGHT_EDEFAULT;
			case EaglemodelPackage.FRAME__BORDERBOTTOM:
				return borderbottom != BORDERBOTTOM_EDEFAULT;
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
		result.append(" (x1: ");
		result.append(x1);
		result.append(", y1: ");
		result.append(y1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", y2: ");
		result.append(y2);
		result.append(", columns: ");
		result.append(columns);
		result.append(", rows: ");
		result.append(rows);
		result.append(", layer: ");
		result.append(layer);
		result.append(", borderleft: ");
		result.append(borderleft);
		result.append(", bordertop: ");
		result.append(bordertop);
		result.append(", borderright: ");
		result.append(borderright);
		result.append(", borderbottom: ");
		result.append(borderbottom);
		result.append(')');
		return result.toString();
	}

} //FrameImpl
