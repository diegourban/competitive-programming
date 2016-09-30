package br.com.urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RowSumOddNumbersTest {

	@Test
	public void deveInstanciar() {
		RowSumOddNumbers instance = new RowSumOddNumbers();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveCalcularIndice1() {
		assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
	}
	
//	@Test
//	public void deveCalcularIndice2() {
//		assertEquals(8, RowSumOddNumbers.rowSumOddNumbers(2));
//	}
}
