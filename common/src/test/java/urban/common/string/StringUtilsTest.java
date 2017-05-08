package urban.common.string;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new StringUtils());
    }

    @Test
    public void shouldFindRotationPoint() {
        assertEquals(2, StringUtils.findRotationPoint(new String[]{"k", "v", "a", "b", "c", "d", "e", "g", "i"}));
        assertEquals(5, StringUtils.findRotationPoint(new String[]{"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist", "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage",}));
    }

    @Test
    public void shouldConsiderPalindrome() {
        assertTrue(StringUtils.isPalindrome("a"));
        assertTrue(StringUtils.isPalindrome("aa"));
        assertTrue(StringUtils.isPalindrome("aba"));
        assertTrue(StringUtils.isPalindrome("abba"));
        assertTrue(StringUtils.isPalindrome("civic"));
        assertTrue(StringUtils.isPalindrome("iaracarai"));
        assertTrue(StringUtils.isPalindrome("socorrammesubinoonibusemmarrocos"));
    }

    @Test
    public void shouldNotConsiderPalindrome() {
        assertFalse(StringUtils.isPalindrome(null));
        assertFalse(StringUtils.isPalindrome(""));
        assertFalse(StringUtils.isPalindrome("ab"));
        assertFalse(StringUtils.isPalindrome("abb"));
    }

    @Test
    public void shouldConsiderPalindromePermutations() {
        assertTrue(StringUtils.hasPalindromePermutation("a"));
        assertTrue(StringUtils.hasPalindromePermutation("aa"));
        assertTrue(StringUtils.hasPalindromePermutation("aba"));
        assertTrue(StringUtils.hasPalindromePermutation("baa"));
        assertTrue(StringUtils.hasPalindromePermutation("aab"));
        assertTrue(StringUtils.hasPalindromePermutation("civic"));
        assertTrue(StringUtils.hasPalindromePermutation("vicic"));
        assertTrue(StringUtils.hasPalindromePermutation("cciiv"));
        assertTrue(StringUtils.hasPalindromePermutation("socorrammesubinoonibusemmarrocos"));
    }

    @Test
    public void shouldNotConsiderPalindromePermutations() {
        assertFalse(StringUtils.hasPalindromePermutation("ab"));
        assertFalse(StringUtils.hasPalindromePermutation("civil"));
        assertFalse(StringUtils.hasPalindromePermutation("livci"));
    }


}
