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
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
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
		return drawing;
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
