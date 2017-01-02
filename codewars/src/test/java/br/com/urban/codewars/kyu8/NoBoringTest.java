package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class NoBoringTest {
	
	@Test
	public void deveInstanciar() {
		NoBoring instance = new NoBoring();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveRemoverUmZeroDoFinal() {
		assertEquals(145, NoBoring.noBoringZeros(1450));
	}
	
	@Test
	public void deveRemoverDoisZerosDoFinal() {
		assertEquals(96, NoBoring.noBoringZeros(9600));
	}
	
	@Test
	public void deveRemoverTresZerosDoFinal() {
		assertEquals(123, NoBoring.noBoringZeros(123000));
	}
	
	@Test
	public void deveRemoverTudoZero() {
		assertEquals(0, NoBoring.noBoringZeros(0000));
	}
	
	@Test
	public void deveRemoverUmZeroDoFinalDeNumeroNegativo() {
		assertEquals(-105, NoBoring.noBoringZeros(-1050));
	}
	
	@Test
	public void deveRemoverUmZeroDoFinalBestPractice() {
		assertEquals(115, NoBoring.noBoringZerosBestPractice(1150));
	}
	
	@Test
	public void deveRemoverZerosDoFinalBestPractice() {
		assertEquals(0, NoBoring.noBoringZerosBestPractice(0));
	}

}
