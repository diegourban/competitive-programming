package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FormattingTest {
	
	@Test
	public void deveInstanciar() {
		Formatting instance = new Formatting();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveArredondarPraCima() {
		assertEquals(5.56, Formatting.TwoDecimalPlaces(5.5589), 0.0);
	}
	
	@Test
	public void deveArredondarPraBaixo() {
		assertEquals(3.34, Formatting.TwoDecimalPlaces(3.3429), 0.0);
	}

}
