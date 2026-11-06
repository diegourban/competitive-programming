package io.github.diegourban.algorithms.string;

import java.util.*;

/**
 * String checks: palindromes and anagrams.
 */
public final class StringUtils {

    private StringUtils() {}

    /**
     * Checks if a string reads the same forwards and backwards.
     * <p>
     * The comparison is exact, character by character: case, spaces and punctuation all count, so {@code "Aba"} is
     * not a palindrome. Runs in O(n) time.
     *
     * @param theString the string to check
     * @return {@code true} if the string is a palindrome; {@code false} otherwise, including for {@code null} and the
     *     empty string
     */
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

    /**
     * Checks if two strings are anagrams: the same characters, each the same number of times, in any order.
     * <p>
     * The comparison ignores case (both strings are lower-cased first, independently of the default locale) but
     * counts spaces and punctuation. Runs in O(n log n) time by sorting the characters of both strings.
     *
     * @param a the first string; must not be {@code null}
     * @param b the second string; must not be {@code null}
     * @return {@code true} if the strings are anagrams of each other, {@code false} otherwise
     * @throws NullPointerException if {@code a} or {@code b} is {@code null}
     */
    public static boolean isAnagram(final String a, final String b) {
        if (a.length() != b.length()) {
            return false;
        }

        final char[] arrA = sort(a);
        final char[] arrB = sort(b);
        return Arrays.equals(arrA, arrB);
    }

    private static char[] sort(final String original) {
        final char[] chars = original.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chars); // Dual-Pivot Quicksort, O(n log(n))
        return chars;
    }
}
