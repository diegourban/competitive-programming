package br.com.urban.codewars.kyu8;

import java.util.Arrays;

public class FindMinMax {

	public int min(int[] list) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}

	public int max(int[] list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}

	public int minClever(int[] list) {
		return Arrays.stream(list).min().getAsInt();
	}

	public int maxClever(int[] list) {
		return Arrays.stream(list).max().getAsInt();
	}
	
}
