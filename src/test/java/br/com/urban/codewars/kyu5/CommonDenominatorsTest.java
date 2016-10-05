package br.com.urban.codewars.kyu5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommonDenominatorsTest {
	
	@Test
	public void deveInstanciar() {
		assertNotNull(new CommonDenominators());
	}
	
	@Test
	public void teste() {
		assertEquals("(6,12)(4,12)(3,12)", CommonDenominators.convertFrac(new long[][]{{1,2},{1,3},{1,4}}));
	}

}
