package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SlopeTest {
	
	@Test
	public void deveInstanciar() {
		Slope instance = new Slope();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveRetornarUndefined() {
		Slope slope = new Slope();
		assertEquals("undefined", slope.slope(new int[]{-7,2,-7,4}));
	}

}
