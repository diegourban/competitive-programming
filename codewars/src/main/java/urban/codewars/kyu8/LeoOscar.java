package urban.codewars.kyu8;

public class LeoOscar {

    public static String leo(final int oscar) {
        if (oscar == 88) {
            return "Leo finally won the oscar! Leo is happy";
        }
        if (oscar == 86) {
            return "Not even for Wolf of wallstreet?!";
        }
        if (oscar == 87 || oscar < 86) {
            return "When will you give Leo an Oscar?";
        }
        return "Leo got one already!";
    }

}
