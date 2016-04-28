package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayPrinterTest {

	@Test
	public void testInteger() {
		Integer[] array = new Integer[] { 2, 4, 5, 2 };
		assertEquals("2,4,5,2", ArrayPrinter.printArray(array));
	}

	@Test
	public void testOtherIntegers() {
		Integer[] array = new Integer[] { 1, 2, 3, 4 };
		assertEquals("1,2,3,4", ArrayPrinter.printArray(array));
	}
	
	@Test
	public void testString() {
		String[] array = new String[] { "a", "b", "c", "d" };
		assertEquals("a,b,c,d", ArrayPrinter.printArray(array));
	}
	
	@Test
	public void testBoolean() {
		Boolean[] array = new Boolean[] { true, false, false, true };
		assertEquals("true,false,false,true", ArrayPrinter.printArray(array));
	}
}
