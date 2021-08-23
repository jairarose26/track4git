package org.ssglobal.training.codes;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class TestFunList {

	private FunList funlist;
	
	@BeforeEach
	public void setup() {
		System.out.println("Initialization");
		funlist = new FunList("test/config/myfile.txt");
	}
	
	/* Sunny Day Testing */	
	@Test
	public void testCountEqualValue() {	// Something wrong with algo
		long count = funlist.countWords();
		System.out.println(count);
		Assertions.assertEquals(5, count);		
	}
	
	@Test
	public void testCountNonNegativeFile1() {
		long count = funlist.countWords();
		System.out.println(count);
		Assertions.assertTrue( count > 0 );		
	}
	
	@Test
	public void testCountNonNegativeFile2() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		System.out.println(count);
		Assertions.assertEquals(0, count);	
		funList = null;
	}
	
	@Test
	public void testContentListNotNull() {
		List<String> temp = funlist.getContentList();
		Assertions.assertNotNull(temp);
	}
	
	// Best for Enum, constants object, or pointers pointing to one object
	@Disabled
	@Test
	public void testSameContentArrays() {		
		//String[] content = {"Hi", "Jai!", "I", "love", "Java!"};
		
		Assertions.assertDoesNotThrow( () -> {
			String[] content = {"Hi Jai!", "I love Java!"};
			String[] temp = funlist.getContentArray();
			Assertions.assertSame(content, temp); // Fail cause pointer doed not the same
		} );
	}
	
	@Test
	public void testSameContentArraysValues() {
		Assertions.assertDoesNotThrow( () -> {
			String[] content = {"Hi Jai!", "I love Java!"};
			String[] temp = funlist.getContentArrayFixed();
			Assertions.assertArrayEquals(content, temp);
		} );	
	}
	
	/* Rainy Day Testing */
	@Test
	public void testSameContentArraysRainy() {		
		Assertions.assertThrows( ClassCastException.class, () -> {
			String[] content = {"Hi Jai!", "I love Java!"};
			String[] temp = funlist.getContentArray();
			Assertions.assertSame(content, temp); // Fail cause pointer doed not the same
		} );
	}	
	
	@Test
	public void testCountNonNegativeFile1Rainy() {
		long count = funlist.countWords();
		System.out.println(count);
		Assertions.assertFalse( count <= 0 );		
	}
	
	@Test
	public void testCountNonNegativeFile2Rainy() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		System.out.println(count);
		Assertions.assertNotEquals(6, count);	
		funList = null;
	}		
	
	// Void Methods
	@Test
	public void testDisplay() {
		Assertions.assertTimeout(Duration.ofSeconds(2), () -> {
			funlist.showLines();
		});
	}
	
	@AfterEach
	public void testdown() {
		System.out.println("Destroyer\n");
	}
	
	
}


