package demo;

import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import comparator.Comparator;
import transformation.EaglemodelToXml;
import transformation.XmlToEaglemodel;

public class Demo {

	private void parseXMLToEaglemodel() {
//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand mit compatibility.sch";	// mit compatibility
//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand2.sch";	// normal mit kopiertem transistor	(Compare 2)
//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand3.sch";	// normal mit kopiertem transistor und uid

//		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "nand.sch";				// normal
		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/transformation/" + "MyModelTransformed.sch";	// .sch -> eaglemodel -> .sch
		
//		String modelPath = "C:\\Users\\Daniel\\Documents\\runtime-EclipseApplication\\TransformationTest";					//Laptop
		String modelPath = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest";	//Desktop PC
		
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
		String modelPath = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\TransformationTest\\MyModel.eaglemodel";					// Desktop PC
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
			Comparator c = new Comparator(model1, model2);
			c.compare();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Demo d = new Demo();
		
		d.parseXMLToEaglemodel();
		
//		d.parseEaglemodelToXML();
		
//		d.compare();
	}

}
