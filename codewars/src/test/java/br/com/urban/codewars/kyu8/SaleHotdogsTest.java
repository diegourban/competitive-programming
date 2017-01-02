package br.com.urban.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SaleHotdogsTest {

	@Test
	public void deveInstanciar() {
		assertNotNull(new SaleHotdogs());
	}
	
	@Test
	public void deveCalcularZero() {
		assertEquals(0, SaleHotdogs.saleHotdogs(0));
	}
	
	@Test
	public void deveCalcularMenorQueCinco() {
		assertEquals(200, SaleHotdogs.saleHotdogs(2));
	}
	
	@Test
	public void deveCalcularQuatro() {
		assertEquals(400, SaleHotdogs.saleHotdogs(4));
	}
	
	@Test
	public void deveCalcularCinco() {
		assertEquals(475, SaleHotdogs.saleHotdogs(5));
	}
	
	@Test
	public void deveCalcularMaiorQueCincoMenorQueDez() {
		assertEquals(570, SaleHotdogs.saleHotdogs(6));
	}
	
	@Test
	public void deveCalcularNove() {
		assertEquals(855, SaleHotdogs.saleHotdogs(9));
	}
	
	@Test
	public void deveCalcularDez() {
		assertEquals(900, SaleHotdogs.saleHotdogs(10));
	}
	
	@Test
	public void deveCalcularOnze() {
		assertEquals(990, SaleHotdogs.saleHotdogs(11));
	}
	
	@Test
	public void deveCalcularMaiorQueDez() {
		assertEquals(2250, SaleHotdogs.saleHotdogs(25));
	}

}
