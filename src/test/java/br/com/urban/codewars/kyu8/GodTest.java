package br.com.urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

public class GodTest {
	
	@Test
	public void deveInstanciar() {
		God instance = new God();
		Assert.assertNotNull(instance);
	}

	@Test
	public void makingAdam() {
		//Human[] paradise = God.create();
		//assertEquals("Adam are a man", true, paradise[0] instanceof Man);
	}

}
