package demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import comparator.ModelComparator;
import eaglemodel.Eagle;
import transformation.EaglemodelToXml;
import transformation.Persisting;
import transformation.XmlToEaglemodel;

public class Demo {

	ArrayList<String> schematicList = new ArrayList<String>();
	
	
	private void parseXMLToEaglemodel() {
		String schematicPath = Paths.get("").toAbsolutePath().toString() + "/src/demo/nand.sch";

		String modelPath = Paths.get("").toAbsolutePath().toString() + "/src/demofiles/MyModel.eaglemodel";	// move to Eclipse instance to see model structure 

		Persisting p = new Persisting();
		
		try {
			XmlToEaglemodel x = new XmlToEaglemodel(schematicPath);
			p.save(x.parse(), modelPath);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

	private void parseEaglemodelToXML() {
		String modelPath = Paths.get("").toAbsolutePath().toString() + "/src/demo/nandmodel.eaglemodel";
		String schemanticPath = Paths.get("").toAbsolutePath().toString() + "/src/demofiles/nandmodelTransformed.sch";

		Persisting p = new Persisting();
		Eagle eag = p.load(modelPath);

		EaglemodelToXml x = new EaglemodelToXml(eag, schemanticPath);
		try {
			x.parse();
		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
	}

	private void merge() {		// Pay Attention! This will overwrite Compare1.eaglemodel
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\demo\\Compare1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\demo\\Compare2.eaglemodel";
		
		Persisting p = new Persisting();
		Eagle e1 = p.load(model1);
		Eagle e2 = p.load(model2);

		try {
			ModelComparator c = new ModelComparator(e1, e2);
			c.merge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getDiffs() {
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\demo\\Compare1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\demo\\Compare2.eaglemodel";

		Persisting p = new Persisting();
		Eagle e1 = p.load(model1);
		Eagle e2 = p.load(model2);
		
		try {
			ModelComparator c = new ModelComparator(e1, e2);
			c.printDiffs(c.getDiffs());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void parseMultiple() throws SAXException, IOException, ParserConfigurationException {
		String schematicDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\schematicSource\\";
		String modelDirectory = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\";
		listFilesForFolder(new File(schematicDirectory));
		Persisting p = new Persisting();
		for (String fileName : schematicList) {
			if (fileName.equals("eagle.dtd")) {
				continue;
			}
			String modelName = fileName.substring(0, fileName.length() - 3) + "eaglemodel";
			XmlToEaglemodel xe = new XmlToEaglemodel(schematicDirectory + fileName);
			p.save(xe.parse(), modelDirectory + modelName);
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
		parseXMLToEaglemodel();

		parseEaglemodelToXML();

//		getDiffs();
		
//		merge();
		
//		parseMultiple();
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
