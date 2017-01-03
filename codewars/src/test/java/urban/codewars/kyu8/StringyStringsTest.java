package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class StringyStringsTest {
	
	@Test
	public void deveInstanciar() {
		StringyStrings instance = new StringyStrings();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveValidarTamanho1() {
		assertEquals("1", StringyStrings.stringy(1));
	}
	
	@Test
	public void deveValidarTamanho2() {
		assertEquals("10", StringyStrings.stringy(2));
	}
	
	@Test
	public void deveValidarTamanho3() {
		assertEquals("101", StringyStrings.stringy(3));
	}
	
	@Test
	public void deveValidarTamanho4() {
		assertEquals("1010", StringyStrings.stringy(4));
	}
	
	@Test
	public void deveValidarTamanho5() {
		assertEquals("10101", StringyStrings.stringy(5));
	}
	
	@Test
	public void deveValidarTamanho10() {
		assertEquals("1010101010", StringyStrings.stringy(10));
	}
	
	@Test
	public void deveValidarTamanho0() {
		assertEquals("", StringyStrings.stringy(0));
	}
	
}
