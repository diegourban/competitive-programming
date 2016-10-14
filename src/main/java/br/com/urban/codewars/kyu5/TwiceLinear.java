package br.com.urban.codewars.kyu5;

import java.util.Set;
import java.util.TreeSet;

/*
 * https://www.codewars.com/kata/twice-linear
 */
public class TwiceLinear {

	public static int dblLinear(int n) {
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		for(int i = 0; i < n; i++) {
			int x = (int) set.toArray()[i];
			set.add(y(x));
			set.add(z(x));
		}
		return (int)set.toArray()[n];
	}
	
	private static final int y(int x) {
		return 2 * x + 1;
	}
	
	private static final int z(int x) {
		return 3 * x + 1;
	}

}
