package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BanjoTest {

	@Test
	public void deveInstanciar() {
		Banjo instance = new Banjo();
		Assert.assertNotNull(instance);
	}
	
	@Test
	public void deveTocarSeIniciaComR() {
		assertEquals("Robson plays banjo", Banjo.areYouPlayingBanjo("Robson"));
	}
	
	@Test
	public void naoDeveTocarSeIniciaComD() {
		assertEquals("Dilma does not play banjo", Banjo.areYouPlayingBanjo("Dilma"));
	}

}
