package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BooleaToStringTest {

	@Test
	public void deveTestarTrue() {
		assertEquals(BooleanToString.convert(true), "true");
	}

	@Test
	public void deveTestarFalse() {
		assertEquals(BooleanToString.convert(false), "false");
	}

}
