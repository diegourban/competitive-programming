package br.com.urban.codewars.kyu7;

public class NumberFun {

	public static long findNextSquare(long sq) {
		long sqrt = (long)(Math.sqrt(sq) + 0.5);
		if(sqrt * sqrt == sq) {
			sqrt++; // the next perfect square
			return sqrt * sqrt;
		}
		return -1;
	}

}
