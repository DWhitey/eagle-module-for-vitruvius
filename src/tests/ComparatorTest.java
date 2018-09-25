package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.junit.jupiter.api.Test;

import comparator.Comparator;

class ComparatorTest {

	
	@Test
	void testDifferences1() throws IOException, InterruptedException {	// 1 Transistor hinzugefügt --> 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare1.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare1.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 1);
	}
	
	
	@Test
	void testDifferences2() throws IOException, InterruptedException {	// 1 Transistor + 2 Attribute hinzugefügt --> 3 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare2.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare2.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 3);
	}
	
	
	@Test
	void testDifferences3() throws IOException, InterruptedException {	// Setting geändert --> 1 Delete, 1 Add
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare3.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare3.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 2);
	}
	
	
	@Test
	void testDifferences4() throws IOException, InterruptedException {	// Transistorname geändert --> 4 Changes: 1 Part, 3 Segment in Net
		String model1 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare4.1.eaglemodel";
		String model2 = Paths.get("").toAbsolutePath().toString() + "\\src\\tests\\eaglemodel\\Compare4.2.eaglemodel";
		Comparator c = new Comparator(model1, model2);
		EList<Diff> differences = c.getDiffs();
		assertTrue(differences.size() == 4);
	}

}
