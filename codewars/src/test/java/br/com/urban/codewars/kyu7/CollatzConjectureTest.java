package br.com.urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CollatzConjectureTest {
	
	@Test
	public void deveInstanciar() {
		CollatzConjecture instance = new CollatzConjecture();
		Assert.assertNotNull(instance);
	}
		
	@Test
	public void deveTestarParUnidade() {
		assertEquals(2, CollatzConjecture.conjecture(2));
	}
	
	@Test
	public void deveTestarImparUnidade() {
		assertEquals(8, CollatzConjecture.conjecture(3));
	}
	
	@Test
	public void deveTestarParDezena() {
		assertEquals(19, CollatzConjecture.conjecture(30));
	}
	
	@Test
	public void deveTestarImparDezena() {
		assertEquals(112, CollatzConjecture.conjecture(27));
	}
	
	@Test
	public void deveTestarParCentena() {
		assertEquals(26, CollatzConjecture.conjecture(100));
	}
	
	@Test
	public void deveTestarImparCentena() {
		assertEquals(88, CollatzConjecture.conjecture(103));
	}

}
