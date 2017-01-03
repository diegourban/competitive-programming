package urban.codewars.kyu8;

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
		assertEquals("***", RepeatIt.repeatString("*", 3));
	}

	@Test
	public void testHello() {
		assertEquals("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello", RepeatIt.repeatString("Hello", 11));
	}
	
	@Test
	public void testNotAString() {
		assertEquals("Not a string", RepeatIt.repeatString(true, 11));
	}

}
