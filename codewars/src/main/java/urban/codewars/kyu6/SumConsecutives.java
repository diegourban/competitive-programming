package urban.codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

public class SumConsecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> result = new ArrayList<>();

        int checker = s.get(0);
        int sum = 0;

        for (int i : s) {
            if (i == checker) {
                sum += i;
            } else {
                result.add(sum);
                checker = i;
                sum = i;
            }
        }

        result.add(sum);

        return result;
    }
}
