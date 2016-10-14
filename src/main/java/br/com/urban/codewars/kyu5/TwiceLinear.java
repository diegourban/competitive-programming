package br.com.urban.codewars.kyu5;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * https://www.codewars.com/kata/twice-linear
 */
public class TwiceLinear {

    public static int dblLinear(int n) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(1);

        int iterations = 0;

        while (true) {
            int min = set.first();
            set.remove(min);
            set.add(fy(min));
            set.add(fz(min));

            if (iterations == n) {
                return min;
            }
            
            iterations++;
        }
    }

    private static final int fy(int x) {
        return 2 * x + 1;
    }

    private static final int fz(int x) {
        return 3 * x + 1;
    }
}
