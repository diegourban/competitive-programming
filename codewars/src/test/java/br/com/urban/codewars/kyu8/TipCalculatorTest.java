package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TipCalculatorTest {
	
	@Test
	public void deveInstanciar() {
		TipCalculator instance = new TipCalculator();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveCalcularTerrible() {
		assertEquals(new Integer(0), TipCalculator.calculateTip(30, "Terrible"));
	}
	
	@Test
	public void deveCalcularPoor() {
		assertEquals(new Integer(2), TipCalculator.calculateTip(30, "Poor"));
	}
	
	@Test
	public void deveCalcularGood() {
		assertEquals(new Integer(3), TipCalculator.calculateTip(30, "Good"));
	}
	
	@Test
	public void deveCalcularGreat() {
		assertEquals(new Integer(5), TipCalculator.calculateTip(30, "Great"));
	}
	
	@Test
	public void deveCalcularExcellent() {
		assertEquals(new Integer(6), TipCalculator.calculateTip(30, "Excellent"));
	}
	
	@Test
	public void deveValidarErroRating() {
		assertEquals(null, TipCalculator.calculateTip(30, "nonexciste"));
	}
	
	@Test
	public void deveCalcularGreatComCaseInsensitive() {
		assertEquals(new Integer(5), TipCalculator.calculateTip(30, "GrEaT"));
	}
	
	@Test
	public void deveCalcularGreatDecimal() {
		assertEquals(new Integer(17), TipCalculator.calculateTip(107.65, "Great"));
	}

}
