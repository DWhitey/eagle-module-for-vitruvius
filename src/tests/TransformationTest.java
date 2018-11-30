package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.compare.Diff;

//import org.custommonkey.xmlunit.Diff;
//import org.custommonkey.xmlunit.XMLTestCase;
import org.custommonkey.xmlunit.XMLUnit;
import org.eclipse.emf.common.util.EList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import comparator.ModelComparator;
import eaglemodel.Eagle;
import transformation.EaglemodelToXml;
import transformation.Persisting;
import transformation.XmlToEaglemodel;


public class TransformationTest {
	
	private static String schematicSourceDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematicSource\\";
	private static String schematicFormedDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematicFormed\\";
	private static String schematicDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematic\\";
	private static String modelDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\";
	private static String modelDirectory2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel2\\";
	
	private static ArrayList<String> schematicList = new ArrayList<String>();
	private static ArrayList<String> schematicTransformedList = new ArrayList<String>();
	private static ArrayList<String> modelList = new ArrayList<String>();
	private static ArrayList<String> modelList2 = new ArrayList<String>();

	
	@BeforeClass
	public static void createAll() throws SAXException, IOException, ParserConfigurationException, InterruptedException, TransformerException {
		createModels();
		transformToSchematic();
		transformFromSchematicToModel();
		createSchematicFormFromSchematicSource();
	}
	

	private static void createModels() throws SAXException, IOException, ParserConfigurationException, InterruptedException {
		listFilesForFolder(new File(schematicSourceDirectory));
		Persisting p = new Persisting();
		for (String fileName : schematicList) {
			String model = modelDirectory + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			modelList.add(model);
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicSourceDirectory + fileName);
			p.save(xe.parse(), model);
		}
	}
	
	
	private static void transformToSchematic() throws ParserConfigurationException, TransformerException {
		Persisting p = new Persisting();
		for (String fileName : schematicList) {
			String modelPath = modelDirectory + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			Eagle model = p.load(modelPath);
			EaglemodelToXml xe = new EaglemodelToXml(model, schematicDirectory + fileName);
			schematicTransformedList.add(schematicDirectory + fileName);
			xe.parse();
		}
	}
	
	
	private static void transformFromSchematicToModel() throws SAXException, IOException, ParserConfigurationException {
		Persisting p = new Persisting();
		for (String fileName : schematicList) {
			String modelPath = modelDirectory2 + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			modelList2.add(modelPath);
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicDirectory + fileName);
			p.save(xe.parse(), modelPath);;
		}
	}
	
	
	private static void createSchematicFormFromSchematicSource() throws SAXException, IOException, ParserConfigurationException, TransformerException {
		for (String fileName : schematicList) {
			String schematic = schematicSourceDirectory + fileName;
			String schematic2 = schematicFormedDirectory + fileName;
			
			// XML reader for the .sch file
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(schematic);
			doc.getDocumentElement().normalize();
			
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(schematic2);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");	// linesbrakes in xml, not in one single line
			transformer.transform(source, result);
		}
		
		
	}
	
	
	@Test
	public void testDifferenceModelToSchematicToModel() throws IOException, InterruptedException {
		boolean hasDifference = false;
		Persisting p = new Persisting();
		if (modelList.size() == modelList2.size()) {
			for (int i = 0; i < modelList.size(); i++) {
				Eagle e1 = p.load(modelList.get(i));
				Eagle e2 = p.load(modelList2.get(i));
				
				ModelComparator c = new ModelComparator(e1, e2);
				EList<Diff> differences = c.getDiffs();
				if (differences.size() != 0) {
					hasDifference = true;
				}
			}
		} else {
			hasDifference = true;
		}
		assertFalse(hasDifference);
	}
	
	
	@Test
	public void testTransformation() {
		assertTrue(schematicList.size() == modelList.size());
	}
	
	@Test
	public void testTransformationModelToSchematicToModel() {
		assertTrue(schematicList.size() == modelList2.size());
	}
	
	@Test
	public void testSchematic() {
		assertTrue(schematicList.size() == schematicTransformedList.size());
	}
	
	
//	@Test
	public void testCompareSchematicToModelToSchematic() throws ParserConfigurationException, SAXException, IOException {
//		for (int i = 0; i < schematicList.size(); i++) {
//			String schematic1 = schematicSourceDirectory + schematicList.get(i);
//			String schematic2 = schematicTransformedList.get(i);
			String schematic1 = "C:\\Users\\Daniel\\git\\Eagle\\src\\tests\\schematicSource\\compare1.1.sch";
			String schematic2 = "C:\\Users\\Daniel\\git\\Eagle\\src\\tests\\schematic\\compare1.1.sch";
			
			// XML reader for the .sch file
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			dbFactory.setNamespaceAware(true);
			dbFactory.setIgnoringElementContentWhitespace(true);
			dbFactory.setIgnoringComments(true);
			
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc1 = dBuilder.parse(schematic1);
			doc1.getDocumentElement().normalize();
			
			Document doc2 = dBuilder.parse(schematic2);
			doc2.getDocumentElement().normalize();
			
			XMLUnit.setIgnoreWhitespace(true);
			XMLUnit.setIgnoreComments(true);
			XMLUnit.setIgnoreAttributeOrder(true);
			XMLUnit.setIgnoreDiffBetweenTextAndCDATA(true);
			
//			System.out.println(XMLUnit.compareXML(doc1, doc2));
			assertTrue(XMLUnit.compareXML(doc1, doc2).identical());
//		}
	}
	
	
	@AfterClass
	public static void deleteModels() {
		boolean isDeleted = true;
		for (String model : modelList) {
			File f = new File(model);
			if (f.exists()) {
				if (!f.delete()) {
					isDeleted = false;
				}
			}
		}
		assertTrue(isDeleted);
	}
	
	
	@AfterClass
	public static void deleteModels2() {
		boolean isDeleted = true;
		for (String model : modelList2) {
			File f = new File(model);
			if (f.exists()) {
				if (!f.delete()) {
					isDeleted = false;
				}
			}
		}
		assertTrue(isDeleted);
	}
	
	
	@AfterClass
	public static void deleteSchematics() {
		boolean isDeleted = true;
		for (String schematic : schematicList) {
			File f = new File(schematicDirectory + schematic);
			if (f.exists()) {
				if (!f.delete()) {
					isDeleted = false;
				}
			}
		}
		assertTrue(isDeleted);
	}
	
	
	@AfterClass
	public static void deleteSchematics2() {
		boolean isDeleted = true;
		for (String schematic : schematicList) {
			File f = new File(schematicFormedDirectory + schematic);
			if (f.exists()) {
				if (!f.delete()) {
					isDeleted = false;
				}
			}
		}
		assertTrue(isDeleted);
	}
	
	
	private static void listFilesForFolder(File folder) {
		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				String name = fileEntry.getName();
				if (!name.equals("eagle.dtd")) {
					schematicList.add(name);
				}
			}
		}
	}

}
