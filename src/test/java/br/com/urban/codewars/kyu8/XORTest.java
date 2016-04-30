package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class XORTest {
	
	@Test
	public void deveInstanciar() {
		XOR instance = new XOR();
		Assert.assertNotNull(instance);
	}

	@Test
	public void deveSemFalseComFalseFalse() {
		assertEquals(false, XOR.xor(false,false));
	}
	
	@Test
	public void deveSemTrueComTrueFalse() {
		assertEquals(true, XOR.xor(true,false));
	}
	
	@Test
	public void deveSerTrueComFalseTrue() {
		assertEquals(true, XOR.xor(false,true));
	}
	
	@Test
	public void deveSerFalseComTrueTrue() {
		assertEquals(false, XOR.xor(true,true));
	}

}
