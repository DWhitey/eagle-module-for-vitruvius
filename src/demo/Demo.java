package demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import comparator.ModelComparator;
import transformation.EaglemodelToXml;
import transformation.XmlToEaglemodel;

public class Demo {

	ArrayList<String> schematicList = new ArrayList<String>();
	
	
	private void parseXMLToEaglemodel() {
//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand mit compatibility.sch";	// mit compatibility
//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand2.sch";	// normal mit kopiertem transistor	(Compare 2)
//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand3.sch";	// normal mit kopiertem transistor und uid

//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand.sch";				// normal
		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/"
				+ "MyModelTransformed.sch"; // .sch -> eaglemodel -> .sch

//		String modelPath = "C:\\Users\\Daniel\\Documents\\runtime-EclipseApplication\\TransformationTest";					//Laptop
		String modelPath = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest"; // Desktop
																															// PC

//		modelPath += "\\Compare1.eaglemodel";
//		modelPath += "\\Compare2.eaglemodel";
		modelPath += "\\MyModel.eaglemodel";
//		modelPath += "\\MyModel2.eaglemodel";

		try {
			XmlToEaglemodel x = new XmlToEaglemodel(schematicPath, modelPath);
			x.parse();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

	private void parseEaglemodelToXML() {
		String modelPath = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest\\MyModel.eaglemodel"; // Desktop
																																				// PC
		String schemanticPath = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest\\MyModelTransformed.sch";

//		String modelPath = "C:\\Users\\Daniel\\Documents\\runtime-EclipseApplication\\TransformationTest\\MyModel.eaglemodel";									// Laptop
//		String schemanticPath = "C:\\Users\\Daniel\\Documents\\runtime-EclipseApplication\\TransformationTest\\MyModelTransformed.sch";

		EaglemodelToXml x = new EaglemodelToXml(modelPath, schemanticPath);
		try {
			x.parse();
		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
	}

	private void compare() {
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\comparator\\Compare1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\comparator\\Compare2.eaglemodel";

		try {
			ModelComparator c = new ModelComparator(model1, model2);
			c.merge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getDiffs() {
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\comparator\\Compare1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\comparator\\Compare2.eaglemodel";

		try {
			ModelComparator c = new ModelComparator(model1, model2);
			c.printDiffs(c.getDiffs());
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void parseMultiple() throws SAXException, IOException, ParserConfigurationException {
		String schematicDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematic\\";
		String modelDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\";
		listFilesForFolder(new File(schematicDirectory));
		for (String fileName : schematicList) {
			if (fileName.equals("eagle.dtd")) {
				continue;
			}
			String modelName = fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicDirectory + fileName, modelDirectory + modelName);
			xe.parse();
//			System.out.println(schematicDirectory + fileName);
//			System.out.println(modelDirectory + modelName);
//			System.out.println();
		}
	}

	private void listFilesForFolder(File folder) {
		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				String name = fileEntry.getName();
				schematicList.add(name);
			}
		}
	}

	public void show() throws SAXException, IOException, ParserConfigurationException {
//		parseXMLToEaglemodel();

//		parseEaglemodelToXML();

//		compare();

//		getDiffs();
		
		parseMultiple();
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		try {
			d.show();
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

}
