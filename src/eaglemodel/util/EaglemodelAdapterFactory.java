/**
 */
package eaglemodel.util;

import eaglemodel.Approved;
import eaglemodel.Attribute;
import eaglemodel.Bus;
import eaglemodel.Circle;
import eaglemodel.Clearance;
import eaglemodel.Compatibility;
import eaglemodel.Connect;
import eaglemodel.Description;
import eaglemodel.Device;
import eaglemodel.Deviceset;
import eaglemodel.Dimension;
import eaglemodel.Drawing;
import eaglemodel.Eagle;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eaglemodel.EaglemodelPackage
 * @generated
 */
public class EaglemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EaglemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaglemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EaglemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaglemodelSwitch modelSwitch =
		new EaglemodelSwitch() {
			public Object caseEagle(Eagle object) {
				return createEagleAdapter();
			}
			public Object caseCompatibility(Compatibility object) {
				return createCompatibilityAdapter();
			}
			public Object caseNote(Note object) {
				return createNoteAdapter();
			}
			public Object caseDrawing(Drawing object) {
				return createDrawingAdapter();
			}
			public Object caseSetting(Setting object) {
				return createSettingAdapter();
			}
			public Object caseGrid(Grid object) {
				return createGridAdapter();
			}
			public Object caseLayer(Layer object) {
				return createLayerAdapter();
			}
			public Object caseSchematic(Schematic object) {
				return createSchematicAdapter();
			}
			public Object caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			public Object caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			public Object caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			public Object caseVariantdef(Variantdef object) {
				return createVariantdefAdapter();
			}
			public Object caseVariant(Variant object) {
				return createVariantAdapter();
			}
			public Object caseClass(eaglemodel.Class object) {
				return createClassAdapter();
			}
			public Object caseClearance(Clearance object) {
				return createClearanceAdapter();
			}
			public Object casePart(Part object) {
				return createPartAdapter();
			}
			public Object caseSheet(Sheet object) {
				return createSheetAdapter();
			}
			public Object casePackage(eaglemodel.Package object) {
				return createPackageAdapter();
			}
			public Object caseSymbol(Symbol object) {
				return createSymbolAdapter();
			}
			public Object caseDeviceset(Deviceset object) {
				return createDevicesetAdapter();
			}
			public Object casePolygon(Polygon object) {
				return createPolygonAdapter();
			}
			public Object caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			public Object caseWire(Wire object) {
				return createWireAdapter();
			}
			public Object caseText(Text object) {
				return createTextAdapter();
			}
			public Object caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			public Object casePin(Pin object) {
				return createPinAdapter();
			}
			public Object caseCircle(Circle object) {
				return createCircleAdapter();
			}
			public Object caseRectangle(Rectangle object) {
				return createRectangleAdapter();
			}
			public Object caseFrame(Frame object) {
				return createFrameAdapter();
			}
			public Object caseHole(Hole object) {
				return createHoleAdapter();
			}
			public Object casePad(Pad object) {
				return createPadAdapter();
			}
			public Object caseSMD(SMD object) {
				return createSMDAdapter();
			}
			public Object caseGate(Gate object) {
				return createGateAdapter();
			}
			public Object caseDevice(Device object) {
				return createDeviceAdapter();
			}
			public Object caseConnect(Connect object) {
				return createConnectAdapter();
			}
			public Object caseTechnology(Technology object) {
				return createTechnologyAdapter();
			}
			public Object casePlain(Plain object) {
				return createPlainAdapter();
			}
			public Object caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			public Object caseBus(Bus object) {
				return createBusAdapter();
			}
			public Object caseNet(Net object) {
				return createNetAdapter();
			}
			public Object caseSegment(Segment object) {
				return createSegmentAdapter();
			}
			public Object casePinref(Pinref object) {
				return createPinrefAdapter();
			}
			public Object caseJunction(Junction object) {
				return createJunctionAdapter();
			}
			public Object caseLabel(Label object) {
				return createLabelAdapter();
			}
			public Object caseApproved(Approved object) {
				return createApprovedAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Eagle <em>Eagle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Eagle
	 * @generated
	 */
	public Adapter createEagleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Compatibility <em>Compatibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Compatibility
	 * @generated
	 */
	public Adapter createCompatibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Drawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Drawing
	 * @generated
	 */
	public Adapter createDrawingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Setting
	 * @generated
	 */
	public Adapter createSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Grid
	 * @generated
	 */
	public Adapter createGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Schematic <em>Schematic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Schematic
	 * @generated
	 */
	public Adapter createSchematicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Variantdef <em>Variantdef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Variantdef
	 * @generated
	 */
	public Adapter createVariantdefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Variant
	 * @generated
	 */
	public Adapter createVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Clearance <em>Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Clearance
	 * @generated
	 */
	public Adapter createClearanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Sheet
	 * @generated
	 */
	public Adapter createSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Deviceset <em>Deviceset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Deviceset
	 * @generated
	 */
	public Adapter createDevicesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Rectangle
	 * @generated
	 */
	public Adapter createRectangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Hole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Hole
	 * @generated
	 */
	public Adapter createHoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Pad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Pad
	 * @generated
	 */
	public Adapter createPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.SMD <em>SMD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.SMD
	 * @generated
	 */
	public Adapter createSMDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Connect
	 * @generated
	 */
	public Adapter createConnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Plain <em>Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Plain
	 * @generated
	 */
	public Adapter createPlainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Net
	 * @generated
	 */
	public Adapter createNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Pinref <em>Pinref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Pinref
	 * @generated
	 */
	public Adapter createPinrefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eaglemodel.Approved <em>Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eaglemodel.Approved
	 * @generated
	 */
	public Adapter createApprovedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EaglemodelAdapterFactory
