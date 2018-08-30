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



public class EaglemodelToXml {
	

	private Document doc;
	private String path = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest\\MyModel.eaglemodel";
	private final File file = new File("C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest\\MyModelTransformed.sch");
	
	
	private void parseEaglemodelToXml() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		doc = dBuilder.newDocument();
		
		Eagle eag = load();
		Element eagle = parseEagle(eag);
		doc.appendChild(eagle);
		
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(file);
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");	// several lines
		transformer.transform(source, result);
	}
	
	
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
				if (!s.getVerticaltext().equals("up")) {
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
			Element attributes = doc.createElement("attributes");
			schematic.appendChild(attributes);
		}
		if (sch.getVariantdefs() != null) {
			Element variantdefs = doc.createElement("variantdefs");
			schematic.appendChild(variantdefs);
			
		}
		if (sch.getClasses() != null) {
			Element classes = doc.createElement("classes");
			schematic.appendChild(classes);
		}
		if (sch.getParts() != null) {
			Element parts = doc.createElement("parts");
			schematic.appendChild(parts);
		}
		if (sch.getSheets() != null) {
			Element sheets = doc.createElement("sheets");
			schematic.appendChild(sheets);
		}
		if (sch.getErrors() != null) {
			Element errors = doc.createElement("errors");
			schematic.appendChild(errors);
		}
		
		return schematic;
	}


	private Node parseLibraries(Libraries ls) {
		Element libraries = doc.createElement("libraries");
		
		for (int i = 0; i < ls.getLibrary().size(); i++) {
			Element library = doc.createElement("library");
			Library l = ls.getLibrary().get(i);
			
			library.setAttribute("name", l.getName());
			library.appendChild(parseDescription(l.getDescription()));
//			library.appendChild(parsePackages(l.getPackages()));
//			library.appendChild(parseSymbols(l.getSymbols()));
//			library.appendChild(parseDevicesets(l.getDevicesets()));
			
			libraries.appendChild(library);
		}
		
		return libraries;
	}


	private Node parseDescription(Description d) {
		Element description = doc.createElement("description");
		if (!d.getLanguage().equals("en")) {
			description.setAttribute("language", d.getLanguage());
		}
		description.appendChild(doc.createTextNode(d.getValue()));
		return description;
	}


	public Eagle load() {
        EaglemodelPackage.eINSTANCE.eClass();

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("eaglemodel", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();

        path = path.replace("\\", "/"); 
        Resource resource = resSet.createResource(URI.createFileURI(path));
        
        try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Eagle eag = (Eagle) resource.getContents().get(0);
        return eag;
    }

	
	public static void main(String[] args) {
		try {
			EaglemodelToXml x = new EaglemodelToXml();
			x.parseEaglemodelToXml();
		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
	}


}
