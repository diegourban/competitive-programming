package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TransportationTest {
	
	@Test
	public void deveInstanciar() {
		Transportation instance = new Transportation();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveCalcularUmDia() {
		assertEquals(40, Transportation.rentalCarCost(1));
	}
	
	@Test
	public void deveCalcularDoisDias() {
		assertEquals(80, Transportation.rentalCarCost(2));
	}
	
	@Test
	public void deveCalcularTresDias() {
		assertEquals(100, Transportation.rentalCarCost(3));
	}
	
	@Test
	public void deveCalcularQatroDias() {
		assertEquals(140, Transportation.rentalCarCost(4));
	}
	
	@Test
	public void deveCalcularCincoDias() {
		assertEquals(180, Transportation.rentalCarCost(5));
	}
	
	@Test
	public void deveCalcularSeisDias() {
		assertEquals(220, Transportation.rentalCarCost(6));
	}
	
	@Test
	public void deveCalcularSeteDias() {
		assertEquals(230, Transportation.rentalCarCost(7));
	}
	
	@Test
	public void deveCalcularOitoDias() {
		assertEquals(270, Transportation.rentalCarCost(8));
	}
	
	@Test
	public void deveCalcularZeroDias() {
		assertEquals(0, Transportation.rentalCarCost(0));
	}

}
