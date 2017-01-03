package urban.codewars.kyu7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void deveInstanciar() {
		StringUtils instance = new StringUtils();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveTestarLetraComLetraMinuscula() {
		assertTrue(StringUtils.isLetter("s"));
	}
	
	@Test
	public void deveTestarLetraComLetraMaiuscula() {
		assertTrue(StringUtils.isLetter("A"));
	}
	
	@Test
	public void deveTestarLetraComNumero() {
		assertFalse(StringUtils.isLetter("3"));
	}
	
	@Test
	public void deveTestarLetraComLetras() {
		assertFalse(StringUtils.isLetter("ab"));
	}
	
	@Test
	public void deveTestarLetraVazio() {
		assertFalse(StringUtils.isLetter(""));
	}
	
	@Test
	public void deveTestarLetraNull() {
		assertFalse(StringUtils.isLetter(null));
	}
	
	@Test
	public void deveTestarLetraCaracteresEspeciais() {
		assertFalse(StringUtils.isLetter("/"));
	}

}
