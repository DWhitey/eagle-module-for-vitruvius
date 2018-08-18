package transformation;

//import java.io.File;
//import java.io.OutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eaglemodel.*;

public class Test {

	public void test() {
//		EaglemodelFactoryImpl e = new EaglemodelFactoryImpl();
//		Eagle e1 = e1.eINSTANCE.createEagle();
//		Compatibility c = EaglemodelFactoryImpl.eINSTANCE.createCompatibility();
		Compatibility c = EaglemodelFactory.eINSTANCE.createCompatibility();
		Note n = EaglemodelFactory.eINSTANCE.createNote();
		c.getNote().add(n);
		Eagle e = EaglemodelFactory.eINSTANCE.createEagle();
		e.setCompatibility(c);
		Resource r = e.eResource();
//		OutputStream out = File.class.;
//		r.save
		
	}
	
	/*
	 * siehe http://www.vogella.com/tutorials/EclipseEMFPersistence/article.html#example
	 */
	public void test2() {
		EaglemodelPackage.eINSTANCE.eClass();
		EaglemodelFactory factory = EaglemodelFactory.eINSTANCE;
		
		Eagle e = factory.createEagle();
		e.setVersion("2.1");
		
		Compatibility c = factory.createCompatibility();
		
		Note n = factory.createNote();
		Note n1 = factory.createNote();
		n.setVersion("1.0");
		n.setSeverity("SeverityTest");
		n.setValue("Wert meiner Notiz");
		
		c.getNote().add(n);
		n1 = n;
		n1.setVersion("2.0");
		c.getNote().add(n);
		
		e.setCompatibility(c);
		
		Drawing d = factory.createDrawing();
		
		
		e.setDrawing(d);
		
		
		// Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("eaglemodel", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        String path = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\transformation\\MyModel.eaglemodel";
        path = path.replace("\\", "/"); 
        System.out.println(path);
        
        Resource resource = resSet.createResource(URI.createURI(path));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        
//        System.out.println(resource.getURI().toString());
        
        resource = e.eResource();
        resource.getContents().add(e);

        // now save the content.
        try {
//            resource.save(Collections.EMPTY_MAP);
        	resource.save(null);
        } catch (IOException ex) {
        	ex.printStackTrace();
            
        }
	}
	
	public void test3() {
		EaglemodelPackage.eINSTANCE.eClass();
		EaglemodelFactory factory = EaglemodelFactory.eINSTANCE;
		
		Eagle eag = factory.createEagle();
		
		Compatibility c = factory.createCompatibility();
		
		Note n = factory.createNote();
		Note n2 = factory.createNote();
		n.setVersion("1.0");
		n.setSeverity("SeverityTest");
		n.setValue("Wert meiner Notiz");
		
		c.getNote().add(n);
		
		n2.setVersion("2.0");
		n2.setSeverity("SeverityTest");
		n2.setValue("Wert meiner Notiz");
		c.getNote().add(n2);
		
		eag.setCompatibility(c);
		eag.setVersion("1.0");
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("eaglemodel", new XMIResourceFactoryImpl());
		
		
		ResourceSet resSet = new ResourceSetImpl();
        String path = "C:\\Users\\Daniel\\Documents\\Photon Workspace\\Eagle\\src\\transformation\\MyModel.eaglemodel";
        path = path.replace("\\", "/"); 
        
        Resource resource = resSet.createResource(URI.createFileURI(path));
        resource.getContents().add(eag);
		
        try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.test3();
	}

}
