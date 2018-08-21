/**
 */
package eaglemodel.impl;

import eaglemodel.Align;
import eaglemodel.Approved;
import eaglemodel.Attribute;
import eaglemodel.AttributeDisplay;
import eaglemodel.Attributes;
import eaglemodel.Bus;
import eaglemodel.Busses;
import eaglemodel.Circle;
import eaglemodel.Classes;
import eaglemodel.Clearance;
import eaglemodel.Compatibility;
import eaglemodel.Connect;
import eaglemodel.Connects;
import eaglemodel.ContactRoute;
import eaglemodel.Description;
import eaglemodel.Device;
import eaglemodel.Devices;
import eaglemodel.Deviceset;
import eaglemodel.Devicesets;
import eaglemodel.Dimension;
import eaglemodel.DimensionType;
import eaglemodel.Drawing;
import eaglemodel.Eagle;
import eaglemodel.EaglemodelFactory;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Errors;
import eaglemodel.Frame;
import eaglemodel.Gate;
import eaglemodel.GateAddLevel;
import eaglemodel.Gates;
import eaglemodel.Grid;
import eaglemodel.GridStyle;
import eaglemodel.GridUnit;
import eaglemodel.Hole;
import eaglemodel.Instance;
import eaglemodel.Instances;
import eaglemodel.Junction;
import eaglemodel.Label;
import eaglemodel.Layer;
import eaglemodel.Layers;
import eaglemodel.Libraries;
import eaglemodel.Library;
import eaglemodel.Net;
import eaglemodel.Nets;
import eaglemodel.Note;
import eaglemodel.Packages;
import eaglemodel.Pad;
import eaglemodel.PadShape;
import eaglemodel.Part;
import eaglemodel.Parts;
import eaglemodel.Pin;
import eaglemodel.PinDirection;
import eaglemodel.PinFunction;
import eaglemodel.PinLength;
import eaglemodel.PinVisible;
import eaglemodel.Pinref;
import eaglemodel.Plain;
import eaglemodel.Polygon;
import eaglemodel.PolygonPour;
import eaglemodel.Rectangle;
import eaglemodel.SMD;
import eaglemodel.Schematic;
import eaglemodel.Segment;
import eaglemodel.Setting;
import eaglemodel.Settings;
import eaglemodel.Severity;
import eaglemodel.Sheet;
import eaglemodel.Sheets;
import eaglemodel.Symbol;
import eaglemodel.Symbols;
import eaglemodel.Technologies;
import eaglemodel.Technology;
import eaglemodel.Text;
import eaglemodel.TextFont;
import eaglemodel.Variant;
import eaglemodel.Variantdef;
import eaglemodel.Variantdefs;
import eaglemodel.Vertex;
import eaglemodel.VerticalText;
import eaglemodel.Wire;
import eaglemodel.WireCap;
import eaglemodel.WireStyle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EaglemodelFactoryImpl extends EFactoryImpl implements EaglemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EaglemodelFactory init() {
		try {
			EaglemodelFactory theEaglemodelFactory = (EaglemodelFactory)EPackage.Registry.INSTANCE.getEFactory(EaglemodelPackage.eNS_URI);
			if (theEaglemodelFactory != null) {
				return theEaglemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EaglemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaglemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EaglemodelPackage.EAGLE: return createEagle();
			case EaglemodelPackage.COMPATIBILITY: return createCompatibility();
			case EaglemodelPackage.NOTE: return createNote();
			case EaglemodelPackage.DRAWING: return createDrawing();
			case EaglemodelPackage.SETTINGS: return createSettings();
			case EaglemodelPackage.SETTING: return createSetting();
			case EaglemodelPackage.GRID: return createGrid();
			case EaglemodelPackage.LAYERS: return createLayers();
			case EaglemodelPackage.LAYER: return createLayer();
			case EaglemodelPackage.SCHEMATIC: return createSchematic();
			case EaglemodelPackage.DESCRIPTION: return createDescription();
			case EaglemodelPackage.LIBRARIES: return createLibraries();
			case EaglemodelPackage.LIBRARY: return createLibrary();
			case EaglemodelPackage.ATTRIBUTES: return createAttributes();
			case EaglemodelPackage.ATTRIBUTE: return createAttribute();
			case EaglemodelPackage.VARIANTDEFS: return createVariantdefs();
			case EaglemodelPackage.VARIANTDEF: return createVariantdef();
			case EaglemodelPackage.VARIANT: return createVariant();
			case EaglemodelPackage.CLASSES: return createClasses();
			case EaglemodelPackage.CLASS: return createClass();
			case EaglemodelPackage.CLEARANCE: return createClearance();
			case EaglemodelPackage.PARTS: return createParts();
			case EaglemodelPackage.PART: return createPart();
			case EaglemodelPackage.SHEETS: return createSheets();
			case EaglemodelPackage.SHEET: return createSheet();
			case EaglemodelPackage.ERRORS: return createErrors();
			case EaglemodelPackage.PACKAGES: return createPackages();
			case EaglemodelPackage.PACKAGE: return createPackage();
			case EaglemodelPackage.SYMBOLS: return createSymbols();
			case EaglemodelPackage.SYMBOL: return createSymbol();
			case EaglemodelPackage.DEVICESETS: return createDevicesets();
			case EaglemodelPackage.DEVICESET: return createDeviceset();
			case EaglemodelPackage.POLYGON: return createPolygon();
			case EaglemodelPackage.VERTEX: return createVertex();
			case EaglemodelPackage.WIRE: return createWire();
			case EaglemodelPackage.TEXT: return createText();
			case EaglemodelPackage.DIMENSION: return createDimension();
			case EaglemodelPackage.PIN: return createPin();
			case EaglemodelPackage.CIRCLE: return createCircle();
			case EaglemodelPackage.RECTANGLE: return createRectangle();
			case EaglemodelPackage.FRAME: return createFrame();
			case EaglemodelPackage.HOLE: return createHole();
			case EaglemodelPackage.PAD: return createPad();
			case EaglemodelPackage.SMD: return createSMD();
			case EaglemodelPackage.GATES: return createGates();
			case EaglemodelPackage.GATE: return createGate();
			case EaglemodelPackage.DEVICES: return createDevices();
			case EaglemodelPackage.DEVICE: return createDevice();
			case EaglemodelPackage.CONNECTS: return createConnects();
			case EaglemodelPackage.CONNECT: return createConnect();
			case EaglemodelPackage.TECHNOLOGIES: return createTechnologies();
			case EaglemodelPackage.TECHNOLOGY: return createTechnology();
			case EaglemodelPackage.PLAIN: return createPlain();
			case EaglemodelPackage.INSTANCES: return createInstances();
			case EaglemodelPackage.INSTANCE: return createInstance();
			case EaglemodelPackage.BUSSES: return createBusses();
			case EaglemodelPackage.BUS: return createBus();
			case EaglemodelPackage.NETS: return createNets();
			case EaglemodelPackage.NET: return createNet();
			case EaglemodelPackage.SEGMENT: return createSegment();
			case EaglemodelPackage.PINREF: return createPinref();
			case EaglemodelPackage.JUNCTION: return createJunction();
			case EaglemodelPackage.LABEL: return createLabel();
			case EaglemodelPackage.APPROVED: return createApproved();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EaglemodelPackage.SEVERITY:
				return createSeverityFromString(eDataType, initialValue);
			case EaglemodelPackage.GATE_ADD_LEVEL:
				return createGateAddLevelFromString(eDataType, initialValue);
			case EaglemodelPackage.WIRE_STYLE:
				return createWireStyleFromString(eDataType, initialValue);
			case EaglemodelPackage.WIRE_CAP:
				return createWireCapFromString(eDataType, initialValue);
			case EaglemodelPackage.DIMENSION_TYPE:
				return createDimensionTypeFromString(eDataType, initialValue);
			case EaglemodelPackage.GRID_UNIT:
				return createGridUnitFromString(eDataType, initialValue);
			case EaglemodelPackage.GRID_STYLE:
				return createGridStyleFromString(eDataType, initialValue);
			case EaglemodelPackage.TEXT_FONT:
				return createTextFontFromString(eDataType, initialValue);
			case EaglemodelPackage.ALIGN:
				return createAlignFromString(eDataType, initialValue);
			case EaglemodelPackage.PAD_SHAPE:
				return createPadShapeFromString(eDataType, initialValue);
			case EaglemodelPackage.POLYGON_POUR:
				return createPolygonPourFromString(eDataType, initialValue);
			case EaglemodelPackage.PIN_VISIBLE:
				return createPinVisibleFromString(eDataType, initialValue);
			case EaglemodelPackage.PIN_LENGTH:
				return createPinLengthFromString(eDataType, initialValue);
			case EaglemodelPackage.PIN_DIRECTION:
				return createPinDirectionFromString(eDataType, initialValue);
			case EaglemodelPackage.PIN_FUNCTION:
				return createPinFunctionFromString(eDataType, initialValue);
			case EaglemodelPackage.CONTACT_ROUTE:
				return createContactRouteFromString(eDataType, initialValue);
			case EaglemodelPackage.ATTRIBUTE_DISPLAY:
				return createAttributeDisplayFromString(eDataType, initialValue);
			case EaglemodelPackage.VERTICAL_TEXT:
				return createVerticalTextFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EaglemodelPackage.SEVERITY:
				return convertSeverityToString(eDataType, instanceValue);
			case EaglemodelPackage.GATE_ADD_LEVEL:
				return convertGateAddLevelToString(eDataType, instanceValue);
			case EaglemodelPackage.WIRE_STYLE:
				return convertWireStyleToString(eDataType, instanceValue);
			case EaglemodelPackage.WIRE_CAP:
				return convertWireCapToString(eDataType, instanceValue);
			case EaglemodelPackage.DIMENSION_TYPE:
				return convertDimensionTypeToString(eDataType, instanceValue);
			case EaglemodelPackage.GRID_UNIT:
				return convertGridUnitToString(eDataType, instanceValue);
			case EaglemodelPackage.GRID_STYLE:
				return convertGridStyleToString(eDataType, instanceValue);
			case EaglemodelPackage.TEXT_FONT:
				return convertTextFontToString(eDataType, instanceValue);
			case EaglemodelPackage.ALIGN:
				return convertAlignToString(eDataType, instanceValue);
			case EaglemodelPackage.PAD_SHAPE:
				return convertPadShapeToString(eDataType, instanceValue);
			case EaglemodelPackage.POLYGON_POUR:
				return convertPolygonPourToString(eDataType, instanceValue);
			case EaglemodelPackage.PIN_VISIBLE:
				return convertPinVisibleToString(eDataType, instanceValue);
			case EaglemodelPackage.PIN_LENGTH:
				return convertPinLengthToString(eDataType, instanceValue);
			case EaglemodelPackage.PIN_DIRECTION:
				return convertPinDirectionToString(eDataType, instanceValue);
			case EaglemodelPackage.PIN_FUNCTION:
				return convertPinFunctionToString(eDataType, instanceValue);
			case EaglemodelPackage.CONTACT_ROUTE:
				return convertContactRouteToString(eDataType, instanceValue);
			case EaglemodelPackage.ATTRIBUTE_DISPLAY:
				return convertAttributeDisplayToString(eDataType, instanceValue);
			case EaglemodelPackage.VERTICAL_TEXT:
				return convertVerticalTextToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eagle createEagle() {
		EagleImpl eagle = new EagleImpl();
		return eagle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compatibility createCompatibility() {
		CompatibilityImpl compatibility = new CompatibilityImpl();
		return compatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drawing createDrawing() {
		DrawingImpl drawing = new DrawingImpl();
		return drawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings createSettings() {
		SettingsImpl settings = new SettingsImpl();
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting createSetting() {
		SettingImpl setting = new SettingImpl();
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layers createLayers() {
		LayersImpl layers = new LayersImpl();
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schematic createSchematic() {
		SchematicImpl schematic = new SchematicImpl();
		return schematic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Libraries createLibraries() {
		LibrariesImpl libraries = new LibrariesImpl();
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variantdefs createVariantdefs() {
		VariantdefsImpl variantdefs = new VariantdefsImpl();
		return variantdefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variantdef createVariantdef() {
		VariantdefImpl variantdef = new VariantdefImpl();
		return variantdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classes createClasses() {
		ClassesImpl classes = new ClassesImpl();
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eaglemodel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearance createClearance() {
		ClearanceImpl clearance = new ClearanceImpl();
		return clearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parts createParts() {
		PartsImpl parts = new PartsImpl();
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheets createSheets() {
		SheetsImpl sheets = new SheetsImpl();
		return sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet createSheet() {
		SheetImpl sheet = new SheetImpl();
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Errors createErrors() {
		ErrorsImpl errors = new ErrorsImpl();
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packages createPackages() {
		PackagesImpl packages = new PackagesImpl();
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eaglemodel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbols createSymbols() {
		SymbolsImpl symbols = new SymbolsImpl();
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devicesets createDevicesets() {
		DevicesetsImpl devicesets = new DevicesetsImpl();
		return devicesets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviceset createDeviceset() {
		DevicesetImpl deviceset = new DevicesetImpl();
		return deviceset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hole createHole() {
		HoleImpl hole = new HoleImpl();
		return hole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pad createPad() {
		PadImpl pad = new PadImpl();
		return pad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMD createSMD() {
		SMDImpl smd = new SMDImpl();
		return smd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gates createGates() {
		GatesImpl gates = new GatesImpl();
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devices createDevices() {
		DevicesImpl devices = new DevicesImpl();
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connects createConnects() {
		ConnectsImpl connects = new ConnectsImpl();
		return connects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connect createConnect() {
		ConnectImpl connect = new ConnectImpl();
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technologies createTechnologies() {
		TechnologiesImpl technologies = new TechnologiesImpl();
		return technologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plain createPlain() {
		PlainImpl plain = new PlainImpl();
		return plain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instances createInstances() {
		InstancesImpl instances = new InstancesImpl();
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busses createBusses() {
		BussesImpl busses = new BussesImpl();
		return busses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nets createNets() {
		NetsImpl nets = new NetsImpl();
		return nets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net createNet() {
		NetImpl net = new NetImpl();
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pinref createPinref() {
		PinrefImpl pinref = new PinrefImpl();
		return pinref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Approved createApproved() {
		ApprovedImpl approved = new ApprovedImpl();
		return approved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateAddLevel createGateAddLevelFromString(EDataType eDataType, String initialValue) {
		GateAddLevel result = GateAddLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGateAddLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireStyle createWireStyleFromString(EDataType eDataType, String initialValue) {
		WireStyle result = WireStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWireStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireCap createWireCapFromString(EDataType eDataType, String initialValue) {
		WireCap result = WireCap.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWireCapToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionTypeFromString(EDataType eDataType, String initialValue) {
		DimensionType result = DimensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit createGridUnitFromString(EDataType eDataType, String initialValue) {
		GridUnit result = GridUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridStyle createGridStyleFromString(EDataType eDataType, String initialValue) {
		GridStyle result = GridStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFont createTextFontFromString(EDataType eDataType, String initialValue) {
		TextFont result = TextFont.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextFontToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align createAlignFromString(EDataType eDataType, String initialValue) {
		Align result = Align.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadShape createPadShapeFromString(EDataType eDataType, String initialValue) {
		PadShape result = PadShape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPadShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPour createPolygonPourFromString(EDataType eDataType, String initialValue) {
		PolygonPour result = PolygonPour.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonPourToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinVisible createPinVisibleFromString(EDataType eDataType, String initialValue) {
		PinVisible result = PinVisible.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinVisibleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinLength createPinLengthFromString(EDataType eDataType, String initialValue) {
		PinLength result = PinLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinDirection createPinDirectionFromString(EDataType eDataType, String initialValue) {
		PinDirection result = PinDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinFunction createPinFunctionFromString(EDataType eDataType, String initialValue) {
		PinFunction result = PinFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactRoute createContactRouteFromString(EDataType eDataType, String initialValue) {
		ContactRoute result = ContactRoute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactRouteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDisplay createAttributeDisplayFromString(EDataType eDataType, String initialValue) {
		AttributeDisplay result = AttributeDisplay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeDisplayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalText createVerticalTextFromString(EDataType eDataType, String initialValue) {
		VerticalText result = VerticalText.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalTextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaglemodelPackage getEaglemodelPackage() {
		return (EaglemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EaglemodelPackage getPackage() {
		return EaglemodelPackage.eINSTANCE;
	}

} //EaglemodelFactoryImpl
