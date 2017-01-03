package urban.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TwoPlusTwoTimesTwoProblemTest {
	
	@Test
	public void deveInstanciar() {
		assertNotNull(new TwoPlusTwoTimesTwoProblem());
	}
	
	@Test
	public void deveCalcular() {
		assertEquals(6, TwoPlusTwoTimesTwoProblem.calculate());
	}

}
