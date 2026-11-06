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
     * @param text the string to check
     * @return {@code true} if the string is a palindrome; {@code false} otherwise, including for {@code null} and the
     *     empty string
     */
    public static boolean isPalindrome(final String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        if (text.length() == 1) {
            return true;
        }

        for (int i = 0; i < text.length() / 2; i++) {
            final char fromStart = text.charAt(i);
            final char fromEnd = text.charAt(text.length() - i - 1);
            if (fromStart != fromEnd) {
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

        final char[] sortedA = sortedLowerCaseChars(a);
        final char[] sortedB = sortedLowerCaseChars(b);
        return Arrays.equals(sortedA, sortedB);
    }

    private static char[] sortedLowerCaseChars(final String text) {
        final char[] chars = text.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chars); // Dual-Pivot Quicksort, O(n log(n))
        return chars;
    }
}
