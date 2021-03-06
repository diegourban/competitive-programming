package urban.common.string;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

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

    @Test
    public void shouldValidateBrackets() {
        assertTrue(StringUtils.bracketValidator("{[]()}"));
        assertFalse(StringUtils.bracketValidator("{[(])}"));
        assertFalse(StringUtils.bracketValidator("{[}"));
    }

    @Test
    public void shouldReverseWords() {
        assertThat(StringUtils.reverseWords("the eagle has landed"), Matchers.equalTo("landed has eagle the"));
        assertThat(StringUtils.reverseWords("find you will pain only go you recordings security the into if"), Matchers.equalTo("if into the security recordings you go only pain will you find"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotFindClosingParenthesis() {
        StringUtils.getClosingParenthesis("a(bc", 2);
    }

    @Test
    public void shouldFindClosingParenthesis() {
        assertThat(StringUtils.getClosingParenthesis("()", 0), Matchers.equalTo(1));
        assertThat(StringUtils.getClosingParenthesis("(())", 0), Matchers.equalTo(3));
        assertThat(StringUtils.getClosingParenthesis("a(b(c)d)e", 1), Matchers.equalTo(7));
    }

    @Test
    public void shouldFindPermutations() {
        assertThat(StringUtils.getPermutations("ABC"), Matchers.hasItems("ABC", "CAB", "BAC", "ACB", "BCA", "CBA"));
    }

}
