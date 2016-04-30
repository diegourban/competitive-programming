package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BonusTest {
	
	@Test
	public void deveInstanciar() {
		Bonus instance = new Bonus();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveGanharBonus() {
		assertEquals("\u00A31000", Bonus.bonusTime(100, true));
	}
	
	@Test
	public void naoDeveGanharBonus() {
		assertEquals("\u00A3200", Bonus.bonusTime(200, false));
	}

}
