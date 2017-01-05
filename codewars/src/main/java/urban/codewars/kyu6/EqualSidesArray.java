package urban.codewars.kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EqualSidesArray {

    public static int findEvenIndex(int[] arr) {
        int index = -1;
        for (int i = 1; i < arr.length; i++) {
            int leftSum = IntStream.of(Arrays.copyOfRange(arr, 0, i)).sum();
            int rightSum = IntStream.of(Arrays.copyOfRange(arr, i + 1, arr.length)).sum();

            if (leftSum == rightSum) {
                return i;
            }
        }
        return index;
    }

}
