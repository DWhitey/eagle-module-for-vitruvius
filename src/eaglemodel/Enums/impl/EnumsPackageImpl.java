/**
 */
package eaglemodel.Enums.impl;

import eaglemodel.EaglemodelPackage;

import eaglemodel.Enums.Align;
import eaglemodel.Enums.AttributeDisplay;
import eaglemodel.Enums.ContactRoute;
import eaglemodel.Enums.DimensionType;
import eaglemodel.Enums.EnumsFactory;
import eaglemodel.Enums.EnumsPackage;
import eaglemodel.Enums.GateAddLevel;
import eaglemodel.Enums.GridStyle;
import eaglemodel.Enums.GridUnit;
import eaglemodel.Enums.PadShape;
import eaglemodel.Enums.PinDirection;
import eaglemodel.Enums.PinFunction;
import eaglemodel.Enums.PinLength;
import eaglemodel.Enums.PinVisible;
import eaglemodel.Enums.PolygonPour;
import eaglemodel.Enums.TextFont;
import eaglemodel.Enums.VerticalText;
import eaglemodel.Enums.WireCap;
import eaglemodel.Enums.WireStyle;

import eaglemodel.impl.EaglemodelPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumsPackageImpl extends EPackageImpl implements EnumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gateAddLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wireStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wireCapEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dimensionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gridUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gridStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textFontEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum padShapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polygonPourEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinVisibleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactRouteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeDisplayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalTextEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eaglemodel.Enums.EnumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumsPackageImpl() {
		super(eNS_URI, EnumsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumsPackage init() {
		if (isInited) return (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumsPackageImpl theEnumsPackage = registeredEnumsPackage instanceof EnumsPackageImpl ? (EnumsPackageImpl)registeredEnumsPackage : new EnumsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EaglemodelPackage.eNS_URI);
		EaglemodelPackageImpl theEaglemodelPackage = (EaglemodelPackageImpl)(registeredPackage instanceof EaglemodelPackageImpl ? registeredPackage : EaglemodelPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumsPackage.createPackageContents();
		theEaglemodelPackage.createPackageContents();

		// Initialize created meta-data
		theEnumsPackage.initializePackageContents();
		theEaglemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumsPackage.eNS_URI, theEnumsPackage);
		return theEnumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGateAddLevel() {
		return gateAddLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWireStyle() {
		return wireStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWireCap() {
		return wireCapEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDimensionType() {
		return dimensionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGridUnit() {
		return gridUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGridStyle() {
		return gridStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextFont() {
		return textFontEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPadShape() {
		return padShapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolygonPour() {
		return polygonPourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinVisible() {
		return pinVisibleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinLength() {
		return pinLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinDirection() {
		return pinDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPinFunction() {
		return pinFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactRoute() {
		return contactRouteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeDisplay() {
		return attributeDisplayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalText() {
		return verticalTextEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsFactory getEnumsFactory() {
		return (EnumsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		gateAddLevelEEnum = createEEnum(GATE_ADD_LEVEL);
		wireStyleEEnum = createEEnum(WIRE_STYLE);
		wireCapEEnum = createEEnum(WIRE_CAP);
		dimensionTypeEEnum = createEEnum(DIMENSION_TYPE);
		gridUnitEEnum = createEEnum(GRID_UNIT);
		gridStyleEEnum = createEEnum(GRID_STYLE);
		textFontEEnum = createEEnum(TEXT_FONT);
		alignEEnum = createEEnum(ALIGN);
		padShapeEEnum = createEEnum(PAD_SHAPE);
		polygonPourEEnum = createEEnum(POLYGON_POUR);
		pinVisibleEEnum = createEEnum(PIN_VISIBLE);
		pinLengthEEnum = createEEnum(PIN_LENGTH);
		pinDirectionEEnum = createEEnum(PIN_DIRECTION);
		pinFunctionEEnum = createEEnum(PIN_FUNCTION);
		contactRouteEEnum = createEEnum(CONTACT_ROUTE);
		attributeDisplayEEnum = createEEnum(ATTRIBUTE_DISPLAY);
		verticalTextEEnum = createEEnum(VERTICAL_TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(gateAddLevelEEnum, GateAddLevel.class, "GateAddLevel");
		addEEnumLiteral(gateAddLevelEEnum, GateAddLevel.MUST_LITERAL);
		addEEnumLiteral(gateAddLevelEEnum, GateAddLevel.CAN_LITERAL);
		addEEnumLiteral(gateAddLevelEEnum, GateAddLevel.NEXT_LITERAL);
		addEEnumLiteral(gateAddLevelEEnum, GateAddLevel.REQUEST_LITERAL);
		addEEnumLiteral(gateAddLevelEEnum, GateAddLevel.ALWAYS_LITERAL);

		initEEnum(wireStyleEEnum, WireStyle.class, "WireStyle");
		addEEnumLiteral(wireStyleEEnum, WireStyle.CONTINUOUS_LITERAL);
		addEEnumLiteral(wireStyleEEnum, WireStyle.LONGDASH_LITERAL);
		addEEnumLiteral(wireStyleEEnum, WireStyle.SHORTDASH_LITERAL);
		addEEnumLiteral(wireStyleEEnum, WireStyle.DASHDOT_LITERAL);

		initEEnum(wireCapEEnum, WireCap.class, "WireCap");
		addEEnumLiteral(wireCapEEnum, WireCap.FLAT_LITERAL);
		addEEnumLiteral(wireCapEEnum, WireCap.ROUND_LITERAL);

		initEEnum(dimensionTypeEEnum, DimensionType.class, "DimensionType");
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.PARALLEL_LITERAL);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.HORIZONTAL_LITERAL);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.VERTICAL_LITERAL);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.RADIUS_LITERAL);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.DIAMETER_LITERAL);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.LEADER_LITERAL);

		initEEnum(gridUnitEEnum, GridUnit.class, "GridUnit");
		addEEnumLiteral(gridUnitEEnum, GridUnit.MIC_LITERAL);
		addEEnumLiteral(gridUnitEEnum, GridUnit.MM_LITERAL);
		addEEnumLiteral(gridUnitEEnum, GridUnit.MIL_LITERAL);
		addEEnumLiteral(gridUnitEEnum, GridUnit.INCH_LITERAL);

		initEEnum(gridStyleEEnum, GridStyle.class, "GridStyle");
		addEEnumLiteral(gridStyleEEnum, GridStyle.LINES_LITERAL);
		addEEnumLiteral(gridStyleEEnum, GridStyle.DOTS_LITERAL);

		initEEnum(textFontEEnum, TextFont.class, "TextFont");
		addEEnumLiteral(textFontEEnum, TextFont.VECTOR_LITERAL);
		addEEnumLiteral(textFontEEnum, TextFont.PROPORTIONAL_LITERAL);
		addEEnumLiteral(textFontEEnum, TextFont.FIXED_LITERAL);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.BOTTOMLEFT_LITERAL);
		addEEnumLiteral(alignEEnum, Align.BOTTOMCENTER_LITERAL);
		addEEnumLiteral(alignEEnum, Align.BOTTOMRIGHT_LITERAL);
		addEEnumLiteral(alignEEnum, Align.CENTERLEFT_LITERAL);
		addEEnumLiteral(alignEEnum, Align.CENTER_LITERAL);
		addEEnumLiteral(alignEEnum, Align.CENTERRIGHT_LITERAL);
		addEEnumLiteral(alignEEnum, Align.TOPLEFT_LITERAL);
		addEEnumLiteral(alignEEnum, Align.TOPCENTER_LITERAL);
		addEEnumLiteral(alignEEnum, Align.TOPRIGHT_LITERAL);

		initEEnum(padShapeEEnum, PadShape.class, "PadShape");
		addEEnumLiteral(padShapeEEnum, PadShape.SQUARE_LITERAL);
		addEEnumLiteral(padShapeEEnum, PadShape.ROUND_LITERAL);
		addEEnumLiteral(padShapeEEnum, PadShape.OCTAGON_LITERAL);
		addEEnumLiteral(padShapeEEnum, PadShape.LONG_LITERAL);
		addEEnumLiteral(padShapeEEnum, PadShape.OFFSET_LITERAL);

		initEEnum(polygonPourEEnum, PolygonPour.class, "PolygonPour");
		addEEnumLiteral(polygonPourEEnum, PolygonPour.SOLID_LITERAL);
		addEEnumLiteral(polygonPourEEnum, PolygonPour.HATCH_LITERAL);
		addEEnumLiteral(polygonPourEEnum, PolygonPour.CUTOUT_LITERAL);

		initEEnum(pinVisibleEEnum, PinVisible.class, "PinVisible");
		addEEnumLiteral(pinVisibleEEnum, PinVisible.OFF_LITERAL);
		addEEnumLiteral(pinVisibleEEnum, PinVisible.PAD_LITERAL);
		addEEnumLiteral(pinVisibleEEnum, PinVisible.PIN_LITERAL);
		addEEnumLiteral(pinVisibleEEnum, PinVisible.BOTH_LITERAL);

		initEEnum(pinLengthEEnum, PinLength.class, "PinLength");
		addEEnumLiteral(pinLengthEEnum, PinLength.POINT_LITERAL);
		addEEnumLiteral(pinLengthEEnum, PinLength.SHORT_LITERAL);
		addEEnumLiteral(pinLengthEEnum, PinLength.MIDDLE_LITERAL);
		addEEnumLiteral(pinLengthEEnum, PinLength.LONG_LITERAL);

		initEEnum(pinDirectionEEnum, PinDirection.class, "PinDirection");
		addEEnumLiteral(pinDirectionEEnum, PinDirection.NC_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.IN_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.OUT_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.IO_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.OC_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.PWR_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.PAS_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.HIZ_LITERAL);
		addEEnumLiteral(pinDirectionEEnum, PinDirection.SUP_LITERAL);

		initEEnum(pinFunctionEEnum, PinFunction.class, "PinFunction");
		addEEnumLiteral(pinFunctionEEnum, PinFunction.NONE_LITERAL);
		addEEnumLiteral(pinFunctionEEnum, PinFunction.DOT_LITERAL);
		addEEnumLiteral(pinFunctionEEnum, PinFunction.CLK_LITERAL);
		addEEnumLiteral(pinFunctionEEnum, PinFunction.DOTCLK_LITERAL);

		initEEnum(contactRouteEEnum, ContactRoute.class, "ContactRoute");
		addEEnumLiteral(contactRouteEEnum, ContactRoute.ALL_LITERAL);
		addEEnumLiteral(contactRouteEEnum, ContactRoute.ANY_LITERAL);

		initEEnum(attributeDisplayEEnum, AttributeDisplay.class, "AttributeDisplay");
		addEEnumLiteral(attributeDisplayEEnum, AttributeDisplay.OFF_LITERAL);
		addEEnumLiteral(attributeDisplayEEnum, AttributeDisplay.VALUE_LITERAL);
		addEEnumLiteral(attributeDisplayEEnum, AttributeDisplay.NAME_LITERAL);
		addEEnumLiteral(attributeDisplayEEnum, AttributeDisplay.BOTH_LITERAL);

		initEEnum(verticalTextEEnum, VerticalText.class, "VerticalText");
		addEEnumLiteral(verticalTextEEnum, VerticalText.UP_LITERAL);
		addEEnumLiteral(verticalTextEEnum, VerticalText.DOWN_LITERAL);
	}

} //EnumsPackageImpl
