package comparison;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.compare.*;

public class Test {

//	public Comparison compare() {
//		// Load the two input models
//		ResourceSet resourceSet1 = new ResourceSetImpl();
//		ResourceSet resourceSet2 = new ResourceSetImpl();
//		String xmi1 = "src/test/java/com/equifax/ic/provisioning/service/v1.xmi";
//		String xmi2 = "src/test/java/com/equifax/ic/provisioning/service/v2.xmi";
//		load(xmi1, resourceSet1);
//		load(xmi2, resourceSet2);
//
//		// Configure EMF Compare
//		EMFCompare comparator = EMFCompare.builder().build();
//
//		// Compare the two models
//		IComparisonScope scope = EMFCompare.createDefaultScope(resourceSet1, resourceSet2);
//		return comparator.compare(scope);
//	}
//
//	@Test
//	public void testCompare() {
//		Comparison comparison = compare();
//		List<Diff> differences = comparison.getDifferences();
//
//		for (Diff d : differences) {
//			System.err.println("d.getKind(): " + d.getKind());
//			System.err.println("d.getMatch(): " + d.getMatch());
//			System.err.println("State: " + d.getState());
//		}
//
//		assertSame(Integer.valueOf(12), Integer.valueOf(differences.size()));
//	}

	public static void main(String[] args) {

	}

}
