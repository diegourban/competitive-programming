package br.com.urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoFightersOneWinnerTest {

	@Test
	public void deveInstanciar() {
		assertNotNull(new TwoFightersOneWinner());
		assertNotNull(new Fighter(null, 0, 0));
	}

	@Test
	public void teste() {
		assertEquals("Lew",
				TwoFightersOneWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
		
		assertEquals("Harry",
				TwoFightersOneWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
		
		assertEquals("Harald",
				TwoFightersOneWinner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
		
		assertEquals("Harald",
				TwoFightersOneWinner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
		
		assertEquals("Harald",
				TwoFightersOneWinner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
		
		assertEquals("Harald", TwoFightersOneWinner.declareWinner(new Fighter("Jerry", 30, 3),
				new Fighter("Harald", 20, 5), "Harald"));
	}
	
	@Test
	public void testeNovo() {	
		assertEquals("Marco",
				TwoFightersOneWinner.declareWinner(new Fighter("Marco", 334, 85), new Fighter("Cuban", 316, 96), "Marco"));
	}

}
