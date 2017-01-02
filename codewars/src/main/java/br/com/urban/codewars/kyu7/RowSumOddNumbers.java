package br.com.urban.codewars.kyu7;

/**
https://www.codewars.com/kata/sum-of-odd-numbers
*/
public class RowSumOddNumbers {

	public static int rowSumOddNumbers(int n) {
		final int offset = ((n * (n + 1)) / 2) - n;
		final int firstNumber = (offset * 2) + 1;
		
		int sum = 0;
		int nextNumber = firstNumber;
		for(int i = 0; i < n; i++) {
			sum += nextNumber;
			nextNumber += 2;
		}
		
		return sum;
		
		//return n * n * n;
	}
}

