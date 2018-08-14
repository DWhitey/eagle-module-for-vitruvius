/**
 */
package eaglemodel.impl;

import eaglemodel.Approved;
import eaglemodel.Attribute;
import eaglemodel.Bus;
import eaglemodel.Circle;
import eaglemodel.Clearance;
import eaglemodel.Connect;
import eaglemodel.Description;
import eaglemodel.Device;
import eaglemodel.Deviceset;
import eaglemodel.Dimension;
import eaglemodel.Drawing;
import eaglemodel.Eagle;
import eaglemodel.EaglemodelFactory;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Frame;
import eaglemodel.Gate;
import eaglemodel.Grid;
import eaglemodel.Hole;
import eaglemodel.Instance;
import eaglemodel.Junction;
import eaglemodel.Label;
import eaglemodel.Layer;
import eaglemodel.Library;
import eaglemodel.Net;
import eaglemodel.Note;
import eaglemodel.Pad;
import eaglemodel.Part;
import eaglemodel.Pin;
import eaglemodel.Pinref;
import eaglemodel.Plain;
import eaglemodel.Polygon;
import eaglemodel.Rectangle;
import eaglemodel.SMD;
import eaglemodel.Schematic;
import eaglemodel.Segment;
import eaglemodel.Setting;
import eaglemodel.Sheet;
import eaglemodel.Symbol;
import eaglemodel.Technology;
import eaglemodel.Text;
import eaglemodel.Variant;
import eaglemodel.Variantdef;
import eaglemodel.Vertex;
import eaglemodel.Wire;

import org.eclipse.emf.ecore.EClass;
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
			EaglemodelFactory theEaglemodelFactory = (EaglemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/eclipse/eagle/eaglemodel"); 
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
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EaglemodelPackage.EAGLE: return createEagle();
			case EaglemodelPackage.NOTE: return createNote();
			case EaglemodelPackage.DRAWING: return createDrawing();
			case EaglemodelPackage.SETTING: return createSetting();
			case EaglemodelPackage.GRID: return createGrid();
			case EaglemodelPackage.LAYER: return createLayer();
			case EaglemodelPackage.SCHEMATIC: return createSchematic();
			case EaglemodelPackage.DESCRIPTION: return createDescription();
			case EaglemodelPackage.LIBRARY: return createLibrary();
			case EaglemodelPackage.ATTRIBUTE: return createAttribute();
			case EaglemodelPackage.VARIANTDEF: return createVariantdef();
			case EaglemodelPackage.VARIANT: return createVariant();
			case EaglemodelPackage.CLASS: return createClass();
			case EaglemodelPackage.CLEARANCE: return createClearance();
			case EaglemodelPackage.PART: return createPart();
			case EaglemodelPackage.SHEET: return createSheet();
			case EaglemodelPackage.PACKAGE: return createPackage();
			case EaglemodelPackage.SYMBOL: return createSymbol();
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
			case EaglemodelPackage.GATE: return createGate();
			case EaglemodelPackage.DEVICE: return createDevice();
			case EaglemodelPackage.CONNECT: return createConnect();
			case EaglemodelPackage.TECHNOLOGY: return createTechnology();
			case EaglemodelPackage.PLAIN: return createPlain();
			case EaglemodelPackage.INSTANCE: return createInstance();
			case EaglemodelPackage.BUS: return createBus();
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
	public Eagle createEagle() {
		EagleImpl eagle = new EagleImpl();
		return eagle;
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
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
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
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
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
	public eaglemodel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
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
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
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
	public Connect createConnect() {
		ConnectImpl connect = new ConnectImpl();
		return connect;
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
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
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
	public EaglemodelPackage getEaglemodelPackage() {
		return (EaglemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static EaglemodelPackage getPackage() {
		return EaglemodelPackage.eINSTANCE;
	}

} //EaglemodelFactoryImpl
