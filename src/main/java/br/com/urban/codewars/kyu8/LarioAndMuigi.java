package br.com.urban.codewars.kyu8;

import java.util.stream.IntStream;

public class LarioAndMuigi {
	public static int[] pipeFix(int[] numbers) {
		if(numbers.length == numbers[numbers.length-1]) {
			return numbers;
		}
		
		return IntStream.rangeClosed(numbers[0], numbers[numbers.length-1]).toArray();
	}
}
