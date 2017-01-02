package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class LeoOscarTest {
	
	@Test
	public void deveInstanciar() {
		LeoOscar instance = new LeoOscar();
		Assert.assertNotNull(instance);
	}
	
	@Test
    public void oscar88() {
        assertEquals("Leo finally won the oscar! Leo is happy", LeoOscar.leo(88));
    }
    
    @Test
    public void oscar86() {
        assertEquals("Not even for Wolf of wallstreet?!", LeoOscar.leo(86));
    }
    
    @Test
    public void below88() {
        assertEquals("When will you give Leo an Oscar?", LeoOscar.leo(87));
        assertEquals("When will you give Leo an Oscar?", LeoOscar.leo(83));
        assertEquals("When will you give Leo an Oscar?", LeoOscar.leo(85));
    }
    
    @Test
    public void over88() {
        assertEquals("Leo got one already!", LeoOscar.leo(89));
        assertEquals("Leo got one already!", LeoOscar.leo(90));
        assertEquals("Leo got one already!", LeoOscar.leo(95));
    }

}
