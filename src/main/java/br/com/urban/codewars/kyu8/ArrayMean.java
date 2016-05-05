package br.com.urban.codewars.kyu8;

import java.util.stream.IntStream;

public class ArrayMean {

	public static int findAverage(int[] nums) {
		return (int) IntStream.of(nums).average().getAsDouble();
	}

}
