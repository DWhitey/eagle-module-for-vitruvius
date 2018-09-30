package comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

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

/**
 * This class compares two models and merges the diffs from the newer model into
 * the original one.
 * 
 * @author Daniel Weiﬂer
 * @version 1.0
 */
public class ModelComparator {

	private Resource r1;
	private Resource r2;


	/**
	 * Constructor.
	 * @param modelPath The path of the model before the change
	 * @param newerModelPath The path of the changed model
	 * @throws IOException If the loading of the models goes wrong
	 */
	public ModelComparator(String modelPath, String newerModelPath) throws IOException {
		// Load the two input models
		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();

		r1 = load(modelPath, resourceSet1);
		r2 = load(newerModelPath, resourceSet2);

		Properties prop = new Properties();
		prop.setProperty("log4j.rootLogger", "WARN");
		PropertyConfigurator.configure(prop);
	}

	
	/**
	 * This method compares and merges both models.
	 * @throws IOException If the fetching of differences between models or the saving of the original model goes wrong 
	 * @throws InterruptedException If the fetching of differences between models goes wrong
	 */
	public void merge() throws IOException, InterruptedException {

//		resourceSet1.getResources().add(r1);
//		resourceSet2.getResources().add(r2);
//
//		Eagle e1 = (Eagle) r1.getContents().get(0);
//		Eagle e2 = (Eagle) r2.getContents().get(0);
//
//		EList<Diff> differences = getDiffs(e1, e2);
		
		EList<Diff> differences = getDiffs();

		// merge differences
		IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
		IBatchMerger merger = new BatchMerger(mergerRegistry);
		merger.copyAllLeftToRight(differences, new BasicMonitor());

		saveModel(r1);
	}

	
	/**
	 * This method compares two models and returns the differences between both.
	 * @param r1 First model based on meta-model of Eagle
	 * @param r2 Second model based on meta-model of Eagle to compare with
	 * @return Difference between both models
	 * @throws IOException If the the fetching of differences between models goes wrong
	 * @throws InterruptedException If the the fetching of differences between models goes wrong
	 */
	public EList<Diff> getDiffs() throws IOException, InterruptedException {

		EMFCompare comparator = EMFCompare.builder().build();

		@SuppressWarnings("deprecation")
		
		// left: newer and changed model, right: original model
		IComparisonScope scope = EMFCompare.createDefaultScope(r2, r1);

		Comparison comparison = comparator.compare(scope);

		return comparison.getDifferences();
	}

	
	/**
	 * This method loads a model and returns it as resource.
	 * @param path File path of the model
	 * @param resourceSet ResourceSet of the model
	 * @return The model as resource
	 * @throws IOException  If the the loading of the model goes wrong
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
	 * @param resource The model to be saved
	 * @throws IOException If the saving of the model goes wrong
	 */
	private void saveModel(Resource resource) throws IOException {
		resource.save(Collections.EMPTY_MAP);
	}

	/**
	 * Getter.
	 * @return The model
	 */
	public Resource getR1() {
		return r1;
	}


	/**
	 * Getter.
	 * @return The newer model
	 */
	public Resource getR2() {
		return r2;
	}


	/**
	 * This method prints out all differences in the given differences list.
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
	 * @param list The list to print
	 */
	private void printEObjectList(EList<EObject> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	
}