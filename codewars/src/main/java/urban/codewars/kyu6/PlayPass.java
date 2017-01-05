package urban.codewars.kyu6;

public class PlayPass {

    public static String playPass(String theString, int n) {
        String result = shiftLetters(theString, n);
        result = replaceDigits(result);
        result = downCaseInOdds(result);
        result = reverse(result);
        return result;
    }

    private static String shiftLetters(String theString, int numberOfTimes) {
        char[] toEncode = theString.toCharArray();
        for (int i = 0; i < toEncode.length; i++) {
            if (Character.isLetter(toEncode[i])) {
                if (toEncode[i] >= 65 && toEncode[i] <= 91) {
                    toEncode[i] = (char) ((((toEncode[i] - 65) + numberOfTimes) % 26) + 65);
                }
                if (toEncode[i] >= 97 && toEncode[i] <= 123) {
                    toEncode[i] = (char) ((((toEncode[i] - 97) + numberOfTimes) % 26) + 97);
                }
            }
        }
        return String.valueOf(toEncode);
    }

    private static String replaceDigits(String theString) {
        char[] toReplace = theString.toCharArray();
        for (int i = 0; i < toReplace.length; i++) {
            if (Character.isDigit(toReplace[i])) {
                toReplace[i] = Character.forDigit(Math.abs((Character.digit(toReplace[i], 10) - 9)), 10);
            }
        }
        return String.valueOf(toReplace);
    }

    private static String downCaseInOdds(String theString) {
        char[] toReplace = theString.toCharArray();
        for (int i = 0; i < toReplace.length; i++) {
            if (Character.isLetter(toReplace[i]) && i % 2 == 1) {
                toReplace[i] = Character.toLowerCase(toReplace[i]);
            }
        }
        return String.valueOf(toReplace);
    }

    private static String reverse(String theString) {
        return new StringBuilder(theString).reverse().toString();
    }

}
