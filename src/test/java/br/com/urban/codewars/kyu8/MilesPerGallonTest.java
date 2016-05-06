package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MilesPerGallonTest {

	@Test
	public void deveInstanciar() {
		MilesPerGallon instance = new MilesPerGallon();
		Assert.assertNotNull(instance);
	}

	@Test
	public void test1() {
		assertEquals(3.54f, MilesPerGallon.mpgToKPM(10), 0.001f);
	}

	@Test
	public void test2() {
		assertEquals(7.08f, MilesPerGallon.mpgToKPM(20), 0.001f);
	}

	@Test
	public void test3() {
		assertEquals(10.62f, MilesPerGallon.mpgToKPM(30), 0.001f);
	}

}
