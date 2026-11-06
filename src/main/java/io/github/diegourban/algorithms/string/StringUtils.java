package io.github.diegourban.algorithms.string;

import java.util.*;

public final class StringUtils {

    private StringUtils() {}

    public static boolean isPalindrome(final String theString) {
        if (theString == null || theString.isEmpty()) {
            return false;
        }

        if (theString.length() == 1) {
            return true;
        }

        for (int i = 0; i < theString.length() / 2; i++) {
            final char c1 = theString.charAt(i);
            final char c2 = theString.charAt(theString.length() - i - 1);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(final String a, final String b) {
        if (a.length() != b.length()) {
            return false;
        }

        final char[] arrA = sort(a);
        final char[] arrB = sort(b);
        return Arrays.equals(arrA, arrB);
    }

    private static char[] sort(final String original) {
        final char[] chars = original.toLowerCase().toCharArray();
        Arrays.sort(chars); // Dual-Pivot Quicksort, O(n log(n))
        return chars;
    }
}
