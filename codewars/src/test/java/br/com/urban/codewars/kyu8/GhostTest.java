package br.com.urban.codewars.kyu8;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GhostTest {
	
	private static final List<String> COLORS = Arrays.asList(new String[]{"white","yellow","purple","red"});
	
	@Test
	public void deveInstanciar() {
		Ghost instance = new Ghost();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveGerarUmaDasCoresPermitidas() {
		Ghost ghost = new Ghost();
		Assert.assertTrue(COLORS.contains(ghost.getColor()));
	}

}
