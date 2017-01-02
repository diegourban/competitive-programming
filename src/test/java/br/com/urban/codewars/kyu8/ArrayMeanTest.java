package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMeanTest {
	
	@Test
	public void deveInstanciar() {
		ArrayMean instance = new ArrayMean();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveEncontrarMediaUmElemento() {
		assertEquals(1, ArrayMean.findAverage(new int[]{1}));
	}
	
	@Test
	public void deveEncontrarMediaQuatroElementos() {
		assertEquals(4, ArrayMean.findAverage(new int[]{1,3,5,7}));
	}
	

}
