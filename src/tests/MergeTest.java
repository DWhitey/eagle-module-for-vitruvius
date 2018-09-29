package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;

import comparator.Comparator;
import transformation.XmlToEaglemodel;

public class MergeTest {
	
	private static String schematicSourceDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematicSource\\";
	private static String modelDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\";
	
	private static ArrayList<String> schematicList = new ArrayList<String>();
	private static ArrayList<String> modelList = new ArrayList<String>();

	
	@BeforeClass
	public static void createModels() throws SAXException, IOException, ParserConfigurationException, InterruptedException {
		listFilesForFolder(new File(schematicSourceDirectory));
		for (String fileName : schematicList) {
			String model = modelDirectory + fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			modelList.add(model);
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicSourceDirectory + fileName, model);
			xe.parse();
		}
	}
	
	
	@Test
	public void transformToModel() {
		assertTrue(schematicList.size() == modelList.size());
	}
	
	
	@Test
	public void testCompare1() throws IOException, InterruptedException {	// 1 Transistor hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare1.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		c.merge();
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 0);
	}
	
	
	@Test
	public void testCompare2() throws IOException, InterruptedException {	// 1 Transistor + 2 Attribute hinzugefügt --> 3 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare2.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		c.merge();
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 0);
	}
	
	
	@Test
	public void testCompare3() throws IOException, InterruptedException {	// Setting geändert --> 1 Delete, 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare3.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		c.merge();
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 0);
	}
	
	
	@Test
	public void testCompare4() throws IOException, InterruptedException {	// Transistorname geändert --> 5 Changes: 1 Library, 1 Part, 3 Segment in Net
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare4.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		c.merge();
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 0);
	}
	
	
	@Test
	public void testCompare5() throws IOException, InterruptedException {	// Text hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare5.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		c.merge();
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 0);
	}
	
	
	@Test
	public void testCompare6() throws IOException, InterruptedException {	// Ganz viel entfernt --> 40 Delete
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\compare6.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		c.merge();
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 0);
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
