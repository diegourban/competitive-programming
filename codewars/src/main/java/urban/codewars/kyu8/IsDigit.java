package urban.codewars.kyu8;

public class IsDigit {

    public static boolean isDigit(String s) {
        return s.length() == 1 && s.matches("\\d");
    }

}
