package urban.codewars.kyu7;

public class CompareSumChar {

    public static Boolean compare(final String firstString, final String secondString) {
        String string1 = firstString;
        String string2 = secondString;
        if (string1 == null || !containsOnlyLetters(string1)) string1 = "";
        if (string2 == null || !containsOnlyLetters(string2)) string2 = "";

        int s1Sum = sumChars(string1);
        int s2Sum = sumChars(string2);
        return s1Sum == s2Sum;
    }

    private static boolean containsOnlyLetters(String s) {
        return s.matches("[a-zA-Z]+");
    }

    private static int sumChars(String s) {
        int sum = 0;
        for (char ch : s.toUpperCase().toCharArray()) {
            sum += ch;
        }
        return sum;
    }

}
