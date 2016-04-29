package br.com.urban.codewars.kyu8;

import java.util.Arrays;

public class Haystack {
	
	public static String findNeedle(Object[] haystack) {
	    int index = Arrays.asList(haystack).indexOf("needle");
	    return "found the needle at position " + index;
	  }

}
