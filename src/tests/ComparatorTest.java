package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import comparator.Comparator;
import transformation.EaglemodelToXml;
import transformation.XmlToEaglemodel;

class ComparatorTest {
	
	private static String schematicSourceDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematicSource\\";
	private static String schematicDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematic\\";
	private static String modelDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\";
	private static String modelDirectory2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel2\\";
	
	private static ArrayList<String> schematicList = new ArrayList<String>();
	private static ArrayList<String> modelList = new ArrayList<String>();
	private static ArrayList<String> modelList2 = new ArrayList<String>();

	
	@BeforeAll
	static void createAll() throws SAXException, IOException, ParserConfigurationException, InterruptedException, TransformerException {
		createModels();
		transformToSchematic();
		transformFromSchematicToEaglemodel();
	}
	
	
	static void createModels() throws SAXException, IOException, ParserConfigurationException, InterruptedException {
		listFilesForFolder(new File(schematicSourceDirectory));
		for (String fileName : schematicList) {
			String model = modelDirectory + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			modelList.add(model);
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicSourceDirectory + fileName, model);
			xe.parse();
		}
	}
	
	
	static void transformToSchematic() throws ParserConfigurationException, TransformerException {
		for (String fileName : schematicList) {
			String model = modelDirectory + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			EaglemodelToXml xe = new EaglemodelToXml(model, schematicDirectory + fileName);
			xe.parse();
		}
	}
	
	
	static void transformFromSchematicToEaglemodel() throws SAXException, IOException, ParserConfigurationException {
		for (String fileName : schematicList) {
			String model = modelDirectory2 + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			modelList2.add(model);
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicDirectory + fileName, model);
			xe.parse();
		}
	}
	
	
	@Test
	void compareTransformedWithBackFormedModels() throws IOException, InterruptedException {
		boolean hasDifference = false;
		for (int i = 0; i < modelList.size(); i++) {
			Comparator c = new Comparator(modelList.get(i), modelList2.get(i));
			EList<Diff> differences = c.getDiffs();
			if (differences.size() != 0) {
				System.out.println(c.getR1());
				hasDifference = true;
			}
		}
		assertFalse(hasDifference);
	}
	
	
	@Test
	void transformToModel() {
		assertTrue(schematicList.size() == modelList.size());
	}
	
	@Test
	void transformedToModel() {
		assertTrue(schematicList.size() == modelList2.size());
	}
	
	
	@Test
	void testDifferences1() throws IOException, InterruptedException {	// 1 Transistor hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 1);
	}
	
	
	@Test
	void testDifferences2() throws IOException, InterruptedException {	// 1 Transistor + 2 Attribute hinzugefügt --> 3 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 3);
	}
	
	
	@Test
	void testDifferences3() throws IOException, InterruptedException {	// Setting geändert --> 1 Delete, 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 2);
	}
	
	/*
	 * Library nochmal anschauen
	 */
	@Test
	void testDifferences4() throws IOException, InterruptedException {	// Transistorname geändert --> 5 Changes: 1 Library, 1 Part, 3 Segment in Net
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 4);
	}
	
	
	@Test
	void testDifferences5() throws IOException, InterruptedException {	// Text hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 1);
	}
	
	
	@Test
	void testDifferences6() throws IOException, InterruptedException {	// Ganz viel entfernt --> 40 Delete
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 40);
	}
	
	
//	@Test
//	void testCompare1() throws IOException, InterruptedException {	// 1 Transistor hinzugefügt --> 1 Add
//		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.1.eaglemodel";
//		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.2.eaglemodel";
//		Comparator c = new Comparator(model1, model2);
//		c.merge();
//		EList<Diff> differences = c.getDiffs();
//		assertTrue(differences.size() == 0);
//	}
//	
//	
//	@Test
//	void testCompare2() throws IOException, InterruptedException {	// 1 Transistor + 2 Attribute hinzugefügt --> 3 Add
//		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.1.eaglemodel";
//		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.2.eaglemodel";
//		Comparator c = new Comparator(model1, model2);
//		c.merge();
//		EList<Diff> differences = c.getDiffs();
//		assertTrue(differences.size() == 0);
//	}
//	
//	
//	@Test
//	void testCompare3() throws IOException, InterruptedException {	// Setting geändert --> 1 Delete, 1 Add
//		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.1.eaglemodel";
//		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.2.eaglemodel";
//		Comparator c = new Comparator(model1, model2);
//		c.merge();
//		EList<Diff> differences = c.getDiffs();
//		assertTrue(differences.size() == 0);
//	}
//	
//	
//	@Test
//	void testCompare4() throws IOException, InterruptedException {	// Transistorname geändert --> 5 Changes: 1 Library, 1 Part, 3 Segment in Net
//		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.1.eaglemodel";
//		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.2.eaglemodel";
//		Comparator c = new Comparator(model1, model2);
//		c.merge();
//		EList<Diff> differences = c.getDiffs();
//		assertTrue(differences.size() == 0);
//	}
//	
//	
//	@Test
//	void testCompare5() throws IOException, InterruptedException {	// Text hinzugefügt --> 1 Add
//		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.1.eaglemodel";
//		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.2.eaglemodel";
//		Comparator c = new Comparator(model1, model2);
//		c.merge();
//		EList<Diff> differences = c.getDiffs();
//		assertTrue(differences.size() == 0);
//	}
//	
//	
//	@Test
//	void testCompare6() throws IOException, InterruptedException {	// Ganz viel entfernt --> 40 Delete
//		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.1.eaglemodel";
//		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.2.eaglemodel";
//		Comparator c = new Comparator(model1, model2);
//		c.merge();
//		EList<Diff> differences = c.getDiffs();
//		assertTrue(differences.size() == 0);
//	}
	
	
	@AfterAll
	static void deleteModels() {
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
	
	
	@AfterAll
	static void deleteModels2() {
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
	
	
	@AfterAll
	static void deleteSchematics() {
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
