package urban.codewars.kyu4;

import urban.common.math.Algebra;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * https://www.codewars.com/kata/sum-by-factors
 */
public class SumOfDivided {

    public static String sumOfDivided(int[] list) {
        SortedMap<Integer, Integer> sumOfPrimes = new TreeMap<>();

        for (int number : list) {
            Set<Integer> primeFactors = Algebra.primeFactorsSet(Math.abs(number));
            for (int primeFactor : primeFactors) {
                int count = sumOfPrimes.getOrDefault(primeFactor, 0) + number;
                sumOfPrimes.put(primeFactor, count);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> sumOfPrime : sumOfPrimes.entrySet()) {
            sb.append("(").append(sumOfPrime.getKey()).append(" ").append(sumOfPrime.getValue()).append(")");
        }
        return sb.toString();
    }

}
