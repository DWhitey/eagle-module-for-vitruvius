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

public class TransformationTest {

	public void test() {
		EaglemodelPackage.eINSTANCE.eClass();
		EaglemodelFactory factory = EaglemodelFactory.eINSTANCE;
		
		Eagle eag = factory.createEagle();
		
		Compatibility c = factory.createCompatibility();
		
		Note n = factory.createNote();
		Note n2 = factory.createNote();
		n.setVersion("1.0");
		n.setSeverity(Severity.INFO);
		n.setValue("Wert meiner Notiz");
		
		c.getNote().add(n);
		
		n2.setVersion("2.0");
		n2.setSeverity(Severity.INFO);
		n2.setValue("Wert meiner Notiz");
		c.getNote().add(n2);
		
		eag.setCompatibility(c);
		eag.setVersion("1.0");
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("eaglemodel", new XMIResourceFactoryImpl());
		
		
		ResourceSet resSet = new ResourceSetImpl();
		
		//Laptop
//        String path = "C:\\Users\\Daniel\\Documents\\runtime-EclipseApplication\\TransformationTest\\MyModel.eaglemodel";
		//Desktop PC
        String path = "C:\\Users\\Daniel\\Documents\\Programmieren\\runtime-EclipseApplication\\Test\\MyModel.eaglemodel";
        
        path = path.replace("\\", "/"); 
        
        Resource resource = resSet.createResource(URI.createFileURI(path));
        resource.getContents().add(eag);
		
        try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TransformationTest t = new TransformationTest();
		t.test();
	}

}
