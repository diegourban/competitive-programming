package urban.codewars.kyu5;

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
            final int x = set.first();

            if (iterations == n) {
                return x;
            }

            set.remove(x);
            set.add(2 * x + 1);
            set.add(3 * x + 1);

            iterations++;
        }
    }
    
}
