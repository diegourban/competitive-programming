package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsTest {
	
	@Test
	public void deveInstanciar() {
		RockPaperScissors instance = new RockPaperScissors();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveValidarTesouraPapel() {
		assertEquals("Player 1 won!", RockPaperScissors.rps("scissors","paper"));
	}
	
	@Test
	public void deveValidarTesouraPedra() {
		assertEquals("Player 2 won!", RockPaperScissors.rps("scissors","rock"));
	}
	
	@Test
	public void deveValidarTesouraTesoura() {
		assertEquals("Draw!", RockPaperScissors.rps("scissors","scissors"));
	}
	
	@Test
	public void deveValidarPapelPedra() {
		assertEquals("Player 1 won!", RockPaperScissors.rps("paper","rock"));
	}
	
	@Test
	public void deveValidarPapelTesoura() {
		assertEquals("Player 2 won!", RockPaperScissors.rps("paper","scissors"));
	}
	
	@Test
	public void deveValidarPapelPapel() {
		assertEquals("Draw!", RockPaperScissors.rps("paper","paper"));
	}
	
	@Test
	public void deveValidarPedraTesoura() {
		assertEquals("Player 1 won!", RockPaperScissors.rps("rock","scissors"));
	}
	
	@Test
	public void deveValidarPedraPapel() {
		assertEquals("Player 2 won!", RockPaperScissors.rps("rock","paper"));
	}
	
	@Test
	public void deveValidarPedraPedra() {
		assertEquals("Draw!", RockPaperScissors.rps("rock","rock"));
	}
	
	@Test
	public void deveValidarOpcaoIncorretaPlayer1() {
		assertEquals(null, RockPaperScissors.rps("gelly","rock"));
	}

}
