package br.com.urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatItTest {

	@Test
	public void deveInstanciar() {
		RepeatIt instance = new RepeatIt();
		Assert.assertNotNull(instance);
	}

	@Test
	public void testStar() {
		repeatTest("*", 3, "***");
	}

	@Test
	public void testHello() {
		repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
	}
	
	@Test
	public void testNotAString() {
		repeatTest(true, 11, "Not a string");
	}

	public void repeatTest(final Object toRepeat, final int n, final String expected) {
		final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
		assertEquals(testMessage, expected, RepeatIt.repeatString(toRepeat, n));
	}
	
	

}
