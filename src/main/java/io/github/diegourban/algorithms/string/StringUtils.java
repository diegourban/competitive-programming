package io.github.diegourban.algorithms.string;

import java.util.*;

public class StringUtils {

    public static boolean isPalindrome(String theString) {
        if (theString == null || theString.isEmpty()) {
            return false;
        }

        if (theString.length() == 1) {
            return true;
        }

        for (int i = 0; i < theString.length() / 2; i++) {
            char c1 = theString.charAt(i);
            char c2 = theString.charAt(theString.length() - i - 1);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] arrA = sort(a);
        char[] arrB = sort(b);
        return Arrays.equals(arrA, arrB);
    }

    private static char[] sort(String original) {
        char[] chars = original.toLowerCase().toCharArray();
        Arrays.sort(chars); // Dual-Pivot Quicksort, O(n log(n))
        return chars;
    }
}
