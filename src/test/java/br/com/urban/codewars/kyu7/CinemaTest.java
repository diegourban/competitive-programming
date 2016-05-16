package br.com.urban.codewars.kyu7;

import org.junit.Assert;
import org.junit.Test;

public class CinemaTest {
	
	@Test
	public void deveInstanciar() {
		Cinema instance = new Cinema();
		Assert.assertNotNull(instance);
	}

}
