package transformation;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import eaglemodel.*;
import eaglemodel.Class;
import eaglemodel.Package;


/**
 * This class transforms a given model based on the Eagle meta-model into a schematic.
 * 
 * @author	Daniel Weiﬂer
 * @version	1.0
 *
 */
public class EaglemodelToXml {
	
	private String modelPath;
	private File schematic;
	
	private Document doc;
	
	private Element instances;
	
	
	/**
	 * Constructor.
	 * @param modelPath The path of the given model
	 * @param schematicPath The path of the schematic to save at
	 */
	public EaglemodelToXml(String modelPath, String schematicPath) {
		this.modelPath = modelPath;
		schematic = new File(schematicPath);
	}
	
	
	/**
	 * This method creates the necessary document builder, parses the model into a schematic and saves the file.
	 * @throws ParserConfigurationException If the creation of the document builder goes wrong
	 * @throws TransformerException If the transformation from the StreamResult onto the file goes wrong 
	 */
	public void parse() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		doc = dBuilder.newDocument();
		
		instances = doc.createElement("instances");
		
		Eagle eag = load();
		Element eagle = parseEagle(eag);
		doc.appendChild(eagle);
		
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(schematic);
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");	// linesbrakes in xml, not in one single line
		transformer.transform(source, result);
	}
	
	
	/**
	 * This method parses the model root node and its attributes and references.
	 * @param e The model element to parse
	 * @return The parsed node element
	 */
	private Element parseEagle(Eagle e) {
		Element eagle = doc.createElement("eagle");
		if (!e.getVersion().equals("")) {
			eagle.setAttribute("version", e.getVersion());
		}
		if (e.getCompatibility() != null) {
			eagle.appendChild(parseCompatibility(e.getCompatibility()));
		}
		if (e.getDrawing() != null) {
			eagle.appendChild(parseDrawing(e.getDrawing()));
		}
		return eagle;
	}
	

	/**
	 * This method parses the given model element including its attributes and references.
	 * @param c The model element to parse
	 * @return The parsed node element
	 */
	private Element parseCompatibility(Compatibility c) {
		Element compatibility = doc.createElement("compatibility");

		for (int i = 0; i < c.getNote().size(); i++) {
			Element note = doc.createElement("note");
			note.setAttribute("version", c.getNote().get(i).getVersion());
			note.setAttribute("severity", c.getNote().get(i).getSeverity().getName());
			note.appendChild(doc.createTextNode(c.getNote().get(i).getValue()));
			
			compatibility.appendChild(note);
		}
		return compatibility;
	}
	

	/**
	 * This method parses the given model element including its attributes and references.
	 * @param d The model element to parse
	 * @return The parsed node element
	 */
	private Element parseDrawing(Drawing d) {
		Element drawing = doc.createElement("drawing");
		
		if (d.getSettings() != null) {
			Element settings = doc.createElement("settings");
			boolean alwaysvectorfont = false;
			String verticaltext = "up";
			
			for (int i = 0; i < d.getSettings().getSettings().size(); i++) {
				Setting s = d.getSettings().getSettings().get(i);
				if (s.isAlwaysvectorfont()) {
					alwaysvectorfont = true;
				}
				if (!s.getVerticaltext().getName().equals("up")) {
					verticaltext = s.getVerticaltext().getName();
				}
			}
			Element setting1 = doc.createElement("setting");
			if (alwaysvectorfont) {
				setting1.setAttribute("alwaysvectorfont", "yes");
			} else {
				setting1.setAttribute("alwaysvectorfont", "no");
			}
			Element setting2 = doc.createElement("setting");
			setting2.setAttribute("verticaltext", verticaltext);
			
			settings.appendChild(setting1);
			settings.appendChild(setting2);
			drawing.appendChild(settings);
		}
		
		if (d.getGrid() != null) {
			Element grid = doc.createElement("grid");
			Grid g = d.getGrid();
			grid.setAttribute("distance", String.valueOf(g.getDistance()));
			grid.setAttribute("unitdist", String.valueOf(g.getUnitdist()));
			grid.setAttribute("unit", String.valueOf(g.getUnit()));
			grid.setAttribute("style", String.valueOf(g.getStyle()));
			grid.setAttribute("multiple", String.valueOf(g.getMultiple()));
			if (g.isDisplay()) {
				grid.setAttribute("display", "yes");
			} else {
				grid.setAttribute("display", "no");
			}
			grid.setAttribute("altdistance", String.valueOf(g.getAltdistance()));
			grid.setAttribute("altunitdist", String.valueOf(g.getAltunitdist()));
			grid.setAttribute("altunit", String.valueOf(g.getAltunit()));
			
			drawing.appendChild(grid);
		}
		
		if (d.getLayers() != null) {
			Element layers = doc.createElement("layers");
			Layers ls = d.getLayers();
			
			for (int i = 0; i < ls.getLayers().size(); i++) {
				Layer l = ls.getLayers().get(i);
				Element layer = doc.createElement("layer");
				
				layer.setAttribute("number", String.valueOf(l.getNumber()));
				layer.setAttribute("name", String.valueOf(l.getName()));
				layer.setAttribute("color", String.valueOf(l.getColor()));
				layer.setAttribute("fill", String.valueOf(l.getFill()));
				if (!l.isVisible()) {
					layer.setAttribute("visible", "no");
				}
				if (!l.isActive()) {
					layer.setAttribute("active", "no");
				}
				layers.appendChild(layer);
			}
			
			drawing.appendChild(layers);
		}
		
		if (d.getSchematic() != null) {
			drawing.appendChild(parseSchematic(d.getSchematic()));
		}
		return drawing;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param sch The model element to parse
	 * @return The parsed node element
	 */
	private Node parseSchematic(Schematic sch) {
		Element schematic = doc.createElement("schematic");
		schematic.setAttribute("xreflabel", sch.getXreflabel());
		schematic.setAttribute("xrefpart", sch.getXrefpart());
		
		if (sch.getDescription() != null) {
			schematic.appendChild(parseDescription(sch.getDescription()));
		}
		if (sch.getLibraries() != null) {
			schematic.appendChild(parseLibraries(sch.getLibraries()));
		}
		if (sch.getAttributes() != null) {
			schematic.appendChild(parseAttributes(sch.getAttributes()));
		}
		if (sch.getVariantdefs() != null) {
			schematic.appendChild(parseVariantdefs(sch.getVariantdefs()));
		}
		if (sch.getClasses() != null) {
			schematic.appendChild(parseClasses(sch.getClasses()));
		}
		if (sch.getParts() != null) {
			schematic.appendChild(parseParts(sch.getParts()));
		}
		if (sch.getSheets() != null) {
			schematic.appendChild(parseSheets(sch.getSheets()));
		}
		if (sch.getErrors() != null) {
			schematic.appendChild(parseErrors(sch.getErrors()));
		}
		
		return schematic;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param es The model element to parse
	 * @return The parsed node element
	 */
	private Node parseErrors(Errors es) {
		Element errors = doc.createElement("errors");
		
		for (int i = 0; i < es.getError().size(); i++) {
			Element error = doc.createElement("error");
			Approved e = es.getError().get(i);
			error.setAttribute("hash", e.getHash());
		}
			
		return errors;	
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ss The model element to parse
	 * @return The parsed node element
	 */
	private Node parseSheets(Sheets ss) {
		Element sheets = doc.createElement("sheets");
		
		for (int i = 0; i < ss.getSheet().size(); i++) {
			Element sheet = doc.createElement("sheet");
			Sheet s = ss.getSheet().get(i);
			
			if (s.getDescription() != null) {
				sheet.appendChild(parseDescription(s.getDescription()));
			}
			if (s.getPlain() != null) {
				sheet.appendChild(parsePlain(s.getPlain()));
			}
			sheet.appendChild(instances);
			if (s.getBusses() != null) {
				sheet.appendChild(parseBusses(s.getBusses()));
			}
			if (s.getNets() != null) {
				sheet.appendChild(parseNets(s.getNets()));
			}
			
			sheets.appendChild(sheet);
		}
		
		return sheets;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ns The model element to parse
	 * @return The parsed node element
	 */
	private Node parseNets(Nets ns) {
		Element nets = doc.createElement("nets");
		
		for (int i = 0; i < ns.getNet().size(); i++) {
			Element net = doc.createElement("net");
			Net n = ns.getNet().get(i);
			
			net.setAttribute("name", n.getName());
			net.setAttribute("class", String.valueOf(n.getClass_()));

			for (int j = 0; j < n.getSegment().size(); j++) {
				net.appendChild(parseSegment(n.getSegment().get(j)));
			}
			
			nets.appendChild(net);
		}
		
		return nets;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param bs The model element to parse
	 * @return The parsed node element
	 */
	private Node parseBusses(Busses bs) {
		Element busses = doc.createElement("busses");
		
		for (int i = 0; i < bs.getBus().size(); i++) {
			Element bus = doc.createElement("bus");
			Bus b = bs.getBus().get(i);
			
			bus.setAttribute("name", b.getName());
			
			for (int j = 0; j < b.getSegment().size(); j++) {
				bus.appendChild(parseSegment(b.getSegment().get(j)));
			}
			
			busses.appendChild(bus);
		}
		
		return busses;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param s The model element to parse
	 * @return The parsed node element
	 */
	private Node parseSegment(Segment s) {
		Element segment = doc.createElement("segment");
		
		for (int k = 0; k < s.getPinref().size(); k++) {
			Element pinref = doc.createElement("pinref");
			Pinref p = s.getPinref().get(k);
			
			pinref.setAttribute("part", p.getPart());
			pinref.setAttribute("gate", p.getGate());
			pinref.setAttribute("pin", p.getPin());
			
			segment.appendChild(pinref);
		}
		for (int k = 0; k < s.getWire().size(); k++) {
			segment.appendChild(parseWire(s.getWire().get(k)));
		}
		for (int k = 0; k < s.getJunction().size(); k++) {
			Element junction = doc.createElement("junction");
			Junction junc = s.getJunction().get(k);
			
			junction.setAttribute("x", String.valueOf(junc.getX()));
			junction.setAttribute("y", String.valueOf(junc.getY()));
			
			segment.appendChild(junction);
		}
		for (int k = 0; k < s.getLabel().size(); k++) {
			Element label = doc.createElement("label");
			Label l = s.getLabel().get(k);
			
			label.setAttribute("x", String.valueOf(l.getX()));
			label.setAttribute("y", String.valueOf(l.getY()));
			label.setAttribute("size", String.valueOf(l.getSize()));
			label.setAttribute("layer", String.valueOf(l.getLayer()));
			
			if (!l.getFont().getName().equals("proportional")) {
				label.setAttribute("font", l.getFont().getName());
			}
			if (l.getRatio() != 8) {
				label.setAttribute("ratio", String.valueOf(l.getRatio()));
			}
			if (l.getRot() != 0) {
				label.setAttribute("rot", "R" + l.getRot());
			}
			if (l.isXref()) {
				label.setAttribute("xref", "yes");
			}
			
			segment.appendChild(label);
		}
		
		return segment;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param p The model element to parse
	 * @return The parsed node element
	 */
	private Node parsePlain(Plain p) {
		Element plain = doc.createElement("plain");
		
		for (int i = 0; i < p.getPolygon().size(); i++) {
			plain.appendChild(parsePolygon(p.getPolygon().get(i)));
		}
		for (int i = 0; i < p.getWire().size(); i++) {
			plain.appendChild(parseWire(p.getWire().get(i)));
		}
		for (int i = 0; i < p.getText().size(); i++) {
			plain.appendChild(parseText(p.getText().get(i)));
		}
		for (int i = 0; i < p.getDimension().size(); i++) {
			plain.appendChild(parseDimension(p.getDimension().get(i)));
		}
		for (int i = 0; i < p.getCircle().size(); i++) {
			plain.appendChild(parseCircle(p.getCircle().get(i)));
		}
		for (int i = 0; i < p.getRectangle().size(); i++) {
			plain.appendChild(parseRectangle(p.getRectangle().get(i)));
		}
		for (int i = 0; i < p.getFrame().size(); i++) {
			plain.appendChild(parseFrame(p.getFrame().get(i)));
		}
		for (int i = 0; i < p.getHole().size(); i++) {
			plain.appendChild(parseHole(p.getHole().get(i)));
		}
		
		return plain;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ps The model element to parse
	 * @return The parsed node element
	 */
	private Node parseParts(Parts ps) {
		Element parts = doc.createElement("parts");
		
		for (int i = 0; i < ps.getPart().size(); i++) {
			Element part = doc.createElement("part");
			Element instance = doc.createElement("instance");
			Part p = ps.getPart().get(i);
			
			part.setAttribute("name", p.getName());
			instance.setAttribute("part", p.getName());
			part.setAttribute("library", p.getLibrary());
			part.setAttribute("deviceset", p.getDeviceset());
			part.setAttribute("device", p.getDevice());
			if (p.getTechnology() != null && !p.getTechnology().equals("")) {
				part.setAttribute("technology", p.getTechnology());
			}
			if (p.getValue() != null && !p.getValue().equals("")) {
				part.setAttribute("value(", p.getValue());
			}
			instance.setAttribute("gate", p.getGate());
			instance.setAttribute("x", String.valueOf(p.getX()));
			instance.setAttribute("y", String.valueOf(p.getY()));
			if (p.isSmashed()) {
				instance.setAttribute("smashed", "yes");
			}
			if (p.getRot() != 0) {
				instance.setAttribute("rot", "R" + p.getRot());
			}
			
			if (p.getAttribute() != null) {
				for (int j = 0; j < p.getAttribute().size(); j++) {
					part.appendChild(parsePartAttribute(p.getAttribute().get(j)));
					instance.appendChild(parseInstancesAttribute(p.getAttribute().get(j)));
				}
			}
			
			Element attributeUidPart = doc.createElement("attribute");
			attributeUidPart.setAttribute("name", "UID");
			attributeUidPart.setAttribute("value", String.valueOf(p.getUid()));
			part.appendChild(attributeUidPart);
			
			Element attributeUidInstance = doc.createElement("attribute");
			attributeUidInstance.setAttribute("name", "UID");
			attributeUidInstance.setAttribute("value", String.valueOf(p.getUid()));
			attributeUidInstance.setAttribute("layer", "96");
			instance.appendChild(attributeUidInstance);
			
			if (p.getVariant() != null) {
				for (int j = 0; j < p.getVariant().size(); j++) {
					part.appendChild(parseVariant(p.getVariant().get(j)));
				}
			}
			
			parts.appendChild(part);
			instances.appendChild(instance);
		}
		
		return parts;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param v The model element to parse
	 * @return The parsed node element
	 */
	private Node parseVariant(Variant v) {
		Element variant = doc.createElement("variant");
		
		variant.setAttribute("name", v.getName());
		if (!v.isPopulate()) {
			variant.setAttribute("pupulate", "no");
		}
		if (v.getValue() != null && v.getValue().equals("")) {
			variant.setAttribute("value", v.getValue());
		}
		if (v.getTechnology() != null && v.getTechnology().equals("")) {
			variant.setAttribute("technology", v.getTechnology());
		}
		
		return variant;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param a
	 * @return The parsed node element
	 */
	private Node parseInstancesAttribute(Attribute a) {
		Element attribute = doc.createElement("attribute");
		
		attribute.setAttribute("name", a.getName());
		attribute.setAttribute("x", String.valueOf(a.getX()));
		attribute.setAttribute("y", String.valueOf(a.getY()));
		attribute.setAttribute("size", String.valueOf(a.getSize()));
		attribute.setAttribute("layer", String.valueOf(a.getLayer()));
		attribute.setAttribute("display", String.valueOf(a.getDisplay()));
		
		return attribute;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param a The model element to parse
	 * @return The parsed node element
	 */
	private Node parsePartAttribute(Attribute a) {
		Element attribute = doc.createElement("attribute");
		
		attribute.setAttribute("name", a.getName());
		attribute.setAttribute("value", a.getValue());
		
		return attribute;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param cs The model element to parse
	 * @return The parsed node element
	 */
	private Node parseClasses(Classes cs) {
		Element classes = doc.createElement("classes");
		
		for (int i = 0; i < cs.getClass_().size(); i++) {
			Element cla = doc.createElement("class");
			Class c = cs.getClass_().get(i);
			
			cla.setAttribute("number", String.valueOf(c.getNumber()));
			cla.setAttribute("name", c.getName());
			
			if (c.getWidth() != 0.0) {
				cla.setAttribute("width", String.valueOf(c.getWidth()));
			}
			if (c.getDrill() != 0.0) {
				cla.setAttribute("drill", String.valueOf(c.getDrill()));
			}
			
			if (c.getClearance() != null) {
				for (int j = 0; j < c.getClearance().size(); j++) {
					Element clearance = doc.createElement("clearance");
					Clearance clear = c.getClearance().get(j);
					
					clearance.setAttribute("class", String.valueOf(clear.getClass_()));
					if (clear.getValue() != 0.0) {
						clearance.setAttribute("value", String.valueOf(clear.getValue()));
					}
					
					cla.appendChild(clearance);
				}
			}
			
			classes.appendChild(cla);
		}

		return classes;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param vs The model element to parse
	 * @return The parsed node element
	 */
	private Node parseVariantdefs(Variantdefs vs) {
		Element variantdefs = doc.createElement("variantdefs");
		
		for (int i = 0; i < vs.getVariantdef().size(); i++) {
			Element variantdef = doc.createElement("variantdef");
			Variantdef v = vs.getVariantdef().get(i);
			
			variantdef.setAttribute("name", v.getName());
			if (v.isCurrent()) {
				variantdef.setAttribute("current", "yes");
			}
		}
		
		return variantdefs;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param as The model element to parse
	 * @return The parsed node element
	 */
	private Node parseAttributes(Attributes as) {
		Element attributes = doc.createElement("attributes");
		
		for (int i = 0; i < as.getAttribute().size(); i++) {
			attributes.appendChild(parseAttribute(as.getAttribute().get(i)));
		}
		
		return attributes;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ls The model element to parse
	 * @return The parsed node element
	 */
	private Node parseLibraries(Libraries ls) {
		Element libraries = doc.createElement("libraries");
		
		for (int i = 0; i < ls.getLibrary().size(); i++) {
			Element library = doc.createElement("library");
			Library l = ls.getLibrary().get(i);
			
			library.setAttribute("name", l.getName());
			if (l.getDescription() != null) {
				library.appendChild(parseDescription(l.getDescription()));
			}
			if (l.getPackages() != null) {
				library.appendChild(parsePackages(l.getPackages()));
			}
			if (l.getSymbols() != null) {
				library.appendChild(parseSymbols(l.getSymbols()));
			}
			if (l.getDevicesets() != null) {
				library.appendChild(parseDevicesets(l.getDevicesets()));
			}
			
			libraries.appendChild(library);
		}
		
		return libraries;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ds The model element to parse
	 * @return The parsed node element
	 */
	private Node parseDevicesets(Devicesets ds) {
		Element devicesets = doc.createElement("devicesets");
		
		for (int i = 0; i < ds.getDeviceset().size(); i++) {
			Element deviceset = doc.createElement("deviceset");
			Deviceset d = ds.getDeviceset().get(i);
			
			deviceset.setAttribute("name", d.getName());
			if (d.getPrefix() != null) {
				deviceset.setAttribute("prefix", d.getPrefix());
			}
			if (d.isUservalue()) {
				deviceset.setAttribute("uservalue", "yes");
			}
			if (d.getDescription() != null) {
				deviceset.appendChild(parseDescription(d.getDescription()));
			}
			if (d.getGates() != null) {
				deviceset.appendChild(parseGates(d.getGates()));
			}
			if (d.getDevices() != null) {
				deviceset.appendChild(parseDevices(d.getDevices()));
			}
			
			devicesets.appendChild(deviceset);
		}
		
		return devicesets;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ds The model element to parse
	 * @return The parsed node element
	 */
	private Node parseDevices(Devices ds) {
		Element devices = doc.createElement("devices");
		
		for (int i = 0; i < ds.getDevice().size(); i++) {
			Element device = doc.createElement("device");
			Device d = ds.getDevice().get(i);
			
			if (d.getName() != null) {
				device.setAttribute("name", d.getName());
			}
			if (d.getPackage() != null) {
				device.setAttribute("package", d.getPackage());
			}
			if (d.getConnects() != null) {
				device.appendChild(parseConnects(d.getConnects()));
			}
			if (d.getTechnologies() != null) {
				device.appendChild(parseTechnologies(d.getTechnologies()));
			}
			devices.appendChild(device);
		}
		
		return devices;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ts The model element to parse
	 * @return The parsed node element
	 */
	private Node parseTechnologies(Technologies ts) {
		Element technologies = doc.createElement("technologies");
		
		for (int i = 0; i < ts.getTechnology().size(); i++) {
			Element technology = doc.createElement("technology");
			Technology t = ts.getTechnology().get(i);
			
			technology.setAttribute("name", t.getName());
			for (int j = 0; j < t.getAttribute().size(); j++) {
				technology.appendChild(parseAttribute(t.getAttribute().get(j)));
			}
			
			technologies.appendChild(technology);
		}
		
		return technologies;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param a The model element to parse
	 * @return The parsed node element
	 */
	private Node parseAttribute(Attribute a) {
		Element attribute = doc.createElement("attribute");
		
		attribute.setAttribute("name", a.getName());
		if (a.getValue() != null) {
			attribute.setAttribute("name", a.getName());
		}
		if (a.getX() != 0.0) {
			attribute.setAttribute("x", String.valueOf(a.getX()));
		}
		if (a.getY() != 0.0) {
			attribute.setAttribute("y", String.valueOf(a.getY()));
		}
		if (a.getSize() != 0.0) {
			attribute.setAttribute("size", String.valueOf(a.getSize()));
		}
		if (a.getLayer() != 0) {
			attribute.setAttribute("layer", String.valueOf(a.getLayer()));
		}
		if (!a.getFont().getName().equals("vector")) {
			attribute.setAttribute("font", a.getFont().getName());
		}
		if (a.getRatio() != 0) {
			attribute.setAttribute("ratio", String.valueOf(a.getRatio()));
		}
		if (a.getRot() != 0) {
			attribute.setAttribute("rot", "R" + a.getRot());
		}
		if (!a.getDisplay().getName().equals("value")) {
			attribute.setAttribute("display", a.getDisplay().getName());
		}
		if (a.isConstant()) {
			attribute.setAttribute("constant", "yes");
		}
		
		return attribute;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param cs The model element to parse
	 * @return The parsed node element
	 */
	private Node parseConnects(Connects cs) {
		Element connects = doc.createElement("connects");
		
		for (int i = 0; i < cs.getConnect().size(); i++) {
			Element connect = doc.createElement("connect");
			Connect c = cs.getConnect().get(i);
			
			connect.setAttribute("gate", c.getGate());
			connect.setAttribute("pin", c.getPin());
			connect.setAttribute("pad", c.getPad());
			if (c.getRoute() != null && !c.getRoute().getName().equals("all")) {
				connects.setAttribute("route", String.valueOf(c.getRoute().getName()));
			}
			
			connects.appendChild(connect);
		}
		
		return connects;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param gs The model element to parse
	 * @return The parsed node element
	 */
	private Node parseGates(Gates gs) {
		Element gates = doc.createElement("gates");
		
		for (int i = 0; i < gs.getGate().size(); i++) {
			Element gate = doc.createElement("gate");
			Gate g = gs.getGate().get(i);
			
			gate.setAttribute("name", g.getName());
			gate.setAttribute("symbol", g.getSymbol());
			gate.setAttribute("x", String.valueOf(g.getX()));
			gate.setAttribute("y", String.valueOf(g.getY()));
			
			if (!g.getAddlevel().getName().equals("next")) {
				gate.setAttribute("addlevel", g.getAddlevel().getName());
			}
			if (g.getSwaplevel() != 0) {
				gate.setAttribute("swaplevel", String.valueOf(g.getSwaplevel()));
			}
						
			gates.appendChild(gate);
		}
		
		return gates;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ss The model element to parse
	 * @return The parsed node element
	 */
	private Node parseSymbols(Symbols ss) {
		Element symbols = doc.createElement("symbols");
		
		for (int i = 0; i < ss.getSymbol().size(); i++) {
			Element symbol = doc.createElement("symbol");
			Symbol s = ss.getSymbol().get(i);
			
			symbol.setAttribute("name", s.getName());
			if (s.getDescription() != null) {
				symbol.appendChild(parseDescription(s.getDescription()));
			}
			for (int j = 0; j < s.getPolygon().size(); j++) {
				symbol.appendChild(parsePolygon(s.getPolygon().get(j)));
			}
			for (int j = 0; j < s.getWire().size(); j++) {
				symbol.appendChild(parseWire(s.getWire().get(j)));
			}
			for (int j = 0; j < s.getText().size(); j++) {
				symbol.appendChild(parseText(s.getText().get(j)));
			}
			for (int j = 0; j < s.getDimension().size(); j++) {
				symbol.appendChild(parseDimension(s.getDimension().get(j)));
			}
			for (int j = 0; j < s.getPin().size(); j++) {
				symbol.appendChild(parsePin(s.getPin().get(j)));
			}
			for (int j = 0; j < s.getCircle().size(); j++) {
				symbol.appendChild(parseCircle(s.getCircle().get(j)));
			}
			for (int j = 0; j < s.getRectangle().size(); j++) {
				symbol.appendChild(parseRectangle(s.getRectangle().get(j)));
			}
			for (int j = 0; j < s.getFrame().size(); j++) {
				symbol.appendChild(parseFrame(s.getFrame().get(j)));
			}
						
			symbols.appendChild(symbol);
		}
		
		return symbols;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param p The model element to parse
	 * @return The parsed node element
	 */
	private Node parsePin(Pin p) {
		Element pin = doc.createElement("pin");
		
		pin.setAttribute("name", String.valueOf(p.getName()));
		pin.setAttribute("x", String.valueOf(p.getX()));
		pin.setAttribute("y", String.valueOf(p.getY()));
		
		if (!p.getVisible().getName().equals("both")) {
			pin.setAttribute("visible", p.getVisible().getName());
		}
		if (!p.getLength().getName().equals("long")) {
			pin.setAttribute("length", p.getLength().getName());
		}
		if (!p.getDirection().getName().equals("io")) {
			pin.setAttribute("direction", p.getDirection().getName());
		}
		if (!p.getFunction().getName().equals("none")) {
			pin.setAttribute("function", p.getFunction().getName());
		}
		if (p.getSwaplevel() != 0) {
			pin.setAttribute("swaplevel", String.valueOf(p.getSwaplevel()));
		}
		if (p.getRot() != 0) {
			pin.setAttribute("rot", "R" + p.getRot());
		}
		
		return pin;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param ps The model element to parse
	 * @return The parsed node element
	 */
	private Node parsePackages(Packages ps) {
		Element packages = doc.createElement("packages");
		
		for (int i = 0; i < ps.getPackage().size(); i++) {
			Element pack = doc.createElement("package");
			Package p = ps.getPackage().get(i);
			
			pack.setAttribute("name", p.getName());
			if (p.getDescription() != null) {
				pack.appendChild(parseDescription(p.getDescription()));
			}
			for (int j = 0; j < p.getPolygon().size(); j++) {
				pack.appendChild(parsePolygon(p.getPolygon().get(j)));
			}
			for (int j = 0; j < p.getWire().size(); j++) {
				pack.appendChild(parseWire(p.getWire().get(j)));
			}
			for (int j = 0; j < p.getText().size(); j++) {
				pack.appendChild(parseText(p.getText().get(j)));
			}
			for (int j = 0; j < p.getDimension().size(); j++) {
				pack.appendChild(parseDimension(p.getDimension().get(j)));
			}
			for (int j = 0; j < p.getCircle().size(); j++) {
				pack.appendChild(parseCircle(p.getCircle().get(j)));
			}
			for (int j = 0; j < p.getRectangle().size(); j++) {
				pack.appendChild(parseRectangle(p.getRectangle().get(j)));
			}
			for (int j = 0; j < p.getFrame().size(); j++) {
				pack.appendChild(parseFrame(p.getFrame().get(j)));
			}
			for (int j = 0; j < p.getHole().size(); j++) {
				pack.appendChild(parseHole(p.getHole().get(j)));
			}
			for (int j = 0; j < p.getPad().size(); j++) {
				pack.appendChild(parsePad(p.getPad().get(j)));
			}
			for (int j = 0; j < p.getSmd().size(); j++) {
				pack.appendChild(parseSmd(p.getSmd().get(j)));
			}
			
			packages.appendChild(pack);
		}
		
		return packages;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param s The model element to parse
	 * @return The parsed node element
	 */
	private Node parseSmd(SMD s) {
		Element smd = doc.createElement("smd");
		
		smd.setAttribute("name", String.valueOf(s.getName()));
		smd.setAttribute("x", String.valueOf(s.getX()));
		smd.setAttribute("y", String.valueOf(s.getY()));
		smd.setAttribute("dx", String.valueOf(s.getDx()));
		smd.setAttribute("dy", String.valueOf(s.getDy()));
		smd.setAttribute("layer", String.valueOf(s.getLayer()));
		
		if (s.getRoundness() != 0) {
			smd.setAttribute("roundness", String.valueOf(s.getRoundness()));
		}
		if (s.getRot() != 0) {
			smd.setAttribute("rot", "R" + s.getRot());
		}
		if (!s.isStop()) {
			smd.setAttribute("stop", "no");
		}
		if (!s.isThermals()) {
			smd.setAttribute("thermals", "no");
		}
		if (!s.isCream()) {
			smd.setAttribute("cream", "no");
		}
		
		return smd;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param p The model element to parse
	 * @return The parsed node element
	 */
	private Node parsePad(Pad p) {
		Element pad = doc.createElement("pad");
		
		pad.setAttribute("name", p.getName());
		pad.setAttribute("x", String.valueOf(p.getX()));
		pad.setAttribute("y", String.valueOf(p.getY()));
		pad.setAttribute("drill", String.valueOf(p.getDrill()));
		
		if (p.getDiameter() != 0.0) {
			pad.setAttribute("diameter", String.valueOf(p.getDiameter()));
		}
		if (!p.getShape().getName().equals("round")) {
			pad.setAttribute("shape", p.getShape().getName());
		}
		if (p.getRot() != 0) {
			pad.setAttribute("rot", "R" + p.getRot());
		}
		if (!p.isStop()) {
			pad.setAttribute("stop", "no");
		}
		if (!p.isThermals()) {
			pad.setAttribute("thermals", "no");
		}
		if (p.isFirst()) {
			pad.setAttribute("first", "yes");
		}
		
		return pad;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param h The model element to parse
	 * @return The parsed node element
	 */
	private Node parseHole(Hole h) {
		Element hole = doc.createElement("hole");
		
		hole.setAttribute("x", String.valueOf(h.getX()));
		hole.setAttribute("y", String.valueOf(h.getY()));
		hole.setAttribute("drill", String.valueOf(h.getDrill()));
		
		return hole;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param f The model element to parse
	 * @return The parsed node element
	 */
	private Node parseFrame(Frame f) {
		Element frame = doc.createElement("frame");
		
		frame.setAttribute("x1", String.valueOf(f.getX1()));
		frame.setAttribute("y1", String.valueOf(f.getY1()));
		frame.setAttribute("x2", String.valueOf(f.getX2()));
		frame.setAttribute("y2", String.valueOf(f.getY2()));
		frame.setAttribute("columns", String.valueOf(f.getColumns()));
		frame.setAttribute("rows", String.valueOf(f.getRows()));
		frame.setAttribute("layer", String.valueOf(f.getLayer()));
		
		if (!f.isBorderleft()) {
			frame.setAttribute("border-left", "no");
		}
		if (!f.isBordertop()) {
			frame.setAttribute("border-top", "no");
		}
		if (!f.isBorderright()) {
			frame.setAttribute("border-right", "no");
		}
		if (!f.isBorderbottom()) {
			frame.setAttribute("border-bottom", "no");
		}
		
		return frame;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param r The model element to parse
	 * @return The parsed node element
	 */
	private Node parseRectangle(Rectangle r) {
		Element rectangle = doc.createElement("rectangle");
		
		rectangle.setAttribute("x1", String.valueOf(r.getX1()));
		rectangle.setAttribute("y1", String.valueOf(r.getY1()));
		rectangle.setAttribute("x2", String.valueOf(r.getX2()));
		rectangle.setAttribute("y2", String.valueOf(r.getY2()));
		rectangle.setAttribute("layer", String.valueOf(r.getLayer()));
		
		if (r.getRot() != 0) {
			rectangle.setAttribute("rot", "R" + r.getRot());
		}
		
		return rectangle;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param c The model element to parse
	 * @return The parsed node element
	 */
	private Node parseCircle(Circle c) {
		Element circle = doc.createElement("circle");
		
		circle.setAttribute("x", String.valueOf(c.getX()));
		circle.setAttribute("y", String.valueOf(c.getY()));
		circle.setAttribute("radius", String.valueOf(c.getRadius()));
		circle.setAttribute("width", String.valueOf(c.getWidth()));
		circle.setAttribute("layer", String.valueOf(c.getLayer()));
		
		return circle;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param d The model element to parse
	 * @return The parsed node element
	 */
	private Node parseDimension(Dimension d) {
		Element dimension = doc.createElement("dimension");
		
		dimension.setAttribute("x1", String.valueOf(d.getX1()));
		dimension.setAttribute("y1", String.valueOf(d.getY1()));
		dimension.setAttribute("x2", String.valueOf(d.getX2()));
		dimension.setAttribute("y2", String.valueOf(d.getY2()));
		dimension.setAttribute("x3", String.valueOf(d.getX3()));
		dimension.setAttribute("y3", String.valueOf(d.getY3()));
		dimension.setAttribute("layer", String.valueOf(d.getLayer()));
		
		if (!d.getDtype().getName().equals("parallel")) {
			dimension.setAttribute("dtype", d.getDtype().getName());
		}
		dimension.setAttribute("width", String.valueOf(d.getWidth()));
		if (d.getExtwidth() != 0.0) {
			dimension.setAttribute("extwidth", String.valueOf(d.getExtwidth()));
		}
		if (d.getExtlength() != 0.0) {
			dimension.setAttribute("extlength", String.valueOf(d.getExtlength()));
		}
		if (d.getExtoffset() != 0.0) {
			dimension.setAttribute("extoffset", String.valueOf(d.getExtoffset()));
		}
		dimension.setAttribute("textsize", String.valueOf(d.getTextsize()));
		if (d.getTextratio() != 8) {
			dimension.setAttribute("textratio", String.valueOf(d.getTextratio()));
		}
		if (!d.getUnit().getName().equals("mm")) {
			dimension.setAttribute("unit", d.getUnit().getName());
		}
		if (d.getPrecision() != 2) {
			dimension.setAttribute("precision", String.valueOf(d.getPrecision()));
		}
		if (d.isVisible()) {
			dimension.setAttribute("visible", "yes");
		}
		
		return dimension;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param t The model element to parse
	 * @return The parsed node element
	 */
	private Node parseText(Text t) {
		Element text = doc.createElement("text");
		
		text.setAttribute("x", String.valueOf(t.getX()));
		text.setAttribute("y", String.valueOf(t.getY()));
		text.setAttribute("size", String.valueOf(t.getSize()));
		text.setAttribute("layer", String.valueOf(t.getLayer()));
		
		if (!t.getFont().getName().equals("proportional")) {
			text.setAttribute("font", t.getFont().getName());
		}
		if (t.getRatio() != 8) {
			text.setAttribute("ratio", String.valueOf(t.getRatio()));
		}
		if (t.getRot() != 0) {
			text.setAttribute("rot", "R" + t.getRot());
		}
		if (!t.getAlign().getName().equals("bottomleft")) {
			text.setAttribute("align", t.getAlign().getLiteral());
		}
		if (t.getDistance() != 50) {
			text.setAttribute("distance", String.valueOf(t.getDistance()));
		}
		if (t.getValue() != null) {
			text.appendChild(doc.createTextNode(t.getValue()));
		}
		
		return text;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param w The model element to parse
	 * @return The parsed node element
	 */
	private Node parseWire(Wire w) {
		Element wire = doc.createElement("wire");
		wire.setAttribute("x1", String.valueOf(w.getX1()));
		wire.setAttribute("y1", String.valueOf(w.getY1()));
		wire.setAttribute("x2", String.valueOf(w.getX2()));
		wire.setAttribute("y2", String.valueOf(w.getY2()));
		wire.setAttribute("width", String.valueOf(w.getWidth()));
		wire.setAttribute("layer", String.valueOf(w.getLayer()));
		
		if(w.getExtent() != null) {
			wire.setAttribute("extent", w.getExtent());
		}
		if(!w.getStyle().getName().equals("continuous")) {
			wire.setAttribute("style", w.getStyle().getName());
		}
		if (w.getCurve() != 0.0) {
			wire.setAttribute("curve", String.valueOf(w.getCurve()));
		}
		if(!w.getCap().getName().equals("round")) {
			wire.setAttribute("cap", w.getStyle().getName());
		}
		
		return wire;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param p The model element to parse
	 * @return The parsed node element
	 */
	private Node parsePolygon(Polygon p) {
		Element polygon = doc.createElement("polygon");
		polygon.setAttribute("width", String.valueOf(p.getWidth()));
		polygon.setAttribute("layer", String.valueOf(p.getLayer()));
		if (p.getSpacing() != 0.0) {
			polygon.setAttribute("spacing", String.valueOf(p.getSpacing()));
		}
		if (!p.getPour().getName().equals("solid")) {
			polygon.setAttribute("pour", p.getPour().getName());
		}
		if (p.getIsolate() != 0.0) {
			polygon.setAttribute("isolate", String.valueOf(p.getIsolate()));
		}
		if (p.isOrphans()) {
			polygon.setAttribute("orphan", "yes");
		}
		if (!p.isThermals()) {
			polygon.setAttribute("thermals", "no");
		}
		if (p.getRank() != 0) {
			polygon.setAttribute("rank", String.valueOf(p.getRank()));
		}
		for (int i = 0; i < p.getVertex().size(); i++) {
			Element vertex = doc.createElement("vertex");
			Vertex v = p.getVertex().get(i);
			vertex.setAttribute("x", String.valueOf(v.getX()));
			vertex.setAttribute("y", String.valueOf(v.getY()));
			if (v.getCurve() != 0.0) {
				vertex.setAttribute("curve", String.valueOf(v.getCurve()));
			}
			polygon.appendChild(vertex);
		}
		
		return polygon;
	}


	/**
	 * This method parses the given model element including its attributes and references.
	 * @param d The model element to parse
	 * @return The parsed node element
	 */
	private Node parseDescription(Description d) {
		Element description = doc.createElement("description");
		if (!d.getLanguage().equals("en")) {
			description.setAttribute("language", d.getLanguage());
		}
		description.appendChild(doc.createTextNode(d.getValue()));
		return description;
	}


	/**
	 * This method loads a model based on the meta-model of Eagle.
	 * @return The model
	 */
	private Eagle load() {
        EaglemodelPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("eaglemodel", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();

        Resource resource = resSet.createResource(URI.createFileURI(modelPath));
        
        try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Eagle eag = (Eagle) resource.getContents().get(0);
        return eag;
    }
	
	
}