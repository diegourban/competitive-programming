package br.com.urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
	
	@Test
	public void deveInstanciar() {
		Reverse instance = new Reverse();
		Assert.assertNotNull(instance);
	}

	@Test
    public void testBasicTrue() {
		Reverse instance = new Reverse();
        assertEquals(null, instance.reverse("teste"));
    }
}
