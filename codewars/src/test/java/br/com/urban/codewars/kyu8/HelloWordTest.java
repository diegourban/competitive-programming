package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HelloWordTest {
	
	@Test
	public void deveInstanciar() {
		assertNotNull(new HelloWorld());
	}
	
	@Test
    public void testSomething() {
        assertEquals("hello world!", HelloWorld.greet());
    }

}
