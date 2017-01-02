package br.com.urban.codewars.kyu8;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

	public static int[] divisibleBy(int[] numbers, int divider) {
		List<Integer> evens = new ArrayList<>();
		for (int i : numbers) {
			if (i % divider == 0) {
				evens.add(i);
			}
		}
		int[] array = new int[evens.size()];
		for (int i = 0; i < evens.size(); i++) {
			array[i] = evens.get(i);
		}
		return array;
	}

}
