package comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eaglemodel.Eagle;
import eaglemodel.EaglemodelPackage;

import java.io.IOException;
import java.nio.file.Paths;
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

/**
 * This class compares two models and merges the diffs from the newer model into
 * the original one.
 * 
 * @author Daniel Weiﬂer
 * @version 1.0
 */
public class Comparator {

	private String model1;
	private String model2;

	public Comparator(String modelpath1, String modelpath2) {
		this.model1 = modelpath1;
		this.model2 = modelpath2;

		Properties prop = new Properties();
		prop.setProperty("log4j.rootLogger", "WARN");
		PropertyConfigurator.configure(prop);
	}

	/**
	 * This method compares and merges both models.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
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

	/**
	 * 
	 * @param e1 First model based on metamodel of Eagle
	 * @param e2 Second model based on metamodel of Eagle to compare with
	 * @return Difference between both models
	 * @throws IOException
	 * @throws InterruptedException
	 */
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

	/**
	 * This method loads a model and returns it as resource.
	 * 
	 * @param path        File path of the model
	 * @param resourceSet ResourceSet of the model
	 * @return The model as resource
	 * @throws IOException
	 */
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

	/**
	 * This method persists the given model.
	 * 
	 * @param eag The model to be saved
	 * @throws IOException
	 */
	private void saveModel(Eagle eag) throws IOException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("eaglemodel", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createFileURI(model1));
		resource.getContents().add(eag);

		resource.save(Collections.EMPTY_MAP);
	}

	/**
	 * This method prints all differences in the list.
	 * 
	 * @param differences The differences to print
	 */
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

	/**
	 * This method prints an EObjectList.
	 * 
	 * @param list
	 */
	public void printEObjectList(EList<EObject> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\comparator\\Compare1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\comparator\\Compare2.eaglemodel";

		try {
			Comparator c = new Comparator(model1, model2);
			c.compare();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}