package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class YesOrNoTest {

	@Test
	public void deveInstanciar() {
		YesOrNo instance = new YesOrNo();
		Assert.assertNotNull(instance);
	}

	@Test
	public void testRetornarYes() {
		assertEquals("Yes", YesOrNo.boolToWord(true));
	}
	
	@Test
	public void testRetornarNo() {
		assertEquals("No", YesOrNo.boolToWord(false));
	}

}
