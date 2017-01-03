package urban.codewars.kyu7;

/*
 * https://www.codewars.com/kata/averages-of-numbers
 */
public class AverageOfNumbers {

	public static double[] averages(int[] numbers) {
		if (numbers == null || numbers.length <= 1) {
			return new double[] {};
		}

		double[] averages = new double[numbers.length - 1];
		for (int i = 0; i < numbers.length - 1; i++) {
			averages[i] = (numbers[i] + numbers[i + 1]) / 2.0;
		}
		return averages;
	}
}
