package comparison5MergeTest;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EObject.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eaglemodel.Eagle;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Parts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.*;
import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.internal.spec.MatchSpec;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.merge.IMerger.RegistryImpl;
import org.eclipse.emf.compare.merge.ReferenceChangeMerger;
import org.eclipse.emf.compare.rcp.*;
import org.eclipse.emf.compare.scope.IComparisonScope;

import org.eclipse.emf.compare.diff.merge.service.MergeService;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;

import org.eclipse.emf.compare.match.*;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.utils.*;

public class Test {

	Eagle eag1;
	Eagle eag2;

	private Comparison compare() throws IOException, InterruptedException {
		// Load the two input models
		ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
		String xmi1 = "C:\\Users\\Daniel\\git\\Eagle\\src\\comparison5MergeTest\\Compare1.eaglemodel"; // Dektop PC
		String xmi2 = "C:\\Users\\Daniel\\git\\Eagle\\src\\comparison5MergeTest\\Compare2.eaglemodel";
//		String xmi1 = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\comparison\\Compare1.eaglemodel";	// Laptop
//		String xmi2 = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\comparison\\Compare2.eaglemodel";

		Resource r1 = load(xmi1, resourceSet1);
		Resource r2 = load(xmi2, resourceSet2);

		resourceSet1.getResources().add(r1);
		resourceSet2.getResources().add(r2);
//	    
		eag1 = (Eagle) r1.getContents().get(0);
		eag2 = (Eagle) r2.getContents().get(0);

		// Configure EMF Compare
		EMFCompare comparator = EMFCompare.builder().build();

		// Compare the two models
		@SuppressWarnings("deprecation")
		IComparisonScope scope = EMFCompare.createDefaultScope(r2, r1); // rechts ist Original und links das zu
																		// vergleichende Modell

//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//
//		// Matching model elements
//		MatchModel match = MatchService.doMatch(eag1, eag2, m);
////		MatchModel match = MatchService.doMatch(eag1, eag2, Collections.<String, Object> emptyMap());
//		// Computing differences
//		DiffModel diff = DiffService.doDiff(match, false);
//		// Merges all differences from model1 to model2
//		List<DiffElement> differences = new ArrayList<DiffElement>(diff.getOwnedElements());
//		MergeService.merge(differences, true);

		return comparator.compare(scope);
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

	
	
	@SuppressWarnings("deprecation")
	public void testCompare() throws IOException, InterruptedException {
		Comparison comparison = compare();
		EList<Diff> differences = comparison.getDifferences();

		printDifferences(differences);

//		IMerger.Registry mergerRegistry = RegistryImpl.createStandaloneInstance();
//		IBatchMerger merger = new BatchMerger(mergerRegistry);
//		merger.copyAllLeftToRight(differences, new BasicMonitor());

		for (Diff d : differences) {
//			d.copyRightToLeft();	// Änderung wegwerfen
//			d.copyLeftToRight(); 	// von original zu neuerem mergen
			
		}


		
		
		
//		for (Diff d : differences) {
//			MergeService.doMerge(d, true);				// DiffElement
//		}

		
		
		
		
		
		
		
		
		
//		EMFCompareRCPPlugin def = EMFCompareRCPPlugin.getDefault();
//		IMerger.Registry _mergerRegistry = def.getMergerRegistry();
//		final BatchMerger merger = new BatchMerger(_mergerRegistry);
//		BasicMonitor _basicMonitor = new BasicMonitor();
//		merger.copyAllRightToLeft(differences, _basicMonitor);
		
		
		
//		IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
//		IBatchMerger merger = new BatchMerger(mergerRegistry);
//		BasicMonitor _basicMonitor = new BasicMonitor();
//		merger.copyAllRightToLeft(differences, _basicMonitor);
		
		
		
		
		
		// Funktioniert! Aber gleich wie d.copyLeftToRight()
		
//		IMerger.Registry mergerRegistry = IMerger.RegistryImpl.createStandaloneInstance();
//		IBatchMerger merger = new BatchMerger(mergerRegistry);
//		merger.copyAllLeftToRight(differences, new BasicMonitor());

		
		printDifferences(differences);
	}

	public void printDifferences(EList<Diff> differences) {
		for (Diff d : differences) {
			System.out.println("Art:    " + d.getKind());
			System.out.println("Match:  " + d.getMatch());
			System.out.println("Status: " + d.getState());

			System.out.println();
			System.out.println();

			printEObjectList(d.eCrossReferences());
//			printEObjectList(d.eCrossReferences().get(2).eContainingFeature().eContainer().eContents());
//			printEObjectList(d.eCrossReferences().get(2).eContainingFeature().eContents());
//			printEObjectList(d.eCrossReferences().get(2).eContainer().eContents());

			System.out.println();
			System.out.println();

//			printEObjectList(d.eCrossReferences().get(1).eContainer().eCrossReferences());

//			if (d.getKind().getName().equals("DELETE")) {
//				d.copyRightToLeft();
//			}
//			if (d.getKind().getName().equals("ADD")) {
//				d.copyLeftToRight();
//			}
			System.out.println();

			EList<EObject> list = d.eContainer().eContents();
			for (int i = 0; i < list.size(); i++) {
				EObject o = d.eContainer().eContents().get(i);
//				System.out.println(o);
//				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.setProperty("log4j.rootLogger", "WARN");
		PropertyConfigurator.configure(prop);

		try {
			Test t = new Test();
			t.testCompare();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printEObjectList(EList<EObject> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println();
		}
	}

}
