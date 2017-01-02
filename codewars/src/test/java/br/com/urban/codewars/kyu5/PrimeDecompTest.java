package br.com.urban.codewars.kyu5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeDecompTest {

	@Test
	public void deveInstanciar() {
		assertNotNull(new PrimeDecomp());
	}
	
	@Test
	public void deveCalcularDecomposicaoDe2() {
		assertEquals("(2)", PrimeDecomp.factors(2));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe3() {
		assertEquals("(3)", PrimeDecomp.factors(3));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe4() {
		assertEquals("(2**2)", PrimeDecomp.factors(4));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe5() {
		assertEquals("(5)", PrimeDecomp.factors(5));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe6() {
		assertEquals("(2)(3)", PrimeDecomp.factors(6));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe7() {
		assertEquals("(7)", PrimeDecomp.factors(7));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe8() {
		assertEquals("(2**3)", PrimeDecomp.factors(8));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe9() {
		assertEquals("(3**2)", PrimeDecomp.factors(9));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe10() {
		assertEquals("(2)(5)", PrimeDecomp.factors(10));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe11() {
		assertEquals("(11)", PrimeDecomp.factors(11));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe12() {
		assertEquals("(2**2)(3)", PrimeDecomp.factors(12));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe13() {
		assertEquals("(13)", PrimeDecomp.factors(13));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe86240() {
		assertEquals("(2**5)(5)(7**2)(11)", PrimeDecomp.factors(86240));
	}
	
	@Test
	public void deveCalcularDecomposicaoDe7775460() {
		assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(7775460));
	}
}
