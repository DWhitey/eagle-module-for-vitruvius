package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;

import comparator.ModelComparator;
import transformation.XmlToEaglemodel;

public class ComparatorTest {
	
	private static String schematicSourceDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematicSource\\";
	private static String modelDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\";
	
	private static ArrayList<String> schematicList = new ArrayList<String>();
	private static ArrayList<String> modelList = new ArrayList<String>();

	
	@BeforeClass
	public static void createAll() throws SAXException, IOException, ParserConfigurationException, InterruptedException, TransformerException {
		createModels();
	}
	
	
	@Test
	public void testTransformation() {
		assertTrue(schematicList.size() == modelList.size());
	}
	
	
	private static void createModels() throws SAXException, IOException, ParserConfigurationException, InterruptedException {
		listFilesForFolder(new File(schematicSourceDirectory));
		for (String fileName : schematicList) {
			String model = modelDirectory + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			modelList.add(model);
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicSourceDirectory + fileName, model);
			xe.parse();
		}
	}
	
	
	@Test
	public void testDifferences1() throws IOException, InterruptedException {	// 1 Transistor hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.2.eaglemodel";
		ModelComparator c = new ModelComparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 1);
	}
	
	
	@Test
	public void testDifferences2() throws IOException, InterruptedException {	// 1 Transistor + 2 Attribute hinzugefügt --> 3 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.2.eaglemodel";
		ModelComparator c = new ModelComparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 3);
	}
	
	
	@Test
	public void testDifferences3() throws IOException, InterruptedException {	// Setting geändert --> 1 Delete, 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.2.eaglemodel";
		ModelComparator c = new ModelComparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 2);
	}
	
	/*
	 * Library nochmal anschauen
	 */
	@Test
	public void testDifferences4() throws IOException, InterruptedException {	// Transistorname geändert --> 5 Changes: 1 Library, 1 Part, 3 Segment in Net
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.2.eaglemodel";
		ModelComparator c = new ModelComparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 4);
	}
	
	
	@Test
	public void testDifferences5() throws IOException, InterruptedException {	// Text hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.2.eaglemodel";
		ModelComparator c = new ModelComparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 1);
	}
	
	
	@Test
	public void testDifferences6() throws IOException, InterruptedException {	// Ganz viel entfernt --> 40 Delete
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.2.eaglemodel";
		ModelComparator c = new ModelComparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 40);
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
