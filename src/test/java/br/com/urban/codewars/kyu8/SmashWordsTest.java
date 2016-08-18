package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SmashWordsTest {
	
	@Test
	public void deveInstanciar() {
		SmashWords instance = new SmashWords();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveJuntarDuasPalavras() {
		assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
	}
	
	@Test
	public void deveValidarVazio() {
		assertEquals("", SmashWords.smash(new String[] {}));
	}
	
}
