package urban.common.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Palindrome());
    }

    @Test
    public void shouldConsiderPalindrome() {
        assertTrue(Palindrome.isPalindrome("a"));
        assertTrue(Palindrome.isPalindrome("aa"));
        assertTrue(Palindrome.isPalindrome("aba"));
        assertTrue(Palindrome.isPalindrome("abba"));
        assertTrue(Palindrome.isPalindrome("civic"));
        assertTrue(Palindrome.isPalindrome("iaracarai"));
        assertTrue(Palindrome.isPalindrome("socorrammesubinoonibusemmarrocos"));
    }

    @Test
    public void shouldNotConsiderPalindrome() {
        assertFalse(Palindrome.isPalindrome(null));
        assertFalse(Palindrome.isPalindrome(""));
        assertFalse(Palindrome.isPalindrome("ab"));
        assertFalse(Palindrome.isPalindrome("abb"));
    }

    @Test
    public void shouldConsiderPalindromePermutations() {
        assertTrue(Palindrome.hasPalindromePermutation("a"));
        assertTrue(Palindrome.hasPalindromePermutation("aa"));
        assertTrue(Palindrome.hasPalindromePermutation("aba"));
        assertTrue(Palindrome.hasPalindromePermutation("baa"));
        assertTrue(Palindrome.hasPalindromePermutation("aab"));
        assertTrue(Palindrome.hasPalindromePermutation("civic"));
        assertTrue(Palindrome.hasPalindromePermutation("vicic"));
        assertTrue(Palindrome.hasPalindromePermutation("cciiv"));
        assertTrue(Palindrome.hasPalindromePermutation("socorrammesubinoonibusemmarrocos"));
    }

    @Test
    public void shouldNotConsiderPalindromePermutations() {
        assertFalse(Palindrome.hasPalindromePermutation("ab"));
        assertFalse(Palindrome.hasPalindromePermutation("civil"));
        assertFalse(Palindrome.hasPalindromePermutation("livci"));
    }

}
