package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

public class DigitizerTest {

	@Test
	public void deveInstanciar() {
		Digitizer instance = new Digitizer();
		Assert.assertNotNull(instance);
	}

	@Test
	public void tests() {
		Assert.assertArrayEquals(new int[] { 1, 3, 2, 5, 3 }, Digitizer.digitize(35231));
	}

}
