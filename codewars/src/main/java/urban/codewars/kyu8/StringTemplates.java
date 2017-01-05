package urban.codewars.kyu8;

import java.util.StringJoiner;

public class StringTemplates {

    public static String buildString(String... args) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String s : args) {
            joiner.add(s);
        }
        return "I like " + joiner.toString() + "!";
    }
}
