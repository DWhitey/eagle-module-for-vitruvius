package comparison2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import eaglemodel.Eagle;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Parts;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.*;
import org.eclipse.emf.compare.scope.IComparisonScope;

/*
 * Transistor Q5 mit 2 Attributen hinzugefügt
 */
public class Test {
	
	private Comparison compare() throws IOException {
	    // Load the two input models
	    ResourceSet resourceSet1 = new ResourceSetImpl();
	    ResourceSet resourceSet2 = new ResourceSetImpl();
		String xmi1 = "C:\\Users\\Daniel\\git\\Eagle\\src\\comparison2\\Compare1.eaglemodel";							// Dektop PC
		String xmi2 = "C:\\Users\\Daniel\\git\\Eagle\\src\\comparison2\\Compare2.eaglemodel";
//		String xmi1 = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\comparison\\Compare1.eaglemodel";	// Laptop
//		String xmi2 = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\comparison\\Compare2.eaglemodel";
	    
		Resource r1 = load(xmi1, resourceSet1);
		Resource r2 = load(xmi2, resourceSet2);
		
//	    resourceSet1.getResources().add(r1);
//	    resourceSet2.getResources().add(r2);
//	    
//		Eagle eag1 = (Eagle) r1.getContents().get(0);
//		Eagle eag2 = (Eagle) r2.getContents().get(0);

	    // Configure EMF Compare
	    EMFCompare comparator = EMFCompare.builder().build();

	    // Compare the two models
	    @SuppressWarnings("deprecation")
		IComparisonScope scope = EMFCompare.createDefaultScope(r2, r1);	// rechts ist Original und links das zu vergleichende Modell
//	    IComparisonScope scope = EMFCompare.createDefaultScope(eag2, eag1);	// rechts ist Original und links das zu vergleichende Modell
	    
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
	public void testCompare() throws IOException {
		Comparison comparison = compare();
		EList<Diff> differences = comparison.getDifferences();

		for (Diff d : differences) {
			System.out.println("Art:    " + d.getKind());
			System.out.println("Match:  " + d.getMatch());
			System.out.println("Status: " + d.getState());
			
			System.out.println();
			System.out.println();
			printEObjectList(d.eCrossReferences());
			
//			System.out.println(d.eCrossReferences().get(2));
			
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
