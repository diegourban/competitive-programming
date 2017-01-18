package urban.codewars.kyu5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrimeDecomp {

    public static String factors(int n) {
        List<Integer> primeFactorsList = primeFactorsList(n);

        Map<Integer, Integer> factorsCount = new LinkedHashMap<>();
        for (Integer i : primeFactorsList) {
            if (factorsCount.containsKey(i)) {
                factorsCount.put(i, factorsCount.get(i) + 1);
            } else {
                factorsCount.put(i, 1);
            }
        }

        StringBuilder builder = new StringBuilder("");

        for (Integer key : factorsCount.keySet()) {
            builder.append("(");
            builder.append(key);
            Integer primeCount = factorsCount.get(key);
            if (primeCount > 1) {
                builder.append("**");
                builder.append(primeCount);
            }
            builder.append(")");
        }

        return builder.toString();
    }

    public static List<Integer> primeFactorsList(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

}
