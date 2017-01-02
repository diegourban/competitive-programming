package br.com.urban.codewars.kyu8;

public class ArrayMean {

	public static int findAverage(int[] nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum / nums.length;
	}

}
