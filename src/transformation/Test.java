package transformation;

import eaglemodel.Compatibility;
import eaglemodel.Eagle;
import eaglemodel.EaglemodelFactory;
import eaglemodel.Note;

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
		
		
	}
	
	public static void main(String[] args) {
	}

}
