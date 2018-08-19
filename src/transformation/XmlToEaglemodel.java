package transformation;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import eaglemodel.Eagle;
import eaglemodel.EaglemodelFactory;
import eaglemodel.EaglemodelPackage;

import javax.xml.parsers.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlToEaglemodel {

	private File file;

	public XmlToEaglemodel() {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		String fileName = s + "/src/transformation/" + "nand.sch";
		file = new File(fileName);
	}

	private void readXML() throws ParserConfigurationException, SAXException, IOException {

		/*
		 * XML reader for the .sch file
		 */
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
//		NodeList list = doc.getDocumentElement().getChildNodes();
//		for (int i = 0; i < list.getLength(); i++) {
//			System.out.println(list.item(i).getNodeName());
//		}
//         NodeList nList = doc.getElementsByTagName("student");
		
		/*
		 * Start
		 */
		
		
		
		
		
//		System.out.println(doc.getDocumentElement().getAttribute("version"));
//		Node n = doc.getDocumentElement().getAttributeNode("drawing");
		NodeList list = doc.getDocumentElement().getElementsByTagName("drawing").item(0).getChildNodes();
		System.out.println(list.getLength());
		for (int i = 0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getNodeName());
		}
//		System.out.println(list.item(0).getChildNodes().getLength());
		
		
		
		
		
		/*
		 * End
		 */

		/*
		 * Create Eagle-Model
		 */
		EaglemodelPackage.eINSTANCE.eClass();
		EaglemodelFactory factory = EaglemodelFactory.eINSTANCE;

		Eagle eagle = factory.createEagle();
		eagle.setVersion(doc.getDocumentElement().getAttribute("version"));
		NodeList eagleList = doc.getDocumentElement().getChildNodes();
//		for ()
		
	}

	private File getFile() {
		return file;
	}

	public static void main(String[] args) {
		XmlToEaglemodel x = new XmlToEaglemodel();
		try {
			x.readXML();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

}
