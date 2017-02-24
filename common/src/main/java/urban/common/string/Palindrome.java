package urban.common.string;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public static boolean isPalindrome(String theString) {
        if(theString == null || theString.isEmpty()) {
            return false;
        }

        if(theString.length() == 1) {
            return true;
        }

        for(int i = 0; i < theString.length() / 2; i++) {
            char c1 = theString.charAt(i);
            char c2 = theString.charAt(theString.length() - i - 1);
            if(c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasPalindromePermutation(String theString) {
        // track characters we've seen an odd number of times
        Set<Character> unpairedCharacters = new HashSet<Character>();

        for (char c : theString.toCharArray()) {
            if (unpairedCharacters.contains(c)) {
                unpairedCharacters.remove(c);
            } else {
                unpairedCharacters.add(c);
            }
        }

        // the string has a palindrome permutation if it
        // has one or zero characters without a pair
        return unpairedCharacters.size() <= 1;
    }
}
