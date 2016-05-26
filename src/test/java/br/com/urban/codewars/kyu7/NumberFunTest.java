package br.com.urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.urban.codewars.kyu8.Number;

public class NumberFunTest {
	
	@Test
	public void deveInstanciar() {
		assertNotNull(new Number());
	}
	
	@Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }
    
    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }
    
    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }

}
