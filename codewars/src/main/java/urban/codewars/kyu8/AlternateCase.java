package urban.codewars.kyu8;

public class AlternateCase {

    public static String toAlternativeString(String string) {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }

}
