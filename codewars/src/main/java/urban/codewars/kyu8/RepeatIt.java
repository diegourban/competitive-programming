package urban.codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {
        if (toRepeat instanceof String) {
            String s = String.valueOf(toRepeat);
            return Stream.generate(() -> s).limit(n).collect(Collectors.joining());
        }
        return "Not a string";
    }
}
