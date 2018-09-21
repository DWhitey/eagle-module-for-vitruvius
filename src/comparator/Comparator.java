package comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eaglemodel.Eagle;
import eaglemodel.EaglemodelPackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.*;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.scope.IComparisonScope;


/*
 * Transistor Q5 hinzugefügt (inkl. Diff mergen)
 */
public class Comparator {

	String model1 = "C:\\Users\\Daniel\\git\\Eagle\\src\\comparator\\Compare1.eaglemodel"; // Dektop PC
	String model2 = "C:\\Users\\Daniel\\git\\Eagle\\src\\comparator\\Compare2.eaglemodel";
//	String model1 = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\comparator\\Compare1.eaglemodel";	// Laptop
//	String model2 = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\comparator\\Compare2.eaglemodel";

	public Comparator() {
		Properties prop = new Properties();
		prop.setProperty("log4j.rootLogger", "WARN");
		PropertyConfigurator.configure(prop);
	}

	private EList<Diff> getDiffs(Eagle e1, Eagle e2) throws IOException, InterruptedException {

		// Configure EMF Compare
		EMFCompare comparator = EMFCompare.builder().build();

		// Compare the two models
		@SuppressWarnings("deprecation")
		IComparisonScope scope = EMFCompare.createDefaultScope(e2, e1); // rechts ist Original und links das zu
																		// vergleichende Modell

		Comparison comparison = comparator.compare(scope);

		return comparison.getDifferences();
	}

	private Resource load(String path, ResourceSet resourceSet) throws IOException {
		EaglemodelPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("eaglemodel", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		path = path.replace("\\", "/");
		Resource resource = resSet.createResource(URI.createFileURI(path));

		resource.load(Collections.EMPTY_MAP);

		return resource;
	}

	private void compare() throws IOException, InterruptedException {
		// Load the two input models
		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();

		Resource r1 = load(model1, resourceSet1);
		Resource r2 = load(model2, resourceSet2);

		resourceSet1.getResources().add(r1);
		resourceSet2.getResources().add(r2);

		Eagle e1 = (Eagle) r1.getContents().get(0);
		Eagle e2 = (Eagle) r2.getContents().get(0);

		EList<Diff> differences = getDiffs(e1, e2);

		printDiffs(differences);

		// merge differences
		IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
		IBatchMerger merger = new BatchMerger(mergerRegistry);
		merger.copyAllLeftToRight(differences, new BasicMonitor());

		printDiffs(differences);

		saveModel(e1);
	}

	public void printEObjectList(EList<EObject> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	public void printDiffs(EList<Diff> differences) {
		for (Diff d : differences) {
			System.out.println("Art:    " + d.getKind());
			System.out.println("Match:  " + d.getMatch());
			System.out.println("Status: " + d.getState());
			System.out.println();
			printEObjectList(d.eCrossReferences());
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private void saveModel(Eagle eag) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("eaglemodel", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createFileURI(model1));
		resource.getContents().add(eag);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Comparator c = new Comparator();
			c.compare();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}