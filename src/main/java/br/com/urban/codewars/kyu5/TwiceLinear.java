package br.com.urban.codewars.kyu5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * https://www.codewars.com/kata/twice-linear
 */
public class TwiceLinear {

	public static int dblLinear(int n) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		set.add(1);
		for (int i = 0; i <= n * 4; i++) {
			int x = list.get(i);
			int y = y(x);
			int z = z(x);

			if (!set.contains(y)) {
				set.add(y);
				list.add(y);
			}

			if (!set.contains(z)) {
				set.add(z);
				list.add(z);
			}
		}
		Collections.sort(list);
		System.out.println(list);
		return list.get(n);
	}

	private static final int y(int x) {
		return 2 * x + 1;
	}

	private static final int z(int x) {
		return 3 * x + 1;
	}

}
