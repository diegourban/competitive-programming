package br.com.urban.codewars.kyu7;

import org.junit.Assert;
import org.junit.Test;

public class CinemaTest {
	
	@Test
	public void deveInstanciar() {
		Cinema instance = new Cinema();
		Assert.assertNotNull(instance);
	}
	
	/*
	
	private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");    
        testing(Movie.movie(500, 15, 0.9), 43);
        testing(Movie.movie(100, 10, 0.95), 24);
    }
    */

}
