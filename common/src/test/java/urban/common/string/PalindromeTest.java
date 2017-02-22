package urban.common.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Palindrome());
    }

    @Test
    public void shouldConsiderPalindromes() {
        assertTrue(Palindrome.hasPalindromePermutation("a"));
        assertTrue(Palindrome.hasPalindromePermutation("aa"));
        assertTrue(Palindrome.hasPalindromePermutation("aba"));
        assertTrue(Palindrome.hasPalindromePermutation("baa"));
        assertTrue(Palindrome.hasPalindromePermutation("aab"));
        assertTrue(Palindrome.hasPalindromePermutation("civic"));
        assertTrue(Palindrome.hasPalindromePermutation("socorramesubinoonibusemmarrocos"));
    }

    @Test
    public void shouldNotConsiderPalindromes() {
        assertFalse(Palindrome.hasPalindromePermutation("ab"));
        assertFalse(Palindrome.hasPalindromePermutation("civil"));
        assertFalse(Palindrome.hasPalindromePermutation("livci"));
    }

}
