package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class GodTest {
	
	@Test
	public void deveInstanciar() {
		God instance = new God();
		Assert.assertNotNull(instance);
	}

	@Test
	public void makingAdam() {
		Human[] paradise = God.create();
		assertEquals("Adam is a man", true, paradise[0] instanceof Man);
	}
	
	@Test
	public void makingEve() {
		Human[] paradise = God.create();
		assertEquals("Eve is a woman", true, paradise[1] instanceof Woman);
	}

}
