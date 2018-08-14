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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eaglemodel.EaglemodelPackage
 * @generated
 */
public class EaglemodelSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EaglemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EaglemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = EaglemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EaglemodelPackage.EAGLE: {
				Eagle eagle = (Eagle)theEObject;
				Object result = caseEagle(eagle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.COMPATIBILITY: {
				Compatibility compatibility = (Compatibility)theEObject;
				Object result = caseCompatibility(compatibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.NOTE: {
				Note note = (Note)theEObject;
				Object result = caseNote(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.DRAWING: {
				Drawing drawing = (Drawing)theEObject;
				Object result = caseDrawing(drawing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.SETTING: {
				Setting setting = (Setting)theEObject;
				Object result = caseSetting(setting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.GRID: {
				Grid grid = (Grid)theEObject;
				Object result = caseGrid(grid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				Object result = caseLayer(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.SCHEMATIC: {
				Schematic schematic = (Schematic)theEObject;
				Object result = caseSchematic(schematic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				Object result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.LIBRARY: {
				Library library = (Library)theEObject;
				Object result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				Object result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.VARIANTDEF: {
				Variantdef variantdef = (Variantdef)theEObject;
				Object result = caseVariantdef(variantdef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.VARIANT: {
				Variant variant = (Variant)theEObject;
				Object result = caseVariant(variant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.CLASS: {
				eaglemodel.Class class_ = (eaglemodel.Class)theEObject;
				Object result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.CLEARANCE: {
				Clearance clearance = (Clearance)theEObject;
				Object result = caseClearance(clearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.PART: {
				Part part = (Part)theEObject;
				Object result = casePart(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.SHEET: {
				Sheet sheet = (Sheet)theEObject;
				Object result = caseSheet(sheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.PACKAGE: {
				eaglemodel.Package package_ = (eaglemodel.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.SYMBOL: {
				Symbol symbol = (Symbol)theEObject;
				Object result = caseSymbol(symbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.DEVICESET: {
				Deviceset deviceset = (Deviceset)theEObject;
				Object result = caseDeviceset(deviceset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				Object result = casePolygon(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				Object result = caseVertex(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.WIRE: {
				Wire wire = (Wire)theEObject;
				Object result = caseWire(wire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.TEXT: {
				Text text = (Text)theEObject;
				Object result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				Object result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.PIN: {
				Pin pin = (Pin)theEObject;
				Object result = casePin(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				Object result = caseCircle(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				Object result = caseRectangle(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				Object result = caseFrame(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.HOLE: {
				Hole hole = (Hole)theEObject;
				Object result = caseHole(hole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.PAD: {
				Pad pad = (Pad)theEObject;
				Object result = casePad(pad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.SMD: {
				SMD smd = (SMD)theEObject;
				Object result = caseSMD(smd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.GATE: {
				Gate gate = (Gate)theEObject;
				Object result = caseGate(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.DEVICE: {
				Device device = (Device)theEObject;
				Object result = caseDevice(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.CONNECT: {
				Connect connect = (Connect)theEObject;
				Object result = caseConnect(connect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.TECHNOLOGY: {
				Technology technology = (Technology)theEObject;
				Object result = caseTechnology(technology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.PLAIN: {
				Plain plain = (Plain)theEObject;
				Object result = casePlain(plain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				Object result = caseInstance(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.BUS: {
				Bus bus = (Bus)theEObject;
				Object result = caseBus(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.NET: {
				Net net = (Net)theEObject;
				Object result = caseNet(net);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				Object result = caseSegment(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.PINREF: {
				Pinref pinref = (Pinref)theEObject;
				Object result = casePinref(pinref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				Object result = caseJunction(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.LABEL: {
				Label label = (Label)theEObject;
				Object result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EaglemodelPackage.APPROVED: {
				Approved approved = (Approved)theEObject;
				Object result = caseApproved(approved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eagle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eagle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEagle(Eagle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompatibility(Compatibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDrawing(Drawing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetting(Setting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schematic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schematic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSchematic(Schematic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variantdef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variantdef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariantdef(Variantdef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariant(Variant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClass(eaglemodel.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClearance(Clearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSheet(Sheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(eaglemodel.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deviceset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deviceset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeviceset(Deviceset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWire(Wire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHole(Hole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePad(Pad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSMD(SMD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnect(Connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTechnology(Technology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePlain(Plain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNet(Net object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSegment(Segment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pinref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pinref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePinref(Pinref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseApproved(Approved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //EaglemodelSwitch
