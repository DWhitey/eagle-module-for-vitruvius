package transformation;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import eaglemodel.*;
import eaglemodel.Class;
import eaglemodel.Package;
import eaglemodel.Text;

import javax.xml.parsers.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class XmlToEaglemodel {

	private File file;
	private Document doc;
//	private final String fileName = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand mit compatibility.sch";	// mit compatibility
	private final String fileName = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand.sch";		// normal
//	private final String fileName = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand2.sch";	// normal mit kopiertem transistor	(Compare 2)
//	private final String fileName = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand3.sch";	// normal mit kopiertem transistor und uid
	private EaglemodelFactory factory;
	private Instances instancesHelpList;
	
//	private String path = "C:\\Users\\Daniel\\Documents\\runtime-EclipseApplication\\TransformationTest";	//Laptop
	private String path = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest";	//Desktop PC

	public XmlToEaglemodel() throws SAXException, IOException, ParserConfigurationException {
		file = new File(fileName);
		
		// XML reader for the .sch file
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		
//		path += "\\Compare1.eaglemodel";
//		path += "\\Compare2.eaglemodel";
		path += "\\MyModel.eaglemodel";
//		path += "\\MyModel2.eaglemodel";
		
		// Create Eagle-Model
		EaglemodelPackage.eINSTANCE.eClass();
		factory = EaglemodelFactory.eINSTANCE;
		
		instancesHelpList = parseInstances(doc.getDocumentElement().getElementsByTagName("instances").item(0));
	}

	private void parseXmlToEaglemodel() {
		Eagle eagle = factory.createEagle();
		eagle.setVersion(doc.getDocumentElement().getAttribute("version"));
		
		NodeList eagleList = doc.getDocumentElement().getChildNodes();
		
		if (contains(eagleList, "compatibility")) {
			eagle.setCompatibility(parseCompatibility());
		}
		
		if (contains(eagleList, "drawing")) {
			eagle.setDrawing(parseDrawing());
		}
		saveModel(eagle);
	}
	
	private Drawing parseDrawing() {
		Drawing draw = factory.createDrawing();
		NodeList drawingList = doc.getDocumentElement().getElementsByTagName("drawing").item(0).getChildNodes();
		
		if (contains(drawingList, "settings")) {
			draw.setSettings(parseSettings());
		}
		if (contains(drawingList, "grid")) {
			draw.setGrid(parseGrid());
		}
		if (contains(drawingList, "layers")) {
			draw.setLayers(parseLayers());
		}
		if (contains(drawingList, "schematic")) {
			draw.setSchematic(parseSchematic());
		}
		return draw;
	}
	
	private Schematic parseSchematic() {
		Schematic sch = factory.createSchematic();
		Node schemantic = doc.getDocumentElement().getElementsByTagName("schematic").item(0);
		NodeList schemanticList = schemantic.getChildNodes();
		
		sch.setXreflabel(schemantic.getAttributes().getNamedItem("xreflabel").getNodeValue());
		sch.setXrefpart(schemantic.getAttributes().getNamedItem("xrefpart").getNodeValue());
		
		for (int i = 0; i < schemanticList.getLength(); i++) {
			Node n = schemanticList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				switch (n.getNodeName()) {
				case "description":
					sch.setDescription(parseDescription(n));
					break;
				case "libraries":
					sch.setLibraries(parseLibraries(n));
					break;
				case "attributes":
					sch.setAttributes(parseAttributes(n));
					break;
				case "variantdefs":
					sch.setVariantdefs(parseVariantdefs(n));
					break;
				case "classes":
					sch.setClasses(parseClasses(n));
					break;
				case "parts":
					sch.setParts(parseParts(n));
					break;
				case "sheets":
					sch.setSheets(parseSheets(n));
					break;
				case "errors":
					sch.setErrors(parseErrors(n));
					break;
				}
			}
		}
		return sch;
	}
	

	private Errors parseErrors(Node errors) {
		Errors e = factory.createErrors();

		if (errors.hasChildNodes()) {
			NodeList errorsList = errors.getChildNodes();
			
			for (int i = 0; i < errorsList.getLength(); i++) {
				Node n = errorsList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					e.getError().add(parseApproved(n));
				}
			}
		}
		
		return e;
	}

	private Approved parseApproved(Node approved) {
		Approved a = factory.createApproved();
		
		a.setHash(approved.getAttributes().getNamedItem("hash").getNodeValue());
		
		return a;
	}

	private Sheets parseSheets(Node sheets) {
		Sheets s = factory.createSheets();

		if (sheets.hasChildNodes()) {
			NodeList sheetsList = sheets.getChildNodes();
			
			for (int i = 0; i < sheetsList.getLength(); i++) {
				Node n = sheetsList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					s.getSheet().add(parseSheet(n));
				}
			}
		}
		
		return s;
	}

	private Sheet parseSheet(Node sheet) {
		Sheet s = factory.createSheet();

		if (sheet.hasChildNodes()) {
			NodeList sheetList = sheet.getChildNodes();
			for (int i = 0; i < sheetList.getLength(); i++) {
				Node n = sheetList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					switch (n.getNodeName()) {
					case "description":
						s.setDescription(parseDescription(n));
						break;
					case "plain":
						s.setPlain(parsePlain(n));
						break;
					case "instances":
//						s.setInstances(parseInstances(n));		// left this for easier transformation back to .xml/.sch, but is redundant
						break;
					case "busses":
						s.setBusses(parseBusses(n));
						break;
					case "nets":
						s.setNets(parseNets(n));
						break;
					}
				}
			}
		}
		
		return s;
	}

	private Nets parseNets(Node nets) {
		Nets ne = factory.createNets();

		if (nets.hasChildNodes()) {
			NodeList netsList = nets.getChildNodes();
			
			for (int i = 0; i < netsList.getLength(); i++) {
				Node n = netsList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					ne.getNet().add(parseNet(n));
				}
			}
		}
		
		return ne;
	}

	private Net parseNet(Node net) {
		Net ne = factory.createNet();

		ne.setName(net.getAttributes().getNamedItem("name").getNodeValue());
		if (contains(net.getAttributes(), "class")) {
			ne.setClass(Integer.valueOf(net.getAttributes().getNamedItem("class").getNodeValue()));
		}
		
		if (net.hasChildNodes()) {
			NodeList netList = net.getChildNodes();
			
			for (int i = 0; i < netList.getLength(); i++) {
				Node n = netList.item(i);
				switch (n.getNodeName()) {
				case "segment":
					ne.getSegment().add(parseSegment(n));
					break;
				}
			}
		}
		
		return ne;
	}

	private Busses parseBusses(Node busses) {
		Busses b = factory.createBusses();

		if (busses.hasChildNodes()) {
			NodeList bussesList = busses.getChildNodes();
			
			for (int i = 0; i < bussesList.getLength(); i++) {
				Node n = bussesList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					b.getBus().add(parseBus(n));
				}
			}
		}
		
		return b;
	}

	private Bus parseBus(Node bus) {
		Bus b = factory.createBus();

		b.setName(bus.getAttributes().getNamedItem("name").getNodeValue());
		
		if (bus.hasChildNodes()) {
			NodeList busList = bus.getChildNodes();
			
			for (int i = 0; i < busList.getLength(); i++) {
				Node n = busList.item(i);
				if (!n.getNodeName().startsWith("#")) {
					b.getSegment().add(parseSegment(n));
				}
			}
		}
		
		return b;
	}

	private Segment parseSegment(Node segment) {
		Segment s = factory.createSegment();
		
		if (segment.hasChildNodes()) {
			NodeList segmentList = segment.getChildNodes();
			
			for (int i = 0; i < segmentList.getLength(); i++) {
				Node n = segmentList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					switch (n.getNodeName()) {
					case "pinref":
						s.getPinref().add(parsePinref(n));
						break;
					case "wire":
						s.getWire().add(parseWire(n));
						break;
					case "junction":
						s.getJunction().add(parseJunction(n));
						break;
					case "label":
						s.getLabel().add(parseLabel(n));
						break;
					}
				}
			}
		}
		
		return s;
	}
	

	private Label parseLabel(Node label) {
		Label l = factory.createLabel();

		l.setX(Double.valueOf(label.getAttributes().getNamedItem("x").getNodeValue()));
		l.setY(Double.valueOf(label.getAttributes().getNamedItem("y").getNodeValue()));
		l.setSize(Double.valueOf(label.getAttributes().getNamedItem("size").getNodeValue()));
		l.setLayer(Integer.valueOf(label.getAttributes().getNamedItem("layer").getNodeValue()));
		
		if (contains(label.getAttributes(), "font")) {
			switch (label.getAttributes().getNamedItem("font").getNodeValue()) {
			case "vector":
				l.setFont(TextFont.VECTOR);
				break;
			case "proportional":
				l.setFont(TextFont.PROPORTIONAL);
				break;
			case "fixed":
				l.setFont(TextFont.FIXED);
				break;
			}
		}
		if (contains(label.getAttributes(), "ratio")) {
			l.setRatio(Integer.valueOf(label.getAttributes().getNamedItem("ratio").getNodeValue()));
		}
		if (contains(label.getAttributes(), "rot")) {
			l.setRot(Integer.valueOf(label.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		if (contains(label.getAttributes(), "xref")) {
			if (label.getAttributes().getNamedItem("xref").getNodeValue().equals("no")) {
				l.setXref(false);
			} else {
				l.setXref(true);
			}
		}
		
		return l;
	}

	private Junction parseJunction(Node junction) {
		Junction j = factory.createJunction();
		
		j.setX(Double.valueOf(junction.getAttributes().getNamedItem("x").getNodeValue()));
		j.setY(Double.valueOf(junction.getAttributes().getNamedItem("y").getNodeValue()));
		
		return j;
	}
	

	private Pinref parsePinref(Node pinref) {
		Pinref p = factory.createPinref();
		
		p.setPart(pinref.getAttributes().getNamedItem("part").getNodeValue());
		p.setGate(pinref.getAttributes().getNamedItem("gate").getNodeValue());
		p.setPin(pinref.getAttributes().getNamedItem("pin").getNodeValue());
		
		return p;
	}

	private Instances parseInstances(Node instances) {
		Instances in = factory.createInstances();

		if (instances.hasChildNodes()) {
			NodeList instancesList = instances.getChildNodes();
			
			for (int i = 0; i < instancesList.getLength(); i++) {
				Node n = instancesList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					in.getInstance().add(parseInstance(n));
				}
			}
		}
		
		return in;
	}

	private Instance parseInstance(Node instance) {
		Instance in = factory.createInstance();

		in.setPart(instance.getAttributes().getNamedItem("part").getNodeValue());
		in.setGate(instance.getAttributes().getNamedItem("gate").getNodeValue());
		in.setX(Double.valueOf(instance.getAttributes().getNamedItem("x").getNodeValue()));
		in.setY(Double.valueOf(instance.getAttributes().getNamedItem("y").getNodeValue()));
		
		if (contains(instance.getAttributes(), "smashed")) {
			if (instance.getAttributes().getNamedItem("smashed").getNodeValue().equals("no")) {
				in.setSmashed(false);
			} else {
				in.setSmashed(true);
			}
		}
		if (contains(instance.getAttributes(), "rot")) {
			in.setRot(Integer.valueOf(instance.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		if (instance.hasChildNodes()) {
			NodeList instanceList = instance.getChildNodes();
			
			for (int i = 0; i < instanceList.getLength(); i++) {
				Node n = instanceList.item(i);
				if (!n.getNodeName().startsWith("#")) {
					in.getAttribute().add(parseAttribute(n));
				}
			}
		}

		return in;
	}

	private Plain parsePlain(Node plain) {
		Plain p = factory.createPlain();
		
		if (plain.hasChildNodes()) {
			NodeList plainList = plain.getChildNodes();
			for (int i = 0; i < plainList.getLength(); i++) {
				Node n = plainList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					switch (n.getNodeName()) {
					case "polygon":
						p.getPolygon().add(parsePolygon(n));
						break;
					case "wire":
						p.getWire().add(parseWire(n));
						break;
					case "text":
						p.getText().add(parseText(n));
						break;
					case "dimension":
						p.getDimension().add(parseDimension(n));
						break;
					case "circle":
						p.getCircle().add(parseCircle(n));
						break;
					case "rectangle":
						p.getRectangle().add(parseRectangle(n));
						break;
					case "frame":
						p.getFrame().add(parseFrame(n));
						break;
					case "hole":
						p.getHole().add(parseHole(n));
						break;
					}
				}
			}
		}
		
		return p;
	}

	private Parts parseParts(Node parts) {
		Parts p = factory.createParts();

		if (parts.hasChildNodes()) {
			NodeList partsList = parts.getChildNodes();
			
			for (int i = 0; i < partsList.getLength(); i++) {
				Node n = partsList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					p.getPart().add(parsePart(n));
				}
			}
		}
		
		return p;
	}

	
	private Part parsePart(Node part) {
		Part p = factory.createPart();

		p.setName(part.getAttributes().getNamedItem("name").getNodeValue());
		p.setLibrary(part.getAttributes().getNamedItem("library").getNodeValue());
		p.setDeviceset(part.getAttributes().getNamedItem("deviceset").getNodeValue());
		p.setDevice(part.getAttributes().getNamedItem("device").getNodeValue());
		
		if (contains(part.getAttributes(), "technology")) {
			p.setTechnology(part.getAttributes().getNamedItem("technology").getNodeValue());
		}
		if (contains(part.getAttributes(), "value")) {
			p.setValue(part.getAttributes().getNamedItem("value").getNodeValue());
		}
		
		if (part.hasChildNodes()) {
			NodeList partList = part.getChildNodes();
			
			for (int i = 0; i < partList.getLength(); i++) {
				Node n = partList.item(i);
				switch (n.getNodeName()) {
				case "attribute":
					p.getAttribute().add(parseAttribute(n));
					break;
				case "variant":
					p.getVariant().add(parseVariant(n));
					break;
				}
			}
		}
		
		for (int i = 0; i < instancesHelpList.getInstance().size(); i++) {
			Instance in = instancesHelpList.getInstance().get(i);
			if (p.getName().equals(in.getPart())) {
				p.setGate(in.getGate());
				p.setX(in.getX());
				p.setY(in.getY());
				p.setSmashed(in.isSmashed());
				p.setRot(in.getRot());
				for (int j = 0; j < p.getAttribute().size(); j++) {
					Attribute partAttr = p.getAttribute().get(j);
					if (partAttr.getName().equals("UID")) {
						p.setUid(Integer.valueOf(partAttr.getValue()));
						p.getAttribute().remove(j);
						j--;
						continue;
					}
					for (int k = 0; k < in.getAttribute().size(); k++) {
						Attribute instAttr = in.getAttribute().get(k);
						if (partAttr.getName().equals(instAttr.getName())) {
							partAttr.setX(instAttr.getX());
							partAttr.setY(instAttr.getY());
							partAttr.setSize(instAttr.getSize());
							partAttr.setLayer(instAttr.getLayer());
							partAttr.setRatio(instAttr.getRatio());
							partAttr.setFont(instAttr.getFont());
							partAttr.setRot(instAttr.getRot());
							partAttr.setConstant(instAttr.isConstant());
							break;
						}
					}
				}
				break;
			}
		}
		
		return p;
	}

	
	private Variant parseVariant(Node variant) {
		Variant v = factory.createVariant();
		
		v.setName(variant.getAttributes().getNamedItem("name").getNodeValue());
		
		if (contains(variant.getAttributes(), "populate")) {
			if (variant.getAttributes().getNamedItem("populate").getNodeValue().equals("no")) {
				v.setPopulate(false);
			} else {
				v.setPopulate(true);
			}
		}
		if (contains(variant.getAttributes(), "value")) {
			v.setValue(variant.getAttributes().getNamedItem("value").getNodeValue());
		}
		if (contains(variant.getAttributes(), "technology")) {
			v.setTechnology(variant.getAttributes().getNamedItem("technology").getNodeValue());
		}
		
		return v;
	}
	

	private Classes parseClasses(Node classes) {
		Classes c = factory.createClasses();
		
		if (classes.hasChildNodes()) {
			NodeList classesList = classes.getChildNodes();
			
			for (int i = 0; i < classesList.getLength(); i++) {
				Node n = classesList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					c.getClass_().add(parseClass(n));
				}
			}
		}
		
		return c;
	}

	private Class parseClass(Node cla) {
		Class c = factory.createClass();
		
		c.setNumber(Integer.valueOf(cla.getAttributes().getNamedItem("number").getNodeValue()));
		c.setName(cla.getAttributes().getNamedItem("name").getNodeValue());
		
		if (contains(cla.getAttributes(), "width")) {
			c.setWidth(Double.valueOf(cla.getAttributes().getNamedItem("width").getNodeValue()));
		}
		if (contains(cla.getAttributes(), "drill")) {
			c.setDrill(Double.valueOf(cla.getAttributes().getNamedItem("drill").getNodeValue()));
		}
		if (cla.hasChildNodes()) {
			NodeList claList = cla.getChildNodes();
			
			for (int i = 0; i < claList.getLength(); i++) {
				Node n = claList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					c.getClearance().add(parseClearance(n));
				}
			}
		}
		
		return c;
	}

	private Clearance parseClearance(Node clearance) {
		Clearance c = factory.createClearance();
		
		c.setClass(Integer.valueOf(clearance.getAttributes().getNamedItem("class").getNodeValue()));
		if (contains(clearance.getAttributes(), "value")) {
			c.setValue(Double.valueOf(clearance.getAttributes().getNamedItem("value").getNodeValue()));
		}
		
		return c;
	}

	private Variantdefs parseVariantdefs(Node variantdefs) {
		Variantdefs v = factory.createVariantdefs();
		
		if (variantdefs.hasChildNodes()) {
			NodeList variantdefsList = variantdefs.getChildNodes();
			
			for (int i = 0; i < variantdefsList.getLength(); i++) {
				Node n = variantdefsList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					v.getVariantdef().add(parseVariantdef(n));
				}
			}
		}
		
		return v;
	}

	private Variantdef parseVariantdef(Node variantdef) {
		Variantdef v = factory.createVariantdef();
		
		v.setName(variantdef.getAttributes().getNamedItem("name").getNodeValue());
		
		if (contains(variantdef.getAttributes(), "current")) {
			if (variantdef.getAttributes().getNamedItem("current").getNodeValue().equals("no")) {
				v.setCurrent(false);
			} else {
				v.setCurrent(true);
			}
		}
		
		return v;
	}

	private Attributes parseAttributes(Node attributes) {
		Attributes a = factory.createAttributes();
		
		if (attributes.hasChildNodes()) {
			NodeList attributesList = attributes.getChildNodes();
			
			for (int i = 0; i < attributesList.getLength(); i++) {
				Node n = attributesList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					a.getAttribute().add(parseAttribute(n));
				}
			}
		}
		
		return a;
	}

	private Libraries parseLibraries(Node libraries) {
		Libraries l = factory.createLibraries();
		NodeList librariesList = libraries.getChildNodes();
		
		for (int i = 0; i < librariesList.getLength(); i++) {
			Node n = librariesList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				l.getLibrary().add(parseLibrary(n));
			}
		}
		return l;
	}

	private Library parseLibrary(Node library) {
		Library l = factory.createLibrary();
		NodeList libraryList = library.getChildNodes();
		
		l.setName(library.getAttributes().getNamedItem("name").getNodeValue());

		for (int i = 0; i < libraryList.getLength(); i++) {
			Node n = libraryList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				switch (n.getNodeName()) {
				case "description":
					l.setDescription(parseDescription(n));
					break;
				case "packages":
					l.setPackages(parsePackages(n));
					break;
				case "symbols":
					l.setSymbols(parseSymbols(n));
					break;
				case "devicesets":
					l.setDevicesets(parseDevicesets(n));
					break;
				}
			}
		}
		return l;
	}

	private Devicesets parseDevicesets(Node devicesets) {
		Devicesets d = factory.createDevicesets();
		NodeList devicesetsList = devicesets.getChildNodes();
		
		for (int i = 0; i < devicesetsList.getLength(); i++) {
			Node n = devicesetsList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				d.getDeviceset().add(parseDeviceset(n));
			}
		}
		return d;
	}

	private Deviceset parseDeviceset(Node deviceset) {
		Deviceset d = factory.createDeviceset();
		NodeList devicesetList = deviceset.getChildNodes();
		
		d.setName(deviceset.getAttributes().getNamedItem("name").getNodeValue());
		
		if (contains(deviceset.getAttributes(), "prefix")) {
			d.setPrefix(deviceset.getAttributes().getNamedItem("prefix").getNodeValue());
		}
		if (contains(deviceset.getAttributes(), "uservalue")) {
			if (deviceset.getAttributes().getNamedItem("uservalue").getNodeValue().equals("no")) {
				d.setUservalue(false);
			} else {
				d.setUservalue(true);
			}
		}
		
		for (int i = 0; i < devicesetList.getLength(); i++) {
			Node n = devicesetList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				switch (n.getNodeName()) {
				case "description":
					d.setDescription(parseDescription(n));
					break;
				case "gates":
					d.setGates(parseGates(n));
					break;
				case "devices":
					d.setDevices(parseDevices(n));
					break;
				}
			}
		}
		
		return d;
	}

	private Gates parseGates(Node gates) {
		Gates g = factory.createGates();
		NodeList gatesList = gates.getChildNodes();

		for (int i = 0; i < gatesList.getLength(); i++) {
			Node n = gatesList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				g.getGate().add(parseGate(n));
			}
		}
		
		return g;
	}

	private Gate parseGate(Node gate) {
		Gate g = factory.createGate();
		
		g.setName(gate.getAttributes().getNamedItem("name").getNodeValue());
		g.setSymbol(gate.getAttributes().getNamedItem("symbol").getNodeValue());
		g.setX(Double.valueOf(gate.getAttributes().getNamedItem("x").getNodeValue()));
		g.setY(Double.valueOf(gate.getAttributes().getNamedItem("y").getNodeValue()));
		
		if (contains(gate.getAttributes(), "addlevel")) {
			switch (gate.getAttributes().getNamedItem("addlevel").getNodeValue()) {
			case "must":
				g.setAddlevel(GateAddLevel.MUST);
				break;
			case "can":
				g.setAddlevel(GateAddLevel.CAN);
				break;
			case "next":
				g.setAddlevel(GateAddLevel.NEXT);
				break;
			case "request":
				g.setAddlevel(GateAddLevel.REQUEST);
				break;
			case "always":
				g.setAddlevel(GateAddLevel.ALWAYS);
				break;
			}
		}
		if (contains(gate.getAttributes(), "swaplevel")) {
			g.setSwaplevel(Integer.valueOf(gate.getAttributes().getNamedItem("swaplevel").getNodeValue()));
		}
		
		return g;
	}

	private Devices parseDevices(Node devices) {
		Devices d = factory.createDevices();
		
		if (devices.hasChildNodes()) {
			NodeList devicesList = devices.getChildNodes();
			
			for (int i = 0; i < devicesList.getLength(); i++) {
				Node n = devicesList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					d.getDevice().add(parseDevice(n));
				}
			}
		}
		
		return d;
	}

	private Device parseDevice(Node device) {
		Device d = factory.createDevice();
		
		if (contains(device.getAttributes(), "name")) {
			d.setName(device.getAttributes().getNamedItem("name").getNodeValue());
		}
		if (contains(device.getAttributes(), "package")) {
			d.setPackage(device.getAttributes().getNamedItem("package").getNodeValue());
		}
		if (device.hasChildNodes()) {
			NodeList deviceList = device.getChildNodes();
			
			for (int i = 0; i < deviceList.getLength(); i++) {
				Node n = deviceList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					switch (n.getNodeName()) {
					case "connects":
						d.setConnects(parseConnects(n));
						break;
					case "technologies":
						d.setTechnologies(parseTechnologies(n));
						break;
					}
				}
			}
		}
		
		return d;
	}

	private Technologies parseTechnologies(Node technologies) {
		Technologies t = factory.createTechnologies();
		
		NodeList technologiesList = technologies.getChildNodes();
		
		for (int i = 0; i < technologiesList.getLength(); i++) {
			Node n = technologiesList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				t.getTechnology().add(parseTechnology(n));
			}
		}
		
		return t;
	}

	
	private Technology parseTechnology(Node technology) {
		Technology t = factory.createTechnology();
		
		t.setName(technology.getAttributes().getNamedItem("name").getNodeValue());
		
		if (technology.hasChildNodes()) {
			NodeList technologyList = technology.getChildNodes();
			
			for (int i = 0; i < technologyList.getLength(); i++) {
				Node n = technologyList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					t.getAttribute().add(parseAttribute(n));
				}
			}
			
		}
		
		return t;
	}

	
	private Attribute parseAttribute(Node attribute) {
		Attribute a = factory.createAttribute();
		
		a.setName(attribute.getAttributes().getNamedItem("name").getNodeValue());
		
		if (contains(attribute.getAttributes(), "value")) {
			a.setValue(attribute.getAttributes().getNamedItem("value").getNodeValue());
		}
		if (contains(attribute.getAttributes(), "x")) {
			a.setX(Double.valueOf(attribute.getAttributes().getNamedItem("x").getNodeValue()));
		}
		if (contains(attribute.getAttributes(), "y")) {
			a.setY(Double.valueOf(attribute.getAttributes().getNamedItem("y").getNodeValue()));
		}
		if (contains(attribute.getAttributes(), "size")) {
			a.setSize(Double.valueOf(attribute.getAttributes().getNamedItem("size").getNodeValue()));
		}
		if (contains(attribute.getAttributes(), "layer")) {
			a.setLayer(Integer.valueOf(attribute.getAttributes().getNamedItem("layer").getNodeValue()));
		}
		if (contains(attribute.getAttributes(), "font")) {
			switch (attribute.getAttributes().getNamedItem("font").getNodeValue()) {
			case "vector":
				a.setFont(TextFont.VECTOR);
				break;
			case "proportional":
				a.setFont(TextFont.PROPORTIONAL);
				break;
			case "fixed":
				a.setFont(TextFont.FIXED);
				break;
			}
		}
		if (contains(attribute.getAttributes(), "ratio")) {
			a.setRatio(Integer.valueOf(attribute.getAttributes().getNamedItem("ratio").getNodeValue()));
		}
		if (contains(attribute.getAttributes(), "rot")) {
			a.setRot(Integer.valueOf(attribute.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		if (contains(attribute.getAttributes(), "display")) {
			switch (attribute.getAttributes().getNamedItem("display").getNodeValue()) {
			case "off":
				a.setDisplay(AttributeDisplay.OFF);
				break;
			case "value":
				a.setDisplay(AttributeDisplay.VALUE);
				break;
			case "name":
				a.setDisplay(AttributeDisplay.NAME);
				break;
			case "both":
				a.setDisplay(AttributeDisplay.BOTH);
				break;
			}
		}
		if (contains(attribute.getAttributes(), "constant")) {
			if (attribute.getAttributes().getNamedItem("constant").getNodeValue().equals("no")) {
				a.setConstant(false);
			} else {
				a.setConstant(true);
			}
		}
		
		return a;
	}

	private Connects parseConnects(Node connects) {
		Connects c = factory.createConnects();
		
		NodeList connectsList = connects.getChildNodes();
		
		for (int i = 0; i < connectsList.getLength(); i++) {
			Node n = connectsList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				c.getConnect().add(parseConnect(n));
			}
		}
		
		return c;
	}


	private Connect parseConnect(Node connect) {
		Connect c = factory.createConnect();
		
		c.setGate(connect.getAttributes().getNamedItem("gate").getNodeValue());
		c.setPin(connect.getAttributes().getNamedItem("pin").getNodeValue());
		c.setPad(connect.getAttributes().getNamedItem("pad").getNodeValue());
		
		if (contains(connect.getAttributes(), "route")) {
			switch (connect.getAttributes().getNamedItem("route").getNodeValue()) {
			case "all":
				c.setRoute(ContactRoute.ALL);
				break;
			case "any":
				c.setRoute(ContactRoute.ANY);
				break;
			}
		}
		
		return c;
	}

	private Symbols parseSymbols(Node symbols) {
		Symbols s = factory.createSymbols();
		NodeList symbolsList = symbols.getChildNodes();
		
		for (int i = 0; i < symbolsList.getLength(); i++) {
			Node n = symbolsList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				s.getSymbol().add(parseSymbol(n));
			}
		}
		return s;
	}

	private Symbol parseSymbol(Node symbol) {
		Symbol s = factory.createSymbol();
		NodeList symbolList = symbol.getChildNodes();

		s.setName(symbol.getAttributes().getNamedItem("name").getNodeValue());
		
		for (int i = 0; i < symbolList.getLength(); i++) {
			Node n = symbolList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				switch (n.getNodeName()) {
				case "description":
					s.setDescription(parseDescription(n));
					break;
				case "polygon":
					s.getPolygon().add(parsePolygon(n));
					break;
				case "wire":
					s.getWire().add(parseWire(n));
					break;
				case "text":
					s.getText().add(parseText(n));
					break;
				case "dimension":
					s.getDimension().add(parseDimension(n));
					break;
				case "pin":
					s.getPin().add(parsePin(n));
					break;
				case "circle":
					s.getCircle().add(parseCircle(n));
					break;
				case "rectangle":
					s.getRectangle().add(parseRectangle(n));
					break;
				case "frame":
					s.getFrame().add(parseFrame(n));
					break;
				}
			}
		}
		
		return s;
	}

	private Pin parsePin(Node pin) {
		Pin p = factory.createPin();

		p.setName(pin.getAttributes().getNamedItem("name").getNodeValue());
		p.setX(Double.valueOf(pin.getAttributes().getNamedItem("x").getNodeValue()));
		p.setY(Double.valueOf(pin.getAttributes().getNamedItem("y").getNodeValue()));
		
		if (contains(pin.getAttributes(), "visible")) {
			switch (pin.getAttributes().getNamedItem("visible").getNodeValue()) {
			case "off":
				p.setVisible(PinVisible.OFF);
				break;
			case "pad":
				p.setVisible(PinVisible.PAD);
				break;
			case "pin":
				p.setVisible(PinVisible.PIN);
				break;
			case "both":
				p.setVisible(PinVisible.BOTH);
				break;
			}
		}
		if (contains(pin.getAttributes(), "length")) {
			switch (pin.getAttributes().getNamedItem("length").getNodeValue()) {
			case "point":
				p.setLength(PinLength.POINT);
				break;
			case "short":
				p.setLength(PinLength.SHORT);
				break;
			case "middle":
				p.setLength(PinLength.MIDDLE);
				break;
			case "long":
				p.setLength(PinLength.LONG);
				break;
			}
		}
		if (contains(pin.getAttributes(), "direction")) {
			switch (pin.getAttributes().getNamedItem("direction").getNodeValue()) {
			case "nc":
				p.setDirection(PinDirection.NC);
				break;
			case "in":
				p.setDirection(PinDirection.IN);
				break;
			case "out":
				p.setDirection(PinDirection.OUT);
				break;
			case "io":
				p.setDirection(PinDirection.IO);
				break;
			case "oc":
				p.setDirection(PinDirection.OC);
				break;
			case "pwr":
				p.setDirection(PinDirection.PWR);
				break;
			case "pas":
				p.setDirection(PinDirection.PAS);
				break;
			case "hiz":
				p.setDirection(PinDirection.HIZ);
				break;
			case "sup":
				p.setDirection(PinDirection.SUP);
				break;
			}
		}
		if (contains(pin.getAttributes(), "function")) {
			switch (pin.getAttributes().getNamedItem("function").getNodeValue()) {
			case "none":
				p.setFunction(PinFunction.NONE);
				break;
			case "dot":
				p.setFunction(PinFunction.DOT);
				break;
			case "clk":
				p.setFunction(PinFunction.CLK);
				break;
			case "dotclk":
				p.setFunction(PinFunction.DOTCLK);
				break;
			}
		}
		if (contains(pin.getAttributes(), "swaplevel")) {
			p.setSwaplevel(Integer.valueOf(pin.getAttributes().getNamedItem("swaplevel").getNodeValue()));
		}
		if (contains(pin.getAttributes(), "rot")) {
			p.setRot(Integer.valueOf(pin.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		
		return p;
	}

	private Packages parsePackages(Node packages) {
		Packages p = factory.createPackages();
		NodeList packagesList = packages.getChildNodes();
		
		for (int i = 0; i < packagesList.getLength(); i++) {
			Node n = packagesList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				p.getPackage().add(parsePackage(n));
			}
		}
		return p;
	}
	

	private Package parsePackage(Node pack) {
		Package p = factory.createPackage();
		NodeList packList = pack.getChildNodes();

		p.setName(pack.getAttributes().getNamedItem("name").getNodeValue());
		
		for (int i = 0; i < packList.getLength(); i++) {
			Node n = packList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				switch (n.getNodeName()) {
				case "description":
					p.setDescription(parseDescription(n));
					break;
				case "polygon":
					p.getPolygon().add(parsePolygon(n));
					break;
				case "wire":
					p.getWire().add(parseWire(n));
					break;
				case "text":
					p.getText().add(parseText(n));
					break;
				case "dimension":
					p.getDimension().add(parseDimension(n));
					break;
				case "circle":
					p.getCircle().add(parseCircle(n));
					break;
				case "rectangle":
					p.getRectangle().add(parseRectangle(n));
					break;
				case "frame":
					p.getFrame().add(parseFrame(n));
					break;
				case "hole":
					p.getHole().add(parseHole(n));
					break;
				case "pad":
					p.getPad().add(parsePad(n));
					break;
				case "smd":
					p.getSmd().add(parseSmd(n));
					break;
				}
			}
		}
		
		return p;
	}

	private SMD parseSmd(Node smd) {
		SMD s = factory.createSMD();
		
		s.setName(smd.getAttributes().getNamedItem("name").getNodeValue());
		s.setX(Double.valueOf(smd.getAttributes().getNamedItem("x").getNodeValue()));
		s.setY(Double.valueOf(smd.getAttributes().getNamedItem("y").getNodeValue()));
		s.setDx(Double.valueOf(smd.getAttributes().getNamedItem("dx").getNodeValue()));
		s.setDy(Double.valueOf(smd.getAttributes().getNamedItem("dy").getNodeValue()));
		s.setLayer(Integer.valueOf(smd.getAttributes().getNamedItem("layer").getNodeValue()));
		
		if (contains(smd.getAttributes(), "roundness")) {
			s.setRoundness(Integer.valueOf(smd.getAttributes().getNamedItem("roundness").getNodeValue()));
		}
		if (contains(smd.getAttributes(), "rot")) {
			s.setRot(Integer.valueOf(smd.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		if (contains(smd.getAttributes(), "stop")) {
			if (smd.getAttributes().getNamedItem("stop").getNodeValue().equals("no")) {
				s.setStop(false);
			} else {
				s.setStop(true);
			}
		}
		if (contains(smd.getAttributes(), "thermals")) {
			if (smd.getAttributes().getNamedItem("thermals").getNodeValue().equals("no")) {
				s.setThermals(false);
			} else {
				s.setThermals(true);
			}
		}
		if (contains(smd.getAttributes(), "cream")) {
			if (smd.getAttributes().getNamedItem("cream").getNodeValue().equals("no")) {
				s.setCream(false);
			} else {
				s.setCream(true);
			}
		}
		
		return s;
	}

	private Pad parsePad(Node pad) {
		Pad p = factory.createPad();
		
		p.setName(pad.getAttributes().getNamedItem("name").getNodeValue());
		p.setX(Double.valueOf(pad.getAttributes().getNamedItem("x").getNodeValue()));
		p.setY(Double.valueOf(pad.getAttributes().getNamedItem("y").getNodeValue()));
		p.setDrill(Double.valueOf(pad.getAttributes().getNamedItem("drill").getNodeValue()));
		
		if (contains(pad.getAttributes(), "diameter")) {
			p.setDiameter(Double.valueOf(pad.getAttributes().getNamedItem("diameter").getNodeValue()));
		}
		if (contains(pad.getAttributes(), "shape")) {
			switch (pad.getAttributes().getNamedItem("shape").getNodeValue()) {
			case "square":
				p.setShape(PadShape.SQUARE);
				break;
			case "round":
				p.setShape(PadShape.ROUND);
				break;
			case "octagon":
				p.setShape(PadShape.OCTAGON);
				break;
			case "long":
				p.setShape(PadShape.LONG);
				break;
			case "offset":
				p.setShape(PadShape.OFFSET);
				break;
			}
		}
		if (contains(pad.getAttributes(), "rot")) {
			p.setRot(Integer.valueOf(pad.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		if (contains(pad.getAttributes(), "stop")) {
			if (pad.getAttributes().getNamedItem("stop").getNodeValue().equals("no")) {
				p.setStop(false);
			} else {
				p.setStop(true);
			}
		}
		if (contains(pad.getAttributes(), "thermals")) {
			if (pad.getAttributes().getNamedItem("thermals").getNodeValue().equals("no")) {
				p.setThermals(false);
			} else {
				p.setThermals(true);
			}
		}
		if (contains(pad.getAttributes(), "first")) {
			if (pad.getAttributes().getNamedItem("first").getNodeValue().equals("no")) {
				p.setFirst(false);
			} else {
				p.setFirst(true);
			}
		}
		
		return p;
	}

	private Hole parseHole(Node hole) {
		Hole h = factory.createHole();
		
		h.setX(Double.valueOf(hole.getAttributes().getNamedItem("x").getNodeValue()));
		h.setY(Double.valueOf(hole.getAttributes().getNamedItem("y").getNodeValue()));
		h.setDrill(Double.valueOf(hole.getAttributes().getNamedItem("drill").getNodeValue()));
		
		return h;
	}

	private Frame parseFrame(Node frame) {
		Frame f = factory.createFrame();
		
		f.setX1(Double.valueOf(frame.getAttributes().getNamedItem("x1").getNodeValue()));
		f.setY1(Double.valueOf(frame.getAttributes().getNamedItem("y1").getNodeValue()));
		f.setX2(Double.valueOf(frame.getAttributes().getNamedItem("x2").getNodeValue()));
		f.setY2(Double.valueOf(frame.getAttributes().getNamedItem("y2").getNodeValue()));
		f.setColumns(Integer.valueOf(frame.getAttributes().getNamedItem("columns").getNodeValue()));
		f.setRows(Integer.valueOf(frame.getAttributes().getNamedItem("rows").getNodeValue()));
		f.setLayer(Integer.valueOf(frame.getAttributes().getNamedItem("layer").getNodeValue()));

		if (contains(frame.getAttributes(), "border-left")) {
			if (frame.getAttributes().getNamedItem("border-left").getNodeValue().equals("no")) {
				f.setBorderleft(false);
			} else {
				f.setBorderleft(true);
			}
		}
		if (contains(frame.getAttributes(), "border-top")) {
			if (frame.getAttributes().getNamedItem("border-top").getNodeValue().equals("no")) {
				f.setBordertop(false);
			} else {
				f.setBordertop(true);
			}
		}
		if (contains(frame.getAttributes(), "border-right")) {
			if (frame.getAttributes().getNamedItem("border-right").getNodeValue().equals("no")) {
				f.setBorderright(false);
			} else {
				f.setBorderright(true);
			}
		}
		if (contains(frame.getAttributes(), "border-bottom")) {
			if (frame.getAttributes().getNamedItem("border-bottom").getNodeValue().equals("no")) {
				f.setBorderbottom(false);
			} else {
				f.setBorderbottom(true);
			}
		}
		
		return f;
	}

	private Rectangle parseRectangle(Node rectangle) {
		Rectangle r = factory.createRectangle();
		
		r.setX1(Double.valueOf(rectangle.getAttributes().getNamedItem("x1").getNodeValue()));
		r.setY1(Double.valueOf(rectangle.getAttributes().getNamedItem("y1").getNodeValue()));
		r.setX2(Double.valueOf(rectangle.getAttributes().getNamedItem("x2").getNodeValue()));
		r.setY2(Double.valueOf(rectangle.getAttributes().getNamedItem("y2").getNodeValue()));
		r.setLayer(Integer.valueOf(rectangle.getAttributes().getNamedItem("layer").getNodeValue()));
		
		if (contains(rectangle.getAttributes(), "rot")) {
			r.setRot(Integer.valueOf(rectangle.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		
		return r;
	}

	private Circle parseCircle(Node circle) {
		Circle c = factory.createCircle();
		
		c.setX(Double.valueOf(circle.getAttributes().getNamedItem("x").getNodeValue()));
		c.setY(Double.valueOf(circle.getAttributes().getNamedItem("y").getNodeValue()));
		c.setRadius(Double.valueOf(circle.getAttributes().getNamedItem("radius").getNodeValue()));
		c.setWidth(Double.valueOf(circle.getAttributes().getNamedItem("width").getNodeValue()));
		c.setLayer(Integer.valueOf(circle.getAttributes().getNamedItem("layer").getNodeValue()));
		
		return c;
	}

	private Dimension parseDimension(Node dimension) {
		Dimension d = factory.createDimension();
		
		d.setX1(Double.valueOf(dimension.getAttributes().getNamedItem("x1").getNodeValue()));
		d.setY1(Double.valueOf(dimension.getAttributes().getNamedItem("y1").getNodeValue()));
		d.setX2(Double.valueOf(dimension.getAttributes().getNamedItem("x2").getNodeValue()));
		d.setY2(Double.valueOf(dimension.getAttributes().getNamedItem("y2").getNodeValue()));
		d.setX3(Double.valueOf(dimension.getAttributes().getNamedItem("x3").getNodeValue()));
		d.setY3(Double.valueOf(dimension.getAttributes().getNamedItem("y3").getNodeValue()));
		d.setLayer(Integer.valueOf(dimension.getAttributes().getNamedItem("layer").getNodeValue()));
		
		if (contains(dimension.getAttributes(), "dtype")) {
			switch (dimension.getAttributes().getNamedItem("dtype").getNodeValue()) {
			case "parallel":
				d.setDtype(DimensionType.PARALLEL);
				break;
			case "horizontal":
				d.setDtype(DimensionType.HORIZONTAL);
				break;
			case "vertical":
				d.setDtype(DimensionType.VERTICAL);
				break;
			case "radius":
				d.setDtype(DimensionType.RADIUS);
				break;
			case "diameter":
				d.setDtype(DimensionType.DIAMETER);
				break;
			case "leader":
				d.setDtype(DimensionType.LEADER);
				break;
			}
		}
		d.setWidth(Double.valueOf(dimension.getAttributes().getNamedItem("width").getNodeValue()));
		if (contains(dimension.getAttributes(), "extwidth")) {
			d.setExtwidth(Double.valueOf(dimension.getAttributes().getNamedItem("extwidth").getNodeValue()));
		}
		if (contains(dimension.getAttributes(), "extlength")) {
			d.setExtlength(Double.valueOf(dimension.getAttributes().getNamedItem("extlength").getNodeValue()));
		}
		if (contains(dimension.getAttributes(), "extoffset")) {
			d.setExtoffset(Double.valueOf(dimension.getAttributes().getNamedItem("extoffset").getNodeValue()));
		}
		d.setTextsize(Double.valueOf(dimension.getAttributes().getNamedItem("textsize").getNodeValue()));
		if (contains(dimension.getAttributes(), "textratio")) {
			d.setTextratio(Integer.valueOf(dimension.getAttributes().getNamedItem("textratio").getNodeValue()));
		}
		if (contains(dimension.getAttributes(), "unit")) {
			switch (dimension.getAttributes().getNamedItem("unit").getNodeValue().toString()) {
			case "mic":
				d.setUnit(GridUnit.MIC);
				break;
			case "mm":
				d.setUnit(GridUnit.MM);
				break;
			case "mil":
				d.setUnit(GridUnit.MIL);
				break;
			case "inch":
				d.setUnit(GridUnit.INCH);
				break;
			}
		}
		if (contains(dimension.getAttributes(), "precision")) {
			d.setPrecision(Integer.valueOf(dimension.getAttributes().getNamedItem("precision").getNodeValue()));
		}
		if (contains(dimension.getAttributes(), "visible")) {
			if (dimension.getAttributes().getNamedItem("visible").getNodeValue().equals("no")) {
				d.setVisible(false);
			} else {
				d.setVisible(true);
			}
		}
		
		return d;
	}

	private Text parseText(Node text) {
		Text t = factory.createText();
		
		t.setX(Double.valueOf(text.getAttributes().getNamedItem("x").getNodeValue()));
		t.setY(Double.valueOf(text.getAttributes().getNamedItem("y").getNodeValue()));
		t.setSize(Double.valueOf(text.getAttributes().getNamedItem("size").getNodeValue()));
		t.setLayer(Integer.valueOf(text.getAttributes().getNamedItem("layer").getNodeValue()));
		
		if (contains(text.getAttributes(), "font")) {
			switch (text.getAttributes().getNamedItem("font").getNodeValue()) {
			case "vector":
				t.setFont(TextFont.VECTOR);
				break;
			case "proportional":
				t.setFont(TextFont.PROPORTIONAL);
				break;
			case "fixed":
				t.setFont(TextFont.FIXED);
				break;
			}
		}
		if (contains(text.getAttributes(), "ratio")) {
			t.setRatio(Integer.valueOf(text.getAttributes().getNamedItem("ratio").getNodeValue()));
		}
		if (contains(text.getAttributes(), "rot")) {
			t.setRot(Integer.valueOf(text.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad wäre "R180"
		}
		if (contains(text.getAttributes(), "align")) {
			switch (text.getAttributes().getNamedItem("align").getNodeValue()) {
			// bottom-left | bottom-center | bottom-right | center-left | center | center-right | top-left | top-center | top-right
			case "bottom-left":
				t.setAlign(Align.BOTTOMLEFT);
				break;
			case "bottom-center":
				t.setAlign(Align.BOTTOMCENTER);
				break;
			case "bottom-right":
				t.setAlign(Align.BOTTOMRIGHT);
				break;
			case "center-left":
				t.setAlign(Align.CENTERLEFT);
				break;
			case "center":
				t.setAlign(Align.CENTER);
				break;
			case "center-right":
				t.setAlign(Align.CENTERRIGHT);
				break;
			case "top-left":
				t.setAlign(Align.TOPLEFT);
				break;
			case "top-center":
				t.setAlign(Align.TOPCENTER);
				break;
			case "top-right":
				t.setAlign(Align.TOPRIGHT);
				break;
			}
		}
		if (contains(text.getAttributes(), "distance")) {
			t.setDistance(Integer.valueOf(text.getAttributes().getNamedItem("distance").getNodeValue()));
		}
		if (text.hasChildNodes()) {
			t.setValue(text.getFirstChild().getNodeValue());
		}
		
		return t;
	}

	private Wire parseWire(Node wire) {
		Wire w = factory.createWire();

		w.setX1(Double.valueOf(wire.getAttributes().getNamedItem("x1").getNodeValue()));
		w.setY1(Double.valueOf(wire.getAttributes().getNamedItem("y1").getNodeValue()));
		w.setX2(Double.valueOf(wire.getAttributes().getNamedItem("x2").getNodeValue()));
		w.setY2(Double.valueOf(wire.getAttributes().getNamedItem("y2").getNodeValue()));
		w.setWidth(Double.valueOf(wire.getAttributes().getNamedItem("width").getNodeValue()));
		w.setLayer(Integer.valueOf(wire.getAttributes().getNamedItem("layer").getNodeValue()));

		if (contains(wire.getAttributes(), "extent")) {
			w.setExtent(wire.getAttributes().getNamedItem("extent").getNodeValue());
		}
		if (contains(wire.getAttributes(), "style")) {
			switch (wire.getAttributes().getNamedItem("style").getNodeValue()) {
			case "continuous":
				w.setStyle(WireStyle.CONTINUOUS);
				break;
			case "longdash":
				w.setStyle(WireStyle.LONGDASH);
				break;
			case "shortdash":
				w.setStyle(WireStyle.SHORTDASH);
				break;
			case "dashdot":
				w.setStyle(WireStyle.DASHDOT);
				break;
			}
		}	
		if (contains(wire.getAttributes(), "curve")) {
			w.setCurve(Double.valueOf(wire.getAttributes().getNamedItem("curve").getNodeValue()));
		}
		if (contains(wire.getAttributes(), "cap")) {
			switch (wire.getAttributes().getNamedItem("cap").getNodeValue()) {
			case "flat":
				w.setCap(WireCap.FLAT);
				break;
			case "round":
				w.setCap(WireCap.ROUND);
				break;
			}
		}
		
		return w;
	}

	private Polygon parsePolygon(Node polygon) {
		Polygon p = factory.createPolygon();
		NodeList polygonList = polygon.getChildNodes();
		
		p.setWidth(Double.valueOf(polygon.getAttributes().getNamedItem("width").getNodeValue()));
		p.setLayer(Integer.valueOf(polygon.getAttributes().getNamedItem("layer").getNodeValue()));
		p.setSpacing(Double.valueOf(polygon.getAttributes().getNamedItem("spacing").getNodeValue()));
		
		switch (polygon.getAttributes().getNamedItem("pour").getNodeValue()) {
		case "solid":
			p.setPour(PolygonPour.SOLID);
			break;
		case "hatch":
			p.setPour(PolygonPour.HATCH);
			break;
		case "cutout":
			p.setPour(PolygonPour.CUTOUT);
			break;
		default:
			break;
		}
		
		p.setIsolate(Double.valueOf(polygon.getAttributes().getNamedItem("isolate").getNodeValue()));

		if (polygon.getAttributes().getNamedItem("orphans").getNodeValue().equals("no")) {
			p.setOrphans(false);
		} else {
			p.setOrphans(true);
		}
		if (polygon.getAttributes().getNamedItem("thermals").getNodeValue().equals("no")) {
			p.setThermals(false);
		} else {
			p.setThermals(true);
		}
		p.setRank(Integer.valueOf(polygon.getAttributes().getNamedItem("rank").getNodeValue()));
		
		for (int i = 0; i < polygonList.getLength(); i++) {
			Node n = polygonList.item(i);
			if (n.getNodeName().equals("vertex")) {
				p.getVertex().add(parseVertex(n));
			}
		}
		return p;
	}

	private Vertex parseVertex(Node vertex) {
		Vertex v = factory.createVertex();
		v.setX(Double.valueOf(vertex.getAttributes().getNamedItem("x").getNodeValue()));
		v.setY(Double.valueOf(vertex.getAttributes().getNamedItem("y").getNodeValue()));
		v.setCurve(Double.valueOf(vertex.getAttributes().getNamedItem("curve").getNodeValue()));
		return v;
	}

	private Description parseDescription(Node description) {
		Description d = factory.createDescription();
		d.setLanguage(description.getAttributes().getNamedItem("language").getNodeValue());
		d.setValue(description.getFirstChild().getNodeValue());
		return d;
	}

	private Layers parseLayers() {
		Layers ls = factory.createLayers();
		Node layers = doc.getDocumentElement().getElementsByTagName("layers").item(0);
		
		NodeList layersList = layers.getChildNodes();

		for (int i = 0; i < layersList.getLength(); i++) {
			Node n = layersList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				Layer l = factory.createLayer();
				l.setNumber(Integer.valueOf(n.getAttributes().getNamedItem("number").getNodeValue()));
				l.setName(n.getAttributes().getNamedItem("name").getNodeValue());
				l.setColor(Integer.valueOf(n.getAttributes().getNamedItem("color").getNodeValue()));
				l.setFill(Integer.valueOf(n.getAttributes().getNamedItem("fill").getNodeValue()));
				if (contains(n.getAttributes(), "visible")) {
					if (n.getAttributes().getNamedItem("visible").getNodeValue().equals("no")) {
						l.setVisible(false);
					} else {
						l.setVisible(true);
					}
				}
				if (contains(n.getAttributes(), "active")) {
					if (n.getAttributes().getNamedItem("active").getNodeValue().equals("no")) {
						l.setActive(false);
					} else {
						l.setActive(true);
					}
				}
				ls.getLayers().add(l);
			}
		}
		return ls;
	}
	
	private Grid parseGrid() {
		Grid g = factory.createGrid();
		
		Node grid = doc.getDocumentElement().getElementsByTagName("grid").item(0);
		
		g.setDistance(Double.valueOf(grid.getAttributes().getNamedItem("distance").getNodeValue()));
		
		switch (grid.getAttributes().getNamedItem("unitdist").getNodeValue().toString()) {
		case "mic":
			g.setUnitdist(GridUnit.MIC);
			break;
		case "mm":
			g.setUnitdist(GridUnit.MM);
			break;
		case "mil":
			g.setUnitdist(GridUnit.MIL);
			break;
		case "inch":
			g.setUnitdist(GridUnit.INCH);
			break;
		}
		
		switch (grid.getAttributes().getNamedItem("unit").getNodeValue().toString()) {
		case "mic":
			g.setUnit(GridUnit.MIC);
			break;
		case "mm":
			g.setUnit(GridUnit.MM);
			break;
		case "mil":
			g.setUnit(GridUnit.MIL);
			break;
		case "inch":
			g.setUnit(GridUnit.INCH);
			break;
		}
		
		switch (grid.getAttributes().getNamedItem("style").getNodeValue().toString()) {
		case "lines":
			g.setStyle(GridStyle.LINES);
			break;
		case "dots":
			g.setStyle(GridStyle.DOTS);
			break;
		}
		
		g.setMultiple(Integer.valueOf(grid.getAttributes().getNamedItem("multiple").getNodeValue()));
		
		if (grid.getAttributes().getNamedItem("display").getNodeValue().equals("no")) {
			g.setDisplay(false);
		} else {
			g.setDisplay(true);
		}
		
		g.setAltdistance(Double.valueOf(grid.getAttributes().getNamedItem("altdistance").getNodeValue()));
		
		switch (grid.getAttributes().getNamedItem("altunitdist").getNodeValue().toString()) {
		case "mic":
			g.setAltunitdist(GridUnit.MIC);
			break;
		case "mm":
			g.setAltunitdist(GridUnit.MM);
			break;
		case "mil":
			g.setAltunitdist(GridUnit.MIL);
			break;
		case "inch":
			g.setAltunitdist(GridUnit.INCH);
			break;
		}
		
		switch (grid.getAttributes().getNamedItem("altunit").getNodeValue().toString()) {
		case "mic":
			g.setAltunit(GridUnit.MIC);
			break;
		case "mm":
			g.setAltunit(GridUnit.MM);
			break;
		case "mil":
			g.setAltunit(GridUnit.MIL);
			break;
		case "inch":
			g.setAltunit(GridUnit.INCH);
			break;
		}
		return g;
	}
	
	
	private Settings parseSettings() {
		Settings sets = factory.createSettings();
		
//		Node settings = doc.getDocumentElement().getElementsByTagName("settings").item(0);
		NodeList settingsList = doc.getDocumentElement().getElementsByTagName("settings").item(0).getChildNodes();

		Setting set = factory.createSetting();
		for (int i = 0; i < settingsList.getLength(); i++) {
			
			Node n = settingsList.item(i);
			
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				if (n.getAttributes().item(0).getNodeName().equals("alwaysvectorfont")) {
					if (n.getAttributes().getNamedItem("alwaysvectorfont").getTextContent().equals("no")) {
						set.setAlwaysvectorfont(false);
					} else {
						set.setAlwaysvectorfont(true);
					}
				} else if (n.getAttributes().item(0).getNodeName().equals("verticaltext")) {
					if (n.getAttributes().getNamedItem("verticaltext").getTextContent().equals("up")) {
						set.setVerticaltext(VerticalText.UP);
					} else {
						set.setVerticaltext(VerticalText.DOWN);
					}
				}
			}
			
		}
		/*
		 *  usually two entities setting: alwaysvectorfont, verticaltext
		 *  combined together because there is only need of these two values
		 */
		sets.getSettings().add(set);
		return sets;
	}
	
	private Compatibility parseCompatibility() {
		Compatibility c = factory.createCompatibility();
		Node compatibility = doc.getDocumentElement().getElementsByTagName("compatibility").item(0);
		NodeList compatibilityList = compatibility.getChildNodes();

		
		for (int i = 0; i < compatibilityList.getLength(); i++) {
			Node n = compatibilityList.item(i);
			if (n.getNodeName().startsWith("#")) {
				continue;
			} else {
				Note note = factory.createNote();
				note.setVersion(n.getAttributes().getNamedItem("version").getNodeValue());
				switch(n.getAttributes().getNamedItem("severity").getNodeValue()) {
				case "info":
					note.setSeverity(Severity.INFO);
					break;
				case "warning":
					note.setSeverity(Severity.WARNING);
					break;
				case "error":
					note.setSeverity(Severity.ERROR);
					break;
				}
				note.setValue(n.getFirstChild().getNodeValue());
				c.getNote().add(note);
			}
		}
		return c;
	}
	
	private void saveModel(Eagle eag) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("eaglemodel", new XMIResourceFactoryImpl());
		
		
		ResourceSet resSet = new ResourceSetImpl();
		

        
        path = path.replace("\\", "/"); 
        
        Resource resource = resSet.createResource(URI.createFileURI(path));
        resource.getContents().add(eag);
		
        try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private boolean contains(NamedNodeMap list, String str) {
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getNodeName().equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean contains(NodeList list, String str) {
		if (getChildNodesNames(list).contains(str)) {
			return true;
		} else {
			return false;
		}
	}
	
	private ArrayList<String> getChildNodesNames(NodeList list) {
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < list.getLength(); i++) {
			String s = list.item(i).getNodeName();
			if (s.startsWith("#")) {
				continue;
			} else {
				strList.add(s);
			}
		}
		return strList;
	}
	
//	private void printAllNodes(NodeList list) {
//		for (String s : getChildNodesNames(list)) {
//			System.out.println(s);
//		}
//	}
//	
//	
//	private void printAllAttributes(Node n) {
//		NamedNodeMap list = n.getAttributes();
//		for (int i = 0; i < list.getLength(); i++) {
//			System.out.println(list.item(i).getNodeName());
//		}
//	}
	

	public static void main(String[] args) {
		try {
			XmlToEaglemodel x = new XmlToEaglemodel();
			x.parseXmlToEaglemodel();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
