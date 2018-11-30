package transformation;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import eaglemodel.*;
import eaglemodel.Class;
import eaglemodel.Package;
import eaglemodel.Text;

import javax.xml.parsers.*;

import java.io.*;


/**
 * This class transforms a given schematic into a model-based on the Eagle meta-model.
 * 
 * @author	Daniel Weiﬂer
 * @version	1.0
 *
 */
public class XmlToEaglemodel {

	private final File schematic;
	private Document doc;
	
	private EaglemodelFactory factory = EaglemodelFactory.eINSTANCE;
	private Instances instancesHelpList;
	

	/**
	 * Constructor.
	 * @param schematicPath The path of the given schematic
	 * @param modelPath The path of the model to save at
	 */
	public XmlToEaglemodel(String schematicPath) {
		schematic = new File(schematicPath);
	}

	
	/**
	 * This method creates the necessary document builder and parses the schematic into a model.
	 * @throws SAXException If the reading of the schematic goes wrong
	 * @throws IOException If the reading of the schematic or the saving of the model goes wrong
	 * @throws ParserConfigurationException If the document builder can't be created
	 */
	public Eagle parse() throws SAXException, IOException, ParserConfigurationException {
		// XML reader for the .sch file
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(schematic);
		
		// used for redundancy in Instances and Parts object
		instancesHelpList = parseInstances(doc.getDocumentElement().getElementsByTagName("instances").item(0));
		
		return parseEagle(doc.getDocumentElement());
	}
	
	/**
	 * This method starts parsing the XML based document at the root node.
	 * @param eagle The root node of the document named eagle
	 * @return The model-based element of eagle
	 */
	private Eagle parseEagle(Node eagle) {
		Eagle e = factory.createEagle();
		
		e.setVersion(eagle.getAttributes().getNamedItem("version").getNodeValue());
		
		if (eagle.hasChildNodes()) {
			NodeList eagleList = eagle.getChildNodes();
			
			for (int i = 0; i < eagleList.getLength(); i++) {
				Node n = eagleList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					switch (n.getNodeName()) {
					case "compatibility":
						e.setCompatibility(parseCompatibility(n));
						break;
					case "drawing":
						e.setDrawing(parseDrawing(n));
						break;
					}
				}
			}
		}
		
		return e;
	}
	
	
	/**
	 * This method parses the XML node drawing and its direct children.
	 * @param draw The node to be parsed
	 * @return The model-based element of drawing
	 */
	private Drawing parseDrawing(Node draw) {
		Drawing d = factory.createDrawing();
		
		if (draw.hasChildNodes()) {
			NodeList drawingList = draw.getChildNodes();
			
			for (int i = 0; i < drawingList.getLength(); i++) {
				Node n = drawingList.item(i);
				if (n.getNodeName().startsWith("#")) {
					continue;
				} else {
					switch (n.getNodeName()) {
					case "settings":
						d.setSettings(parseSettings(n));
						break;
					case "grid":
						d.setGrid(parseGrid(n));
						break;
					case "layers":
						d.setLayers(parseLayers(n));
						break;
					case "schematic":
						d.setSchematic(parseSchematic(n));
						break;
					}
				}
			}
		}
		
		return d;
	}
	

	/**
	 * This method parses the XML node schematic and its direct children.
	 * @param schematic The node to be parsed
	 * @return The model-based element of schematic
	 */
	private Schematic parseSchematic(Node schematic) {
		Schematic sch = factory.createSchematic();
		
		
		sch.setXreflabel(schematic.getAttributes().getNamedItem("xreflabel").getNodeValue());
		sch.setXrefpart(schematic.getAttributes().getNamedItem("xrefpart").getNodeValue());
		
		if (schematic.hasChildNodes()) {
			NodeList schematicList = schematic.getChildNodes();
			
			for (int i = 0; i < schematicList.getLength(); i++) {
				Node n = schematicList.item(i);
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
		}
		
		return sch;
	}
	
	/**
	 * This method parses the XML node errors and its direct children.
	 * @param errors The node to be parsed
	 * @return The model-based element of errors
	 */
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

	
	/**
	 * This method parses the XML node approved and its direct children.
	 * @param approved The node to be parsed
	 * @return The model-based element of approved
	 */
	private Approved parseApproved(Node approved) {
		Approved a = factory.createApproved();
		
		a.setHash(approved.getAttributes().getNamedItem("hash").getNodeValue());
		
		return a;
	}

	
	/**
	 * This method parses the XML node sheets and its direct children.
	 * @param sheets The node to be parsed
	 * @return The model-based element of approved
	 */
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

	
	/**
	 * This method parses the XML node sheet and its direct children.
	 * @param sheet The node to be parsed
	 * @return The model-based element of sheet
	 */
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

	
	/**
	 * This method parses the XML node nets and its direct children.
	 * @param nets The node to be parsed
	 * @return The model-based element of nets
	 */
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

	
	/**
	 * This method parses the XML node net and its direct children.
	 * @param net The node to be parsed
	 * @return The model-based element of net
	 */
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

	
	/**
	 * This method parses the XML node busses and its direct children.
	 * @param busses The node to be parsed
	 * @return The model-based element of busses
	 */
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

	
	/**
	 * This method parses the XML node bus and its direct children.
	 * @param bus The node to be parsed
	 * @return The model-based element of bus
	 */
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

	
	/**
	 * This method parses the XML node segment and its direct children.
	 * @param segment The node to be parsed
	 * @return The model-based element of segment
	 */
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
	

	/**
	 * This method parses the XML node label and its direct children.
	 * @param label The node to be parsed
	 * @return The model-based element of label
	 */
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
			l.setRot(Integer.valueOf(label.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
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

	
	/**
	 * This method parses the XML node junction and its direct children.
	 * @param junction The node to be parsed
	 * @return The model-based element of junction
	 */
	private Junction parseJunction(Node junction) {
		Junction j = factory.createJunction();
		
		j.setX(Double.valueOf(junction.getAttributes().getNamedItem("x").getNodeValue()));
		j.setY(Double.valueOf(junction.getAttributes().getNamedItem("y").getNodeValue()));
		
		return j;
	}
	

	/**
	 * This method parses the XML node pinref and its direct children.
	 * @param pinref The node to be parsed
	 * @return The model-based element of pinref
	 */
	private Pinref parsePinref(Node pinref) {
		Pinref p = factory.createPinref();
		
		p.setPart(pinref.getAttributes().getNamedItem("part").getNodeValue());
		p.setGate(pinref.getAttributes().getNamedItem("gate").getNodeValue());
		p.setPin(pinref.getAttributes().getNamedItem("pin").getNodeValue());
		
		return p;
	}

	
	/**
	 * This method parses the XML node instances and its direct children.
	 * @param instances The node to be parsed
	 * @return The model-based element of instances
	 */
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

	
	/**
	 * This method parses the XML node instance and its direct children.
	 * @param instance The node to be parsed
	 * @return The model-based element of instance
	 */
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
			in.setRot(Integer.valueOf(instance.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
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

	
	/**
	 * This method parses the XML node plain and its direct children.
	 * @param plain The node to be parsed
	 * @return The model-based element of plain
	 */
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

	
	/**
	 * This method parses the XML node parts and its direct children.
	 * @param parts The node to be parsed
	 * @return The model-based element of parts
	 */
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

	
	/**
	 * This method parses the XML node parts and its direct children, also it includes all necessary information from the node instances
	 * @param part The node to be parsed
	 * @return The model-based element of parts including the information of instances and a specific UID
	 */
	private Part parsePart(Node part) {
		Part p = factory.createPart();

		p.setName(part.getAttributes().getNamedItem("name").getNodeValue());
		p.setLibrary(part.getAttributes().getNamedItem("library").getNodeValue());
		p.setDeviceset(part.getAttributes().getNamedItem("deviceset").getNodeValue());
		p.setDevice(part.getAttributes().getNamedItem("device").getNodeValue());
		
		if (contains(part.getAttributes(), "technology") && !part.getAttributes().getNamedItem("technology").getNodeValue().equals("")) {
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
//					if (partAttr.getName().equals("UID") && Integer.valueOf(partAttr.getValue()) != 0) {
					if (partAttr.getName().equals("UID")) {
//						System.out.println(partAttr.getValue());
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

	
	/**
	 * This method parses the XML node variant and its direct children.
	 * @param variant The node to be parsed
	 * @return The model-based element of variant
	 */
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
	

	/**
	 * This method parses the XML node classes and its direct children.
	 * @param classes The node to be parsed
	 * @return The model-based element of classes
	 */
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

	
	/**
	 * This method parses the XML node class and its direct children.
	 * @param cla The node to be parsed
	 * @return The model-based element of class
	 */
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

	
	/**
	 * This method parses the XML node clearance and its direct children.
	 * @param clearance The node to be parsed
	 * @return The model-based element of clearance
	 */
	private Clearance parseClearance(Node clearance) {
		Clearance c = factory.createClearance();
		
		c.setClass(Integer.valueOf(clearance.getAttributes().getNamedItem("class").getNodeValue()));
		if (contains(clearance.getAttributes(), "value")) {
			c.setValue(Double.valueOf(clearance.getAttributes().getNamedItem("value").getNodeValue()));
		}
		
		return c;
	}

	
	/**
	 * This method parses the XML node variantdefs and its direct children.
	 * @param variantdefs The node to be parsed
	 * @return The model-based element of variantdefs
	 */
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

	
	/**
	 * This method parses the XML node variantdef and its direct children.
	 * @param variantdef The node to be parsed
	 * @return The model-based element of variantdef
	 */
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

	
	/**
	 * This method parses the XML node attributes and its direct children.
	 * @param attributes The node to be parsed
	 * @return The model-based element of attributes
	 */
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

	
	/**
	 * This method parses the XML node libraries and its direct children.
	 * @param libraries The node to be parsed
	 * @return The model-based element of libraries
	 */
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

	
	/**
	 * This method parses the XML node library and its direct children.
	 * @param library The node to be parsed
	 * @return The model-based element of library
	 */
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

	
	/**
	 * This method parses the XML node devicesets and its direct children.
	 * @param devicesets The node to be parsed
	 * @return The model-based element of devicesets
	 */
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

	
	/**
	 * This method parses the XML node deviceset and its direct children.
	 * @param deviceset The node to be parsed
	 * @return The model-based element of deviceset
	 */
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

	
	/**
	 * This method parses the XML node gates and its direct children.
	 * @param gates The node to be parsed
	 * @return The model-based element of gates
	 */
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

	
	/**
	 * This method parses the XML node gate and its direct children.
	 * @param gate The node to be parsed
	 * @return The model-based element of gate
	 */
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

	
	/**
	 * This method parses the XML node devices and its direct children.
	 * @param devices The node to be parsed
	 * @return The model-based element of devices
	 */
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

	
	/**
	 * This method parses the XML node device and its direct children.
	 * @param device The node to be parsed
	 * @return The model-based element of device
	 */
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

	
	/**
	 * This method parses the XML node technologies and its direct children.
	 * @param technologies The node to be parsed
	 * @return The model-based element of technologies
	 */
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

	
	/**
	 * This method parses the XML node technology and its direct children.
	 * @param technology The node to be parsed
	 * @return The model-based element of technology
	 */
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

	
	/**
	 * This method parses the XML node attribute and its direct children.
	 * @param attribute The node to be parsed
	 * @return The model-based element of attribute
	 */
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
			a.setRot(Integer.valueOf(attribute.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
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

	
	/**
	 * This method parses the XML node connects and its direct children.
	 * @param connects The node to be parsed
	 * @return The model-based element of connects
	 */
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


	/**
	 * This method parses the XML node connect and its direct children.
	 * @param connect The node to be parsed
	 * @return The model-based element of connect
	 */
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

	
	/**
	 * This method parses the XML node symbols and its direct children.
	 * @param symbols The node to be parsed
	 * @return The model-based element of symbols
	 */
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

	
	/**
	 * This method parses the XML node symbol and its direct children.
	 * @param symbol The node to be parsed
	 * @return The model-based element of symbol
	 */
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

	
	/**
	 * This method parses the XML node pin and its direct children.
	 * @param pin The node to be parsed
	 * @return The model-based element of pin
	 */
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
			p.setRot(Integer.valueOf(pin.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
		}
		
		return p;
	}

	
	/**
	 * This method parses the XML node packages and its direct children.
	 * @param packages The node to be parsed
	 * @return The model-based element of packages
	 */
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
	

	/**
	 * This method parses the XML node package and its direct children.
	 * @param pack The node to be parsed
	 * @return The model-based element of package
	 */
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

	
	/**
	 * This method parses the XML node smd and its direct children.
	 * @param smd The node to be parsed
	 * @return The model-based element of smd
	 */
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
			s.setRot(Integer.valueOf(smd.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
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

	
	/**
	 * This method parses the XML node pad and its direct children.
	 * @param pad The node to be parsed
	 * @return The model-based element of pad
	 */
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
			p.setRot(Integer.valueOf(pad.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
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

	
	/**
	 * This method parses the XML node hole and its direct children.
	 * @param hole The node to be parsed
	 * @return The model-based element of hole
	 */
	private Hole parseHole(Node hole) {
		Hole h = factory.createHole();
		
		h.setX(Double.valueOf(hole.getAttributes().getNamedItem("x").getNodeValue()));
		h.setY(Double.valueOf(hole.getAttributes().getNamedItem("y").getNodeValue()));
		h.setDrill(Double.valueOf(hole.getAttributes().getNamedItem("drill").getNodeValue()));
		
		return h;
	}

	
	/**
	 * This method parses the XML node frame and its direct children.
	 * @param frame The node to be parsed
	 * @return The model-based element of frame
	 */
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

	
	/**
	 * This method parses the XML node rectangle and its direct children.
	 * @param rectangle The node to be parsed
	 * @return The model-based element of rectangle
	 */
	private Rectangle parseRectangle(Node rectangle) {
		Rectangle r = factory.createRectangle();
		
		r.setX1(Double.valueOf(rectangle.getAttributes().getNamedItem("x1").getNodeValue()));
		r.setY1(Double.valueOf(rectangle.getAttributes().getNamedItem("y1").getNodeValue()));
		r.setX2(Double.valueOf(rectangle.getAttributes().getNamedItem("x2").getNodeValue()));
		r.setY2(Double.valueOf(rectangle.getAttributes().getNamedItem("y2").getNodeValue()));
		r.setLayer(Integer.valueOf(rectangle.getAttributes().getNamedItem("layer").getNodeValue()));
		
		if (contains(rectangle.getAttributes(), "rot")) {
			r.setRot(Integer.valueOf(rectangle.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
		}
		
		return r;
	}

	
	/**
	 * This method parses the XML node circle and its direct children.
	 * @param circle The node to be parsed
	 * @return The model-based element of circle
	 */
	private Circle parseCircle(Node circle) {
		Circle c = factory.createCircle();
		
		c.setX(Double.valueOf(circle.getAttributes().getNamedItem("x").getNodeValue()));
		c.setY(Double.valueOf(circle.getAttributes().getNamedItem("y").getNodeValue()));
		c.setRadius(Double.valueOf(circle.getAttributes().getNamedItem("radius").getNodeValue()));
		c.setWidth(Double.valueOf(circle.getAttributes().getNamedItem("width").getNodeValue()));
		c.setLayer(Integer.valueOf(circle.getAttributes().getNamedItem("layer").getNodeValue()));
		
		return c;
	}

	
	/**
	 * This method parses the XML node dimension and its direct children.
	 * @param dimension The node to be parsed
	 * @return The model-based element of dimension
	 */
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
		if (contains(dimension.getAttributes(), "width")) {
			d.setWidth(Double.valueOf(dimension.getAttributes().getNamedItem("width").getNodeValue()));
		}
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

	
	/**
	 * This method parses the XML node text and its direct children.
	 * @param text The node to be parsed
	 * @return The model-based element of text
	 */
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
			t.setRot(Integer.valueOf(text.getAttributes().getNamedItem("rot").getNodeValue().substring(1)));	// z.B. Rotation um 180 Grad w‰re "R180"
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

	
	/**
	 * This method parses the XML node wire and its direct children.
	 * @param wire The node to be parsed
	 * @return The model-based element of wire
	 */
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

	
	/**
	 * This method parses the XML node polygon and its direct children.
	 * @param polygon The node to be parsed
	 * @return The model-based element of polygon
	 */
	private Polygon parsePolygon(Node polygon) {
		Polygon p = factory.createPolygon();
		
		p.setWidth(Double.valueOf(polygon.getAttributes().getNamedItem("width").getNodeValue()));
		p.setLayer(Integer.valueOf(polygon.getAttributes().getNamedItem("layer").getNodeValue()));
		if (contains(polygon.getAttributes(), "spacing")) {
			p.setSpacing(Double.valueOf(polygon.getAttributes().getNamedItem("spacing").getNodeValue()));
		}
		
		if (contains(polygon.getAttributes(), "pour")) {
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
		}
		
		if (contains(polygon.getAttributes(), "isolate")) {
			p.setIsolate(Double.valueOf(polygon.getAttributes().getNamedItem("isolate").getNodeValue()));
		}

		if (contains(polygon.getAttributes(), "orphans")) {
			if (polygon.getAttributes().getNamedItem("orphans").getNodeValue().equals("no")) {
				p.setOrphans(false);
			} else {
				p.setOrphans(true);
			}
		}
		if (contains(polygon.getAttributes(), "thermals")) {
			if (polygon.getAttributes().getNamedItem("thermals").getNodeValue().equals("no")) {
				p.setThermals(false);
			} else {
				p.setThermals(true);
			}
		}
		
		if (contains(polygon.getAttributes(), "rank")) {
			p.setRank(Integer.valueOf(polygon.getAttributes().getNamedItem("rank").getNodeValue()));
		}

		if (polygon.hasChildNodes()) {
			NodeList polygonList = polygon.getChildNodes();
			for (int i = 0; i < polygonList.getLength(); i++) {
				Node n = polygonList.item(i);
				if (n.getNodeName().equals("vertex")) {
					p.getVertex().add(parseVertex(n));
				}
			}
		}
		
		return p;
	}

	
	/**
	 * This method parses the XML node vertex and its direct children.
	 * @param vertex The node to be parsed
	 * @return The model-based element of vertex
	 */
	private Vertex parseVertex(Node vertex) {
		Vertex v = factory.createVertex();
		
		v.setX(Double.valueOf(vertex.getAttributes().getNamedItem("x").getNodeValue()));
		v.setY(Double.valueOf(vertex.getAttributes().getNamedItem("y").getNodeValue()));
		if (contains(vertex.getAttributes(), "curve")) {
			v.setCurve(Double.valueOf(vertex.getAttributes().getNamedItem("curve").getNodeValue()));
		}
		
		return v;
	}

	
	/**
	 * This method parses the XML node description and its direct children.
	 * @param description The node to be parsed
	 * @return The model-based element of description
	 */
	private Description parseDescription(Node description) {
		Description d = factory.createDescription();
		
		if (contains(description.getAttributes(), "language")) {
			d.setLanguage(description.getAttributes().getNamedItem("language").getNodeValue());
		}
		d.setValue(description.getFirstChild().getNodeValue());
		
		return d;
	}

	
	/**
	 * This method parses the XML node layers and its direct children.
	 * @param layers The node to be parsed
	 * @return The model-based element of layers
	 */
	private Layers parseLayers(Node layers) {
		Layers ls = factory.createLayers();
		
		if (layers.hasChildNodes()) {
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
		}
		
		return ls;
	}
	
	
	/**
	 * This method parses the XML node grid and its direct children.
	 * @param grid The node to be parsed
	 * @return The model-based element of grid
	 */
	private Grid parseGrid(Node grid) {
		Grid g = factory.createGrid();
		
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
	
	
	/**
	 * This method parses the XML node settings and its direct children.
	 * @param settings The node to be parsed
	 * @return The model-based element of settings
	 */
	private Settings parseSettings(Node settings) {
		Settings sets = factory.createSettings();
		
		if (settings.hasChildNodes()) {
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
		}
		
		return sets;
	}
	
	
	/**
	 * This method parses the XML node compatibility and its direct children.
	 * @param compatibility The node to be parsed
	 * @return The model-based element of compatibility
	 */
	private Compatibility parseCompatibility(Node compatibility) {
		Compatibility c = factory.createCompatibility();

		if (compatibility.hasChildNodes()) {
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
		}
		
		return c;
	}
	
	
	
	/**
	 * This method examines if a given node list contains a specific node with the given name.
	 * @param list The node list
	 * @param name The expected node name
	 * @return true if the list contains the node name, false instead
	 */
	private boolean contains(NamedNodeMap list, String name) {
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getNodeName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	
//	private ArrayList<String> getChildNodesNames(NodeList list) {
//		ArrayList<String> strList = new ArrayList<String>();
//		for (int i = 0; i < list.getLength(); i++) {
//			String s = list.item(i).getNodeName();
//			if (s.startsWith("#")) {
//				continue;
//			} else {
//				strList.add(s);
//			}
//		}
//		return strList;
//	}
//	
//	
//	private boolean contains(NodeList list, String str) {
//		if (getChildNodesNames(list).contains(str)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
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

	
}