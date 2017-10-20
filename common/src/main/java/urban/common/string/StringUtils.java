package urban.common.string;

import java.util.*;

public class StringUtils {

    /**
     * Solution: This is a modified version of binary search. At each iteration, we go right if the item we're looking at is greater than the first item and we go left if the item we're looking at is less than the first item.
     * <p>
     * We keep track of the lower and upper bounds on the rotation point, calling them floorIndex and ceilingIndex (initially we called them "floor" and "ceiling," but because we didn't imply the type in the name we got confused and created bugs). When floorIndex and ceilingIndex are directly next to each other, we know the floor is the last item we added before starting from the beginning of the dictionary, and the ceiling is the first item we added after..
     * <p>
     * Complexity: O(lg n) time and O(1) space, just like binary search.
     *
     * @param words the words
     * @return the index of rotation point
     */
    public static int findRotationPoint(String[] words) {
        final String firstWord = words[0];

        int floorIndex = 0;
        int ceilingIndex = words.length - 1;

        while (floorIndex < ceilingIndex) {

            // guess a point halfway between floor and ceiling
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);

            // if guess comes after first word or is the first word
            if (words[guessIndex].compareTo(firstWord) >= 0) {
                // go right
                floorIndex = guessIndex;
            } else {
                // go left
                ceilingIndex = guessIndex;
            }

            // if floor and ceiling have converged
            if (floorIndex + 1 == ceilingIndex) {

                // between floor and ceiling is where we flipped to the beginning
                // so ceiling is alphabetically first
                break;
            }
        }

        return ceilingIndex;
    }

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

    /**
     * The approach is to check that each character appears an even number of times, allowing for only one characters to appear an odd number of times (a middle character). This is enough to determine if a permutation of the input string is a palindrome.
     * <p>
     * Complexity: O(n) time, since we're making one iteration through the n characters in the string.
     * Our unpairedCharacters hash set is the only thing taking up non-constant space. We could say our space cost is O(n) as well, since the set of unique characters is less than or equal to n.
     *
     * @param theString the string to check
     * @return true if there is a palindrome permutation
     */
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

    /**
     * Simply making sure each opener has a corresponding closer is not enough—we must also confirm that they are correctly ordered.
     * <p>
     * Solution: We iterate through our string, making sure that:
     * 1. each closer corresponds to the most recently seen, unclosed opener;
     * 2. every opener and closer is in a pair.
     * <p>
     * We use a stack to keep track of the most recently seen, unclosed opener. And if the stack is ever empty when we come to a closer, we know that closer doesn't have an opener.
     * <p>
     * Complexity: O(n) time (one iteration through the string), and O(n) space (in the worst case, all of our characters are openers, so we push them all onto the stack)
     *
     * @param code the code
     * @return true if is valid, false otherwise
     */
    public static boolean bracketValidator(String code) {
        Map<Character, Character> openersToClosers = new HashMap<>();
        openersToClosers.put('(', ')');
        openersToClosers.put('[', ']');
        openersToClosers.put('{', '}');

        Set<Character> openers = openersToClosers.keySet();
        Set<Character> closers = new HashSet<>(openersToClosers.values());

        Stack<Character> openersStack = new Stack<>();

        for (char c : code.toCharArray()) {
            if (openers.contains(c)) {
                openersStack.push(c);
            } else if (closers.contains(c)) {
                if (openersStack.empty()) {
                    return false;
                } else {
                    char lastUnclosedOpener = openersStack.pop();

                    // if this closer doesn't correspond to the most recently
                    // seen unclosed opener, short-circuit, returning false
                    if (openersToClosers.get(lastUnclosedOpener) != c) {
                        return false;
                    }
                }
            }
        }
        return openersStack.empty();
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

    /**
     * Takes a string message and reverses the order of the words in-place.
     * <p>
     * Solution: We'll write a helper function reverseCharacters() that reverses all the characters in a string between a frontIndex and backIndex. We use it to:
     * <p>
     * 1. Reverse all the characters in the entire message, giving us the correct word order but with each word backwards.
     * 2. Reverse the characters in each individual word.
     * <p>
     * Complexity: O(n) time and O(n) space
     *
     * @param message some message
     * @return the message reversed
     */
    public static String reverseWords(String message) {
        char[] messageChars = message.toCharArray();

        // first we reverse all the characters in the entire messageChars array
        // this gives us the right word order
        // but with each word backwards
        reverseCharacters(messageChars, 0, messageChars.length - 1);

        // now we'll make the words forward again
        // by reversing each word's characters

        // we hold the index of the *start* of the current word
        // as we look for the *end* of the current word
        int currentWordStartIndex = 0;
        for (int i = 0; i <= messageChars.length; i++) {

            // found the end of the current word!
            if (i == messageChars.length || messageChars[i] == ' ') {

                // if we haven't exhausted the string, our
                // next word's start is one character ahead
                reverseCharacters(messageChars, currentWordStartIndex, i - 1);
                currentWordStartIndex = i + 1;
            }
        }

        return new String(messageChars);
    }

    private static void reverseCharacters(final char[] messageChars, final int startIndex, final int endIndex) {
        int startIndexCopy = startIndex;
        int endIndexCopy = endIndex;

        // walk towards the middle, from both sides
        while (startIndexCopy < endIndexCopy) {
            // swap the front char and back char
            char temp = messageChars[startIndexCopy];
            messageChars[startIndexCopy] = messageChars[endIndexCopy];
            messageChars[endIndexCopy] = temp;
            startIndexCopy++;
            endIndexCopy--;
        }
    }
}
