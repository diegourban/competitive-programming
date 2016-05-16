package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class EvenOrOddTest {
	
	@Test
	public void deveInstanciar() {
		EvenOrOdd instance = new EvenOrOdd();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveRetornarEven() {
		assertEquals("Even", EvenOrOdd.even_or_odd(2));
	}
	
	@Test
	public void deveRetornarOdd() {
		assertEquals("Odd", EvenOrOdd.even_or_odd(1));
	}

}
