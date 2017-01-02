package br.com.urban.codewars.kyu5;

/*
 * https://www.codewars.com/kata/largest-difference-in-increasing-indexes
 */
public class LargestDifference {

	public static int largestDifference(int[] data) {
		int largestDifference = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = data.length - 1; j > i; j--) {
				if (data[j] >= data[i]) {
					int difference = j - i;
					if (difference > largestDifference) {
						largestDifference = difference;
					}
				}
			}
		}
		return largestDifference;
	}

}
