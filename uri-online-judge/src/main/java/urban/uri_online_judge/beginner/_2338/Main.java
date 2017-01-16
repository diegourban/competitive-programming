package urban.uri_online_judge.beginner._2338;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Morse
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2338
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final Map<String, Character> MORSE_CODE_TO_CHAR;

    static {
        MORSE_CODE_TO_CHAR = new HashMap<>(26);
        MORSE_CODE_TO_CHAR.put("=.===", 'a');
        MORSE_CODE_TO_CHAR.put("===.=.=.=", 'b');
        MORSE_CODE_TO_CHAR.put("===.=.===.=", 'c');
        MORSE_CODE_TO_CHAR.put("===.=.=", 'd');
        MORSE_CODE_TO_CHAR.put("=", 'e');
        MORSE_CODE_TO_CHAR.put("=.=.===.=", 'f');
        MORSE_CODE_TO_CHAR.put("===.===.=", 'g');
        MORSE_CODE_TO_CHAR.put("=.=.=.=", 'h');
        MORSE_CODE_TO_CHAR.put("=.=", 'i');
        MORSE_CODE_TO_CHAR.put("=.===.===.===", 'j');
        MORSE_CODE_TO_CHAR.put("===.=.===", 'k');
        MORSE_CODE_TO_CHAR.put("=.===.=.=", 'l');
        MORSE_CODE_TO_CHAR.put("===.===", 'm');
        MORSE_CODE_TO_CHAR.put("===.=", 'n');
        MORSE_CODE_TO_CHAR.put("===.===.===", 'o');
        MORSE_CODE_TO_CHAR.put("=.===.===.=", 'p');
        MORSE_CODE_TO_CHAR.put("===.===.=.===", 'q');
        MORSE_CODE_TO_CHAR.put("=.===.=", 'r');
        MORSE_CODE_TO_CHAR.put("=.=.=", 's');
        MORSE_CODE_TO_CHAR.put("===", 't');
        MORSE_CODE_TO_CHAR.put("=.=.===", 'u');
        MORSE_CODE_TO_CHAR.put("=.=.=.===", 'v');
        MORSE_CODE_TO_CHAR.put("=.===.===", 'w');
        MORSE_CODE_TO_CHAR.put("===.=.=.===", 'x');
        MORSE_CODE_TO_CHAR.put("===.=.===.===", 'y');
        MORSE_CODE_TO_CHAR.put("===.===.=.=", 'z');
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String sentence = reader.readLine();
            String[] words = separateWords(sentence);
            for (int w = 0; w < words.length; w++) {
                String[] letters = separateLetters(words[w]);
                for (String letter : letters) {
                    sb.append(MORSE_CODE_TO_CHAR.get(letter));
                }
                if(w < words.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

    private static String[] separateWords(String sentence) {
        return sentence.split("\\.\\.\\.\\.\\.\\.\\.");
    }

    private static String[] separateLetters(String word) {
        return word.split("\\.\\.\\.");
    }

}