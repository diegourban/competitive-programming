package utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utils.Numeros;

public class NumerosTest {

	@Test
	public void deveInstanciar() {
		assertNotNull(new Numeros());
	}
	
	@Test
	public void deveVerificarSeEhPrimo() {
		assertTrue(Numeros.isPrime(17));
	}
	
	@Test
	public void deveVerificarSeNaoEhPrimo() {
		assertFalse(Numeros.isPrime(18));
	}

}
