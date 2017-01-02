package br.com.urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxDiffLengthTest {

	@Test
	public void shouldInstantiate() {
		assertNotNull(new MaxDiffLength());
	}
	
	@Test
	public void shouldReturnMinusOneWhenBothArrayAreEmpty() {
		assertEquals(-1, MaxDiffLength.mxdiflg(new String[]{}, new String[]{}));
	}
	
	@Test
	public void shouldReturnMinusOneWhenFirstArrayIsEmpty() {
		assertEquals(-1, MaxDiffLength.mxdiflg(new String[]{}, new String[]{"a"}));
	}
	
	@Test
	public void shouldReturnMinusOneWhenSecondArrayIsEmpty() {
		assertEquals(-1, MaxDiffLength.mxdiflg(new String[]{"a"}, new String[]{}));
	}
	
	@Test
	public void shouldCalculateArraysWithOneElementEachWithSameSize() {
		assertEquals(0, MaxDiffLength.mxdiflg(new String[]{"a"}, new String[]{"b"}));
	}
	
	@Test
	public void fixedTest() {
		String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
	}
	
	@Test
	public void fixedTest2() {
		String[] s1 = new String[]{"a", "aa"};
        String[] s2 = new String[]{"aaaaaaaaaa", "aaaaaaaaaaa"};
        assertEquals(10, MaxDiffLength.mxdiflg(s1, s2)); // 13
	}

}
